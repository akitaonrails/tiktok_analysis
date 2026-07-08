package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598790rht {
    public static final void LIZ(SkylightDataResponse skylightDataResponse) {
        LogPbBean logPb;
        String imprId;
        List<SkylightData> dataList;
        if (skylightDataResponse != null && (logPb = skylightDataResponse.getLogPb()) != null && (imprId = logPb.getImprId()) != null && imprId.length() > 0 && (dataList = skylightDataResponse.getDataList()) != null) {
            Iterator<SkylightData> it2 = dataList.iterator();
            while (it2.hasNext()) {
                it2.next().setImprId(imprId);
            }
        }
    }

    public static final void LIZIZ(NoticeCombineDatas noticeCombineDatas) {
        String imprId;
        List<CombineLiveNotice> list;
        LogPbBean logPbBean = noticeCombineDatas.logPb;
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null && imprId.length() > 0 && (list = noticeCombineDatas.liveNotices) != null) {
            Iterator<CombineLiveNotice> it2 = list.iterator();
            while (it2.hasNext()) {
                User user = it2.next().user;
                if (user != null) {
                    user.setRequestId(imprId);
                }
            }
        }
    }
}
