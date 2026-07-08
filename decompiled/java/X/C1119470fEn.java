package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0fEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119470fEn<E> implements Cloneable {
    public /* synthetic */ boolean LL;
    public /* synthetic */ int[] LLILLJJLI;
    public /* synthetic */ Object[] LLILLL;
    public /* synthetic */ int LLILZ;

    public C1119470fEn() {
        this((Object) null);
    }

    public final void LIZIZ() {
        int i = this.LLILZ;
        Object[] objArr = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.LLILZ = 0;
        this.LL = false;
    }

    public final int LJII() {
        if (this.LL) {
            C1101530elr.LIZ(this);
        }
        return this.LLILZ;
    }

    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C1119470fEn<E> clone() {
        C1119470fEn<E> c1119470fEn = (C1119470fEn) super.clone();
        c1119470fEn.LLILLJJLI = (int[]) this.LLILLJJLI.clone();
        c1119470fEn.LLILLL = (Object[]) this.LLILLL.clone();
        return c1119470fEn;
    }

    public final String toString() {
        if (LJII() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LLILZ * 28);
        sb.append('{');
        int i = this.LLILZ;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(LJ(i2));
            sb.append('=');
            E eLJIIIIZZ = LJIIIIZZ(i2);
            if (eLJIIIIZZ != this) {
                sb.append(eLJIIIIZZ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1119470fEn(int i) {
        if (i == 0) {
            this.LLILLJJLI = C830540Wi4.LIZ;
            this.LLILLL = C830540Wi4.LIZJ;
            return;
        }
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            } else {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            }
        }
        int i5 = i2 / 4;
        this.LLILLJJLI = new int[i5];
        this.LLILLL = new Object[i5];
    }

    public final E LIZLLL(int i) {
        E e;
        int iLIZ = C830540Wi4.LIZ(this.LLILZ, i, this.LLILLJJLI);
        if (iLIZ < 0 || (e = (E) this.LLILLL[iLIZ]) == C1101530elr.LIZ) {
            return null;
        }
        return e;
    }

    public final int LJ(int i) {
        if (this.LL) {
            C1101530elr.LIZ(this);
        }
        return this.LLILLJJLI[i];
    }

    public final void LJI(int i) {
        int iLIZ = C830540Wi4.LIZ(this.LLILZ, i, this.LLILLJJLI);
        if (iLIZ >= 0) {
            Object[] objArr = this.LLILLL;
            Object obj = objArr[iLIZ];
            Object obj2 = C1101530elr.LIZ;
            if (obj != obj2) {
                objArr[iLIZ] = obj2;
                this.LL = true;
            }
        }
    }

    public final E LJIIIIZZ(int i) {
        if (this.LL) {
            C1101530elr.LIZ(this);
        }
        Object[] objArr = this.LLILLL;
        if (i < objArr.length) {
            return (E) objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public /* synthetic */ C1119470fEn(Object obj) {
        this(10);
    }

    public final void LIZ(int i, E e) {
        int i2 = this.LLILZ;
        if (i2 != 0 && i <= this.LLILLJJLI[i2 - 1]) {
            LJFF(i, e);
            return;
        }
        if (this.LL && i2 >= this.LLILLJJLI.length) {
            C1101530elr.LIZ(this);
        }
        int i3 = this.LLILZ;
        if (i3 >= this.LLILLJJLI.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                } else {
                    i5++;
                    if (i5 >= 32) {
                        break;
                    }
                }
            }
            int i7 = i4 / 4;
            this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, i7);
            this.LLILLL = Arrays.copyOf(this.LLILLL, i7);
        }
        this.LLILLJJLI[i3] = i;
        this.LLILLL[i3] = e;
        this.LLILZ = i3 + 1;
    }

    public final void LJFF(int i, E e) {
        int iLIZ = C830540Wi4.LIZ(this.LLILZ, i, this.LLILLJJLI);
        if (iLIZ >= 0) {
            this.LLILLL[iLIZ] = e;
            return;
        }
        int i2 = ~iLIZ;
        int i3 = this.LLILZ;
        if (i2 < i3) {
            Object[] objArr = this.LLILLL;
            if (objArr[i2] == C1101530elr.LIZ) {
                this.LLILLJJLI[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.LL && i3 >= this.LLILLJJLI.length) {
            C1101530elr.LIZ(this);
            i2 = ~C830540Wi4.LIZ(this.LLILZ, i, this.LLILLJJLI);
        }
        int i4 = this.LLILZ;
        if (i4 >= this.LLILLJJLI.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                } else {
                    i6++;
                    if (i6 >= 32) {
                        break;
                    }
                }
            }
            int i8 = i5 / 4;
            this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, i8);
            this.LLILLL = Arrays.copyOf(this.LLILLL, i8);
        }
        int i9 = this.LLILZ - i2;
        if (i9 != 0) {
            int[] iArr = this.LLILLJJLI;
            int i10 = i2 + 1;
            System.arraycopy(iArr, i2, iArr, i10, i9);
            Object[] objArr2 = this.LLILLL;
            System.arraycopy(objArr2, i2, objArr2, i10, this.LLILZ - i2);
        }
        this.LLILLJJLI[i2] = i;
        this.LLILLL[i2] = e;
        this.LLILZ++;
    }
}
