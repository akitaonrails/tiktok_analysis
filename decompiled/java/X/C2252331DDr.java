package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2252331DDr<T> extends AbstractC2252361DDu<C2252381DDw> implements C05YC<T>, InterfaceC346201Wa, InterfaceC23142094y<T> {
    public final int LLILZIL;
    public final int LLILZLL;
    public final EnumC2252401DDy LLIZ;
    public Object[] LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    @Override // X.C01S9
    public final List<T> LIZ() {
        synchronized (this) {
            int iLJIILJJIL = (int) ((LJIILJJIL() + ((long) this.LLJIJIL)) - this.LLJ);
            if (iLJIILJJIL == 0) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(iLJIILJJIL);
            Object[] objArr = this.LLIZLLLIL;
            for (int i = 0; i < iLJIILJJIL; i++) {
                arrayList.add(objArr[((int) (this.LLJ + ((long) i))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // X.C05YC
    public final void LIZIZ() {
        synchronized (this) {
            LJIJI(LJIILJJIL() + ((long) this.LLJIJIL), this.LLJI, LJIILJJIL() + ((long) this.LLJIJIL), LJIILJJIL() + ((long) this.LLJIJIL) + ((long) this.LLJILJIL));
        }
    }

    @Override // X.AbstractC2252361DDu
    public final AbstractC2252411DDz[] LJI() {
        return new C2252381DDw[2];
    }

    @Override // X.C01S9, X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return LJIIJ(this, interfaceC346701Wf, interfaceC1364105Vn);
    }

    @Override // X.AbstractC2252361DDu
    public final AbstractC2252411DDz LJFF() {
        return new C2252381DDw();
    }

    public final void LJIIIZ() {
        if (this.LLILZLL != 0 || this.LLJILJIL > 1) {
            Object[] objArr = this.LLIZLLLIL;
            while (this.LLJILJIL > 0) {
                long jLJIILJJIL = LJIILJJIL();
                int i = this.LLJIJIL;
                int i2 = this.LLJILJIL;
                if (objArr[((int) ((jLJIILJJIL + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != C09IR.LIZ) {
                    return;
                }
                this.LLJILJIL = i2 - 1;
                objArr[((int) (LJIILJJIL() + ((long) (this.LLJIJIL + this.LLJILJIL)))) & (objArr.length - 1)] = null;
            }
        }
    }

    public final void LJIIJJI() {
        Object[] objArr;
        this.LLIZLLLIL[((int) LJIILJJIL()) & (r4.length - 1)] = null;
        this.LLJIJIL--;
        long jLJIILJJIL = LJIILJJIL() + 1;
        if (this.LLJ < jLJIILJJIL) {
            this.LLJ = jLJIILJJIL;
        }
        if (this.LLJI < jLJIILJJIL) {
            if (this.LLILLJJLI != 0 && (objArr = this.LL) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        C2252381DDw c2252381DDw = (C2252381DDw) obj;
                        long j = c2252381DDw.LIZ;
                        if (j >= 0 && j < jLJIILJJIL) {
                            c2252381DDw.LIZ = jLJIILJJIL;
                        }
                    }
                }
            }
            this.LLJI = jLJIILJJIL;
        }
    }

    public final long LJIILJJIL() {
        return Math.min(this.LLJI, this.LLJ);
    }

    @Override // X.C05YC
    public final boolean LIZJ(T t) {
        int i;
        boolean z;
        InterfaceC1364105Vn<Unit>[] interfaceC1364105VnArrLJIILIIL = C1DE0.LIZ;
        synchronized (this) {
            if (LJIILLIIL(t)) {
                interfaceC1364105VnArrLJIILIIL = LJIILIIL(interfaceC1364105VnArrLJIILIIL);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC1364105Vn<Unit> interfaceC1364105Vn : interfaceC1364105VnArrLJIILIIL) {
            if (interfaceC1364105Vn != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn.resumeWith(unit);
            }
        }
        return z;
    }

    public final void LJIIL(Object obj) {
        int i = this.LLJIJIL + this.LLJILJIL;
        Object[] objArrLJIILL = this.LLIZLLLIL;
        if (objArrLJIILL == null) {
            objArrLJIILL = LJIILL(0, 2, null);
        } else if (i >= objArrLJIILL.length) {
            objArrLJIILL = LJIILL(i, objArrLJIILL.length * 2, objArrLJIILL);
        }
        objArrLJIILL[((int) (LJIILJJIL() + ((long) i))) & (objArrLJIILL.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.05Vn<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public final InterfaceC1364105Vn<Unit>[] LJIILIIL(InterfaceC1364105Vn<Unit>[] interfaceC1364105VnArr) {
        Object[] objArr;
        C2252381DDw c2252381DDw;
        C2252611DEt c2252611DEt;
        int length = interfaceC1364105VnArr.length;
        if (this.LLILLJJLI != 0 && (objArr = this.LL) != null) {
            int length2 = objArr.length;
            int i = 0;
            interfaceC1364105VnArr = interfaceC1364105VnArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (c2252611DEt = (c2252381DDw = (C2252381DDw) obj).LIZIZ) != null && LJIIZILJ(c2252381DDw) >= 0) {
                    int length3 = interfaceC1364105VnArr.length;
                    interfaceC1364105VnArr = interfaceC1364105VnArr;
                    if (length >= length3) {
                        interfaceC1364105VnArr = Arrays.copyOf((Object[]) interfaceC1364105VnArr, Math.max(2, interfaceC1364105VnArr.length * 2));
                    }
                    interfaceC1364105VnArr[length] = c2252611DEt;
                    c2252381DDw.LIZIZ = null;
                    length++;
                }
                i++;
                interfaceC1364105VnArr = interfaceC1364105VnArr;
            }
        }
        return (InterfaceC1364105Vn[]) interfaceC1364105VnArr;
    }

    public final boolean LJIILLIIL(T t) {
        if (this.LLILLJJLI == 0) {
            if (this.LLILZIL != 0) {
                LJIIL(t);
                int i = this.LLJIJIL + 1;
                this.LLJIJIL = i;
                if (i > this.LLILZIL) {
                    LJIIJJI();
                }
                this.LLJI = LJIILJJIL() + ((long) this.LLJIJIL);
            }
            return true;
        }
        if (this.LLJIJIL >= this.LLILZLL && this.LLJI <= this.LLJ) {
            int i2 = C2252391DDx.LIZ[this.LLIZ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        LJIIL(t);
        int i3 = this.LLJIJIL + 1;
        this.LLJIJIL = i3;
        if (i3 > this.LLILZLL) {
            LJIIJJI();
        }
        long jLJIILJJIL = LJIILJJIL() + ((long) this.LLJIJIL);
        long j = this.LLJ;
        if (((int) (jLJIILJJIL - j)) > this.LLILZIL) {
            LJIJI(j + 1, this.LLJI, LJIILJJIL() + ((long) this.LLJIJIL), LJIILJJIL() + ((long) this.LLJIJIL) + ((long) this.LLJILJIL));
        }
        return true;
    }

    public final long LJIIZILJ(C2252381DDw c2252381DDw) {
        long j = c2252381DDw.LIZ;
        if (j < LJIILJJIL() + ((long) this.LLJIJIL)) {
            return j;
        }
        if (this.LLILZLL > 0 || j > LJIILJJIL() || this.LLJILJIL == 0) {
            return -1L;
        }
        return j;
    }

    public final Object LJIJ(C2252381DDw c2252381DDw) {
        Object obj;
        InterfaceC1364105Vn<Unit>[] interfaceC1364105VnArrLJIJJ = C1DE0.LIZ;
        synchronized (this) {
            long jLJIIZILJ = LJIIZILJ(c2252381DDw);
            if (jLJIIZILJ < 0) {
                obj = C09IR.LIZ;
            } else {
                long j = c2252381DDw.LIZ;
                obj = this.LLIZLLLIL[((int) jLJIIZILJ) & (r4.length - 1)];
                if (obj instanceof C2252351DDt) {
                    obj = ((C2252351DDt) obj).LLILLL;
                }
                c2252381DDw.LIZ = jLJIIZILJ + 1;
                interfaceC1364105VnArrLJIJJ = LJIJJ(j);
            }
        }
        for (InterfaceC1364105Vn<Unit> interfaceC1364105Vn : interfaceC1364105VnArrLJIJJ) {
            if (interfaceC1364105Vn != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn.resumeWith(unit);
            }
        }
        return obj;
    }

    public final InterfaceC1364105Vn<Unit>[] LJIJJ(long j) {
        int iMin;
        long j2;
        Object[] objArr;
        long j3 = this.LLJI;
        InterfaceC1364105Vn<Unit>[] interfaceC1364105VnArr = C1DE0.LIZ;
        if (j > j3) {
            return interfaceC1364105VnArr;
        }
        long jLJIILJJIL = LJIILJJIL();
        long j4 = ((long) this.LLJIJIL) + jLJIILJJIL;
        if (this.LLILZLL == 0 && this.LLJILJIL > 0) {
            j4++;
        }
        if (this.LLILLJJLI != 0 && (objArr = this.LL) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j5 = ((C2252381DDw) obj).LIZ;
                    if (j5 >= 0 && j5 < j4) {
                        j4 = j5;
                    }
                }
            }
        }
        if (j4 <= this.LLJI) {
            return interfaceC1364105VnArr;
        }
        long jLJIILJJIL2 = LJIILJJIL() + ((long) this.LLJIJIL);
        if (this.LLILLJJLI > 0) {
            iMin = Math.min(this.LLJILJIL, this.LLILZLL - ((int) (jLJIILJJIL2 - j4)));
        } else {
            iMin = this.LLJILJIL;
        }
        long j6 = ((long) this.LLJILJIL) + jLJIILJJIL2;
        if (iMin > 0) {
            interfaceC1364105VnArr = new InterfaceC1364105Vn[iMin];
            Object[] objArr2 = this.LLIZLLLIL;
            long j7 = jLJIILJJIL2;
            int i = 0;
            while (jLJIILJJIL2 < j6) {
                int i2 = (int) jLJIILJJIL2;
                Object obj2 = objArr2[(objArr2.length - 1) & i2];
                C09AU c09au = C09IR.LIZ;
                if (obj2 != c09au) {
                    C2252351DDt c2252351DDt = (C2252351DDt) obj2;
                    int i3 = i + 1;
                    interfaceC1364105VnArr[i] = c2252351DDt.LLILZ;
                    objArr2[i2 & (objArr2.length - 1)] = c09au;
                    objArr2[((int) j7) & (objArr2.length - 1)] = c2252351DDt.LLILLL;
                    j2 = 1;
                    j7++;
                    if (i3 >= iMin) {
                        break;
                    }
                    i = i3;
                } else {
                    j2 = 1;
                }
                jLJIILJJIL2 += j2;
            }
            jLJIILJJIL2 = j7;
        }
        int i4 = (int) (jLJIILJJIL2 - jLJIILJJIL);
        if (this.LLILLJJLI == 0) {
            j4 = jLJIILJJIL2;
        }
        long jMax = Math.max(this.LLJ, jLJIILJJIL2 - ((long) Math.min(this.LLILZIL, i4)));
        if (this.LLILZLL == 0 && jMax < j6) {
            if (Intrinsics.LJFF(this.LLIZLLLIL[((int) jMax) & (r4.length - 1)], C09IR.LIZ)) {
                jLJIILJJIL2++;
                jMax++;
            }
        }
        LJIJI(jMax, j4, jLJIILJJIL2, j6);
        LJIIIZ();
        if (interfaceC1364105VnArr.length != 0) {
            return LJIILIIL(interfaceC1364105VnArr);
        }
        return interfaceC1364105VnArr;
    }

    public final Object LJIIIIZZ(C2252381DDw c2252381DDw, C2250741D7o c2250741D7o) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c2250741D7o));
        c2252611DEt.LJIJJ();
        synchronized (this) {
            if (LJIIZILJ(c2252381DDw) < 0) {
                c2252381DDw.LIZIZ = c2252611DEt;
            } else {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                c2252611DEt.resumeWith(unit);
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c2250741D7o);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    @Override // X.C05YC, X.InterfaceC346701Wf
    public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252351DDt c2252351DDt;
        if (LIZJ(t)) {
            return Unit.LIZ;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        InterfaceC1364105Vn<Unit>[] interfaceC1364105VnArrLJIILIIL = C1DE0.LIZ;
        synchronized (this) {
            if (LJIILLIIL(t)) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                c2252611DEt.resumeWith(unit);
                interfaceC1364105VnArrLJIILIIL = LJIILIIL(interfaceC1364105VnArrLJIILIIL);
                c2252351DDt = null;
            } else {
                c2252351DDt = new C2252351DDt(this, ((long) (this.LLJIJIL + this.LLJILJIL)) + LJIILJJIL(), t, c2252611DEt);
                LJIIL(c2252351DDt);
                this.LLJILJIL++;
                if (this.LLILZLL == 0) {
                    interfaceC1364105VnArrLJIILIIL = LJIILIIL(interfaceC1364105VnArrLJIILIIL);
                }
            }
        }
        if (c2252351DDt != null) {
            c2252611DEt.LJJII(new C2238108pn(c2252351DDt));
        }
        for (InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 : interfaceC1364105VnArrLJIILIIL) {
            if (interfaceC1364105Vn2 != null) {
                Unit unit2 = Unit.LIZ;
                C189200o6.m2constructorimpl(unit2);
                interfaceC1364105Vn2.resumeWith(unit2);
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ != C099R.LJFF()) {
            objLJIJ = Unit.LIZ;
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public C2252331DDr(int i, int i2, EnumC2252401DDy enumC2252401DDy) {
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = enumC2252401DDy;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object LJIIJ(X.C2252331DDr<T> r9, X.InterfaceC346701Wf<? super T> r10, X.InterfaceC1364105Vn<?> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof X.C2250741D7o
            if (r0 == 0) goto L2d
            r6 = r11
            X.1D7o r6 = (X.C2250741D7o) r6
            int r2 = r6.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r6.LLIZ = r2
        L12:
            java.lang.Object r8 = r6.LLILZIL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLIZ
            r5 = 3
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 == r1) goto L3c
            if (r0 == r4) goto L33
            if (r0 == r5) goto L33
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.1D7o r6 = new X.1D7o
            r6.<init>(r9, r11)
            goto L12
        L33:
            X.09AE r2 = r6.LLILZ
            X.1DDw r3 = r6.LLILLL
            X.01Wf r10 = r6.LLILLJJLI
            X.1DDr r9 = r6.LL
            goto L74
        L3c:
            X.1DDw r3 = r6.LLILLL
            X.01Wf r10 = r6.LLILLJJLI
            X.1DDr r9 = r6.LL
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L46
            goto L67
        L46:
            r0 = move-exception
            goto Lb5
        L48:
            X.C155000ia.LIZIZ(r8)
            X.1DDz r3 = r9.LJ()
            X.1DDw r3 = (X.C2252381DDw) r3
            boolean r0 = r10 instanceof X.C2250721D7m     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L67
            r0 = r10
            X.1D7m r0 = (X.C2250721D7m) r0     // Catch: java.lang.Throwable -> Lb2
            r6.LL = r9     // Catch: java.lang.Throwable -> Lb2
            r6.LLILLJJLI = r10     // Catch: java.lang.Throwable -> Lb2
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> Lb2
            r6.LLIZ = r1     // Catch: java.lang.Throwable -> Lb2
            kotlin.Unit r0 = r0.LIZ(r6)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != r7) goto L67
            return r7
        L67:
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()     // Catch: java.lang.Throwable -> Lb0
            X.08zJ r0 = X.C09AE.LJJLJ     // Catch: java.lang.Throwable -> Lb0
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb0
            X.09AE r2 = (X.C09AE) r2     // Catch: java.lang.Throwable -> Lb0
            goto L77
        L74:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> Lb4
        L77:
            java.lang.Object r1 = r9.LJIJ(r3)     // Catch: java.lang.Throwable -> Lb4
            X.09AU r0 = X.C09IR.LIZ     // Catch: java.lang.Throwable -> Lb4
            if (r1 != r0) goto L90
            r6.LL = r9     // Catch: java.lang.Throwable -> Lb4
            r6.LLILLJJLI = r10     // Catch: java.lang.Throwable -> Lb4
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> Lb4
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> Lb4
            r6.LLIZ = r4     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r9.LJIIIIZZ(r3, r6)     // Catch: java.lang.Throwable -> Lb4
            if (r0 != r7) goto L77
            goto Lae
        L90:
            if (r2 == 0) goto L9d
            boolean r0 = r2.isActive()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L9d
            java.util.concurrent.CancellationException r0 = r2.LJJJLL()     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        L9d:
            r6.LL = r9     // Catch: java.lang.Throwable -> Lb4
            r6.LLILLJJLI = r10     // Catch: java.lang.Throwable -> Lb4
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> Lb4
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> Lb4
            r6.LLIZ = r5     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r10.emit(r1, r6)     // Catch: java.lang.Throwable -> Lb4
            if (r0 != r7) goto L77
            goto Laf
        Lae:
            return r7
        Laf:
            return r7
        Lb0:
            r0 = move-exception
            goto Lb5
        Lb2:
            r0 = move-exception
            goto Lb5
        Lb4:
            r0 = move-exception
        Lb5:
            r9.LJII(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2252331DDr.LJIIJ(X.1DDr, X.01Wf, X.05Vn):java.lang.Object");
    }

    public final Object[] LJIILL(int i, int i2, Object[] objArr) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.LLIZLLLIL = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long jLJIILJJIL = LJIILJJIL();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (((long) i3) + jLJIILJJIL);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
            return objArr2;
        }
        "Buffer size overflow".toString();
        throw new IllegalStateException("Buffer size overflow");
    }

    @Override // X.InterfaceC23142094y
    public final InterfaceC346201Wa<T> fuse(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        if ((i == 0 || i == -3) && enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
            return this;
        }
        return new C23125094h(i, coroutineContext, enumC2252401DDy, this);
    }

    public final void LJIJI(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jLJIILJJIL = LJIILJJIL(); jLJIILJJIL < jMin; jLJIILJJIL++) {
            this.LLIZLLLIL[((int) jLJIILJJIL) & (r4.length - 1)] = null;
        }
        this.LLJ = j;
        this.LLJI = j2;
        this.LLJIJIL = (int) (j3 - jMin);
        this.LLJILJIL = (int) (j4 - j3);
    }
}
