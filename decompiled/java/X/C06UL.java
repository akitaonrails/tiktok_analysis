package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06UL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent$createItemActionSheet$actions$1$2$1", f = "HeaderStoryHighlightsOtherCollectionComponent.kt", l = {390}, m = "invokeSuspend")
public final class C06UL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HeaderStoryHighlightsOtherCollectionComponent LLILLJJLI;
    public final /* synthetic */ StoryHighlightCollection LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06UL(HeaderStoryHighlightsOtherCollectionComponent headerStoryHighlightsOtherCollectionComponent, StoryHighlightCollection storyHighlightCollection, InterfaceC1364105Vn<? super C06UL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = headerStoryHighlightsOtherCollectionComponent;
        this.LLILLL = storyHighlightCollection;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06UL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r3
      0x0045: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:13:0x0043, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r6 = "HeaderStoryHighlightsOtherCollectionComponent@a2a.createItemActionSheet$actions$1$2$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L64
            X.C155000ia.LIZIZ(r8)
        L13:
            java.lang.String r8 = (java.lang.String) r8
            X.06UM r0 = com.ss.android.ugc.tiktok.report.interfaces.IReportService.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.report.interfaces.IReportService r3 = X.C06UM.LIZ()
            kotlin.jvm.internal.AwS116S1100000_2 r2 = new kotlin.jvm.internal.AwS116S1100000_2
            com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent r1 = r7.LLILLJJLI
            r0 = 18
            r2.<init>(r8, r1, r0)
            r3.report(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L30:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent r0 = r7.LLILLJJLI
            r0.zp()
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection r0 = r7.LLILLL
            java.lang.String r4 = ""
            if (r0 == 0) goto L42
            java.lang.String r3 = r0.collectionId
            if (r3 != 0) goto L45
        L42:
            r3 = r4
            if (r0 == 0) goto L50
        L45:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.collectionCoverUrl
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.getUri()
            if (r0 == 0) goto L50
            r4 = r0
        L50:
            r7.LL = r1
            X.1DFB r2 = X.C0PEM.LIZJ
            X.01kH r1 = new X.01kH
            r0 = 0
            r1.<init>(r3, r4, r0)
            java.lang.Object r8 = X.C23250099c.LJI(r7, r2, r1)
            if (r8 != r5) goto L13
            X.C1C7U.LIZIZ(r6)
            return r5
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06UL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
