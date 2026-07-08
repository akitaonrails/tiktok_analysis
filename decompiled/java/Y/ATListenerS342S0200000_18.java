package Y;

import X.C1196900hFg;
import X.C1196960hFm;
import X.InterfaceC1392640mLO;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes19.dex */
public class ATListenerS342S0200000_18 implements View.OnTouchListener {
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

    public ATListenerS342S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS342S0200000_18 aTListenerS342S0200000_18, View view, MotionEvent motionEvent) {
        C1196900hFg c1196900hFg = (C1196900hFg) aTListenerS342S0200000_18.l0;
        InterfaceC1392640mLO interfaceC1392640mLO = c1196900hFg.LLILZIL;
        if (interfaceC1392640mLO != null) {
            c1196900hFg.LLIZLLLIL.LIZJ(motionEvent, interfaceC1392640mLO.Cf(), interfaceC1392640mLO.LJJLIIIJJIZ());
        }
        ((GestureDetector) aTListenerS342S0200000_18.l1).onTouchEvent(motionEvent);
        return false;
    }

    public static final boolean onTouch$1(ATListenerS342S0200000_18 aTListenerS342S0200000_18, View view, MotionEvent motionEvent) {
        C1196960hFm c1196960hFm = (C1196960hFm) aTListenerS342S0200000_18.l0;
        InterfaceC1392640mLO interfaceC1392640mLO = c1196960hFm.LLILZLL;
        if (interfaceC1392640mLO != null) {
            c1196960hFm.LLJLLIL.LIZJ(motionEvent, interfaceC1392640mLO.Cf(), interfaceC1392640mLO.LJJLIIIJJIZ());
        }
        ((GestureDetector) aTListenerS342S0200000_18.l1).onTouchEvent(motionEvent);
        return false;
    }
}
