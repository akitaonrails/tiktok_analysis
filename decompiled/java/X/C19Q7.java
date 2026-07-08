package X;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* JADX INFO: renamed from: X.19Q7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19Q7 {
    public static final int[] LIZ = {R.attr.state_pressed};
    public static final int[] LIZIZ = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] LIZJ = {R.attr.state_selected};
    public static final int[] LIZLLL = {R.attr.state_enabled, R.attr.state_pressed};

    public static ColorStateList LIZ(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{LIZJ, StateSet.NOTHING}, new int[]{LIZIZ(colorStateList, LIZIZ), LIZIZ(colorStateList, LIZ)});
    }

    public static ColorStateList LIZJ(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(LIZLLL, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean LIZLLL(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(ColorStateList colorStateList, int[] iArr) {
        int colorForState;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            colorForState = 0;
        }
        return C2441009hQ.LJIIL(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}
