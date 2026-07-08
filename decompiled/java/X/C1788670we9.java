package X;

/* JADX INFO: renamed from: X.0we9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788670we9 implements InterfaceC560980LzM<Object, Object> {
    public final String LIZ;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZIZ;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZJ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return this.LIZ;
    }

    public C1788670we9(InterfaceC560980LzM<Object, Object> interfaceC560980LzM, InterfaceC560980LzM<Object, Object> interfaceC560980LzM2) {
        this.LIZIZ = interfaceC560980LzM;
        this.LIZJ = interfaceC560980LzM2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC560980LzM.getName());
        sbLIZ.append("->");
        sbLIZ.append(interfaceC560980LzM2.getName());
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // X.InterfaceC560980LzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r7, X.InterfaceC1364105Vn<? super java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1788680weA
            if (r0 == 0) goto L42
            r5 = r8
            X.0weA r5 = (X.C1788680weA) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L34
            if (r0 != r2) goto L48
            X.C155000ia.LIZIZ(r4)
        L25:
            return r4
        L26:
            X.C155000ia.LIZIZ(r4)
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r6.LIZIZ
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LIZ(r7, r5)
            if (r4 != r3) goto L37
            return r3
        L34:
            X.C155000ia.LIZIZ(r4)
        L37:
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r6.LIZJ
            r5.LLILLL = r2
            java.lang.Object r4 = r0.LIZ(r4, r5)
            if (r4 != r3) goto L25
            return r3
        L42:
            X.0weA r5 = new X.0weA
            r5.<init>(r6, r8)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1788670we9.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
