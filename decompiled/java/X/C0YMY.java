package X;

import java.util.List;

/* JADX INFO: renamed from: X.0YMY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMY {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final AbstractC2252651DEx LIZJ;
    public final InterfaceC872900YMe LIZLLL;
    public final int LJ;

    public C0YMY(InterfaceC864330XvT interfaceC864330XvT, final C0YEM c0yem) {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        InterfaceC872900YMe interfaceC872900YMe = new InterfaceC872900YMe(c0yem) { // from class: X.0Y1W
            public final C0YEM LIZ;
            public final C0Y9J LIZIZ;

            {
                this.LIZ = c0yem;
                this.LIZIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
            }

            @Override // X.InterfaceC872900YMe
            public final C0Y8T LIZ(String str) {
                return this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
            }

            @Override // X.InterfaceC872900YMe
            public final void LIZIZ(C0Y8T c0y8t) {
                this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(8, c0y8t);
            }

            @Override // X.InterfaceC872900YMe
            public final void LJJLJLI(List<C0YAE> list) {
                this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJJJL(list);
            }

            @Override // X.InterfaceC872900YMe
            public final void LJJZZI(C0Y8T c0y8t) {
                this.LIZIZ.LJIIJJI().LJJJJJ(c0y8t);
            }

            @Override // X.InterfaceC872900YMe
            public final C0Y8T LJL(String str) {
                return this.LIZIZ.LJIIJJI().LIZ(str, true);
            }

            @Override // X.InterfaceC872900YMe
            public final int LIZJ(String str, List<Long> list) {
                return this.LIZIZ.LJIILIIL().LJIIL(str, list);
            }

            @Override // X.InterfaceC872900YMe
            public final List<C0YAE> LJJZ(String str, List<Long> list) {
                return this.LIZIZ.LJIILIIL().LJJZ(str, list);
            }
        };
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = abstractC2238408pq;
        this.LIZLLL = interfaceC872900YMe;
        this.LJ = C0YMR.REMOVE_CONVERSATION_PARTICIPANTS.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.im.core.proto.Request r14, X.InterfaceC1364105Vn<? super X.C872910YMf> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C872890YMd
            if (r0 == 0) goto L22
            r5 = r15
            X.0YMd r5 = (X.C872890YMd) r5
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
            X.0YMd r5 = new X.0YMd
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
            com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody r3 = r0.conversation_remove_participants_body     // Catch: X.C0Y8K -> L73
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
            java.lang.String r1 = "RemoveMemberUseCase"
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
            X.0YMf r0 = new X.0YMf
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YMY.LIZ(com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0YMe] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.0YMY] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r21, java.util.List<java.lang.Long> r22, java.util.Map<java.lang.String, java.lang.String> r23, X.InterfaceC1364105Vn<? super X.C867060Xzs> r24) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YMY.LIZIZ(java.lang.String, java.util.List, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, java.util.List<java.lang.Long> r8, java.util.Map<java.lang.String, java.lang.String> r9, X.InterfaceC867020Xzo<java.util.List<X.C0YAE>> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C872880YMc
            if (r0 == 0) goto L5d
            r5 = r11
            X.0YMc r5 = (X.C872880YMc) r5
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
            r5.LL = r10
            r5.LLILZ = r0
            java.lang.Object r4 = r6.LIZIZ(r7, r8, r9, r5)
            if (r4 != r3) goto L3b
            return r3
        L36:
            X.0Xzo r10 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L3b:
            X.0Xzs r4 = (X.C867060Xzs) r4
            r2 = 0
            r5.LL = r2
            r5.LLILZ = r1
            if (r10 == 0) goto L5a
            X.1DEx r1 = r6.LIZJ
            X.0Xzr r0 = new X.0Xzr
            r0.<init>(r4, r10, r2)
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
            X.0YMc r5 = new X.0YMc
            r5.<init>(r6, r11)
            goto L12
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YMY.LIZJ(java.lang.String, java.util.List, java.util.Map, X.0Xzo, X.05Vn):java.lang.Object");
    }
}
