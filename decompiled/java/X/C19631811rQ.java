package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS98S0200000_29;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.11rQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19631811rQ extends AbstractC19588311kP<PollStickerModel> implements InterfaceC789470Uy1 {
    public int LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public long LLJJIJI;
    public InterfaceC19598211m0 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    private final C19631911rR getPbListener() {
        return (C19631911rR) this.LLJJIII.getValue();
    }

    private final ViewGroup getRlQuestion1() {
        return (ViewGroup) this.LLIZ.getValue();
    }

    private final ViewGroup getRlQuestion2() {
        return (ViewGroup) this.LLJIJIL.getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) this.LLILZLL.getValue();
    }

    public final boolean LJI() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    public final C789440Uxy getPbQuestion1() {
        return (C789440Uxy) this.LLIZLLLIL.getValue();
    }

    public final C789440Uxy getPbQuestion2() {
        return (C789440Uxy) this.LLJILJIL.getValue();
    }

    public final InterfaceC19632111rT getPollStickerClickListener() {
        return (InterfaceC19632111rT) this.LLJJI.getValue();
    }

    public final FrameLayout getPollView() {
        return (FrameLayout) this.LLJJ.getValue();
    }

    public final TextView getTvQuestion1() {
        return (TextView) this.LLJ.getValue();
    }

    public final TextView getTvQuestion1Percent() {
        return (TextView) this.LLJI.getValue();
    }

    public final TextView getTvQuestion2() {
        return (TextView) this.LLJILJILJ.getValue();
    }

    public final TextView getTvQuestion2Percent() {
        return (TextView) this.LLJILLL.getValue();
    }

    private final int getPollStatus() {
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        if (LJI()) {
            return 3;
        }
        PollStruct pollStruct = getStruct().getPollStruct();
        Long lValueOf = null;
        Long lValueOf2 = pollStruct != null ? Long.valueOf(pollStruct.getSelectOptionId()) : null;
        PollStruct pollStruct2 = getStruct().getPollStruct();
        if (Intrinsics.LJFF(lValueOf2, (pollStruct2 == null || (options2 = pollStruct2.getOptions()) == null || (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options2, 0)) == null) ? null : Long.valueOf(optionsBean2.getOptionId()))) {
            return 1;
        }
        PollStruct pollStruct3 = getStruct().getPollStruct();
        Long lValueOf3 = pollStruct3 != null ? Long.valueOf(pollStruct3.getSelectOptionId()) : null;
        PollStruct pollStruct4 = getStruct().getPollStruct();
        if (pollStruct4 != null && (options = pollStruct4.getOptions()) != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options, 1)) != null) {
            lValueOf = Long.valueOf(optionsBean.getOptionId());
        }
        return Intrinsics.LJFF(lValueOf3, lValueOf) ? 2 : 0;
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        if (LJI()) {
            View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 127);
            if (C1848410yCV.LIZ) {
                aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
            }
            a aVar = new a(aCListenerS163S0100000_29);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
        }
    }

    @Override // X.InterfaceC789470Uy1
    public int getStatus() {
        return this.LLILZIL;
    }

    public static final void LJ(C19631811rQ c19631811rQ) {
        String str;
        C705930RmZ c705930RmZ;
        InterfaceC19598211m0 interfaceC19598211m0 = c19631811rQ.LLJJIJIIJIL;
        if (interfaceC19598211m0 != null) {
            interfaceC19598211m0.LIZJ();
        }
        InterfaceC19632111rT pollStickerClickListener = c19631811rQ.getPollStickerClickListener();
        if (pollStickerClickListener != null) {
            C19591211ks interactStickerContainerCommonParam = c19631811rQ.getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam != null && (c705930RmZ = interactStickerContainerCommonParam.LJFF) != null) {
                str = c705930RmZ.LIZLLL;
            } else {
                str = null;
            }
            pollStickerClickListener.Ll(c19631811rQ.LLJJIJI, str);
        }
    }

    public final String LIZIZ(String str) {
        if (str == null) {
            return "";
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C12ES.LJIILLIIL(15.0f, getContext()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.j4("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f)}, 1)));
        sbLIZ.append('%');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        paint.getTextBounds(strLIZIZ, 0, strLIZIZ.length() - 1, rect2);
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (-1 >= length2) {
                break;
            }
            paint.getTextBounds(str, 0, length2, rect);
            if (C418440Gaw.LIZIZ(Float.valueOf(20.0f)) + rect.width() + C418440Gaw.LIZIZ(Float.valueOf(49.0f)) + rect2.width() < getPbQuestion1().getWidth()) {
                length = length2;
                break;
            }
            length2--;
        }
        if (length < str.length() - 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str.substring(0, length));
            sbLIZ2.append("...");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    public final float LJFF(int i) {
        float pollCount;
        float pollCount2;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        List<PollStruct.OptionsBean> options3;
        PollStruct.OptionsBean optionsBean3;
        PollStruct pollStruct = getStruct().getPollStruct();
        float pollCount3 = 0.0f;
        if (pollStruct != null && (options3 = pollStruct.getOptions()) != null && (optionsBean3 = (PollStruct.OptionsBean) ListProtector.get(options3, 0)) != null) {
            pollCount = optionsBean3.getPollCount();
        } else {
            pollCount = 0.0f;
        }
        if (pollStruct != null && (options2 = pollStruct.getOptions()) != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options2, 1)) != null) {
            pollCount2 = optionsBean2.getPollCount();
        } else {
            pollCount2 = 0.0f;
        }
        float f = 0;
        float f2 = pollCount + pollCount2 + f;
        if (f2 == 0.0f) {
            if (LJI()) {
                return 101.0f;
            }
            return 50.0f;
        }
        if (pollStruct != null && (options = pollStruct.getOptions()) != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options, i)) != null) {
            pollCount3 = optionsBean.getPollCount();
        }
        return ((pollCount3 + f) / f2) * 100;
    }

    public final void LJII(C789440Uxy c789440Uxy) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c789440Uxy.setBackground(c384050F3z.LIZ(getContext()));
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a09);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c789440Uxy.setProgressDrawable(new ClipDrawable(c384050F3z2.LIZ(getContext()), 8388611, 1));
    }

    public final void LJIIIIZZ(C789440Uxy c789440Uxy) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c789440Uxy.setBackground(c384050F3z.LIZ(getContext()));
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c789440Uxy.setProgressDrawable(new ClipDrawable(c384050F3z2.LIZ(getContext()), 8388611, 1));
    }

    public C19631811rQ(C19EG c19eg, C19591211ks c19591211ks) {
        Typeface typefaceInvoke;
        super(0, c19eg, (AttributeSet) null, c19591211ks);
        this.LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 950));
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 944));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 942));
        this.LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 946));
        this.LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 947));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 945));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 943));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 948));
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 949));
        this.LLJJ = C452501pT.LIZIZ(new AwS417S0200000_16(c19eg, this, 73));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(c19591211ks, 813));
        this.LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 941));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(c19591211ks, 940));
        getPollView();
        C786410Ut5.S4(0.0f, getTvQuestion1Percent());
        C786410Ut5.S4(0.0f, getTvQuestion2Percent());
        getPbQuestion1().setStatusView(this);
        getPbQuestion2().setStatusView(this);
        if (!LJI()) {
            getPbQuestion1().setClickListener(getPbListener());
            getPbQuestion2().setClickListener(getPbListener());
        }
        C14K9.LJIJ(getRlQuestion1(), C1919207fS.LJI());
        C14K9.LJIJ(getRlQuestion2(), C1919207fS.LJI());
        Function1<String, Typeface> function1 = c19591211ks.LJIIIIZZ;
        if (function1 != null && (typefaceInvoke = function1.invoke("")) != null) {
            getTvTitle().setTypeface(typefaceInvoke);
        }
        setLayoutDirection(3);
        if (C426750GoL.LIZLLL(c19eg)) {
            getRlQuestion1().setLayoutDirection(1);
            getRlQuestion2().setLayoutDirection(1);
        } else {
            getRlQuestion1().setLayoutDirection(0);
            getRlQuestion2().setLayoutDirection(0);
        }
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        InterfaceC19598211m0 interfaceC19598211m0;
        String question;
        this.LLILZ = interactStickerStruct;
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam == null) {
            return;
        }
        C705930RmZ c705930RmZ = interactStickerContainerCommonParam.LJFF;
        String question2 = null;
        if (c705930RmZ != null) {
            interfaceC19598211m0 = c705930RmZ.LJIILJJIL;
        } else {
            interfaceC19598211m0 = null;
        }
        this.LLJJIJIIJIL = interfaceC19598211m0;
        PollStruct pollStruct = interactStickerStruct.getPollStruct();
        if (pollStruct != null) {
            question = pollStruct.getQuestion();
        } else {
            question = null;
        }
        if (TextUtils.isEmpty(question)) {
            C786410Ut5.LLIL(getTvTitle(), 8);
        } else {
            C786410Ut5.LLIL(getTvTitle(), 0);
            TextView tvTitle = getTvTitle();
            PollStruct pollStruct2 = interactStickerStruct.getPollStruct();
            if (pollStruct2 != null) {
                question2 = pollStruct2.getQuestion();
            }
            tvTitle.setText(question2);
        }
        getPbQuestion1().setListener(this.LLJJIJIIJIL);
        getPbQuestion2().setListener(this.LLJJIJIIJIL);
        this.LLILZIL = getPollStatus();
        int visibility = getVisibility();
        setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, this);
        HandlerHook.viewPost(getTvQuestion1(), new ARunnableS98S0200000_29(this, interactStickerStruct, 35));
    }

    public final void LJIIIZ(C789440Uxy c789440Uxy, TextView textView, TextView textView2, int i) {
        float width = ((c789440Uxy.getWidth() - textView.getWidth()) / 2) - C12ES.LIZJ(20.0f, getContext());
        if (C444960Hcc.LIZJ(getContext())) {
            width = -width;
        }
        c789440Uxy.setProgress(i);
        C786410Ut5.S4(1.0f, textView2);
        C786410Ut5.Hc(-width, textView);
    }

    public final void LIZLLL(C789440Uxy c789440Uxy, TextView textView, TextView textView2, int i, final boolean z) {
        float width = ((c789440Uxy.getWidth() - textView.getWidth()) / 2) - C418440Gaw.LIZIZ(Float.valueOf(20.0f));
        if (C444960Hcc.LIZJ(getContext())) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(c789440Uxy, "progress", 0, i);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView2, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, -width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfInt);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.11rS
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (z) {
                    C19631811rQ.LJ(this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    C19631811rQ.LJ(this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                InterfaceC19598211m0 interfaceC19598211m0;
                if (z && (interfaceC19598211m0 = this.LLJJIJIIJIL) != null) {
                    interfaceC19598211m0.LIZ();
                }
            }
        });
        animatorSet.start();
    }
}
