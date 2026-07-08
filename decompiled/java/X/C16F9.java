package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePublicScreenRemoveExtraCheckSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.16F9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16F9 extends SimpleLiveTextView {
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return false;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    private int getSpaceExtra() {
        if (getLineCount() == this.LLJL) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        int lineCount = getLineCount();
        this.LLJL = lineCount;
        this.LLJJLIIIJLLLLLLLZ = 0;
        int i = lineCount - 1;
        Layout layout = getLayout();
        if (i >= 0 && getMeasuredHeight() == layout.getHeight()) {
            Paint.FontMetricsInt fontMetricsInt = layout.getPaint().getFontMetricsInt();
            Rect rect = new Rect();
            this.LLJJLIIIJLLLLLLLZ = (rect.bottom - (fontMetricsInt.ascent - layout.getLineAscent(i))) - (getLineBounds(i, rect) + fontMetricsInt.bottom);
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // android.view.View
    public final void requestLayout() {
        super.requestLayout();
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLJLIL) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r1 <= r3.getLineRight(r2)) goto L13;
     */
    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.LLJLL
            if (r0 == 0) goto L4b
            int r1 = r7.getAction()
            r5 = 0
            r0 = 1
            if (r1 == r0) goto Le
            if (r1 != 0) goto L50
        Le:
            float r0 = r7.getX()
            int r4 = (int) r0
            float r0 = r7.getY()
            int r1 = (int) r0
            int r0 = r6.getTotalPaddingLeft()
            int r4 = r4 - r0
            int r0 = r6.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r6.getScrollX()
            int r4 = r4 + r0
            int r0 = r6.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r3 = r6.getLayout()
            int r2 = r3.getLineForVertical(r1)
            int r0 = r3.getLineCount()
            if (r2 > r0) goto L50
            float r1 = (float) r4
            float r0 = r3.getLineLeft(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L50
            float r0 = r3.getLineRight(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L50
        L4b:
            boolean r0 = super.onTouchEvent(r7)
            return r0
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16F9.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAlwaysInvalidate(boolean z) {
        this.LLJLIL = z;
    }

    public void setNeedCheckTouchInTextArea(boolean z) {
        this.LLJLL = z;
    }

    public C16F9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int spaceExtra;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.LLJLILLLLZIIL) {
            spaceExtra = 0;
        } else {
            spaceExtra = getSpaceExtra();
        }
        setMeasuredDimension(measuredWidth, measuredHeight - spaceExtra);
    }

    public C16F9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJLILLLLZIIL = LivePublicScreenRemoveExtraCheckSetting.INSTANCE.getValue();
    }
}
