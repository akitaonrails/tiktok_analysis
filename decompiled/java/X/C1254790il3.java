package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: X.0il3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254790il3 {
    public static C1254790il3 LIZLLL;
    public final DateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public final int LIZIZ = 11;
    public final Keva LIZJ = Keva.getRepo("ug_coupon_repo");

    public static C1254790il3 LIZ() {
        if (LIZLLL == null) {
            synchronized (C1254790il3.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1254790il3();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ(boolean z) {
        if (!z && this.LIZJ.getBoolean("show_bar", false)) {
            return;
        }
        this.LIZJ.storeBoolean("show_bar", z);
    }
}
