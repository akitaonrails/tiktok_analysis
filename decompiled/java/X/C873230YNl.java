package X;

import com.bytedance.im.core.proto.Request;

/* JADX INFO: renamed from: X.0YNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873230YNl {
    public static final /* synthetic */ int LIZJ = 0;
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;

    public C873230YNl(C0YEM c0yem, InterfaceC864330XvT interfaceC864330XvT) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
    }

    public final Request LIZ(int i, int i2) {
        C873320YNu c873320YNu = new C873320YNu();
        if (i2 > 0) {
            c873320YNu.LIZLLL = Integer.valueOf(i2);
        }
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJIIJZLJL = c873320YNu.build();
        return C0YLX.LIZ(i, C0YMR.GET_CONVERSATIONS_CHECK_INFO_V2.getValue(), c1es0.build(), this.LIZIZ.LJ(), this.LIZIZ.LJIIIZ(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r13, int r14, X.InterfaceC1364105Vn<? super X.C0YGA> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C873300YNs
            if (r0 == 0) goto L20
            r4 = r15
            X.0YNs r4 = (X.C873300YNs) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L4b
        L20:
            X.0YNs r4 = new X.0YNs
            r4.<init>(r12, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0YCX r5 = new X.0YCX     // Catch: X.C0Y8K -> L59
            com.bytedance.im.core.proto.Request r6 = r12.LIZ(r13, r14)     // Catch: X.C0Y8K -> L59
            r7 = 0
            r9 = 0
            r11 = 510(0x1fe, float:7.15E-43)
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r11)     // Catch: X.C0Y8K -> L59
            X.0XvT r0 = r12.LIZ     // Catch: X.C0Y8K -> L59
            r4.LLILLL = r3     // Catch: X.C0Y8K -> L59
            java.lang.Object r2 = r0.LLLIILIL(r5, r3, r4)     // Catch: X.C0Y8K -> L59
            if (r2 != r1) goto L4e
            return r1
        L4b:
            X.C155000ia.LIZIZ(r2)     // Catch: X.C0Y8K -> L59
        L4e:
            X.0XwA r2 = (X.C864760XwA) r2     // Catch: X.C0Y8K -> L59
            com.bytedance.im.core.proto.Response r0 = r2.LIZ     // Catch: X.C0Y8K -> L59
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C0Y8K -> L59
            if (r0 == 0) goto L6a
            com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody r5 = r0.get_conversations_check_info_v2_body     // Catch: X.C0Y8K -> L59
            goto L6b
        L59:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0YEM r0 = r12.LIZIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.String r1 = "ConversationCompletenessUseCase"
            java.lang.String r0 = "fetch error"
            r2.LJIIIIZZ(r1, r0, r4)
        L6a:
            r5 = 0
        L6b:
            r4 = 0
            if (r5 != 0) goto L76
            X.0YGA r1 = new X.0YGA
            X.13BV r0 = X.C13BV.INSTANCE
            r1.<init>(r0, r4, r3)
            return r1
        L76:
            X.0YGA r3 = new X.0YGA
            java.util.List<com.bytedance.im.core.proto.ConversationCheckInfoV2> r2 = r5.conv_list
            if (r2 != 0) goto L7e
            X.13BV r2 = X.C13BV.INSTANCE
        L7e:
            java.lang.Boolean r0 = r5.is_pinned_included
            if (r0 == 0) goto L92
            boolean r1 = r0.booleanValue()
        L86:
            java.lang.Boolean r0 = r5.is_demoted
            if (r0 == 0) goto L8e
            boolean r4 = r0.booleanValue()
        L8e:
            r3.<init>(r2, r1, r4)
            return r3
        L92:
            r1 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873230YNl.LIZIZ(int, int, X.05Vn):java.lang.Object");
    }
}
