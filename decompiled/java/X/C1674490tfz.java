package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
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

/* JADX INFO: renamed from: X.0tfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM$createCollection$response$1", f = "StoryHighlightsCreationVM.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C1674490tfz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674490tfz(Context context, StoryHighlightsCreationVM storyHighlightsCreationVM, String str, InterfaceC1364105Vn<? super C1674490tfz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = storyHighlightsCreationVM;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1674490tfz(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        StoryHighlightCollection.CoverType coverType;
        Object objLJJIII = obj;
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.createCollection$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJJIII);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJIII);
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
            objLJJIII = null;
            String str = null;
            if (iStoryHighlightsMyDataManager != null) {
                Context context = this.LLILLJJLI;
                String str2 = ((C1674510tg1) this.LLILLL.LLILLL.getValue()).LIZJ;
                String str3 = this.LLILZ;
                StoryHighlightAwemePreview storyHighlightAwemePreview = ((C1674510tg1) this.LLILLL.LLILLL.getValue()).LIZLLL;
                if (storyHighlightAwemePreview != null) {
                    str = storyHighlightAwemePreview.awemeId;
                }
                if (((C1674510tg1) this.LLILLL.LLILLL.getValue()).LJII == null) {
                    coverType = StoryHighlightCollection.CoverType.STORY_COVER;
                } else if (((C1674510tg1) this.LLILLL.LLILLL.getValue()).LIZLLL == null) {
                    coverType = StoryHighlightCollection.CoverType.ALBUM_PHOTO;
                } else {
                    coverType = StoryHighlightCollection.CoverType.EDITED_STORY_COVER;
                }
                List<StoryHighlightAwemePreview> list = ((C1674510tg1) this.LLILLL.LLILLL.getValue()).LIZIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<StoryHighlightAwemePreview> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().awemeId);
                }
                this.LL = 1;
                objLJJIII = iStoryHighlightsMyDataManager.LJJIII(context, str2, str3, str, coverType, arrayList, this);
                if (objLJJIII == objLJFF) {
                    C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.createCollection$response$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.createCollection$response$1");
        return objLJJIII;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
