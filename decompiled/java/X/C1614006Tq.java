package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent$initObserver$1$1$2", f = "StoryHighlightsComponent.kt", l = {177}, m = "invokeSuspend")
public final class C1614006Tq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614006Tq(StoryHighlightsComponent storyHighlightsComponent, InterfaceC1364105Vn<? super C1614006Tq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1614006Tq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951;
        C1C7U.LIZ("StoryHighlightsComponent@b00f.initObserver$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMFp = this.LLILLJJLI.Fp();
            if (storyHighlightsImmersiveSheetVMFp != null && (anonymousClass0951 = storyHighlightsImmersiveSheetVMFp.LLJJ) != null) {
                AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 1);
                this.LL = 1;
                if (anonymousClass0951.collect(agS283S0100000_2, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryHighlightsComponent@b00f.initObserver$1$1$2");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StoryHighlightsComponent@b00f.initObserver$1$1$2");
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
