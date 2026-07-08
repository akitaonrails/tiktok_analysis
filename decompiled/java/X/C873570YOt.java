package X;

/* JADX INFO: renamed from: X.0YOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873570YOt {
    public final C0YH7 LIZ;

    public C873570YOt(C0YH5 c0yh5) {
        this.LIZ = c0yh5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0327 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc A[Catch: Exception -> 0x024c, CancellationException -> 0x02a1, TryCatch #2 {CancellationException -> 0x02a1, blocks: (B:18:0x006b, B:79:0x01f6, B:76:0x01e0, B:81:0x01fc, B:83:0x0200, B:85:0x0209, B:88:0x022f, B:90:0x0246, B:91:0x024b), top: B:129:0x006b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01f3 -> B:135:0x01f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C873500YOm r30, X.InterfaceC873790YPp r31, X.InterfaceC1364105Vn<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873570YOt.LIZ(X.0YOm, X.0YPp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C869590Y9l r8, boolean r9, X.InterfaceC1364105Vn<? super X.C869590Y9l> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C0YPJ
            if (r0 == 0) goto L24
            r4 = r10
            X.0YPJ r4 = (X.C0YPJ) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.label
            r6 = 1
            if (r0 == 0) goto L32
            if (r0 != r6) goto L2a
            java.lang.Object r8 = r4.L$0
            X.0Y9l r8 = (X.C869590Y9l) r8
            goto L7b
        L24:
            X.0YPJ r4 = new X.0YPJ
            r4.<init>(r7, r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0YH7 r0 = r7.LIZ
            X.0YDA r1 = r0.LIZJ()
            java.lang.String r0 = r8.getUuid()
            r1.LJIJJLI(r0)
            r4.L$0 = r8     // Catch: java.lang.Throwable -> L9b
            r4.Z$0 = r9     // Catch: java.lang.Throwable -> L9b
            r4.label = r6     // Catch: java.lang.Throwable -> L9b
            X.1DEt r3 = new X.1DEt     // Catch: java.lang.Throwable -> L9b
            X.05Vn r0 = X.C099M.LIZLLL(r4)     // Catch: java.lang.Throwable -> L9b
            r3.<init>(r6, r0)     // Catch: java.lang.Throwable -> L9b
            r3.LJIJJ()     // Catch: java.lang.Throwable -> L9b
            X.0YH7 r0 = r7.LIZ     // Catch: java.lang.Throwable -> L9b
            X.0YDA r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L9b
            X.0YE6 r2 = r0.LJIIJJI()     // Catch: java.lang.Throwable -> L9b
            if (r9 != 0) goto L61
            r6 = 0
        L61:
            X.0Ztd r1 = new X.0Ztd     // Catch: java.lang.Throwable -> L9b
            r0 = 22
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L9b
            r2.LJJIIJZLJL(r8, r6, r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r3.LJIJ()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L9b
            if (r2 != r0) goto L78
            X.C099Q.LIZJ(r4)     // Catch: java.lang.Throwable -> L9b
        L78:
            if (r2 != r5) goto L7e
            return r5
        L7b:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L9b
        L7e:
            X.0Y9l r2 = (X.C869590Y9l) r2     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L90
            X.0YH7 r0 = r7.LIZ     // Catch: java.lang.Throwable -> L9b
            X.0YDA r1 = r0.LIZJ()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r8.getUuid()     // Catch: java.lang.Throwable -> L9b
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> L9b
            return r2
        L90:
            X.0YPY r3 = new X.0YPY     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "remote send returned null"
            r1 = 0
            r0 = -1042(0xfffffffffffffbee, float:NaN)
            r3.<init>(r0, r2, r1, r1)     // Catch: java.lang.Throwable -> L9b
            throw r3     // Catch: java.lang.Throwable -> L9b
        L9b:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0YH7 r0 = r7.LIZ
            X.0YDA r1 = r0.LIZJ()
            java.lang.String r0 = r8.getUuid()
            r1.LIZ(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873570YOt.LIZIZ(X.0Y9l, boolean, X.05Vn):java.lang.Object");
    }
}
