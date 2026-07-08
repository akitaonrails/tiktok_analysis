package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Ead, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367290Ead extends View {
    public final Paint LL;
    public final float LLILLJJLI;
    public final float LLILLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = this.LLILLJJLI;
        float f2 = width - (1.5f * f);
        float f3 = height - f;
        float f4 = 2;
        float f5 = this.LLILLJJLI / f4;
        float f6 = f2 / f4;
        RectF rectF = new RectF(f5, f5, f6, f5 + f3);
        float f7 = this.LLILLL;
        float[] fArr = {f7, f7, 0.0f, 0.0f, 0.0f, 0.0f, f7, f7};
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, this.LL);
        float f8 = this.LLILLJJLI;
        float f9 = f3 / f4;
        RectF rectF2 = new RectF(f6 + f8, f8 / f4, f8 + f2, f9);
        float f10 = this.LLILLL;
        float[] fArr2 = {0.0f, 0.0f, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        Path path2 = new Path();
        path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        canvas.drawPath(path2, this.LL);
        float f11 = this.LLILLJJLI;
        RectF rectF3 = new RectF(f6 + f11, f9 + f11, f2 + f11, f3 + (f11 / f4));
        float f12 = this.LLILLL;
        float[] fArr3 = {0.0f, 0.0f, 0.0f, 0.0f, f12, f12, 0.0f, 0.0f};
        Path path3 = new Path();
        path3.addRoundRect(rectF3, fArr3, Path.Direction.CW);
        canvas.drawPath(path3, this.LL);
    }

    public C367290Ead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LL = paint;
        this.LLILLJJLI = 4.0f;
        this.LLILLL = 10.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundedSplitView, 0, 0);
        try {
            paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.RoundedSplitView_shapeColor, -3355444));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
