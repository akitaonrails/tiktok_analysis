package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0O3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O3Q {
    public static final /* synthetic */ int LIZ = 0;

    public static C0XIR LIZIZ(Throwable th) {
        Throwable e;
        C614080O6s c614080O6s;
        if (th instanceof C0XIR) {
            return (C0XIR) th;
        }
        if (th.getCause() instanceof C0XIR) {
            return (C0XIR) th.getCause();
        }
        if ((th instanceof C614080O6s) && (c614080O6s = (C614080O6s) th) != null) {
            e = c614080O6s.getE();
        } else {
            e = null;
        }
        if (!(e instanceof C0XIR)) {
            return null;
        }
        return (C0XIR) ((C614080O6s) th).getE();
    }

    public static String LIZJ(C614090O6t c614090O6t) {
        String message;
        C614080O6s c614080O6s;
        if (!(c614090O6t instanceof C0XIR) && !(c614090O6t.getCause() instanceof C0XIR)) {
            Throwable e = null;
            if ((c614090O6t instanceof C614080O6s) && (c614080O6s = (C614080O6s) c614090O6t) != null) {
                e = c614080O6s.getE();
            }
            if (!(e instanceof C0XIR)) {
                Throwable cause = c614090O6t.getCause();
                if (cause == null || (message = cause.getMessage()) == null) {
                    String message2 = c614090O6t.getMessage();
                    if (message2 == null) {
                        return "Unknown error";
                    }
                    return message2;
                }
                return message;
            }
            return "ApiServerException";
        }
        return "ApiServerException";
    }

    public static final void LIZ(Activity activity, Throwable th) {
        String errorMsg;
        if (activity == null) {
            return;
        }
        C0XIR c0xirLIZIZ = LIZIZ(th);
        if (c0xirLIZIZ != null && (errorMsg = c0xirLIZIZ.getErrorMsg()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(errorMsg);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJIIIZ(R.string.jpj);
            c1389890mGx2.LJIIJJI();
        }
    }
}
