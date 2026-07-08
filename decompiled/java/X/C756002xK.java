package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.02xK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C756002xK {
    public static final List<String> LIZ() {
        List<String> listLJJLL = null;
        try {
            String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("creative_tools_effect_platform_caching_disabled_panels", String[].class, null);
            if (strArr == null) {
                return null;
            }
            listLJJLL = C13LQ.LJJLL(strArr);
            return listLJJLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return listLJJLL;
        }
    }
}
