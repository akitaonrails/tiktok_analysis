package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891020YxQ extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891020YxQ(String str, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r10 = this;
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.065q r4 = r0.LIZJ()
            X.06pK r5 = X.EnumC1725606pK.MESSAGE_ALERT
            r6 = 0
            r3 = 0
            boolean r8 = r5.getAllowUsingLocalStaleValue()
            r9 = 1
            r7 = r6
            java.lang.Object r0 = r4.LJFF(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert) r0
            if (r0 == 0) goto L51
            java.lang.Integer r2 = r0.outAppConversationAlertStatus
            X.0YxR r0 = X.EnumC891030YxR.ENABLE
            int r1 = r0.getValue()
            if (r2 == 0) goto L51
            int r0 = r2.intValue()
            if (r0 != r1) goto L51
            r2 = 1
        L30:
            X.0629 r0 = com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI r0 = X.AnonymousClass0629.LIZ()
            X.06k7 r1 = r0.LIZ()
            java.lang.String r0 = r10.LL
            boolean r1 = r1.LJIL(r0)
            if (r2 == 0) goto L4c
            boolean r0 = r10.LLILLJJLI
            if (r0 != 0) goto L4c
            if (r1 != 0) goto L4c
            r3 = 1
        L4c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L51:
            r2 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C891020YxQ.invoke():java.lang.Object");
    }
}
