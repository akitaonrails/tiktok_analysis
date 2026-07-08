package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0F4O, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4O extends View {
    public final Path LL;
    public final Path LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;

    private final int getMMaskColorLight() {
        int i = this.LLJ;
        return (((int) (((double) (i >>> 24)) * 0.6d)) << 24) | (16777215 & i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LLJI) {
            if (canvas != null) {
                this.LLILLL = canvas.getWidth();
                this.LLILZ = canvas.getHeight();
            }
            float f = 2;
            int iLIZ = C355430Dwb.LIZ(this.LLIZLLLIL / f);
            int iLIZ2 = C355430Dwb.LIZ(this.LLIZLLLIL / f);
            Path path = this.LL;
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, this.LLILZ);
            path.lineTo(this.LLILLL, this.LLILZ);
            path.lineTo(this.LLILLL, 0.0f);
            float f2 = (this.LLILLL - iLIZ) >> 1;
            float f3 = iLIZ;
            float f4 = f2 + f3;
            float f5 = (this.LLILZ - iLIZ2) >> 1;
            float f6 = iLIZ2;
            float f7 = f5 + f6;
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(f2, f5);
            path.lineTo(f4, f5);
            path.lineTo(f4, f7);
            path.lineTo(f2, f7);
            path.close();
            Path path2 = this.LLILLJJLI;
            path2.reset();
            float f8 = 3;
            float f9 = ((this.LLILLL - iLIZ) >> 1) + f8;
            float f10 = 6;
            float f11 = (f3 + f9) - f10;
            float f12 = ((this.LLILZ - iLIZ2) >> 1) + f8;
            float f13 = (f6 + f12) - f10;
            path2.setFillType(Path.FillType.EVEN_ODD);
            path2.moveTo(f9, f12);
            path2.lineTo(f11, f12);
            path2.lineTo(f11, f13);
            path2.lineTo(f9, f13);
            path2.close();
            this.LLJI = true;
        }
        if (this.LLJI && canvas != null) {
            canvas.drawPath(this.LL, this.LLILZIL);
            canvas.drawPath(this.LLILLJJLI, this.LLILZLL);
        }
    }

    public C0F4O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Path();
        this.LLILLJJLI = new Path();
        Paint paint = new Paint(1);
        this.LLILZIL = paint;
        Paint paint2 = new Paint(1);
        this.LLILZLL = paint2;
        this.LLIZ = -16711681;
        this.LLIZLLLIL = 1.0f;
        this.LLJ = 1157627904;
        this.LLJI = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CenterMaskView);
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.CenterMaskView_civLineColor, -16711681);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.CenterMaskView_civLineWidth, (1 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.CenterMaskView_civMaskColor, 1157627904);
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(getMMaskColorLight());
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(this.LLIZ);
        paint2.setStrokeWidth(this.LLIZLLLIL);
        paint2.setStyle(Paint.Style.STROKE);
    }
}
