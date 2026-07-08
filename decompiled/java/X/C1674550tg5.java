package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAvailableAwemesResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM$loadAwemePreviewList$response$1", f = "StoryHighlightsCreationVM.kt", l = {140}, m = "invokeSuspend")
public final class C1674550tg5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightAvailableAwemesResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674550tg5(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1364105Vn<? super C1674550tg5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = storyHighlightsCreationVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1674550tg5 c1674550tg5 = new C1674550tg5(this.LLILLL, interfaceC1364105Vn);
        c1674550tg5.LLILLJJLI = obj;
        return c1674550tg5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.loadAwemePreviewList$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                StoryHighlightsCreationVM storyHighlightsCreationVM = this.LLILLL;
                StoryApi storyApi = StoryApi.LIZIZ;
                Long l = ((C1674360tfm) storyHighlightsCreationVM.LL.getValue()).LJ;
                StoryHighlightCollection storyHighlightCollection = storyHighlightsCreationVM.LLJ;
                if (storyHighlightCollection != null) {
                    str = storyHighlightCollection.collectionId;
                } else {
                    str = null;
                }
                this.LL = 1;
                obj = storyApi.highlightAvailableAwemes(l, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.loadAwemePreviewList$response$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StoryHighlightAvailableAwemesResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.loadAwemePreviewList$response$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightAvailableAwemesResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
