package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.EffectUseListResponse;
import com.ss.android.ugc.aweme.notification.bean.NoticeInfo;
import com.ss.android.ugc.aweme.notification.bean.SimpleUserInfo;
import com.ss.android.ugc.aweme.notification.bean.VideoInfo;
import com.ss.android.ugc.aweme.notification.model.EffectUseListModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909220zma extends C1260870iur<EffectUseListModel, InterfaceC1212360hec<DiggInfo>> implements InterfaceC1909070zmL {
    @Override // X.InterfaceC1909070zmL
    public final int LIZLLL() {
        EffectUseListResponse effectUseListResponse;
        List<NoticeInfo> list;
        T t = this.LL;
        if (t == 0 || (effectUseListResponse = (EffectUseListResponse) t.getData()) == null || (list = effectUseListResponse.noticeInfoList) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.C1260870iur
    public final void LJIILIIL() {
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        if (((EffectUseListModel) t).isLoadMore) {
            ((InterfaceC1212360hec) this.LLILLJJLI).showLoadMoreLoading();
        } else {
            ((InterfaceC1212360hec) this.LLILLJJLI).LJ();
        }
    }

    @Override // X.InterfaceC1909070zmL
    public final void LJJIFFI() {
        EffectUseListModel effectUseListModel = (EffectUseListModel) this.LL;
        if (effectUseListModel != null) {
            effectUseListModel.loadMore();
        }
        LJIILIIL();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        EffectUseListResponse effectUseListResponse;
        EffectUseListResponse effectUseListResponse2;
        List<NoticeInfo> list;
        T t = this.LL;
        boolean z = false;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        EffectUseListModel effectUseListModel = (EffectUseListModel) t;
        if (effectUseListModel.isLoadMore) {
            InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
            List listLJIILL = LJIILL(effectUseListModel.getData().noticeInfoList);
            T t2 = this.LL;
            interfaceC1212360hec.Pj(listLJIILL, (t2 == 0 || (effectUseListResponse2 = (EffectUseListResponse) t2.getData()) == null || !effectUseListResponse2.hasMore || (list = ((EffectUseListResponse) this.LL.getData()).noticeInfoList) == null || list.isEmpty()) ? false : true);
            return;
        }
        List<NoticeInfo> list2 = effectUseListModel.getData().noticeInfoList;
        if (list2 == null || list2.isEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
            return;
        }
        InterfaceC1212360hec interfaceC1212360hec2 = (InterfaceC1212360hec) this.LLILLJJLI;
        List listLJIILL2 = LJIILL(((EffectUseListResponse) this.LL.getData()).noticeInfoList);
        T t3 = this.LL;
        if (t3 != 0 && (effectUseListResponse = (EffectUseListResponse) t3.getData()) != null) {
            z = effectUseListResponse.hasMore;
        }
        interfaceC1212360hec2.LLJJJIL(listLJIILL2, z);
    }

    @Override // X.InterfaceC1909070zmL
    public final void refresh() {
        EffectUseListModel effectUseListModel = (EffectUseListModel) this.LL;
        if (effectUseListModel != null) {
            effectUseListModel.refresh();
        }
    }

    public static List LJIILL(List list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        SimpleUserInfo simpleUserInfo;
        String str9;
        SimpleUserInfo simpleUserInfo2;
        SimpleUserInfo simpleUserInfo3;
        SimpleUserInfo simpleUserInfo4;
        SimpleUserInfo simpleUserInfo5;
        SimpleUserInfo simpleUserInfo6;
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        VideoInfo videoInfo3;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NoticeInfo noticeInfo = (NoticeInfo) it2.next();
                DiggInfo diggInfo = new DiggInfo();
                Aweme aweme = new Aweme();
                String str10 = "";
                if (noticeInfo == null || (videoInfo3 = noticeInfo.videoInfo) == null || (str = videoInfo3.awemeId) == null) {
                    str = "";
                }
                aweme.setAid(str);
                Video video = new Video();
                UrlModel urlModel = new UrlModel();
                if (noticeInfo == null || (videoInfo2 = noticeInfo.videoInfo) == null || (str2 = videoInfo2.coverUrl) == null) {
                    str2 = "";
                }
                urlModel.setUri(str2);
                if (noticeInfo == null || (videoInfo = noticeInfo.videoInfo) == null || (str3 = videoInfo.coverUrl) == null) {
                    str3 = "";
                }
                urlModel.setUrlList(Collections.singletonList(str3));
                video.setOriginCover(urlModel);
                aweme.setVideo(video);
                diggInfo.aweme = aweme;
                User user = new User();
                if (noticeInfo == null || (simpleUserInfo6 = noticeInfo.simpleUserInfo) == null || (str4 = simpleUserInfo6.uid) == null) {
                    str4 = "";
                }
                user.setUid(str4);
                if (noticeInfo == null || (simpleUserInfo5 = noticeInfo.simpleUserInfo) == null || (str5 = simpleUserInfo5.secUid) == null) {
                    str5 = "";
                }
                user.setSecUid(str5);
                if (noticeInfo == null || (simpleUserInfo4 = noticeInfo.simpleUserInfo) == null || (str6 = simpleUserInfo4.nickName) == null) {
                    str6 = "";
                }
                user.setNickname(str6);
                if (noticeInfo == null || (simpleUserInfo3 = noticeInfo.simpleUserInfo) == null || (str7 = simpleUserInfo3.userName) == null) {
                    str7 = "";
                }
                user.setUniqueId(str7);
                UrlModel urlModel2 = new UrlModel();
                if (noticeInfo == null || (simpleUserInfo2 = noticeInfo.simpleUserInfo) == null || (str8 = simpleUserInfo2.coverUrl) == null) {
                    str8 = "";
                }
                urlModel2.setUri(str8);
                if (noticeInfo != null && (simpleUserInfo = noticeInfo.simpleUserInfo) != null && (str9 = simpleUserInfo.coverUrl) != null) {
                    str10 = str9;
                }
                urlModel2.setUrlList(Collections.singletonList(str10));
                user.setAvatarThumb(urlModel2);
                diggInfo.user = user;
                arrayList.add(diggInfo);
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        T t = this.LL;
        if (t != 0 && this.LLILLJJLI != 0) {
            if (((EffectUseListModel) t).isLoadMore) {
                ((InterfaceC1212360hec) this.LLILLJJLI).Wi(exc);
            } else {
                ((InterfaceC1212360hec) this.LLILLJJLI).Uq2(exc);
            }
        }
    }
}
