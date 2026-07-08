package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0iRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242680iRW extends ScrollView {
    public InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> LL;
    public InterfaceC1242690iRX LLILLJJLI;
    public float LLILLL;
    public float LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            InterfaceC1242690iRX interfaceC1242690iRX = this.LLILLJJLI;
            if (interfaceC1242690iRX != null) {
                interfaceC1242690iRX.LIZIZ((int) (x - this.LLILLL), (int) (y - this.LLILZ));
            }
            this.LLILLL = x;
            this.LLILZ = y;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnScrollChangedListener(InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        this.LL = interfaceC1631630sYr;
    }

    public final void setOnScrollListener(InterfaceC1242690iRX interfaceC1242690iRX) {
        this.LLILLJJLI = interfaceC1242690iRX;
    }

    public C1242680iRW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr = this.LL;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }
}
