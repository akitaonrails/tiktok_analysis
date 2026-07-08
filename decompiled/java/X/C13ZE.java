package X;

import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZE {
    public static final /* synthetic */ int LJJI = 0;
    public final C13ZI LIZ;
    public int[] LIZIZ;
    public Object[] LIZJ;
    public ArrayList<C13Z7> LIZLLL;
    public HashMap<C13Z7, C20031613Zi> LJ;
    public C20029713Yp<C20036313aT> LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public final C20034513aB LJIILL;
    public final C20034513aB LJIILLIIL;
    public final C20034513aB LJIIZILJ;
    public C20029713Yp<C13B1<Object>> LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public boolean LJIL;
    public C1688450u2V LJJ;

    static {
        new C13ZF();
    }

    public final void LIZJ() {
        int i = this.LJIILIIL;
        this.LJIILIIL = i + 1;
        if (i == 0) {
            this.LJIILLIIL.LIZIZ(((this.LIZIZ.length / 5) - this.LJII) - this.LJIJJ);
        }
    }

    public final void LJI() {
        C13B1<Object> c13b1LIZIZ;
        boolean z = this.LJIILIIL > 0;
        int i = this.LJIJI;
        int i2 = this.LJIJJ;
        int i3 = this.LJIJJLI;
        int iLJIILIIL = LJIILIIL(i3);
        int i4 = this.LJIILJJIL;
        int i5 = i - i3;
        int i6 = iLJIILIIL * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.LIZIZ[i7] & 1073741824) != 0;
        if (z) {
            C20029713Yp<C13B1<Object>> c20029713Yp = this.LJIJ;
            if (c20029713Yp != null && (c13b1LIZIZ = c20029713Yp.LIZIZ(i3)) != null) {
                Object[] objArr = c13b1LIZIZ.LIZ;
                int i8 = c13b1LIZIZ.LIZIZ;
                for (int i9 = 0; i9 < i8; i9++) {
                    LJJIIJZLJL(objArr[i9]);
                }
                c20029713Yp.LJI(i3);
            }
            int[] iArr = this.LIZIZ;
            iArr[i6 + 3] = i5;
            C13ZA.LIZLLL(iLJIILIIL, i4, iArr);
            int iLIZ = this.LJIIZILJ.LIZ();
            if (z2) {
                i4 = 1;
            }
            this.LJIILJJIL = iLIZ + i4;
            int iLJJIIJ = LJJIIJ(i3, this.LIZIZ);
            this.LJIJJLI = iLJJIIJ;
            int iLJIIJ = iLJJIIJ < 0 ? LJIIJ() : LJIILIIL(iLJJIIJ + 1);
            int iLJ = iLJIIJ >= 0 ? LJ(iLJIIJ, this.LIZIZ) : 0;
            this.LJIIIIZZ = iLJ;
            this.LJIIIZ = iLJ;
            return;
        }
        if (i != i2) {
            s.LIZJ("Expected to be at the end of a group");
        }
        int iLIZ2 = C13ZA.LIZ(iLJIILIIL, this.LIZIZ);
        int[] iArr2 = this.LIZIZ;
        int i10 = iArr2[i7] & 67108863;
        iArr2[i6 + 3] = i5;
        C13ZA.LIZLLL(iLJIILIIL, i4, iArr2);
        int iLIZ3 = this.LJIILL.LIZ();
        this.LJIJJ = ((this.LIZIZ.length / 5) - this.LJII) - this.LJIILLIIL.LIZ();
        this.LJIJJLI = iLIZ3;
        int iLJJIIJ2 = LJJIIJ(i3, this.LIZIZ);
        int iLIZ4 = this.LJIIZILJ.LIZ();
        this.LJIILJJIL = iLIZ4;
        if (iLJJIIJ2 == iLIZ3) {
            this.LJIILJJIL = iLIZ4 + (z2 ? 0 : i4 - i10);
            return;
        }
        int i11 = i5 - iLIZ2;
        int i12 = z2 ? 0 : i4 - i10;
        if (i11 != 0 || i12 != 0) {
            while (iLJJIIJ2 != 0 && iLJJIIJ2 != iLIZ3 && (i12 != 0 || i11 != 0)) {
                int iLJIILIIL2 = LJIILIIL(iLJJIIJ2);
                if (i11 != 0) {
                    this.LIZIZ[(iLJIILIIL2 * 5) + 3] = C13ZA.LIZ(iLJIILIIL2, this.LIZIZ) + i11;
                }
                if (i12 != 0) {
                    int[] iArr3 = this.LIZIZ;
                    C13ZA.LIZLLL(iLJIILIIL2, (iArr3[(iLJIILIIL2 * 5) + 1] & 67108863) + i12, iArr3);
                }
                int[] iArr4 = this.LIZIZ;
                if ((iArr4[(iLJIILIIL2 * 5) + 1] & 1073741824) != 0) {
                    i12 = 0;
                }
                iLJJIIJ2 = LJJIIJ(iLJJIIJ2, iArr4);
            }
        }
        this.LJIILJJIL += i12;
    }

    public final void LJII() {
        if (this.LJIILIIL <= 0) {
            C13D4.LIZIZ("Unbalanced begin/end insert");
        }
        int i = this.LJIILIIL - 1;
        this.LJIILIIL = i;
        if (i == 0) {
            if (this.LJIIZILJ.LIZIZ != this.LJIILL.LIZIZ) {
                s.LIZJ("startGroup/endGroup mismatch while inserting");
            }
            this.LJIJJ = ((this.LIZIZ.length / 5) - this.LJII) - this.LJIILLIIL.LIZ();
        }
    }

    public final int LJIIJ() {
        return (this.LIZIZ.length / 5) - this.LJII;
    }

    public final int LJIIJJI() {
        return this.LIZJ.length - this.LJIIJJI;
    }

    public final void LJJIIZ() {
        int i;
        C1688450u2V c1688450u2V = this.LJJ;
        if (c1688450u2V != null) {
            while (c1688450u2V.LIZIZ != 0) {
                int iLIZIZ = C1688460u2W.LIZIZ(c1688450u2V);
                int iLJIILIIL = LJIILIIL(iLIZIZ);
                int iLJIILL = iLIZIZ + 1;
                int iLJIILL2 = LJIILL(iLIZIZ) + iLIZIZ;
                while (true) {
                    if (iLJIILL >= iLJIILL2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.LIZIZ[(LJIILIIL(iLJIILL) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iLJIILL += LJIILL(iLJIILL);
                    }
                }
                int[] iArr = this.LIZIZ;
                int i2 = (iLJIILIIL * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = ((-67108865) & i3) | (i << 26);
                    int iLJJIII = LJJIII(iLIZIZ);
                    if (iLJJIII >= 0) {
                        C1688460u2W.LIZ(iLJJIII, c1688450u2V);
                    }
                }
            }
        }
    }

    public final boolean LJJIIZI() {
        C13Z7 c13z7LJJJJ;
        if (this.LJIILIIL != 0) {
            s.LIZJ("Cannot remove group while inserting");
        }
        int i = this.LJIJI;
        int i2 = this.LJIIIIZZ;
        int iLJ = LJ(LJIILIIL(i), this.LIZIZ);
        int iLJJIJIIJIL = LJJIJIIJIL();
        C20031613Zi c20031613ZiLJJIZ = LJJIZ(this.LJIJJLI);
        if (c20031613ZiLJJIZ != null && (c13z7LJJJJ = LJJJJ(i)) != null) {
            c20031613ZiLJJIZ.LIZJ(c13z7LJJJJ);
        }
        C1688450u2V c1688450u2V = this.LJJ;
        if (c1688450u2V != null) {
            while (c1688450u2V.LIZIZ != 0 && c1688450u2V.LIZ[0] >= i) {
                C1688460u2W.LIZIZ(c1688450u2V);
            }
        }
        boolean zLJJIJ = LJJIJ(i, this.LJIJI - i);
        LJJIJIIJI(iLJ, this.LJIIIIZZ - iLJ, i - 1);
        this.LJIJI = i;
        this.LJIIIIZZ = i2;
        this.LJIILJJIL -= iLJJIJIIJIL;
        return zLJJIJ;
    }

    public final int LJJIJIIJIL() {
        int iLJIILIIL = LJIILIIL(this.LJIJI);
        int iLIZ = this.LJIJI + C13ZA.LIZ(iLJIILIIL, this.LIZIZ);
        this.LJIJI = iLIZ;
        this.LJIIIIZZ = LJ(LJIILIIL(iLIZ), this.LIZIZ);
        int i = this.LIZIZ[(iLJIILIIL * 5) + 1];
        if ((1073741824 & i) == 0) {
            return i & 67108863;
        }
        return 1;
    }

    public final void LJJIJIL() {
        int i = this.LJIJJ;
        this.LJIJI = i;
        this.LJIIIIZZ = LJ(LJIILIIL(i), this.LIZIZ);
    }

    public final void LJJJ() {
        if (this.LJIILIIL != 0) {
            s.LIZJ("Key must be supplied when inserting");
        }
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        LJJJIL(0, c1680520tpi, c1680520tpi, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotWriter(current = ");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(" end=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(" size = ");
        sbLIZ.append(LJIIJ());
        sbLIZ.append(" gap=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('-');
        sbLIZ.append(this.LJI + this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13ZE(C13ZI c13zi) {
        this.LIZ = c13zi;
        int[] iArr = c13zi.LL;
        this.LIZIZ = iArr;
        Object[] objArr = c13zi.LLILLL;
        this.LIZJ = objArr;
        this.LIZLLL = c13zi.LLJ;
        this.LJ = c13zi.LLJI;
        this.LJFF = c13zi.LLJIJIL;
        int i = c13zi.LLILLJJLI;
        this.LJI = i;
        this.LJII = (iArr.length / 5) - i;
        int i2 = c13zi.LLILZ;
        this.LJIIJ = i2;
        this.LJIIJJI = objArr.length - i2;
        this.LJIIL = i;
        this.LJIILL = new C20034513aB();
        this.LJIILLIIL = new C20034513aB();
        this.LJIIZILJ = new C20034513aB();
        this.LJIJJ = i;
        this.LJIJJLI = -1;
    }

    public static void LJIJJ(C13ZE c13ze) {
        int i = c13ze.LJIJJLI;
        int iLJIILIIL = c13ze.LJIILIIL(i);
        int[] iArr = c13ze.LIZIZ;
        int i2 = (iLJIILIIL * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = (i3 & (-134217729)) | 134217728;
            iArr[i2] = i4;
            if ((67108864 & i4) == 0) {
                c13ze.LJJJJJ(c13ze.LJJIII(i));
            }
        }
    }

    public final void LIZ(int i) {
        if (i < 0) {
            s.LIZJ("Cannot seek backwards");
        }
        if (this.LJIILIIL > 0) {
            C13D4.LIZIZ("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.LJIJI + i;
        if (i2 < this.LJIJJLI || i2 > this.LJIJJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot seek outside the current group (");
            sbLIZ.append(this.LJIJJLI);
            sbLIZ.append('-');
            sbLIZ.append(this.LJIJJ);
            sbLIZ.append(')');
            s.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJIJI = i2;
        int iLJ = LJ(LJIILIIL(i2), this.LIZIZ);
        this.LJIIIIZZ = iLJ;
        this.LJIIIZ = iLJ;
    }

    public final C13Z7 LIZIZ(int i) {
        ArrayList<C13Z7> arrayList = this.LIZLLL;
        int iLJ = C13ZA.LJ(arrayList, i, LJIIJ());
        if (iLJ < 0) {
            if (i > this.LJI) {
                i = -(LJIIJ() - i);
            }
            C13Z7 c13z7 = new C13Z7(i);
            ListProtector.add(arrayList, -(iLJ + 1), c13z7);
            return c13z7;
        }
        return (C13Z7) ListProtector.get(arrayList, iLJ);
    }

    public final void LIZLLL(boolean z) {
        this.LJIL = true;
        if (z && this.LJIILL.LIZIZ == 0) {
            LJIL(LJIIJ());
            LJJ(this.LIZJ.length - this.LJIIJJI, this.LJI);
            int i = this.LJIIJ;
            Arrays.fill(this.LIZJ, i, this.LJIIJJI + i, (Object) null);
            LJJIIZ();
        }
        C13ZI c13zi = this.LIZ;
        int[] iArr = this.LIZIZ;
        int i2 = this.LJI;
        Object[] objArr = this.LIZJ;
        int i3 = this.LJIIJ;
        ArrayList<C13Z7> arrayList = this.LIZLLL;
        HashMap<C13Z7, C20031613Zi> map = this.LJ;
        C20029713Yp<C20036313aT> c20029713Yp = this.LJFF;
        c13zi.getClass();
        if (this.LIZ != c13zi || !c13zi.LLIZ) {
            C13D4.LIZ("Unexpected writer close()");
        }
        c13zi.LLIZ = false;
        c13zi.LL = iArr;
        c13zi.LLILLJJLI = i2;
        c13zi.LLILLL = objArr;
        c13zi.LLILZ = i3;
        c13zi.LLJ = arrayList;
        c13zi.LLJI = map;
        c13zi.LLJIJIL = c20029713Yp;
    }

    public final int LJFF(int i) {
        int i2;
        int i3 = this.LJIIJJI;
        if (i < this.LJIIJ) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return i + (i3 * i2);
    }

    public final void LJIIIIZZ(int i) {
        if (this.LJIILIIL > 0) {
            s.LIZJ("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.LJIJJLI;
        if (i2 != i) {
            if (i < i2 || i >= this.LJIJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Started group at ");
                sbLIZ.append(i);
                sbLIZ.append(" must be a subgroup of the group at ");
                sbLIZ.append(i2);
                s.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            int i3 = this.LJIJI;
            int i4 = this.LJIIIIZZ;
            int i5 = this.LJIIIZ;
            this.LJIJI = i;
            LJJJ();
            this.LJIJI = i3;
            this.LJIIIIZZ = i4;
            this.LJIIIZ = i5;
        }
    }

    public final Object LJIIL(int i) {
        int iLJIILIIL = LJIILIIL(i);
        int[] iArr = this.LIZIZ;
        int i2 = (iLJIILIIL * 5) + 1;
        if ((iArr[i2] & 268435456) != 0) {
            return this.LIZJ[LJ(iLJIILIIL, iArr) + Integer.bitCount(iArr[i2] >> 29)];
        }
        InterfaceC1680500tpg.LIZ.getClass();
        return C1680510tph.LIZIZ;
    }

    public final int LJIILIIL(int i) {
        int i2;
        int i3 = this.LJII;
        if (i < this.LJI) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return i + (i3 * i2);
    }

    public final Object LJIILJJIL(int i) {
        int iLJIILIIL = LJIILIIL(i);
        int[] iArr = this.LIZIZ;
        int i2 = iLJIILIIL * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.LIZJ[iArr[i2 + 4] + Integer.bitCount(i3 >> 30)];
        }
        return null;
    }

    public final int LJIILL(int i) {
        return C13ZA.LIZ(LJIILIIL(i), this.LIZIZ);
    }

    public final void LJIIZILJ(int i) {
        int iLJ;
        if (i > 0) {
            int i2 = this.LJIJI;
            LJIL(i2);
            int i3 = this.LJI;
            int i4 = this.LJII;
            int[] iArr = this.LIZIZ;
            int length = iArr.length / 5;
            int i5 = length - i4;
            int i6 = 0;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i7 = iMax - i5;
                System.arraycopy(iArr, 0, iArr2, 0, i3 * 5);
                int i8 = (i4 + i3) * 5;
                System.arraycopy(iArr, i8, iArr2, (i3 + i7) * 5, (length * 5) - i8);
                this.LIZIZ = iArr2;
                i4 = i7;
            }
            int i9 = this.LJIJJ;
            if (i9 >= i3) {
                this.LJIJJ = i9 + i;
            }
            int i10 = i3 + i;
            this.LJI = i10;
            this.LJII = i4 - i;
            if (i5 > 0) {
                iLJ = LJ(LJIILIIL(i2 + i), this.LIZIZ);
            } else {
                iLJ = 0;
            }
            if (this.LJIIL >= i3) {
                i6 = this.LJIIJ;
            }
            int i11 = this.LJIIJJI;
            int length2 = this.LIZJ.length;
            if (iLJ > i6) {
                iLJ = -(((length2 - i11) - iLJ) + 1);
            }
            for (int i12 = i3; i12 < i10; i12++) {
                this.LIZIZ[(i12 * 5) + 4] = iLJ;
            }
            int i13 = this.LJIIL;
            if (i13 >= i3) {
                this.LJIIL = i13 + i;
            }
        }
    }

    public final boolean LJIJI(int i) {
        if ((this.LIZIZ[(LJIILIIL(i) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final void LJIL(int i) {
        int iLJIIJ;
        C13Z7 c13z7;
        int i2;
        C13Z7 c13z72;
        int i3;
        int i4;
        int i5 = this.LJII;
        int i6 = this.LJI;
        if (i6 != i) {
            if (!this.LIZLLL.isEmpty()) {
                int length = (this.LIZIZ.length / 5) - this.LJII;
                if (i6 < i) {
                    for (int iLIZIZ = C13ZA.LIZIZ(this.LIZLLL, i6, length); iLIZIZ < this.LIZLLL.size() && (i3 = (c13z72 = (C13Z7) ListProtector.get(this.LIZLLL, iLIZIZ)).LIZ) < 0 && (i4 = i3 + length) < i; iLIZIZ++) {
                        c13z72.LIZ = i4;
                    }
                } else {
                    for (int iLIZIZ2 = C13ZA.LIZIZ(this.LIZLLL, i, length); iLIZIZ2 < this.LIZLLL.size() && (i2 = (c13z7 = (C13Z7) ListProtector.get(this.LIZLLL, iLIZIZ2)).LIZ) >= 0; iLIZIZ2++) {
                        c13z7.LIZ = -(length - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.LIZIZ;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    System.arraycopy(iArr, i7, iArr, i8 + i7, i9 - i7);
                } else {
                    int i10 = i9 + i8;
                    System.arraycopy(iArr, i10, iArr, i9, (i7 + i8) - i10);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int length2 = this.LIZIZ.length / 5;
            if (i6 >= length2) {
                s.LIZJ("Check failed");
            }
            while (i6 < length2) {
                int i11 = (i6 * 5) + 2;
                int i12 = this.LIZIZ[i11];
                if (i12 > -2) {
                    iLJIIJ = i12;
                } else {
                    iLJIIJ = LJIIJ() + i12 + 2;
                }
                if (iLJIIJ >= i) {
                    iLJIIJ = -((LJIIJ() - iLJIIJ) + 2);
                }
                if (iLJIIJ != i12) {
                    this.LIZIZ[i11] = iLJIIJ;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.LJI = i;
    }

    public final Object LJJIFFI(int i) {
        int iLJIILIIL = LJIILIIL(i);
        int[] iArr = this.LIZIZ;
        if ((iArr[(iLJIILIIL * 5) + 1] & 1073741824) != 0) {
            return this.LIZJ[LJFF(LJ(iLJIILIIL, iArr))];
        }
        return null;
    }

    public final int LJJII(int i) {
        return this.LIZIZ[(LJIILIIL(i) * 5) + 1] & 67108863;
    }

    public final int LJJIII(int i) {
        return LJJIIJ(i, this.LIZIZ);
    }

    public final Object LJJIIJZLJL(Object obj) {
        if (this.LJIILIIL > 0) {
            LJIJ(1, this.LJIJJLI);
        }
        Object[] objArr = this.LIZJ;
        int i = this.LJIIIIZZ;
        this.LJIIIIZZ = i + 1;
        Object obj2 = objArr[LJFF(i)];
        if (this.LJIIIIZZ > this.LJIIIZ) {
            s.LIZJ("Writing to an invalid slot");
        }
        this.LIZJ[LJFF(this.LJIIIIZZ - 1)] = obj;
        return obj2;
    }

    public final int LJJIL(int i) {
        return LJ(LJIILIIL(i + LJIILL(i)), this.LIZIZ);
    }

    public final C20031613Zi LJJIZ(int i) {
        C13Z7 c13z7LJJJJ;
        HashMap<C13Z7, C20031613Zi> map = this.LJ;
        if (map == null || (c13z7LJJJJ = LJJJJ(i)) == null) {
            return null;
        }
        return map.get(c13z7LJJJJ);
    }

    public final C13Z7 LJJJJ(int i) {
        boolean z;
        ArrayList<C13Z7> arrayList;
        int iLJ;
        if (i >= 0 && i < LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (iLJ = C13ZA.LJ((arrayList = this.LIZLLL), i, LJIIJ())) < 0) {
            return null;
        }
        return (C13Z7) ListProtector.get(arrayList, iLJ);
    }

    public final void LJJJJI(Object obj) {
        if (this.LJIILIIL > 0 && this.LJIIIIZZ != this.LJIIJ) {
            C20029713Yp<C13B1<Object>> c20029713Yp = this.LJIJ;
            if (c20029713Yp == null) {
                c20029713Yp = new C20029713Yp<>(6);
            }
            this.LJIJ = c20029713Yp;
            int i = this.LJIJJLI;
            C13B1<Object> c13b1LIZIZ = c20029713Yp.LIZIZ(i);
            if (c13b1LIZIZ == null) {
                c13b1LIZIZ = new C13B1<>((Object) null);
                c20029713Yp.LJII(i, c13b1LIZIZ);
            }
            c13b1LIZIZ.LJI(obj);
            InterfaceC1680500tpg.LIZ.getClass();
            return;
        }
        LJJIIJZLJL(obj);
    }

    public final void LJJJJIZL(Object obj) {
        int iLJIILIIL = LJIILIIL(this.LJIJI);
        int i = (iLJIILIIL * 5) + 1;
        if ((this.LIZIZ[i] & 268435456) == 0) {
            s.LIZJ("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.LIZJ;
        int[] iArr = this.LIZIZ;
        objArr[LJFF(LJ(iLJIILIIL, iArr) + Integer.bitCount(iArr[i] >> 29))] = obj;
    }

    public final void LJJJJJ(int i) {
        if (i >= 0) {
            C1688450u2V c1688450u2V = this.LJJ;
            if (c1688450u2V == null) {
                c1688450u2V = new C1688450u2V();
                this.LJJ = c1688450u2V;
            }
            C1688460u2W.LIZ(i, c1688450u2V);
        }
    }

    public final int LJ(int i, int[] iArr) {
        if (i >= this.LIZIZ.length / 5) {
            return this.LIZJ.length - this.LJIIJJI;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.LJIIJJI;
        int length = this.LIZJ.length;
        if (i2 >= 0) {
            return i2;
        }
        return (length - i3) + i2 + 1;
    }

    public final boolean LJIILLIIL(int i, int i2) {
        int i3;
        int iLJIILL;
        int length;
        if (i2 == this.LJIJJLI) {
            length = this.LJIJJ;
        } else {
            C20034513aB c20034513aB = this.LJIILL;
            int i4 = c20034513aB.LIZIZ;
            int i5 = i4 - 1;
            if (i5 >= 0) {
                i3 = c20034513aB.LIZ[i5];
            } else {
                i3 = 0;
            }
            if (i2 > i3) {
                iLJIILL = LJIILL(i2);
            } else {
                int[] iArr = c20034513aB.LIZ;
                int iMin = Math.min(iArr.length, i4);
                int i6 = 0;
                while (true) {
                    if (i6 >= iMin) {
                        break;
                    }
                    if (iArr[i6] == i2) {
                        if (i6 >= 0) {
                            length = ((this.LIZIZ.length / 5) - this.LJII) - this.LJIILLIIL.LIZ[i6];
                        }
                    } else {
                        i6++;
                    }
                }
                iLJIILL = LJIILL(i2);
            }
            length = iLJIILL + i2;
        }
        if (i <= i2 || i >= length) {
            return false;
        }
        return true;
    }

    public final void LJIJ(int i, int i2) {
        if (i > 0) {
            LJJ(this.LJIIIIZZ, i2);
            int i3 = this.LJIIJ;
            int i4 = this.LJIIJJI;
            if (i4 < i) {
                Object[] objArr = this.LIZJ;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.LIZJ = objArr2;
                i4 = i7;
            }
            int i9 = this.LJIIIZ;
            if (i9 >= i3) {
                this.LJIIIZ = i9 + i;
            }
            this.LJIIJ = i3 + i;
            this.LJIIJJI = i4 - i;
        }
    }

    public final void LJIJJLI(C13ZI c13zi, int i) {
        if (this.LJIILIIL <= 0) {
            s.LIZJ("Check failed");
        }
        if (i == 0 && this.LJIJI == 0 && this.LIZ.LLILLJJLI == 0) {
            int iLIZ = C13ZA.LIZ(i, c13zi.LL);
            int i2 = c13zi.LLILLJJLI;
            if (iLIZ == i2) {
                int[] iArr = this.LIZIZ;
                Object[] objArr = this.LIZJ;
                ArrayList<C13Z7> arrayList = this.LIZLLL;
                HashMap<C13Z7, C20031613Zi> map = this.LJ;
                C20029713Yp<C20036313aT> c20029713Yp = this.LJFF;
                int[] iArr2 = c13zi.LL;
                Object[] objArr2 = c13zi.LLILLL;
                int i3 = c13zi.LLILZ;
                HashMap<C13Z7, C20031613Zi> map2 = c13zi.LLJI;
                C20029713Yp<C20036313aT> c20029713Yp2 = c13zi.LLJIJIL;
                this.LIZIZ = iArr2;
                this.LIZJ = objArr2;
                this.LIZLLL = c13zi.LLJ;
                this.LJI = i2;
                this.LJII = (iArr2.length / 5) - i2;
                this.LJIIJ = i3;
                this.LJIIJJI = objArr2.length - i3;
                this.LJIIL = i2;
                this.LJ = map2;
                this.LJFF = c20029713Yp2;
                c13zi.LL = iArr;
                c13zi.LLILLJJLI = 0;
                c13zi.LLILLL = objArr;
                c13zi.LLILZ = 0;
                c13zi.LLJ = arrayList;
                c13zi.LLJI = map;
                c13zi.LLJIJIL = c20029713Yp;
                return;
            }
        }
        C13ZE c13zeLJIIIIZZ = c13zi.LJIIIIZZ();
        try {
            C13ZF.LIZ(c13zeLJIIIIZZ, i, this, true, true, false);
            c13zeLJIIIIZZ.LIZLLL(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c13zeLJIIIIZZ.LIZLLL(false);
            throw th;
        }
    }

    public final void LJJ(int i, int i2) {
        int i3 = this.LJIIJJI;
        int i4 = this.LJIIJ;
        int i5 = this.LJIIL;
        if (i4 != i) {
            Object[] objArr = this.LIZJ;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, LJIIJ());
        if (i5 != iMin) {
            int length = this.LIZJ.length - i3;
            if (iMin < i5) {
                int iLJIILIIL = LJIILIIL(iMin);
                int iLJIILIIL2 = LJIILIIL(i5);
                int i7 = this.LJI;
                while (iLJIILIIL < iLJIILIIL2) {
                    int i8 = (iLJIILIIL * 5) + 4;
                    int i9 = this.LIZIZ[i8];
                    if (i9 < 0) {
                        s.LIZJ("Unexpected anchor value, expected a positive anchor");
                    }
                    this.LIZIZ[i8] = -((length - i9) + 1);
                    iLJIILIIL++;
                    if (iLJIILIIL == i7) {
                        iLJIILIIL += this.LJII;
                    }
                }
            } else {
                int iLJIILIIL3 = LJIILIIL(i5);
                int iLJIILIIL4 = LJIILIIL(iMin);
                while (iLJIILIIL3 < iLJIILIIL4) {
                    int i10 = (iLJIILIIL3 * 5) + 4;
                    int i11 = this.LIZIZ[i10];
                    if (i11 >= 0) {
                        s.LIZJ("Unexpected anchor value, expected a negative anchor");
                    }
                    this.LIZIZ[i10] = i11 + length + 1;
                    iLJIILIIL3++;
                    if (iLJIILIIL3 == this.LJI) {
                        iLJIILIIL3 += this.LJII;
                    }
                }
            }
            this.LJIIL = iMin;
        }
        this.LJIIJ = i;
    }

    public final List LJJI(C13Z7 c13z7, C13ZE c13ze) {
        boolean z;
        int iLJJII;
        boolean z2;
        if (c13ze.LJIILIIL > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            s.LIZJ("Check failed");
        }
        if (this.LJIILIIL != 0) {
            s.LIZJ("Check failed");
        }
        if (!c13z7.LIZ()) {
            s.LIZJ("Check failed");
        }
        int iLJIIJ = c13z7.LIZ;
        if (iLJIIJ < 0) {
            iLJIIJ += LJIIJ();
        }
        int i = iLJIIJ + 1;
        int i2 = this.LJIJI;
        if (i2 > i || i >= this.LJIJJ) {
            s.LIZJ("Check failed");
        }
        int iLJJIII = LJJIII(i);
        int iLJIILL = LJIILL(i);
        if (LJIJI(i)) {
            iLJJII = 1;
        } else {
            iLJJII = LJJII(i);
        }
        List listLIZ = C13ZF.LIZ(this, i, c13ze, false, false, true);
        LJJJJJ(iLJJIII);
        if (iLJJII > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        while (iLJJIII >= i2) {
            int iLJIILIIL = LJIILIIL(iLJJIII);
            int[] iArr = this.LIZIZ;
            int i3 = iLJIILIIL * 5;
            iArr[i3 + 3] = C13ZA.LIZ(iLJIILIIL, iArr) - iLJIILL;
            if (z2) {
                int[] iArr2 = this.LIZIZ;
                int i4 = iArr2[i3 + 1];
                if ((1073741824 & i4) != 0) {
                    z2 = false;
                } else {
                    C13ZA.LIZLLL(iLJIILIIL, (i4 & 67108863) - iLJJII, iArr2);
                }
            }
            iLJJIII = LJJIII(iLJJIII);
        }
        if (z2) {
            if (this.LJIILJJIL < iLJJII) {
                s.LIZJ("Check failed");
            }
            this.LJIILJJIL -= iLJJII;
        }
        return listLIZ;
    }

    public final int LJJIIJ(int i, int[] iArr) {
        int i2 = iArr[(LJIILIIL(i) * 5) + 2];
        if (i2 <= -2) {
            return LJIIJ() + i2 + 2;
        }
        return i2;
    }

    public final boolean LJJIJ(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<C13Z7> arrayList = this.LIZLLL;
            LJIL(i);
            if (!arrayList.isEmpty()) {
                HashMap<C13Z7, C20031613Zi> map = this.LJ;
                int i3 = i2 + i;
                int iLIZIZ = C13ZA.LIZIZ(this.LIZLLL, i3, (this.LIZIZ.length / 5) - this.LJII);
                if (iLIZIZ >= this.LIZLLL.size()) {
                    iLIZIZ--;
                }
                int i4 = iLIZIZ + 1;
                int i5 = 0;
                while (iLIZIZ >= 0) {
                    C13Z7 c13z7 = (C13Z7) ListProtector.get(this.LIZLLL, iLIZIZ);
                    int iLJIIJ = c13z7.LIZ;
                    if (iLJIIJ < 0) {
                        iLJIIJ += LJIIJ();
                    }
                    if (iLJIIJ < i) {
                        break;
                    }
                    if (iLJIIJ < i3) {
                        c13z7.LIZ = Integer.MIN_VALUE;
                        if (map != null) {
                            map.remove(c13z7);
                        }
                        if (i5 == 0) {
                            i5 = iLIZIZ + 1;
                        }
                        i4 = iLIZIZ;
                    }
                    iLIZIZ--;
                }
                if (i4 < i5) {
                    z = true;
                    this.LIZLLL.subList(i4, i5).clear();
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.LJI = i;
            this.LJII += i2;
            int i6 = this.LJIIL;
            if (i6 > i) {
                this.LJIIL = Math.max(i, i6 - i2);
            }
            int i7 = this.LJIJJ;
            if (i7 >= this.LJI) {
                this.LJIJJ = i7 - i2;
            }
            int i8 = this.LJIJJLI;
            if (i8 >= 0 && (this.LIZIZ[(LJIILIIL(i8) * 5) + 1] & 67108864) != 0) {
                LJJJJJ(i8);
            }
        }
        return z;
    }

    public final int LJJIJL(int i, int[] iArr) {
        if (i >= this.LIZIZ.length / 5) {
            return this.LIZJ.length - this.LJIIJJI;
        }
        int iLIZJ = C13ZA.LIZJ(i, iArr);
        int i2 = this.LJIIJJI;
        int length = this.LIZJ.length;
        if (iLIZJ >= 0) {
            return iLIZJ;
        }
        return (length - i2) + iLIZJ + 1;
    }

    public final int LJJIJLIJ(int i, int i2) {
        int iLJJIJL = LJJIJL(LJIILIIL(i), this.LIZIZ);
        int iLJ = LJ(LJIILIIL(i + 1), this.LIZIZ);
        int i3 = iLJJIJL + i2;
        if (i3 >= iLJJIJL && i3 < iLJ) {
            return i3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Write to an invalid slot index ");
        sbLIZ.append(i2);
        sbLIZ.append(" for group ");
        sbLIZ.append(i);
        s.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return i3;
    }

    public final void LJJJI(int i, Object obj) {
        InterfaceC1680500tpg.LIZ.getClass();
        LJJJIL(i, obj, C1680510tph.LIZIZ, false);
    }

    public final void LJJJJJL(int i, Object obj) {
        int iLJIILIIL = LJIILIIL(i);
        int[] iArr = this.LIZIZ;
        if (iLJIILIIL >= iArr.length || (iArr[(iLJIILIIL * 5) + 1] & 1073741824) == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Updating the node of a group at ");
            sbLIZ.append(i);
            sbLIZ.append(" that was not created with as a node group");
            s.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZJ[LJFF(LJ(iLJIILIIL, this.LIZIZ))] = obj;
    }

    public final void LJIIIZ(int i, int i2, int i3) {
        if (i >= this.LJI) {
            i = -((LJIIJ() - i) + 2);
        }
        while (i3 < i2) {
            this.LIZIZ[(LJIILIIL(i3) * 5) + 2] = i;
            int iLIZ = C13ZA.LIZ(LJIILIIL(i3), this.LIZIZ) + i3;
            LJIIIZ(i3, iLIZ, i3 + 1);
            i3 = iLIZ;
        }
    }

    public final void LJJIJIIJI(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.LJIIJJI;
            int i5 = i + i2;
            LJJ(i5, i3);
            this.LJIIJ = i;
            this.LJIIJJI = i4 + i2;
            Arrays.fill(this.LIZJ, i, i5, (Object) null);
            int i6 = this.LJIIIZ;
            if (i6 >= i) {
                this.LJIIIZ = i6 - i2;
            }
        }
    }

    public final void LJJJIL(int i, Object obj, Object obj2, boolean z) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        C20031613Zi c20031613ZiLJJIZ;
        int i5 = this.LJIJJLI;
        if (this.LJIILIIL > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIZILJ.LIZIZ(this.LJIILJJIL);
        if (z2) {
            int i6 = this.LJIJI;
            int iLJ = LJ(LJIILIIL(i6), this.LIZIZ);
            LJIIZILJ(1);
            this.LJIIIIZZ = iLJ;
            this.LJIIIZ = iLJ;
            int iLJIILIIL = LJIILIIL(i6);
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (obj != c1680520tpi) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (!z && obj2 != c1680520tpi) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i7 = this.LJIIJJI;
            int i8 = this.LJIIJ;
            Object[] objArr = this.LIZJ;
            int length = objArr.length;
            if (iLJ > i8) {
                iLJ = -(((length - i7) - iLJ) + 1);
            }
            if (iLJ >= 0 && this.LJIIL < i6) {
                iLJ = -(((objArr.length - i7) - iLJ) + 1);
            }
            int[] iArr = this.LIZIZ;
            int i9 = this.LJIJJLI;
            int i10 = iLJIILIIL * 5;
            iArr[i10] = i;
            iArr[i10 + 1] = ((z ? 1 : 0) << 30) | (i3 << 29) | (i4 << 28);
            iArr[i10 + 2] = i9;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = iLJ;
            int i11 = (z ? 1 : 0) + i3 + i4;
            if (i11 > 0) {
                LJIJ(i11, i6);
                Object[] objArr2 = this.LIZJ;
                int i12 = this.LJIIIIZZ;
                if (z) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                if (i3 != 0) {
                    objArr2[i12] = obj;
                    i12++;
                }
                if (i4 != 0) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                this.LJIIIIZZ = i12;
            }
            this.LJIILJJIL = 0;
            i2 = i6 + 1;
            this.LJIJJLI = i6;
            this.LJIJI = i2;
            if (i5 >= 0 && (c20031613ZiLJJIZ = LJJIZ(i5)) != null) {
                C20031613Zi c20031613ZiLIZIZ = c20031613ZiLJJIZ.LIZIZ();
                C13Z7 c13z7LIZIZ = LIZIZ(i6);
                ArrayList<Object> arrayList = c20031613ZiLIZIZ.LIZIZ;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                c20031613ZiLIZIZ.LIZIZ = arrayList;
                arrayList.add(c13z7LIZIZ);
            }
        } else {
            this.LJIILL.LIZIZ(i5);
            this.LJIILLIIL.LIZIZ(((this.LIZIZ.length / 5) - this.LJII) - this.LJIJJ);
            int i13 = this.LJIJI;
            int iLJIILIIL2 = LJIILIIL(i13);
            InterfaceC1680500tpg.LIZ.getClass();
            if (!Intrinsics.LJFF(obj2, C1680510tph.LIZIZ)) {
                if (z) {
                    LJJJJJL(this.LJIJI, obj2);
                } else {
                    LJJJJIZL(obj2);
                }
            }
            this.LJIIIIZZ = LJJIJL(iLJIILIIL2, this.LIZIZ);
            this.LJIIIZ = LJ(LJIILIIL(this.LJIJI + 1), this.LIZIZ);
            int[] iArr2 = this.LIZIZ;
            int i14 = iLJIILIIL2 * 5;
            this.LJIILJJIL = iArr2[i14 + 1] & 67108863;
            this.LJIJJLI = i13;
            this.LJIJI = i13 + 1;
            i2 = i13 + iArr2[i14 + 3];
        }
        this.LJIJJ = i2;
    }
}
