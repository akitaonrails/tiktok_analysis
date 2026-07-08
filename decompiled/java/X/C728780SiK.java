package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guidecard.repo.StoryGuideCardRepo", f = "StoryGuideCardRepo.kt", l = {172, 181}, m = "loadSkylightListData")
public final class C728780SiK extends AbstractC23140094w {
    public Aweme LL;
    public Object LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C728750SiH LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C728780SiK(C728750SiH c728750SiH, InterfaceC1364105Vn<? super C728780SiK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c728750SiH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryGuideCardRepo@4828.loadSkylightListData$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, false, null, null, this);
        C1C7U.LIZIZ("StoryGuideCardRepo@4828.loadSkylightListData$1");
        return objLJ;
    }
}
