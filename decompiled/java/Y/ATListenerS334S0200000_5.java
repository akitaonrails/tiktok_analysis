package Y;

import X.C0EFK;
import X.C0EFL;
import X.C0EFM;
import X.C786410Ut5;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class ATListenerS334S0200000_5 implements View.OnTouchListener {
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

    public ATListenerS334S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS334S0200000_5 aTListenerS334S0200000_5, View view, MotionEvent motionEvent) {
        C0EFM c0efm;
        if (motionEvent.getActionMasked() == 0 && (c0efm = ((C0EFL) aTListenerS334S0200000_5.l0).LLILLJJLI) != null) {
            c0efm.LIZIZ((C0EFK) aTListenerS334S0200000_5.l1);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS334S0200000_5 aTListenerS334S0200000_5, View view, MotionEvent motionEvent) {
        C786410Ut5.LJLLLLLL(8, view);
        boolean zContains = ((Rect) aTListenerS334S0200000_5.l0).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        boolean zContains2 = ((Rect) aTListenerS334S0200000_5.l1).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (!zContains && !zContains2) {
            return false;
        }
        return true;
    }
}
