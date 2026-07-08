package Y;

import X.C2212931BjH;
import X.C2248181Cz2;
import X.InterfaceC2248191Cz3;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes35.dex */
public class ATListenerS466S0100000_34 implements View.OnTouchListener {
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

    public ATListenerS466S0100000_34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS466S0100000_34 aTListenerS466S0100000_34, View view, MotionEvent motionEvent) {
        if (((C2212931BjH) aTListenerS466S0100000_34.l0).getTouchDelegate() != null && ((C2212931BjH) aTListenerS466S0100000_34.l0).getTouchDelegate().onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS466S0100000_34 aTListenerS466S0100000_34, View view, MotionEvent motionEvent) {
        C2248181Cz2 c2248181Cz2 = (C2248181Cz2) aTListenerS466S0100000_34.l0;
        c2248181Cz2.getClass();
        if (motionEvent.getActionMasked() == 4) {
            InterfaceC2248191Cz3 interfaceC2248191Cz3 = c2248181Cz2.LLIZ;
            if (interfaceC2248191Cz3 != null) {
                interfaceC2248191Cz3.LIZIZ(c2248181Cz2, motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
