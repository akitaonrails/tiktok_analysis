package X;

/* JADX INFO: renamed from: X.0HEW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HEW {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object LIZ(kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super R>, ? extends java.lang.Object> r7, X.InterfaceC1364105Vn<? super R> r8) {
        /*
            r6 = this;
            r0 = 137821(0x21a5d, float:1.93128E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r8 instanceof X.C0HEY
            if (r0 == 0) goto L33
            r4 = r8
            X.0HEY r4 = (X.C0HEY) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.LLILLL = r2
        L19:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L3d
            if (r1 == r0) goto L39
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r5 == 0) goto L32
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L32:
            throw r1
        L33:
            X.0HEY r4 = new X.0HEY
            r4.<init>(r6, r8)
            goto L19
        L39:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L54
            goto L4e
        L3d:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L54
            java.lang.Object r3 = r7.invoke(r4)     // Catch: java.lang.Exception -> L54
            if (r3 != r2) goto L4e
            if (r5 == 0) goto L4d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L4d:
            return r2
        L4e:
            if (r5 == 0) goto L53
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L53:
            return r3
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r5 == 0) goto L5d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HEW.LIZ(kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r6, X.C0HEP r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0HEX
            if (r0 == 0) goto L20
            r4 = r6
            X.0HEX r4 = (X.C0HEX) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L3a
        L20:
            X.0HEX r4 = new X.0HEX
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L43
            java.lang.Object r3 = r7.invoke(r4)     // Catch: java.lang.Exception -> L43
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L43
        L3d:
            X.0HEV r1 = new X.0HEV     // Catch: java.lang.Exception -> L43
            r1.<init>(r3)     // Catch: java.lang.Exception -> L43
            return r1
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HET r1 = new X.0HET
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HEW.LIZIZ(X.05Vn, X.0HEP):java.lang.Object");
    }
}
