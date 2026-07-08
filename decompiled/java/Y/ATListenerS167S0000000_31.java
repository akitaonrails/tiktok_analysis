package Y;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes32.dex */
public class ATListenerS167S0000000_31 implements View.OnTouchListener {
    public final int $t;

    public static final boolean onTouch$0(ATListenerS167S0000000_31 aTListenerS167S0000000_31, View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onTouch$1(ATListenerS167S0000000_31 aTListenerS167S0000000_31, View view, MotionEvent motionEvent) {
        return true;
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

    public ATListenerS167S0000000_31(int i) {
        this.$t = i;
    }
}
