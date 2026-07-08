package Y;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class ATListenerS9S0100002_6 implements View.OnTouchListener {
    public final int $t;
    public float f1;
    public float f2;
    public Object l0;

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

    public ATListenerS9S0100002_6(float f, View view, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = view;
            this.f1 = 0.75f;
            this.f2 = f;
        } else {
            this.l0 = view;
            this.f1 = 0.75f;
            this.f2 = f;
        }
    }

    public static final boolean onTouch$0(ATListenerS9S0100002_6 aTListenerS9S0100002_6, View view, MotionEvent motionEvent) {
        View view2 = (View) aTListenerS9S0100002_6.l0;
        float f = aTListenerS9S0100002_6.f1;
        float f2 = aTListenerS9S0100002_6.f2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            view2.animate().alpha(f2).setDuration(150L).start();
            return false;
        }
        view2.animate().alpha(f).setDuration(150L).start();
        return false;
    }

    public static final boolean onTouch$1(ATListenerS9S0100002_6 aTListenerS9S0100002_6, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            ((View) aTListenerS9S0100002_6.l0).animate().alpha(aTListenerS9S0100002_6.f2).setDuration(150L).start();
            return false;
        }
        ((View) aTListenerS9S0100002_6.l0).animate().alpha(aTListenerS9S0100002_6.f1).setDuration(150L).start();
        return false;
    }
}
