package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.immersive.component.post.HighlightStoryTagComponent;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.post.HighlightStoryTagComponent$jumpToHighlightsFeed$1$requestDeferred$1", f = "HighlightStoryTagComponent.kt", l = {111}, m = "invokeSuspend")
public final class C1613006Tg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightsAwemeDetailResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ HighlightStoryTagComponent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613006Tg(String str, HighlightStoryTagComponent highlightStoryTagComponent, InterfaceC1364105Vn<? super C1613006Tg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = highlightStoryTagComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1613006Tg c1613006Tg = new C1613006Tg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1613006Tg.LLILLJJLI = obj;
        return c1613006Tg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1$requestDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                HighlightStoryTagComponent highlightStoryTagComponent = this.LLILZ;
                StoryApi storyApi = StoryApi.LIZIZ;
                String aid = ((VideoItemParams) C631370Opb.LIZ(highlightStoryTagComponent)).getAweme().getAid();
                Integer numLJ = C2286608xc.LJ(C05BL.SKYLIGHT_TAG.getValue());
                this.LL = 1;
                obj = storyApi.highlightAwemeDetail(str, aid, numLJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1$requestDeferred$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StoryHighlightsAwemeDetailResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1$requestDeferred$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightsAwemeDetailResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
