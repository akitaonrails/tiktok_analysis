package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0OtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633670OtJ extends FrameLayout {
    public InterfaceC633700OtM LL;

    public final InterfaceC633700OtM getDispatchTouchEventListener() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC633700OtM interfaceC633700OtM = this.LL;
        if (interfaceC633700OtM != null) {
            interfaceC633700OtM.LIZ();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDispatchTouchEventListener(InterfaceC633700OtM interfaceC633700OtM) {
        this.LL = interfaceC633700OtM;
    }

    public C633670OtJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
