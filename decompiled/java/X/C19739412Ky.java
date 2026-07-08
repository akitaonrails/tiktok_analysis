package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.12Ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19739412Ky extends FrameLayout {
    public InterfaceC19739512Kz LL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC19739512Kz interfaceC19739512Kz = this.LL;
        if (interfaceC19739512Kz != null) {
            interfaceC19739512Kz.LJJJJ(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC19739512Kz interfaceC19739512Kz = this.LL;
        if (interfaceC19739512Kz != null) {
            interfaceC19739512Kz.LIZ();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIntercepter(InterfaceC19739512Kz interfaceC19739512Kz) {
        this.LL = interfaceC19739512Kz;
    }

    public C19739412Ky(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
