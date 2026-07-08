package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0wdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788570wdz implements InterfaceC560980LzM<Object, Object> {
    public final String LIZ;
    public final /* synthetic */ InterfaceC560980LzM<Pair<Exception, Object>, Object> LIZIZ;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZJ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return this.LIZ;
    }

    public C1788570wdz(InterfaceC560980LzM<Pair<Exception, Object>, Object> interfaceC560980LzM, InterfaceC560980LzM<Object, Object> interfaceC560980LzM2) {
        this.LIZIZ = interfaceC560980LzM;
        this.LIZJ = interfaceC560980LzM2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("catchWith(");
        sbLIZ.append(interfaceC560980LzM.getName());
        sbLIZ.append(')');
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    @Override // X.InterfaceC560980LzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r7, X.InterfaceC1364105Vn<? super java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1788580we0
            if (r0 == 0) goto L53
            r5 = r8
            X.0we0 r5 = (X.C1788580we0) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L26
            if (r0 != r3) goto L59
            X.C155000ia.LIZIZ(r2)
        L25:
            return r2
        L26:
            java.lang.Object r7 = r5.LL
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L3c
            goto L61
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r6.LIZJ     // Catch: java.lang.Exception -> L3c
            r5.LL = r7     // Catch: java.lang.Exception -> L3c
            r5.LLILZ = r1     // Catch: java.lang.Exception -> L3c
            java.lang.Object r2 = r0.LIZ(r7, r5)     // Catch: java.lang.Exception -> L3c
            if (r2 != r4) goto L25
            goto L62
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0LzM<kotlin.Pair<java.lang.Exception, java.lang.Object>, java.lang.Object> r2 = r6.LIZIZ
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r3
            java.lang.Object r2 = r2.LIZ(r1, r5)
            if (r2 != r4) goto L25
            return r4
        L53:
            X.0we0 r5 = new X.0we0
            r5.<init>(r6, r8)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L61:
            return r2
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1788570wdz.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
