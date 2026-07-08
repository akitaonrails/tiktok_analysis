package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl$showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$2$1$1", f = "StoryHighlightsImmersiveActionServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1408005fC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryHighlightCreateOrUpdateResponse LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Fragment LLILZ;
    public final /* synthetic */ StoryHighlightsImmersiveActionServiceImpl LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1408005fC(StoryHighlightCreateOrUpdateResponse storyHighlightCreateOrUpdateResponse, Function1<? super String, Unit> function1, Aweme aweme, Fragment fragment, StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, String str, InterfaceC1364105Vn<? super C1408005fC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyHighlightCreateOrUpdateResponse;
        this.LLILLJJLI = function1;
        this.LLILLL = aweme;
        this.LLILZ = fragment;
        this.LLILZIL = storyHighlightsImmersiveActionServiceImpl;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408005fC(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("StoryHighlightsImmersiveActionServiceImpl@27f9.showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            Function1<String, Unit> function1 = this.LLILLJJLI;
            Aweme aweme = this.LLILLL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            function1.invoke(aid);
            Fragment fragment = this.LLILZ;
            if (fragment != null) {
                String str = this.LLILZLL;
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LJIIJ(C786410Ut5.j4(C1383370m6R.LJIIJ(2131848963), Arrays.copyOf(new Object[]{str}, 1)));
                c1389890mGx.LJIIJJI();
            }
        } else {
            StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = this.LLILZIL;
            Fragment fragment2 = this.LLILZ;
            storyHighlightsImmersiveActionServiceImpl.getClass();
            StoryHighlightsImmersiveActionServiceImpl.LIZIZ(fragment2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsImmersiveActionServiceImpl@27f9.showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$2$1$1");
        return unit;
    }
}
