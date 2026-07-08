package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0L2O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2O {
    public static final /* synthetic */ int LIZ = 0;

    public static final FrameLayout.LayoutParams LIZ(Context context, int i, float f, float f2, float f3, float f4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        float screenHeight = (ScreenUtils.getScreenHeight(context) - i) - ScreenUtils.getStatusBarHeight(context);
        float fMin = Math.min(f, f3 * screenHeight);
        layoutParams.height = (int) fMin;
        layoutParams.width = (int) (f2 * fMin);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) ((screenHeight - fMin) * f4);
        return layoutParams;
    }
}
