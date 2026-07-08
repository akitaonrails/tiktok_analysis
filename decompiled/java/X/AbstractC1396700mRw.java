package X;

import X.C1384310m7x;
import android.graphics.Bitmap;
import android.graphics.Paint;
import com.bytedance.common.meteor.render.newcache.BitmapCacheManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0mRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1396700mRw<T extends C1384310m7x> extends AbstractC1396720mRy<T> implements InterfaceC1396670mRt {
    public Bitmap LLJILLL;
    public boolean LLJJI;
    public int LLJJIJI;
    public final Paint LLJJ = new Paint();
    public boolean LLJJIII = true;

    @Override // X.AbstractC1396720mRy
    public void LJIL(C1384750m8f c1384750m8f) {
    }

    public abstract String LJJIL(C1384750m8f c1384750m8f);

    @Override // X.AbstractC1396720mRy
    public void LJJII() {
        super.LJJII();
        if (!this.LLJJI) {
            Bitmap bitmap = this.LLJILLL;
            if (bitmap != null) {
                this.LLJILLL = null;
                synchronized (this) {
                    try {
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        this.LLJJIII = true;
        BitmapCacheManager.LIZ(this.LLJILJILJ);
        this.LLJILJILJ = null;
        int i = this.LLJJIJI;
        if (i > 0) {
            C1396730mRz c1396730mRz = BitmapCacheManager.LJ.get(BitmapCacheManager.LIZLLL);
            if (c1396730mRz != null) {
                int i2 = c1396730mRz.LJFF;
                if (i2 >= i) {
                    i = i2;
                }
                c1396730mRz.LJFF = i;
            }
            this.LLJJIJI = 0;
        }
    }

    @Override // X.AbstractC1396720mRy
    public void LJJ(C1384750m8f c1384750m8f) {
        C1396750mS1 c1396750mS1;
        C1396750mS1 c1396750mS12;
        Bitmap bitmap;
        if (c1384750m8f.LIZLLL.LJIIL) {
            this.LLJJI = true;
            if (this.LLJILJILJ != null && (c1396750mS1 = this.LLJILJILJ) != null && c1396750mS1.LIZIZ != null && ((c1396750mS12 = this.LLJILJILJ) == null || (bitmap = c1396750mS12.LIZIZ) == null || !bitmap.isRecycled())) {
                T tLJ = LJ();
                if (tLJ != null && tLJ.LJIIJ) {
                    BitmapCacheManager.LIZ(this.LLJILJILJ);
                    this.LLJILJILJ = null;
                    BitmapCacheManager.LIZLLL(this, c1384750m8f, true);
                    return;
                }
                return;
            }
            this.LLJILJILJ = null;
            BitmapCacheManager.LIZLLL(this, c1384750m8f, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // X.AbstractC1396720mRy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.graphics.Canvas r7, X.C1384750m8f r8) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1396700mRw.LIZLLL(android.graphics.Canvas, X.0m8f):void");
    }

    @Override // X.AbstractC1396720mRy
    /* JADX INFO: renamed from: LJJIZ, reason: merged with bridge method [inline-methods] */
    public void LJIJI(T t, C1384750m8f c1384750m8f) {
        t.LJIIJ = true;
    }
}
