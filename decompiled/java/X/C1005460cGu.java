package X;

import Y.ARunnableS116S0100000_16;
import android.os.Looper;

/* JADX INFO: renamed from: X.0cGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005460cGu extends C1330860kjk {
    public final /* synthetic */ C0X9S LIZ;
    public final /* synthetic */ C1338960kwo LIZIZ;

    @Override // X.InterfaceC1330340kiu
    public final void LIZJ() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.LIZ.cancel();
        } else {
            this.LIZIZ.LIZ.execute(new ARunnableS116S0100000_16(this, 274));
        }
    }

    public C1005460cGu(C1338960kwo c1338960kwo, C0X9S c0x9s) {
        this.LIZIZ = c1338960kwo;
        this.LIZ = c0x9s;
    }
}
