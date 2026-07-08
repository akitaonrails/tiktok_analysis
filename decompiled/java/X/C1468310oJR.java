package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1468310oJR {
    public int LIZ = Integer.MIN_VALUE;
    public String LIZIZ = "";
    public String LIZJ = "";
    public long LIZLLL = -2147483648L;
    public int LJ = Integer.MIN_VALUE;
    public int LJFF = Integer.MIN_VALUE;
    public String LJI = "";
    public String LJII = "";
    public long LJIIIIZZ = -2147483648L;
    public long LJIIIZ = -2147483648L;
    public long LJIIJ = -2147483648L;
    public long LJIIJJI = -2147483648L;
    public int LJIIL = Integer.MIN_VALUE;
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public int LJIILLIIL = Integer.MIN_VALUE;
    public int LJIIZILJ = Integer.MIN_VALUE;
    public long LJIJ = -2147483648L;
    public long LJIJI = -2147483648L;
    public long LJIJJ = -2147483648L;
    public int LJIJJLI = Integer.MIN_VALUE;
    public long LJIL = -2147483648L;
    public int LJJ = Integer.MIN_VALUE;

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!jSONObject.isNull("err_code")) {
                this.LJ = ((Number) jSONObject.get("err_code")).intValue();
            }
            if (!jSONObject.isNull("reply_size")) {
                this.LIZLLL = ((Number) jSONObject.get("reply_size")).longValue();
            }
            if (!jSONObject.isNull("cur_host")) {
                this.LIZIZ = jSONObject.get("cur_host").toString();
            }
            if (!jSONObject.isNull("speed")) {
                this.LJFF = ((Number) jSONObject.get("speed")).intValue();
            }
            if (!jSONObject.isNull("cdn_type")) {
                this.LJIJJLI = ((Number) jSONObject.get("cdn_type")).intValue();
            }
            if (!jSONObject.isNull("url")) {
                this.LIZJ = jSONObject.get("url").toString();
            }
            if (!jSONObject.isNull("file_key")) {
                this.LJI = jSONObject.get("file_key").toString();
            }
            if (!jSONObject.isNull("re_url")) {
                this.LJII = jSONObject.get("re_url").toString();
            }
            if (!jSONObject.isNull("end_t")) {
                this.LJIIIIZZ = ((Number) jSONObject.get("end_t")).longValue();
            }
            if (!jSONObject.isNull("dns_t")) {
                this.LJIIIZ = ((Number) jSONObject.get("dns_t")).longValue();
            }
            if (!jSONObject.isNull("tbs")) {
                this.LJIIJ = ((Number) jSONObject.get("tbs")).longValue();
            }
            if (!jSONObject.isNull("lbs")) {
                this.LJIIJJI = ((Number) jSONObject.get("lbs")).longValue();
            }
            if (!jSONObject.isNull("v_p2p_ier")) {
                this.LJIIL = ((Number) jSONObject.get("v_p2p_ier")).intValue();
            }
            if (!jSONObject.isNull("blocked_ip")) {
                this.LJIILIIL = jSONObject.get("blocked_ip").toString();
            }
            if (!jSONObject.isNull("cdn_cache")) {
                this.LJIILJJIL = jSONObject.get("cdn_cache").toString();
            }
            if (!jSONObject.isNull("client_info")) {
                this.LJIILL = jSONObject.get("client_info").toString();
            }
            if (!jSONObject.isNull("disable_seek")) {
                this.LJIILLIIL = ((Number) jSONObject.get("disable_seek")).intValue();
            }
            if (!jSONObject.isNull("mem_buffer_len")) {
                this.LJIIZILJ = ((Number) jSONObject.get("mem_buffer_len")).intValue();
            }
            if (!jSONObject.isNull("disk_buffer_len")) {
                this.LJIJ = ((Number) jSONObject.get("disk_buffer_len")).longValue();
            }
            if (!jSONObject.isNull("send_offset")) {
                this.LJIJI = ((Number) jSONObject.get("send_offset")).longValue();
            }
            if (!jSONObject.isNull("last_req_offset")) {
                this.LJIJJ = ((Number) jSONObject.get("last_req_offset")).longValue();
            }
            if (!jSONObject.isNull("last_read_time")) {
                this.LJIL = ((Number) jSONObject.get("last_read_time")).longValue();
            }
            if (!jSONObject.isNull("downloading")) {
                this.LJJ = ((Number) jSONObject.get("downloading")).intValue();
            }
        }
    }
}
