package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zZR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901070zZR extends AbstractC1901080zZS {
    public static final C1901070zZR LJI = new C1901070zZR();
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;

    @Override // X.AbstractC1901080zZS
    public final String LJ() {
        return "tt_inbox_follow_api_monitor";
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(this.LIZIZ));
        c2241008qG.LIZ.put("status_code", Integer.valueOf(this.LIZJ));
        c2241008qG.LIZ.put("error_code", Integer.valueOf(this.LIZLLL));
        c2241008qG.LIZ.put("position", this.LJ);
        c2241008qG.LIZ.put("is_first_refresh", Boolean.valueOf(LJII));
        c2241008qG.LIZ.put("is_load_more", Boolean.valueOf(LJIIIIZZ));
        c2241008qG.LIZ.put("need_follow_request", Boolean.valueOf(LJIIIZ));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZIZ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("log_id", this.LJFF);
        c2241008qG.LIZ.put("has_more", Boolean.valueOf(LJIIJ));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZJ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("notice_count", Integer.valueOf(LJIIJJI));
        c2241008qG.LIZ.put("notice_total", Integer.valueOf(LJIIL));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final void LIZLLL() {
        super.LIZLLL();
        LJIIJJI = 0;
        LJIIL = 0;
        LJII = false;
        LJIIIIZZ = false;
        LJIIIZ = false;
        LJIIJ = false;
    }

    public final void LJII(FollowPageResponse followPageResponse) throws JSONException {
        int i;
        if (LJFF()) {
            int i2 = followPageResponse.error_code;
            String str = null;
            int size = 0;
            if (i2 != 0) {
                C1901070zZR c1901070zZR = LJI;
                c1901070zZR.LIZIZ = 0;
                c1901070zZR.LIZLLL = i2;
                c1901070zZR.LIZJ = followPageResponse.status_code;
                BaseResponse.ServerTimeExtra serverTimeExtra = followPageResponse.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                }
                c1901070zZR.LJFF = str;
            } else {
                C1901070zZR c1901070zZR2 = LJI;
                c1901070zZR2.LIZIZ = 1;
                c1901070zZR2.LIZJ = followPageResponse.status_code;
                List<FollowPageData> data = followPageResponse.getData();
                if (data != null && !data.isEmpty()) {
                    i = 0;
                } else {
                    i = 99999;
                }
                c1901070zZR2.LIZLLL = i;
                BaseResponse.ServerTimeExtra serverTimeExtra2 = followPageResponse.extra;
                if (serverTimeExtra2 != null) {
                    str = serverTimeExtra2.logid;
                }
                c1901070zZR2.LJFF = str;
                List<FollowPageData> data2 = followPageResponse.getData();
                if (data2 != null) {
                    size = data2.size();
                }
                LJIIJJI = size;
                LJIIL = followPageResponse.getTotal();
                LJIIJ = followPageResponse.getHasMore();
            }
            LJI();
            return;
        }
        LIZLLL();
    }
}
