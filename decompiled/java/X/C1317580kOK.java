package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0kOK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317580kOK extends FrameLayout {
    public int LL;
    public VelocityTracker LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public int LLJIJIL;

    public void setOnScrollListener(InterfaceC1317590kOL interfaceC1317590kOL) {
    }

    public final void LIZ(MotionEvent motionEvent) {
        int i = this.LLIZ;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex == -1) {
            this.LLIZ = -1;
        }
        if (i != -1 && iFindPointerIndex != -1) {
            float x = motionEvent.getX(iFindPointerIndex);
            float fAbs = Math.abs(x - this.LLILZ);
            float y = motionEvent.getY(iFindPointerIndex);
            float fAbs2 = Math.abs(y - this.LLILZIL);
            float f = this.LL;
            if (fAbs2 > f && fAbs2 > fAbs) {
                this.LLJI = true;
                this.LLILZ = x;
                this.LLILZIL = y;
            } else {
                if (fAbs <= f) {
                    return;
                }
                this.LLIZLLLIL = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r1 = r5.getAction()
            r3 = -1
            r0 = 3
            r2 = 0
            if (r1 == r0) goto L62
            r0 = 1
            if (r1 == r0) goto L62
            if (r1 == 0) goto L43
            boolean r0 = r4.LLIZLLLIL
            if (r0 != 0) goto L62
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L43
            r0 = 2
            if (r1 != r0) goto L2d
            int r0 = r4.LLIZ
            int r1 = r5.findPointerIndex(r0)
            if (r1 != r3) goto L23
            r4.LLIZ = r3
        L23:
            int r0 = r4.LLIZ
            if (r0 == r3) goto L2d
            r5.getY(r1)
            r4.LIZ(r5)
        L2d:
            boolean r0 = r4.LLJI
            if (r0 != 0) goto L40
            android.view.VelocityTracker r0 = r4.LLILLJJLI
            if (r0 != 0) goto L3b
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.LLILLJJLI = r0
        L3b:
            android.view.VelocityTracker r0 = r4.LLILLJJLI
            r0.addMovement(r5)
        L40:
            boolean r0 = r4.LLJI
            return r0
        L43:
            int r1 = r5.getActionIndex()
            int r0 = r5.getPointerId(r1)
            r4.LLIZ = r0
            if (r0 == r3) goto L2d
            float r0 = r5.getX(r1)
            r4.LLILZ = r0
            float r0 = r5.getY(r1)
            r4.LLILZIL = r0
            r4.LLILZLL = r0
            r4.LLJI = r2
            r4.LLIZLLLIL = r2
            goto L2d
        L62:
            r4.LLJI = r2
            r4.LLIZLLLIL = r2
            r4.LLIZ = r3
            android.view.VelocityTracker r0 = r4.LLILLJJLI
            if (r0 == 0) goto L72
            r0.recycle()
            r0 = 0
            r4.LLILLJJLI = r0
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1317580kOK.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1317580kOK.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C1317580kOK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LL = viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLILLL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLJ = (int) (getContext().getResources().getDisplayMetrics().density * 25.0f);
    }
}
