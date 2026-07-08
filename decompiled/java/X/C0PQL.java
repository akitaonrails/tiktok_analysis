package X;

import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

/* JADX INFO: renamed from: X.0PQL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQL {
    public static C0PQN LIZ(SearchApiResult searchApiResult, Exception exc) {
        SearchNilInfo searchNilInfo;
        if (exc instanceof C0XIR) {
            int errorCode = ((C23112093u) exc).getErrorCode();
            if (errorCode != 2483) {
                if (errorCode == 2484) {
                    return C0PQN.LIMIT;
                }
            } else {
                return C0PQN.NEED_LOGIN;
            }
        }
        if (exc != null && exc.getCause() != null && (exc.getCause() instanceof C0XIR)) {
            int errorCode2 = ((C23112093u) exc.getCause()).getErrorCode();
            if (errorCode2 != 2483) {
                if (errorCode2 == 2484) {
                    return C0PQN.LIMIT;
                }
            } else {
                return C0PQN.NEED_LOGIN;
            }
        }
        if (searchApiResult != null && (searchNilInfo = searchApiResult.searchNilInfo) != null) {
            if (searchNilInfo.isHitCoreTable()) {
                return C0PQN.HIT_CORE_TABLE;
            }
            if (searchNilInfo.isSensitive()) {
                return C0PQN.SENSITIVE;
            }
            if (searchNilInfo.isHitLimit()) {
                return C0PQN.LIMIT;
            }
        }
        return C0PQN.EMPTY;
    }
}
