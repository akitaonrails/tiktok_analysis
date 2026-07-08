package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0RrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709030RrZ extends FrameLayout {
    public final int LL;
    public InterfaceC709040Rra LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final int[] LLJIJIL;
    public final int[] LLJILJIL;
    public InterfaceC709040Rra LLJILJILJ;
    public boolean LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public View LLJJIII;

    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C709030RrZ.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setHorizontalSwipeForwarder(InterfaceC709040Rra interfaceC709040Rra) {
        InterfaceC709040Rra interfaceC709040Rra2 = this.LLJILJILJ;
        this.LLILLJJLI = interfaceC709040Rra;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJILJILJ = null;
        this.LLJILLL = false;
        this.LLJJIII = null;
        if (interfaceC709040Rra2 != null && interfaceC709040Rra2 != interfaceC709040Rra) {
            interfaceC709040Rra2.LIZ();
        }
    }

    public C709030RrZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJIJIL = new int[2];
        this.LLJILJIL = new int[2];
    }

    public final boolean LIZ(InterfaceC709040Rra interfaceC709040Rra, MotionEvent motionEvent) {
        C0SLX c0slxTargetView;
        if (interfaceC709040Rra != null && (c0slxTargetView = interfaceC709040Rra.targetView()) != null) {
            return LIZIZ(motionEvent, c0slxTargetView);
        }
        this.LLIZLLLIL = false;
        InterfaceC709040Rra interfaceC709040Rra2 = this.LLJILJILJ;
        this.LLJILJILJ = null;
        if (interfaceC709040Rra2 != null) {
            interfaceC709040Rra2.LIZ();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean LIZIZ(MotionEvent motionEvent, View view) {
        if (!this.LLJILLL || this.LLJJIII != view) {
            getLocationOnScreen(this.LLJIJIL);
            view.getLocationOnScreen(this.LLJILJIL);
            int i = this.LLJIJIL[0];
            int[] iArr = this.LLJILJIL;
            this.LLJJ = i - iArr[0];
            this.LLJJI = r4[1] - iArr[1];
            this.LLJJIII = view;
            this.LLJILLL = true;
        }
        float f = this.LLJJ;
        float f2 = this.LLJJI;
        motionEvent.offsetLocation(f, f2);
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(-f, -f2);
        return zDispatchTouchEvent;
    }
}
