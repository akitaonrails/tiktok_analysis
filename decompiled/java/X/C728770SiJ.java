package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guidecard.repo.StoryGuideCardRepo", f = "StoryGuideCardRepo.kt", l = {287}, m = "requestSkylightData")
public final class C728770SiJ extends AbstractC23140094w {
    public Aweme LL;
    public Object LLILLJJLI;
    public Function2 LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C728750SiH LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C728770SiJ(C728750SiH c728750SiH, InterfaceC1364105Vn<? super C728770SiJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c728750SiH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryGuideCardRepo@4828.requestSkylightData$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZLL.LJII(null, null, false, null, null, null, null, this);
        C1C7U.LIZIZ("StoryGuideCardRepo@4828.requestSkylightData$1");
        return objLJII;
    }
}
