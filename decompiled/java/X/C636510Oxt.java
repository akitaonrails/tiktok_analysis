package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Oxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636510Oxt extends FrameLayout implements InterfaceC619830OSv {
    public final C636510Oxt LL;
    public InterfaceC636520Oxu LLILLJJLI;
    public final C01GW LLILLL;

    public C636510Oxt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC619830OSv
    public void setDragPassthroughView(View view) {
    }

    public C636490Oxr getAntiShakeGestureHelper() {
        return (C636490Oxr) this.LLILLL.getValue();
    }

    public InterfaceC636520Oxu getGestureCallback() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC619830OSv
    public C636510Oxt getMsgContentView() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getGestureCallback() == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getGestureCallback() == null) {
            return super.onTouchEvent(motionEvent);
        }
        getAntiShakeGestureHelper().LIZIZ(motionEvent);
        return true;
    }

    @Override // X.InterfaceC619830OSv
    public void setDispatchView(View view) {
        getAntiShakeGestureHelper().LIZ().LLILZIL = view;
    }

    @Override // X.InterfaceC619830OSv
    public void setGestureCallback(InterfaceC636520Oxu interfaceC636520Oxu) {
        this.LLILLJJLI = interfaceC636520Oxu;
    }

    public C636510Oxt(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = this;
        this.LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 810));
    }
}
