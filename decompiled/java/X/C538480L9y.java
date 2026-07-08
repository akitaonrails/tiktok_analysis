package X;

import Y.ACListenerS112S0200000_8;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.template.TemplateLottieKey;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538480L9y extends LinearLayout implements InterfaceC497601wk {
    public final C527180Klw LL;
    public float LLILLJJLI;
    public View LLILLL;
    public C1295960jpS LLILZ;
    public TuxTextView LLILZIL;
    public InterfaceC538470L9x LLILZLL;
    public EnumC538450L9v LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C1DFK LLJI;
    public final CoroutineContext LLJIJIL;
    public C0MWA LLJILJIL;

    private final ObjectAnimator getHideAnim() {
        return (ObjectAnimator) this.LLJ.getValue();
    }

    private final ObjectAnimator getShowAnim() {
        return (ObjectAnimator) this.LLIZLLLIL.getValue();
    }

    public final void LIZ() {
        C1295960jpS c1295960jpS;
        if (this.LLIZ == EnumC538450L9v.SHOWING) {
            getShowAnim().cancel();
        }
        if (this.LLIZ == EnumC538450L9v.GUIDING && (c1295960jpS = this.LLILZ) != null && c1295960jpS.isAnimating()) {
            C1295960jpS c1295960jpS2 = this.LLILZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.cancelAnimation();
            }
            C1295960jpS c1295960jpS3 = this.LLILZ;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setProgress(1.0f);
            }
        }
    }

    public final void LIZJ() {
        View view = this.LLILLL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final void LIZLLL() {
        EnumC538450L9v enumC538450L9v = this.LLIZ;
        if (enumC538450L9v == EnumC538450L9v.SHOWING || enumC538450L9v == EnumC538450L9v.GUIDING) {
            LIZ();
        } else {
            View view = this.LLILLL;
            if (view == null) {
                view = null;
            }
            if (view.getVisibility() == 8) {
                return;
            }
        }
        getHideAnim().setFloatValues(this.LLILLJJLI, 0.0f);
        C786410Ut5.Pd(getHideAnim());
        this.LLIZ = EnumC538450L9v.HIDING;
    }

    public final void LJ() {
        EnumC538450L9v enumC538450L9v = this.LLIZ;
        if (enumC538450L9v == EnumC538450L9v.SHOWING || enumC538450L9v == EnumC538450L9v.GUIDING) {
            return;
        }
        if (enumC538450L9v == EnumC538450L9v.HIDING) {
            getHideAnim().cancel();
        }
        View view = this.LLILLL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        C0MWA lottieAnimationType = getLottieAnimationType();
        this.LLJILJIL = lottieAnimationType;
        if (Intrinsics.LJFF(lottieAnimationType, C0MWB.LIZ)) {
            C538490L9z.LIZJ(System.currentTimeMillis());
            boolean z = this.LL.LIZ.getBoolean("autocut_guide_should_show", true);
            if (z) {
                this.LL.LIZ.storeBoolean("autocut_guide_should_show", false);
            }
            LJFF(z);
            return;
        }
        if (Intrinsics.LJFF(lottieAnimationType, C0MW9.LIZ)) {
            C1295960jpS c1295960jpS = this.LLILZ;
            if (c1295960jpS != null) {
                c1295960jpS.setProgress(1.0f);
            }
            InterfaceC538470L9x interfaceC538470L9x = this.LLILZLL;
            if (interfaceC538470L9x != null) {
                interfaceC538470L9x.LIZ(false);
                return;
            }
            return;
        }
        if (this.LL.LIZ.getBoolean("autocut_guide_should_show", true)) {
            this.LL.LIZ.storeBoolean("autocut_guide_should_show", false);
            LJFF(true);
        } else {
            InterfaceC538470L9x interfaceC538470L9x2 = this.LLILZLL;
            if (interfaceC538470L9x2 != null) {
                interfaceC538470L9x2.LIZ(false);
            }
        }
    }

    public final void LJI() {
        if (this.LLIZ == EnumC538450L9v.HIDING) {
            getHideAnim().cancel();
        } else {
            View view = this.LLILLL;
            if (view == null) {
                view = null;
            }
            if (view.getVisibility() == 0) {
                return;
            }
        }
        getShowAnim().setFloatValues(0.0f, this.LLILLJJLI);
        View view2 = this.LLILLL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.T4(view2, 0.0f);
        View view3 = this.LLILLL;
        C786410Ut5.LJLLLLLL(0, view3 != null ? view3 : null);
        C786410Ut5.Pd(getShowAnim());
        this.LLIZ = EnumC538450L9v.SHOWING;
    }

    public final void LIZIZ() {
        getShowAnim().cancel();
        this.LLIZ = EnumC538450L9v.NONE;
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null && c1295960jpS.isAnimating()) {
            C1295960jpS c1295960jpS2 = this.LLILZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.cancelAnimation();
            }
            C1295960jpS c1295960jpS3 = this.LLILZ;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setProgress(1.0f);
            }
        }
        InterfaceC538470L9x interfaceC538470L9x = this.LLILZLL;
        if (interfaceC538470L9x != null) {
            interfaceC538470L9x.LIZLLL();
        }
    }

    public final C0MWA getLottieAnimationType() {
        if (C0CHQ.LIZ().getAccountService().LJIIJJI()) {
            return C0MWC.LIZ;
        }
        TemplateLottieKey templateLottieKey = (TemplateLottieKey) C0LA0.LIZ.getValue();
        if (templateLottieKey == null) {
            return C0MWC.LIZ;
        }
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        C0L62.LIZ.getClass();
        if (!c2137908Zd.LJFF(C0L62.LIZLLL("auto_cut_album_button_lottie.json"))) {
            return C0MWC.LIZ;
        }
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C538490L9z.LIZ());
        sbLIZ.append("auto_cut_album_button_show_time");
        long j = repo.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j == 0 && templateLottieKey.isAutoPlayFirstTime()) {
            return C0MWB.LIZ;
        }
        if (System.currentTimeMillis() - j >= 172800000) {
            List<Long> list = templateLottieKey.timeStamp;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<Long> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (System.currentTimeMillis() - it2.next().longValue() < 172800000) {
                        return C0MWB.LIZ;
                    }
                }
            }
        }
        return templateLottieKey.isShowEndFrame() ? C0MW9.LIZ : C0MWC.LIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJI.LIZIZ(null);
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJIJIL;
    }

    public final void LJFF(final boolean z) {
        final C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null) {
            c1295960jpS.addAnimatorListener(new AnimatorListenerAdapter() { // from class: X.0L9w
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL.LLIZ = EnumC538450L9v.NONE;
                    c1295960jpS.removeAllAnimatorListeners();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C538480L9y c538480L9y = this.LL;
                    c538480L9y.LLIZ = EnumC538450L9v.NONE;
                    InterfaceC538470L9x interfaceC538470L9x = c538480L9y.LLILZLL;
                    if (interfaceC538470L9x != null) {
                        interfaceC538470L9x.LIZ(z);
                    }
                    c1295960jpS.removeAllAnimatorListeners();
                }
            });
            c1295960jpS.playAnimation();
            this.LLIZ = EnumC538450L9v.GUIDING;
        }
    }

    public final void setAnimListener(InterfaceC538470L9x interfaceC538470L9x) {
        this.LLILZLL = interfaceC538470L9x;
    }

    public final void setContentAlpha(float f) {
        this.LLILLJJLI = f;
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    public final void setIconColor(int i) {
        if (C960203pA.LIZIZ(getContext())) {
            C1296110jph c1296110jph = new C1296110jph(i);
            C1295090jo3 c1295090jo3 = new C1295090jo3("**");
            C1295400joY c1295400joY = new C1295400joY(c1296110jph);
            C1295960jpS c1295960jpS = this.LLILZ;
            if (c1295960jpS != null) {
                c1295960jpS.addValueCallback(c1295090jo3, InterfaceC1295080jo2.LJJIJL, (C1295400joY<ColorFilter>) c1295400joY);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new ACListenerS112S0200000_8(this, onClickListener, 2));
    }

    public final void setTextColor(int i) {
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTextColor(i);
    }

    public C538480L9y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C527180Klw();
        this.LLILLJJLI = 1.0f;
        this.LLIZ = EnumC538450L9v.NONE;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 16));
        this.LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 15));
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLJI = c1dfkLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJIJIL = C2107308Nj.LIZ.plus(c1dfkLIZ);
        C0MWC c0mwc = C0MWC.LIZ;
        this.LLJILJIL = c0mwc;
        View viewSd = C786410Ut5.Sd(R.layout.sa, C786410Ut5.ne(getContext()), this);
        this.LLILLL = viewSd;
        C786410Ut5.LJLLLLLL(0, (viewSd == null ? null : viewSd).findViewById(R.id.kgc));
        View view = this.LLILLL;
        this.LLILZ = (C1295960jpS) (view == null ? null : view).findViewById(R.id.nr9);
        if (!Intrinsics.LJFF(getLottieAnimationType(), c0mwc)) {
            C1295960jpS c1295960jpS = this.LLILZ;
            if (c1295960jpS != null) {
                c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0GtK
                    @Override // X.InterfaceC1296230jpt
                    public final void LIZ(C1294720jnS c1294720jnS) {
                        float fWidth = (c1294720jnS.LJIIIZ.width() / c1294720jnS.LJIIIZ.height()) * 24;
                        C1295960jpS c1295960jpS2 = this.LL.LLILZ;
                        if (c1295960jpS2 != null) {
                            ViewGroup.LayoutParams layoutParams = c1295960jpS2.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(fWidth)));
                                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                C786410Ut5.W5(c1295960jpS2, layoutParams);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                });
            }
            C23250099c.LIZLLL(this, null, null, new C0LA2(this, null), 3);
        } else {
            C1295960jpS c1295960jpS2 = this.LLILZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.setAnimation("creation_autocut_icon_o1_tux_lottie.json");
            }
        }
        View view2 = this.LLILLL;
        TuxTextView tuxTextView = (TuxTextView) (view2 == null ? null : view2).findViewById(R.id.cvr);
        this.LLILZIL = tuxTextView;
        (tuxTextView != null ? tuxTextView : null).setText(getContext().getString(R.string.creation_autocut_entry_point));
    }
}
