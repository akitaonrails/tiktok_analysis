package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: renamed from: X.0o8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461700o8m {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context) {
        int statusBarHeight = ScreenUtils.getStatusBarHeight(context);
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(context);
        return statusBarHeight + C366700EZg.LIZ(14.0d) + ((((((fullScreenHeight - statusBarHeight) - C366700EZg.LIZ(14.0d)) - ScreenUtils.getScreenWidth(context)) - c0.LIZ.p2()) - C366700EZg.LIZ(120.0d)) / 2);
    }

    public static void LIZIZ(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new C1447460nlo(0.08f, null, 1));
        int screenWidth = ScreenUtils.getScreenWidth(view.getContext());
        c0.LIZ.t2(screenWidth, screenWidth);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = screenWidth;
        marginLayoutParams.height = screenWidth;
        C426750GoL.LJIIJ(marginLayoutParams, view.getContext(), 0, Integer.valueOf(LIZ(view.getContext())), 0, 0, 32);
        C786410Ut5.W5(view, marginLayoutParams);
    }
}
