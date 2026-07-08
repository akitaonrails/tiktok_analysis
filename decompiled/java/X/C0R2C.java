package X;

import Y.ARunnableS37S0300000_4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.InspireAdviceMoreData;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.SearchLoadMoreDataStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R2C, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R2C extends C09AY implements Function1<LoadMoreResponse, Unit> {
    public final /* synthetic */ C14NX LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ C14NF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R2C(C14NX c14nx, int i, Map<String, ? extends Object> map, C14NF c14nf) {
        super(1);
        this.LL = c14nx;
        this.LLILLJJLI = i;
        this.LLILLL = map;
        this.LLILZ = c14nf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoadMoreResponse loadMoreResponse) {
        Map<String, Object> map;
        Object obj;
        ?? arrayList;
        InspireAdviceMoreData inspireAdviceMoreData;
        List<Aweme> list;
        List list2;
        List list3;
        Message messageYy1;
        LoadMoreResponse loadMoreResponse2 = loadMoreResponse;
        Object objLJJJLZIJ = null;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(this.LL.LIZIZ(), TakoCardAbility.class, null);
        if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null) {
            map = messageYy1.LJIILIIL;
        } else {
            map = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache.aweme_map[");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList2 = new ArrayList();
        if (map != null) {
            obj = map.get("aweme_map");
        } else {
            obj = null;
        }
        if ((obj instanceof List) && (list3 = (List) obj) != null) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(this.LLILLJJLI, list3);
        }
        if ((objLJJJLZIJ instanceof List) && (list2 = (List) objLJJJLZIJ) != null) {
            for (Object obj2 : list2) {
                if (obj2 instanceof Map) {
                    arrayList2.add(obj2);
                }
            }
        }
        SearchLoadMoreDataStruct searchLoadMoreDataStruct = loadMoreResponse2.data;
        if (searchLoadMoreDataStruct != null && (inspireAdviceMoreData = searchLoadMoreDataStruct.inspireAdviceMoreData) != null && (list = inspireAdviceMoreData.videoList) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C688770Qzz.LIZ(it2.next()));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C19719612Di.LJJI(arrayList, arrayList2);
        C0R2D.LIZ(strLIZIZ, map, C13BV.INSTANCE, arrayList2);
        C328930Cux.LIZ(new ARunnableS37S0300000_4(this.LL, this.LLILLL, this.LLILZ, 14));
        return Unit.LIZ;
    }
}
