package X;

import Y.ACListenerS166S0100000_32;
import Y.ARunnableS101S0200000_32;
import Y.AUListenerS223S0200000_16;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1968, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1968 extends C1320700kTM<InterfaceC1330440kj4> {
    public final /* synthetic */ FrameLayout LIZIZ;
    public final /* synthetic */ AnonymousClass1967 LIZJ;

    public AnonymousClass1968(AnonymousClass1967 anonymousClass1967, FrameLayout frameLayout) {
        this.LIZJ = anonymousClass1967;
        this.LIZIZ = frameLayout;
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        AnonymousClass1967 anonymousClass1967 = this.LIZJ;
        AnonymousClass1963 anonymousClass1963 = anonymousClass1967.LLIZ;
        if (anonymousClass1963 != null) {
            anonymousClass1963.LIZ(false, anonymousClass1967.LL, C196B.GIF);
        }
        AnonymousClass1967 anonymousClass19672 = this.LIZJ;
        if (anonymousClass19672.LLIZLLLIL && anonymousClass19672.LLILZIL != null) {
            HandlerHook.viewPostDelay(anonymousClass19672.LLILZIL, anonymousClass19672.LLJILLL, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        int iLIZJ;
        this.LIZIZ.setBackgroundResource(R.drawable.at6);
        AnonymousClass1967 anonymousClass1967 = this.LIZJ;
        ExtraParams extraParams = anonymousClass1967.LLILLJJLI;
        View view = anonymousClass1967.LLILLL;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.w5t);
            if (1 == extraParams.manualClose) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                C786410Ut5.I7(new ACListenerS166S0100000_32(anonymousClass1967, 36), viewFindViewById);
            } else {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
        }
        if (animatable instanceof AnimatedDrawable2) {
            if (AnonymousClass1967.LIZIZ()) {
                AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                if (animatedDrawable2.LIZJ() == 0) {
                    iLIZJ = 0;
                } else {
                    iLIZJ = animatedDrawable2.LIZJ() - 1;
                }
                this.LIZJ.LLJILJIL = ValueAnimator.ofInt(0, iLIZJ).setDuration(animatedDrawable2.LIZLLL());
                this.LIZJ.LLJILJIL.setInterpolator(new LinearInterpolator());
                this.LIZJ.LLJILJIL.setRepeatCount(2);
                this.LIZJ.LLJILJIL.addUpdateListener(new AUListenerS223S0200000_16(animatedDrawable2, 2));
                this.LIZJ.LLJILJIL.start();
            } else {
                AnimatedDrawable2 animatedDrawable22 = (AnimatedDrawable2) animatable;
                animatedDrawable22.LL = 2;
                animatedDrawable22.LLILLJJLI = true;
                animatable.start();
            }
            long jLIZLLL = ((AnimatedDrawable2) animatable).LIZLLL();
            if (jLIZLLL > 0) {
                AnonymousClass1967 anonymousClass19672 = this.LIZJ;
                if (anonymousClass19672.LLILLL != null) {
                    HandlerHook.viewPostDelay(anonymousClass19672.LLILLL, new ARunnableS101S0200000_32(this, animatable, 18), jLIZLLL * 2);
                }
            }
        }
        AnonymousClass1967 anonymousClass19673 = this.LIZJ;
        AnonymousClass1963 anonymousClass1963 = anonymousClass19673.LLIZ;
        if (anonymousClass1963 != null) {
            anonymousClass1963.LIZ(true, anonymousClass19673.LL, C196B.GIF);
        }
    }
}
