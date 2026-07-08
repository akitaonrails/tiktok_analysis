package X;

import com.ss.android.ugc.aweme.story.reveal.StoryRevealServiceImpl;

/* JADX INFO: renamed from: X.0Sh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealServiceImpl", f = "StoryRevealServiceImpl.kt", l = {491}, m = "getSocialProof")
public final class C727960Sh0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryRevealServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C727960Sh0(StoryRevealServiceImpl storyRevealServiceImpl, InterfaceC1364105Vn<? super C727960Sh0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyRevealServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryRevealServiceImpl@ed27.getSocialProof$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object socialProof = this.LLILLJJLI.getSocialProof(0, this);
        C1C7U.LIZIZ("StoryRevealServiceImpl@ed27.getSocialProof$1");
        return socialProof;
    }
}
