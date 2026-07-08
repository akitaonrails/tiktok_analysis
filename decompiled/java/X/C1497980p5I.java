package X;

import Y.ARunnableS92S0200000_23;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: renamed from: X.0p5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497980p5I implements InterfaceC1497890p59 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ AbstractC1497970p5H LIZIZ;

    @Override // X.InterfaceC1497890p59
    public final void run() throws IOException {
        this.LIZIZ.LJ.flip();
        AbstractC1497970p5H abstractC1497970p5H = this.LIZIZ;
        long j = abstractC1497970p5H.LJFF;
        if (j != -1 && j - abstractC1497970p5H.LJI < abstractC1497970p5H.LJ.remaining()) {
            AbstractC1497970p5H abstractC1497970p5H2 = this.LIZIZ;
            Locale locale = Locale.getDefault();
            AbstractC1497970p5H abstractC1497970p5H3 = this.LIZIZ;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C786410Ut5.k4(locale, "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(abstractC1497970p5H3.LJI + ((long) abstractC1497970p5H3.LJ.remaining())), Long.valueOf(this.LIZIZ.LJFF)}));
            C1497900p5A c1497900p5A = ((C1498000p5K) abstractC1497970p5H2).LJIIJJI;
            c1497900p5A.getClass();
            c1497900p5A.LJJ(new C1497800p50("Exception received from UploadDataProvider", illegalArgumentException));
            return;
        }
        AbstractC1497970p5H abstractC1497970p5H4 = this.LIZIZ;
        ByteBuffer byteBuffer = abstractC1497970p5H4.LJ;
        C1498000p5K c1498000p5K = (C1498000p5K) abstractC1497970p5H4;
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            iWrite += c1498000p5K.LJIIIZ.write(byteBuffer);
        }
        c1498000p5K.LJIIJ.flush();
        abstractC1497970p5H4.LJI += (long) iWrite;
        AbstractC1497970p5H abstractC1497970p5H5 = this.LIZIZ;
        long j2 = abstractC1497970p5H5.LJI;
        long j3 = abstractC1497970p5H5.LJFF;
        if (j2 >= j3) {
            if (j3 != -1) {
                if (j3 != j2) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(C786410Ut5.k4(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.LIZIZ.LJI), Long.valueOf(this.LIZIZ.LJFF)}));
                    C1497900p5A c1497900p5A2 = ((C1498000p5K) abstractC1497970p5H5).LJIIJJI;
                    c1497900p5A2.getClass();
                    c1497900p5A2.LJJ(new C1497800p50("Exception received from UploadDataProvider", illegalArgumentException2));
                    return;
                }
                C1498000p5K c1498000p5K2 = (C1498000p5K) abstractC1497970p5H5;
                if (c1498000p5K2.LJIIIZ != null && c1498000p5K2.LJIIIIZZ.compareAndSet(false, true)) {
                    c1498000p5K2.LJIIIZ.close();
                }
                C1497900p5A c1497900p5A3 = c1498000p5K2.LJIIJJI;
                c1497900p5A3.getClass();
                new ARunnableS92S0200000_23(new C1497910p5B(c1497900p5A3), c1497900p5A3, 35);
                throw null;
            }
            if (this.LIZ) {
                C1498000p5K c1498000p5K3 = (C1498000p5K) abstractC1497970p5H5;
                if (c1498000p5K3.LJIIIZ != null && c1498000p5K3.LJIIIIZZ.compareAndSet(false, true)) {
                    c1498000p5K3.LJIIIZ.close();
                }
                C1497900p5A c1497900p5A4 = c1498000p5K3.LJIIJJI;
                c1497900p5A4.getClass();
                new ARunnableS92S0200000_23(new C1497910p5B(c1497900p5A4), c1497900p5A4, 35);
                throw null;
            }
        }
        abstractC1497970p5H5.LJ.clear();
        this.LIZIZ.LIZ.set(0);
        this.LIZIZ.LIZLLL(new InterfaceC1497890p59() { // from class: X.0p5M
            @Override // X.InterfaceC1497890p59
            public final void run() {
                AbstractC1497970p5H abstractC1497970p5H6 = this.LIZ.LIZIZ;
                abstractC1497970p5H6.LIZLLL.LIZIZ(abstractC1497970p5H6, abstractC1497970p5H6.LJ);
            }
        });
    }

    public C1497980p5I(AbstractC1497970p5H abstractC1497970p5H, boolean z) {
        this.LIZIZ = abstractC1497970p5H;
        this.LIZ = z;
    }
}
