package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0whV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790750whV extends FrameLayout {
    public InterfaceC1790780whY LL;
    public EnumC1779560wPS LLILLJJLI;
    public float LLILLL;
    public final float LLILZ;

    public final InterfaceC1790780whY getCallback() {
        return this.LL;
    }

    public C1790750whV(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = EnumC1779560wPS.LL;
        this.LLILZ = C418440Gaw.LIZIZ(2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2 && this.LLILLJJLI == EnumC1779560wPS.LL) {
                float y = motionEvent.getY();
                if (y - this.LLILLL > this.LLILZ) {
                    this.LLILLJJLI = EnumC1779560wPS.LLILLJJLI;
                    InterfaceC1790780whY interfaceC1790780whY = this.LL;
                    if (interfaceC1790780whY != null && interfaceC1790780whY.LIZ(motionEvent)) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                }
                if (y - this.LLILLL < (-this.LLILZ)) {
                    this.LLILLJJLI = EnumC1779560wPS.LLILLL;
                }
            }
        } else {
            this.LLILLJJLI = EnumC1779560wPS.LL;
            this.LLILLL = motionEvent.getY();
        }
        InterfaceC1790780whY interfaceC1790780whY2 = this.LL;
        if (interfaceC1790780whY2 != null && interfaceC1790780whY2.LIZ(motionEvent)) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCallback(InterfaceC1790780whY interfaceC1790780whY) {
        this.LL = interfaceC1790780whY;
    }
}
