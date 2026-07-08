package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14MF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14MF {
    public static final ThreadLocal<TypedValue> LIZ = new ThreadLocal<>();
    public static final int[] LIZIZ = {-16842910};
    public static final int[] LIZJ = {R.attr.state_focused};
    public static final int[] LIZLLL = {R.attr.state_pressed};
    public static final int[] LJ = {R.attr.state_checked};
    public static final int[] LJFF = new int[0];
    public static final int[] LJI = new int[1];

    public static int LIZ(int i, Context context) {
        ColorStateList colorStateListLIZJ = LIZJ(i, context);
        if (colorStateListLIZJ != null && colorStateListLIZJ.isStateful()) {
            return colorStateListLIZJ.getColorForState(LIZIZ, colorStateListLIZJ.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = LIZ;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return C2441009hQ.LJIIL(LIZIZ(i, context), Math.round(Color.alpha(r1) * f));
    }

    public static int LIZIZ(int i, Context context) {
        int[] iArr = LJI;
        iArr[0] = i;
        C21411918qr c21411918qrLJIIL = C21411918qr.LJIIL(context, null, iArr);
        try {
            int color = c21411918qrLJIIL.LIZIZ.getColor(0, 0);
            c21411918qrLJIIL.LJIILJJIL();
            return color;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c21411918qrLJIIL.LJIILJJIL();
            throw th;
        }
    }

    public static ColorStateList LIZJ(int i, Context context) {
        int[] iArr = LJI;
        iArr[0] = i;
        C21411918qr c21411918qrLJIIL = C21411918qr.LJIIL(context, null, iArr);
        try {
            ColorStateList colorStateListLIZIZ = c21411918qrLJIIL.LIZIZ(0);
            c21411918qrLJIIL.LJIILJJIL();
            return colorStateListLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c21411918qrLJIIL.LJIILJJIL();
            throw th;
        }
    }
}
