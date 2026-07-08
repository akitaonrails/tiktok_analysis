package X;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Gco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419600Gco extends FrameLayout {
    public final C21279718Pj LL;

    public C419600Gco(Context context) {
        int i;
        super(context, null, 0);
        C21279718Pj c21279718Pj = new C21279718Pj(context, null, 6);
        this.LL = c21279718Pj;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (C444960Hcc.LIZIZ()) {
            i = 8388613;
        } else {
            i = 8388611;
        }
        layoutParams.gravity = i;
        addView(c21279718Pj, layoutParams);
        C426750GoL.LJIIIZ(c21279718Pj, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 16);
    }
}
