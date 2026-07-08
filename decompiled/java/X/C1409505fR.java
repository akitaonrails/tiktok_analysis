package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM$onCreateButtonClick$1$response$1", f = "StoryHighlightsImmersiveSheetVM.kt", l = {162}, m = "invokeSuspend")
public final class C1409505fR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse>, Object> {
    public int LL;
    public final /* synthetic */ IStoryHighlightsMyDataManager LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ StoryHighlightsImmersiveSheetVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409505fR(IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager, Context context, StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM, InterfaceC1364105Vn<? super C1409505fR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iStoryHighlightsMyDataManager;
        this.LLILLL = context;
        this.LLILZ = storyHighlightsImmersiveSheetVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409505fR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsImmersiveSheetVM@f60f.onCreateButtonClick$1$response$1");
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
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = this.LLILLJJLI;
            Context context = this.LLILLL;
            String str = (String) this.LLILZ.LL.getValue();
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM = this.LLILZ;
            String str2 = storyHighlightsImmersiveSheetVM.LLJJJIL;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = storyHighlightsImmersiveSheetVM.LLJJJJ;
            if (str4 != null) {
                str3 = str4;
            }
            this.LL = 1;
            obj = iStoryHighlightsMyDataManager.LJJII(context, str, str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onCreateButtonClick$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onCreateButtonClick$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
