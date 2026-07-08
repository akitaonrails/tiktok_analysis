package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryHighlightsAnchorComponent;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05S3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryHighlightsAnchorComponent$initObserver$1$1$1", f = "StoryHighlightsAnchorComponent.kt", l = {194}, m = "invokeSuspend")
public final class C05S3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsAnchorComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05S3(StoryHighlightsAnchorComponent storyHighlightsAnchorComponent, InterfaceC1364105Vn<? super C05S3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsAnchorComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05S3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0950 anonymousClass0950;
        C1C7U.LIZ("StoryHighlightsAnchorComponent@9c2e.initObserver$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM = (StoryHighlightsImmersiveSheetVM) this.LLILLJJLI.LLJLLL.getValue();
            if (storyHighlightsImmersiveSheetVM != null && (anonymousClass0950 = storyHighlightsImmersiveSheetVM.LLJJIII) != null) {
                AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 90);
                this.LL = 1;
                if (anonymousClass0950.collect(agS283S0100000_2, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryHighlightsAnchorComponent@9c2e.initObserver$1$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StoryHighlightsAnchorComponent@9c2e.initObserver$1$1$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
