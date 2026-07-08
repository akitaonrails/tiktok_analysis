package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0xzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1840270xzN extends FrameLayout {
    public InterfaceC1840280xzO LL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC1840280xzO interfaceC1840280xzO = this.LL;
        if (interfaceC1840280xzO != null) {
            interfaceC1840280xzO.LJJJJ(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1840280xzO interfaceC1840280xzO = this.LL;
        if (interfaceC1840280xzO != null) {
            interfaceC1840280xzO.LIZ();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIntercepter(InterfaceC1840280xzO interfaceC1840280xzO) {
        this.LL = interfaceC1840280xzO;
    }

    public C1840270xzN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
