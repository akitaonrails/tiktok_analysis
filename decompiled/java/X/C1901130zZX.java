package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901130zZX extends AbstractC1900910zZB<C1900960zZG, NoticeListsResponse> {
    public static final C1901130zZX LIZJ = new C1901130zZX();
    public static final String LIZLLL = "MultiNoticePreloadManager";

    @Override // X.AbstractC1900910zZB
    public final boolean LJI() {
        return !(C297280Bl0.LIZ() && C2367709Pn.LJIIIIZZ(C1BWL.LIZ())) && ((Number) C1866790yg9.LIZ.getValue()).intValue() >= 1;
    }

    @Override // X.AbstractC1900910zZB
    public final String LJFF() {
        return LIZLLL;
    }

    public static void LJII(C1901130zZX c1901130zZX, List list) {
        Object next;
        NoticeItems noticeItems;
        C1900960zZG c1900960zZGLJ;
        synchronized (c1901130zZX) {
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((InboxEntranceCell) next).isActivity()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InboxEntranceCell inboxEntranceCell = (InboxEntranceCell) next;
                if (inboxEntranceCell != null && (noticeItems = inboxEntranceCell.noticePreloadItem) != null && (c1900960zZGLJ = LIZJ.LJ()) != null) {
                    c1900960zZGLJ.LJ(new NoticeListsResponse(Collections.singletonList(noticeItems), null, null, null));
                    c1900960zZGLJ.LIZJ = false;
                }
            }
        }
    }

    @Override // X.AbstractC1900910zZB
    public final AbstractC1900890zZ9 LIZIZ(final String str, final String str2) {
        return new AbstractC1900890zZ9<NoticeListsResponse>(str, str2) { // from class: X.0zZG
            public NoticeListsResponse LIZLLL;

            @Override // X.AbstractC1900890zZ9
            public final void LIZLLL() {
                if (this.LIZJ) {
                    NoticeListsResponse noticeListsResponse = this.LIZLLL;
                    C1900950zZF.LIZLLL(noticeListsResponse != null ? noticeListsResponse.getNotices() : null);
                }
            }

            @Override // X.AbstractC1900890zZ9
            public final /* bridge */ /* synthetic */ NoticeListsResponse LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC1900890zZ9
            public final void LIZ(BaseNotice baseNotice) {
                List<NoticeItems> notices;
                NoticeListsResponse noticeListsResponse = this.LIZLLL;
                if (noticeListsResponse != null && (notices = noticeListsResponse.getNotices()) != null) {
                    C1900950zZF.LIZIZ(notices, baseNotice);
                }
            }

            @Override // X.AbstractC1900890zZ9
            public final /* bridge */ /* synthetic */ void LJ(NoticeListsResponse noticeListsResponse) {
                this.LIZLLL = noticeListsResponse;
            }

            @Override // X.AbstractC1900890zZ9
            public final void LIZIZ(NoticeDisableActionInfo noticeDisableActionInfo, boolean z) {
                List<? extends MusNotice> listLIZJ;
                NoticeListsResponse noticeListsResponse = this.LIZLLL;
                if (noticeListsResponse != null) {
                    List<NoticeItems> notices = noticeListsResponse.getNotices();
                    ArrayList arrayList = null;
                    if (notices != null) {
                        ArrayList<NoticeItems> arrayList2 = new ArrayList(notices);
                        for (NoticeItems noticeItems : arrayList2) {
                            List<? extends MusNotice> list = noticeItems.items;
                            if (list != null) {
                                listLIZJ = C1900950zZF.LIZJ(list, noticeDisableActionInfo, z);
                            } else {
                                listLIZJ = null;
                            }
                            if (!Intrinsics.LJFF(listLIZJ, noticeItems.items)) {
                                noticeItems.setItems(listLIZJ);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    noticeListsResponse.setNotices(arrayList);
                }
            }
        };
    }
}
