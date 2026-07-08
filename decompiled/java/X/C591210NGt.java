package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.api.FeedCacheForLoadMoreApi;
import com.ss.android.ugc.aweme.feed.api.InspectItemResponse;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591210NGt extends C09AY implements Function0<C591270NGz> {
    public C591210NGt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NGz] */
    @Override // kotlin.jvm.functions.Function0
    public final C591270NGz invoke() {
        return new InterfaceC591200NGs() { // from class: X.0NGz
            public final String LIZ = "item_status_change";

            @Override // X.InterfaceC591200NGs
            public final C591190NGr LIZ(List<? extends CacheEntry> list) {
                Aweme aweme;
                if (list.isEmpty()) {
                    return new C591190NGr(this.LIZ, list, 0);
                }
                C0NH0.LIZLLL = System.currentTimeMillis();
                try {
                    InspectItemResponse inspectItemResponse = ((FeedCacheForLoadMoreApi.FeedCacheForLoadMoreService) FeedCacheForLoadMoreApi.LIZ.getValue()).verifyAids(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, new C591260NGy(), 30)).execute().LIZIZ;
                    C1227904rF.LIZ.getClass();
                    n nVar = (n) C1227904rF.LIZLLL().LJII(inspectItemResponse.itemStatus, n.class);
                    ArrayList arrayList = new ArrayList();
                    for (CacheEntry cacheEntry : list) {
                        CacheEntry cacheEntry2 = cacheEntry;
                        String aid = cacheEntry2.key;
                        if (aid.length() <= 0 && 0 == 0 && ((aweme = cacheEntry2.value) == null || (aid = aweme.getAid()) == null)) {
                            aid = "";
                        }
                        k kVarLJJIIZ = nVar.LJJIIZ(aid);
                        if (kVarLJJIIZ != null && kVarLJJIIZ.LJIIJJI() == 0) {
                            arrayList.add(cacheEntry);
                        }
                    }
                    C0NH0.LJ = System.currentTimeMillis();
                    return new C591190NGr(this.LIZ, arrayList, list.size() - arrayList.size());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0NH0.LJ = System.currentTimeMillis();
                    return new C591190NGr(this.LIZ, list, 0);
                }
            }
        };
    }
}
