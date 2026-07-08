package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872940YMi {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final Function1<String, C0Y8T> LIZJ;
    public final Function1<String, C0Y8T> LIZLLL;
    public final boolean LJ;

    public C872940YMi(InterfaceC864330XvT interfaceC864330XvT, C0YEM c0yem) {
        C864910XwP c864910XwP = new C864910XwP(c0yem);
        C864400Xva c864400Xva = new C864400Xva(c0yem);
        boolean z = c0yem.LJIIIZ().LIZIZ;
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = c864910XwP;
        this.LIZLLL = c864400Xva;
        this.LJ = z;
    }

    public final Object LIZJ(int i, long j, String str, C0YGJ c0ygj) {
        C0Y8T c0y8tInvoke = this.LIZJ.invoke(str);
        if (c0y8tInvoke == null && (c0y8tInvoke = this.LIZLLL.invoke(str)) == null) {
            if (!this.LJ) {
                return new C0YGB(C13BV.INSTANCE, -1, false, false);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageCompletenessUseCase unable to find conversation ");
            sbLIZ.append(str);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return LIZIZ(c0y8tInvoke.getInboxType(), c0y8tInvoke.getConversationType(), str, c0y8tInvoke.getConversationShortId(), j, i, c0ygj);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r12, int r13, java.lang.String r14, long r15, long r17, int r19, X.InterfaceC1364105Vn r20) {
        /*
            r11 = this;
            r4 = r20
            boolean r0 = r4 instanceof X.C872960YMk
            if (r0 == 0) goto L22
            r1 = r4
            X.0YMk r1 = (X.C872960YMk) r1
            int r3 = r1.LLILLL
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L22
            int r3 = r3 - r2
            r1.LLILLL = r3
        L14:
            java.lang.Object r4 = r1.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r3 = r1.LLILLL
            r0 = 1
            if (r3 == 0) goto L30
            if (r3 != r0) goto L28
            goto L91
        L22:
            X.0YMk r1 = new X.0YMk
            r1.<init>(r11, r4)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            X.0YMl r5 = new X.0YMl
            r5.<init>()
            r5.LJ = r14
            java.lang.Long r3 = java.lang.Long.valueOf(r15)
            r5.LIZLLL = r3
            X.0Y8s r3 = X.EnumC869400Y8s.fromValue(r13)
            r5.LJFF = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            r5.LJI = r3
            if (r19 <= 0) goto L54
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r5.LJII = r3
        L54:
            X.1ES0 r4 = new X.1ES0
            r4.<init>()
            com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody r3 = r5.build()
            r4.LJIILIIL = r3
            com.bytedance.im.core.proto.RequestBody r5 = r4.build()
            X.0YMR r3 = X.C0YMR.GET_MESSAGES_CHECK_INFO_V2
            int r4 = r3.getValue()
            X.0YEM r3 = r11.LIZIZ
            X.0YDx r6 = r3.LJ()
            X.0YEM r3 = r11.LIZIZ
            X.0YEf r7 = r3.LJIIIZ()
            r8 = 0
            r3 = r12
            com.bytedance.im.core.proto.Request r5 = X.C0YLX.LIZ(r3, r4, r5, r6, r7, r8)
            X.0XvT r3 = r11.LIZ     // Catch: X.C0Y8K -> L9f
            X.0YCX r4 = new X.0YCX     // Catch: X.C0Y8K -> L9f
            r6 = 0
            r8 = 0
            r10 = 510(0x1fe, float:7.15E-43)
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: X.C0Y8K -> L9f
            r1.LLILLL = r0     // Catch: X.C0Y8K -> L9f
            java.lang.Object r4 = r3.LLLIILIL(r4, r0, r1)     // Catch: X.C0Y8K -> L9f
            if (r4 != r2) goto L94
            return r2
        L91:
            X.C155000ia.LIZIZ(r4)     // Catch: X.C0Y8K -> L9f
        L94:
            X.0XwA r4 = (X.C864760XwA) r4     // Catch: X.C0Y8K -> L9f
            com.bytedance.im.core.proto.Response r0 = r4.LIZ     // Catch: X.C0Y8K -> L9f
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C0Y8K -> L9f
            if (r0 == 0) goto Lb0
            com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody r0 = r0.get_message_check_info_v2_body     // Catch: X.C0Y8K -> L9f
            return r0
        L9f:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0YEM r0 = r11.LIZIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.String r1 = "MessageCompletenessUseCase"
            java.lang.String r0 = "fetch error"
            r2.LJIIIIZZ(r1, r0, r3)
        Lb0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872940YMi.LIZ(int, int, java.lang.String, long, long, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r20, int r21, java.lang.String r22, long r23, long r25, int r27, X.InterfaceC1364105Vn r28) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872940YMi.LIZIZ(int, int, java.lang.String, long, long, int, X.05Vn):java.lang.Object");
    }
}
