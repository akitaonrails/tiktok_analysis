package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;

/* JADX INFO: renamed from: X.0P90, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P90 {
    public static final C0P90 LIZ = new C0P90();

    public static final Map<String, Object> LIZ(SearchResultParam searchResultParam) {
        if (searchResultParam == null) {
            return C2097608Jq.LJ();
        }
        Map<String, Object> map = ((C640110P8v) C0Q3E.LIZLLL(searchResultParam).SL1().LIZJ()).LLILLL;
        C0P7X.LIZ(new C640090P8t(null), searchResultParam);
        if (map == null) {
            return C2097608Jq.LJ();
        }
        return map;
    }
}
