package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13fN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20066713fN<E> implements Cloneable {
    public /* synthetic */ boolean LL;
    public /* synthetic */ long[] LLILLJJLI;
    public /* synthetic */ Object[] LLILLL;
    public /* synthetic */ int LLILZ;

    public C20066713fN() {
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

    public final int LJIIJJI() {
        if (this.LL) {
            int i = this.LLILZ;
            long[] jArr = this.LLILLJJLI;
            Object[] objArr = this.LLILLL;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C20067913fZ.LIZ) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.LL = false;
            this.LLILZ = i2;
        }
        return this.LLILZ;
    }

    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C20066713fN<E> clone() {
        C20066713fN<E> c20066713fN = (C20066713fN) super.clone();
        c20066713fN.LLILLJJLI = (long[]) this.LLILLJJLI.clone();
        c20066713fN.LLILLL = (Object[]) this.LLILLL.clone();
        return c20066713fN;
    }

    public final boolean LJII() {
        return LJIIJJI() == 0;
    }

    public final String toString() {
        if (LJIIJJI() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LLILZ * 28);
        sb.append('{');
        int i = this.LLILZ;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(LJIIIIZZ(i2));
            sb.append('=');
            E eLJIIL = LJIIL(i2);
            if (eLJIIL != sb) {
                sb.append(eLJIIL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C20066713fN(int i) {
        if (i == 0) {
            this.LLILLJJLI = C830540Wi4.LIZIZ;
            this.LLILLL = C830540Wi4.LIZJ;
            return;
        }
        int i2 = i * 8;
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
        int i5 = i2 / 8;
        this.LLILLJJLI = new long[i5];
        this.LLILLL = new Object[i5];
    }

    public final boolean LIZLLL(long j) {
        if (LJI(j) >= 0) {
            return true;
        }
        return false;
    }

    public final E LJ(long j) {
        E e;
        int iLIZIZ = C830540Wi4.LIZIZ(this.LLILZ, j, this.LLILLJJLI);
        if (iLIZIZ < 0 || (e = (E) this.LLILLL[iLIZIZ]) == C20067913fZ.LIZ) {
            return null;
        }
        return e;
    }

    public final int LJI(long j) {
        if (this.LL) {
            int i = this.LLILZ;
            long[] jArr = this.LLILLJJLI;
            Object[] objArr = this.LLILLL;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C20067913fZ.LIZ) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.LL = false;
            this.LLILZ = i2;
        }
        return C830540Wi4.LIZIZ(this.LLILZ, j, this.LLILLJJLI);
    }

    public final long LJIIIIZZ(int i) {
        boolean z;
        if (i >= 0 && i < this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LL) {
                int i2 = this.LLILZ;
                long[] jArr = this.LLILLJJLI;
                Object[] objArr = this.LLILLL;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != C20067913fZ.LIZ) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.LL = false;
                this.LLILZ = i3;
            }
            return this.LLILLJJLI[i];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected index to be within 0..size()-1, but was ");
        sbLIZ.append(i);
        C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public final void LJIIJ(long j) {
        int iLIZIZ = C830540Wi4.LIZIZ(this.LLILZ, j, this.LLILLJJLI);
        if (iLIZIZ >= 0) {
            Object[] objArr = this.LLILLL;
            Object obj = objArr[iLIZIZ];
            Object obj2 = C20067913fZ.LIZ;
            if (obj != obj2) {
                objArr[iLIZIZ] = obj2;
                this.LL = true;
            }
        }
    }

    public final E LJIIL(int i) {
        boolean z;
        if (i >= 0 && i < this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LL) {
                int i2 = this.LLILZ;
                long[] jArr = this.LLILLJJLI;
                Object[] objArr = this.LLILLL;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != C20067913fZ.LIZ) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.LL = false;
                this.LLILZ = i3;
            }
            return (E) this.LLILLL[i];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected index to be within 0..size()-1, but was ");
        sbLIZ.append(i);
        C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public /* synthetic */ C20066713fN(Object obj) {
        this(10);
    }

    public final void LIZ(long j, E e) {
        int i = this.LLILZ;
        if (i != 0 && j <= this.LLILLJJLI[i - 1]) {
            LJIIIZ(j, e);
            return;
        }
        if (this.LL) {
            long[] jArr = this.LLILLJJLI;
            if (i >= jArr.length) {
                Object[] objArr = this.LLILLL;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != C20067913fZ.LIZ) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.LL = false;
                this.LLILZ = i2;
            }
        }
        int i4 = this.LLILZ;
        if (i4 >= this.LLILLJJLI.length) {
            int i5 = (i4 + 1) * 8;
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
            int i8 = i5 / 8;
            this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, i8);
            this.LLILLL = Arrays.copyOf(this.LLILLL, i8);
        }
        this.LLILLJJLI[i4] = j;
        this.LLILLL[i4] = e;
        this.LLILZ = i4 + 1;
    }

    public final E LJFF(long j, E e) {
        E e2;
        int iLIZIZ = C830540Wi4.LIZIZ(this.LLILZ, j, this.LLILLJJLI);
        if (iLIZIZ >= 0 && (e2 = (E) this.LLILLL[iLIZIZ]) != C20067913fZ.LIZ) {
            return e2;
        }
        return e;
    }

    public final void LJIIIZ(long j, E e) {
        int iLIZIZ = C830540Wi4.LIZIZ(this.LLILZ, j, this.LLILLJJLI);
        if (iLIZIZ >= 0) {
            this.LLILLL[iLIZIZ] = e;
            return;
        }
        int i = ~iLIZIZ;
        int i2 = this.LLILZ;
        if (i < i2) {
            Object[] objArr = this.LLILLL;
            if (objArr[i] == C20067913fZ.LIZ) {
                this.LLILLJJLI[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.LL) {
            long[] jArr = this.LLILLJJLI;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.LLILLL;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr2[i4];
                    if (obj != C20067913fZ.LIZ) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.LL = false;
                this.LLILZ = i3;
                i = ~C830540Wi4.LIZIZ(i3, j, this.LLILLJJLI);
            }
        }
        int i5 = this.LLILZ;
        if (i5 >= this.LLILLJJLI.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                } else {
                    i7++;
                    if (i7 >= 32) {
                        break;
                    }
                }
            }
            int i9 = i6 / 8;
            this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, i9);
            this.LLILLL = Arrays.copyOf(this.LLILLL, i9);
        }
        int i10 = this.LLILZ - i;
        if (i10 != 0) {
            long[] jArr2 = this.LLILLJJLI;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.LLILLL;
            System.arraycopy(objArr3, i, objArr3, i11, this.LLILZ - i);
        }
        this.LLILLJJLI[i] = j;
        this.LLILLL[i] = e;
        this.LLILZ++;
    }
}
