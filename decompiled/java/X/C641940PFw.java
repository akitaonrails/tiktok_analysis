package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.SearchTabList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641940PFw extends C09AY implements Function0<SearchTabList> {
    public C641940PFw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchTabList invoke() {
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            SearchTabList searchTabList = C641930PFv.LIZ;
            SearchTabList searchTabList2 = (SearchTabList) c0c59LJ.LJIILIIL(SearchTabList.class, searchTabList, "tiktok_search_tab_list", true);
            return searchTabList2 != null ? searchTabList2 : searchTabList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C641930PFv.LIZ;
        }
    }
}
