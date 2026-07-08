package X;

import com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardFakePlayerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RO3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardFakePlayerComponent$startTimer$1", f = "StoryGuideUploadCardFakePlayerComponent.kt", l = {93}, m = "invokeSuspend")
public final class C0RO3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ StoryGuideUploadCardFakePlayerComponent LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RO3(int i, int i2, StoryGuideUploadCardFakePlayerComponent storyGuideUploadCardFakePlayerComponent, InterfaceC1364105Vn<? super C0RO3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = storyGuideUploadCardFakePlayerComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0RO3(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r11 <= r14.LLILZ) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:6:0x0016). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r13 = "StoryGuideUploadCardFakePlayerComponent@6179.startTimer$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r12 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r3 = 0
            r10 = 1
            if (r0 == 0) goto L53
            if (r0 != r10) goto L5d
            int r11 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L16:
            int r0 = r14.LLILZ
            if (r11 == r0) goto L65
            int r11 = r11 + 1
        L1c:
            com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardFakePlayerComponent r2 = r14.LLILZIL
            r2.LLJLL = r11
            long r8 = (long) r11
            r6 = 300(0x12c, double:1.48E-321)
            long r8 = r8 * r6
            r4 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4 - r8
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L50
            r8 = 10000(0x2710, double:4.9407E-320)
        L2d:
            double r0 = (double) r8
            r8 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r0 = r0 / r8
            X.0Ooa r2 = r2.LLJL
            java.lang.Object r8 = r2.getValue()
            com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility r8 = (com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility) r8
            if (r8 == 0) goto L42
            float r2 = (float) r0
            r8.aF1(r2, r3, r4)
        L42:
            r14.LL = r11
            r14.LLILLJJLI = r10
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r6, r14)
            if (r0 != r12) goto L16
            X.C1C7U.LIZIZ(r13)
            return r12
        L50:
            r4 = 300(0x12c, double:1.48E-321)
            goto L2d
        L53:
            X.C155000ia.LIZIZ(r15)
            int r11 = r14.LLILLL
            int r0 = r14.LLILZ
            if (r11 > r0) goto L65
            goto L1c
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L65:
            com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardFakePlayerComponent r4 = r14.LLILZIL
            X.01GW r0 = r4.LLJJLIIIJLLLLLLLZ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel r1 = (com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel) r1
            java.lang.String r0 = "story_immersive_guide_upload_card_aid"
            r1.onPlayCompleted(r0)
            com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager r0 = com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager.LL
            r0.getClass()
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.story.inbox.StoryInsertCard> r1 = com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager.LLILLL
            java.lang.String r0 = com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager.LIZJ()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.story.inbox.StoryInsertCard r0 = (com.ss.android.ugc.aweme.story.inbox.StoryInsertCard) r0
            if (r0 == 0) goto L8d
            boolean r10 = r0.insertLast()
        L8d:
            java.lang.String r2 = "auto"
            if (r10 == 0) goto Lac
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r4)
            if (r0 == 0) goto La1
            com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility r1 = X.C1600710rkz.LIZ(r0)
            if (r1 == 0) goto La1
            r0 = -1
            r1.yF(r0, r2)
        La1:
            com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardFakePlayerComponent r0 = r14.LLILZIL
            r0.hp(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        Lac:
            X.0Ooa r0 = r4.LLJJL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility r0 = (com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility) r0
            if (r0 == 0) goto Lb9
            r0.rf0(r2)
        Lb9:
            X.0Ooa r0 = r4.LLJJL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility r0 = (com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility) r0
            if (r0 == 0) goto La1
            r0.bh1()
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RO3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
