package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import avg.f;
import mf.a;

/* JADX INFO: renamed from: X.0Uxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789440Uxy extends ProgressBar {
    public InterfaceC19598211m0 LL;
    public InterfaceC789470Uy1 LLILLJJLI;
    public InterfaceC789450Uxz LLILLL;

    public final InterfaceC789450Uxz getClickListener() {
        return this.LLILLL;
    }

    public final InterfaceC19598211m0 getListener() {
        return this.LL;
    }

    public final InterfaceC789470Uy1 getStatusView() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                InterfaceC789470Uy1 interfaceC789470Uy1 = this.LLILLJJLI;
                if (interfaceC789470Uy1 == null || interfaceC789470Uy1.getStatus() != 0) {
                    return false;
                }
            } else if (numValueOf.intValue() == 1) {
                InterfaceC789470Uy1 interfaceC789470Uy12 = this.LLILLJJLI;
                if (interfaceC789470Uy12 == null || interfaceC789470Uy12.getStatus() != 0) {
                    return false;
                }
                InterfaceC789450Uxz interfaceC789450Uxz = this.LLILLL;
                if (interfaceC789450Uxz != null) {
                    interfaceC789450Uxz.LJIIJJI(getId());
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setClickListener(InterfaceC789450Uxz interfaceC789450Uxz) {
        this.LLILLL = interfaceC789450Uxz;
    }

    public final void setListener(InterfaceC19598211m0 interfaceC19598211m0) {
        this.LL = interfaceC19598211m0;
    }

    public final void setStatusView(InterfaceC789470Uy1 interfaceC789470Uy1) {
        this.LLILLJJLI = interfaceC789470Uy1;
    }

    public C789440Uxy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0Uy0
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
