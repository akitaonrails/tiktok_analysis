package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Epo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376700Epo extends Drawable {
    public final Context LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final C01GW LJ;
    public final Paint LJFF;
    public final Paint LJI;
    public final Paint LJII;
    public BitmapShader LJIIIIZZ;
    public final Matrix LJIIIZ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return C814420VxA.LIZIZ(this.LIZIZ * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty()) {
            return;
        }
        this.LJFF.setStrokeWidth(this.LIZJ);
        this.LJI.setStrokeWidth(this.LIZJ);
        this.LJII.setStrokeWidth(this.LIZLLL);
        float fExactCenterX = getBounds().exactCenterX();
        float fExactCenterY = getBounds().exactCenterY();
        float f = 2;
        canvas.drawCircle(fExactCenterX, fExactCenterY, this.LIZIZ - (this.LIZJ / f), this.LJFF);
        canvas.drawCircle(fExactCenterX, fExactCenterY, this.LIZIZ - (this.LIZJ / f), this.LJI);
        float f2 = this.LIZIZ;
        float f3 = f2 - this.LIZJ;
        float f4 = this.LIZLLL;
        canvas.drawCircle(fExactCenterX, fExactCenterY, f2 - (f4 / 2.0f), this.LJII);
        canvas.drawCircle(fExactCenterX, fExactCenterY, f3 + (f4 / 2.0f), this.LJII);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_mosaic;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ze, (Context) this.LJ.getValue());
        Bitmap bitmapLIZIZ = C376710Epp.LIZIZ(c419910GdJ.LIZ((Context) this.LJ.getValue()));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapLIZIZ, tileMode, tileMode);
        this.LJIIIIZZ = bitmapShader;
        this.LJI.setShader(bitmapShader);
        this.LJIIIZ.reset();
        float f = iLIZIZ;
        this.LJIIIZ.setTranslate(-(getBounds().exactCenterX() % f), -(getBounds().exactCenterY() % f));
        BitmapShader bitmapShader2 = this.LJIIIIZZ;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(this.LJIIIZ);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJI.setAlpha(i);
        this.LJII.setAlpha(i);
        this.LJFF.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJI.setColorFilter(colorFilter);
        this.LJII.setColorFilter(colorFilter);
        this.LJFF.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C376700Epo(Context context, float f, float f2, float f3) {
        this.LIZ = context;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 527));
        this.LJ = c01gwLIZIZ;
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, (Context) c01gwLIZIZ.getValue());
        if (numLIZJ != null) {
            paint.setColor(numLIZJ.intValue());
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        this.LJFF = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.BUTT);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setDither(true);
        this.LJI = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setDither(true);
        this.LJII = paint3;
        this.LJIIIZ = new Matrix();
    }
}
