package X;

import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.post.HighlightStoryTagComponent$jumpToHighlightsFeed$1$showLoadingJob$1", f = "HighlightStoryTagComponent.kt", l = {121}, m = "invokeSuspend")
public final class C1613106Th extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<StoryHighlightsAwemeDetailResponse> LLILLJJLI;
    public final /* synthetic */ DialogInterfaceC21560019Ze LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613106Th(AnonymousClass0957<StoryHighlightsAwemeDetailResponse> anonymousClass0957, DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze, C013C c013c, InterfaceC1364105Vn<? super C1613106Th> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = dialogInterfaceC21560019Ze;
        this.LLILZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1613106Th(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1$showLoadingJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1$showLoadingJob$1");
                return objLJFF;
            }
        }
        if (!this.LLILLJJLI.isCompleted()) {
            C786410Ut5.D4(this.LLILLL);
            this.LLILZ.element = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1$showLoadingJob$1");
        return unit;
    }
}
