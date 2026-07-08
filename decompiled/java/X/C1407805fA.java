package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM$onRemoveFromCollection$1", f = "StoryHighlightsImmersiveSheetVM.kt", l = {243}, m = "invokeSuspend")
public final class C1407805fA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsImmersiveSheetVM LLILLJJLI;
    public final /* synthetic */ StoryHighlightCollection LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407805fA(StoryHighlightCollection storyHighlightCollection, StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsImmersiveSheetVM;
        this.LLILLL = storyHighlightCollection;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407805fA(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsImmersiveSheetVM@f60f.onRemoveFromCollection$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C1407705f9 c1407705f9 = new C1407705f9(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1407705f9);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onRemoveFromCollection$1");
                return objLJFF;
            }
        }
        if (obj != null) {
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM = this.LLILLJJLI;
            storyHighlightsImmersiveSheetVM.wQ2(this.LLILLL.collectionId, storyHighlightsImmersiveSheetVM.LLJJJJ, "delete");
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM2 = this.LLILLJJLI;
            String str = this.LLILLL.title;
            if (str == null) {
                str = "";
            }
            storyHighlightsImmersiveSheetVM2.LLJILLL.setValue(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onRemoveFromCollection$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
