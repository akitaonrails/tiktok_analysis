package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM$updateCollection$response$1", f = "StoryHighlightsCreationVM.kt", l = {370}, m = "invokeSuspend")
public final class C1674500tg0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ StoryHighlightCollection LLILLL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674500tg0(Context context, StoryHighlightCollection storyHighlightCollection, StoryHighlightsCreationVM storyHighlightsCreationVM, boolean z, String str, InterfaceC1364105Vn<? super C1674500tg0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = storyHighlightCollection;
        this.LLILZ = storyHighlightsCreationVM;
        this.LLILZIL = z;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1674500tg0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ArrayList arrayList;
        Object objLJIJ = obj;
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.updateCollection$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            String str2 = null;
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
            objLJIJ = null;
            StoryHighlightCollection.CoverType coverType = null;
            if (iStoryHighlightsMyDataManager != null) {
                Context context = this.LLILLJJLI;
                StoryHighlightCollection storyHighlightCollection = this.LLILLL;
                String str3 = ((C1674510tg1) this.LLILZ.LLILLL.getValue()).LIZJ;
                if (!this.LLILZIL) {
                    str = null;
                } else {
                    str = this.LLILZLL;
                    StoryHighlightAwemePreview storyHighlightAwemePreview = ((C1674510tg1) this.LLILZ.LLILLL.getValue()).LIZLLL;
                    if (storyHighlightAwemePreview != null) {
                        str2 = storyHighlightAwemePreview.awemeId;
                    }
                }
                if (this.LLILZIL) {
                    coverType = ((C1674510tg1) this.LLILZ.LLILLL.getValue()).LJ;
                }
                if (this.LLILZ.zQ2()) {
                    List<StoryHighlightAwemePreview> list = ((C1674360tfm) this.LLILZ.LL.getValue()).LIZIZ;
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<StoryHighlightAwemePreview> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().awemeId);
                    }
                } else {
                    List<StoryHighlightAwemePreview> list2 = ((C1674510tg1) this.LLILZ.LLILLL.getValue()).LIZIZ;
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<StoryHighlightAwemePreview> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().awemeId);
                    }
                }
                String str4 = this.LLILZ.LLJIJIL;
                this.LL = 1;
                objLJIJ = iStoryHighlightsMyDataManager.LJIJ(context, storyHighlightCollection, str3, str, str2, coverType, arrayList, str4, this);
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.updateCollection$response$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.updateCollection$response$1");
        return objLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
