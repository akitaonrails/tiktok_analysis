package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0vmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755480vmc extends FrameLayout {
    public boolean LL;
    public float LLILLJJLI;
    public int LLILLL;
    public InterfaceC1755490vmd LLILZ;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC1755490vmd interfaceC1755490vmd;
        InterfaceC1755490vmd interfaceC1755490vmd2 = this.LLILZ;
        if (interfaceC1755490vmd2 != null && interfaceC1755490vmd2.LIZ()) {
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILLL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    this.LLILLJJLI = motionEvent.getX();
                    motionEvent.getY();
                    this.LL = false;
                    InterfaceC1755490vmd interfaceC1755490vmd3 = this.LLILZ;
                    if (interfaceC1755490vmd3 != null) {
                        interfaceC1755490vmd3.LJI();
                    }
                } else if (numValueOf.intValue() == 2) {
                    if (Math.abs(this.LLILLJJLI - motionEvent.getX()) >= this.LLILLL) {
                        this.LL = false;
                    }
                } else if (numValueOf.intValue() == 1) {
                    this.LL = true;
                    if (Math.abs(this.LLILLJJLI - motionEvent.getX()) < this.LLILLL && (interfaceC1755490vmd = this.LLILZ) != null) {
                        interfaceC1755490vmd.LIZIZ();
                    }
                    InterfaceC1755490vmd interfaceC1755490vmd4 = this.LLILZ;
                    if (interfaceC1755490vmd4 != null) {
                        interfaceC1755490vmd4.LIZJ();
                    }
                }
            }
            return this.LL;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setListener(InterfaceC1755490vmd interfaceC1755490vmd) {
        this.LLILZ = interfaceC1755490vmd;
    }

    public C1755480vmc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = 80;
    }
}
