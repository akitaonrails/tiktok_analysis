package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901150zZZ extends AbstractC1900910zZB<C1900900zZA, CreatorNoticeResponse> {
    public static final C1901150zZZ LIZJ = new C1901150zZZ();
    public static final String LIZLLL = "CreatorNoticePreloadManager";

    @Override // X.AbstractC1900910zZB
    public final boolean LJI() {
        if (C297280Bl0.LIZ() && C2367709Pn.LJIIIIZZ(C1BWL.LIZ())) {
            return false;
        }
        C889930Yvf.LIZ.getClass();
        return (C890080Yvu.LIZIZ.LIZJ(true) && C890280YwE.LIZIZ.LIZJ(true)) || C890300YwG.LIZIZ.LIZJ(true);
    }

    @Override // X.AbstractC1900910zZB
    public final String LJFF() {
        return LIZLLL;
    }

    @Override // X.AbstractC1900910zZB
    public final AbstractC1900890zZ9 LIZIZ(final String str, final String str2) {
        return new AbstractC1900890zZ9<CreatorNoticeResponse>(str, str2) { // from class: X.0zZA
            public CreatorNoticeResponse LIZLLL;

            @Override // X.AbstractC1900890zZ9
            public final void LIZLLL() {
                List<NoticeTabModel> list;
                if (this.LIZJ) {
                    CreatorNoticeResponse creatorNoticeResponse = this.LIZLLL;
                    C1900950zZF.LJ(creatorNoticeResponse != null ? creatorNoticeResponse.notices : null);
                    CreatorNoticeResponse creatorNoticeResponse2 = this.LIZLLL;
                    C1900950zZF.LJ(creatorNoticeResponse2 != null ? creatorNoticeResponse2.extraList : null);
                    CreatorNoticeResponse creatorNoticeResponse3 = this.LIZLLL;
                    if (creatorNoticeResponse3 == null || (list = creatorNoticeResponse3.tabDataModel) == null) {
                        return;
                    }
                    Iterator<NoticeTabModel> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().unReadCount = 0;
                    }
                }
            }

            @Override // X.AbstractC1900890zZ9
            public final /* bridge */ /* synthetic */ CreatorNoticeResponse LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC1900890zZ9
            public final void LIZ(BaseNotice baseNotice) {
                List<? extends MusNotice> listLIZ;
                CreatorNoticeResponse creatorNoticeResponse = this.LIZLLL;
                List<? extends MusNotice> listLIZ2 = null;
                if (creatorNoticeResponse != null) {
                    List<? extends MusNotice> list = creatorNoticeResponse.notices;
                    if (list != null) {
                        listLIZ = C1900950zZF.LIZ(list, baseNotice);
                    } else {
                        listLIZ = null;
                    }
                    creatorNoticeResponse.notices = listLIZ;
                }
                CreatorNoticeResponse creatorNoticeResponse2 = this.LIZLLL;
                if (creatorNoticeResponse2 != null) {
                    List<? extends MusNotice> list2 = creatorNoticeResponse2.extraList;
                    if (list2 != null) {
                        listLIZ2 = C1900950zZF.LIZ(list2, baseNotice);
                    }
                    creatorNoticeResponse2.extraList = listLIZ2;
                }
            }

            @Override // X.AbstractC1900890zZ9
            public final /* bridge */ /* synthetic */ void LJ(CreatorNoticeResponse creatorNoticeResponse) {
                this.LIZLLL = creatorNoticeResponse;
            }

            @Override // X.AbstractC1900890zZ9
            public final void LIZIZ(NoticeDisableActionInfo noticeDisableActionInfo, boolean z) {
                List<? extends MusNotice> listLIZJ;
                CreatorNoticeResponse creatorNoticeResponse = this.LIZLLL;
                List<? extends MusNotice> listLIZJ2 = null;
                if (creatorNoticeResponse != null) {
                    List<? extends MusNotice> list = creatorNoticeResponse.notices;
                    if (list != null) {
                        listLIZJ = C1900950zZF.LIZJ(list, noticeDisableActionInfo, z);
                    } else {
                        listLIZJ = null;
                    }
                    creatorNoticeResponse.notices = listLIZJ;
                }
                CreatorNoticeResponse creatorNoticeResponse2 = this.LIZLLL;
                if (creatorNoticeResponse2 != null) {
                    List<? extends MusNotice> list2 = creatorNoticeResponse2.extraList;
                    if (list2 != null) {
                        listLIZJ2 = C1900950zZF.LIZJ(list2, noticeDisableActionInfo, z);
                    }
                    creatorNoticeResponse2.extraList = listLIZJ2;
                }
            }
        };
    }
}
