package Y;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public class ATListenerS0S0110001_4 implements View.OnTouchListener {
    public final int $t;
    public float f2;
    public Object l0;
    public boolean z1;

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

    public ATListenerS0S0110001_4(int i) {
        this.$t = i;
    }

    public static final boolean onTouch$0(ATListenerS0S0110001_4 aTListenerS0S0110001_4, View view, MotionEvent motionEvent) {
        int scaledTouchSlop;
        if (((ViewConfiguration) aTListenerS0S0110001_4.l0) == null) {
            aTListenerS0S0110001_4.l0 = ViewConfiguration.get(view.getContext());
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    float y = motionEvent.getY() - aTListenerS0S0110001_4.f2;
                    if (!aTListenerS0S0110001_4.z1) {
                        float fAbs = Math.abs(y);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) aTListenerS0S0110001_4.l0;
                        if (viewConfiguration != null) {
                            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                        } else {
                            scaledTouchSlop = 0;
                        }
                        if (fAbs <= scaledTouchSlop) {
                            z = false;
                        }
                    }
                    aTListenerS0S0110001_4.z1 = z;
                    return false;
                }
            }
            if (aTListenerS0S0110001_4.z1) {
                aTListenerS0S0110001_4.z1 = false;
                return true;
            }
            aTListenerS0S0110001_4.z1 = false;
            return false;
        }
        aTListenerS0S0110001_4.f2 = motionEvent.getY();
        if (!view.canScrollVertically(-1) && !view.canScrollVertically(1)) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public static final boolean onTouch$1(ATListenerS0S0110001_4 aTListenerS0S0110001_4, View view, MotionEvent motionEvent) {
        int scaledTouchSlop;
        if (((ViewConfiguration) aTListenerS0S0110001_4.l0) == null) {
            aTListenerS0S0110001_4.l0 = ViewConfiguration.get(view.getContext());
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    float y = motionEvent.getY() - aTListenerS0S0110001_4.f2;
                    if (!aTListenerS0S0110001_4.z1) {
                        float fAbs = Math.abs(y);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) aTListenerS0S0110001_4.l0;
                        if (viewConfiguration != null) {
                            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                        } else {
                            scaledTouchSlop = 0;
                        }
                        if (fAbs <= scaledTouchSlop) {
                            z = false;
                        }
                    }
                    aTListenerS0S0110001_4.z1 = z;
                    return false;
                }
            }
            if (aTListenerS0S0110001_4.z1) {
                aTListenerS0S0110001_4.z1 = false;
                return true;
            }
            aTListenerS0S0110001_4.z1 = false;
            return false;
        }
        aTListenerS0S0110001_4.f2 = motionEvent.getY();
        if (!view.canScrollVertically(-1) && !view.canScrollVertically(1)) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
