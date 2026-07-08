package X;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11UD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UD {
    public static final Object LIZ(AbstractC19486711Lt abstractC19486711Lt, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        abstractC19486711Lt.LIZIZ(new C11IY() { // from class: X.11UI
            @Override // X.C11IY
            public final void onComplete() {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
            }

            @Override // X.C11IY
            public final void onError(Throwable th) {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }

            @Override // X.C11IY
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                c2252611DEt.LJJII(new AwS608S0100000_29(interfaceC420801kM, 846));
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public static final <T> Object LIZIZ(InterfaceC19473011Gm<T> interfaceC19473011Gm, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        interfaceC19473011Gm.LIZ(new C19774012Yg(c2252611DEt, 1));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final Object LIZJ(C11NZ c11nz, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJ(c11nz, C11UF.FIRST, interfaceC1364105Vn);
    }

    public static final Object LIZLLL(C11NZ c11nz, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJ(c11nz, C11UF.FIRST_OR_DEFAULT, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJFF(X.C11KZ r5, X.InterfaceC1364105Vn r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof X.C11UE
            if (r0 == 0) goto L31
            r4 = r6
            X.11UE r4 = (X.C11UE) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLJJLI
            r0 = 1
            if (r1 == 0) goto L25
            if (r1 != r0) goto L3d
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 == 0) goto L37
            return r3
        L25:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLJJLI = r0
            java.lang.Object r3 = LJII(r5, r4)
            if (r3 != r2) goto L22
            return r2
        L31:
            X.11UE r4 = new X.11UE
            r4.<init>(r6)
            goto L12
        L37:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11UD.LJFF(X.11KZ, X.05Vn):java.lang.Object");
    }

    public static final Object LJI(C11NZ c11nz, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJ(c11nz, C11UF.SINGLE, interfaceC1364105Vn);
    }

    public static final Object LJII(AbstractC19483511Kn abstractC19483511Kn, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        abstractC19483511Kn.LIZ(new C11IH<Object>() { // from class: X.11UH
            @Override // X.C11IH
            public final void onComplete() {
                InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf.resumeWith(null);
            }

            @Override // X.C11IH
            public final void onError(Throwable th) {
                InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }

            @Override // X.C11IH
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                c2252611DEt.LJJII(new AwS608S0100000_29(interfaceC420801kM, 846));
            }

            @Override // X.C11IH
            public final void onSuccess(Object obj) {
                InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(obj);
                interfaceC20236714Gf.resumeWith(obj);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static Object LJ(C11NZ c11nz, final C11UF c11uf, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final Object obj = null;
        c11nz.LIZIZ(new InterfaceC626120Oh8<Object>() { // from class: X.11UG
            public InterfaceC420801kM LL;
            public Object LLILLJJLI;
            public boolean LLILLL;

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                if (this.LLILLL) {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                        Object obj2 = this.LLILLJJLI;
                        C189200o6.m2constructorimpl(obj2);
                        interfaceC20236714Gf.resumeWith(obj2);
                        return;
                    }
                    return;
                }
                if (c11uf == C11UF.FIRST_OR_DEFAULT) {
                    InterfaceC20236714Gf<Object> interfaceC20236714Gf2 = c2252611DEt;
                    Object obj3 = obj;
                    C189200o6.m2constructorimpl(obj3);
                    interfaceC20236714Gf2.resumeWith(obj3);
                    return;
                }
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Object> interfaceC20236714Gf3 = c2252611DEt;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No value received via onNext for ");
                    sbLIZ.append(c11uf);
                    C098200Yq c098200Yq = new C098200Yq(new NoSuchElementException(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf3.resumeWith(c098200Yq);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj2) {
                int iOrdinal = c11uf.ordinal();
                InterfaceC420801kM interfaceC420801kM = null;
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        return;
                    }
                    if (c11uf == C11UF.SINGLE && this.LLILLL) {
                        if (c2252611DEt.isActive()) {
                            InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("More than one onNext value for ");
                            sbLIZ.append(c11uf);
                            C098200Yq c098200Yq = new C098200Yq(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
                            C189200o6.m2constructorimpl(c098200Yq);
                            interfaceC20236714Gf.resumeWith(c098200Yq);
                        }
                        InterfaceC420801kM interfaceC420801kM2 = this.LL;
                        if (interfaceC420801kM2 != null) {
                            interfaceC420801kM = interfaceC420801kM2;
                        }
                        interfaceC420801kM.dispose();
                        return;
                    }
                    this.LLILLJJLI = obj2;
                    this.LLILLL = true;
                    return;
                }
                if (this.LLILLL) {
                    return;
                }
                this.LLILLL = true;
                InterfaceC20236714Gf<Object> interfaceC20236714Gf2 = c2252611DEt;
                C189200o6.m2constructorimpl(obj2);
                interfaceC20236714Gf2.resumeWith(obj2);
                InterfaceC420801kM interfaceC420801kM3 = this.LL;
                if (interfaceC420801kM3 != null) {
                    interfaceC420801kM = interfaceC420801kM3;
                }
                interfaceC420801kM.dispose();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL = interfaceC420801kM;
                c2252611DEt.LJJII(new AwS608S0100000_29(interfaceC420801kM, 845));
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
