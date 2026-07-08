package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootAppLogReportConfig;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1464, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1464 {
    public static volatile AnonymousClass1464 LJFF;
    public static final IPerformanceExperimentApi LJI = (IPerformanceExperimentApi) PluggableExtentionKt.pluggableSpi(IPerformanceExperimentApi.class);
    public final ExecutorService LIZ;
    public final boolean LIZLLL;
    public final Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public final Map<String, C202100145y> LIZJ = new ConcurrentHashMap();
    public boolean LJ = false;

    public static AnonymousClass1464 LIZ() {
        if (LJFF == null) {
            synchronized (AnonymousClass1464.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new AnonymousClass1464();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public AnonymousClass1464() {
        Keva repo;
        try {
            repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        boolean z = repo.getBoolean("cold_boot_main_block_opt_bootlogger_4550", false) ? repo.getBoolean("report_bootfinish_task", false) : C310280CEg.LIZ;
        this.LIZLLL = z;
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZJ = 1;
        c2123408ToLIZ.LIZIZ = "ColdBootBootFinishLogger";
        this.LIZ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static void LIZIZ(JSONObject jSONObject, ColdBootAppLogReportConfig coldBootAppLogReportConfig, String str, double d, double d2) {
        if (coldBootAppLogReportConfig != null && coldBootAppLogReportConfig.enable) {
            Iterator<String> it2 = coldBootAppLogReportConfig.bootFinishTaskList.iterator();
            while (it2.hasNext()) {
                if (Objects.equals(it2.next(), str)) {
                    try {
                        String strReplace = new Regex("[^a-zA-Z0-9_]").replace(str, "");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strReplace);
                        sbLIZ.append("_cost");
                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), d);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strReplace);
                        sbLIZ2.append("_start_time");
                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), d2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
    }
}
