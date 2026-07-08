package Y;

import X.C14AD;
import X.C14AS;
import X.C20221014Ae;
import X.C20221114Af;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment;

/* JADX INFO: loaded from: classes31.dex */
public class ATListenerS462S0100000_30 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS462S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS462S0100000_30 aTListenerS462S0100000_30, View view, MotionEvent motionEvent) {
        C20221114Af c20221114Af = ((C14AS) aTListenerS462S0100000_30.l0).LJI;
        if (c20221114Af != null) {
            c20221114Af.LIZ(motionEvent);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$1(ATListenerS462S0100000_30 aTListenerS462S0100000_30, View view, MotionEvent motionEvent) {
        C20221014Ae c20221014Ae = ((C14AD) aTListenerS462S0100000_30.l0).LLJJIJIL;
        if (c20221014Ae != null) {
            c20221014Ae.LIZ(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS462S0100000_30 aTListenerS462S0100000_30, View view, MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = ((NativeCameraPictureTakingFragment) aTListenerS462S0100000_30.l0).LLJLILLLLZIIL;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }
}
