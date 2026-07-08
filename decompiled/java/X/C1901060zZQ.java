package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901060zZQ extends AbstractC1901080zZS {
    public static int LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static int LJIIL;
    public static int LJIILIIL;
    public static final C1901060zZQ LJI = new C1901060zZQ();
    public static String LJIIJJI = "";

    @Override // X.AbstractC1901080zZS
    public final String LJ() {
        return "tt_inbox_notice_multi_api_monitor";
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(this.LIZIZ));
        c2241008qG.LIZ.put("status_code", Integer.valueOf(this.LIZJ));
        c2241008qG.LIZ.put("error_code", Integer.valueOf(this.LIZLLL));
        c2241008qG.LIZ.put("position", this.LJ);
        c2241008qG.LIZ.put("is_first_refresh", Boolean.valueOf(LJIIIIZZ));
        c2241008qG.LIZ.put("is_load_more", Boolean.valueOf(LJIIIZ));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZIZ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("experiments", LJIIJJI);
        c2241008qG.LIZ.put("request_scenario", Integer.valueOf(LJII));
        c2241008qG.LIZ.put("log_id", this.LJFF);
        c2241008qG.LIZ.put("has_more", Boolean.valueOf(LJIIJ));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZJ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("notice_count", Integer.valueOf(LJIIL));
        c2241008qG.LIZ.put("notice_total", Integer.valueOf(LJIILIIL));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final void LIZLLL() {
        super.LIZLLL();
        LJII = 0;
        LJIIJJI = "";
        LJIIL = 0;
        LJIILIIL = 0;
        LJIIIIZZ = false;
        LJIIIZ = false;
        LJIIJ = false;
    }

    public final void LJII(NoticeListsResponse noticeListsResponse, int i) throws JSONException {
        int i2;
        String imprId;
        int i3;
        if (LJFF()) {
            int i4 = noticeListsResponse.error_code;
            NoticeItems noticeItems = null;
            String str = null;
            boolean z = false;
            if (i4 != 0) {
                C1901060zZQ c1901060zZQ = LJI;
                c1901060zZQ.LIZIZ = 0;
                c1901060zZQ.LIZLLL = i4;
                c1901060zZQ.LIZJ = noticeListsResponse.status_code;
                BaseResponse.ServerTimeExtra serverTimeExtra = noticeListsResponse.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                }
                c1901060zZQ.LJFF = str;
            } else {
                C1901060zZQ c1901060zZQ2 = LJI;
                c1901060zZQ2.LIZIZ = 1;
                c1901060zZQ2.LIZJ = noticeListsResponse.status_code;
                if (C1246490iXf.LIZ(noticeListsResponse.getNotices()) == 0) {
                    i2 = 99999;
                } else {
                    i2 = 0;
                }
                c1901060zZQ2.LIZLLL = i2;
                LogPbBean lobPb = noticeListsResponse.getLobPb();
                if (lobPb != null) {
                    imprId = lobPb.getImprId();
                } else {
                    imprId = null;
                }
                c1901060zZQ2.LJFF = imprId;
                LJIIL = C1246490iXf.LIZ(noticeListsResponse.getNotices());
                List<NoticeItems> notices = noticeListsResponse.getNotices();
                if (notices != null) {
                    Iterator<NoticeItems> it2 = notices.iterator();
                    i3 = 0;
                    while (it2.hasNext()) {
                        i3 += it2.next().total;
                    }
                } else {
                    i3 = 0;
                }
                LJIILIIL = i3;
                List<NoticeItems> notices2 = noticeListsResponse.getNotices();
                if (notices2 != null) {
                    Iterator<NoticeItems> it3 = notices2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        NoticeItems next = it3.next();
                        if (i == next.group) {
                            noticeItems = next;
                            break;
                        }
                    }
                    NoticeItems noticeItems2 = noticeItems;
                    if (noticeItems2 != null) {
                        z = noticeItems2.hasMore;
                    }
                }
                LJIIJ = z;
            }
            LJI();
            return;
        }
        LIZLLL();
    }
}
