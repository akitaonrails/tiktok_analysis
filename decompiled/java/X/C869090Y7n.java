package X;

import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.Request;

/* JADX INFO: renamed from: X.0Y7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869090Y7n {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final C0Y77 LIZJ;
    public final int LIZLLL = C0YMR.GET_MESSAGES_BY_CONVERSATION.getValue();

    public C869090Y7n(InterfaceC864330XvT interfaceC864330XvT, C0YEM c0yem, C0Y77 c0y77) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = c0y77;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C869200Y7y r14, com.bytedance.im.core.proto.Request r15, X.InterfaceC1364105Vn<? super com.bytedance.im.core.proto.MessagesInConversationResponseBody> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C869150Y7t
            if (r0 == 0) goto L26
            r5 = r3
            X.0Y7t r5 = (X.C869150Y7t) r5
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
            java.lang.String r3 = "GetMsgByConvAroundIndexUseCase"
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.0Y7y r14 = r5.LL
            goto L50
        L26:
            X.0Y7t r5 = new X.0Y7t
            r5.<init>(r13, r3)
            goto L14
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r4)
            X.0XvT r0 = r13.LIZ     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            X.0YCX r6 = new X.0YCX     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            r8 = 0
            r10 = 0
            r12 = 510(0x1fe, float:7.15E-43)
            r7 = r15
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            r5.LL = r14     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            r5.LLILZ = r1     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            java.lang.Object r4 = r0.LLLIILIL(r6, r1, r5)     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            if (r4 != r2) goto L53
            return r2
        L50:
            X.C155000ia.LIZIZ(r4)     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
        L53:
            X.0XwA r4 = (X.C864760XwA) r4     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            com.bytedance.im.core.proto.Response r2 = r4.LIZ     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            java.lang.String r0 = r2.log_id     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            java.lang.String r1 = ""
            if (r0 != 0) goto L5e
            r0 = r1
        L5e:
            r14.LIZ = r0     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            java.lang.String r0 = r2.region     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            if (r0 == 0) goto L65
            r1 = r0
        L65:
            r14.LIZJ = r1     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            java.lang.System.currentTimeMillis()     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            com.bytedance.im.core.proto.Response r0 = r4.LIZ     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            if (r0 == 0) goto Laf
            com.bytedance.im.core.proto.MessagesInConversationResponseBody r0 = r0.messages_in_conversation_body     // Catch: X.C0Y8K -> L73 java.lang.Exception -> L8c
            return r0
        L73:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = r2.getErrorCode()
            r14.LIZIZ = r0
            r2.getErrorMessage()
            X.0YEM r0 = r13.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "pull, network failed."
            r1.LJIIIIZZ(r3, r0, r2)
            goto Laf
        L8c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            r0 = -1
            r14.LIZIZ = r0
            X.0YEM r0 = r13.LIZIZ
            X.0XwD r0 = r0.LJIIZILJ()
            X.0Y8y r0 = r0.LJFF()
            X.0YLL r0 = r0.getEventTracker()
            r0.LIZLLL(r3, r2)
            X.0YEM r0 = r13.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "pull, failed."
            r1.LJIIIIZZ(r3, r0, r2)
        Laf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869090Y7n.LIZIZ(X.0Y7y, com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    public final Request LIZ(int i, String str, long j, int i2, long j2, EnumC873090YMx enumC873090YMx) {
        C868980Y7c c868980Y7c = new C868980Y7c();
        c868980Y7c.LIZLLL = str;
        c868980Y7c.LJFF = Long.valueOf(j);
        c868980Y7c.LJ = Integer.valueOf(i2);
        c868980Y7c.LJII = Long.valueOf(j2);
        c868980Y7c.LJI = enumC873090YMx;
        c868980Y7c.LJIIIIZZ = 20;
        MessagesInConversationRequestBody messagesInConversationRequestBodyBuild = c868980Y7c.build();
        C0YEM c0yem = this.LIZIZ;
        int i3 = this.LIZLLL;
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJIIJJI = messagesInConversationRequestBodyBuild;
        return C870740YDw.LIZ(c0yem, i, i3, c1es0.build(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r25, int r26, java.lang.String r27, long r28, long r30, X.InterfaceC1364105Vn r32) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869090Y7n.LIZJ(int, int, java.lang.String, long, long, X.05Vn):java.lang.Object");
    }
}
