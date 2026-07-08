package X;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13CU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CU<K, V> {
    public static final C13CU LJ = new C13CU(0, 0, new Object[0], null);
    public int LIZ;
    public int LIZIZ;
    public final C13CS LIZJ;
    public Object[] LIZLLL;

    public C13CU() {
        throw null;
    }

    public final int LIZIZ() {
        if (this.LIZIZ == 0) {
            return this.LIZLLL.length / 2;
        }
        int iBitCount = Integer.bitCount(this.LIZ);
        int length = this.LIZLLL.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += LJIJI(i).LIZIZ();
        }
        return iBitCount;
    }

    public final int LIZJ(Object obj) {
        C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, this.LIZLLL.length), 2);
        int i = c1846520y9SLJIILIIL.LL;
        int i2 = c1846520y9SLJIILIIL.LLILLJJLI;
        int i3 = c1846520y9SLJIILIIL.LLILLL;
        if (i3 > 0) {
            if (i > i2) {
                return -1;
            }
        } else if (i3 >= 0 || i2 > i) {
            return -1;
        }
        while (true) {
            int i4 = i + i3;
            if (Intrinsics.LJFF(obj, this.LIZLLL[i])) {
                return i;
            }
            if (i == i2) {
                return -1;
            }
            i = i4;
        }
    }

    public final boolean LJ(C13CU<K, V> c13cu) {
        if (this == c13cu) {
            return true;
        }
        if (this.LIZIZ != c13cu.LIZIZ || this.LIZ != c13cu.LIZ) {
            return false;
        }
        int length = this.LIZLLL.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (this.LIZLLL[i] != c13cu.LIZLLL[i]) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public final int LJFF(int i) {
        return Integer.bitCount((i - 1) & this.LIZ) * 2;
    }

    public final boolean LJIIIIZZ(int i) {
        if ((i & this.LIZ) != 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ(int i) {
        if ((i & this.LIZIZ) != 0) {
            return true;
        }
        return false;
    }

    public final C13CU<K, V> LJIJI(int i) {
        Object obj = this.LIZLLL[i];
        if (obj != null) {
            return (C13CU) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int LJIJJ(int i) {
        return (this.LIZLLL.length - 1) - Integer.bitCount((i - 1) & this.LIZIZ);
    }

    public final V LJIJJLI(int i) {
        return (V) this.LIZLLL[i + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K1, V1> boolean LJI(C13CU<K1, V1> c13cu, Function2<? super V, ? super V1, Boolean> function2) {
        int i;
        if (this == c13cu) {
            return true;
        }
        int i2 = this.LIZ;
        if (i2 != c13cu.LIZ || (i = this.LIZIZ) != c13cu.LIZIZ) {
            return false;
        }
        if (i2 == 0 && i == 0) {
            Object[] objArr = this.LIZLLL;
            if (objArr.length != c13cu.LIZLLL.length) {
                return false;
            }
            C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, objArr.length), 2);
            if (!(c1846520y9SLJIILIIL instanceof Collection) || !((Collection) c1846520y9SLJIILIIL).isEmpty()) {
                C531650Kt9 c531650Kt9LJIIIIZZ = c1846520y9SLJIILIIL.iterator();
                while (c531650Kt9LJIIIIZZ.LLILLL) {
                    int iNextInt = c531650Kt9LJIIIIZZ.nextInt();
                    Object obj = c13cu.LIZLLL[iNextInt];
                    V1 v1LJIJJLI = c13cu.LJIJJLI(iNextInt);
                    int iLIZJ = LIZJ(obj);
                    if (iLIZJ == -1 || !function2.invoke(LJIJJLI(iLIZJ), v1LJIJJLI).booleanValue()) {
                        return false;
                    }
                }
            }
            return true;
        }
        int iBitCount = Integer.bitCount(i2) * 2;
        C1846520y9S c1846520y9SLJIILIIL2 = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, iBitCount), 2);
        int i3 = c1846520y9SLJIILIIL2.LL;
        int i4 = c1846520y9SLJIILIIL2.LLILLJJLI;
        int i5 = c1846520y9SLJIILIIL2.LLILLL;
        if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
            while (true) {
                int i6 = i3 + i5;
                if (!Intrinsics.LJFF(this.LIZLLL[i3], c13cu.LIZLLL[i3]) || !function2.invoke(LJIJJLI(i3), c13cu.LJIJJLI(i3)).booleanValue()) {
                    return false;
                }
                if (i3 == i4) {
                    break;
                }
                i3 = i6;
            }
        }
        int length = this.LIZLLL.length;
        while (iBitCount < length) {
            int i7 = iBitCount + 1;
            if (!LJIJI(iBitCount).LJI(c13cu.LJIJI(iBitCount), function2)) {
                return false;
            }
            iBitCount = i7;
        }
        return true;
    }

    public final C13CU<K, V> LJIIJJI(int i, C13CF<K, V> c13cf) {
        c13cf.LJFF(c13cf.LIZJ() - 1);
        c13cf.LLILZ = LJIJJLI(i);
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 2) {
            return null;
        }
        if (this.LIZJ == c13cf.LLILLJJLI) {
            this.LIZLLL = C13CV.LIZIZ(i, objArr);
            return this;
        }
        return new C13CU<>(0, 0, C13CV.LIZIZ(i, objArr), c13cf.LLILLJJLI);
    }

    public final boolean LIZLLL(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (LJIIIIZZ(i3)) {
            return Intrinsics.LJFF(obj, this.LIZLLL[LJFF(i3)]);
        }
        if (!LJIIIZ(i3)) {
            return false;
        }
        C13CU<K, V> c13cuLJIJI = LJIJI(LJIJJ(i3));
        if (i2 == 30) {
            if (c13cuLJIJI.LIZJ(obj) != -1) {
                return true;
            }
            return false;
        }
        return c13cuLJIJI.LIZLLL(i, i2 + 5, obj);
    }

    public final Object LJII(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (LJIIIIZZ(i3)) {
            int iLJFF = LJFF(i3);
            if (!Intrinsics.LJFF(obj, this.LIZLLL[iLJFF])) {
                return null;
            }
            return LJIJJLI(iLJFF);
        }
        if (!LJIIIZ(i3)) {
            return null;
        }
        C13CU<K, V> c13cuLJIJI = LJIJI(LJIJJ(i3));
        if (i2 == 30) {
            int iLIZJ = c13cuLJIJI.LIZJ(obj);
            if (iLIZJ == -1) {
                return null;
            }
            return c13cuLJIJI.LJIJJLI(iLIZJ);
        }
        return c13cuLJIJI.LJII(i, i2 + 5, obj);
    }

    public final C13CU<K, V> LJIILLIIL(int i, int i2, C13CF<K, V> c13cf) {
        c13cf.LJFF(c13cf.LIZJ() - 1);
        c13cf.LLILZ = LJIJJLI(i);
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 2) {
            return null;
        }
        if (this.LIZJ == c13cf.LLILLJJLI) {
            this.LIZLLL = C13CV.LIZIZ(i, objArr);
            this.LIZ ^= i2;
            return this;
        }
        return new C13CU<>(i2 ^ this.LIZ, this.LIZIZ, C13CV.LIZIZ(i, objArr), c13cf.LLILLJJLI);
    }

    public final C13CU<K, V> LJIJ(int i, C13CU<K, V> c13cu, C13CS c13cs) {
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 1 && c13cu.LIZLLL.length == 2 && c13cu.LIZIZ == 0) {
            c13cu.LIZ = this.LIZIZ;
            return c13cu;
        }
        if (this.LIZJ == c13cs) {
            objArr[i] = c13cu;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c13cu;
        return new C13CU<>(this.LIZ, this.LIZIZ, objArrCopyOf, c13cs);
    }

    public C13CU(int i, int i2, Object[] objArr, C13CS c13cs) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c13cs;
        this.LIZLLL = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [X.13CU] */
    /* JADX WARN: Type inference failed for: r9v13, types: [X.13CU] */
    /* JADX WARN: Type inference failed for: r9v14, types: [X.13CU] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.13CU] */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.13CU] */
    /* JADX WARN: Type inference failed for: r9v9, types: [X.13CU] */
    public final C13CU<K, V> LJIILIIL(C13CU<K, V> c13cu, int i, C07WU c07wu, C13CF<K, V> c13cf) {
        C13CU<K, V> c13cu2;
        int iHashCode;
        int iHashCode2;
        C13CU<K, V> c13cuLJIJI;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        if (this == c13cu) {
            c07wu.LIZ += LIZIZ();
            return this;
        }
        if (i > 30) {
            C13CS c13cs = c13cf.LLILLJJLI;
            Object[] objArr = this.LIZLLL;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + c13cu.LIZLLL.length);
            int length = this.LIZLLL.length;
            C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, c13cu.LIZLLL.length), 2);
            int i2 = c1846520y9SLJIILIIL.LL;
            int i3 = c1846520y9SLJIILIIL.LLILLJJLI;
            int i4 = c1846520y9SLJIILIIL.LLILLL;
            if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                while (true) {
                    int i5 = i2 + i4;
                    if (LIZJ(c13cu.LIZLLL[i2]) != -1) {
                        c07wu.LIZ++;
                    } else {
                        Object[] objArr2 = c13cu.LIZLLL;
                        objArrCopyOf[length] = objArr2[i2];
                        objArrCopyOf[length + 1] = objArr2[i2 + 1];
                        length += 2;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2 = i5;
                }
            }
            if (length == this.LIZLLL.length) {
                return this;
            }
            if (length == c13cu.LIZLLL.length) {
                return c13cu;
            }
            if (length == objArrCopyOf.length) {
                return new C13CU<>(0, 0, objArrCopyOf, c13cs);
            }
            return new C13CU<>(0, 0, Arrays.copyOf(objArrCopyOf, length), c13cs);
        }
        int i6 = this.LIZIZ | c13cu.LIZIZ;
        int i7 = this.LIZ;
        int i8 = c13cu.LIZ;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (Intrinsics.LJFF(this.LIZLLL[LJFF(iLowestOneBit)], c13cu.LIZLLL[c13cu.LJFF(iLowestOneBit)])) {
                i9 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i9) == 0) {
            if (Intrinsics.LJFF(this.LIZJ, c13cf.LLILLJJLI) && this.LIZ == i9 && this.LIZIZ == i6) {
                c13cu2 = this;
            } else {
                c13cu2 = new C13CU<>(i9, i6, new Object[(Integer.bitCount(i9) * 2) + Integer.bitCount(i6)], null);
            }
            int i11 = 0;
            while (i6 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i6);
                ?? r12 = c13cu2.LIZLLL;
                int length2 = (r12.length - 1) - i11;
                if (LJIIIZ(iLowestOneBit2)) {
                    c13cuLJIJI = LJIJI(LJIJJ(iLowestOneBit2));
                    if (c13cu.LJIIIZ(iLowestOneBit2)) {
                        c13cuLJIJI = (C13CU<K, V>) c13cuLJIJI.LJIILIIL(c13cu.LJIJI(c13cu.LJIJJ(iLowestOneBit2)), i + 5, c07wu, c13cf);
                    } else if (c13cu.LJIIIIZZ(iLowestOneBit2)) {
                        int iLJFF = c13cu.LJFF(iLowestOneBit2);
                        Object obj = c13cu.LIZLLL[iLJFF];
                        V vLJIJJLI = c13cu.LJIJJLI(iLJFF);
                        int i12 = c13cf.LLILZLL;
                        if (obj == null) {
                            iHashCode5 = 0;
                        } else {
                            iHashCode5 = obj.hashCode();
                        }
                        c13cuLJIJI = (C13CU<K, V>) c13cuLJIJI.LJIIL(iHashCode5, obj, vLJIJJLI, i + 5, c13cf);
                        if (c13cf.LLILZLL == i12) {
                            c07wu.LIZ++;
                        }
                    }
                } else if (c13cu.LJIIIZ(iLowestOneBit2)) {
                    c13cuLJIJI = c13cu.LJIJI(c13cu.LJIJJ(iLowestOneBit2));
                    if (LJIIIIZZ(iLowestOneBit2)) {
                        int iLJFF2 = LJFF(iLowestOneBit2);
                        Object obj2 = this.LIZLLL[iLJFF2];
                        if (obj2 == null) {
                            iHashCode3 = 0;
                        } else {
                            iHashCode3 = obj2.hashCode();
                        }
                        int i13 = i + 5;
                        if (c13cuLJIJI.LIZLLL(iHashCode3, i13, obj2)) {
                            c07wu.LIZ++;
                        } else {
                            V vLJIJJLI2 = LJIJJLI(iLJFF2);
                            if (obj2 == null) {
                                iHashCode4 = 0;
                            } else {
                                iHashCode4 = obj2.hashCode();
                            }
                            c13cuLJIJI = (C13CU<K, V>) c13cuLJIJI.LJIIL(iHashCode4, obj2, vLJIJJLI2, i13, c13cf);
                        }
                    }
                } else {
                    int iLJFF3 = LJFF(iLowestOneBit2);
                    Object obj3 = this.LIZLLL[iLJFF3];
                    V vLJIJJLI3 = LJIJJLI(iLJFF3);
                    int iLJFF4 = c13cu.LJFF(iLowestOneBit2);
                    Object obj4 = c13cu.LIZLLL[iLJFF4];
                    V vLJIJJLI4 = c13cu.LJIJJLI(iLJFF4);
                    if (obj3 == null) {
                        iHashCode = 0;
                    } else {
                        iHashCode = obj3.hashCode();
                    }
                    if (obj4 == null) {
                        iHashCode2 = 0;
                    } else {
                        iHashCode2 = obj4.hashCode();
                    }
                    c13cuLJIJI = (C13CU<K, V>) LJIIJ(iHashCode, obj3, vLJIJJLI3, iHashCode2, obj4, vLJIJJLI4, i + 5, c13cf.LLILLJJLI);
                }
                r12[length2] = c13cuLJIJI;
                i11++;
                i6 ^= iLowestOneBit2;
            }
            int i14 = 0;
            while (i9 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i9);
                int i15 = i14 * 2;
                if (!c13cu.LJIIIIZZ(iLowestOneBit3)) {
                    int iLJFF5 = LJFF(iLowestOneBit3);
                    Object[] objArr3 = c13cu2.LIZLLL;
                    objArr3[i15] = this.LIZLLL[iLJFF5];
                    objArr3[i15 + 1] = LJIJJLI(iLJFF5);
                } else {
                    int iLJFF6 = c13cu.LJFF(iLowestOneBit3);
                    Object[] objArr4 = c13cu2.LIZLLL;
                    objArr4[i15] = c13cu.LIZLLL[iLJFF6];
                    objArr4[i15 + 1] = c13cu.LJIJJLI(iLJFF6);
                    if (LJIIIIZZ(iLowestOneBit3)) {
                        c07wu.LIZ++;
                    }
                }
                i14++;
                i9 ^= iLowestOneBit3;
            }
            if (LJ(c13cu2)) {
                return this;
            }
            if (c13cu.LJ(c13cu2)) {
                return c13cu;
            }
            return c13cu2;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final C13CU<K, V> LJIILJJIL(int i, K k, int i2, C13CF<K, V> c13cf) {
        C13CU<K, V> c13cuLJIILJJIL;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJIIIIZZ(i3)) {
            int iLJFF = LJFF(i3);
            if (!Intrinsics.LJFF(k, this.LIZLLL[iLJFF])) {
                return this;
            }
            return LJIILLIIL(iLJFF, i3, c13cf);
        }
        if (!LJIIIZ(i3)) {
            return this;
        }
        int iLJIJJ = LJIJJ(i3);
        C13CU<K, V> c13cuLJIJI = LJIJI(iLJIJJ);
        if (i2 == 30) {
            int iLIZJ = c13cuLJIJI.LIZJ(k);
            if (iLIZJ != -1) {
                c13cuLJIILJJIL = c13cuLJIJI.LJIIJJI(iLIZJ, c13cf);
            } else {
                c13cuLJIILJJIL = c13cuLJIJI;
            }
        } else {
            c13cuLJIILJJIL = c13cuLJIJI.LJIILJJIL(i, k, i2 + 5, c13cf);
        }
        return LJIIZILJ(c13cuLJIJI, c13cuLJIILJJIL, iLJIJJ, i3, c13cf.LLILLJJLI);
    }

    public final C13CU<K, V> LJIIL(int i, K k, V v, int i2, C13CF<K, V> c13cf) {
        C13CU<K, V> c13cuLJIIL;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJIIIIZZ(i3)) {
            int iLJFF = LJFF(i3);
            if (Intrinsics.LJFF(k, this.LIZLLL[iLJFF])) {
                c13cf.LLILZ = LJIJJLI(iLJFF);
                if (LJIJJLI(iLJFF) == v) {
                    return this;
                }
                if (this.LIZJ == c13cf.LLILLJJLI) {
                    this.LIZLLL[iLJFF + 1] = v;
                    return this;
                }
                c13cf.LLILZIL++;
                Object[] objArr = this.LIZLLL;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iLJFF + 1] = v;
                return new C13CU<>(this.LIZ, this.LIZIZ, objArrCopyOf, c13cf.LLILLJJLI);
            }
            c13cf.LJFF(c13cf.LIZJ() + 1);
            C13CS c13cs = c13cf.LLILLJJLI;
            if (this.LIZJ == c13cs) {
                this.LIZLLL = LIZ(iLJFF, i3, i, k, v, i2, c13cs);
                this.LIZ ^= i3;
                this.LIZIZ |= i3;
                return this;
            }
            return new C13CU<>(this.LIZ ^ i3, this.LIZIZ | i3, LIZ(iLJFF, i3, i, k, v, i2, c13cs), c13cs);
        }
        if (LJIIIZ(i3)) {
            int iLJIJJ = LJIJJ(i3);
            C13CU<K, V> c13cuLJIJI = LJIJI(iLJIJJ);
            if (i2 == 30) {
                int iLIZJ = c13cuLJIJI.LIZJ(k);
                if (iLIZJ != -1) {
                    c13cf.LLILZ = c13cuLJIJI.LJIJJLI(iLIZJ);
                    if (c13cuLJIJI.LIZJ == c13cf.LLILLJJLI) {
                        c13cuLJIJI.LIZLLL[iLIZJ + 1] = v;
                        c13cuLJIIL = c13cuLJIJI;
                    } else {
                        c13cf.LLILZIL++;
                        Object[] objArr2 = c13cuLJIJI.LIZLLL;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[iLIZJ + 1] = v;
                        c13cuLJIIL = new C13CU<>(0, 0, objArrCopyOf2, c13cf.LLILLJJLI);
                    }
                } else {
                    c13cf.LJFF(c13cf.LIZJ() + 1);
                    c13cuLJIIL = new C13CU<>(0, 0, C13CV.LIZ(0, k, v, c13cuLJIJI.LIZLLL), c13cf.LLILLJJLI);
                }
            } else {
                c13cuLJIIL = c13cuLJIJI.LJIIL(i, k, v, i2 + 5, c13cf);
            }
            if (c13cuLJIJI == c13cuLJIIL) {
                return this;
            }
            return LJIJ(iLJIJJ, c13cuLJIIL, c13cf.LLILLJJLI);
        }
        c13cf.LJFF(c13cf.LIZJ() + 1);
        C13CS c13cs2 = c13cf.LLILLJJLI;
        int iLJFF2 = LJFF(i3);
        if (this.LIZJ == c13cs2) {
            this.LIZLLL = C13CV.LIZ(iLJFF2, k, v, this.LIZLLL);
            this.LIZ |= i3;
            return this;
        }
        return new C13CU<>(this.LIZ | i3, this.LIZIZ, C13CV.LIZ(iLJFF2, k, v, this.LIZLLL), c13cs2);
    }

    public final C13CU<K, V> LJIILL(int i, K k, V v, int i2, C13CF<K, V> c13cf) {
        C13CU<K, V> c13cuLJIILL;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJIIIIZZ(i3)) {
            int iLJFF = LJFF(i3);
            if (!Intrinsics.LJFF(k, this.LIZLLL[iLJFF]) || !Intrinsics.LJFF(v, LJIJJLI(iLJFF))) {
                return this;
            }
            return LJIILLIIL(iLJFF, i3, c13cf);
        }
        if (!LJIIIZ(i3)) {
            return this;
        }
        int iLJIJJ = LJIJJ(i3);
        C13CU<K, V> c13cuLJIJI = LJIJI(iLJIJJ);
        if (i2 == 30) {
            int iLIZJ = c13cuLJIJI.LIZJ(k);
            if (iLIZJ != -1 && Intrinsics.LJFF(v, c13cuLJIJI.LJIJJLI(iLIZJ))) {
                c13cuLJIILL = c13cuLJIJI.LJIIJJI(iLIZJ, c13cf);
            } else {
                c13cuLJIILL = c13cuLJIJI;
            }
        } else {
            c13cuLJIILL = c13cuLJIJI.LJIILL(i, k, v, i2 + 5, c13cf);
        }
        return LJIIZILJ(c13cuLJIJI, c13cuLJIILL, iLJIJJ, i3, c13cf.LLILLJJLI);
    }

    public final C13CU<K, V> LJIIZILJ(C13CU<K, V> c13cu, C13CU<K, V> c13cu2, int i, int i2, C13CS c13cs) {
        if (c13cu2 == null) {
            Object[] objArr = this.LIZLLL;
            if (objArr.length == 1) {
                return null;
            }
            if (this.LIZJ == c13cs) {
                Object[] objArr2 = new Object[objArr.length - 1];
                C13DL.LJ(objArr, objArr2, 0, i, 6);
                int i3 = i + 1;
                System.arraycopy(objArr, i3, objArr2, i, objArr.length - i3);
                this.LIZLLL = objArr2;
                this.LIZIZ ^= i2;
            } else {
                Object[] objArr3 = new Object[objArr.length - 1];
                C13DL.LJ(objArr, objArr3, 0, i, 6);
                int i4 = i + 1;
                System.arraycopy(objArr, i4, objArr3, i, objArr.length - i4);
                return new C13CU<>(this.LIZ, i2 ^ this.LIZIZ, objArr3, c13cs);
            }
        } else if (c13cu != c13cu2) {
            return LJIJ(i, c13cu2, c13cs);
        }
        return this;
    }

    public final Object[] LIZ(int i, int i2, int i3, K k, V v, int i4, C13CS c13cs) {
        int iHashCode;
        Object obj = this.LIZLLL[i];
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        C13CU c13cuLJIIJ = LJIIJ(iHashCode, obj, LJIJJLI(i), i3, k, v, i4 + 5, c13cs);
        int iLJIJJ = LJIJJ(i2) + 1;
        Object[] objArr = this.LIZLLL;
        int i5 = iLJIJJ - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        C13DL.LJ(objArr, objArr2, 0, i, 6);
        int i6 = i + 2;
        System.arraycopy(objArr, i6, objArr2, i, iLJIJJ - i6);
        objArr2[i5] = c13cuLJIIJ;
        System.arraycopy(objArr, iLJIJJ, objArr2, i5 + 1, objArr.length - iLJIJJ);
        return objArr2;
    }

    public static C13CU LJIIJ(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C13CS c13cs) {
        if (i3 > 30) {
            return new C13CU(0, 0, new Object[]{obj, obj2, obj3, obj4}, c13cs);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            Object[] objArr = new Object[4];
            if (i4 < i5) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new C13CU((1 << i5) | (1 << i4), 0, objArr, c13cs);
        }
        return new C13CU(0, 1 << i4, new Object[]{LJIIJ(i, obj, obj2, i2, obj3, obj4, i3 + 5, c13cs)}, c13cs);
    }
}
