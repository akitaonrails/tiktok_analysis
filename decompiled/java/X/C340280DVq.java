package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340280DVq extends AbstractC1391830mK5 {
    public final View LJ;
    public int LJFF;
    public int LJI;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        View view = this.LJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.LJFF, this.LJI);
        layoutParams.gravity = 17;
        C786410Ut5.W5(view, layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        } else {
            frameLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        C786410Ut5.a6(frameLayout, layoutParams2);
        frameLayout.setBackground(new ColorDrawable(this.LIZLLL));
        frameLayout.addView(this.LJ);
        return frameLayout;
    }

    public C340280DVq(Context context, View view) {
        super(context, 0);
        this.LJ = view;
        this.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    }
}
