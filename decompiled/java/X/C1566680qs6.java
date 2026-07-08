package X;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566680qs6 {
    public final List<Function2<AbstractC1566610qrz, InterfaceC1364105Vn<? super Boolean>, Object>> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1566680qs6(List<? extends Function2<? super AbstractC1566610qrz, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>> list) {
        this.LIZ = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[PHI: r1 r6
      0x004a: PHI (r1v3 java.util.Iterator<kotlin.jvm.functions.Function2<X.0qrz, X.05Vn<? super java.lang.Boolean>, java.lang.Object>>) = 
      (r1v2 java.util.Iterator<kotlin.jvm.functions.Function2<X.0qrz, X.05Vn<? super java.lang.Boolean>, java.lang.Object>>)
      (r1v4 java.util.Iterator<kotlin.jvm.functions.Function2<X.0qrz, X.05Vn<? super java.lang.Boolean>, java.lang.Object>>)
     binds: [B:21:0x0046, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r6v1 X.0qrz) = (r6v0 X.0qrz), (r6v2 X.0qrz) binds: [B:21:0x0046, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.AbstractC1566610qrz r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1566690qs7
            if (r0 == 0) goto L63
            r4 = r7
            X.0qs7 r4 = (X.C1566690qs7) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r0 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L69
            java.lang.Object r1 = r4.LLILLJJLI
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.0qrz r6 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L28:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4a
            r2 = 0
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L36:
            X.C155000ia.LIZIZ(r0)
            java.util.List<kotlin.jvm.functions.Function2<X.0qrz, X.05Vn<? super java.lang.Boolean>, java.lang.Object>> r1 = r5.LIZ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L46
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L46
            goto L31
        L46:
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r1.next()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r4.LL = r6
            r4.LLILLJJLI = r1
            r4.LLILZIL = r2
            java.lang.Object r0 = r0.invoke(r6, r4)
            if (r0 != r3) goto L28
            return r3
        L63:
            X.0qs7 r4 = new X.0qs7
            r4.<init>(r5, r7)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1566680qs6.LIZ(X.0qrz, X.05Vn):java.lang.Object");
    }
}
