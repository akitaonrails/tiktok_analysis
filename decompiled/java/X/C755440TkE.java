package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755440TkE {
    public static final void LIZ(BaseActivity baseActivity) {
        int color;
        Integer numLIZJ;
        if (C960203pA.LIZIZ(baseActivity) && baseActivity.isDarkModeSupported()) {
            Drawable background = baseActivity.getWindow().getDecorView().getBackground();
            if (background instanceof ColorDrawable) {
                color = ((ColorDrawable) background).getColor();
            } else {
                color = 0;
            }
            baseActivity.setTheme(R.style.y0);
            if (color == -1 && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, baseActivity)) != null) {
                baseActivity.getWindow().getDecorView().setBackgroundColor(numLIZJ.intValue());
            }
        }
    }
}
