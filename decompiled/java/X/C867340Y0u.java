package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Y0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867340Y0u {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final AbstractC2252651DEx LIZJ;
    public final InterfaceC867360Y0w LIZLLL;
    public final int LJ;

    public C867340Y0u(InterfaceC864330XvT interfaceC864330XvT, final C0YEM c0yem) {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        InterfaceC867360Y0w interfaceC867360Y0w = new InterfaceC867360Y0w(c0yem) { // from class: X.0Y10
            public final C0YEM LIZ;

            {
                this.LIZ = c0yem;
            }

            @Override // X.InterfaceC867360Y0w
            public final C0Y8T LIZ(String str) {
                return this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
            }

            @Override // X.InterfaceC867360Y0w
            public final void LJJZZI(List<C0YAE> list) {
                this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJJZ(list);
            }

            @Override // X.InterfaceC867360Y0w
            public final C0YAE LJJZZIII(long j, String str) {
                return this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIILIIL().LJIIJ(str, String.valueOf(j));
            }

            @Override // X.InterfaceC867360Y0w
            public final boolean LIZJ(int i, String str, List list) {
                return this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIILIIL().LIZJ(i, str, list);
            }
        };
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = abstractC2238408pq;
        this.LIZLLL = interfaceC867360Y0w;
        this.LJ = C0YMR.UPDATE_CONVERSATION_PARTICIPANT.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.im.core.proto.Request r14, X.InterfaceC1364105Vn<? super X.C867380Y0y> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C867320Y0s
            if (r0 == 0) goto L22
            r5 = r15
            X.0Y0s r5 = (X.C867320Y0s) r5
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
            X.0Y0s r5 = new X.0Y0s
            r5.<init>(r13, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.0XvT r0 = r13.LIZ     // Catch: X.C0Y8K -> L73
            X.0YCX r6 = new X.0YCX     // Catch: X.C0Y8K -> L73
            r10 = 0
            r12 = 510(0x1fe, float:7.15E-43)
            r7 = r14
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: X.C0Y8K -> L73
            r5.LLILLL = r1     // Catch: X.C0Y8K -> L73
            java.lang.Object r4 = r0.LLLIILIL(r6, r8, r5)     // Catch: X.C0Y8K -> L73
            if (r4 != r2) goto L4c
            return r2
        L49:
            X.C155000ia.LIZIZ(r4)     // Catch: X.C0Y8K -> L73
        L4c:
            X.0XwA r4 = (X.C864760XwA) r4     // Catch: X.C0Y8K -> L73
            com.bytedance.im.core.proto.Response r0 = r4.LIZ     // Catch: X.C0Y8K -> L73
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C0Y8K -> L73
            if (r0 == 0) goto L56
            com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody r3 = r0.update_conversation_participant_body     // Catch: X.C0Y8K -> L73
        L56:
            X.0YMX r1 = X.C0YMW.newBuilder()     // Catch: X.C0Y8K -> L73
            if (r3 == 0) goto L64
            java.lang.Integer r0 = r3.status     // Catch: X.C0Y8K -> L73
            if (r0 == 0) goto L64
            int r8 = r0.intValue()     // Catch: X.C0Y8K -> L73
        L64:
            X.0YMW r1 = r1.LIZ     // Catch: X.C0Y8K -> L73
            r1.status = r8     // Catch: X.C0Y8K -> L73
            if (r3 == 0) goto L6e
            java.lang.String r0 = r3.check_message     // Catch: X.C0Y8K -> L73
            if (r0 != 0) goto L70
        L6e:
            java.lang.String r0 = ""
        L70:
            r1.checkMsg = r0     // Catch: X.C0Y8K -> L73
            goto L9a
        L73:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0YEM r0 = r13.LIZIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.String r1 = "UpdateMemberUseCase"
            java.lang.String r0 = "remove member error"
            r2.LJIIIIZZ(r1, r0, r4)
            X.0YMX r2 = X.C0YMW.newBuilder()
            int r1 = r4.getErrorCode()
            X.0YMW r0 = r2.LIZ
            r0.code = r1
            java.lang.String r0 = r4.getMessage()
            X.0YMW r1 = r2.LIZ
            r1.statusMsg = r0
            r1.throwable = r4
        L9a:
            X.0Y0y r0 = new X.0Y0y
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867340Y0u.LIZ(com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r24, long r25, X.C862540Xsa r27, X.InterfaceC1364105Vn<? super X.C867080Xzu> r28) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867340Y0u.LIZIZ(java.lang.String, long, X.0Xsa, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r13, long r14, X.C862540Xsa r16, X.InterfaceC867020Xzo<X.C0YAE> r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            r12 = this;
            r3 = r18
            r5 = r17
            boolean r0 = r3 instanceof X.C867310Y0r
            r6 = r12
            if (r0 == 0) goto L66
            r11 = r3
            X.0Y0r r11 = (X.C867310Y0r) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r11.LLILZ = r2
        L17:
            java.lang.Object r4 = r11.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r11.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2d
            if (r2 == r0) goto L3f
            if (r2 != r1) goto L6c
            X.C155000ia.LIZIZ(r4)
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r4)
            r11.LL = r5
            r11.LLILZ = r0
            r10 = r16
            r8 = r14
            r7 = r13
            java.lang.Object r4 = r6.LIZIZ(r7, r8, r10, r11)
            if (r4 != r3) goto L44
            return r3
        L3f:
            X.0Xzo r5 = r11.LL
            X.C155000ia.LIZIZ(r4)
        L44:
            X.0Xzu r4 = (X.C867080Xzu) r4
            r2 = 0
            r11.LL = r2
            r11.LLILZ = r1
            if (r5 == 0) goto L63
            X.1DEx r1 = r6.LIZJ
            X.0Xzt r0 = new X.0Xzt
            r0.<init>(r4, r5, r2)
            java.lang.Object r1 = X.C23250099c.LJI(r11, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L60:
            if (r1 != r3) goto L2a
            return r3
        L63:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L60
        L66:
            X.0Y0r r11 = new X.0Y0r
            r11.<init>(r6, r3)
            goto L17
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867340Y0u.LIZJ(java.lang.String, long, X.0Xsa, X.0Xzo, X.05Vn):java.lang.Object");
    }
}
