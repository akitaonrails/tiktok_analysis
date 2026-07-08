package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0vUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744250vUV extends FrameLayout {
    public InterfaceC1744370vUh LL;

    public final InterfaceC1744370vUh getOnInterceptTouchEventListener() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC1744370vUh interfaceC1744370vUh = this.LL;
        if (interfaceC1744370vUh != null) {
            return interfaceC1744370vUh.LJI();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnInterceptTouchEventListener(InterfaceC1744370vUh interfaceC1744370vUh) {
        this.LL = interfaceC1744370vUh;
    }

    public C1744250vUV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
