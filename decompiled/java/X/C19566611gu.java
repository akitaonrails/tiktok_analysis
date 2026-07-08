package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.11gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19566611gu extends RelativeLayout implements InterfaceC19566811gw {
    public InterfaceC19566711gv LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC19566711gv interfaceC19566711gv;
        if (motionEvent.getAction() == 0 && (interfaceC19566711gv = this.LL) != null) {
            interfaceC19566711gv.OL(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC19566811gw
    public void setProfileTouchDownObserver(InterfaceC19566711gv interfaceC19566711gv) {
        this.LL = interfaceC19566711gv;
    }

    public C19566611gu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
