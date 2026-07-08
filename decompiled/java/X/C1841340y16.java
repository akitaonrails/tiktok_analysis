package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: X.0y16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841340y16 extends C0GR1 {
    public int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final Paint LJFF;
    public boolean LJI;
    public int LJII;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZIZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZIZ;
    }

    public /* synthetic */ C1841340y16(int i) {
        this(i, EnumC1841290y11.Medium);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LJI) {
            this.LJFF.setStyle(Paint.Style.FILL);
            this.LJFF.setColor(this.LJII);
            float f = this.LIZJ;
            canvas.drawCircle(f, f, this.LJ - this.LIZLLL, this.LJFF);
        }
        this.LJFF.setStyle(Paint.Style.STROKE);
        this.LJFF.setStrokeWidth(this.LIZLLL);
        this.LJFF.setColor(this.LIZ);
        float f2 = this.LIZJ;
        canvas.drawCircle(f2, f2, this.LJ - (this.LIZLLL / 2), this.LJFF);
    }

    public C1841340y16(int i, EnumC1841290y11 enumC1841290y11) {
        this.LIZ = i;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LJFF = paint;
        this.LJI = true;
        int i2 = C1841320y14.LIZ[enumC1841290y11.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.LIZIZ = C1841360y18.LIZ;
                this.LJ = C1841360y18.LIZIZ / 2.0f;
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LIZIZ = C1841360y18.LIZJ;
            this.LJ = C1841360y18.LIZLLL / 2.0f;
        }
        float f = this.LIZIZ;
        this.LIZJ = f / 2.0f;
        this.LIZLLL = f / 16.0f;
    }
}
