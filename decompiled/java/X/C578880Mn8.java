package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: renamed from: X.0Mn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578880Mn8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1447470nlp.LIZ(view, 0.08f);
        FrameLayout.LayoutParams layoutParamsT2 = c0.LIZ.t2(9, 16);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int iMin = Math.min(ScreenUtils.getScreenWidth(view.getContext()), layoutParamsT2.width);
            marginLayoutParams.width = iMin;
            marginLayoutParams.height = (int) (iMin / 0.75f);
            marginLayoutParams.leftMargin = layoutParamsT2.leftMargin;
            C786410Ut5.W5(view, marginLayoutParams);
        }
        LIZIZ(view.getContext(), view);
    }

    public static void LIZIZ(Context context, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        C426750GoL.LJIIJ(marginLayoutParams, view.getContext(), Integer.valueOf(marginLayoutParams.leftMargin), Integer.valueOf(C578100Mls.LIZJ(context)), 0, 0, 32);
        C786410Ut5.W5(view, marginLayoutParams);
    }
}
