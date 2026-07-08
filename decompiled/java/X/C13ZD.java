package X;

import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.13ZD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZD {
    public final C13ZI LIZ;
    public final int[] LIZIZ;
    public final int LIZJ;
    public final Object[] LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final C20034513aB LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;

    public final void LIZJ() {
        this.LJFF = true;
        C13ZI c13zi = this.LIZ;
        c13zi.getClass();
        if (this.LIZ != c13zi || c13zi.LLILZIL <= 0) {
            s.LIZJ("Unexpected reader close()");
        }
        c13zi.LLILZIL--;
    }

    public final void LIZLLL() {
        if (this.LJIIJ == 0) {
            if (this.LJI != this.LJII) {
                s.LIZJ("endGroup() not called at the end of a group");
            }
            int[] iArr = this.LIZIZ;
            int i = iArr[(this.LJIIIIZZ * 5) + 2];
            this.LJIIIIZZ = i;
            this.LJII = i < 0 ? this.LIZJ : C13ZA.LIZ(i, iArr) + i;
            int iLIZ = this.LJIIIZ.LIZ();
            if (iLIZ < 0) {
                this.LJIIJJI = 0;
                this.LJIIL = 0;
            } else {
                this.LJIIJJI = iLIZ;
                this.LJIIL = i >= this.LIZJ - 1 ? this.LJ : this.LIZIZ[((i + 1) * 5) + 4];
            }
        }
    }

    public final Object LJ() {
        int i = this.LJI;
        if (i < this.LJII) {
            return LIZIZ(i, this.LIZIZ);
        }
        return 0;
    }

    public final int LJFF() {
        int i = this.LJI;
        if (i < this.LJII) {
            return this.LIZIZ[i * 5];
        }
        return 0;
    }

    public final Object LJIIJ() {
        int i;
        if (this.LJIIJ > 0 || (i = this.LJIIJJI) >= this.LJIIL) {
            this.LJIILIIL = false;
            InterfaceC1680500tpg.LIZ.getClass();
            return C1680510tph.LIZIZ;
        }
        this.LJIILIIL = true;
        Object[] objArr = this.LIZLLL;
        this.LJIIJJI = i + 1;
        return objArr[i];
    }

    public final int LJIILLIIL() {
        if (this.LJIIJ != 0) {
            s.LIZJ("Cannot skip while in an empty region");
        }
        int[] iArr = this.LIZIZ;
        int i = this.LJI;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? 67108863 & iArr[(i * 5) + 1] : 1;
        this.LJI = i + C13ZA.LIZ(i, iArr);
        return i2;
    }

    public final void LJIIZILJ() {
        if (this.LJIIJ != 0) {
            s.LIZJ("Cannot skip the enclosing group while in an empty region");
        }
        this.LJI = this.LJII;
        this.LJIIJJI = 0;
        this.LJIIL = 0;
    }

    public final void LJIJ() {
        if (this.LJIIJ <= 0) {
            int i = this.LJIIIIZZ;
            int i2 = this.LJI;
            if (this.LIZIZ[(i2 * 5) + 2] != i) {
                C13D4.LIZ("Invalid slot table detected");
            }
            C20034513aB c20034513aB = this.LJIIIZ;
            int i3 = this.LJIIJJI;
            int i4 = this.LJIIL;
            if (i3 == 0 && i4 == 0) {
                c20034513aB.LIZIZ(-1);
            } else {
                c20034513aB.LIZIZ(i3);
            }
            this.LJIIIIZZ = i2;
            this.LJII = C13ZA.LIZ(i2, this.LIZIZ) + i2;
            int i5 = i2 + 1;
            this.LJI = i5;
            this.LJIIJJI = C13ZA.LIZJ(i2, this.LIZIZ);
            this.LJIIL = i2 >= this.LIZJ - 1 ? this.LJ : this.LIZIZ[(i5 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotReader(current=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", key=");
        sbLIZ.append(LJFF());
        sbLIZ.append(", parent=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13ZD(C13ZI c13zi) {
        this.LIZ = c13zi;
        this.LIZIZ = c13zi.LL;
        int i = c13zi.LLILLJJLI;
        this.LIZJ = i;
        this.LIZLLL = c13zi.LLILLL;
        this.LJ = c13zi.LLILZ;
        this.LJII = i;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = new C20034513aB();
    }

    public final C13Z7 LIZ(int i) {
        ArrayList<C13Z7> arrayList = this.LIZ.LLJ;
        int iLJ = C13ZA.LJ(arrayList, i, this.LIZJ);
        if (iLJ < 0) {
            C13Z7 c13z7 = new C13Z7(i);
            ListProtector.add(arrayList, -(iLJ + 1), c13z7);
            return c13z7;
        }
        return (C13Z7) ListProtector.get(arrayList, iLJ);
    }

    public final Object LJII(int i) {
        return LJIILIIL(i, this.LIZIZ);
    }

    public final int LJIIIIZZ(int i) {
        return C13ZA.LIZ(i, this.LIZIZ);
    }

    public final boolean LJIIIZ(int i) {
        if ((this.LIZIZ[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final Object LJIIJJI(int i) {
        int[] iArr = this.LIZIZ;
        int i2 = i * 5;
        if ((iArr[i2 + 1] & 1073741824) != 0) {
            return this.LIZLLL[iArr[i2 + 4]];
        }
        return null;
    }

    public final int LJIIL(int i) {
        return this.LIZIZ[(i * 5) + 1] & 67108863;
    }

    public final int LJIILJJIL(int i) {
        return this.LIZIZ[(i * 5) + 2];
    }

    public final void LJIILL(int i) {
        int i2;
        if (this.LJIIJ != 0) {
            s.LIZJ("Cannot reposition while in an empty region");
        }
        this.LJI = i;
        int i3 = this.LIZJ;
        if (i < i3) {
            i2 = this.LIZIZ[(i * 5) + 2];
        } else {
            i2 = -1;
        }
        this.LJIIIIZZ = i2;
        if (i2 < 0) {
            this.LJII = i3;
        } else {
            this.LJII = i2 + C13ZA.LIZ(i2, this.LIZIZ);
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
    }

    public final Object LIZIZ(int i, int[] iArr) {
        int iBitCount;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            Object[] objArr = this.LIZLLL;
            if (i2 >= iArr.length) {
                iBitCount = iArr.length;
            } else {
                iBitCount = iArr[i2 + 4] + Integer.bitCount(i3 >> 29);
            }
            return objArr[iBitCount];
        }
        InterfaceC1680500tpg.LIZ.getClass();
        return C1680510tph.LIZIZ;
    }

    public final Object LJI(int i, int i2) {
        int i3;
        int iLIZJ = C13ZA.LIZJ(i, this.LIZIZ);
        int i4 = i + 1;
        if (i4 < this.LIZJ) {
            i3 = this.LIZIZ[(i4 * 5) + 4];
        } else {
            i3 = this.LJ;
        }
        int i5 = iLIZJ + i2;
        if (i5 < i3) {
            return this.LIZLLL[i5];
        }
        InterfaceC1680500tpg.LIZ.getClass();
        return C1680510tph.LIZIZ;
    }

    public final Object LJIILIIL(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.LIZLLL[iArr[i2 + 4] + Integer.bitCount(i3 >> 30)];
        }
        return null;
    }
}
