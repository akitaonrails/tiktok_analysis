package X;

import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696830RUz extends C09AY implements Function1<C0S9P, C0S9P> {
    public final /* synthetic */ PhotoViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696830RUz(PhotoViewModelV2 photoViewModelV2) {
        super(1);
        this.LL = photoViewModelV2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ X.C0S9P invoke(X.C0S9P r31) {
        /*
            r30 = this;
            r4 = r31
            X.0S9P r4 = (X.C0S9P) r4
            r0 = r30
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r3 = r0.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.LLJJIJIIJIL
            r5 = 0
            if (r2 == 0) goto L2d
            X.1EE2 r0 = X.C1EE2.LIZIZ
            boolean r0 = r0.LJIJ()
            if (r0 == 0) goto L58
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r2)
            if (r0 != 0) goto L58
            boolean r0 = r3.CQ2()
            if (r0 != 0) goto L58
            int r0 = r4.LL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L27:
            if (r0 == 0) goto L2d
            int r5 = r0.intValue()
        L2d:
            r6 = 0
            r7 = 1
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r13 = 0
            r26 = 0
            r29 = 33089440(0x1f8e7a0, float:9.143318E-38)
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r14 = r13
            r15 = r13
            r16 = r7
            r17 = r6
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r13
            r25 = r13
            r28 = r6
            X.0S9P r0 = X.C0S9P.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29)
            return r0
        L58:
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchService> r6 = com.ss.android.ugc.aweme.search.ISearchService.class
            r10 = 14
            r11 = 0
            r7 = r5
            r8 = r5
            r9 = r5
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.search.ISearchService r1 = (com.ss.android.ugc.aweme.search.ISearchService) r1
            r12 = 0
            if (r1 == 0) goto L8e
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r3.LLILLL
            if (r0 == 0) goto L6f
            java.lang.String r11 = r0.mEventType
        L6f:
            boolean r1 = r1.w(r2, r11)
            r0 = 1
            if (r1 != r0) goto L8e
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchService> r7 = com.ss.android.ugc.aweme.search.ISearchService.class
            r11 = 14
            r8 = r5
            r9 = r5
            r10 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.search.ISearchService r0 = (com.ss.android.ugc.aweme.search.ISearchService) r0
            if (r0 == 0) goto L2d
            int r0 = r0.k(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L27
        L8e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C696830RUz.invoke(java.lang.Object):java.lang.Object");
    }
}
