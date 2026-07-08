package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19971213Cc<K, V> {
    public static final C19971213Cc LJ = new C19971213Cc(0, 0, new Object[0], null);
    public int LIZ;
    public int LIZIZ;
    public final C19972913Ct LIZJ;
    public Object[] LIZLLL;

    public C19971213Cc() {
        throw null;
    }

    public final int LIZIZ() {
        if (this.LIZIZ == 0) {
            return this.LIZLLL.length / 2;
        }
        int iBitCount = Integer.bitCount(this.LIZ);
        int length = this.LIZLLL.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += LJIJ(i).LIZIZ();
        }
        return iBitCount;
    }

    public final boolean LIZJ(K k) {
        C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, this.LIZLLL.length), 2);
        int i = c1846520y9SLJIILIIL.LL;
        int i2 = c1846520y9SLJIILIIL.LLILLJJLI;
        int i3 = c1846520y9SLJIILIIL.LLILLL;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (!Intrinsics.LJFF(k, this.LIZLLL[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean LJ(C19971213Cc<K, V> c19971213Cc) {
        if (this == c19971213Cc) {
            return true;
        }
        if (this.LIZIZ != c19971213Cc.LIZIZ || this.LIZ != c19971213Cc.LIZ) {
            return false;
        }
        int length = this.LIZLLL.length;
        for (int i = 0; i < length; i++) {
            if (this.LIZLLL[i] != c19971213Cc.LIZLLL[i]) {
                return false;
            }
        }
        return true;
    }

    public final int LJFF(int i) {
        return Integer.bitCount((i - 1) & this.LIZ) * 2;
    }

    public final boolean LJII(int i) {
        if ((i & this.LIZ) != 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ(int i) {
        if ((i & this.LIZIZ) != 0) {
            return true;
        }
        return false;
    }

    public final C19971213Cc<K, V> LJIJ(int i) {
        return (C19971213Cc) this.LIZLLL[i];
    }

    public final int LJIJI(int i) {
        return (this.LIZLLL.length - 1) - Integer.bitCount((i - 1) & this.LIZIZ);
    }

    public final V LJJ(int i) {
        return (V) this.LIZLLL[i + 1];
    }

    public final C19971213Cc<K, V> LJIIJ(int i, C19971113Cb<K, V> c19971113Cb) {
        c19971113Cb.LJFF(c19971113Cb.LIZJ() - 1);
        c19971113Cb.LLILZ = LJJ(i);
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 2) {
            return null;
        }
        if (this.LIZJ == c19971113Cb.LLILLJJLI) {
            this.LIZLLL = C19972213Cm.LIZIZ(i, objArr);
            return this;
        }
        return new C19971213Cc<>(0, 0, C19972213Cm.LIZIZ(i, objArr), c19971113Cb.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZLLL(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            return Intrinsics.LJFF(obj, this.LIZLLL[LJFF(i3)]);
        }
        if (LJIIIIZZ(i3)) {
            C19971213Cc<K, V> c19971213CcLJIJ = LJIJ(LJIJI(i3));
            if (i2 == 30) {
                return c19971213CcLJIJ.LIZJ(obj);
            }
            return c19971213CcLJIJ.LIZLLL(i, i2 + 5, obj);
        }
        return false;
    }

    public final Object LJI(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int iLJFF = LJFF(i3);
            if (!Intrinsics.LJFF(obj, this.LIZLLL[iLJFF])) {
                return null;
            }
            return LJJ(iLJFF);
        }
        if (!LJIIIIZZ(i3)) {
            return null;
        }
        C19971213Cc<K, V> c19971213CcLJIJ = LJIJ(LJIJI(i3));
        if (i2 == 30) {
            C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, c19971213CcLJIJ.LIZLLL.length), 2);
            int i4 = c1846520y9SLJIILIIL.LL;
            int i5 = c1846520y9SLJIILIIL.LLILLJJLI;
            int i6 = c1846520y9SLJIILIIL.LLILLL;
            if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                while (!Intrinsics.LJFF(obj, c19971213CcLJIJ.LIZLLL[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                return c19971213CcLJIJ.LJJ(i4);
            }
            return null;
        }
        return c19971213CcLJIJ.LJI(i, i2 + 5, obj);
    }

    public final C19971213Cc<K, V> LJIILL(int i, int i2, C19971113Cb<K, V> c19971113Cb) {
        c19971113Cb.LJFF(c19971113Cb.LIZJ() - 1);
        c19971113Cb.LLILZ = LJJ(i);
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 2) {
            return null;
        }
        if (this.LIZJ == c19971113Cb.LLILLJJLI) {
            this.LIZLLL = C19972213Cm.LIZIZ(i, objArr);
            this.LIZ ^= i2;
            return this;
        }
        return new C19971213Cc<>(i2 ^ this.LIZ, this.LIZIZ, C19972213Cm.LIZIZ(i, objArr), c19971113Cb.LLILLJJLI);
    }

    public final C19971213Cc<K, V> LJIIZILJ(int i, C19971213Cc<K, V> c19971213Cc, C19972913Ct c19972913Ct) {
        Object[] objArr = this.LIZLLL;
        if (objArr.length == 1 && c19971213Cc.LIZLLL.length == 2 && c19971213Cc.LIZIZ == 0) {
            c19971213Cc.LIZ = this.LIZIZ;
            return c19971213Cc;
        }
        if (this.LIZJ == c19972913Ct) {
            objArr[i] = c19971213Cc;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c19971213Cc;
        return new C19971213Cc<>(this.LIZ, this.LIZIZ, objArrCopyOf, c19972913Ct);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r1 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19971213Cc LJIJJLI(int r12, int r13, java.lang.Object r14) {
        /*
            r11 = this;
            int r0 = r12 >> r13
            r0 = r0 & 31
            r3 = 1
            int r5 = r3 << r0
            boolean r0 = r11.LJII(r5)
            r8 = 2
            r4 = 0
            if (r0 == 0) goto L33
            int r2 = r11.LJFF(r5)
            java.lang.Object[] r0 = r11.LIZLLL
            r0 = r0[r2]
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r14, r0)
            if (r0 == 0) goto L32
            java.lang.Object[] r1 = r11.LIZLLL
            int r0 = r1.length
            if (r0 == r8) goto L31
            java.lang.Object[] r3 = X.C19972213Cm.LIZIZ(r2, r1)
            X.13Cc r2 = new X.13Cc
            int r1 = r11.LIZ
            r1 = r1 ^ r5
            int r0 = r11.LIZIZ
            r2.<init>(r1, r0, r3, r4)
            return r2
        L31:
            return r4
        L32:
            return r11
        L33:
            boolean r0 = r11.LJIIIIZZ(r5)
            if (r0 == 0) goto La1
            int r2 = r11.LJIJI(r5)
            X.13Cc r6 = r11.LJIJ(r2)
            r0 = 30
            if (r13 != r0) goto L84
            java.lang.Object[] r0 = r6.LIZLLL
            int r0 = r0.length
            r7 = 0
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r7, r0)
            X.0y9S r0 = X.C13LZ.LJIILIIL(r0, r8)
            int r9 = r0.LL
            int r10 = r0.LLILLJJLI
            int r1 = r0.LLILLL
            if (r1 <= 0) goto L63
            if (r9 <= r10) goto L67
        L5b:
            r1 = r6
        L5c:
            if (r6 == r1) goto La0
            X.13Cc r4 = r11.LJIL(r2, r5, r1)
        L62:
            return r4
        L63:
            if (r1 >= 0) goto L5b
            if (r10 > r9) goto L5b
        L67:
            java.lang.Object[] r0 = r6.LIZLLL
            r0 = r0[r9]
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r14, r0)
            if (r0 == 0) goto L80
            java.lang.Object[] r1 = r6.LIZLLL
            int r0 = r1.length
            if (r0 == r8) goto L8c
            java.lang.Object[] r0 = X.C19972213Cm.LIZIZ(r9, r1)
            X.13Cc r1 = new X.13Cc
            r1.<init>(r7, r7, r0, r4)
            goto L5c
        L80:
            if (r9 == r10) goto L5b
            int r9 = r9 + r1
            goto L67
        L84:
            int r0 = r13 + 5
            X.13Cc r1 = r6.LJIJJLI(r12, r0, r14)
            if (r1 != 0) goto L5c
        L8c:
            java.lang.Object[] r1 = r11.LIZLLL
            int r0 = r1.length
            if (r0 == r3) goto L62
            java.lang.Object[] r3 = X.C19972213Cm.LIZJ(r2, r1)
            X.13Cc r2 = new X.13Cc
            int r1 = r11.LIZ
            int r0 = r11.LIZIZ
            r5 = r5 ^ r0
            r2.<init>(r1, r5, r3, r4)
            return r2
        La0:
            return r11
        La1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19971213Cc.LJIJJLI(int, int, java.lang.Object):X.13Cc");
    }

    public final C19971213Cc<K, V> LJIL(int i, int i2, C19971213Cc<K, V> c19971213Cc) {
        Object[] objArr = c19971213Cc.LIZLLL;
        if (objArr.length == 2 && c19971213Cc.LIZIZ == 0) {
            if (this.LIZLLL.length == 1) {
                c19971213Cc.LIZ = this.LIZIZ;
                return c19971213Cc;
            }
            int iLJFF = LJFF(i2);
            Object[] objArr2 = this.LIZLLL;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            int i3 = i + 1;
            System.arraycopy(objArrCopyOf, i3, objArrCopyOf, i + 2, objArr2.length - i3);
            System.arraycopy(objArrCopyOf, iLJFF, objArrCopyOf, iLJFF + 2, i - iLJFF);
            objArrCopyOf[iLJFF] = obj;
            objArrCopyOf[iLJFF + 1] = obj2;
            return new C19971213Cc<>(this.LIZ ^ i2, i2 ^ this.LIZIZ, objArrCopyOf, null);
        }
        Object[] objArr3 = this.LIZLLL;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        objArrCopyOf2[i] = c19971213Cc;
        return new C19971213Cc<>(this.LIZ, this.LIZIZ, objArrCopyOf2, null);
    }

    public C19971213Cc(int i, int i2, Object[] objArr, C19972913Ct c19972913Ct) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c19972913Ct;
        this.LIZLLL = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.13Cc, X.13Cc<K, V>] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r9v10, types: [X.13Cc] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13, types: [X.13Cc] */
    /* JADX WARN: Type inference failed for: r9v14, types: [X.13Cc] */
    /* JADX WARN: Type inference failed for: r9v15, types: [X.13Cc] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.13Cc] */
    /* JADX WARN: Type inference failed for: r9v9, types: [X.13Cc] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.13Cc<K, V> to ?? for r26v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:138)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:213)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public final X.C19971213Cc<K, V> LJIIL(X.C19971213Cc<K, V> r27, int r28, X.C19972713Cr r29, X.C19971113Cb<K, V> r30) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19971213Cc.LJIIL(X.13Cc, int, X.13Cr, X.13Cb):X.13Cc");
    }

    public final C19971213Cc<K, V> LJIILIIL(int i, K k, int i2, C19971113Cb<K, V> c19971113Cb) {
        C19971213Cc<K, V> c19971213CcLJIILIIL;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int iLJFF = LJFF(i3);
            if (!Intrinsics.LJFF(k, this.LIZLLL[iLJFF])) {
                return this;
            }
            return LJIILL(iLJFF, i3, c19971113Cb);
        }
        if (!LJIIIIZZ(i3)) {
            return this;
        }
        int iLJIJI = LJIJI(i3);
        C19971213Cc<K, V> c19971213CcLJIJ = LJIJ(iLJIJI);
        if (i2 == 30) {
            C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, c19971213CcLJIJ.LIZLLL.length), 2);
            int i4 = c1846520y9SLJIILIIL.LL;
            int i5 = c1846520y9SLJIILIIL.LLILLJJLI;
            int i6 = c1846520y9SLJIILIIL.LLILLL;
            if (i6 <= 0 ? i6 >= 0 || i5 > i4 : i4 > i5) {
                c19971213CcLJIILIIL = c19971213CcLJIJ;
                break;
            }
            while (!Intrinsics.LJFF(k, c19971213CcLJIJ.LIZLLL[i4])) {
                if (i4 == i5) {
                    c19971213CcLJIILIIL = c19971213CcLJIJ;
                    break;
                }
                i4 += i6;
            }
            c19971213CcLJIILIIL = c19971213CcLJIJ.LJIIJ(i4, c19971113Cb);
        } else {
            c19971213CcLJIILIIL = c19971213CcLJIJ.LJIILIIL(i, k, i2 + 5, c19971113Cb);
        }
        return LJIILLIIL(c19971213CcLJIJ, c19971213CcLJIILIIL, iLJIJI, i3, c19971113Cb.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C19972013Ck LJIJJ(int i, int i2, Object obj, Object obj2) {
        C19972013Ck c19972013CkLJIJJ;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int iLJFF = LJFF(i3);
            if (Intrinsics.LJFF(obj, this.LIZLLL[iLJFF])) {
                if (LJJ(iLJFF) == obj2) {
                    return null;
                }
                Object[] objArr = this.LIZLLL;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iLJFF + 1] = obj2;
                return new C19972013Ck(new C19971213Cc(this.LIZ, this.LIZIZ, objArrCopyOf, null), 0);
            }
            return new C19972013Ck(new C19971213Cc(this.LIZ ^ i3, this.LIZIZ | i3, LIZ(iLJFF, i3, i, obj, obj2, i2, null), null), 1);
        }
        if (LJIIIIZZ(i3)) {
            int iLJIJI = LJIJI(i3);
            C19971213Cc<K, V> c19971213CcLJIJ = LJIJ(iLJIJI);
            if (i2 == 30) {
                C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, c19971213CcLJIJ.LIZLLL.length), 2);
                int i4 = c1846520y9SLJIILIIL.LL;
                int i5 = c1846520y9SLJIILIIL.LLILLJJLI;
                int i6 = c1846520y9SLJIILIIL.LLILLL;
                if (i6 <= 0 ? i6 >= 0 || i5 > i4 : i4 > i5) {
                    c19972013CkLJIJJ = new C19972013Ck(new C19971213Cc(0, 0, C19972213Cm.LIZ(0, obj, obj2, c19971213CcLJIJ.LIZLLL), null), 1);
                    break;
                }
                while (!Intrinsics.LJFF(obj, c19971213CcLJIJ.LIZLLL[i4])) {
                    if (i4 == i5) {
                        c19972013CkLJIJJ = new C19972013Ck(new C19971213Cc(0, 0, C19972213Cm.LIZ(0, obj, obj2, c19971213CcLJIJ.LIZLLL), null), 1);
                        break;
                    }
                    i4 += i6;
                }
                if (obj2 == c19971213CcLJIJ.LJJ(i4)) {
                    return null;
                }
                Object[] objArr2 = c19971213CcLJIJ.LIZLLL;
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                objArrCopyOf2[i4 + 1] = obj2;
                c19972013CkLJIJJ = new C19972013Ck(new C19971213Cc(0, 0, objArrCopyOf2, null), 0);
            } else {
                c19972013CkLJIJJ = c19971213CcLJIJ.LJIJJ(i, i2 + 5, obj, obj2);
                if (c19972013CkLJIJJ == null) {
                    return null;
                }
            }
            c19972013CkLJIJJ.LIZ = LJIL(iLJIJI, i3, c19972013CkLJIJJ.LIZ);
            return c19972013CkLJIJJ;
        }
        return new C19972013Ck(new C19971213Cc(this.LIZ | i3, this.LIZIZ, C19972213Cm.LIZ(LJFF(i3), obj, obj2, this.LIZLLL), null), 1);
    }

    public final C19971213Cc<K, V> LJIIJJI(int i, K k, V v, int i2, C19971113Cb<K, V> c19971113Cb) {
        C19971213Cc<K, V> c19971213CcLJIIJJI;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int iLJFF = LJFF(i3);
            if (Intrinsics.LJFF(k, this.LIZLLL[iLJFF])) {
                c19971113Cb.LLILZ = LJJ(iLJFF);
                if (LJJ(iLJFF) == v) {
                    return this;
                }
                if (this.LIZJ == c19971113Cb.LLILLJJLI) {
                    this.LIZLLL[iLJFF + 1] = v;
                    return this;
                }
                c19971113Cb.LLILZIL++;
                Object[] objArr = this.LIZLLL;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iLJFF + 1] = v;
                return new C19971213Cc<>(this.LIZ, this.LIZIZ, objArrCopyOf, c19971113Cb.LLILLJJLI);
            }
            c19971113Cb.LJFF(c19971113Cb.LLILZLL + 1);
            C19972913Ct c19972913Ct = c19971113Cb.LLILLJJLI;
            if (this.LIZJ == c19972913Ct) {
                this.LIZLLL = LIZ(iLJFF, i3, i, k, v, i2, c19972913Ct);
                this.LIZ ^= i3;
                this.LIZIZ |= i3;
                return this;
            }
            return new C19971213Cc<>(this.LIZ ^ i3, this.LIZIZ | i3, LIZ(iLJFF, i3, i, k, v, i2, c19972913Ct), c19972913Ct);
        }
        if (LJIIIIZZ(i3)) {
            int iLJIJI = LJIJI(i3);
            C19971213Cc<K, V> c19971213CcLJIJ = LJIJ(iLJIJI);
            if (i2 == 30) {
                C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, c19971213CcLJIJ.LIZLLL.length), 2);
                int i4 = c1846520y9SLJIILIIL.LL;
                int i5 = c1846520y9SLJIILIIL.LLILLJJLI;
                int i6 = c1846520y9SLJIILIIL.LLILLL;
                if (i6 <= 0 ? i6 >= 0 || i5 > i4 : i4 > i5) {
                    c19971113Cb.LJFF(c19971113Cb.LLILZLL + 1);
                    c19971213CcLJIIJJI = new C19971213Cc<>(0, 0, C19972213Cm.LIZ(0, k, v, c19971213CcLJIJ.LIZLLL), c19971113Cb.LLILLJJLI);
                    break;
                }
                while (!Intrinsics.LJFF(k, c19971213CcLJIJ.LIZLLL[i4])) {
                    if (i4 == i5) {
                        c19971113Cb.LJFF(c19971113Cb.LLILZLL + 1);
                        c19971213CcLJIIJJI = new C19971213Cc<>(0, 0, C19972213Cm.LIZ(0, k, v, c19971213CcLJIJ.LIZLLL), c19971113Cb.LLILLJJLI);
                        break;
                    }
                    i4 += i6;
                }
                c19971113Cb.LLILZ = c19971213CcLJIJ.LJJ(i4);
                if (c19971213CcLJIJ.LIZJ == c19971113Cb.LLILLJJLI) {
                    c19971213CcLJIJ.LIZLLL[i4 + 1] = v;
                    c19971213CcLJIIJJI = c19971213CcLJIJ;
                } else {
                    c19971113Cb.LLILZIL++;
                    Object[] objArr2 = c19971213CcLJIJ.LIZLLL;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    objArrCopyOf2[i4 + 1] = v;
                    c19971213CcLJIIJJI = new C19971213Cc<>(0, 0, objArrCopyOf2, c19971113Cb.LLILLJJLI);
                }
            } else {
                c19971213CcLJIIJJI = c19971213CcLJIJ.LJIIJJI(i, k, v, i2 + 5, c19971113Cb);
            }
            if (c19971213CcLJIJ == c19971213CcLJIIJJI) {
                return this;
            }
            return LJIIZILJ(iLJIJI, c19971213CcLJIIJJI, c19971113Cb.LLILLJJLI);
        }
        c19971113Cb.LJFF(c19971113Cb.LLILZLL + 1);
        C19972913Ct c19972913Ct2 = c19971113Cb.LLILLJJLI;
        int iLJFF2 = LJFF(i3);
        if (this.LIZJ == c19972913Ct2) {
            this.LIZLLL = C19972213Cm.LIZ(iLJFF2, k, v, this.LIZLLL);
            this.LIZ |= i3;
            return this;
        }
        return new C19971213Cc<>(this.LIZ | i3, this.LIZIZ, C19972213Cm.LIZ(iLJFF2, k, v, this.LIZLLL), c19972913Ct2);
    }

    public final C19971213Cc<K, V> LJIILJJIL(int i, K k, V v, int i2, C19971113Cb<K, V> c19971113Cb) {
        C19971213Cc<K, V> c19971213CcLJIILJJIL;
        int i3 = 1 << ((i >> i2) & 31);
        if (LJII(i3)) {
            int iLJFF = LJFF(i3);
            if (!Intrinsics.LJFF(k, this.LIZLLL[iLJFF]) || !Intrinsics.LJFF(v, LJJ(iLJFF))) {
                return this;
            }
            return LJIILL(iLJFF, i3, c19971113Cb);
        }
        if (!LJIIIIZZ(i3)) {
            return this;
        }
        int iLJIJI = LJIJI(i3);
        C19971213Cc<K, V> c19971213CcLJIJ = LJIJ(iLJIJI);
        if (i2 == 30) {
            C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, c19971213CcLJIJ.LIZLLL.length), 2);
            int i4 = c1846520y9SLJIILIIL.LL;
            int i5 = c1846520y9SLJIILIIL.LLILLJJLI;
            int i6 = c1846520y9SLJIILIIL.LLILLL;
            if (i6 <= 0 ? i6 >= 0 || i5 > i4 : i4 > i5) {
                c19971213CcLJIILJJIL = c19971213CcLJIJ;
            } else {
                while (true) {
                    if (Intrinsics.LJFF(k, c19971213CcLJIJ.LIZLLL[i4]) && Intrinsics.LJFF(v, c19971213CcLJIJ.LJJ(i4))) {
                        c19971213CcLJIILJJIL = c19971213CcLJIJ.LJIIJ(i4, c19971113Cb);
                        break;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
                c19971213CcLJIILJJIL = c19971213CcLJIJ;
            }
        } else {
            c19971213CcLJIILJJIL = c19971213CcLJIJ.LJIILJJIL(i, k, v, i2 + 5, c19971113Cb);
        }
        return LJIILLIIL(c19971213CcLJIJ, c19971213CcLJIILJJIL, iLJIJI, i3, c19971113Cb.LLILLJJLI);
    }

    public final C19971213Cc<K, V> LJIILLIIL(C19971213Cc<K, V> c19971213Cc, C19971213Cc<K, V> c19971213Cc2, int i, int i2, C19972913Ct c19972913Ct) {
        if (c19971213Cc2 == null) {
            Object[] objArr = this.LIZLLL;
            if (objArr.length == 1) {
                return null;
            }
            if (this.LIZJ == c19972913Ct) {
                this.LIZLLL = C19972213Cm.LIZJ(i, objArr);
                this.LIZIZ ^= i2;
            } else {
                return new C19971213Cc<>(this.LIZ, i2 ^ this.LIZIZ, C19972213Cm.LIZJ(i, objArr), c19972913Ct);
            }
        } else if (this.LIZJ == c19972913Ct || c19971213Cc != c19971213Cc2) {
            return LJIIZILJ(i, c19971213Cc2, c19972913Ct);
        }
        return this;
    }

    public final Object[] LIZ(int i, int i2, int i3, K k, V v, int i4, C19972913Ct c19972913Ct) {
        int iHashCode;
        Object obj = this.LIZLLL[i];
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        C19971213Cc c19971213CcLJIIIZ = LJIIIZ(iHashCode, obj, LJJ(i), i3, k, v, i4 + 5, c19972913Ct);
        int iLJIJI = LJIJI(i2) + 1;
        Object[] objArr = this.LIZLLL;
        int i5 = iLJIJI - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        C13DL.LJ(objArr, objArr2, 0, i, 6);
        int i6 = i + 2;
        System.arraycopy(objArr, i6, objArr2, i, iLJIJI - i6);
        objArr2[i5] = c19971213CcLJIIIZ;
        System.arraycopy(objArr, iLJIJI, objArr2, i5 + 1, objArr.length - iLJIJI);
        return objArr2;
    }

    public static C19971213Cc LJIIIZ(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C19972913Ct c19972913Ct) {
        if (i3 > 30) {
            return new C19971213Cc(0, 0, new Object[]{obj, obj2, obj3, obj4}, c19972913Ct);
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
            return new C19971213Cc((1 << i5) | (1 << i4), 0, objArr, c19972913Ct);
        }
        return new C19971213Cc(0, 1 << i4, new Object[]{LJIIIZ(i, obj, obj2, i2, obj3, obj4, i3 + 5, c19972913Ct)}, c19972913Ct);
    }
}
