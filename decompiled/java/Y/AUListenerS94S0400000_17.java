package Y;

import X.C1080580eE4;
import X.C1080610eE7;
import X.C1099820ej6;
import X.C13LP;
import X.C814420VxA;
import X.InterfaceC1080960eEg;
import android.animation.ValueAnimator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class AUListenerS94S0400000_17 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS94S0400000_17 aUListenerS94S0400000_17, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(C814420VxA.LIZIZ((((((C1080610eE7) aUListenerS94S0400000_17.l0).LIZ[i] - ((Number) ListProtector.get((List) aUListenerS94S0400000_17.l1, i)).floatValue()) * fFloatValue) + ((Number) ListProtector.get((List) aUListenerS94S0400000_17.l1, i)).floatValue()) * 255) << 24));
            i++;
        } while (i < 3);
        ((C1099820ej6) aUListenerS94S0400000_17.l3).LJLILLLLZI((float[]) aUListenerS94S0400000_17.l2, C13LP.LLII(arrayList));
    }

    public static final void onAnimationUpdate$1(AUListenerS94S0400000_17 aUListenerS94S0400000_17, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ArrayList arrayList = new ArrayList();
        int size = ((List) aUListenerS94S0400000_17.l0).size();
        for (int i = 0; i < size; i++) {
            C1080580eE4 c1080580eE4 = (C1080580eE4) aUListenerS94S0400000_17.l1;
            float fFloatValue2 = ((((Number) ListProtector.get((List) aUListenerS94S0400000_17.l0, i)).floatValue() - ((Number) ListProtector.get((List) aUListenerS94S0400000_17.l2, i)).floatValue()) * fFloatValue) + ((Number) ListProtector.get((List) aUListenerS94S0400000_17.l2, i)).floatValue();
            c1080580eE4.getClass();
            arrayList.add(Integer.valueOf(C814420VxA.LIZIZ(fFloatValue2 * 255) << 24));
        }
        float[] gradientPositions = ((InterfaceC1080960eEg) aUListenerS94S0400000_17.l3).getGradientPositions();
        if (gradientPositions != null && arrayList.size() == gradientPositions.length) {
            ((InterfaceC1080960eEg) aUListenerS94S0400000_17.l3).LJLILLLLZI(((InterfaceC1080960eEg) aUListenerS94S0400000_17.l3).getGradientPositions(), C13LP.LLII(arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS94S0400000_17(Object obj, List<Float> list, C1080580eE4 c1080580eE4, List<Float> list2, InterfaceC1080960eEg interfaceC1080960eEg) {
        this.$t = interfaceC1080960eEg;
        this.l0 = obj;
        this.l1 = list;
        this.l2 = c1080580eE4;
        this.l3 = list2;
    }
}
