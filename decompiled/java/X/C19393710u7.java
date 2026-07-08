package X;

import Y.ALAdapterS23S0200000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19393710u7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(View view, Pair pair, Pair pair2, long j) {
        if (j <= 0) {
            view.dispatchTouchEvent(C19393810u8.LIZ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), 0));
            view.dispatchTouchEvent(C19393810u8.LIZ(((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue(), 2));
            view.dispatchTouchEvent(C19393810u8.LIZ(((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue(), 1));
        } else {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator<Pair<? extends Float, ? extends Float>>() { // from class: X.07Xn
                @Override // android.animation.TypeEvaluator
                public final Pair<? extends Float, ? extends Float> evaluate(float f, Pair<? extends Float, ? extends Float> pair3, Pair<? extends Float, ? extends Float> pair4) {
                    Pair<? extends Float, ? extends Float> pair5 = pair3;
                    Pair<? extends Float, ? extends Float> pair6 = pair4;
                    if (pair5 != null && pair6 != null) {
                        return new Pair<>(Float.valueOf(((pair6.getFirst().floatValue() - pair5.getFirst().floatValue()) * f) + pair5.getFirst().floatValue()), Float.valueOf(((pair6.getSecond().floatValue() - pair5.getSecond().floatValue()) * f) + pair5.getSecond().floatValue()));
                    }
                    return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
                }
            }, pair, pair2);
            valueAnimatorOfObject.addUpdateListener(new AUListenerS277S0100000_29(view, 65));
            valueAnimatorOfObject.addListener(new ALAdapterS23S0200000_29(view, pair2, 18));
            view.dispatchTouchEvent(C19393810u8.LIZ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), 0));
            valueAnimatorOfObject.setDuration(j);
            valueAnimatorOfObject.start();
        }
    }
}
