package X;

/* JADX INFO: renamed from: X.0Y2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867910Y2z {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final AbstractC2252651DEx LIZJ;
    public final InterfaceC867890Y2x LIZLLL;
    public final int LJ;

    public C867910Y2z(InterfaceC864330XvT interfaceC864330XvT, final C0YEM c0yem) {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        InterfaceC867890Y2x interfaceC867890Y2x = new InterfaceC867890Y2x(c0yem) { // from class: X.0Y2A
            public final C0YEM LIZ;

            {
                this.LIZ = c0yem;
            }

            @Override // X.InterfaceC867890Y2x
            public final C0Y8T LIZ(String str) {
                return this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
            }

            @Override // X.InterfaceC867890Y2x
            public final void LJJLIIIJ(C0Y8T c0y8t) {
                this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJIL(c0y8t);
            }

            @Override // X.InterfaceC867890Y2x
            public final void LJJLIIIJJI(C0Y8T c0y8t) {
                new C0Y2D(this.LIZ).LJIILIIL(c0y8t);
            }

            @Override // X.InterfaceC867890Y2x
            public final boolean LJJLIIIJILLIZJL(long j, String str) {
                boolean zIsConversationMarkDelete = this.LIZ.LJIIIZ().LJJJJLI.isConversationMarkDelete();
                C869260Y8e c869260Y8eLJIIJJI = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI();
                if (zIsConversationMarkDelete) {
                    c869260Y8eLJIIJJI.LJJJI(str);
                    return c869260Y8eLJIIJJI.LJJIJLIJ(j, 0L, str);
                }
                return c869260Y8eLJIIJJI.LJIIIZ(str);
            }
        };
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = abstractC2238408pq;
        this.LIZLLL = interfaceC867890Y2x;
        this.LJ = C0YMR.LEAVE_CONVERSATION.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.im.core.proto.Request r14, X.InterfaceC1364105Vn<? super X.C0Y35> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C0Y32
            if (r0 == 0) goto L22
            r5 = r15
            X.0Y32 r5 = (X.C0Y32) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r8 = 0
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            goto L49
        L22:
            X.0Y32 r5 = new X.0Y32
            r5.<init>(r13, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.0XvT r0 = r13.LIZ     // Catch: X.C0Y8K -> L61
            X.0YCX r6 = new X.0YCX     // Catch: X.C0Y8K -> L61
            r10 = 0
            r12 = 510(0x1fe, float:7.15E-43)
            r7 = r14
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: X.C0Y8K -> L61
            r5.LLILLL = r1     // Catch: X.C0Y8K -> L61
            java.lang.Object r4 = r0.LLLIILIL(r6, r8, r5)     // Catch: X.C0Y8K -> L61
            if (r4 != r2) goto L4c
            return r2
        L49:
            X.C155000ia.LIZIZ(r4)     // Catch: X.C0Y8K -> L61
        L4c:
            X.0XwA r4 = (X.C864760XwA) r4     // Catch: X.C0Y8K -> L61
            com.bytedance.im.core.proto.Response r0 = r4.LIZ     // Catch: X.C0Y8K -> L61
            java.lang.Integer r3 = r0.status_code     // Catch: X.C0Y8K -> L61
            X.0YMX r0 = X.C0YMW.newBuilder()     // Catch: X.C0Y8K -> L61
            if (r3 == 0) goto L5c
            int r8 = r3.intValue()     // Catch: X.C0Y8K -> L61
        L5c:
            X.0YMW r1 = r0.LIZ     // Catch: X.C0Y8K -> L61
            r1.status = r8     // Catch: X.C0Y8K -> L61
            goto L88
        L61:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0YEM r0 = r13.LIZIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.String r1 = "LeaveConversationUseCase"
            java.lang.String r0 = "dissolve conversation error"
            r2.LJIIIIZZ(r1, r0, r4)
            X.0YMX r2 = X.C0YMW.newBuilder()
            int r1 = r4.getErrorCode()
            X.0YMW r0 = r2.LIZ
            r0.code = r1
            java.lang.String r0 = r4.getMessage()
            X.0YMW r1 = r2.LIZ
            r1.statusMsg = r0
            r1.throwable = r4
        L88:
            X.0Y35 r0 = new X.0Y35
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867910Y2z.LIZ(com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r23, boolean r24, X.InterfaceC1364105Vn<? super X.C867100Xzw> r25) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867910Y2z.LIZIZ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, boolean r8, X.InterfaceC867020Xzo<java.lang.String> r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C0Y31
            if (r0 == 0) goto L5d
            r5 = r10
            X.0Y31 r5 = (X.C0Y31) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L28
            if (r2 == r0) goto L36
            if (r2 != r1) goto L63
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r9
            r5.LLILZ = r0
            java.lang.Object r4 = r6.LIZIZ(r7, r8, r5)
            if (r4 != r3) goto L3b
            return r3
        L36:
            X.0Xzo r9 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L3b:
            X.0Xzw r4 = (X.C867100Xzw) r4
            r2 = 0
            r5.LL = r2
            r5.LLILZ = r1
            if (r9 == 0) goto L5a
            X.1DEx r1 = r6.LIZJ
            X.0Xzv r0 = new X.0Xzv
            r0.<init>(r4, r9, r2)
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L57
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L57:
            if (r1 != r3) goto L25
            return r3
        L5a:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L57
        L5d:
            X.0Y31 r5 = new X.0Y31
            r5.<init>(r6, r10)
            goto L12
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867910Y2z.LIZJ(java.lang.String, boolean, X.0Xzo, X.05Vn):java.lang.Object");
    }
}
