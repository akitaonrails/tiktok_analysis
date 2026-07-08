package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S0V, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0V extends C09AY implements Function1<C711340RvI, Boolean> {
    public C0S0V() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(X.C711340RvI r4) {
        /*
            r3 = this;
            X.0RvI r4 = (X.C711340RvI) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZ
            com.ss.android.ugc.aweme.feed.model.PaidContentInfo r0 = r0.mPaidContentInfo
            r1 = 0
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo r0 = r0.getMiniDramaCardInfo()
            if (r0 == 0) goto L53
            java.lang.Integer r2 = r0.style
        L11:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZ
            com.ss.android.ugc.aweme.feed.model.PaidContentInfo r0 = r0.mPaidContentInfo
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo r0 = r0.getMiniDramaCardInfo()
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.cardType
        L1f:
            java.lang.String r0 = "dnu"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L2f
            java.lang.String r0 = "drama_guide"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L51
        L2f:
            com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle r0 = com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_LIST
            int r1 = r0.getValue()
            if (r2 == 0) goto L3d
            int r0 = r2.intValue()
            if (r0 == r1) goto L4b
        L3d:
            com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle r0 = com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_DEFAULT
            int r1 = r0.getValue()
            if (r2 == 0) goto L51
            int r0 = r2.intValue()
            if (r0 != r1) goto L51
        L4b:
            r0 = 1
        L4c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L51:
            r0 = 0
            goto L4c
        L53:
            r2 = r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S0V.invoke(java.lang.Object):java.lang.Object");
    }
}
