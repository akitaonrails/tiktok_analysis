package Y;

import X.C1004940cG4;
import X.C1AV2;
import X.C2180521AVm;
import X.C786410Ut5;
import X.EnumC2180541AVo;
import X.InterfaceC998100c52;
import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;

/* JADX INFO: loaded from: classes17.dex */
public class AUListenerS223S0200000_16 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS223S0200000_16(AnimatedDrawable2 animatedDrawable2, int i) {
        this.$t = i;
        this.l1 = animatedDrawable2;
        this.l0 = Boolean.TRUE;
    }

    public static final void onAnimationUpdate$0(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (((int) fFloatValue) == 0) {
            C2180521AVm.LIZ((View) aUListenerS223S0200000_16.l0, EnumC2180541AVo.V_ALPHA, (C1AV2) aUListenerS223S0200000_16.l1);
        }
        C786410Ut5.T4((View) aUListenerS223S0200000_16.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        View view = ((BaseCaptionSheetFragment) aUListenerS223S0200000_16.l0).getView();
        if (view != null) {
            view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            view.requestLayout();
        } else {
            ValueAnimator valueAnimator2 = (ValueAnimator) aUListenerS223S0200000_16.l1;
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        if (((Boolean) aUListenerS223S0200000_16.l0).booleanValue()) {
            ((AnimatedDrawable2) aUListenerS223S0200000_16.l1).LJ(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        aUListenerS223S0200000_16.l0 = Boolean.valueOf(!((Boolean) aUListenerS223S0200000_16.l0).booleanValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            InterfaceC998100c52[] interfaceC998100c52Arr = (InterfaceC998100c52[]) aUListenerS223S0200000_16.l0;
            int[] iArr = (int[]) aUListenerS223S0200000_16.l1;
            int length = interfaceC998100c52Arr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                int i6 = i3 + i5;
                if (i6 > iIntValue) {
                    interfaceC998100c52Arr[i2].LLLIIL((iIntValue - i3) - i5);
                    Integer numValueOf = Integer.valueOf(i2 - 1);
                    if (numValueOf.intValue() >= 0) {
                        interfaceC998100c52Arr[numValueOf.intValue()].LLLIIL(0);
                        return;
                    }
                    return;
                }
                i++;
                i2 = i4;
                i3 = i6;
            }
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            InterfaceC998100c52[] interfaceC998100c52Arr = (InterfaceC998100c52[]) aUListenerS223S0200000_16.l0;
            int[] iArr = (int[]) aUListenerS223S0200000_16.l1;
            int length = interfaceC998100c52Arr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2] + i3;
                if (i5 > iIntValue) {
                    interfaceC998100c52Arr[i2].LLLIIL(i3 - iIntValue);
                    Integer numValueOf = Integer.valueOf(i2 - 1);
                    if (numValueOf.intValue() >= 0) {
                        int iIntValue2 = numValueOf.intValue();
                        interfaceC998100c52Arr[iIntValue2].LLLIIL(-iArr[iIntValue2]);
                        return;
                    }
                    return;
                }
                i++;
                i2 = i4;
                i3 = i5;
            }
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            InterfaceC998100c52[] interfaceC998100c52Arr = (InterfaceC998100c52[]) aUListenerS223S0200000_16.l0;
            int[] iArr = (int[]) aUListenerS223S0200000_16.l1;
            int length = interfaceC998100c52Arr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                int i6 = i3 + i5;
                if (i6 > iIntValue) {
                    interfaceC998100c52Arr[i2].LLLIIL((iIntValue - i3) - i5);
                    Integer numValueOf = Integer.valueOf(i2 - 1);
                    if (numValueOf.intValue() >= 0) {
                        interfaceC998100c52Arr[numValueOf.intValue()].LLLIIL(0);
                        return;
                    }
                    return;
                }
                i++;
                i2 = i4;
                i3 = i6;
            }
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            InterfaceC998100c52[] interfaceC998100c52Arr = (InterfaceC998100c52[]) aUListenerS223S0200000_16.l0;
            int[] iArr = (int[]) aUListenerS223S0200000_16.l1;
            int length = interfaceC998100c52Arr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2] + i3;
                if (i5 > iIntValue) {
                    interfaceC998100c52Arr[i2].LLLIIL(i3 - iIntValue);
                    Integer numValueOf = Integer.valueOf(i2 - 1);
                    if (numValueOf.intValue() >= 0) {
                        int iIntValue2 = numValueOf.intValue();
                        interfaceC998100c52Arr[iIntValue2].LLLIIL(-iArr[iIntValue2]);
                        return;
                    }
                    return;
                }
                i++;
                i2 = i4;
                i3 = i5;
            }
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS223S0200000_16 aUListenerS223S0200000_16, ValueAnimator valueAnimator) {
        ((C1004940cG4) aUListenerS223S0200000_16.l0).LIZ = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((View) aUListenerS223S0200000_16.l1).invalidateOutline();
    }

    public AUListenerS223S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
