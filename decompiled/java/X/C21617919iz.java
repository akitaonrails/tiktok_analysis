package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21617919iz extends AbstractC21579719cp {
    public C21618319j3 LLJJJ;
    public InterfaceC21618519j5 LLJJJIL;
    public final C21618719j7 LLJJJJ;
    public C21618219j2 LLJJJJJIL;
    public C21618119j1 LLJJJJLIIL;
    public long LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public long LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // X.AbstractC21579719cp
    public final void LJFF() {
    }

    @Override // X.AbstractC21579719cp
    public final void LJIIIIZZ() {
    }

    @Override // X.AbstractC21579719cp
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC21579719cp
    public final void LJIIJJI() {
    }

    @Override // X.AbstractC21579719cp
    public final void LJIIL() {
    }

    public final InterfaceC21619019jA getProgressListener() {
        return null;
    }

    public final InterfaceC21618919j9 getTimeListener() {
        return null;
    }

    public final void setProgressListener(InterfaceC21619019jA interfaceC21619019jA) {
    }

    public final void setTimeListener(InterfaceC21618919j9 interfaceC21618919j9) {
    }

    @Override // X.AbstractC21579719cp
    public final void LJI() {
        C21618219j2 c21618219j2 = this.LLJJJJJIL;
        if (c21618219j2 == null) {
            c21618219j2 = null;
        }
        Iterator<C20576715fR> it2 = c21618219j2.LIZIZ.iterator();
        while (it2.hasNext()) {
            C21619119jB c21619119jB = c21618219j2.LIZJ.get(it2.next());
            if (c21619119jB != null) {
                float x = c21619119jB.getX() - c21618219j2.LIZLLL.getScrollX();
                long j = c21618219j2.LIZLLL.LLJLIL;
                c21619119jB.LLILZLL = x;
                c21619119jB.LLIZLLLIL = j;
            }
        }
        C21618119j1 c21618119j1 = this.LLJJJJLIIL;
        C21618119j1 c21618119j12 = c21618119j1 != null ? c21618119j1 : null;
        AnonymousClass1204 anonymousClass1204 = c21618119j12.LIZ;
        float x2 = anonymousClass1204.getX() - c21618119j12.LIZIZ.getScrollX();
        long j2 = c21618119j12.LIZIZ.LLJLIL;
        anonymousClass1204.LLILZLL = x2;
        anonymousClass1204.LLIZLLLIL = j2;
        anonymousClass1204.LIZLLL(false);
    }

    @Override // X.AbstractC21579719cp
    public int getChildTotalWidth() {
        return ((int) (this.LLJJLIIIJLLLLLLLZ / this.LLJL)) + getWidth();
    }

    public final C21618319j3 getRulerLevel() {
        C21618319j3 c21618319j3 = this.LLJJJ;
        if (c21618319j3 != null) {
            return c21618319j3;
        }
        return null;
    }

    public final InterfaceC20576415fO getTrackApi() {
        return (InterfaceC20576415fO) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.AbstractC21579719cp
    public final void LJIIJ() {
        this.LLJLIL = (long) (getScrollX() * this.LLJL);
        if (getScrollX() == getChildTotalWidth() - getWidth()) {
            long j = this.LLJJL;
            long j2 = this.LLJLIL;
            if (j <= j2) {
                j = j2;
            }
            this.LLJLIL = j;
        }
        getTouchBlockEvent();
    }

    @Override // X.AbstractC21579719cp
    public int getScrollRange() {
        return Math.max(0, getChildTotalWidth() - getWidth());
    }

    public final InterfaceC21618519j5 getClipListener() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC21579719cp
    public final void LIZ(boolean z) {
        if (z) {
            LIZJ((int) (getScrollX() - 10.0f));
        } else {
            LIZJ((int) (getScrollX() + 10.0f));
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 2, getTrackX(), getTrackY(), 0).getX();
    }

    @Override // X.AbstractC21579719cp
    public final void LIZLLL(MotionEvent motionEvent) {
        motionEvent.getX();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C21618119j1 c21618119j1 = this.LLJJJJLIIL;
        if (c21618119j1 == null) {
            c21618119j1 = null;
        }
        c21618119j1.getClass();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void setClipListener(InterfaceC21618519j5 interfaceC21618519j5) {
        this.LLJJJIL = interfaceC21618519j5;
    }

    public final void setMainEnd(long j) {
        long j2 = this.LLJJLIIIJLLLLLLLZ;
        long j3 = this.LLJJL;
        if (j2 != j3 || j3 != j) {
            this.LLJJL = j;
            this.LLJJLIIIJLLLLLLLZ = j;
            LJIILIIL(this.LLJL, true);
            C21618119j1 c21618119j1 = this.LLJJJJLIIL;
            if (c21618119j1 == null) {
                c21618119j1 = null;
            }
            c21618119j1.LIZ.setTotalProgress(c21618119j1.LIZIZ.LLJJLIIIJLLLLLLLZ);
            c21618119j1.LIZ.LIZJ();
            c21618119j1.LIZIZ.requestLayout();
        }
    }

    public final void setRulerLevel(C21618319j3 c21618319j3) {
        this.LLJJJ = c21618319j3;
    }

    @Override // X.AbstractC21579719cp
    public void setTouchBlock(EnumC21579919cr enumC21579919cr) {
        super.setTouchBlock(enumC21579919cr);
        getTrackX();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19j7] */
    public C21617919iz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJJJ = new InterfaceC21620319jN() { // from class: X.19j7
            @Override // X.InterfaceC21620319jN
            public final long LIZ() {
                return this.LIZ.LLJJL;
            }

            @Override // X.InterfaceC21620319jN
            public final long LIZIZ() {
                return this.LIZ.LLJJLIIIJLLLLLLLZ;
            }
        };
        this.LLJJL = 300000L;
        this.LLJJLIIIJLLLLLLLZ = 300000L;
        this.LLJL = 1.0f;
        C0T83.LIZ(50.0f, getContext());
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3797));
        setRulerLevel(new C21618319j3(this.LLJL, getContext()));
        this.LLJJJJJIL = new C21618219j2(this);
        this.LLJJJJLIIL = new C21618119j1(this);
        this.LLJL = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED / C0T83.LIZ(50.0f, getContext());
    }

    @Override // X.AbstractC21579719cp
    public final void LJ(double d, double d2) {
        C21618119j1 c21618119j1 = this.LLJJJJLIIL;
        C21618119j1 c21618119j12 = null;
        if (c21618119j1 == null) {
            c21618119j1 = null;
        }
        c21618119j1.LIZIZ.getRulerLevel();
        LJIILIIL((float) (((double) this.LLJL) * (d / d2)), false);
        C21618119j1 c21618119j13 = this.LLJJJJLIIL;
        if (c21618119j13 != null) {
            c21618119j12 = c21618119j13;
        }
        c21618119j12.LIZIZ.getRulerLevel();
    }

    public final void LJIILIIL(float f, boolean z) {
        if (this.LLJL == f && !z) {
            return;
        }
        this.LLJL = Math.min(f, (this.LLJJLIIIJLLLLLLLZ * 1.0f) / (getWidth() / 3));
        getRulerLevel().LIZ(this.LLJL);
        C21618219j2 c21618219j2 = this.LLJJJJJIL;
        C21618119j1 c21618119j1 = null;
        if (c21618219j2 == null) {
            c21618219j2 = null;
        }
        Iterator<C20576715fR> it2 = c21618219j2.LIZIZ.iterator();
        while (it2.hasNext()) {
            C21619119jB c21619119jB = c21618219j2.LIZJ.get(it2.next());
            if (c21619119jB != null) {
                C21617919iz c21617919iz = c21618219j2.LIZLLL;
                c21619119jB.LIZLLL(c21617919iz.LLJL, c21617919iz.getRulerLevel().LIZIZ);
            }
        }
        C21618119j1 c21618119j12 = this.LLJJJJLIIL;
        if (c21618119j12 != null) {
            c21618119j1 = c21618119j12;
        }
        AnonymousClass1204 anonymousClass1204 = c21618119j1.LIZ;
        C21617919iz c21617919iz2 = c21618119j1.LIZIZ;
        float f2 = c21617919iz2.LLJL;
        long j = c21617919iz2.getRulerLevel().LIZIZ;
        anonymousClass1204.LLILZ = f2;
        anonymousClass1204.LLILZIL = j;
        anonymousClass1204.LIZJ();
        anonymousClass1204.invalidate();
        LIZJ((int) (this.LLJLIL / f));
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        super.onMeasure(i, i2);
        C21618219j2 c21618219j2 = this.LLJJJJJIL;
        C21618119j1 c21618119j1 = null;
        if (c21618219j2 == null) {
            c21618219j2 = null;
        }
        Iterator<C20576715fR> it2 = c21618219j2.LIZIZ.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            C21619119jB c21619119jB = c21618219j2.LIZJ.get(it2.next());
            if (c21619119jB != null) {
                c21619119jB.measure(i, i2);
                measuredHeight = c21619119jB.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            i3 += measuredHeight;
        }
        int size = View.MeasureSpec.getSize(i);
        c21618219j2.LIZLLL.setMeasuredDimension(size, i3);
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(i3));
        ((Number) pair.getFirst()).intValue();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        C21618119j1 c21618119j12 = this.LLJJJJLIIL;
        if (c21618119j12 != null) {
            c21618119j1 = c21618119j12;
        }
        c21618119j1.LIZ.measure(i, i2);
        Pair pair2 = new Pair(Integer.valueOf(c21618119j1.LIZ.getMeasuredWidth()), Integer.valueOf(c21618119j1.LIZ.getMeasuredHeight()));
        ((Number) pair2.getFirst()).intValue();
        setMeasuredDimension(View.MeasureSpec.getSize(i), iIntValue + ((Number) pair2.getSecond()).intValue() + C0EGK.LIZ(20));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C21618219j2 c21618219j2 = this.LLJJJJJIL;
        C21618119j1 c21618119j1 = null;
        if (c21618219j2 == null) {
            c21618219j2 = null;
        }
        Iterator<C20576715fR> it2 = c21618219j2.LIZIZ.iterator();
        while (it2.hasNext()) {
            C21619119jB c21619119jB = c21618219j2.LIZJ.get(it2.next());
            if (c21619119jB != null) {
                c21619119jB.setParentWidth(c21618219j2.LIZLLL.getWidth());
            }
        }
        C21618119j1 c21618119j12 = this.LLJJJJLIIL;
        if (c21618119j12 != null) {
            c21618119j1 = c21618119j12;
        }
        c21618119j1.LIZ.setParentWidth(c21618119j1.LIZIZ.getWidth());
    }

    @Override // X.AbstractC21579719cp, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C21618119j1 c21618119j1 = this.LLJJJJLIIL;
        C21618219j2 c21618219j2 = null;
        if (c21618119j1 == null) {
            c21618119j1 = null;
        }
        c21618119j1.LIZ.layout((c21618119j1.LIZIZ.getWidth() / 2) + c21618119j1.LIZ.getXOffset(), 0, (int) ((c21618119j1.LIZIZ.getWidth() / 2) + c21618119j1.LIZ.getXOffset() + c21618119j1.LIZ.getHopeWidth()), (int) c21618119j1.LIZ.getHopeHeight());
        C21618219j2 c21618219j22 = this.LLJJJJJIL;
        if (c21618219j22 != null) {
            c21618219j2 = c21618219j22;
        }
        Iterator<C20576715fR> it2 = c21618219j2.LIZIZ.iterator();
        while (it2.hasNext()) {
            C21619119jB c21619119jB = c21618219j2.LIZJ.get(it2.next());
            if (c21619119jB != null) {
                int xOffset = c21619119jB.getXOffset();
                int xOffset2 = (int) (c21619119jB.getXOffset() + c21619119jB.getHopeWidth());
                int hopeHeight = (int) (c21618219j2.LIZ + (r2.LIZIZ * (c21619119jB.getHopeHeight() + 2)));
                c21619119jB.layout(xOffset, hopeHeight, xOffset2, (int) (hopeHeight + c21619119jB.getHopeHeight()));
            }
        }
    }
}
