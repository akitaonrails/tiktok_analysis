package X;

import Y.ARunnableS106S0100000_6;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsOverlayComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsOverlayComponent$showFadeAnim$1", f = "StoryHighlightsOverlayComponent.kt", l = {94}, m = "invokeSuspend")
public final class C434650H2p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsOverlayComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434650H2p(StoryHighlightsOverlayComponent storyHighlightsOverlayComponent, InterfaceC1364105Vn<? super C434650H2p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsOverlayComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434650H2p(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsOverlayComponent@24a6.showFadeAnim$1");
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
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsOverlayComponent@24a6.showFadeAnim$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getContentView().animate().cancel();
        this.LLILLJJLI.getContentView().animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS106S0100000_6(this.LLILLJJLI, 116)).start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsOverlayComponent@24a6.showFadeAnim$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
