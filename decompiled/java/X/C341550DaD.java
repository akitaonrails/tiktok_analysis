package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341550DaD {
    public static final void LIZ(View view) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int[] iArr = new int[3];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -6357048;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, view.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16715320;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, view.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = -16716310;
        }
        iArr[2] = iIntValue3;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(4.0f)));
        view.setBackground(gradientDrawable);
    }
}
