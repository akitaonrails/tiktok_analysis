package X;

import Y.ACListenerS164S0100000_30;
import Y.ARunnableS130S0100000_30;
import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.14Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20243014Iq extends LinearLayout {
    public final C1295960jpS LL;
    public final C1295960jpS LLILLJJLI;
    public final C197039127h LLILLL;
    public final C20243414Iu LLILZ;
    public final C1163304gp LLILZIL;
    public final C14IJ LLILZLL;
    public final View LLIZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LL.isAnimating()) {
            this.LL.cancelAnimation();
        }
        if (this.LLILLJJLI.isAnimating()) {
            this.LLILLJJLI.cancelAnimation();
        }
    }

    public final void setClickConfig(Function1<? super C20243414Iu, Unit> function1) {
        function1.invoke(this.LLILZ);
    }

    public final void setShowConfig(Function1<? super C1163304gp, Unit> function1) {
        function1.invoke(this.LLILZIL);
    }

    public C20243014Iq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C20243414Iu c20243414Iu = new C20243414Iu(0);
        this.LLILZ = c20243414Iu;
        this.LLILZIL = new C1163304gp(null);
        C14IJ c14ij = new C14IJ(0);
        this.LLILZLL = c14ij;
        View viewSd = C786410Ut5.Sd(R.layout.foy, C786410Ut5.ne(context), this);
        this.LLIZ = viewSd;
        setOrientation(1);
        C1295960jpS c1295960jpS = (C1295960jpS) viewSd.findViewById(R.id.npv);
        this.LL = c1295960jpS;
        final C1295960jpS c1295960jpS2 = (C1295960jpS) viewSd.findViewById(R.id.xl6);
        this.LLILLJJLI = c1295960jpS2;
        this.LLILLL = (C197039127h) viewSd.findViewById(R.id.eok);
        TextView textView = (TextView) viewSd.findViewById(R.id.eu1);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.bmy);
        setBackgroundColor(C1857690yRT.LJIIJ(R.attr.zp));
        C426750GoL.LJIIIZ(tuxIconView, null, Integer.valueOf(ScreenUtils.getStatusBarHeight(tuxIconView.getContext())), null, null, false, 29);
        C20243314It c20243314It = C20243314It.LIZ;
        Context context2 = getContext();
        c20243314It.getClass();
        C20243314It.LIZIZ(c1295960jpS, false, context2, true, null);
        C20243314It.LIZIZ(c1295960jpS2, true, c1295960jpS2.getContext(), false, new Animator.AnimatorListener() { // from class: X.0jpu
            public boolean LL = true;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LL = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (this.LL) {
                    this.LL = false;
                    C1295960jpS c1295960jpS3 = c1295960jpS2;
                    c1295960jpS3.setMinFrame(((int) (c1295960jpS3.getMaxFrame() / 2)) + 1);
                    c1295960jpS2.setRepeatMode(1);
                    c1295960jpS2.setRepeatCount(-1);
                    c1295960jpS2.playAnimation();
                }
            }
        });
        C197039127h c197039127h = this.LLILLL;
        c197039127h.setText(c14ij.LIZJ);
        c197039127h.LJJJJL(AFwS236S0000000_6.get$arr$(19));
        C427690Gpr.LJ(c197039127h, C418440Gaw.LIZIZ(10));
        C786410Ut5.U8(c197039127h, new ACListenerS164S0100000_30(this, 6));
        HandlerHook.viewPost(c197039127h, new ARunnableS130S0100000_30(this, 8));
        textView.setText(c14ij.LIZIZ);
        c20243414Iu.LJ.invoke(textView, Boolean.FALSE);
        C786410Ut5.a9(tuxIconView, new ACListenerS164S0100000_30(this, 7));
    }
}
