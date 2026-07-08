package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340170DVf extends AbstractC1391830mK5 {
    public final View LJ;
    public int LJFF;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(0, 0, 0, this.LJFF);
        C786410Ut5.a6(frameLayout, layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.LIZLLL));
        View view = this.LJ;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        C786410Ut5.W5(view, layoutParams2);
        frameLayout.addView(view);
        return frameLayout;
    }

    public C340170DVf(int i, Context context, View view) {
        int iLIZIZ;
        super(context, i);
        this.LJ = view;
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        this.LJFF = iLIZIZ;
    }
}
