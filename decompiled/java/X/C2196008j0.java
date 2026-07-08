package X;

import Y.ARunnableS72S0200000_3;
import android.content.Context;

/* JADX INFO: renamed from: X.08j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2196008j0 {
    public static C099G LIZ(String str) {
        return C23250099c.LIZIZ(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)), null, null, new C2195808iy(str, null), 3);
    }

    public static void LIZIZ(Context context, Throwable th) {
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 2131858134;
        if (th instanceof C0XIR) {
            switch (((C23112093u) th).getErrorCode()) {
                case 3020003:
                    c118300cf.element = 2131858132;
                    break;
                case 3020005:
                    c118300cf.element = 2131858133;
                    break;
                case 3020006:
                    c118300cf.element = 2131849227;
                    break;
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            c19egLIZIZ.runOnUiThread(new ARunnableS72S0200000_3(c19egLIZIZ, c118300cf, 10));
        }
    }
}
