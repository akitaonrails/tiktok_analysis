package Y;

import X.C1635890sfj;
import X.C1642620sqa;
import X.C786410Ut5;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class ATListenerS345S0200000_25 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS345S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS345S0200000_25 aTListenerS345S0200000_25, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((LinearLayout) aTListenerS345S0200000_25.l0, "backgroundColor", ((C1642620sqa) aTListenerS345S0200000_25.l1).LLILZ, 16777215);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            C786410Ut5.Pd(objectAnimatorOfInt);
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS345S0200000_25 aTListenerS345S0200000_25, View view, MotionEvent motionEvent) {
        ((Function0) aTListenerS345S0200000_25.l0).invoke();
        return ((C1635890sfj) aTListenerS345S0200000_25.l1).LIZIZ;
    }
}
