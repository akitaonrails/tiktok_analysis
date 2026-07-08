package X;

import android.content.Context;
import android.widget.FrameLayout;
import nv7.c0;

/* JADX INFO: renamed from: X.0tGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658600tGM {
    public static final FrameLayout.LayoutParams LIZ(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (c1660590tJZ != null) {
            FrameLayout.LayoutParams layoutParamsLJ = c1660590tJZ.LJ(context);
            layoutParams.setMargins(layoutParamsLJ.leftMargin, layoutParamsLJ.topMargin, layoutParamsLJ.rightMargin, layoutParamsLJ.bottomMargin);
        }
        return layoutParams;
    }
}
