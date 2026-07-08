package Y;

import X.AnonymousClass1250;
import X.C19557511fR;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;

/* JADX INFO: loaded from: classes30.dex */
public class ATListenerS166S0000000_29 implements View.OnTouchListener {
    public final int $t;

    public static final boolean onTouch$0(ATListenerS166S0000000_29 aTListenerS166S0000000_29, View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onTouch$4(ATListenerS166S0000000_29 aTListenerS166S0000000_29, View view, MotionEvent motionEvent) {
        int i = C19557511fR.LJJLIIIJLLLLLLLZ;
        return true;
    }

    public static final boolean onTouch$5(ATListenerS166S0000000_29 aTListenerS166S0000000_29, View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onTouch$6(ATListenerS166S0000000_29 aTListenerS166S0000000_29, View view, MotionEvent motionEvent) {
        String str = StickerPropDetailFragment._pnsPageId;
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS166S0000000_29(int i) {
        this.$t = i;
    }

    public static final boolean onTouch$1(ATListenerS166S0000000_29 aTListenerS166S0000000_29, View view, MotionEvent motionEvent) {
        if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue() && view.isClickable()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            AnonymousClass1250.LIZ(view, false);
            return false;
        }
        AnonymousClass1250.LIZ(view, true);
        return false;
    }

    public static final boolean onTouch$2(ATListenerS166S0000000_29 aTListenerS166S0000000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            AnonymousClass1250.LIZLLL(view, false);
            return false;
        }
        AnonymousClass1250.LIZLLL(view, true);
        return false;
    }

    public static final boolean onTouch$3(ATListenerS166S0000000_29 aTListenerS166S0000000_29, View view, MotionEvent motionEvent) {
        if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            AnonymousClass1250.LIZLLL(view, false);
            return false;
        }
        AnonymousClass1250.LIZLLL(view, true);
        return false;
    }
}
