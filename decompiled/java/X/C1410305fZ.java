package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05fZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM$onCreateButtonClick$1", f = "StoryHighlightsImmersiveSheetVM.kt", l = {161}, m = "invokeSuspend")
public final class C1410305fZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsImmersiveSheetVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ IStoryHighlightsMyDataManager LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410305fZ(StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM, String str, IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager, Context context, InterfaceC1364105Vn<? super C1410305fZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsImmersiveSheetVM;
        this.LLILLL = str;
        this.LLILZ = iStoryHighlightsMyDataManager;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410305fZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        StoryHighlightCollection collectionDetail;
        C1C7U.LIZ("StoryHighlightsImmersiveSheetVM@f60f.onCreateButtonClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str4 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LLILZ.setValue(EnumC1410705fd.LOADING);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1409505fR c1409505fR = new C1409505fR(this.LLILZ, this.LLILZIL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1409505fR);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onCreateButtonClick$1");
                return objLJFF;
            }
        }
        StoryHighlightCreateOrUpdateResponse storyHighlightCreateOrUpdateResponse = (StoryHighlightCreateOrUpdateResponse) obj;
        StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM = this.LLILLJJLI;
        if (storyHighlightsImmersiveSheetVM.LLJLILLLLZIIL) {
            str = "video_addto_panel_entrance";
        } else {
            str = "video_addto_btn";
        }
        if (storyHighlightCreateOrUpdateResponse == null) {
            storyHighlightsImmersiveSheetVM.LLILZ.setValue(EnumC1410705fd.ERROR);
            this.LLILLJJLI.LL.setValue(this.LLILLL);
            C06US c06us = C06US.LIZ;
            String str5 = this.LLILLJJLI.LLJJJJJIL;
            c06us.getClass();
            C06US.LIZJ(str5, null, str, false);
        } else {
            StoryHighlightCollection collectionDetail2 = storyHighlightCreateOrUpdateResponse.getCollectionDetail();
            if (collectionDetail2 == null || (str2 = collectionDetail2.collectionId) == null) {
                str2 = "";
            }
            storyHighlightsImmersiveSheetVM.LLJJL = str2;
            C2252321DDq c2252321DDq = this.LLILLJJLI.LL;
            StoryHighlightCollection collectionDetail3 = storyHighlightCreateOrUpdateResponse.getCollectionDetail();
            if (collectionDetail3 == null || (str3 = collectionDetail3.title) == null) {
                str3 = this.LLILLL;
            }
            c2252321DDq.setValue(str3);
            this.LLILLJJLI.LLJJJJLIIL = storyHighlightCreateOrUpdateResponse.getCollectionContainerAweme();
            this.LLILLJJLI.LLILZ.setValue(EnumC1410705fd.SUCCESS);
            if (((Boolean) C1410505fb.LIZ.getValue()).booleanValue() && (collectionDetail = storyHighlightCreateOrUpdateResponse.getCollectionDetail()) != null && collectionDetail.collectionId.length() > 0) {
                StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM2 = this.LLILLJJLI;
                StoryHighlightListForAwemeResponse storyHighlightListForAwemeResponse = (StoryHighlightListForAwemeResponse) storyHighlightsImmersiveSheetVM2.LLILLJJLI.getValue();
                List<StoryHighlightCollection> collections = storyHighlightListForAwemeResponse.getCollections();
                ArrayList arrayList = new ArrayList();
                for (StoryHighlightCollection storyHighlightCollection : collections) {
                    if (!Intrinsics.LJFF(storyHighlightCollection.collectionId, collectionDetail.collectionId)) {
                        arrayList.add(storyHighlightCollection);
                    }
                }
                storyHighlightsImmersiveSheetVM2.LLILLJJLI.setValue(storyHighlightListForAwemeResponse.copy(C13LP.LJLIL(arrayList, Collections.singletonList(collectionDetail)), C13LP.LJJJJI(C13LP.LJLILLLLZI(collectionDetail.collectionId, storyHighlightListForAwemeResponse.getIncludedInCollectionIds()))));
            }
            C06US c06us2 = C06US.LIZ;
            String str6 = this.LLILLJJLI.LLJJJJJIL;
            StoryHighlightCollection collectionDetail4 = storyHighlightCreateOrUpdateResponse.getCollectionDetail();
            if (collectionDetail4 != null) {
                str4 = collectionDetail4.collectionId;
            }
            c06us2.getClass();
            C06US.LIZJ(str6, str4, str, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsImmersiveSheetVM@f60f.onCreateButtonClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
