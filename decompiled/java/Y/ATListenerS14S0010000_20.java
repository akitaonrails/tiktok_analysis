package Y;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldSlotDrag;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorSlotDrag;

/* JADX INFO: loaded from: classes21.dex */
public class ATListenerS14S0010000_20 implements View.OnTouchListener {
    public final int $t;
    public boolean z0;

    public static final boolean onTouch$2(ATListenerS14S0010000_20 aTListenerS14S0010000_20, View view, MotionEvent motionEvent) {
        boolean z = aTListenerS14S0010000_20.z0;
        int i = LynxFoldSlotDrag.LLILLL;
        return !z;
    }

    public static final boolean onTouch$3(ATListenerS14S0010000_20 aTListenerS14S0010000_20, View view, MotionEvent motionEvent) {
        boolean z = aTListenerS14S0010000_20.z0;
        int i = LynxUIScrollCoordinatorSlotDrag.LLILLL;
        return !z;
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
            default:
                return false;
        }
    }

    public ATListenerS14S0010000_20(boolean z, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.z0 = z;
                break;
            default:
                this.z0 = z;
                break;
        }
    }

    public static final boolean onTouch$0(ATListenerS14S0010000_20 aTListenerS14S0010000_20, View view, MotionEvent motionEvent) {
        return !aTListenerS14S0010000_20.z0;
    }

    public static final boolean onTouch$1(ATListenerS14S0010000_20 aTListenerS14S0010000_20, View view, MotionEvent motionEvent) {
        return !aTListenerS14S0010000_20.z0;
    }
}
