package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0kgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328670kgD {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final InterfaceC1330410kj1 LJ;

    public C1328670kgD(InterfaceC1330410kj1 interfaceC1330410kj1) {
        interfaceC1330410kj1.getClass();
        this.LJ = interfaceC1330410kj1;
        this.LIZ = 0;
        this.LIZJ = -1;
    }

    public final boolean LIZ(C1323100kXE c1323100kXE) throws Throwable {
        int i;
        int i2;
        int i3 = this.LIZJ;
        while (this.LIZ != -1 && (i2 = c1323100kXE.read()) != -1) {
            try {
                int i4 = this.LIZIZ + 1;
                this.LIZIZ = i4;
                switch (this.LIZ) {
                    case 0:
                    case 4:
                    case 6:
                        if (i4 == 13) {
                            if (i2 != 86) {
                                this.LIZ = -1;
                            }
                        } else if (i4 == 14) {
                            if (i2 != 80) {
                                this.LIZ = -1;
                            }
                        } else if (i4 == 15) {
                            if (i2 != 56) {
                                this.LIZ = -1;
                            }
                        } else if (i4 == 16) {
                            if (i2 != 88) {
                                this.LIZ = -1;
                            }
                        } else if (i4 == 21 && (i2 & 2) != 2) {
                            this.LIZ = -1;
                        } else if (i2 == 65) {
                            this.LIZ = 1;
                        }
                        break;
                    case 1:
                        if (i2 == 78) {
                            this.LIZ = 2;
                        } else {
                            this.LIZ = 0;
                        }
                        break;
                    case 2:
                        if (i2 == 73) {
                            this.LIZ = 3;
                        } else if (i2 == 77) {
                            this.LIZ = 5;
                        } else {
                            this.LIZ = 0;
                        }
                        break;
                    case 3:
                        if (i2 == 77) {
                            this.LIZ = 4;
                        } else {
                            this.LIZ = 0;
                        }
                        break;
                    case 5:
                        if (i2 == 70) {
                            this.LIZ = 6;
                            this.LIZLLL = i4;
                            this.LIZJ++;
                        } else {
                            this.LIZ = 0;
                        }
                        break;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C1331420kke.LIZIZ(e);
                throw null;
            }
        }
        if (this.LIZ != -1 && (i = this.LIZJ) != i3 && i > 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ(C1328480kfu c1328480kfu) {
        if (this.LIZ == -1 || c1328480kfu.LJIILL() <= this.LIZIZ) {
            return false;
        }
        C1323100kXE c1323100kXE = new C1323100kXE(c1328480kfu.LJII(), this.LJ.get(16384), this.LJ);
        try {
            try {
                C1323110kXF.LIZ(c1323100kXE, this.LIZIZ);
                boolean zLIZ = LIZ(c1323100kXE);
                C1323080kXC.LIZIZ(c1323100kXE);
                return zLIZ;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C1331420kke.LIZIZ(e);
                throw null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323080kXC.LIZIZ(c1323100kXE);
            throw th;
        }
    }
}
