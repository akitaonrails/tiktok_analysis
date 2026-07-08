package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM$onMenuDeleteHighlightClick$1", f = "StoryHighlightsMyProfileVM.kt", l = {44}, m = "invokeSuspend")
public final class C1408805fK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsMyProfileVM LLILLJJLI;
    public final /* synthetic */ StoryHighlightCollection LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408805fK(StoryHighlightsMyProfileVM storyHighlightsMyProfileVM, StoryHighlightCollection storyHighlightCollection, InterfaceC1364105Vn<? super C1408805fK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsMyProfileVM;
        this.LLILLL = storyHighlightCollection;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408805fK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("StoryHighlightsMyProfileVM@d17b.onMenuDeleteHighlightClick$1");
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
            C1408705fJ c1408705fJ = new C1408705fJ(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1408705fJ);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.onMenuDeleteHighlightClick$1");
                return objLJFF;
            }
        }
        StoryHighlightDeleteResponse storyHighlightDeleteResponse = (StoryHighlightDeleteResponse) obj;
        if (storyHighlightDeleteResponse == null) {
            this.LLILLJJLI.getClass();
            C06US.LIZ.getClass();
            C06US.LIZLLL("click_delete_btn", null, "fail");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LLILLJJLI), null, null, new C1408905fL(this.LLILLJJLI, null), 3);
        } else {
            StoryHighlightsMyProfileVM storyHighlightsMyProfileVM = this.LLILLJJLI;
            StoryHighlightCollection deletedCollectionDetail = storyHighlightDeleteResponse.getDeletedCollectionDetail();
            if (deletedCollectionDetail != null) {
                str = deletedCollectionDetail.collectionId;
            } else {
                str = null;
            }
            storyHighlightsMyProfileVM.getClass();
            C06US.LIZ.getClass();
            C06US.LIZLLL("click_delete_btn", str, "success");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LLILLJJLI), null, null, new C1409005fM(this.LLILLJJLI, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.onMenuDeleteHighlightClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
