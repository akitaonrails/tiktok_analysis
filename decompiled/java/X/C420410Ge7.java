package X;

import Y.AAListenerS133S0300000_6;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ge7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420410Ge7 {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZIZ(AbstractC420810Gel abstractC420810Gel) {
        long j;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        if (C0RSD.LIZ()) {
            j = 100;
        } else {
            j = 150;
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(abstractC420810Gel, 144));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(abstractC420810Gel, 68));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(abstractC420810Gel, 67));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(abstractC420810Gel, 66));
        return valueAnimatorOfFloat;
    }

    public static Animator LIZ(AbstractC420810Gel abstractC420810Gel, Function2 function2) {
        long j;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        if (C0RSD.LIZ()) {
            j = 100;
        } else {
            j = 150;
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(abstractC420810Gel, 143));
        valueAnimatorOfFloat.addListener(new AAListenerS133S0300000_6(abstractC420810Gel, null, function2, 8));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(abstractC420810Gel, 65));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(abstractC420810Gel, 64));
        return valueAnimatorOfFloat;
    }
}
