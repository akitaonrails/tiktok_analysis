package X;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.14SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14SQ {
    public static final int[] LIZ = {R.attr.state_checked};
    public static final int[] LIZIZ = new int[0];
    public static final Rect LIZJ = new Rect();

    public static void LIZ(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(LIZIZ);
            } else {
                drawable.setState(LIZ);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect LIZIZ(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets insetsLIZ = C14SR.LIZ(drawable);
            return new Rect(insetsLIZ.left, insetsLIZ.top, insetsLIZ.right, insetsLIZ.bottom);
        }
        boolean z = drawable instanceof C14SS;
        Object objLIZIZ = drawable;
        if (z) {
            objLIZIZ = ((C14SS) drawable).LIZIZ();
        }
        if (C14SP.LIZ) {
            try {
                Object objInvoke = C14SP.LIZIZ.invoke(objLIZIZ, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(C14SP.LIZJ.getInt(objInvoke), C14SP.LIZLLL.getInt(objInvoke), C14SP.LJ.getInt(objInvoke), C14SP.LJFF.getInt(objInvoke));
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return LIZJ;
    }

    public static PorterDuff.Mode LIZJ(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
