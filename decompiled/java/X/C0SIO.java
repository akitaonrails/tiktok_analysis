package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIO extends C09AY implements Function1<C0SJL<C719000SIg>, Boolean> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIO(Aweme aweme) {
        super(1);
        this.LL = aweme;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(X.C0SJL<X.C719000SIg> r6) {
        /*
            r5 = this;
            X.0SJL r6 = (X.C0SJL) r6
            METADATA r1 = r6.LLIZ
            X.0SIg r1 = (X.C719000SIg) r1
            r4 = 1
            if (r1 == 0) goto L3a
            boolean r0 = r1.LIZ()
            if (r0 != r4) goto L3a
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.LL
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = r1.LIZ
            boolean r0 = X.C301000Br0.LIZIZ
            if (r0 == 0) goto L3a
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService> r0 = com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService r0 = (com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService) r0
            boolean r0 = r0.LJJI(r3)
            if (r0 != 0) goto L3a
            int r0 = r2.getType()
            if (r0 != r4) goto L3a
            boolean r0 = r2.isCommerce()
            if (r0 != 0) goto L3a
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L3a:
            r4 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SIO.invoke(java.lang.Object):java.lang.Object");
    }
}
