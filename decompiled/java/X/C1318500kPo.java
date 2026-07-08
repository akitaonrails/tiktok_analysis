package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318500kPo extends FrameLayout implements InterfaceC1318370kPb {
    public InterfaceC1318520kPq LL;
    public InterfaceC1318370kPb LLILLJJLI;
    public View LLILLL;

    public final InterfaceC1318520kPq getDispatchTouchInterceptor() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            InterfaceC1318520kPq interfaceC1318520kPq = this.LL;
            if (interfaceC1318520kPq != null) {
                interfaceC1318520kPq.LIZ(motionEvent);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDispatchTouchInterceptor(InterfaceC1318520kPq interfaceC1318520kPq) {
        this.LL = interfaceC1318520kPq;
    }

    public C1318500kPo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        InterfaceC1318370kPb interfaceC1318370kPb;
        if (this.LLILLL == view && (interfaceC1318370kPb = this.LLILLJJLI) != null) {
            interfaceC1318370kPb.onStopNestedScroll(view, i);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        InterfaceC1318370kPb interfaceC1318370kPb = this.LLILLJJLI;
        if (interfaceC1318370kPb != null) {
            interfaceC1318370kPb.onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        InterfaceC1318370kPb interfaceC1318370kPb;
        if (i == 2) {
            ViewParent parent = getParent();
            while (true) {
                if (parent != null) {
                    if (parent instanceof InterfaceC1318370kPb) {
                        interfaceC1318370kPb = (InterfaceC1318370kPb) parent;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    interfaceC1318370kPb = null;
                    break;
                }
            }
            this.LLILLJJLI = interfaceC1318370kPb;
            this.LLILLL = view2;
            if (interfaceC1318370kPb != null) {
                return interfaceC1318370kPb.onStartNestedScroll(view, view2, i, i2);
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        InterfaceC1318370kPb interfaceC1318370kPb = this.LLILLJJLI;
        if (interfaceC1318370kPb != null) {
            interfaceC1318370kPb.onNestedPreScroll(view, i, i2, iArr, i3);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        InterfaceC1318370kPb interfaceC1318370kPb = this.LLILLJJLI;
        if (interfaceC1318370kPb != null) {
            interfaceC1318370kPb.onNestedScroll(view, i, i2, i3, i4, i5);
        }
    }
}
