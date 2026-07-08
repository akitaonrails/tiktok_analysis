package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0L7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537820L7k {
    public static boolean LIZ(int i, int i2) {
        if (i2 * 9 < i * 16 && Math.abs((((double) i2) / ((double) i)) - 1.7777777910232544d) >= 0.1d) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(View view, int i, int i2) {
        Context context;
        float f;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        int screenWidth = ScreenUtils.getScreenWidth(context);
        int screenHeight = ScreenUtils.getScreenHeight(context) + ScreenUtils.getStatusBarHeight(context);
        float f2 = (i * 1.0f) / i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        float f3 = screenWidth;
        float f4 = f3 * 1.0f;
        if (f4 / screenHeight < f2) {
            screenHeight -= C366700EZg.LIZ(57.0f);
        }
        float f5 = screenHeight;
        if (f4 / f5 < f2) {
            int i3 = (int) (f3 / f2);
            f = (f5 * 1.0f) / i3;
            marginLayoutParams.topMargin = (screenHeight - i3) / 2;
            marginLayoutParams.bottomMargin = (screenHeight - i3) / 2;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
            screenHeight = i3;
        } else {
            int i4 = (int) (f5 * f2);
            f = f4 / i4;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            int i5 = (screenWidth - i4) / 2;
            marginLayoutParams.leftMargin = i5;
            marginLayoutParams.rightMargin = i5;
            screenWidth = i4;
        }
        marginLayoutParams.width = screenWidth;
        marginLayoutParams.height = screenHeight;
        C786410Ut5.W5(view, marginLayoutParams);
        C786410Ut5.Ob(view, f);
        C786410Ut5.pc(view, f);
    }
}
