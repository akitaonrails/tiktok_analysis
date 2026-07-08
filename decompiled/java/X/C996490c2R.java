package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0c2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996490c2R extends C09AY implements Function2<FeedCommerceAssem, C291001Au<? extends C1025100cma>, Unit> {
    public C996490c2R() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem r5, X.C291001Au<? extends X.C1025100cma> r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem r5 = (com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem) r5
            X.01Au r6 = (X.C291001Au) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LLJL
            r3 = 1
            if (r0 == 0) goto L61
            boolean r0 = X.C1017070cZd.LJJLIIIJL(r0)
            if (r0 != r3) goto L61
            r2 = 0
            if (r6 == 0) goto L72
            T r0 = r6.LIZ
            X.0cma r0 = (X.C1025100cma) r0
            if (r0 == 0) goto L72
            java.lang.String r1 = r0.LJII
        L1a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LLJL
            if (r0 == 0) goto L70
            java.lang.String r0 = r0.getAid()
        L22:
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L61
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ad.feed.IFeedAdService> r0 = com.ss.android.ugc.aweme.ad.feed.IFeedAdService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.ad.feed.IFeedAdService r1 = (com.ss.android.ugc.aweme.ad.feed.IFeedAdService) r1
            if (r6 == 0) goto L64
            T r0 = r6.LIZ
            X.0cma r0 = (X.C1025100cma) r0
            if (r0 == 0) goto L64
            int r0 = r0.LIZLLL
        L44:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.LJJII(r0)
            if (r0 != 0) goto L66
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L61
            X.01GW r0 = r5.LLJJJJLIIL
            java.lang.Object r0 = r0.getValue()
            X.0c8Y r0 = (X.InterfaceC1000280c8Y) r0
            if (r0 == 0) goto L61
            r0.LJIIJJI(r1)
        L61:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L64:
            r0 = -1
            goto L44
        L66:
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem> r0 = com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            X.C723830SaL.LJ(r5, r0, r3, r2)
            goto L61
        L70:
            r0 = r2
            goto L22
        L72:
            r1 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C996490c2R.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
