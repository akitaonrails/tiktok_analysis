package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20246814Kc {
    public static final /* synthetic */ int LIZ = 0;

    public static C2197171Ayx LIZ(Context context) throws Throwable {
        int i;
        int i2;
        int iLIZLLL;
        int iCeil = (int) Math.ceil(((double) C14KZ.LIZJ(context)) / ((double) C14KZ.LIZIZ(context)));
        DisplayMetrics displayMetricsLIZ = C14KZ.LIZ(context);
        if (displayMetricsLIZ != null) {
            i = displayMetricsLIZ.heightPixels;
        } else {
            i = 0;
        }
        int iLIZJ = (i * iCeil) / C14KZ.LIZJ(context);
        Math.ceil(((double) C14KZ.LIZJ(context)) / ((double) C14KZ.LIZIZ(context)));
        context.getResources().getConfiguration();
        C1396030mQr.LIZ.getClass();
        TypedValue.applyDimension(2, 12.0f, context.getResources().getDisplayMetrics());
        int iLIZLLL2 = C1396030mQr.LIZLLL(C14KZ.LIZLLL(context), context);
        try {
            iLIZLLL = C1396030mQr.LIZLLL(C14KZ.LIZLLL(context), context);
            i2 = iLIZJ - iLIZLLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZJ("MinisDisplayUtils", e);
            i2 = iLIZJ;
            iLIZLLL = 0;
        }
        C2197181Ayy c2197181Ayy = new C2197181Ayy(iCeil, iLIZLLL, iLIZJ, iCeil, i2);
        C14KZ.LIZIZ(context);
        return new C2197171Ayx(iCeil, iLIZJ, iLIZLLL2, c2197181Ayy);
    }
}
