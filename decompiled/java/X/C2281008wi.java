package X;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2281008wi {
    public static final C2281008wi LIZ = new C2281008wi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2280908wh());

    public static void LIZ(final long j, final long j2, final String str) {
        if (((Boolean) C1867150ygj.LIZIZ.getValue()).booleanValue()) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi != null) {
                iSparkHostApi.LLD(new C2280808wg(str, j, j2));
                return;
            }
            return;
        }
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Blocked, true, new Runnable() { // from class: X.08wb
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HybridSdkInitLogger@ac52.reportLog$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HybridSdkInitLogger@ac52.reportLog$2");
            }

            public final void LIZ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hybrid_sdk_init_log stage: ");
                sbLIZ.append(str);
                sbLIZ.append(", duration: ");
                sbLIZ.append(j);
                sbLIZ.append(", offset: ");
                sbLIZ.append(j2);
                C1530030puz.LIZIZ("HybridSdkInitLogger", C2188811AlT.LIZIZ(sbLIZ), null);
                AppLogNewUtils.LJI("hybrid_sdk_init_log", C2097608Jq.LJIIIIZZ(new Pair("stage", str), new Pair("duration", String.valueOf(j)), new Pair("offset", String.valueOf(j2))));
            }
        });
    }
}
