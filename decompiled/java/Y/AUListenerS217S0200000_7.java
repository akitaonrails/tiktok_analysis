package Y;

import X.AbstractC476820Imu;
import X.C1295960jpS;
import X.C1324720kZq;
import X.C16F5;
import X.C16FZ;
import X.C19ME;
import X.C416220GTs;
import X.C417200GXm;
import X.C475460Iki;
import X.C476890In1;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C817403Hg;
import X.InterfaceC477240Ina;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.ToolbarButtonMoreDialog;
import com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.loading.TakoLoadingAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS217S0200000_7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationUpdate$9(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationUpdate$10(this, valueAnimator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationUpdate$12(this, valueAnimator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                break;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                break;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        ((C19ME) aUListenerS217S0200000_7.l0).matchConstraintPercentHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((View) aUListenerS217S0200000_7.l1).requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        ((ViewGroup.LayoutParams) aUListenerS217S0200000_7.l0).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((ViewGroup) aUListenerS217S0200000_7.l1).requestLayout();
    }

    public static final void onAnimationUpdate$10(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aUListenerS217S0200000_7.l0;
        GradientDrawable gradientDrawable = (GradientDrawable) aUListenerS217S0200000_7.l1;
        int i = ClearScreenUserInfoWidget.l0;
        clearScreenUserInfoWidget.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = clearScreenUserInfoWidget.LLLIIII.getLayoutParams();
        int i2 = (int) (fFloatValue * clearScreenUserInfoWidget.f319X);
        layoutParams.width = i2;
        if (i2 <= clearScreenUserInfoWidget.f320Y) {
            layoutParams.height = i2;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(i2 >> 1);
            }
        }
        C786410Ut5.X5(layoutParams, clearScreenUserInfoWidget.LLLIIII);
    }

    public static final void onAnimationUpdate$11(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = ((MicRoomUserInfoWidget) aUListenerS217S0200000_7.l0).LLJJI.getLayoutParams();
        int i = (int) (fFloatValue * ((MicRoomUserInfoWidget) aUListenerS217S0200000_7.l0).LLJLLIL);
        layoutParams.height = i;
        if (i >= 0) {
            layoutParams.width = i;
            ((GradientDrawable) aUListenerS217S0200000_7.l1).setCornerRadius(i << 1);
        }
        C786410Ut5.X5(layoutParams, ((MicRoomUserInfoWidget) aUListenerS217S0200000_7.l0).LLJJI);
    }

    public static final void onAnimationUpdate$12(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = ((MicRoomUserInfoWidget) aUListenerS217S0200000_7.l0).LLJJI.getLayoutParams();
        MicRoomUserInfoWidget micRoomUserInfoWidget = (MicRoomUserInfoWidget) aUListenerS217S0200000_7.l0;
        int i = (int) (fFloatValue * micRoomUserInfoWidget.LLJLL);
        layoutParams.width = i;
        if (i <= micRoomUserInfoWidget.LLJLLIL) {
            layoutParams.height = i;
            ((GradientDrawable) aUListenerS217S0200000_7.l1).setCornerRadius(i >> 1);
        }
        C786410Ut5.X5(layoutParams, ((MicRoomUserInfoWidget) aUListenerS217S0200000_7.l0).LLJJI);
    }

    public static final void onAnimationUpdate$13(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        TakoLoadingAssem takoLoadingAssem = (TakoLoadingAssem) aUListenerS217S0200000_7.l0;
        ConstraintLayout constraintLayout = (ConstraintLayout) aUListenerS217S0200000_7.l1;
        takoLoadingAssem.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.width = iIntValue;
        C786410Ut5.m6(constraintLayout, layoutParams);
    }

    public static final void onAnimationUpdate$14(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        C416220GTs c416220GTs = ((DrawGuessToolbarWidget) aUListenerS217S0200000_7.l0).LLILLL;
        if (c416220GTs == null) {
            c416220GTs = null;
        }
        c416220GTs.setColor(((Integer) ((ValueAnimator) aUListenerS217S0200000_7.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$15(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        Float f;
        View viewNR = ((DrawGuessStartFragment) aUListenerS217S0200000_7.l0).NR();
        if (viewNR != null) {
            Object animatedValue = ((ValueAnimator) aUListenerS217S0200000_7.l1).getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                C786410Ut5.T4(viewNR, f.floatValue());
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        ((ViewGroup.LayoutParams) aUListenerS217S0200000_7.l0).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ToolbarButtonMoreDialog toolbarButtonMoreDialog = (ToolbarButtonMoreDialog) aUListenerS217S0200000_7.l1;
        View viewFindViewById = toolbarButtonMoreDialog.LLILZ;
        if (viewFindViewById == null) {
            View view = toolbarButtonMoreDialog.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.sur);
            } else {
                viewFindViewById = null;
            }
            toolbarButtonMoreDialog.LLILZ = (LinearLayout) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        viewFindViewById.requestLayout();
    }

    public static final void onAnimationUpdate$3(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        Float f;
        Float fValueOf;
        View view;
        View view2;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float fValueOf2 = null;
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            View view3 = (View) aUListenerS217S0200000_7.l0;
            if (view3 != null) {
                fValueOf = Float.valueOf(view3.getAlpha());
            } else {
                fValueOf = null;
            }
            if (!Intrinsics.LIZLLL(fValueOf, 1.0f) && (view2 = (View) aUListenerS217S0200000_7.l0) != null) {
                C786410Ut5.T4(view2, fFloatValue);
            }
            View view4 = (View) aUListenerS217S0200000_7.l1;
            if (view4 != null) {
                fValueOf2 = Float.valueOf(view4.getAlpha());
            }
            if (!Intrinsics.LIZLLL(fValueOf2, 0.0f) && (view = (View) aUListenerS217S0200000_7.l1) != null) {
                C786410Ut5.T4(view, 1 - fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((RecyclerView) aUListenerS217S0200000_7.l1).scrollBy(0, (int) (fFloatValue - ((C817403Hg) aUListenerS217S0200000_7.l0).element));
        ((C817403Hg) aUListenerS217S0200000_7.l0).element = fFloatValue;
    }

    public static final void onAnimationUpdate$5(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C817403Hg c817403Hg = (C817403Hg) aUListenerS217S0200000_7.l0;
        float f2 = fFloatValue - c817403Hg.element;
        c817403Hg.element = fFloatValue;
        AbstractC476820Imu abstractC476820Imu = (AbstractC476820Imu) aUListenerS217S0200000_7.l1;
        abstractC476820Imu.LJFF = fFloatValue;
        abstractC476820Imu.LJJIJIIJIL(f2);
        if (C500260Jjc.LJJJJIZL(((AbstractC476820Imu) aUListenerS217S0200000_7.l1).LJJIIZ)) {
            AbstractC476820Imu abstractC476820Imu2 = (AbstractC476820Imu) aUListenerS217S0200000_7.l1;
            abstractC476820Imu2.LJJIIJZLJL(abstractC476820Imu2.LJJIIZ, f2);
        }
        AbstractC476820Imu abstractC476820Imu3 = (AbstractC476820Imu) aUListenerS217S0200000_7.l1;
        InterfaceC477240Ina interfaceC477240Ina = abstractC476820Imu3.LJJIL;
        if (interfaceC477240Ina != null) {
            ((C476890In1) interfaceC477240Ina).LIZIZ(abstractC476820Imu3.LJFF());
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        float fFloatValue;
        ViewGroup viewGroup = (ViewGroup) aUListenerS217S0200000_7.l0;
        Float f = (Float) valueAnimator.getAnimatedValue();
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.bd(fFloatValue, viewGroup);
        ((AbstractC476820Imu) aUListenerS217S0200000_7.l1).LJJII();
    }

    public static final void onAnimationUpdate$7(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        float fFloatValue;
        C475460Iki c475460IkiC1;
        C1324720kZq c1324720kZq;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C817403Hg c817403Hg = (C817403Hg) aUListenerS217S0200000_7.l0;
        float f2 = fFloatValue - c817403Hg.element;
        c817403Hg.element = fFloatValue;
        AbstractC476820Imu abstractC476820Imu = (AbstractC476820Imu) aUListenerS217S0200000_7.l1;
        abstractC476820Imu.LJI = fFloatValue;
        abstractC476820Imu.LJJIJIIJIL(f2);
        ViewGroup viewGroup = ((AbstractC476820Imu) aUListenerS217S0200000_7.l1).LJJIFFI;
        if (viewGroup != null) {
            C786410Ut5.bd(fFloatValue, viewGroup);
        }
        AbstractC476820Imu abstractC476820Imu2 = (AbstractC476820Imu) aUListenerS217S0200000_7.l1;
        InterfaceC477240Ina interfaceC477240Ina = abstractC476820Imu2.LJJIL;
        if (interfaceC477240Ina != null) {
            float fLJFF = abstractC476820Imu2.LJFF();
            C476890In1 c476890In1 = (C476890In1) interfaceC477240Ina;
            if (c476890In1.LIZIZ.LLJJ.c1() != null && (c1324720kZq = (c475460IkiC1 = c476890In1.LIZIZ.LLJJ.c1()).LJ) != null && c1324720kZq.getVisibility() == 0) {
                ValueAnimator valueAnimator2 = c475460IkiC1.LJIIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                C1324720kZq c1324720kZq2 = c475460IkiC1.LJ;
                if (c1324720kZq2 != null) {
                    C786410Ut5.md(c1324720kZq2, fLJFF);
                }
                C1295960jpS c1295960jpS = c475460IkiC1.LJIIJJI;
                if (c1295960jpS != null) {
                    C786410Ut5.ld(c1295960jpS, fLJFF);
                }
                C16FZ c16fz = c475460IkiC1.LJIIJ;
                if (c16fz != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fz);
                    c16fz.setTranslationY(fLJFF);
                }
            }
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        C417200GXm c417200GXm = (C417200GXm) aUListenerS217S0200000_7.l0;
        if (c417200GXm != null) {
            c417200GXm.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
        C16F5 c16f5 = ((GoLiveViewHolder) aUListenerS217S0200000_7.l1).LLJJ;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS217S0200000_7 aUListenerS217S0200000_7, ValueAnimator valueAnimator) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aUListenerS217S0200000_7.l0;
        GradientDrawable gradientDrawable = (GradientDrawable) aUListenerS217S0200000_7.l1;
        int i = ClearScreenUserInfoWidget.l0;
        clearScreenUserInfoWidget.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = clearScreenUserInfoWidget.LLLIIII.getLayoutParams();
        int i2 = (int) (fFloatValue * clearScreenUserInfoWidget.f320Y);
        layoutParams.height = i2;
        if (i2 >= 0) {
            layoutParams.width = i2;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(i2 << 1);
            }
        }
        C786410Ut5.X5(layoutParams, clearScreenUserInfoWidget.LLLIIII);
    }

    public AUListenerS217S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
