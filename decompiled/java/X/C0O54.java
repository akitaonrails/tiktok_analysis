package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O54, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O54<PARAMS, RESULT> implements InterfaceC613720O5i<C0O55<RESULT>> {
    public final PARAMS LIZ;
    public final Function2<PARAMS, InterfaceC1364105Vn<? super RESULT>, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O54)) {
            return false;
        }
        C0O54 c0o54 = (C0O54) obj;
        return Intrinsics.LJFF(this.LIZ, c0o54.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0o54.LIZIZ);
    }

    public final int hashCode() {
        PARAMS params = this.LIZ;
        return ((params == null ? 0 : params.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetRequestOperator(reqParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", execute=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0O54(PARAMS params, Function2<? super PARAMS, ? super InterfaceC1364105Vn<? super RESULT>, ? extends Object> function2) {
        this.LIZ = params;
        this.LIZIZ = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r6, X.InterfaceC1364105Vn<? super X.C0O55<RESULT>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0O53
            if (r0 == 0) goto L38
            r4 = r7
            X.0O53 r4 = (X.C0O53) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L3e
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0O55 r0 = new X.0O55
            r0.<init>(r1)
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            kotlin.jvm.functions.Function2<PARAMS, X.05Vn<? super RESULT>, java.lang.Object> r1 = r5.LIZIZ
            PARAMS r0 = r5.LIZ
            r4.LLILLL = r2
            java.lang.Object r1 = r1.invoke(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L38:
            X.0O53 r4 = new X.0O53
            r4.<init>(r5, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O54.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
