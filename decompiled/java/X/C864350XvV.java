package X;

/* JADX INFO: renamed from: X.0XvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864350XvV {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final InterfaceC863850Xuh LIZJ;
    public final C0Y9J LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.bytedance.im.core.proto.Request r17, X.InterfaceC1364105Vn<? super X.C864190XvF<X.C0Y8T>> r18) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C864350XvV.LIZIZ(com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    public final void LIZJ(int i, String str) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZIZ);
        c0yj9.LIZJ("imsdk_mark_read_request");
        c0yj9.LIZ(str, "conversation_id");
        c0yj9.LIZ(Integer.valueOf(i), "conversation_type");
        c0yj9.LJ(0.1f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.bytedance.im.core.proto.Request r15, X.InterfaceC1364105Vn<? super X.C864360XvW> r16) {
        /*
            r14 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C862680Xso
            if (r0 == 0) goto L27
            r2 = r4
            X.0Xso r2 = (X.C862680Xso) r2
            int r3 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L27
            int r3 = r3 - r1
            r2.LLILLL = r3
        L14:
            java.lang.Object r7 = r2.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r2.LLILLL
            java.lang.String r4 = "MarkConversationReadUseCase"
            r9 = 0
            java.lang.String r3 = ""
            r6 = 1
            if (r0 == 0) goto L35
            if (r0 != r6) goto L2d
            goto L4e
        L27:
            X.0Xso r2 = new X.0Xso
            r2.<init>(r14, r4)
            goto L14
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r7)
            X.0XvT r0 = r14.LIZ     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            X.0YCX r7 = new X.0YCX     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            r11 = 0
            r13 = 510(0x1fe, float:7.15E-43)
            r8 = r15
            r10 = r9
            r7.<init>(r8, r9, r10, r11, r13)     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            r2.LLILLL = r6     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            java.lang.Object r7 = r0.LLLIILIL(r7, r9, r2)     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            if (r7 != r1) goto L51
            return r1
        L4e:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
        L51:
            X.0XwA r7 = (X.C864760XwA) r7     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            X.0YEM r0 = r14.LIZIZ     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            X.0Y6i r2 = r0.LIZLLL()     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            java.lang.String r1 = "Mark conversation read request completed successfully"
            r0 = 4
            X.C868780Y6i.LJ(r2, r4, r1, r0)     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            X.0XvW r5 = new X.0XvW     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            com.bytedance.im.core.proto.Response r0 = r7.LIZ     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            java.lang.String r2 = r0.log_id     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            if (r2 != 0) goto L68
            r2 = r3
        L68:
            r1 = 0
            r0 = -1014(0xfffffffffffffc0a, float:NaN)
            r5.<init>(r6, r2, r0, r1)     // Catch: java.lang.Exception -> L6f X.C0Y8K -> L86
            return r5
        L6f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0YEM r0 = r14.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "Network request failed with unexpected exception"
            r1.LJIIIIZZ(r4, r0, r2)
            X.0XvW r5 = new X.0XvW
            r0 = -9999(0xffffffffffffd8f1, float:NaN)
            r5.<init>(r9, r3, r0, r2)
            return r5
        L86:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0YEM r0 = r14.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "Network request failed with RemoteFetcherException"
            r1.LJIIIIZZ(r4, r0, r2)
            X.0XvW r5 = new X.0XvW
            int r0 = r2.getErrorCode()
            r5.<init>(r9, r3, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C864350XvV.LJ(com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    public C864350XvV(InterfaceC864330XvT interfaceC864330XvT, C0YEM c0yem, InterfaceC863850Xuh interfaceC863850Xuh) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = interfaceC863850Xuh;
        this.LIZLLL = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Long r7, java.lang.String r8, X.InterfaceC1364105Vn r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C862660Xsm
            if (r0 == 0) goto L45
            r5 = r9
            X.0Xsm r5 = (X.C862660Xsm) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L4b
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0YEM r0 = r6.LIZIZ
            X.0XvY r0 = r0.LJIIIIZZ()
            X.1DEx r2 = r0.LIZJ()
            X.0XwI r1 = new X.0XwI
            r0 = 0
            r1.<init>(r6, r8, r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L45:
            X.0Xsm r5 = new X.0Xsm
            r5.<init>(r6, r9)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C864350XvV.LIZ(java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LIZLLL(int i, int i2, int i3, String str, String str2) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZIZ);
        c0yj9.LIZJ("imsdk_mark_read_response");
        c0yj9.LIZ(Integer.valueOf(i), "result_code");
        c0yj9.LIZ(str, "conversation_id");
        c0yj9.LIZ(Integer.valueOf(i2), "conversation_type");
        c0yj9.LIZ(Integer.valueOf(i3), "error_code");
        c0yj9.LIZ(str2, "log_id");
        c0yj9.LJ(0.1f);
    }
}
