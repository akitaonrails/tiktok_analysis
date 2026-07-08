package X;

import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM$loadCollectionListData$1", f = "StoryHighlightsImmersiveSheetVM.kt", l = {137, 145}, m = "invokeSuspend")
public final class C1410205fY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsImmersiveSheetVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410205fY(StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM, String str, InterfaceC1364105Vn<? super C1410205fY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsImmersiveSheetVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410205fY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsImmersiveSheetVM@f60f.loadCollectionListData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.loadCollectionListData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1410105fX c1410105fX = new C1410105fX(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1410105fX);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.loadCollectionListData$1");
                return objLJFF;
            }
        }
        StoryHighlightListForAwemeResponse storyHighlightListForAwemeResponse = (StoryHighlightListForAwemeResponse) obj;
        if (storyHighlightListForAwemeResponse != null && !storyHighlightListForAwemeResponse.isEmpty()) {
            this.LLILLJJLI.LLILLJJLI.setValue(storyHighlightListForAwemeResponse);
        } else {
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILZLL;
            Unit unit2 = Unit.LIZ;
            this.LL = 2;
            if (c2252331DDr.emit(unit2, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.loadCollectionListData$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.loadCollectionListData$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
