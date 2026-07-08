package X;

import com.bytedance.pipo.verify.base.network.data.ExchangeTokenResult;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713560uh0 {
    public final C1713570uh1 LIZ;
    public final String LIZIZ;
    public long LIZJ;

    public final void LIZ() {
        this.LIZJ = System.currentTimeMillis();
        C1714230ui5.LIZLLL(new AwS141S1200000_26(this, (C1713560uh0) "fvs_server_request", (String) C2097608Jq.LJIIJ(new Pair("event_type", "server"), new Pair("api_name", "GetSessionByToken"), new Pair("request_timestamp", String.valueOf(this.LIZJ)), new Pair("duration", String.valueOf(0))), (Map<String, String>) 12));
    }

    public final void LIZIZ(C0X52<BaseResponse<ExchangeTokenResult>> c0x52) {
        C080U next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LIZJ;
        long j2 = 0;
        if (j > 0) {
            j2 = jCurrentTimeMillis - j;
        }
        List<C080U> list = c0x52.LIZ.LIZLLL;
        String str = null;
        if (list != null) {
            Iterator<C080U> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (u.LJIJI(next.LIZ, "x-tt-logid", true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C080U c080u = next;
            if (c080u != null) {
                str = c080u.LIZIZ;
            }
        }
        String string = Integer.valueOf(c0x52.LIZ.LIZIZ).toString();
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("event_type", "server");
        pairArr[1] = new Pair("api_name", "GetSessionByToken");
        pairArr[2] = new Pair("response_timestamp", String.valueOf(jCurrentTimeMillis));
        pairArr[3] = new Pair("response_cost", String.valueOf(j2));
        pairArr[4] = new Pair("duration", String.valueOf(0));
        if (str == null) {
            str = "";
        }
        pairArr[5] = new Pair("logid", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (string != null) {
            mapLJIIJ.put("status_code", string);
        }
        C1714230ui5.LIZLLL(new AwS141S1200000_26(this, (C1713560uh0) "fvs_server_response", (String) mapLJIIJ, (Map<String, String>) 12));
    }

    public C1713560uh0(C1713570uh1 c1713570uh1, String str) {
        this.LIZ = c1713570uh1;
        this.LIZIZ = str;
    }
}
