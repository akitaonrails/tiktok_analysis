package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.capcut.CapCutAnchorView$onShowAnchor$1", f = "CapCutAnchorView.kt", l = {110}, m = "invokeSuspend")
public final class C751560Tdy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1393840mNK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751560Tdy(C1393840mNK c1393840mNK, InterfaceC1364105Vn<? super C751560Tdy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1393840mNK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751560Tdy(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme awemeLJJLIIIJJIZ;
        Video video;
        final String caption;
        C1C7U.LIZ("CapCutAnchorView@a85c.onShowAnchor$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                caption = (String) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TuxTextView tuxTextView = this.LLILLL.LLIZLLLIL;
            if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CapCutAnchorView@a85c.onShowAnchor$1");
                return unit;
            }
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLL.LLJI;
            if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null && (video = awemeLJJLIIIJJIZ.getVideo()) != null) {
                int duration = video.getDuration();
                AnchorCommonStruct anchorCommonStruct = this.LLILLL.LLJ;
                if (anchorCommonStruct != null && (caption = anchorCommonStruct.getCaption()) != null && caption.length() > 0) {
                    C1393840mNK c1393840mNK = this.LLILLL;
                    long j = duration;
                    long j2 = 3000;
                    if (j < 3000) {
                        j2 = 0;
                    }
                    c1393840mNK.getClass();
                    this.LL = caption;
                    this.LLILLJJLI = 1;
                    if (AnonymousClass0958.LIZIZ(j2, this) == objLJFF) {
                        C1C7U.LIZIZ("CapCutAnchorView@a85c.onShowAnchor$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("CapCutAnchorView@a85c.onShowAnchor$1");
                    return unit2;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("CapCutAnchorView@a85c.onShowAnchor$1");
                return unit3;
            }
        }
        final C1393840mNK c1393840mNK2 = this.LLILLL;
        c1393840mNK2.getClass();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        TuxTextView tuxTextView2 = c1393840mNK2.LLIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        TuxTextView tuxTextView3 = c1393840mNK2.LLIZLLLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        TuxTextView tuxTextView4 = c1393840mNK2.LLIZ;
        if (tuxTextView4 != null) {
            final int measuredWidth = tuxTextView4.getMeasuredWidth();
            TuxTextView tuxTextView5 = c1393840mNK2.LLIZ;
            if (tuxTextView5 != null) {
                final int measuredHeight = tuxTextView5.getMeasuredHeight();
                TuxTextView tuxTextView6 = c1393840mNK2.LLIZLLLIL;
                if (tuxTextView6 != null) {
                    final int measuredWidth2 = tuxTextView6.getMeasuredWidth();
                    TuxTextView tuxTextView7 = c1393840mNK2.LLIZLLLIL;
                    if (tuxTextView7 != null) {
                        final int measuredHeight2 = tuxTextView7.getMeasuredHeight();
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(300L);
                        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0T37
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ViewGroup.LayoutParams layoutParams;
                                View view = c1393840mNK2.LLILZLL;
                                if (view != null) {
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.height = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * measuredHeight2) + measuredHeight);
                                    }
                                } else {
                                    layoutParams = null;
                                }
                                if (measuredWidth2 > measuredWidth && layoutParams != null) {
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    int i2 = measuredWidth2;
                                    layoutParams.width = (int) ((fFloatValue * (i2 - r1)) + measuredWidth);
                                }
                                View view2 = c1393840mNK2.LLILZLL;
                                if (view2 != null) {
                                    C786410Ut5.W5(view2, layoutParams);
                                }
                            }
                        });
                        TuxTextView tuxTextView8 = c1393840mNK2.LLIZLLLIL;
                        if (tuxTextView8 != null) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView8, "alpha", 0.0f, 1.0f);
                            objectAnimatorOfFloat.setStartDelay(50L);
                            objectAnimatorOfFloat.setDuration(300L);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
                            animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0TK5
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    TuxTextView tuxTextView9 = c1393840mNK2.LLIZLLLIL;
                                    if (tuxTextView9 != null) {
                                        tuxTextView9.setText(caption);
                                    }
                                    TuxTextView tuxTextView10 = c1393840mNK2.LLIZLLLIL;
                                    if (tuxTextView10 != null) {
                                        C786410Ut5.LLLLZLL(tuxTextView10, 0);
                                    }
                                }
                            });
                            animatorSet.start();
                        }
                    }
                }
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("CapCutAnchorView@a85c.onShowAnchor$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
