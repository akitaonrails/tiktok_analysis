package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0weZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788930weZ implements InterfaceC560980LzM<Object, Object> {
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZ;
    public final /* synthetic */ Function1<Object, Object> LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "map";
    }

    public C1788930weZ(InterfaceC560980LzM<Object, Object> interfaceC560980LzM, Function1<Object, Object> function1) {
        this.LIZ = interfaceC560980LzM;
        this.LIZIZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // X.InterfaceC560980LzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r6, X.InterfaceC1364105Vn<? super java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1788920weY
            if (r0 == 0) goto L37
            r4 = r7
            X.0weY r4 = (X.C1788920weY) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3d
            X.C155000ia.LIZIZ(r3)
        L22:
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> r0 = r5.LIZIZ
            java.lang.Object r0 = r0.invoke(r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r5.LIZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L37:
            X.0weY r4 = new X.0weY
            r4.<init>(r5, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1788930weZ.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
