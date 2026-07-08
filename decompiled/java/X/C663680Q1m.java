package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663680Q1m {
    public static final Map<String, String> LIZIZ(JSONObject jSONObject) {
        C13DA c13da = new C13DA();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c13da.put(next, jSONObject.optString(next));
        }
        return c13da.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.search.model.SearchResultParam LIZ(X.InterfaceC214902198i r16, org.json.JSONObject r17) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C663680Q1m.LIZ(X.198i, org.json.JSONObject):com.ss.android.ugc.aweme.search.model.SearchResultParam");
    }
}
