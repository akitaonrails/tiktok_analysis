package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import avg.f;
import mf.a;

/* JADX INFO: renamed from: X.0Uxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789400Uxu extends ProgressBar {
    public InterfaceC19598211m0 LL;

    public final InterfaceC789410Uxv getClickListener() {
        return null;
    }

    public final InterfaceC789430Uxx getStatusView() {
        return null;
    }

    public final void setClickListener(InterfaceC789410Uxv interfaceC789410Uxv) {
    }

    public final void setStatusView(InterfaceC789430Uxx interfaceC789430Uxx) {
    }

    public final InterfaceC19598211m0 getListener() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 1)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setListener(InterfaceC19598211m0 interfaceC19598211m0) {
        this.LL = interfaceC19598211m0;
    }

    public C789400Uxu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0Uxw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        a aVar = new a(C1848410yCV.LIZ ? new f(onClickListener) : onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
