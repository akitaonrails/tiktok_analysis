package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.Js2XssConfig;

/* JADX INFO: renamed from: X.1BR1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BR1 implements C1BRH {
    @Override // X.C1BRH
    public final boolean LIZ(C1BR4 c1br4) {
        Js2XssConfig js2XssConfig;
        int i = C1BR3.LIZ[c1br4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return ((Boolean) C1854907Oh.LIZJ.getValue()).booleanValue();
            }
            return ((Boolean) C1854907Oh.LIZIZ.getValue()).booleanValue();
        }
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            js2XssConfig = C1BRM.LIZ;
            Js2XssConfig js2XssConfig2 = (Js2XssConfig) settingsManagerLIZLLL.LJIIIIZZ("js2_xss_config", Js2XssConfig.class, js2XssConfig);
            if (js2XssConfig2 != null) {
                js2XssConfig = js2XssConfig2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            js2XssConfig = C1BRM.LIZ;
        }
        return js2XssConfig.xssCallBackEnable;
    }
}
