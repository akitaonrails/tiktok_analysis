package X;

import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644340PPc {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ EnumC644330PPb LIZIZ;
    public final /* synthetic */ HashMap<String, String> LIZJ;

    public final boolean LIZ(List<? extends SearchHistory> list) {
        Object obj;
        if (list != null) {
            String str = this.LIZ;
            Iterator<? extends SearchHistory> it2 = list.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                SearchHistory next = it2.next();
                SearchHistory searchHistory = next;
                if (searchHistory != null) {
                    obj = searchHistory.keyword;
                }
                if (Intrinsics.LJFF(obj, str)) {
                    obj = next;
                    break;
                }
            }
            SearchHistory searchHistory2 = (SearchHistory) obj;
            if (searchHistory2 != null) {
                EnumC644330PPb enumC644330PPb = this.LIZIZ;
                HashMap<String, String> map = this.LIZJ;
                searchHistory2.historySearchIntentType = Integer.valueOf(enumC644330PPb.getValue());
                searchHistory2.searchExtraParams = map;
                return true;
            }
            return false;
        }
        return false;
    }

    public C644340PPc(String str, EnumC644330PPb enumC644330PPb, HashMap<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = enumC644330PPb;
        this.LIZJ = map;
    }
}
