package X;

import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.bytedance.im.core.proto.Request;

/* JADX INFO: renamed from: X.0Y3S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y3S {
    public final C0YEM LIZ;
    public final InterfaceC864330XvT LIZIZ;
    public final C0Y9J LIZJ;

    public C0Y3S(C0YEM c0yem, InterfaceC864330XvT interfaceC864330XvT) {
        this.LIZ = c0yem;
        this.LIZIZ = interfaceC864330XvT;
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
    }

    public final Request LIZ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
        C867920Y3a c867920Y3a = new C867920Y3a();
        c867920Y3a.LIZLLL = c0y8t.getConversationId();
        c867920Y3a.LJ = Long.valueOf(c0y8t.getConversationShortId());
        c867920Y3a.LJFF = Integer.valueOf(c0y8t.getConversationType());
        c867920Y3a.LJI = Long.valueOf(c869590Y9l.getMsgId());
        c867920Y3a.LJII = Integer.valueOf(c0y8t.getInboxType());
        RecallMessageRequestBody recallMessageRequestBodyBuild = c867920Y3a.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJIJLIJ = recallMessageRequestBodyBuild;
        return C870740YDw.LIZ(this.LIZ, c0y8t.getInboxType(), C0YMR.RECALL_MESSAGE.getValue(), c1es0.build(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3S.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[Catch: Exception -> 0x00e4, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e4, blocks: (B:31:0x00d9, B:33:0x00e1, B:28:0x00be), top: B:67:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c A[PHI: r2 r3 r7
      0x011c: PHI (r2v2 java.lang.String) = (r2v3 java.lang.String), (r2v4 java.lang.String), (r2v7 java.lang.String) binds: [B:47:0x0134, B:41:0x00f0, B:32:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r3v3 int) = (r3v4 int), (r3v5 int), (r3v8 int) binds: [B:47:0x0134, B:41:0x00f0, B:32:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r7v1 X.0Y9l) = (r7v2 X.0Y9l), (r7v2 X.0Y9l), (r7v8 X.0Y9l) binds: [B:47:0x0134, B:41:0x00f0, B:32:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C869590Y9l r22, X.InterfaceC1364105Vn<? super X.C189200o6<? extends X.C869590Y9l>> r23) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3S.LJI(X.0Y9l, X.05Vn):java.lang.Object");
    }

    public final void LJII(long j, String str) {
        C23250099c.LIZLLL(this.LIZ.LIZJ(), this.LIZ.LJIIIIZZ().LIZIZ(), null, new C864210XvH(j, this, this.LIZ.LJ().LJ().getUid(), str, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C869590Y9l r8, java.lang.String r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3S.LIZIZ(X.0Y9l, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C869590Y9l r9, java.lang.String r10, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.C869590Y9l, java.lang.Boolean>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0Y3V
            if (r0 == 0) goto L9b
            r6 = r11
            X.0Y3V r6 = (X.C0Y3V) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L62
            if (r0 != r4) goto La2
            X.0Y9l r9 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            long r5 = java.lang.System.currentTimeMillis()
            X.0Y9J r0 = r8.LIZJ
            X.0Y9o r4 = r0.LIZJ()
            java.lang.String r3 = r9.getUuid()
            java.lang.String r2 = r9.getConversationId()
            java.lang.String r1 = "recall_time"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.LLII(r3, r2, r1, r0)
            X.0YEM r0 = r8.LIZ
            X.0YEf r0 = r0.LJIIIZ()
            X.0YA7 r0 = r0.LJJLIIIIJ
            X.0XvJ r0 = r0.LJJIJL
            long r1 = r0.LIZIZ
            java.lang.String r0 = r9.getUuid()
            r8.LJII(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r9, r1)
            return r0
        L62:
            X.C155000ia.LIZIZ(r1)
            X.0YUT r1 = r9.getMessageStatus()
            X.0YUT r0 = X.C0YUT.RECALLED
            r3 = 4
            java.lang.String r2 = "RecallMsgUseCase"
            if (r1 != r0) goto L85
            X.0YEM r0 = r8.LIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "recalled message already updated in DB (sender)"
            X.C868780Y6i.LJ(r1, r2, r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r9, r1)
            return r0
        L85:
            X.0YEM r0 = r8.LIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "markRecalledKeepContent"
            X.C868780Y6i.LJ(r1, r2, r0, r3)
            r6.LL = r9
            r6.LLILZ = r4
            java.lang.Object r1 = r8.LIZIZ(r9, r10, r6)
            if (r1 != r5) goto L24
            return r5
        L9b:
            X.0Y3V r6 = new X.0Y3V
            r6.<init>(r8, r11)
            goto L12
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3S.LIZJ(X.0Y9l, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C869590Y9l r10, java.lang.String r11, X.InterfaceC1364105Vn<? super X.C0Y7K> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C0Y3Y
            if (r0 == 0) goto L98
            r4 = r12
            X.0Y3Y r4 = (X.C0Y3Y) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r8 = 1
            r2 = 0
            r5 = 2
            if (r0 == 0) goto L30
            if (r0 == r8) goto L3c
            if (r0 != r5) goto Lab
            boolean r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            if (r6 == 0) goto L9f
            X.0Y1s r4 = new X.0Y1s
            r4.<init>(r2)
            return r4
        L30:
            X.C155000ia.LIZIZ(r1)
            r4.LLILZ = r8
            java.lang.Object r1 = r9.LJIIIIZZ(r10, r11, r4)
            if (r1 != r3) goto L3f
            return r3
        L3c:
            X.C155000ia.LIZIZ(r1)
        L3f:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r7 = r1.getFirst()
            X.0Y9l r7 = (X.C869590Y9l) r7
            java.lang.Object r0 = r1.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            X.C23118094a.LJI(r0)
            X.0Y9J r0 = r9.LIZJ
            X.0Y8e r1 = r0.LJIIJJI()
            java.lang.String r0 = r7.getConversationId()
            X.0Y8T r1 = r1.LIZ(r0, r8)
            if (r1 == 0) goto L84
            java.lang.String r0 = r7.getUuid()
            boolean r0 = r1.removeMentionMessage(r0)
            java.lang.Boolean.valueOf(r0)
            X.0YEM r0 = r9.LIZ
            X.0XwD r0 = r0.LJIIZILJ()
            X.0Y5r r0 = r0.LIZLLL()
            X.0Y1U r0 = r0.LIZLLL()
            r0.LJJL(r5, r1)
        L84:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0Xvh r0 = new X.0Xvh
            r0.<init>(r9, r7, r2)
            r4.LL = r6
            r4.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L28
            return r3
        L98:
            X.0Y3Y r4 = new X.0Y3Y
            r4.<init>(r9, r12)
            goto L12
        L9f:
            X.0Y3A r4 = new X.0Y3A
            X.0Y6t r3 = X.EnumC868890Y6t.CLIENT_ERROR
            java.lang.String r1 = "Recall message failed"
            r0 = 12
            r4.<init>(r3, r1, r2, r0)
            return r4
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3S.LJ(X.0Y9l, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC863600XuI r14, X.C869590Y9l r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3S.LJFF(X.0XuI, X.0Y9l, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C869590Y9l r8, java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.C869590Y9l, java.lang.Boolean>> r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3S.LJIIIIZZ(X.0Y9l, java.lang.String, X.05Vn):java.lang.Object");
    }
}
