package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0zZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901120zZW {
    public final String LIZ;
    public final String LIZIZ;
    public volatile FollowerPreCacheManager.FollowNoticeData LIZJ;
    public final CopyOnWriteArrayList<User> LIZLLL = new CopyOnWriteArrayList<>();

    public final synchronized FollowerPreCacheManager.FollowNoticeData LIZIZ() {
        return this.LIZJ;
    }

    public final void LIZ(FollowPageData followPageData) {
        User user;
        FollowNotice followNotice;
        User user2;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        Object objLJJJLL;
        MusNotice musNotice = followPageData.notice;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
            this.LIZLLL.add((User) objLJJJLL);
            return;
        }
        MusNotice musNotice2 = followPageData.notice;
        if (musNotice2 != null && (followNotice = musNotice2.followNotice) != null && (user2 = followNotice.getUser()) != null) {
            this.LIZLLL.add(user2);
            return;
        }
        FollowRequestData followRequestData = followPageData.followRequest;
        if (followRequestData == null || (user = followRequestData.user) == null) {
            return;
        }
        this.LIZLLL.add(user);
    }

    public C1901120zZW(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
