package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396750mS1 {
    public final Canvas LIZ = new Canvas();
    public volatile Bitmap LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI;
    public int LJII;

    public final void LIZ(int i, int i2) {
        Bitmap bitmap;
        if (this.LIZIZ != null && (bitmap = this.LIZIZ) != null && !bitmap.isRecycled() && i <= this.LIZJ && i2 <= this.LIZLLL) {
            Bitmap bitmap2 = this.LIZIZ;
            if (bitmap2 != null) {
                bitmap2.eraseColor(0);
            }
            this.LIZ.setBitmap(this.LIZIZ);
            this.LJ = i;
            this.LJFF = i2;
        }
        try {
            this.LJ = i;
            this.LJFF = i2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.LIZ.setBitmap(bitmapCreateBitmap);
            this.LIZJ = bitmapCreateBitmap.getWidth();
            this.LIZLLL = bitmapCreateBitmap.getHeight();
            this.LIZIZ = bitmapCreateBitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ = null;
            this.LJ = 0;
            this.LJFF = 0;
            this.LIZJ = 0;
            this.LIZLLL = 0;
        }
    }
}
