package X;

import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.BizData;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643130PKl {
    public static final QueryCorrectComponentInfo LIZ(SearchApiResult searchApiResult) {
        List<ComponentInfo> list;
        ComponentInfo next;
        List<ComponentInfo> list2;
        ComponentInfo next2;
        BizData bizData;
        if (searchApiResult == null || (list = searchApiResult.components) == null) {
            return null;
        }
        Iterator<ComponentInfo> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.type, "header")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ComponentInfo componentInfo = next;
        if (componentInfo == null || (list2 = componentInfo.components) == null) {
            return null;
        }
        Iterator<ComponentInfo> it3 = list2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(next2.type, "query_correct_info")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        ComponentInfo componentInfo2 = next2;
        if (componentInfo2 == null || (bizData = componentInfo2.bizData) == null) {
            return null;
        }
        return bizData.queryCorrectInfo;
    }

    public static final QueryDesc LIZIZ(QueryCorrectComponentInfo queryCorrectComponentInfo, String str) {
        List<QueryDesc> list;
        QueryDesc queryDesc = null;
        if (queryCorrectComponentInfo == null || (list = queryCorrectComponentInfo.queryDescList) == null) {
            return null;
        }
        Iterator<QueryDesc> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            QueryDesc next = it2.next();
            if (Intrinsics.LJFF(str, next.type)) {
                queryDesc = next;
                break;
            }
        }
        return queryDesc;
    }
}
