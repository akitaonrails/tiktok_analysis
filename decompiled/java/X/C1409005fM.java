package X;

import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM$onMenuDeleteHighlightClick$1$2", f = "StoryHighlightsMyProfileVM.kt", l = {61}, m = "invokeSuspend")
public final class C1409005fM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsMyProfileVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409005fM(StoryHighlightsMyProfileVM storyHighlightsMyProfileVM, InterfaceC1364105Vn<? super C1409005fM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsMyProfileVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409005fM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyProfileVM@d17b.onMenuDeleteHighlightClick$1$2");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LL;
            Unit unit = Unit.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(unit, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.onMenuDeleteHighlightClick$1$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.onMenuDeleteHighlightClick$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
