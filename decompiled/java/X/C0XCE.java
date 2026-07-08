package X;

import Y.ARunnableS82S0200000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0XCE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCE implements C0XD6 {
    public final long LIZ;
    public InterfaceC845020XCy LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final C844770XBz LIZLLL;

    public final void LIZIZ() {
        C844770XBz c844770XBz = this.LIZLLL;
        if (c844770XBz == null || c844770XBz.LJJIIZ) {
            C0XCJ.LIZIZ.LJIIIIZZ.LIZJ(this);
        } else {
            C0XCI.LJII(String.valueOf(c844770XBz.LIZ)).LJIIIIZZ.LIZJ(this);
        }
    }

    @Override // X.C0XD6
    public final void LIZ(C0XBN c0xbn) {
        C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS82S0200000_13(this, c0xbn, 48));
    }

    public C0XCE(long j, InterfaceC845020XCy interfaceC845020XCy, C844770XBz c844770XBz) {
        this.LIZ = j;
        this.LIZIZ = interfaceC845020XCy;
        this.LIZLLL = c844770XBz;
    }
}
