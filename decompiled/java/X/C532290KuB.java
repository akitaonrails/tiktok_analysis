package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532290KuB implements InterfaceC532470KuT<Object, Object> {
    public final String LIZ;
    public final CoroutineContext LIZIZ;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<? super C189200o6<Object>>, Object> LIZJ;

    @Override // X.InterfaceC532490KuV
    public final CoroutineContext LJJJLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC532490KuV
    public final String getName() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // X.InterfaceC532470KuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.Object r6, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.lang.Object>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C532300KuC
            if (r0 == 0) goto L37
            r4 = r7
            X.0KuC r4 = (X.C532300KuC) r4
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
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            kotlin.jvm.functions.Function2<java.lang.Object, X.05Vn<? super X.00o6<java.lang.Object>>, java.lang.Object> r0 = r5.LIZJ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.invoke(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L37:
            X.0KuC r4 = new X.0KuC
            r4.<init>(r5, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532290KuB.LIZIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C532290KuB(String str, CoroutineContext coroutineContext, Function2<Object, ? super InterfaceC1364105Vn<? super C189200o6<Object>>, ? extends Object> function2) {
        this.LIZJ = function2;
        this.LIZ = str;
        this.LIZIZ = coroutineContext;
    }
}
