package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.login.LoginManager;

/* JADX INFO: renamed from: X.1BJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202781BJc {
    public final LoginManager LIZ() {
        if (LoginManager.LJIIJJI == null) {
            synchronized (this) {
                try {
                    LoginManager.LJIIJJI = new LoginManager();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LoginManager loginManager = LoginManager.LJIIJJI;
        loginManager.getClass();
        return loginManager;
    }
}
