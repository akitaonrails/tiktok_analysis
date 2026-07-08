package X;

import Y.ACListenerS166S0100000_32;
import Y.ALAdapterS26S0100000_32;
import Y.ARunnableS132S0100000_32;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.1965, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1965 implements InterfaceC194555119t {
    public final Effect LL;
    public final ExtraParams LLILLJJLI;
    public final AnonymousClass1963 LLILLL;
    public FrameLayout LLILZ;
    public View LLILZIL;
    public C1292030jj7<C1294720jnS> LLILZLL;
    public C1295960jpS LLIZ;
    public FrameLayout LLIZLLLIL;
    public boolean LLJ;
    public View LLJI;
    public boolean LLJIJIL;
    public ValueAnimator LLJILJIL;
    public final ARunnableS132S0100000_32 LLJILJILJ = new ARunnableS132S0100000_32(this, 49);
    public final Animation LLJILLL;
    public final C21524819Lq LLJJ;
    public final C21524819Lq LLJJI;

    public static final boolean LIZIZ() {
        C2281551ESb c2281551ESb = C2281551ESb.LIZIZ;
        return c2281551ESb.LJIIJ() || c2281551ESb.LJIILIIL();
    }

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        ExtraParams extraParams;
        boolean z;
        ConstraintLayout constraintLayout;
        String str;
        TextView textView;
        if (frameLayout != null && (extraParams = this.LLILLJJLI) != null && extraParams.isLottieValid()) {
            this.LLILZ = frameLayout;
            boolean z2 = false;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d97, frameLayout, false);
            this.LLILZIL = viewTd;
            frameLayout.addView(viewTd, 0);
            this.LLIZ = (C1295960jpS) this.LLILZIL.findViewById(R.id.w5x);
            this.LLIZLLLIL = (FrameLayout) this.LLILZIL.findViewById(R.id.jcu);
            View viewFindViewById = this.LLILZIL.findViewById(R.id.w5y);
            this.LLJI = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS166S0100000_32(this, 37), viewFindViewById);
            }
            C1295960jpS c1295960jpS = this.LLIZ;
            if (c1295960jpS != null) {
                c1295960jpS.setRepeatCount(1);
            }
            C1295960jpS c1295960jpS2 = this.LLIZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.addAnimatorListener(new ALAdapterS26S0100000_32(this, 4));
            }
            View view = this.LLILZIL;
            if (view != null && (textView = (TextView) view.findViewById(R.id.w6v)) != null) {
                String hint = this.LL.getHint();
                if (hint != null && hint.length() > 0) {
                    if (!LIZIZ()) {
                        textView.startAnimation(C212353188h.LIZ(0.0f, 1.0f, 300L));
                    }
                    textView.setText(this.LL.getHint());
                    z = true;
                } else {
                    textView.setText("");
                    z = false;
                }
            } else {
                z = false;
            }
            View view2 = this.LLILZIL;
            ViewGroup.LayoutParams layoutParams = null;
            if (view2 != null) {
                constraintLayout = (ConstraintLayout) view2.findViewById(R.id.eux);
            } else {
                constraintLayout = null;
            }
            if (1 == this.LLILLJJLI.lottieType) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJIILIIL(R.id.jcu, (int) C11VU.LIZIZ(240.0f, frameLayout.getContext()));
                c19mb.LJJ(R.id.jcu, "4:3");
                c19mb.LIZIZ(constraintLayout);
            }
            if (this.LLILLJJLI.manualClose == 1) {
                z2 = true;
            }
            this.LLJ = z2;
            int iLIZIZ = (int) C11VU.LIZIZ(264.0f, frameLayout.getContext());
            View view3 = this.LLILZIL;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.height = ScreenUtils.getFullScreenHeight(frameLayout.getContext()) - iLIZIZ;
            }
            View view4 = this.LLILZIL;
            if (view4 != null) {
                C786410Ut5.W5(view4, layoutParams);
            }
            if (constraintLayout != null) {
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = (ScreenUtils.getFullScreenHeight(frameLayout.getContext()) - iLIZIZ) - ((int) C11VU.LIZIZ(112.0f, frameLayout.getContext()));
                }
                if (constraintLayout != null) {
                    C786410Ut5.m6(constraintLayout, layoutParams2);
                }
            }
            if (C2281551ESb.LIZIZ.LJIIJ() && z) {
                FrameLayout frameLayout2 = this.LLILZ;
                if (frameLayout2 != null) {
                    HandlerHook.viewPostDelay(frameLayout2, this.LLJILJILJ, Mp4ScreenVideoLoadTimeout.CONTROL);
                }
            } else {
                List<String> urlList = C1441230nbl.LIZ(this.LL.getHintFile()).getUrlList();
                if (urlList != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                    C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(frameLayout.getContext(), str);
                    c1292030jj7LJIIJJI.LIZIZ(this.LLJJ);
                    c1292030jj7LJIIJJI.LIZ(this.LLJJI);
                    this.LLILZLL = c1292030jj7LJIIJJI;
                } else {
                    FrameLayout frameLayout3 = this.LLILZ;
                    if (frameLayout3 != null) {
                        HandlerHook.viewPostDelay(frameLayout3, this.LLJILJILJ, Mp4ScreenVideoLoadTimeout.CONTROL);
                    }
                }
            }
            this.LLJIJIL = true;
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        FrameLayout frameLayout;
        this.LLJIJIL = false;
        C1292030jj7<C1294720jnS> c1292030jj7 = this.LLILZLL;
        if (c1292030jj7 != null) {
            c1292030jj7.LJII(this.LLJJ);
            c1292030jj7.LJI(this.LLJJI);
        }
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C1295960jpS c1295960jpS = this.LLIZ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        FrameLayout frameLayout2 = this.LLILZ;
        if (frameLayout2 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout2, this.LLJILJILJ);
        }
        View view = this.LLILZIL;
        if (view != null && (frameLayout = this.LLILZ) != null) {
            C786410Ut5.LJJJZ(view, frameLayout);
        }
    }

    public AnonymousClass1965(Effect effect, ExtraParams extraParams, AnonymousClass1963 anonymousClass1963) {
        this.LL = effect;
        this.LLILLJJLI = extraParams;
        this.LLILLL = anonymousClass1963;
        Animation animationLIZ = C212353188h.LIZ(0.0f, 1.0f, 300L);
        animationLIZ.setFillAfter(true);
        animationLIZ.setAnimationListener(new C19LR(this, 2));
        this.LLJILLL = animationLIZ;
        this.LLJJ = new C21524819Lq(this, 1);
        this.LLJJI = new C21524819Lq(this, 0);
    }
}
