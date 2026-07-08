package Y;

import X.C1579960rDW;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AUListenerS15S0100001_24 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
    public Object l0;

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

    public static final void onAnimationUpdate$0(AUListenerS15S0100001_24 aUListenerS15S0100001_24, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Function2<? super Float, ? super Float, Unit> function2 = ((C1579960rDW) aUListenerS15S0100001_24.l0).LIZLLL;
        if (function2 != null) {
            function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(aUListenerS15S0100001_24.f1));
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS15S0100001_24 aUListenerS15S0100001_24, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) ((SocialFriendsFeedFragment) aUListenerS15S0100001_24.l0).LLJLLIL.getValue();
        if (feedSkylightDrawerLogicAbility != null) {
            feedSkylightDrawerLogicAbility.zO2(fFloatValue, aUListenerS15S0100001_24.f1, null);
        }
    }

    public AUListenerS15S0100001_24(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
