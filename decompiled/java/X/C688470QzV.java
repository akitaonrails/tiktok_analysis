package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2$handleDown$1", f = "FeedSearchBottomBarAssemV2.kt", l = {553, 556}, m = "invokeSuspend")
public final class C688470QzV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FeedSearchBottomBarAssemV2 LLILLJJLI;
    public final /* synthetic */ C688480QzW LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C688470QzV(FeedSearchBottomBarAssemV2 feedSearchBottomBarAssemV2, C688480QzW c688480QzW, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C688470QzV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = feedSearchBottomBarAssemV2;
        this.LLILLL = c688480QzW;
        this.LLILZ = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C688470QzV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "FeedSearchBottomBarAssemV2@e83e.handleDown$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L48
            if (r0 != r4) goto L75
            X.C155000ia.LIZIZ(r7)
        L16:
            com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2 r2 = r6.LLILLJJLI
            boolean r0 = r2.LLLII
            if (r0 == 0) goto L23
            X.0QzW r1 = r6.LLILLL
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r6.LLILZ
            r2.Bp(r0, r1)
        L23:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L29:
            X.C155000ia.LIZIZ(r7)
            X.0QzY r0 = X.C688500QzY.LIZ
            r0.getClass()
            X.01GW r0 = X.C688500QzY.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig r0 = (com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig) r0
            int r0 = r0.firstWaitTime
            long r0 = (long) r0
            r6.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r3) goto L4b
            X.C1C7U.LIZIZ(r5)
            return r3
        L48:
            X.C155000ia.LIZIZ(r7)
        L4b:
            com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2 r2 = r6.LLILLJJLI
            boolean r0 = r2.LLLFF
            if (r0 == 0) goto L6d
            X.0QzY r0 = X.C688500QzY.LIZ
            r0.getClass()
            X.01GW r0 = X.C688500QzY.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig r0 = (com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig) r0
            int r0 = r0.secondWaitTime
            long r0 = (long) r0
            r6.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r3) goto L16
            X.C1C7U.LIZIZ(r5)
            return r3
        L6d:
            X.0QzW r1 = r6.LLILLL
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r6.LLILZ
            r2.Bp(r0, r1)
            goto L23
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688470QzV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
