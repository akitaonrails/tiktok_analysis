package X;

import android.net.Uri;
import android.util.Log;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0863, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0863 {
    public static final AnonymousClass0863 LIZ = new AnonymousClass0863();

    public static void LIZ(Uri.Builder builder, long j) {
        SettingsManager.LIZLLL().getClass();
        int i = 0;
        if (SettingsManager.LIZ("ec_perf_append_deeplink_param", false)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("app_launch_start", String.valueOf(C1150504el.LIZ().LJJII));
                linkedHashMap.put("deeplink_start", String.valueOf(j));
                linkedHashMap.put("jump_type", "deeplink");
                if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
                    i = 1;
                }
                linkedHashMap.put("is_cold_start", String.valueOf(i));
                builder.appendQueryParameter("ec_perf_deeplink_params", C1741890vQh.LJIIIIZZ(linkedHashMap));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("### appendDeeplinkParamToUrl: ");
                sbLIZ.append(builder.build());
                C189200o6.m2constructorimpl(Integer.valueOf(Log.d("DeeplinkParamHelper", C2188811AlT.LIZIZ(sbLIZ))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
