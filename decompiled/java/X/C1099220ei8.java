package X;

import Y.ACListenerS152S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;

/* JADX INFO: renamed from: X.0ei8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099220ei8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ LiveRoomUserInfoWidget LLILLL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i;
        int i2;
        C1096340edU c1096340edU = this.LLILLL.LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LIZJ();
            C1096340edU c1096340edU2 = this.LLILLL.LLLZ;
            ViewGroup.LayoutParams layoutParams = c1096340edU2.LJ.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                ViewGroup viewGroup = (ViewGroup) c1096340edU2.LJ.getParent();
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                layoutParams2.width = viewGroup.getWidth();
                C786410Ut5.X5(layoutParams2, viewGroup);
                layoutParams.width = -1;
                layoutParams.height = -1;
                C19ME c19me = (C19ME) layoutParams;
                c19me.startToEnd = -1;
                c19me.startToStart = 0;
                c19me.endToEnd = 0;
                c19me.setMarginStart(0);
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                c19me.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                C786410Ut5.X5(layoutParams, c1096340edU2.LJ);
            }
        }
        ViewGroup viewGroup2 = this.LLILLL.LLLIIII;
        if (C497740JfY.LJJ()) {
            i = this.LL;
        } else {
            i = this.LLILLJJLI;
        }
        if (C497740JfY.LJJ()) {
            i2 = this.LLILLJJLI;
        } else {
            i2 = this.LL;
        }
        viewGroup2.setPadding(i, 0, i2, 0);
        C786410Ut5.H8(this.LLILLL.LLILZLL, new ACListenerS152S0100000_17(this, 110));
        C786410Ut5.K7(this.LLILLL.LLLIIII, new ACListenerS152S0100000_17(this, 111));
        new C21459418yW().LJIILJJIL(this.LLILLL.LLLIIL);
        C19748612Om.LIZ(this.LLILLL.LLLIIII, new C21459418yW());
    }

    public C1099220ei8(LiveRoomUserInfoWidget liveRoomUserInfoWidget, int i, int i2) {
        this.LLILLL = liveRoomUserInfoWidget;
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
