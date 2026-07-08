package X;

import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.screen.HighlightsCreationScreenKt$CoverAndTitle$2$1", f = "HighlightsCreationScreen.kt", l = {}, m = "invokeSuspend")
public final class C1674420tfs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryHighlightsCreationVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674420tfs(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1364105Vn<? super C1674420tfs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyHighlightsCreationVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1674420tfs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsCreationScreenKt@fa16.CoverAndTitle$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLIZ.LIZJ(C1674730tgN.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightsCreationScreenKt@fa16.CoverAndTitle$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
