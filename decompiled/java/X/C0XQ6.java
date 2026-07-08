package X;

import android.content.Context;
import android.webkit.CookieManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQ6 {
    public static final C0XQ6 LIZ = new C0XQ6();

    public static final void LIZ(Context context) {
        if (context == null || C0XQ5.LJFF()) {
            return;
        }
        try {
            CookieManager cookieManagerA2 = C786410Ut5.A2();
            if (cookieManagerA2 != null) {
                cookieManagerA2.removeAllCookie();
                cookieManagerA2.flush();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
