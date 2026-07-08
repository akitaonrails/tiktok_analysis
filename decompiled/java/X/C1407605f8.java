package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05f8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM$onAddToCollection$2", f = "StoryHighlightsImmersiveSheetVM.kt", l = {220}, m = "invokeSuspend")
public final class C1407605f8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsImmersiveSheetVM LLILLJJLI;
    public final /* synthetic */ StoryHighlightCollection LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407605f8(StoryHighlightCollection storyHighlightCollection, StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsImmersiveSheetVM;
        this.LLILLL = storyHighlightCollection;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407605f8(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<String> urlList;
        C1C7U.LIZ("StoryHighlightsImmersiveSheetVM@f60f.onAddToCollection$2");
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
            C1407505f7 c1407505f7 = new C1407505f7(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1407505f7);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onAddToCollection$2");
                return objLJFF;
            }
        }
        StoryHighlightCreateOrUpdateResponse storyHighlightCreateOrUpdateResponse = (StoryHighlightCreateOrUpdateResponse) obj;
        if (storyHighlightCreateOrUpdateResponse != null) {
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM = this.LLILLJJLI;
            storyHighlightsImmersiveSheetVM.wQ2(this.LLILLL.collectionId, storyHighlightsImmersiveSheetVM.LLJJJJ, "add");
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM2 = this.LLILLJJLI;
            StoryHighlightCollection storyHighlightCollection = this.LLILLL;
            String str = storyHighlightCollection.title;
            if (str == null) {
                str = "";
            }
            UrlModel urlModel = storyHighlightCollection.collectionCoverUrl;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null) {
                urlList = C13BV.INSTANCE;
            }
            storyHighlightsImmersiveSheetVM2.LLIZLLLIL.setValue(new C1614506Tv(storyHighlightCreateOrUpdateResponse.getCollectionContainerAweme(), str, this.LLILLL.collectionId, urlList));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onAddToCollection$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
