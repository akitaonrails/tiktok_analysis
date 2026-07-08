package X;

import Y.AComparatorS33S0000000_14;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.HighlightStoryComponent;
import com.ss.android.ugc.aweme.story.highlights.dm.HighlightBatchAwemeDetailResponse;
import com.ss.android.ugc.aweme.story.highlights.dm.HighlightCollectionQuery;
import com.ss.android.ugc.aweme.story.highlights.dm.HighlightCollectionQueryRequest;
import com.ss.android.ugc.aweme.story.highlights.dm.HighlightCollectionQueryResult;
import com.ss.android.ugc.aweme.story.highlights.dm.HighlightFetchManager;
import com.ss.android.ugc.aweme.story.highlights.dm.IHighlightsImApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Zqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.dm.HighlightFetchManager$preloadDMHighlightAwemes$1", f = "HighlightFetchManager.kt", l = {91}, m = "invokeSuspend")
public final class C912450Zqt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C869590Y9l> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912450Zqt(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912450Zqt(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C869590Y9l> listLJLIL;
        AwemeCardTemplate awemeCardTemplate;
        String str;
        List<HighlightCollectionQueryResult> highlightCollectionResults;
        String str2;
        C1C7U.LIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
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
            int iIntValue = ((Number) C036V.LIZ.getValue()).intValue();
            if (iIntValue <= 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
                return unit;
            }
            InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
            List listLJJII = C09RB.LJJII(new C1133920fc6(C09RB.LJIIIZ(new C1939607ik(this.LLILLJJLI), AFwS248S0000000_14.get$arr$(329)), new AComparatorS33S0000000_14(4)));
            if (listLJJII.isEmpty()) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
                return unit2;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listLJJII) {
                if (interfaceC874680YTaLIZ.LJIILLIIL((C869590Y9l) obj2, true)) {
                    arrayList.add(obj2);
                } else {
                    arrayList2.add(obj2);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.getFirst();
            Iterable iterable = (Iterable) pair.getSecond();
            if (list.size() >= iIntValue) {
                listLJLIL = C13LP.LL(list, iIntValue);
            } else {
                listLJLIL = C13LP.LJLIL(C13LP.LL(iterable, iIntValue - list.size()), list);
            }
            ArrayList arrayList3 = new ArrayList();
            for (C869590Y9l c869590Y9l : listLJLIL) {
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, AwemeCardTemplate.class);
                String strLIZ = null;
                if ((baseTemplateLIZ instanceof AwemeCardTemplate) && (awemeCardTemplate = (AwemeCardTemplate) baseTemplateLIZ) != null) {
                    HighlightStoryComponent highlightStoryComponent = awemeCardTemplate.highlightStoryComponent;
                    if (highlightStoryComponent != null) {
                        str = highlightStoryComponent.highlightStoryCollectionId;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(c869590Y9l.getScene(), "share_highlight_story")) {
                        strLIZ = C0ZDX.LIZ(c869590Y9l);
                    }
                    arrayList3.add(new HighlightCollectionQuery(str, strLIZ));
                }
            }
            if (arrayList3.isEmpty()) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
                return unit3;
            }
            IHighlightsImApi.LIZ.getClass();
            IHighlightsImApi value = C912460Zqu.LIZIZ.getValue();
            if (value != null) {
                HighlightCollectionQueryRequest highlightCollectionQueryRequest = new HighlightCollectionQueryRequest(arrayList3, C2286608xc.LJ(C05BN.DM_CARD.getValue()));
                this.LL = 1;
                obj = value.batchAwemeDetail(highlightCollectionQueryRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
                    return objLJFF;
                }
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
            return unit4;
        }
        HighlightBatchAwemeDetailResponse highlightBatchAwemeDetailResponse = (HighlightBatchAwemeDetailResponse) obj;
        if (highlightBatchAwemeDetailResponse != null && (highlightCollectionResults = highlightBatchAwemeDetailResponse.getHighlightCollectionResults()) != null) {
            if (HighlightFetchManager.LIZLLL.get() != this.LLILLL) {
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
                return unit5;
            }
            for (HighlightCollectionQueryResult highlightCollectionQueryResult : highlightCollectionResults) {
                Aweme aweme = highlightCollectionQueryResult.aweme;
                if (aweme != null && (str2 = highlightCollectionQueryResult.collectionId) != null) {
                    HighlightFetchManager.LIZIZ.LIZJ(aweme, str2, highlightCollectionQueryResult.awemeId);
                }
            }
            Unit unit6 = Unit.LIZ;
            C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
            return unit6;
        }
        Unit unit42 = Unit.LIZ;
        C1C7U.LIZIZ("HighlightFetchManager@51f5.preloadDMHighlightAwemes$1");
        return unit42;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
