package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C8B, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8B extends C09AY implements Function0<Map<String, ? extends AppLogDualReportSettings.EventConfig>> {
    public C0C8B() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends AppLogDualReportSettings.EventConfig> invoke() {
        try {
            Gson gson = C7740030o.LIZ().getGson();
            Map<String, ? extends AppLogDualReportSettings.EventConfig> map = (Map) gson.LIZLLL(gson.LJIJJLI((Map) SettingsManager.LIZLLL().LJIIIIZZ("app_log_dual_report_settings", Map.class, null)), new TypeToken<HashMap<String, AppLogDualReportSettings.EventConfig>>() { // from class: X.0C8C
            }.getType());
            return map == null ? C2097608Jq.LJ() : map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2097608Jq.LJ();
        }
    }
}
