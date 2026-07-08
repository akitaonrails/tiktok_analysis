package X;

import Y.AfS191S0100000_22;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0nQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434460nQq implements InterfaceC2208121BbW {
    public final C1431070nLN LIZ;
    public final int LIZIZ;
    public C11JF LIZJ;
    public long LIZLLL;

    @Override // X.InterfaceC2208121BbW
    public final void LIZ(int i) {
    }

    @Override // X.InterfaceC2208121BbW
    public final int LIZIZ(int i) {
        return 0;
    }

    @Override // X.InterfaceC2208121BbW
    public final String getStringFromExtern(int i) {
        return "";
    }

    @Override // X.InterfaceC2208121BbW
    public final void onLog(int i, int i2, String str) {
    }

    public C1434460nQq(C1431070nLN c1431070nLN, int i) {
        this.LIZ = c1431070nLN;
        this.LIZIZ = i;
        if (i > 0) {
            this.LIZJ = (C11JF) C11NZ.LJJJJLI(i, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(new C19501611Rm(EnumC2272608vM.LL)).LJJLJLI(new AfS191S0100000_22(this, 32));
        }
        this.LIZLLL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC2208121BbW
    public final void LIZJ(int i, long j, C1431630nMH c1431630nMH) {
        this.LIZLLL = System.currentTimeMillis();
    }
}
