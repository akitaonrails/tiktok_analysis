package X;

import Y.AAListenerS268S0200000_16;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994600bzO {
    public static final /* synthetic */ int LIZ = 0;

    public static AnimatorSet LIZ(TuxTextView tuxTextView, TuxTextView tuxTextView2, Function0 function0, Function0 function02) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(480L);
        animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(tuxTextView2, "alpha", 0.0f, 1.0f));
        animatorSet.addListener(new AAListenerS268S0200000_16(function0, function02, 3));
        return animatorSet;
    }
}
