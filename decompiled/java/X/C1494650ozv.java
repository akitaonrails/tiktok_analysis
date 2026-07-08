package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494650ozv {
    public static volatile int LJI = -1;
    public C1494750p05 LIZ = new C1494750p05();
    public C1494720p02 LIZIZ = new C1494720p02();
    public C1494680ozy LIZJ = new C1494680ozy();
    public C1494810p0B LIZLLL = new C1494810p0B();
    public C1494780p08 LJ = new C1494780p08();
    public String LJFF = "";

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        C1494750p05 c1494750p05 = this.LIZ;
        c1494750p05.getClass();
        JSONObject jSONObject4 = null;
        if ((LJI & 32) == 0) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            jSONObject.put("prp_conn_s", String.valueOf(C1494420ozY.LIZ(c1494750p05.LIZ)));
            jSONObject.put("prp_conn_e", String.valueOf(C1494420ozY.LIZ(c1494750p05.LIZIZ)));
            jSONObject.put("exe_conn_s", String.valueOf(C1494420ozY.LIZ(c1494750p05.LIZJ)));
            jSONObject.put("exe_conn_e", String.valueOf(C1494420ozY.LIZ(c1494750p05.LIZLLL)));
            jSONObject.put("prc_rsp_bdy_s", String.valueOf(C1494420ozY.LIZ(c1494750p05.LJ)));
            jSONObject.put("prc_rsp_bdy_e", String.valueOf(C1494420ozY.LIZ(c1494750p05.LJFF)));
            jSONObject.put("frs_rd_rsp_bdy_s", String.valueOf(C1494420ozY.LIZ(c1494750p05.LJI)));
            jSONObject.put("lst_rd_rsp_bdy_e", String.valueOf(C1494420ozY.LIZ(c1494750p05.LJII)));
        }
        jSONObject3.put("event_ts", jSONObject);
        C1494720p02 c1494720p02 = this.LIZIZ;
        c1494720p02.getClass();
        if ((LJI & 64) == 0) {
            jSONObject2 = null;
        } else {
            jSONObject2 = new JSONObject();
            jSONObject2.put("bdy_encrypt", String.valueOf(C1494420ozY.LIZ(c1494720p02.LIZIZ)));
            jSONObject2.put("on_try_init", String.valueOf(C1494420ozY.LIZ(c1494720p02.LIZJ)));
            jSONObject2.put("init_cookie", String.valueOf(C1494420ozY.LIZ(c1494720p02.LIZLLL)));
            jSONObject2.put("bd_turing", String.valueOf(C1494420ozY.LIZ(c1494720p02.LJ)));
            jSONObject2.put("acnt_rty", String.valueOf(C1494420ozY.LIZ(c1494720p02.LJFF)));
            jSONObject2.put("rot_rty", String.valueOf(C1494420ozY.LIZ(c1494720p02.LJI)));
            jSONObject2.put("wait_rd_rsp_bdy", String.valueOf(C1494420ozY.LIZ(c1494720p02.LJII)));
            jSONObject2.put("rd_rsp_bdy_intvl", String.valueOf(C1494420ozY.LIZ(c1494720p02.LJIIIIZZ)));
            jSONObject2.put("input_stream_prc", String.valueOf(C1494420ozY.LIZ(c1494720p02.LJIIIZ)));
        }
        jSONObject3.put("biz_span", jSONObject2);
        C1494680ozy c1494680ozy = this.LIZJ;
        c1494680ozy.getClass();
        if ((LJI & 128) != 0) {
            jSONObject4 = new JSONObject();
            jSONObject4.put("qry_flt", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LIZIZ)));
            jSONObject4.put("last_cons_conn", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LIZJ)));
            jSONObject4.put("last_conf_conn", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LIZLLL)));
            jSONObject4.put("last_exe_conn", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LJFF)));
            jSONObject4.put("cons_conf_n_rty_conn", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LJI)));
            jSONObject4.put("prc_rsp_bdy", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LJII)));
            jSONObject4.put("post_prc_rsp_bdy", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LJIIIIZZ)));
            jSONObject4.put("total_rd_rsp_bdy", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LJIIIZ)));
            jSONObject4.put("reflect", String.valueOf(C1494420ozY.LIZ(c1494680ozy.LJ)));
        }
        jSONObject3.put("inner_span", jSONObject4);
        this.LJ.getClass();
        jSONObject3.put("misc", new JSONObject());
        return jSONObject3;
    }
}
