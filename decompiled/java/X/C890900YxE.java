package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;

/* JADX INFO: renamed from: X.0YxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890900YxE {
    public static final boolean LIZ(boolean z) {
        NoticeFeature noticeFeatureLIZ;
        List<FilterTabType> listLJIIIIZZ;
        C06QI c06qi = NoticeFeature.LIZ;
        NoticeFeature noticeFeatureLIZ2 = c06qi.LIZ();
        if (noticeFeatureLIZ2 != null && noticeFeatureLIZ2.LIZLLL() && !z && (noticeFeatureLIZ = c06qi.LIZ()) != null && (listLJIIIIZZ = noticeFeatureLIZ.LJIIIIZZ()) != null && listLJIIIIZZ.contains(FilterTabType.SPAM)) {
            return true;
        }
        return false;
    }
}
