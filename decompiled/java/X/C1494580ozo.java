package X;

import java.util.ArrayDeque;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494580ozo {
    public static volatile int LJFF = -1;
    public C1494700p00 LIZ = new C1494700p00();
    public C1494710p01 LIZIZ = new C1494710p01();
    public C1494670ozx LIZJ = new C1494670ozx();
    public C1494770p07 LIZLLL = new C1494770p07();
    public C1494740p04 LJ = new C1494740p04();

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        long jLIZ;
        JSONObject jSONObject5 = new JSONObject();
        C1494700p00 c1494700p00 = this.LIZ;
        c1494700p00.getClass();
        if ((LJFF & 1) == 0) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            jSONObject.put("app_start", String.valueOf(C1494420ozY.LIZ(c1494700p00.LIZ)));
            jSONObject.put("app_start_wc", String.valueOf(c1494700p00.LIZIZ));
            jSONObject.put("cronet_init_s", String.valueOf(C1494420ozY.LIZ(c1494700p00.LIZJ)));
            jSONObject.put("cronet_init_e", String.valueOf(C1494420ozY.LIZ(c1494700p00.LIZLLL)));
            jSONObject.put("create_hcall_s_wc", String.valueOf(c1494700p00.LJ));
            jSONObject.put("create_hcall_s", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJFF)));
            jSONObject.put("create_hcall_e", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJI)));
            jSONObject.put("hcall_api_s", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIIJ)));
            jSONObject.put("hcall_api_s_ws", String.valueOf(c1494700p00.LJIIJJI));
            jSONObject.put("hcall_api_e", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIIL)));
            jSONObject.put("req_real_s", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIIIZ)));
            jSONObject.put("req_itcpt_s", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIILIIL)));
            jSONObject.put("req_itcpt_e", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIILJJIL)));
            jSONObject.put("sscall_s", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIILL)));
            jSONObject.put("sscall_e", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIILLIIL)));
            jSONObject.put("rsp_itcpt_s", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIIZILJ)));
            jSONObject.put("rsp_itcpt_e", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIJ)));
            jSONObject.put("biz_rcv_rsp_hdr_wc", String.valueOf(c1494700p00.LJIJJ));
            jSONObject.put("biz_rcv_rsp_hdr", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIJI)));
            jSONObject.put("req_e_wc", String.valueOf(c1494700p00.LJIL));
            jSONObject.put("req_e", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJIJJLI)));
            jSONObject.put("log_rpt", String.valueOf(C1494420ozY.LIZ(c1494700p00.LJJ)));
        }
        jSONObject5.put("event_ts", jSONObject);
        C1494710p01 c1494710p01 = this.LIZIZ;
        c1494710p01.getClass();
        if ((LJFF & 2) == 0) {
            jSONObject2 = null;
        } else {
            jSONObject2 = new JSONObject();
            jSONObject2.put("wait_hcall_exe", String.valueOf(C1494420ozY.LIZ(c1494710p01.LIZIZ)));
            jSONObject2.put("mon_http_bfr_flt", String.valueOf(C1494420ozY.LIZ(c1494710p01.LIZJ)));
            jSONObject2.put("flt_url", String.valueOf(C1494420ozY.LIZ(c1494710p01.LIZLLL)));
            jSONObject2.put("mon_http_aft_flt", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJ)));
            jSONObject2.put("add_com_prm", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJFF)));
            jSONObject2.put("encrypt_req", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJI)));
            jSONObject2.put("req_vfy", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJII)));
            jSONObject2.put("cmd_lst", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJIIIIZZ)));
            jSONObject2.put("chk_req_tkt", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJIIIZ)));
            jSONObject2.put("post_cdn_cache_vfy", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJIIJ)));
            jSONObject2.put("biz_req_itcpt", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJIIJJI)));
            jSONObject2.put("biz_rsp_itcpt", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJIIL)));
            jSONObject2.put("hcall_async_cb", String.valueOf(C1494420ozY.LIZ(c1494710p01.LJIILIIL)));
        }
        jSONObject5.put("biz_span", jSONObject2);
        C1494670ozx c1494670ozx = this.LIZJ;
        c1494670ozx.getClass();
        if ((LJFF & 4) == 0) {
            jSONObject3 = null;
        } else {
            jSONObject3 = new JSONObject();
            jSONObject3.put("crt_req_fact", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LIZIZ)));
            jSONObject3.put("crt_http_svc_meth", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LIZJ)));
            jSONObject3.put("to_retrofit_req", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LIZLLL)));
            jSONObject3.put("req_delay", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LJ)));
            jSONObject3.put("flt_dup_qry", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LJFF)));
            jSONObject3.put("gen_req_tkt", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LJI)));
            jSONObject3.put("pre_cdn_cache_vrf", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LJII)));
            jSONObject3.put("add_cli_key", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LJIIIIZZ)));
            jSONObject3.put("to_ss_rsp", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LJIIIZ)));
            jSONObject3.put("upd_cli_key", String.valueOf(C1494420ozY.LIZ(c1494670ozx.LJIIJ)));
        }
        jSONObject5.put("inner_span", jSONObject3);
        if ((LJFF & 8) != 0) {
            C1494770p07 c1494770p07 = this.LIZLLL;
            c1494770p07.getClass();
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            new HashMap();
            long j = 0;
            long j2 = 0;
            for (C1494760p06 c1494760p06 : (ArrayDeque) c1494770p07.LIZIZ) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("name", c1494760p06.LIZ);
                long j3 = c1494760p06.LIZJ;
                long j4 = c1494760p06.LIZLLL;
                long jLIZ2 = -1;
                if (j3 == -1 || j4 == -1 || j3 > j4) {
                    jLIZ = -1;
                } else {
                    jLIZ = C1494420ozY.LIZ(j4 - j3);
                    if (jLIZ > 0) {
                        j += jLIZ;
                    }
                }
                jSONObject7.put("req", jLIZ);
                long j5 = c1494760p06.LJ;
                long j6 = c1494760p06.LJFF;
                if (j5 != -1 && j6 != -1 && j5 <= j6) {
                    jLIZ2 = C1494420ozY.LIZ(j6 - j5);
                }
                if (jLIZ2 > 0) {
                    j2 += jLIZ2;
                }
                jSONObject7.put("rsp", jLIZ2);
                String str = c1494760p06.LJI;
                if (str != null) {
                    jSONObject7.put("ex", str);
                }
                jSONArray.put(jSONObject7);
            }
            jSONObject6.put("detail", jSONArray);
            jSONObject6.put("req_total", j);
            jSONObject6.put("rsp_total", j2);
            jSONObject5.put("intcptr", jSONObject6);
        }
        C1494740p04 c1494740p04 = this.LJ;
        c1494740p04.getClass();
        if ((LJFF & 16) == 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = new JSONObject();
            jSONObject4.put("call_svr_times", c1494740p04.LIZIZ);
            jSONObject4.put("app_rsm_ssp_req_s", c1494740p04.LJ);
            jSONObject4.put("app_rsm_ssp_req_e", c1494740p04.LJFF);
        }
        jSONObject5.put("misc", jSONObject4);
        return jSONObject5;
    }

    public C1494580ozo() {
        InterfaceC1494880p0I interfaceC1494880p0I = C1494570ozn.LJLJL;
        if (interfaceC1494880p0I != null) {
            this.LIZ.LIZ = interfaceC1494880p0I.LIZ();
            this.LIZ.LIZIZ = C1494570ozn.LJLJL.LJIILJJIL();
        }
    }
}
