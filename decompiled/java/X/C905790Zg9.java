package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C905790Zg9 extends C2217421BqW implements Function1<C869590Y9l, Boolean> {
    public final /* synthetic */ Function1<C869590Y9l, Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C905790Zg9(Function1<? super C869590Y9l, Boolean> function1) {
        super(1, C1449605lu.class, "canHandleStreamMessage", "tryMarkStreamingFirstReceived$canHandleStreamMessage(Lkotlin/jvm/functions/Function1;Lcom/bytedance/im/core/message/core/model/Message;)Z", 0);
        this.LL = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(X.C869590Y9l r4) {
        /*
            r3 = this;
            X.0Y9l r4 = (X.C869590Y9l) r4
            kotlin.jvm.functions.Function1<X.0Y9l, java.lang.Boolean> r2 = r3.LL
            int r1 = r4.getMsgType()
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r1 != r0) goto L31
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r1 = X.C0Z2Z.LIZ(r4, r0)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.template.card.StreamingCardTemplate
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.im.message.template.card.StreamingCardTemplate r1 = (com.ss.android.ugc.aweme.im.message.template.card.StreamingCardTemplate) r1
            if (r1 == 0) goto L31
            com.ss.android.ugc.aweme.im.message.template.component.StreamStatusComponent r0 = r1.streamStatus
            boolean r0 = X.C905900ZgK.LIZ(r0)
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L31:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C905790Zg9.invoke(java.lang.Object):java.lang.Object");
    }
}
