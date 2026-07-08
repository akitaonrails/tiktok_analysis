package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1ATK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ATK {
    public final String LIZ;
    public final C1132380fZc LIZIZ;
    public InterfaceC2179811ASt LIZJ;
    public final int LIZLLL;
    public final C1ATM LJ;
    public final AtomicInteger LJFF;

    public C1ATK(String str, C1132380fZc c1132380fZc, InterfaceC2179811ASt interfaceC2179811ASt, C1ATM c1atm, int i) {
        int i2;
        if ((i & 8) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c1atm = (i & 16) != 0 ? new C1ATM(0L, false, 15) : c1atm;
        this.LIZ = str;
        this.LIZIZ = c1132380fZc;
        this.LIZJ = interfaceC2179811ASt;
        this.LIZLLL = i2;
        this.LJ = c1atm;
        this.LJFF = new AtomicInteger(0);
    }
}
