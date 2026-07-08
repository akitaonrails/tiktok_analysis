package Y;

import X.C1741940vQm;
import X.C19290410dS;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class ATListenerS447S0100000_14 implements View.OnTouchListener {
    public final int $t;
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

    public ATListenerS447S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS447S0100000_14 aTListenerS447S0100000_14, View view, MotionEvent motionEvent) {
        C1741940vQm.LIZ((Activity) aTListenerS447S0100000_14.l0);
        return false;
    }

    public static final boolean onTouch$1(ATListenerS447S0100000_14 aTListenerS447S0100000_14, View view, MotionEvent motionEvent) {
        ((C19290410dS) aTListenerS447S0100000_14.l0).LIZ(motionEvent);
        return true;
    }
}
