package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.DecelerateInterpolator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808050x9P {
    public static final DecelerateInterpolator LIZ = new DecelerateInterpolator();

    public static void LIZ(C1808020x9M c1808020x9M, float f) {
        int i;
        Context context = c1808020x9M.itemView.getContext();
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.exu, context);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ey7, context);
        int iArgb = Color.argb((int) (255 * f), (iLIZIZ2 >> 16) & 255, (iLIZIZ2 >> 8) & 255, iLIZIZ2 & 255);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iLIZIZ);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(24.0f)));
        int iLIZIZ3 = (int) (C418440Gaw.LIZIZ(Float.valueOf(2.0f)) * f);
        if (f > 0.01f) {
            i = 1;
        } else {
            i = 0;
        }
        if (iLIZIZ3 < i) {
            iLIZIZ3 = i;
        }
        gradientDrawable.setStroke(iLIZIZ3, iArgb);
        c1808020x9M.LL.setBackground(gradientDrawable);
    }
}
