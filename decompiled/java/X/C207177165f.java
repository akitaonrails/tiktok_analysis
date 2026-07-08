package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.165f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207177165f extends C207179165h {
    public final Paint LLILZ;
    public final Path LLILZIL;
    public final PathMeasure LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    private final float getPathLength() {
        this.LLILZLL.setPath(this.LLILZIL, false);
        return this.LLILZLL.getLength();
    }

    public final boolean LIZIZ() {
        return getCoreAreaXRange().LIZJ(Double.valueOf((double) this.LLIZLLLIL)) && getCoreAreaYRange().LIZJ(Double.valueOf((double) this.LLJ));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(0);
        canvas.drawPath(this.LLILZIL, this.LLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207177165f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C207177165f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LLILZ = paint;
        this.LLILZIL = new Path();
        this.LLILZLL = new PathMeasure();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(C341940Daq.LIZ(4.0d));
    }
}
