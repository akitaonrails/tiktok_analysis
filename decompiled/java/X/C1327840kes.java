package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327840kes extends AbstractRunnableC1328070kfF {
    public final /* synthetic */ C1327760kek LL;

    @Override // java.lang.Runnable
    public final void run() {
        C1323050kX9<AbstractC1327750kej> c1323050kX9;
        int i;
        C1C7U.LIZ("PostprocessorProducer$PostprocessorConsumer@c5c8.submitPostprocessing$1");
        synchronized (this.LL) {
            try {
                C1327760kek c1327760kek = this.LL;
                c1323050kX9 = c1327760kek.LJII;
                i = c1327760kek.LJIIIIZZ;
                c1327760kek.LJII = null;
                c1327760kek.LJIIIZ = false;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (C1323050kX9.LJIJJ(c1323050kX9)) {
            try {
                this.LL.LJIILJJIL(c1323050kX9, i);
                C1323050kX9.LJII(c1323050kX9);
            } catch (Throwable th) {
                C1323050kX9.LJII(c1323050kX9);
                throw th;
            }
        }
        this.LL.LJIIL();
        C1C7U.LIZIZ("PostprocessorProducer$PostprocessorConsumer@c5c8.submitPostprocessing$1");
    }

    public C1327840kes(C1327760kek c1327760kek, int i) {
        this.LL = c1327760kek;
    }
}
