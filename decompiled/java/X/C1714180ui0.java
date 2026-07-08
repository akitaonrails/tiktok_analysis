package X;

import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ui0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714180ui0 {
    public final C1713570uh1 LIZ;
    public final String LIZIZ;
    public volatile long LIZJ;
    public volatile long LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile long LJI;
    public volatile long LJII;
    public volatile String LJIIIIZZ = "init";
    public volatile String LJIIIZ = "init";
    public volatile String LJIIJ;
    public volatile String LJIIJJI;
    public volatile String LJIIL;
    public volatile String LJIILIIL;
    public volatile String LJIILJJIL;

    public final void LIZIZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 0;
        if (this.LIZLLL > 0) {
            j = jCurrentTimeMillis - this.LIZLLL;
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "click"), new Pair("button_id", str), new Pair("click_duration", String.valueOf(j)));
        if (Intrinsics.LJFF(str, "resend_code")) {
            this.LJII++;
            mapLJIIJ.put("resend_count", String.valueOf(this.LJII));
        }
        LIZ("fvs_button_click", mapLJIIJ);
    }

    public final <T> void LIZJ(C0X52<BaseResponse<T>> c0x52) {
        long j;
        String string;
        List<C080U> list;
        C080U next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = 0;
        if (this.LJI > 0) {
            j = jCurrentTimeMillis - this.LJI;
        } else {
            j = 0;
        }
        if (this.LIZLLL > 0) {
            j2 = jCurrentTimeMillis - this.LIZLLL;
        }
        String str = null;
        if (c0x52 != null) {
            string = Integer.valueOf(c0x52.LIZ.LIZIZ).toString();
        } else {
            string = null;
        }
        if (c0x52 != null && (list = c0x52.LIZ.LIZLLL) != null) {
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
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("event_type", "server");
        pairArr[1] = new Pair("api_name", "GetPublicKey");
        pairArr[2] = new Pair("response_timestamp", String.valueOf(jCurrentTimeMillis));
        pairArr[3] = new Pair("response_cost", String.valueOf(j));
        pairArr[4] = new Pair("duration", String.valueOf(j2));
        if (str == null) {
            str = "";
        }
        pairArr[5] = new Pair("logid", str);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (string != null) {
            mapLJIIJ.put("status_code", string);
        }
        LIZ("fvs_server_response", mapLJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(Map map) {
        this.LJ = System.currentTimeMillis();
        long j = 0;
        if (this.LIZLLL > 0) {
            j = this.LJ - this.LIZLLL;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "click"), new Pair("input_id", "code_input"), new Pair("click_duration", String.valueOf(j)));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                mapLJIIJ.put(entry.getKey(), entry.getValue());
            }
        }
        LIZ("fvs_input_click", mapLJIIJ);
    }

    public final void LJFF(String str) {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "leave"), new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LIZJ)), new Pair("leave_type", str));
        String str2 = this.LJIIIIZZ;
        if (str2 != null) {
            mapLJIIJ.put("verify_result", str2);
        }
        String str3 = this.LJIIIZ;
        if (str3 != null) {
            mapLJIIJ.put("verify_status", str3);
        }
        String str4 = this.LJIIJJI;
        if (str4 != null) {
            mapLJIIJ.put("verify_error_code", str4);
        }
        LIZ("fvs_page_leave", mapLJIIJ);
    }

    public final void LJI(Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZJ = jCurrentTimeMillis;
        long j = 0;
        if (this.LIZLLL > 0) {
            j = jCurrentTimeMillis - this.LIZLLL;
        }
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("event_type", "show"), new Pair("render_cost", String.valueOf(j)));
        if (map != null) {
            mapLJIIIIZZ = C2097608Jq.LJIIL(mapLJIIIIZZ, map);
        }
        LIZ("fvs_page_show", mapLJIIIIZZ);
    }

    public final void LJIIIIZZ(String str) {
        this.LJFF = System.currentTimeMillis();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("popup_id", str));
        String str2 = this.LJIIJJI;
        if (str2 != null) {
            mapLJIIJ.put("error_code", str2);
        }
        String str3 = this.LJIIL;
        if (str3 != null) {
            mapLJIIJ.put("error_message", str3);
        }
        LIZ("fvs_popup_show", mapLJIIJ);
    }

    public final void LJIIIZ(String str) {
        this.LJI = System.currentTimeMillis();
        long j = 0;
        if (this.LIZLLL > 0) {
            j = this.LJI - this.LIZLLL;
        }
        LIZ("fvs_server_request", C2097608Jq.LJIIJ(new Pair("event_type", "server"), new Pair("api_name", str), new Pair("request_timestamp", String.valueOf(this.LJI)), new Pair("duration", String.valueOf(j))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.C0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.verify.base.model.response.DoVerifyResponse>> r12) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714180ui0.LJIIJ(X.0X52):void");
    }

    public C1714180ui0(C1713570uh1 c1713570uh1, String str) {
        this.LIZ = c1713570uh1;
        this.LIZIZ = str;
    }

    public final void LIZ(String str, Map<String, String> map) {
        C1714230ui5.LIZLLL(new AwS141S1200000_26(this, (C1714180ui0) str, (String) map, (Map<String, String>) 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(String str, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 0;
        if (this.LJ > 0) {
            j = jCurrentTimeMillis - this.LJ;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "fillin"), new Pair("input_id", "code_input"), new Pair("fillin_duration", String.valueOf(j)), new Pair("fill_type", str), new Pair("is_verification_exist", "1"));
        if (!C123100dR.LIZ(this.LJIIJ) && !Intrinsics.LJFF(this.LJIIIZ, "failed")) {
            if (Intrinsics.LJFF(this.LJIIIZ, "pass") || Intrinsics.LJFF(this.LJIIIZ, "processing")) {
                mapLJIIJ.put("verification_status", "pass");
            }
        } else {
            mapLJIIJ.put("verification_status", "fail");
            String str2 = this.LJIIJ;
            if (str2 != null) {
                mapLJIIJ.put("verification_err_msg", str2);
            }
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                mapLJIIJ.put(entry.getKey(), entry.getValue());
            }
        }
        LIZ("fvs_input_fillin", mapLJIIJ);
    }

    public final void LJII(String str, String str2) {
        long jCurrentTimeMillis = 0;
        if (this.LJFF > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "click"), new Pair("popup_id", str), new Pair("button_id", str2), new Pair("click_duration", String.valueOf(jCurrentTimeMillis)));
        String str3 = this.LJIIJJI;
        if (str3 != null) {
            mapLJIIJ.put("error_code", str3);
        }
        String str4 = this.LJIIL;
        if (str4 != null) {
            mapLJIIJ.put("error_message", str4);
        }
        LIZ("fvs_popup_click", mapLJIIJ);
    }
}
