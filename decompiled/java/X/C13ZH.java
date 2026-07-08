package X;

import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.13ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZH {
    public final C13ZC LIZ;
    public C13Z8 LIZIZ;
    public boolean LIZJ;
    public int LJFF;
    public int LJI;
    public int LJIIJJI;
    public final C20034513aB LIZLLL = new C20034513aB();
    public boolean LJ = true;
    public final ArrayList LJII = new ArrayList();
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;

    public final void LIZIZ() {
        int i = this.LJI;
        if (i > 0) {
            C13ZP c13zp = this.LIZIZ.LIZ;
            c13zp.LIZJ(new C13ZK() { // from class: X.13a0
                @Override // X.C13ZK
                public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                    int iLIZ = c20031413Zg.LIZ(0);
                    for (int i2 = 0; i2 < iLIZ; i2++) {
                        interfaceC20032213Zo.LJFF();
                    }
                }
            });
            c13zp.LIZJ[c13zp.LIZLLL - c13zp.LIZ[c13zp.LIZIZ - 1].LIZ] = i;
            this.LJI = 0;
        }
        if (!this.LJII.isEmpty()) {
            C13Z8 c13z8 = this.LIZIZ;
            ArrayList arrayList = this.LJII;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ListProtector.get(arrayList, i2);
            }
            c13z8.getClass();
            if (size != 0) {
                C13ZP c13zp2 = c13z8.LIZ;
                c13zp2.LIZJ(new C13ZK() { // from class: X.13Zt
                    @Override // X.C13ZK
                    public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                        for (Object obj : (Object[]) c20031413Zg.LIZIZ(0)) {
                            interfaceC20032213Zo.LJIIIIZZ(obj);
                        }
                    }
                });
                C20031913Zl.LIZ(c13zp2, 0, objArr);
            }
            this.LJII.clear();
        }
    }

    public final void LIZJ() {
        int i = this.LJIIJJI;
        if (i > 0) {
            int i2 = this.LJIIIIZZ;
            if (i2 >= 0) {
                LIZIZ();
                C13ZP c13zp = this.LIZIZ.LIZ;
                c13zp.LIZJ(new C13ZK() { // from class: X.13a4
                    @Override // X.C13ZK
                    public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                        interfaceC20032213Zo.LIZLLL(c20031413Zg.LIZ(0), c20031413Zg.LIZ(1));
                    }
                });
                int i3 = c13zp.LIZLLL - c13zp.LIZ[c13zp.LIZIZ - 1].LIZ;
                int[] iArr = c13zp.LIZJ;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.LJIIIIZZ = -1;
            } else {
                int i4 = this.LJIIJ;
                int i5 = this.LJIIIZ;
                LIZIZ();
                C13ZP c13zp2 = this.LIZIZ.LIZ;
                c13zp2.LIZJ(new C13ZK() { // from class: X.13a2
                    @Override // X.C13ZK
                    public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                        interfaceC20032213Zo.LJIIJ(c20031413Zg.LIZ(0), c20031413Zg.LIZ(1), c20031413Zg.LIZ(2));
                    }
                });
                int i6 = c13zp2.LIZLLL - c13zp2.LIZ[c13zp2.LIZIZ - 1].LIZ;
                int[] iArr2 = c13zp2.LIZJ;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.LJIIIZ = -1;
                this.LJIIJ = -1;
            }
            this.LJIIJJI = 0;
        }
    }

    public final void LJ() {
        C13ZD c13zd = this.LIZ.LJJIJ;
        if (c13zd.LIZJ > 0) {
            int i = c13zd.LJIIIIZZ;
            C20034513aB c20034513aB = this.LIZLLL;
            int i2 = c20034513aB.LIZIZ - 1;
            if ((i2 >= 0 ? c20034513aB.LIZ[i2] : -2) != i) {
                if (!this.LIZJ && this.LJ) {
                    LIZLLL(false);
                    this.LIZIZ.LIZ.LIZJ(new C13ZK() { // from class: X.13a9
                        @Override // X.C13ZK
                        public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                            c13ze.LJIIIIZZ(0);
                        }
                    });
                    this.LIZJ = true;
                }
                if (i > 0) {
                    C13Z7 c13z7LIZ = c13zd.LIZ(i);
                    this.LIZLLL.LIZIZ(i);
                    LIZLLL(false);
                    C13ZP c13zp = this.LIZIZ.LIZ;
                    c13zp.LIZJ(new C13ZK() { // from class: X.13Zp
                        @Override // X.C13ZK
                        public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                            int iLJIIJ = ((C13Z7) c20031413Zg.LIZIZ(0)).LIZ;
                            if (iLJIIJ < 0) {
                                iLJIIJ += c13ze.LJIIJ();
                            }
                            c13ze.LJIIIIZZ(iLJIIJ);
                        }
                    });
                    C20031913Zl.LIZ(c13zp, 0, c13z7LIZ);
                    this.LIZJ = true;
                }
            }
        }
    }

    public final void LIZ() {
        LIZJ();
        if (!this.LJII.isEmpty()) {
            C1947907k5.LIZ(this.LJII);
        } else {
            this.LJI++;
        }
    }

    public final void LIZLLL(boolean z) {
        int i;
        if (z) {
            i = this.LIZ.LJJIJ.LJIIIIZZ;
        } else {
            i = this.LIZ.LJJIJ.LJI;
        }
        int i2 = i - this.LJFF;
        if (i2 < 0) {
            s.LIZJ("Tried to seek backward");
        }
        if (i2 > 0) {
            C13ZP c13zp = this.LIZIZ.LIZ;
            c13zp.LIZJ(new C13ZK() { // from class: X.13Zx
                @Override // X.C13ZK
                public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                    c13ze.LIZ(c20031413Zg.LIZ(0));
                }
            });
            c13zp.LIZJ[c13zp.LIZLLL - c13zp.LIZ[c13zp.LIZIZ - 1].LIZ] = i2;
            this.LJFF = i;
        }
    }

    public C13ZH(C13ZC c13zc, C13Z8 c13z8) {
        this.LIZ = c13zc;
        this.LIZIZ = c13z8;
    }

    public final void LJFF(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid remove index ");
                sbLIZ.append(i);
                s.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.LJIIIIZZ == i) {
                this.LJIIJJI += i2;
                return;
            }
            LIZJ();
            this.LJIIIIZZ = i;
            this.LJIIJJI = i2;
        }
    }
}
