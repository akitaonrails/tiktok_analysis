package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05N7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM$tryRequestCache$2$1", f = "StoryHighlightsOtherProfileVM.kt", l = {}, m = "invokeSuspend")
public final class C05N7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryHighlightsOtherProfileVM LL;
    public final /* synthetic */ StoryHighlightsCollectionCacheResponse LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05N7(StoryHighlightsOtherProfileVM storyHighlightsOtherProfileVM, StoryHighlightsCollectionCacheResponse storyHighlightsCollectionCacheResponse, List<String> list, InterfaceC1364105Vn<? super C05N7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyHighlightsOtherProfileVM;
        this.LLILLJJLI = storyHighlightsCollectionCacheResponse;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05N7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<Aweme> awemes;
        C1C7U.LIZ("StoryHighlightsOtherProfileVM@6f17.tryRequestCache$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS368S0200000_2((List) this.LLILLL, (List<String>) this.LLILLJJLI, (StoryHighlightsCollectionCacheResponse) 107));
        if (((Boolean) C05N9.LIZ.getValue()).booleanValue()) {
            C316620Cb6 c316620Cb6 = C316620Cb6.LIZ;
            StoryHighlightsCollectionCacheResponse storyHighlightsCollectionCacheResponse = this.LLILLJJLI;
            if (storyHighlightsCollectionCacheResponse != null) {
                awemes = storyHighlightsCollectionCacheResponse.getAwemes();
            } else {
                awemes = null;
            }
            c316620Cb6.getClass();
            C316620Cb6.LIZ(awemes);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsOtherProfileVM@6f17.tryRequestCache$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
