package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.impl.IMBusinessFeedbackService$reportFeedback$1", f = "IMBusinessFeedbackService.kt", l = {65}, m = "invokeSuspend")
public final class C1722906ot extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722906ot(C869590Y9l c869590Y9l, boolean z, String str, String str2, InterfaceC1364105Vn<? super C1722906ot> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722906ot(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "IMBusinessFeedbackService@42cf.reportFeedback$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r11.LL
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 != r7) goto L11
            goto L82
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r12)
            X.06ou r0 = com.ss.android.ugc.aweme.im.b2c.feedback.IIMBusinessFeedBackApi.LIZ     // Catch: java.lang.Exception -> Laa
            r0.getClass()     // Catch: java.lang.Exception -> Laa
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r0 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)     // Catch: java.lang.Exception -> Laa
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto L3c
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> Laa
            X.011f r1 = r1.LIZ(r0)     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto L3c
            java.lang.Class<com.ss.android.ugc.aweme.im.b2c.feedback.IIMBusinessFeedBackApi> r0 = com.ss.android.ugc.aweme.im.b2c.feedback.IIMBusinessFeedBackApi.class
            java.lang.Object r9 = r1.create(r0)     // Catch: java.lang.Exception -> Laa
            com.ss.android.ugc.aweme.im.b2c.feedback.IIMBusinessFeedBackApi r9 = (com.ss.android.ugc.aweme.im.b2c.feedback.IIMBusinessFeedBackApi) r9     // Catch: java.lang.Exception -> Laa
            goto L3d
        L3c:
            r9 = 0
        L3d:
            if (r9 == 0) goto L87
            com.ss.android.ugc.aweme.im.b2c.feedback.FeedBackRequestBody r6 = new com.ss.android.ugc.aweme.im.b2c.feedback.FeedBackRequestBody     // Catch: java.lang.Exception -> Laa
            java.lang.Integer r5 = X.C2286608xc.LJ(r7)     // Catch: java.lang.Exception -> Laa
            com.ss.android.ugc.aweme.im.b2c.feedback.FeedBackData r4 = new com.ss.android.ugc.aweme.im.b2c.feedback.FeedBackData     // Catch: java.lang.Exception -> Laa
            X.0Y9l r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> Laa
            long r0 = r0.getSender()     // Catch: java.lang.Exception -> Laa
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Laa
            X.0Y9l r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> Laa
            long r0 = r0.getConversationShortId()     // Catch: java.lang.Exception -> Laa
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Laa
            X.0Y9l r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> Laa
            long r0 = r0.getMsgId()     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Laa
            boolean r0 = r11.LLILLL     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = 2
        L6c:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> Laa
            r4.<init>(r3, r2, r1, r0)     // Catch: java.lang.Exception -> Laa
            r6.<init>(r5, r4)     // Catch: java.lang.Exception -> Laa
            r11.LL = r7     // Catch: java.lang.Exception -> Laa
            java.lang.Object r12 = r9.reportEvent(r6, r11)     // Catch: java.lang.Exception -> Laa
            if (r12 != r8) goto L85
            X.C1C7U.LIZIZ(r10)
            return r8
        L82:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> Laa
        L85:
            com.ss.android.ugc.aweme.base.api.BaseResponse r12 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r12     // Catch: java.lang.Exception -> Laa
        L87:
            X.0Y9l r2 = r11.LLILLJJLI     // Catch: java.lang.Exception -> Laa
            boolean r3 = r11.LLILLL     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = r11.LLILZ     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = r11.LLILZIL     // Catch: java.lang.Exception -> Laa
            java.util.Map r2 = X.C1722806os.LIZ(r2, r1, r0)     // Catch: java.lang.Exception -> Laa
            if (r3 == 0) goto La7
            java.lang.String r1 = "like"
        L97:
            java.lang.String r0 = "action"
            r2.put(r0, r1)     // Catch: java.lang.Exception -> Laa
            X.0I0B r0 = X.C0I0B.LJFF     // Catch: java.lang.Exception -> Laa
            r0.LIZIZ()     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = "b2c_msg_feedback"
            X.C20684815ws.LJIILLIIL(r0, r2)     // Catch: java.lang.Exception -> Laa
            goto Lae
        La7:
            java.lang.String r1 = "dislike"
            goto L97
        Laa:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lae:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1722906ot.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
