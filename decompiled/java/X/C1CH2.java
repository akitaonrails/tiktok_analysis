package X;

import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import java.util.Map;

/* JADX INFO: renamed from: X.1CH2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CH2 {
    public static final BaseRequestComponent LIZ(C1CH0 c1ch0) {
        QueryDataComponent queryDataComponent;
        C2227681CGw c2227681CGw = c1ch0.query_data;
        if (c2227681CGw != null) {
            String str = c2227681CGw.resource_id;
            if (str == null) {
                str = "";
            }
            Map<String, String> mapLJ = c2227681CGw.extra;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            queryDataComponent = new QueryDataComponent(str, mapLJ);
        } else {
            queryDataComponent = new QueryDataComponent(null, null, 3);
        }
        return new BaseRequestComponent(queryDataComponent);
    }
}
