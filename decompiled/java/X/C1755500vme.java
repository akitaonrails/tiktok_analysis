package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0vme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755500vme extends FrameLayout {
    public boolean LL;
    public float LLILLJJLI;
    public int LLILLL;
    public InterfaceC1755510vmf LLILZ;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC1755510vmf interfaceC1755510vmf;
        InterfaceC1755510vmf interfaceC1755510vmf2 = this.LLILZ;
        if (interfaceC1755510vmf2 != null && interfaceC1755510vmf2.LIZ()) {
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILLL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    this.LLILLJJLI = motionEvent.getX();
                    motionEvent.getY();
                    this.LL = false;
                    InterfaceC1755510vmf interfaceC1755510vmf3 = this.LLILZ;
                    if (interfaceC1755510vmf3 != null) {
                        interfaceC1755510vmf3.LJI();
                    }
                } else if (numValueOf.intValue() == 2) {
                    if (Math.abs(this.LLILLJJLI - motionEvent.getX()) >= this.LLILLL) {
                        this.LL = false;
                    }
                } else if (numValueOf.intValue() == 1) {
                    this.LL = true;
                    if (Math.abs(this.LLILLJJLI - motionEvent.getX()) < this.LLILLL && (interfaceC1755510vmf = this.LLILZ) != null) {
                        interfaceC1755510vmf.LIZIZ();
                    }
                    InterfaceC1755510vmf interfaceC1755510vmf4 = this.LLILZ;
                    if (interfaceC1755510vmf4 != null) {
                        interfaceC1755510vmf4.LIZJ();
                    }
                }
            }
            return this.LL;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setListener(InterfaceC1755510vmf interfaceC1755510vmf) {
        this.LLILZ = interfaceC1755510vmf;
    }

    public C1755500vme(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = 80;
    }
}
