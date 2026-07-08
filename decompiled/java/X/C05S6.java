package X;

import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05S6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM$refreshStoryComponents$1", f = "StoryHighlightsImmersiveSheetVM.kt", l = {317}, m = "invokeSuspend")
public final class C05S6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsImmersiveSheetVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05S6(StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM, InterfaceC1364105Vn<? super C05S6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsImmersiveSheetVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05S6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsImmersiveSheetVM@f60f.refreshStoryComponents$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLJJI;
            Unit unit = Unit.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(unit, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.refreshStoryComponents$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.refreshStoryComponents$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
