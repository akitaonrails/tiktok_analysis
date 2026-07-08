package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl$showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$1$1$1", f = "StoryHighlightsImmersiveActionServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1408305fF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryHighlightDeleteResponse LL;
    public final /* synthetic */ StoryHighlightsImmersiveActionServiceImpl LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408305fF(StoryHighlightDeleteResponse storyHighlightDeleteResponse, StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, Fragment fragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C1408305fF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyHighlightDeleteResponse;
        this.LLILLJJLI = storyHighlightsImmersiveActionServiceImpl;
        this.LLILLL = fragment;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408305fF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsImmersiveActionServiceImpl@27f9.showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryHighlightDeleteResponse storyHighlightDeleteResponse = this.LL;
        String str = null;
        if (storyHighlightDeleteResponse != null) {
            StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = this.LLILLJJLI;
            StoryHighlightCollection deletedCollectionDetail = storyHighlightDeleteResponse.getDeletedCollectionDetail();
            if (deletedCollectionDetail != null) {
                str = deletedCollectionDetail.collectionId;
            }
            storyHighlightsImmersiveActionServiceImpl.getClass();
            C06US.LIZ.getClass();
            C06US.LIZLLL("delete_all_highlight", str, "success");
            Fragment fragment = this.LLILLL;
            if (fragment != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LJIIIZ(2131848991);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJJI();
            }
            this.LLILZ.invoke();
        } else {
            StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl2 = this.LLILLJJLI;
            Fragment fragment2 = this.LLILLL;
            storyHighlightsImmersiveActionServiceImpl2.getClass();
            StoryHighlightsImmersiveActionServiceImpl.LIZIZ(fragment2);
            this.LLILLJJLI.getClass();
            C06US.LIZ.getClass();
            C06US.LIZLLL("delete_all_highlight", null, "fail");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsImmersiveActionServiceImpl@27f9.showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
