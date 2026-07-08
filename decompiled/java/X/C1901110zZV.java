package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zZV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901110zZV extends AbstractC1901080zZS {
    public boolean LJI;
    public boolean LJII;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public int LJIIJ;

    @Override // X.AbstractC1901080zZS
    public final String LJ() {
        return "tt_inbox_entrance_api_monitor";
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(this.LIZIZ));
        c2241008qG.LIZ.put("status_code", Integer.valueOf(this.LIZJ));
        c2241008qG.LIZ.put("error_code", Integer.valueOf(this.LIZLLL));
        c2241008qG.LIZ.put("position", this.LJ);
        c2241008qG.LIZ.put("is_first_refresh", Boolean.valueOf(this.LJI));
        c2241008qG.LIZ.put("is_for_cache", Boolean.valueOf(this.LJII));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZIZ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("experiments", this.LJIIIIZZ);
        c2241008qG.LIZ.put("additional_param", this.LJIIIZ);
        c2241008qG.LIZ.put("log_id", this.LJFF);
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final JSONObject LIZJ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("entrance_cells_count", Integer.valueOf(this.LJIIJ));
        return c2241008qG.LJ();
    }

    @Override // X.AbstractC1901080zZS
    public final void LIZLLL() {
        super.LIZLLL();
        this.LJIIJ = 0;
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LJI = false;
        this.LJII = false;
    }

    public final void LJII(InboxEntranceResponse inboxEntranceResponse) {
        int i;
        if (LJFF()) {
            int i2 = inboxEntranceResponse.error_code;
            String str = null;
            int size = 0;
            if (i2 != 0) {
                this.LIZIZ = 0;
                this.LIZLLL = i2;
                this.LIZJ = inboxEntranceResponse.status_code;
                BaseResponse.ServerTimeExtra serverTimeExtra = inboxEntranceResponse.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                }
                this.LJFF = str;
            } else {
                this.LIZIZ = 1;
                this.LIZJ = inboxEntranceResponse.status_code;
                List<InboxEntranceCell> entranceCells = inboxEntranceResponse.getEntranceCells();
                if (entranceCells != null && !entranceCells.isEmpty()) {
                    i = 0;
                } else {
                    i = 99999;
                }
                this.LIZLLL = i;
                BaseResponse.ServerTimeExtra serverTimeExtra2 = inboxEntranceResponse.extra;
                if (serverTimeExtra2 != null) {
                    str = serverTimeExtra2.logid;
                }
                this.LJFF = str;
                List<InboxEntranceCell> entranceCells2 = inboxEntranceResponse.getEntranceCells();
                if (entranceCells2 != null) {
                    size = entranceCells2.size();
                }
                this.LJIIJ = size;
            }
            LJI();
            return;
        }
        LIZLLL();
    }
}
