package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent$initObserver$1$1$6", f = "StoryHighlightsComponent.kt", l = {237}, m = "invokeSuspend")
public final class C1614206Ts extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614206Ts(StoryHighlightsComponent storyHighlightsComponent, InterfaceC1364105Vn<? super C1614206Ts> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1614206Ts(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<C1614506Tv> interfaceC346201Wa;
        C1C7U.LIZ("StoryHighlightsComponent@b00f.initObserver$1$1$6");
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
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMFp = this.LLILLJJLI.Fp();
            if (storyHighlightsImmersiveSheetVMFp != null && (interfaceC346201Wa = storyHighlightsImmersiveSheetVMFp.LLJJIJIIJIL) != null) {
                AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 5);
                this.LL = 1;
                if (interfaceC346201Wa.collect(agS283S0100000_2, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryHighlightsComponent@b00f.initObserver$1$1$6");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsComponent@b00f.initObserver$1$1$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
