package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0Ehq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371760Ehq extends LinearLayout {
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public final Paint LL;
    public boolean LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.LLILLJJLI) {
            int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.dispatchDraw(canvas2);
            if (this.LLILLJJLI) {
                float width = getWidth() - LLILLL;
                this.LL.setShader(new LinearGradient(width, 0.0f, getWidth(), 0.0f, new int[]{-16777216, 0}, (float[]) null, Shader.TileMode.CLAMP));
                canvas2 = canvas2;
                canvas2.drawRect(width, 0.0f, getWidth(), getHeight(), this.LL);
            }
            canvas2.restoreToCount(iSaveLayer);
            return;
        }
        super.dispatchDraw(canvas2);
    }

    public C371760Ehq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(5);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LL = paint;
        if (Build.VERSION.SDK_INT >= 28) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[PHI: r2
      0x0093: PHI (r2v2 int) = (r2v1 int), (r2v7 int) binds: [B:21:0x0088, B:13:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            super.onLayout(r9, r10, r11, r12, r13)
            int r0 = r8.getOrientation()
            r4 = 0
            if (r0 != 0) goto L9f
            X.09RD r0 = new X.09RD
            r0.<init>(r8)
            java.util.Iterator r7 = r0.iterator()
            r3 = 0
        L14:
            r1 = r7
            X.09RE r1 = (X.C09RE) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r5 = r1.next()
            android.view.View r5 = (android.view.View) r5
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 == 0) goto L6f
            r6 = r5
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r2 = r6.getMeasuredWidth()
            android.text.TextPaint r1 = r6.getPaint()
            java.lang.CharSequence r0 = r6.getText()
            java.lang.String r0 = r0.toString()
            float r0 = r1.measureText(r0)
            int r1 = (int) r0
            int r0 = r6.getPaddingStart()
            int r1 = r1 + r0
            int r0 = r6.getPaddingEnd()
            int r1 = r1 + r0
            int r2 = java.lang.Math.max(r2, r1)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L6d
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
        L5b:
            int r2 = r2 + r0
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L93
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
        L6a:
            int r2 = r2 + r0
            int r3 = r3 + r2
            goto L14
        L6d:
            r0 = 0
            goto L5b
        L6f:
            int r2 = r5.getMeasuredWidth()
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L91
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
        L81:
            int r2 = r2 + r0
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L93
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
            goto L6a
        L91:
            r0 = 0
            goto L81
        L93:
            r0 = 0
            goto L6a
        L95:
            int r0 = r8.getWidth()
            if (r3 <= r0) goto L9c
            r4 = 1
        L9c:
            r8.LLILLJJLI = r4
            return
        L9f:
            r8.LLILLJJLI = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C371760Ehq.onLayout(boolean, int, int, int, int):void");
    }
}
