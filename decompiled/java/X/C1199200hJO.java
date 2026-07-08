package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiDataV2;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199200hJO extends C09AY implements Function1<C1182980gtE, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ PoiSearchApi.PoiSearchResultWrapperV2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199200hJO(long j, String str, String str2, PoiSearchApi.PoiSearchResultWrapperV2 poiSearchResultWrapperV2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = poiSearchResultWrapperV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1182980gtE c1182980gtE) {
        Integer numValueOf;
        String str;
        List<PoiDataV2> list;
        List<PoiDataV2> list2;
        C1182980gtE c1182980gtE2 = c1182980gtE;
        c1182980gtE2.LIZ = Long.valueOf(this.LL);
        c1182980gtE2.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE2.LJ = this.LLILLJJLI;
        c1182980gtE2.LIZLLL = this.LLILLL;
        c1182980gtE2.LIZJ = this.LLILZ;
        c1182980gtE2.LJFF = new Pair<>("", "request_send");
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV2 = this.LLILZ.poiSearchResult;
        String str2 = null;
        if (poiSearchResultV2 != null && (list2 = poiSearchResultV2.poiList) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        c1182980gtE2.LJIIL = numValueOf;
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV22 = this.LLILZ.poiSearchResult;
        if (poiSearchResultV22 != null && (list = poiSearchResultV22.poiList) != null && list.size() > 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c1182980gtE2.LJI = new Pair<>("isEmpty", str);
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV23 = this.LLILZ.poiSearchResult;
        if (poiSearchResultV23 != null) {
            str2 = poiSearchResultV23.debugInfo;
        }
        C1197910hHJ.LJ(c1182980gtE2, str2);
        return Unit.LIZ;
    }
}
