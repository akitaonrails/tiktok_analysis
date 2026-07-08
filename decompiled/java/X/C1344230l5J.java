package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0l5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344230l5J {
    public static final /* synthetic */ int LIZJ = 0;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public long LIZIZ;

    public final void LIZ(BaseResponse baseResponse) {
        LogPbBean logPbBean;
        String imprId;
        if ((baseResponse instanceof BaseCommentResponse) && (logPbBean = ((BaseCommentResponse) baseResponse).logPd) != null && (imprId = logPbBean.getImprId()) != null) {
            this.LIZ.put("LogID", imprId);
        }
        this.LIZ.put("ErrorCode", String.valueOf(baseResponse.status_code));
    }
}
