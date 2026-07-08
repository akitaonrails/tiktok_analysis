package X;

/* JADX INFO: renamed from: X.0LzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561000LzO implements InterfaceC560980LzM<Object, Object> {
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZ;
    public final /* synthetic */ InterfaceC497601wk LIZIZ;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZJ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "async";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.InterfaceC560980LzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r6, X.InterfaceC1364105Vn<? super java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C561010LzP
            if (r0 == 0) goto L3f
            r3 = r7
            X.0LzP r3 = (X.C561010LzP) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r4)
        L22:
            X.01wk r3 = r5.LIZIZ
            X.0LzN r2 = new X.0LzN
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r5.LIZJ
            r1 = 0
            r2.<init>(r0, r4, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            return r4
        L31:
            X.C155000ia.LIZIZ(r4)
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r5.LIZ
            r3.LLILLL = r1
            java.lang.Object r4 = r0.LIZ(r6, r3)
            if (r4 != r2) goto L22
            return r2
        L3f:
            X.0LzP r3 = new X.0LzP
            r3.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C561000LzO.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }

    public C561000LzO(InterfaceC560980LzM<Object, Object> interfaceC560980LzM, InterfaceC497601wk interfaceC497601wk, InterfaceC560980LzM<Object, Object> interfaceC560980LzM2) {
        this.LIZ = interfaceC560980LzM;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = interfaceC560980LzM2;
    }
}
