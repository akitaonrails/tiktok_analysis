package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: X.18hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21356818hy {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF = true;
    public final int LJI;

    public final void LIZ(boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        if (this.LJFF) {
            this.LIZLLL = this.LIZJ.getMeasuredWidth();
            this.LIZIZ.measure(0, 0);
            this.LJ = this.LIZIZ.getMeasuredWidth();
            this.LJFF = false;
        }
        if (z) {
            i = this.LIZLLL - (this.LJ + this.LJI);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        C21463018z6 c21463018z6 = new C21463018z6();
        C21459418yW c21459418yW = new C21459418yW();
        c21459418yW.LLILZLL.add(this.LIZJ);
        c21459418yW.LLILZLL.add(this.LIZIZ);
        c21463018z6.LJJJ(c21459418yW);
        c21463018z6.LJJIJ(new AccelerateInterpolator());
        c21463018z6.LJJIIZ(300L);
        C19748612Om.LIZ((ViewGroup) this.LIZ, c21463018z6);
        C786410Ut5.W5(this.LIZJ, layoutParams);
    }

    public C21356818hy(Context context, View view, View view2, View view3) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        this.LJI = (int) C11VU.LIZIZ(16.0f, context);
    }
}
