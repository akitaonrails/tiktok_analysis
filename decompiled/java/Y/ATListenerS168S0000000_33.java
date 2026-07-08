package Y;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public class ATListenerS168S0000000_33 implements View.OnTouchListener {
    public final int $t;

    public static final boolean onTouch$0(ATListenerS168S0000000_33 aTListenerS168S0000000_33, View view, MotionEvent motionEvent) {
        return false;
    }

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

    public ATListenerS168S0000000_33(int i) {
        this.$t = i;
    }

    public static final boolean onTouch$1(ATListenerS168S0000000_33 aTListenerS168S0000000_33, View view, MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
            return false;
        }
        return false;
    }
}
