package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: X.0y15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841330y15 extends C0GR1 {
    public int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final int LJI;
    public final Paint LJII;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZIZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZIZ;
    }

    public /* synthetic */ C1841330y15(int i) {
        this(i, EnumC1841290y11.Medium);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LJII.setStyle(Paint.Style.FILL);
        this.LJII.setColor(this.LJI);
        float f = this.LIZJ;
        canvas.drawCircle(f, f, this.LIZLLL, this.LJII);
        this.LJII.setStyle(Paint.Style.STROKE);
        this.LJII.setStrokeWidth(this.LJFF);
        this.LJII.setColor(this.LIZ);
        float f2 = this.LIZJ;
        canvas.drawCircle(f2, f2, this.LJ - (this.LJFF / 2), this.LJII);
    }

    public C1841330y15(int i, EnumC1841290y11 enumC1841290y11) {
        this.LIZ = i;
        this.LJI = -1;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LJII = paint;
        int i2 = C1841310y13.LIZ[enumC1841290y11.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.LIZIZ = C1841360y18.LIZ;
                this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)) / 2.0f;
                this.LJ = C1841360y18.LIZIZ / 2.0f;
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LIZIZ = C1841360y18.LIZJ;
            this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) / 2.0f;
            this.LJ = C1841360y18.LIZLLL / 2.0f;
        }
        this.LIZJ = this.LIZIZ / 2.0f;
        this.LJFF = this.LJ - this.LIZLLL;
    }
}
