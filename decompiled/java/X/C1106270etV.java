package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0etV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106270etV {
    public static void LIZ(View view, Integer num, Integer num2) {
        int width;
        int height;
        if (num != null) {
            width = num.intValue();
        } else {
            width = view.getWidth();
        }
        if (num2 != null) {
            height = num2.intValue();
        } else {
            height = view.getHeight();
        }
        Drawable drawableLIZIZ = C1106260etU.LIZIZ(view.getContext());
        if (drawableLIZIZ == null) {
            view.setBackground(null);
            return;
        }
        if (width > 0 && height > 0 && width > height) {
            int iLIZ = C235100vV.LIZ(R.attr.exb, view.getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(height / 2.0f);
            gradientDrawable.setColor(iLIZ);
            view.setBackground(gradientDrawable);
            return;
        }
        view.setBackground(drawableLIZIZ);
    }
}
