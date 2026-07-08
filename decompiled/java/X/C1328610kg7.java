package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0kg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328610kg7 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public final InterfaceC1330410kj1 LJII;

    public C1328610kg7(InterfaceC1330410kj1 interfaceC1330410kj1) {
        interfaceC1330410kj1.getClass();
        this.LJII = interfaceC1330410kj1;
        this.LIZJ = 0;
        this.LIZIZ = 0;
        this.LIZLLL = 0;
        this.LJFF = 0;
        this.LJ = 0;
        this.LIZ = 0;
    }

    public final boolean LIZ(C1323100kXE c1323100kXE) throws Throwable {
        int i;
        int i2 = this.LJ;
        while (this.LIZ != 6 && (i = c1323100kXE.read()) != -1) {
            try {
                int i3 = this.LIZJ + 1;
                this.LIZJ = i3;
                if (this.LJI) {
                    this.LIZ = 6;
                    this.LJI = false;
                    return false;
                }
                int i4 = this.LIZ;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 == 5) {
                                        int i5 = ((this.LIZIZ << 8) + i) - 2;
                                        C1323110kXF.LIZ(c1323100kXE, i5);
                                        this.LIZJ += i5;
                                        this.LIZ = 2;
                                    } else {
                                        C1322350kW1.LJFF(false);
                                    }
                                } else {
                                    this.LIZ = 5;
                                }
                            } else if (i == 255) {
                                this.LIZ = 3;
                            } else if (i == 0) {
                                this.LIZ = 2;
                            } else if (i == 217) {
                                this.LJI = true;
                                int i6 = i3 - 2;
                                int i7 = this.LIZLLL;
                                if (i7 > 0) {
                                    this.LJFF = i6;
                                }
                                this.LIZLLL = i7 + 1;
                                this.LJ = i7;
                                this.LIZ = 2;
                            } else {
                                if (i != 218) {
                                    if (i == 1 || (i >= 208 && (i <= 215 || i == 217 || i == 216))) {
                                        this.LIZ = 2;
                                    }
                                } else {
                                    int i8 = i3 - 2;
                                    int i9 = this.LIZLLL;
                                    if (i9 > 0) {
                                        this.LJFF = i8;
                                    }
                                    this.LIZLLL = i9 + 1;
                                    this.LJ = i9;
                                }
                                this.LIZ = 4;
                            }
                        } else if (i == 255) {
                            this.LIZ = 3;
                        }
                    } else if (i == 216) {
                        this.LIZ = 2;
                    } else {
                        this.LIZ = 6;
                    }
                } else if (i == 255) {
                    this.LIZ = 1;
                } else {
                    this.LIZ = 6;
                }
                this.LIZIZ = i;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C1331420kke.LIZIZ(e);
                throw null;
            }
        }
        if (this.LIZ != 6 && this.LJ != i2) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ(C1328480kfu c1328480kfu) {
        if (this.LIZ == 6 || c1328480kfu.LJIILL() <= this.LIZJ) {
            return false;
        }
        C1323100kXE c1323100kXE = new C1323100kXE(c1328480kfu.LJII(), this.LJII.get(16384), this.LJII);
        try {
            try {
                C1323110kXF.LIZ(c1323100kXE, this.LIZJ);
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
