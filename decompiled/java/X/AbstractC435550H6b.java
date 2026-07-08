package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0H6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC435550H6b extends C0H6M {
    public final C01GW LJFF;
    public final int LJI = 50;
    public final int LJII;
    public final int LJIIIIZZ;
    public Bitmap LJIIIZ;
    public Bitmap LJIIJ;
    public Bitmap LJIIJJI;
    public final int LJIIL;

    public abstract int LJIIJJI();

    public AbstractC435550H6b(Context context) {
        int iIntValue;
        this.LJFF = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 56));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LJII = iIntValue;
        this.LJIIIIZZ = 10;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cb, context);
        this.LJIIL = C2441009hQ.LJIIL(numLIZJ2 != null ? numLIZJ2.intValue() : 0, 150);
    }

    @Override // X.C0H6M
    public void LJII(Canvas canvas) {
        if (!LIZ() && C440480HPa.LIZJ()) {
            Bitmap bitmap = this.LJIIJJI;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            Bitmap bitmap2 = this.LJIIJ;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            }
            Bitmap bitmap3 = this.LJIIIZ;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        ((Drawable) this.LJFF.getValue()).draw(canvas);
    }

    @Override // X.C0H6M
    public void LJIIIIZZ(int i, int i2) {
        int i3;
        this.LIZ = i;
        this.LIZIZ = i2;
        if (LIZ()) {
            if (C440480HPa.LIZJ()) {
                i3 = (i * 9) / 25;
            } else {
                i3 = (i * 4) / 9;
            }
        } else if (C440480HPa.LIZJ()) {
            i3 = (i * 7) / 10;
        } else {
            i3 = (i * 7) / 9;
        }
        int i4 = i / 2;
        int i5 = i2 / 2;
        int i6 = i3 / 2;
        ((Drawable) this.LJFF.getValue()).setBounds(i4 - i6, i5 - i6, i4 + i6, i5 + i6);
        if (!LIZ() && C440480HPa.LIZJ()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            ((Drawable) this.LJFF.getValue()).draw(new Canvas(bitmapCreateBitmap));
            this.LJIIIZ = bitmapCreateBitmap;
            this.LJIIJJI = C435560H6c.LIZ(bitmapCreateBitmap, i, i2, this.LJIIL);
            this.LJIIJ = C435560H6c.LIZJ(i, i2, this.LJIIIIZZ, this.LJII, C435560H6c.LIZLLL(i, i2, this.LJII, C435560H6c.LIZIZ(this.LJI, this.LJII, bitmapCreateBitmap)));
        }
    }
}
