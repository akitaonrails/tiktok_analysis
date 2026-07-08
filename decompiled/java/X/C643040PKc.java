package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: renamed from: X.0PKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643040PKc<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C643040PKc<T> LIZ = new C643040PKc<>();

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0PBZ LIZIZ(X.InterfaceC594520NTm r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r7 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r7
            com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard r0 = r7.brandZoneCard
            r4 = 0
            if (r0 == 0) goto L53
            r0 = 1
        L8:
            r3 = 0
            if (r0 == 0) goto L65
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard r2 = r7.brandZoneCard
            if (r2 == 0) goto L38
            java.util.List r1 = r2.getMainVideos()
            if (r1 == 0) goto L23
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L23
            r3.addAll(r1)
        L23:
            com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.OfficialAccount r0 = r2.getOfficialAccount()
            if (r0 == 0) goto L38
            java.util.List r1 = r0.getAwemeList()
            if (r1 == 0) goto L38
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L38
            r3.addAll(r1)
        L38:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L66
        L40:
            int r0 = r3.size()
            if (r4 >= r0) goto L55
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 != 0) goto L55
            int r4 = r4 + 1
            goto L40
        L53:
            r0 = 0
            goto L8
        L55:
            int r0 = r3.size()
            if (r4 >= r0) goto L66
        L5b:
            X.0PBh r3 = new X.0PBh
            r5 = 0
            r6 = 0
            r8 = 14
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
        L65:
            return r3
        L66:
            r4 = -1
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643040PKc.LIZIZ(X.0NTm, com.ss.android.ugc.aweme.feed.model.Aweme):X.0PBZ");
    }

    @Override // X.C0PBX
    public final C0PBZ LIZ(SearchMixFeed searchMixFeed, Aweme aweme, C0PHW c0phw) {
        return LIZIZ(searchMixFeed, aweme);
    }
}
