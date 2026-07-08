package X;

import Y.ATListenerS440S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LGD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGD extends AbstractC2255721DQs<C0LGI> implements C0LGI, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public PopupWindow LLILZIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 144));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 143));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0LGD.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = 8;
    }

    public C0LGI X1() {
        return this;
    }

    private final TuxTextView Z1() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    private final int o2() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public final Context G2() {
        return this.LL.requireSceneContext();
    }

    @Override // X.C0LGI
    public void I4() {
        PopupWindow popupWindow = new PopupWindow((View) Z1(), -2, -2, true);
        this.LLILZIL = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        View viewFindViewById = this.LL.requireActivity().findViewById(R.id.gqf);
        viewFindViewById.setOnTouchListener(new ATListenerS440S0100000_6(popupWindow, 1));
        C786410Ut5.k3(popupWindow, viewFindViewById, 49, 0, o2());
        H2(popupWindow);
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), null, null, new C433680GzW(this, popupWindow, null), 3);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0LGF
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.LL.LLILZIL = null;
            }
        });
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        PopupWindow popupWindow = this.LLILZIL;
        if (popupWindow != null) {
            W1(popupWindow);
        }
        this.LLILZIL = null;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final void H2(PopupWindow popupWindow) {
        View contentView = popupWindow.getContentView();
        if (contentView == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(contentView, "translationY", C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(contentView, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(C1619980sG4.LIZLLL());
        animatorSet.start();
    }

    public final void W1(PopupWindow popupWindow) {
        Unit unit;
        if (popupWindow == null) {
            unit = null;
        } else {
            try {
                popupWindow.dismiss();
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

    public final void w2(final PopupWindow popupWindow) {
        View contentView = popupWindow.getContentView();
        if (contentView == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(contentView, "translationY", 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(contentView, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(350L);
        animatorSet.setInterpolator(C1619980sG4.LIZLLL());
        animatorSet.start();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0LGE
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.W1(popupWindow);
            }
        });
    }

    public C0LGD(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
