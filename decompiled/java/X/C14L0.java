package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.14L0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14L0 extends View {
    public final List<String> LL;
    public Paint LLILLJJLI;
    public final Rect LLILLL;
    public InterfaceC1201910hNl LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILLJJLI == null) {
            Paint paint = new Paint();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ != null) {
                paint.setColor(numLIZJ.intValue());
            }
            paint.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LJ(11)));
            this.LLILLJJLI = paint;
        }
        Paint paint2 = this.LLILLJJLI;
        if (paint2 == null) {
            return;
        }
        int i = 0;
        for (String str : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                float fMeasureText = (this.LLILZLL / 2.0f) - (paint2.measureText(str2) / 2.0f);
                paint2.getTextBounds(str2, 0, str2.length(), this.LLILLL);
                int iHeight = this.LLILLL.height();
                float f = this.LLILZIL;
                float f2 = (f / 2.0f) + (iHeight / 2.0f) + (i * f) + this.LLJ;
                if (canvas != null) {
                    canvas.drawText(str2, fMeasureText, f2, paint2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r1 = r5.getAction()
            r3 = 1
            if (r1 == 0) goto L11
            if (r1 == r3) goto L3d
            r0 = 2
            if (r1 == r0) goto L11
        L10:
            return r3
        L11:
            float r1 = r5.getY()
            int r0 = r4.LLJ
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = r4.LLILZIL
            float r1 = r1 / r0
            int r2 = (int) r1
            if (r2 < 0) goto L10
            java.util.List<java.lang.String> r0 = r4.LL
            int r0 = r0.size()
            if (r2 >= r0) goto L10
            int r0 = r4.LLIZLLLIL
            if (r2 == r0) goto L10
            X.0hNl r1 = r4.LLILZ
            if (r1 == 0) goto L3a
            java.util.List<java.lang.String> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.t5(r0)
        L3a:
            r4.LLIZLLLIL = r2
            return r3
        L3d:
            r0 = -1
            r4.LLIZLLLIL = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14L0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLetterUpdateListener$nearby_release(InterfaceC1201910hNl interfaceC1201910hNl) {
        this.LLILZ = interfaceC1201910hNl;
    }

    public C14L0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C1697810uHb.LJIILJJIL("▲", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#");
        this.LLILLL = new Rect();
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        this.LLIZLLLIL = 5;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILZLL = getMeasuredWidth();
        float measuredHeight = (getMeasuredHeight() * 1.0f) / this.LL.size();
        this.LLILZIL = measuredHeight;
        int i5 = this.LLIZ;
        if (measuredHeight > i5) {
            this.LLILZIL = i5;
            this.LLJ = (int) (((getMeasuredHeight() * 1.0f) - (this.LLILZIL * this.LL.size())) / 2);
        }
    }
}
