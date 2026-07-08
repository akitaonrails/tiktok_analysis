package X;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347570lAh {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ() {
        return C276050Arr.LIZ() == 1 || C276050Arr.LIZ() == 2 || C276050Arr.LIZ() == 3;
    }

    public static final void LIZ(View view) {
        if (LIZIZ() && view != null) {
            final float dimension = view.getResources().getDimension(R.dimen.jq);
            Drawable background = view.getBackground();
            if (background instanceof ColorDrawable) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
                gradientDrawable.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f});
                view.setBackground(gradientDrawable);
                return;
            }
            view.setClipToOutline(true);
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0lAj
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    int width = view2.getWidth();
                    float height = view2.getHeight();
                    float f = dimension;
                    outline.setRoundRect(0, 0, width, (int) (height + f), f);
                }
            });
        }
    }
}
