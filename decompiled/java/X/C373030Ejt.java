package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ejt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373030Ejt implements InterfaceC372910Ejh {
    public static final C373030Ejt LIZ = new C373030Ejt();
    public static boolean LIZIZ;

    public static float LIZIZ(Context context) {
        int measuredHeight;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        float fLIZIZ = C0JAI.LIZIZ(context) * 0.5f;
        if (!C363750ENx.LIZIZ("sheet_music_flex_panel_height")) {
            return fLIZIZ;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && (viewFindViewById = activityLIZ.findViewById(R.id.gcu)) != null && (viewFindViewById2 = activityLIZ.findViewById(R.id.ygy)) != null && (viewFindViewById3 = activityLIZ.findViewById(R.id.gcv)) != null) {
            measuredHeight = viewFindViewById3.getMeasuredHeight() + viewFindViewById.getMeasuredHeight() + viewFindViewById2.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        float f = measuredHeight;
        if (f <= fLIZIZ) {
            return fLIZIZ;
        }
        return f;
    }

    public static void LIZJ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
            layoutParams.height = (int) LIZIZ(view.getContext());
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // X.InterfaceC372910Ejh
    public final void LIZ(int i, int i2) {
        boolean z = true;
        if (i2 != i - 1) {
            z = false;
        }
        if (z != LIZIZ) {
            LIZIZ = z;
            C0E12 c0e12 = C363750ENx.LIZ;
            C363750ENx.LIZ.LIZIZ("sheet_music_flex_panel_height", LIZIZ);
        }
    }
}
