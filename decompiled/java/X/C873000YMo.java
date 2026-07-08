package X;

/* JADX INFO: renamed from: X.0YMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873000YMo {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final C0Y77 LIZJ;
    public final int LIZLLL = C0YMR.GET_MESSAGES_BY_CONVERSATION_WITH_RANGE.getValue();

    public C873000YMo(InterfaceC864330XvT interfaceC864330XvT, C0YEM c0yem, C0Y77 c0y77) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = c0y77;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C873100YMy r14, com.bytedance.im.core.proto.Request r15, X.InterfaceC1364105Vn<? super com.bytedance.im.core.proto.MessagesInConversationWithRangeResponseBody> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C873040YMs
            if (r0 == 0) goto L26
            r5 = r3
            X.0YMs r5 = (X.C873040YMs) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LLILZ = r2
        L14:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            java.lang.String r3 = "GetMsgByConvWithRangeUseCase"
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.0YMy r14 = r5.LL
            goto L50
        L26:
            X.0YMs r5 = new X.0YMs
            r5.<init>(r13, r3)
            goto L14
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r4)
            X.0XvT r0 = r13.LIZ     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            X.0YCX r6 = new X.0YCX     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            r8 = 0
            r10 = 0
            r12 = 510(0x1fe, float:7.15E-43)
            r7 = r15
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            r5.LL = r14     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            r5.LLILZ = r1     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            java.lang.Object r4 = r0.LLLIILIL(r6, r1, r5)     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            if (r4 != r2) goto L53
            return r2
        L50:
            X.C155000ia.LIZIZ(r4)     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
        L53:
            X.0XwA r4 = (X.C864760XwA) r4     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            com.bytedance.im.core.proto.Response r2 = r4.LIZ     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            java.lang.String r0 = r2.log_id     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            java.lang.String r1 = ""
            if (r0 != 0) goto L5e
            r0 = r1
        L5e:
            r14.LIZ = r0     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            java.lang.String r0 = r2.region     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            if (r0 == 0) goto L65
            r1 = r0
        L65:
            r14.LIZLLL = r1     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            java.lang.System.currentTimeMillis()     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            com.bytedance.im.core.proto.Response r0 = r4.LIZ     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            if (r0 == 0) goto Lb6
            com.bytedance.im.core.proto.MessagesInConversationWithRangeResponseBody r0 = r0.messages_in_conversation_with_range     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8f
            return r0
        L73:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = r2.getErrorCode()
            r14.LIZIZ = r0
            java.lang.String r0 = r2.getErrorMessage()
            r14.LIZJ = r0
            X.0YEM r0 = r13.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "pull, network failed."
            r1.LJIIIIZZ(r3, r0, r2)
            goto Lb6
        L8f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            r0 = -1
            r14.LIZIZ = r0
            java.lang.String r0 = "unknown exception"
            r14.LIZJ = r0
            X.0YEM r0 = r13.LIZIZ
            X.0XwD r0 = r0.LJIIZILJ()
            X.0Y8y r0 = r0.LJFF()
            X.0YLL r0 = r0.getEventTracker()
            r0.LIZLLL(r3, r2)
            X.0YEM r0 = r13.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "pull, failed."
            r1.LJIIIIZZ(r3, r0, r2)
        Lb6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873000YMo.LIZ(X.0YMy, com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:16:0x006a, B:18:0x0070], limit reached: 43 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d8 -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r37, java.lang.String r38, long r39, java.util.List<com.bytedance.im.core.proto.MessageBody> r41, X.C873100YMy r42, X.InterfaceC1364105Vn<? super java.util.List<X.C0Y7T>> r43) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873000YMo.LIZJ(int, java.lang.String, long, java.util.List, X.0YMy, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0317  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0314 -> B:12:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r41, java.lang.String r42, long r43, int r45, com.bytedance.im.core.proto.MessageRange r46, X.EnumC873090YMx r47, X.InterfaceC1364105Vn<? super X.C0YN1> r48) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873000YMo.LIZIZ(int, java.lang.String, long, int, com.bytedance.im.core.proto.MessageRange, X.0YMx, X.05Vn):java.lang.Object");
    }
}
