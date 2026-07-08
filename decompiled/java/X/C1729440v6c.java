package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import java.util.Map;

/* JADX INFO: renamed from: X.0v6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729440v6c {
    public final RootData LIZ;
    public final String LIZIZ;
    public final long LIZJ = System.currentTimeMillis();

    public final void LIZJ() {
        LIZ(System.currentTimeMillis() - this.LIZJ, "apply_success", null);
    }

    public final void LIZIZ(String str) {
        LIZ(System.currentTimeMillis() - this.LIZJ, "apply_fail", str);
    }

    public C1729440v6c(RootData rootData, String str) {
        this.LIZ = rootData;
        this.LIZIZ = str;
    }

    public final void LIZ(long j, String str, String str2) {
        RootData rootData = this.LIZ;
        if (rootData == null) {
            return;
        }
        Map mapLIZ = C1729250v6J.LIZ(rootData.roomId, rootData.authorId, rootData.LIZ(), rootData.isNewUser, "notice_board_template", null);
        mapLIZ.put("step", str);
        String str3 = this.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        mapLIZ.put("operated_from", str3);
        if (j > 0) {
            mapLIZ.put("apply_duration", Long.valueOf(j));
        }
        if (C123100dR.LIZ(str2)) {
            mapLIZ.put("error_info", str2);
        }
        C1421105hJ.LIZJ("rd_ttec_apply_top_atmosphere", mapLIZ);
    }
}
