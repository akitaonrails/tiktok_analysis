package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryHighlightsAnchorComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05S2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryHighlightsAnchorComponent$initObserver$1$1", f = "StoryHighlightsAnchorComponent.kt", l = {}, m = "invokeSuspend")
public final class C05S2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryHighlightsAnchorComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05S2(StoryHighlightsAnchorComponent storyHighlightsAnchorComponent, InterfaceC1364105Vn<? super C05S2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsAnchorComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05S2 c05s2 = new C05S2(this.LLILLJJLI, interfaceC1364105Vn);
        c05s2.LL = obj;
        return c05s2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsAnchorComponent@9c2e.initObserver$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, null, new C05S3(this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsAnchorComponent@9c2e.initObserver$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
