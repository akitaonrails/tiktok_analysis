package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424030Gjx {
    public static final Drawable LIZ(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exe, context));
        gradientDrawable.setStroke((int) C497740JfY.LIZIZ(1.0f), C20736316Cj.LIZIZ(R.attr.ey_, context));
        gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(6.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(C20736316Cj.LIZIZ(R.attr.exe, context));
        gradientDrawable2.setStroke((int) C497740JfY.LIZIZ(1.0f), C20736316Cj.LIZIZ(R.attr.ezq, context));
        gradientDrawable2.setCornerRadius((int) C497740JfY.LIZIZ(6.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
