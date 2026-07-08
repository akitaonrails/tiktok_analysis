package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315930kLf {
    public final Bitmap LIZ;
    public final InterfaceC1316400kMQ LIZIZ;
    public final Drawable LIZJ;
    public final boolean LIZLLL;
    public float LJ = 1.0f;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final Paint LJIIIZ;
    public final Rect LJIIJ;
    public Rect LJIIJJI;

    public final Bitmap LIZ() {
        if (this.LIZLLL) {
            return this.LIZ;
        }
        Drawable drawable = this.LIZJ;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    public C1315930kLf(C1315970kLj c1315970kLj) {
        this.LIZIZ = c1315970kLj;
        Bitmap bitmap = c1315970kLj.LIZIZ;
        if (bitmap != null) {
            this.LIZ = bitmap;
            this.LIZLLL = true;
            Paint paint = new Paint();
            this.LJIIIZ = paint;
            paint.setAntiAlias(true);
            this.LJIIJ = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            return;
        }
        Drawable drawable = c1315970kLj.LIZJ;
        if (drawable == null) {
            return;
        }
        this.LIZJ = drawable;
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        if (this.LIZLLL) {
            if (this.LJIIJJI == null) {
                this.LJIIJJI = new Rect();
            }
            if (this.LJFF != i || this.LJIIIIZZ != i3 || this.LJI != i2 || this.LJII != i4) {
                this.LJIIJJI.set(i, i2, i3, i4);
            }
            this.LJFF = i;
            this.LJI = i2;
            this.LJIIIIZZ = i3;
            this.LJII = i4;
            return;
        }
        this.LIZJ.setBounds(i, i2, i3, i4);
    }
}
