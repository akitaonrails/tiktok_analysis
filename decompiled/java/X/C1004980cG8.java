package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: renamed from: X.0cG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004980cG8 {
    public static final void LIZ(C1004960cG6 c1004960cG6, int i) {
        GradientDrawable gradientDrawable;
        View view = c1004960cG6.LLJLIL;
        if (view != null) {
            Drawable background = view.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(i);
            }
            view.setBackground(view.getBackground());
        }
    }
}
