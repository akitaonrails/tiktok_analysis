package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341630DaL {
    public final View LIZ;

    public C341630DaL(View view) {
        this.LIZ = view;
    }

    public static Integer LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZIZ(int i, int i2, int i3, boolean z) {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        if (!z) {
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        int iLIZJ = (int) C12ES.LIZJ(i3 * 1.0f, context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = iLIZJ;
        C786410Ut5.W5(view, layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{i, i2});
        view.setBackground(gradientDrawable);
        C786410Ut5.LJLLLLLL(0, view);
    }
}
