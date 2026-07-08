package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS162S0101000_24;

/* JADX INFO: renamed from: X.0rm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601400rm6 {
    public final C1601380rm4 LIZ;

    public C1601400rm6(C1601380rm4 c1601380rm4) {
        this.LIZ = c1601380rm4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = "homepage_hot"
            boolean r0 = X.C2093608Ic.LIZJ(r0, r0)
            if (r0 == 0) goto L91
            X.0rm4 r1 = r8.LIZ
            if (r1 == 0) goto L91
            r0 = 1
            if (r9 != r0) goto L33
            boolean r0 = r1.LLJI
            if (r0 != 0) goto L2c
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto L2c
            X.0rmI r0 = r0.S3()
            if (r0 == 0) goto L2c
            r0.LIZ(r1)
        L2c:
            X.0rm4 r0 = r8.LIZ
            boolean r0 = r0.LLJI
            if (r0 == 0) goto L36
            return
        L33:
            if (r9 != r0) goto L36
            goto L2c
        L36:
            long r0 = java.lang.System.currentTimeMillis()
            X.0rm4 r2 = r8.LIZ
            java.lang.Object r2 = r2.getData()
            if (r2 == 0) goto L5a
            X.0rm4 r2 = r8.LIZ
            java.lang.Object r2 = r2.getData()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r2
            com.ss.android.ugc.aweme.feed.model.Extra r2 = r2.extra
            if (r2 == 0) goto L5a
            X.0rm4 r0 = r8.LIZ
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            com.ss.android.ugc.aweme.feed.model.Extra r0 = r0.extra
            long r0 = r0.now
        L5a:
            X.01GW r2 = X.C292930Bdz.LIZ
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L94
            X.0rm4 r2 = r8.LIZ
            com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = r2.LLILZ
            if (r2 == 0) goto L91
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r2 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r3 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.live.ILiveOuterService r2 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r2
            if (r2 == 0) goto L91
            X.0rmI r3 = r2.S3()
            if (r3 == 0) goto L91
            X.0rm4 r2 = r8.LIZ
            com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = r2.LLILZ
            if (r2 == 0) goto L92
            java.util.List r2 = r2.getItems()
        L8e:
            r3.LJIIJJI(r0, r2)
        L91:
            return
        L92:
            r2 = 0
            goto L8e
        L94:
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r2 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r3 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.live.ILiveOuterService r2 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r2
            if (r2 == 0) goto L91
            X.0rmI r3 = r2.S3()
            if (r3 == 0) goto L91
            X.0rm4 r2 = r8.LIZ
            java.util.List r2 = r2.getItems()
            r3.LJIIJJI(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601400rm6.LIZIZ(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r12, com.ss.android.ugc.aweme.feed.model.FeedItemList r13) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601400rm6.LIZ(int, com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    public final void LIZJ(int i, FeedItemList feedItemList) {
        boolean z;
        List<Aweme> items;
        boolean z2;
        List<Aweme> items2;
        IInfoService iInfoServiceInfoService;
        List<Aweme> items3;
        List<Aweme> items4;
        boolean z3;
        boolean z4;
        List<Aweme> items5 = null;
        if (C1157804fw.LIZ()) {
            InterfaceC1601620rmS interfaceC1601620rmS = (InterfaceC1601620rmS) PluggableExtentionKt.pluggableSpi$default(ISearchServiceLowEnd.class, false, false, false, 14, null);
            if (interfaceC1601620rmS != null) {
                if (i == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                interfaceC1601620rmS.LLZZ(z4);
            }
            InterfaceC1601620rmS interfaceC1601620rmS2 = (InterfaceC1601620rmS) PluggableExtentionKt.pluggableSpi$default(ISearchServiceLowEnd.class, false, false, false, 14, null);
            if (interfaceC1601620rmS2 != null) {
                if (feedItemList != null) {
                    items4 = feedItemList.getItems();
                } else {
                    items4 = null;
                }
                if (i != 0 && i != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                interfaceC1601620rmS2.LLLIIII(items4, z3);
            }
        } else {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            c1er1.LLZZ(z);
            if (feedItemList != null) {
                items = feedItemList.getItems();
            } else {
                items = null;
            }
            if (i != 0 && i != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            c1er1.LLLIIII(items, z2);
        }
        if (C1565340qpw.LIZ().getOptLiveReportUnread()) {
            boolean zLJIILIIL = C104100aN.LIZ().LJIILIIL();
            if (i == 0 && !zLJIILIIL) {
                C0S78.LIZJ(new AwS162S0101000_24(this, i, 6), true);
            } else if (C293570Bf1.LIZ()) {
                LIZIZ(i);
            }
        } else if (C293570Bf1.LIZ()) {
            LIZIZ(i);
        }
        C1606010rtX c1606010rtX = C1606010rtX.LIZIZ;
        EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
        if (feedItemList != null) {
            items2 = feedItemList.getItems();
        } else {
            items2 = null;
        }
        c1606010rtX.LIZJ(enumC1615506Uf, EnumC1606080rte.FEED, items2, AFwS264S0000000_24.get$arr$(763));
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            if (feedItemList != null) {
                items3 = feedItemList.getItems();
            } else {
                items3 = null;
            }
            iLiveOuterService.R4(items3);
        }
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iInfoServiceInfoService = iExternalService.infoService()) != null) {
            if (feedItemList != null) {
                items5 = feedItemList.getItems();
            }
            iInfoServiceInfoService.preloadTemplateLib(items5);
        }
        C1601390rm5 c1601390rm5 = this.LIZ.LL;
        if (c1601390rm5 != null) {
            c1601390rm5.LJJ();
        }
    }
}
