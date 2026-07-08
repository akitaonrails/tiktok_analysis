package X;

import Y.ARunnableS125S0100000_25;
import Y.ARunnableS94S0200000_25;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0tvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684170tvb extends AbstractC447090Hg3 {
    public final InterfaceC1320200kSY<?> LIZ;
    public final C05AR LIZIZ;

    @Override // X.C0HWE, X.InterfaceC589510NAf
    public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
        if (abstractC1321260kUG != null) {
            final float progress = abstractC1321260kUG.getProgress();
            C1670540tZc.LIZIZ.execute(new Runnable() { // from class: X.0tvc
                @Override // java.lang.Runnable
                public final void run() {
                    C1684170tvb c1684170tvb = this.LL;
                    float f = progress;
                    C1C7U.LIZ("FrescoBitmapSubscribe@1d9.onProgressUpdate$1L");
                    c1684170tvb.LIZIZ.onProgress(f);
                    C1C7U.LIZIZ("FrescoBitmapSubscribe@1d9.onProgressUpdate$1L");
                }
            });
        }
    }

    @Override // X.C0HWE, X.InterfaceC589510NAf
    public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
        if (abstractC1321260kUG == null) {
            return;
        }
        abstractC1321260kUG.close();
        C1670540tZc.LIZIZ.execute(new ARunnableS125S0100000_25(this, 74));
    }

    @Override // X.C0HWE
    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        Throwable thLIZLLL;
        if (interfaceC1320200kSY != null && (thLIZLLL = interfaceC1320200kSY.LIZLLL()) != null) {
            C1670540tZc.LIZIZ.execute(new ARunnableS94S0200000_25(this, thLIZLLL, 19));
        }
    }

    @Override // X.AbstractC447090Hg3
    public final void LJI(Bitmap bitmap) {
        if (this.LIZ.LIZ() && bitmap != null && !bitmap.isRecycled()) {
            try {
                this.LIZ.close();
                C1670540tZc.LIZIZ.execute(new ARunnableS94S0200000_25(this, bitmap, 20));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1322200kVm.LIZ().LIZIZ();
                System.gc();
                C1670540tZc.LIZIZ.execute(new ARunnableS125S0100000_25(this, 72));
                return;
            }
        }
        C1670540tZc.LIZIZ.execute(new ARunnableS125S0100000_25(this, 73));
    }

    public C1684170tvb(InterfaceC1320200kSY<?> interfaceC1320200kSY, C05AR c05ar) {
        this.LIZ = interfaceC1320200kSY;
        this.LIZIZ = c05ar;
    }
}
