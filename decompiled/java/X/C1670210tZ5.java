package X;

/* JADX INFO: renamed from: X.0tZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670210tZ5<T> implements InterfaceC346701Wf {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C259800zU<C1665510tRV<String>> LLILLJJLI;
    public final /* synthetic */ C1690050u55 LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    public C1670210tZ5(String str, C259800zU<C1665510tRV<String>> c259800zU, C1690050u55 c1690050u55, C05P0<Boolean> c05p0) {
        this.LL = str;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c1690050u55;
        this.LLILZ = c05p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1670220tZ6
            if (r0 == 0) goto La6
            r3 = r9
            X.0tZ6 r3 = (X.C1670220tZ6) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 == r6) goto L8e
            if (r0 != r4) goto Lad
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.05P0<java.lang.Boolean> r0 = r7.LLILZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            java.lang.String r5 = r7.LL
            if (r5 != 0) goto L43
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L43:
            X.00zU<X.0tRV<java.lang.String>> r0 = r7.LLILLJJLI
            T r1 = r0.element
            X.0tRV r1 = (X.C1665510tRV) r1
            T r0 = r1.LIZ
            if (r0 != 0) goto L52
            r1.LIZ = r5
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L52:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            r5 = r0 ^ 1
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "changed: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", firstId="
            r1.append(r0)
            java.lang.String r0 = r7.LL
            r1.append(r0)
            java.lang.String r0 = ", lastFirstId.value="
            r1.append(r0)
            X.00zU<X.0tRV<java.lang.String>> r0 = r7.LLILLJJLI
            T r0 = r0.element
            X.0tRV r0 = (X.C1665510tRV) r0
            T r0 = r0.LIZ
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r5 == 0) goto Lb5
            r3.LLILLL = r6
            java.lang.Object r0 = X.C2151808bs.LIZIZ(r3)
            if (r0 != r2) goto L91
            return r2
        L8e:
            X.C155000ia.LIZIZ(r1)
        L91:
            X.05P0<java.lang.Boolean> r1 = r7.LLILZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setValue(r0)
            X.0u55 r1 = r7.LLILLL
            r3.LLILLL = r4
            X.0u0K r0 = X.C1690050u55.LJIL
            r0 = 0
            java.lang.Object r0 = r1.LJIIJ(r0, r0, r3)
            if (r0 != r2) goto L25
            return r2
        La6:
            X.0tZ6 r3 = new X.0tZ6
            r3.<init>(r7, r9)
            goto L12
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb5:
            X.00zU<X.0tRV<java.lang.String>> r0 = r7.LLILLJJLI
            T r1 = r0.element
            X.0tRV r1 = (X.C1665510tRV) r1
            java.lang.String r0 = r7.LL
            r1.LIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670210tZ5.LIZ(int, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC346701Wf
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LIZ(((Number) obj).intValue(), interfaceC1364105Vn);
    }
}
