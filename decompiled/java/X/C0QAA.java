package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS8S0410000_10;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0QAA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM$onLoadMoreResult$1$1$1", f = "SearchVisualInspirationSharedVM.kt", l = {}, m = "invokeSuspend")
public final class C0QAA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0QA6>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<ImageData> LLILLJJLI;
    public final /* synthetic */ SearchVisualInspirationSharedVM LLILLL;
    public final /* synthetic */ ImageLoadMoreData LLILZ;
    public final /* synthetic */ SearchLoadMoreV2Response LLILZIL;
    public final /* synthetic */ C0QA9 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QAA(List<ImageData> list, SearchVisualInspirationSharedVM searchVisualInspirationSharedVM, ImageLoadMoreData imageLoadMoreData, SearchLoadMoreV2Response searchLoadMoreV2Response, C0QA9 c0qa9, InterfaceC1364105Vn<? super C0QAA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = searchVisualInspirationSharedVM;
        this.LLILZ = imageLoadMoreData;
        this.LLILZIL = searchLoadMoreV2Response;
        this.LLILZLL = c0qa9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0QAA c0qaa = new C0QAA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0qaa.LL = obj;
        return c0qaa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Aweme aweme;
        InsiteImageData insiteImageDataCopy;
        C1C7U.LIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMoreResult$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI != null && (!r0.isEmpty())) {
            SearchVisualInspirationSharedVM searchVisualInspirationSharedVM = this.LLILLL;
            ImageLoadMoreData imageLoadMoreData = this.LLILZ;
            List<ImageData> list = this.LLILLJJLI;
            SearchLoadMoreV2Response searchLoadMoreV2Response = this.LLILZIL;
            C0QA9 c0qa9 = this.LLILZLL;
            List<Aweme> list2 = imageLoadMoreData.awemeList;
            searchVisualInspirationSharedVM.getClass();
            if (list2 != null) {
                for (Aweme aweme2 : list2) {
                    IAwemeService value = SearchVisualInspirationSharedVM.LLIZLLLIL.getValue();
                    if (value != null) {
                        value.LLILLL(aweme2);
                    }
                    Map<String, String> map = ((C0QA9) searchVisualInspirationSharedVM.getState()).LLJ;
                    String str2 = map.get("token_type");
                    if (str2 != null) {
                        AwemeExtKt.appendExtraParamUseInSearch(aweme2, "token_type", str2);
                    }
                    String str3 = map.get("inside_page_name");
                    if (str3 != null) {
                        AwemeExtKt.appendExtraParamUseInSearch(aweme2, "inside_page_name", str3);
                    }
                }
            }
            boolean zLJFF = Intrinsics.LJFF(imageLoadMoreData.hasMore, true);
            LinkedHashMap linkedHashMap = new LinkedHashMap(((C0QA9) searchVisualInspirationSharedVM.getState()).LLILZIL);
            List<Aweme> list3 = imageLoadMoreData.awemeList;
            if (list3 != null) {
                for (Aweme aweme3 : list3) {
                    linkedHashMap.put(aweme3.getAid(), aweme3);
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (ImageData imageData : list) {
                InsiteImageData insiteImageData = imageData.insiteImage;
                if (insiteImageData != null && (str = insiteImageData.aid) != null && (aweme = (Aweme) linkedHashMap.get(str)) != null) {
                    InsiteImageData insiteImageData2 = imageData.insiteImage;
                    if (insiteImageData2 != null) {
                        insiteImageDataCopy = insiteImageData2.copy(insiteImageData2.insiteType, aweme, insiteImageData2.searchAwemeInfo, insiteImageData2.url, insiteImageData2.cutTime, insiteImageData2.index, insiteImageData2.width, insiteImageData2.height, insiteImageData2.aid, insiteImageData2.imageId);
                    } else {
                        insiteImageDataCopy = null;
                    }
                    ImageData imageDataCopy = imageData.copy(imageData.type, imageData.originalUrl, imageData.offsiteImage, insiteImageDataCopy, imageData.brandImage, imageData.aigcImage);
                    if (imageDataCopy != null) {
                        imageData = imageDataCopy;
                    }
                }
                arrayList.add(imageData);
            }
            searchLoadMoreV2Response.data.imageLoadMoreData.setImageDataList(arrayList);
            if (c0qa9.LLILLJJLI) {
                searchVisualInspirationSharedVM.vmDispatcher.getState();
                searchVisualInspirationSharedVM.setStateImmediate(new AwS8S0410000_10(imageLoadMoreData, searchLoadMoreV2Response, arrayList, linkedHashMap, zLJFF, 0));
                Iterator it2 = ((ArrayList) searchVisualInspirationSharedVM.LLILZIL).iterator();
                while (it2.hasNext()) {
                    ((C0QAF) it2.next()).LLLLLJIL(imageLoadMoreData.total, arrayList, zLJFF);
                }
            } else {
                int size = c0qa9.LLILLL.size();
                searchVisualInspirationSharedVM.vmDispatcher.getState();
                searchVisualInspirationSharedVM.setStateImmediate(new AwS8S0410000_10(imageLoadMoreData, searchLoadMoreV2Response, arrayList, linkedHashMap, zLJFF, 1));
                Iterator it3 = ((ArrayList) searchVisualInspirationSharedVM.LLILZIL).iterator();
                while (it3.hasNext()) {
                    ((C0QAF) it3.next()).LIZ(arrayList, zLJFF, imageLoadMoreData.total, size);
                }
            }
            searchVisualInspirationSharedVM.LLIZ = false;
            C0QA6 c0qa6 = new C0QA6(searchLoadMoreV2Response, null);
            C1C7U.LIZIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMoreResult$1$1$1");
            return c0qa6;
        }
        Boolean bool = null;
        SearchVisualInspirationSharedVM searchVisualInspirationSharedVM2 = this.LLILLL;
        SearchLoadMoreV2Response searchLoadMoreV2Response2 = this.LLILZIL;
        searchVisualInspirationSharedVM2.vmDispatcher.getState();
        searchVisualInspirationSharedVM2.setStateImmediate(new AwS589S0100000_10(searchLoadMoreV2Response2, 330));
        Exception exc = new Exception("imageDataList empty/null");
        if (searchLoadMoreV2Response2 != null) {
            bool = searchLoadMoreV2Response2.hasMore;
        }
        Iterator it4 = ((ArrayList) searchVisualInspirationSharedVM2.LLILZIL).iterator();
        while (it4.hasNext()) {
            ((C0QAF) it4.next()).LIZIZ(exc, bool);
        }
        searchVisualInspirationSharedVM2.LLIZ = false;
        C0QA6 c0qa62 = new C0QA6(searchLoadMoreV2Response2, exc);
        C1C7U.LIZIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMoreResult$1$1$1");
        return c0qa62;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0QA6> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
