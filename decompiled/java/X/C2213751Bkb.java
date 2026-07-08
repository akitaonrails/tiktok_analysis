package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS435S0200000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bkb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213751Bkb extends AbstractC2213971Bkx {
    public static final /* synthetic */ int LJIIJJI = 0;
    public String LIZ;
    public String LIZIZ;
    public String LIZLLL;
    public Long LJ;
    public Long LJI;
    public String LJII;
    public Long LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public int LIZJ = C204536151q.LIZ(EnumC2213771Bkd.TTMStateCodeSuccess);
    public final int LJFF = 1;

    public final void LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("e_code", this.LIZJ);
        String str = this.LIZ;
        if (str != null) {
            jSONObject.put("es_key", str);
        }
        String str2 = this.LIZIZ;
        if (str2 != null) {
            jSONObject.put("esg_key", str2);
        }
        String str3 = this.LIZLLL;
        if (str3 != null) {
            jSONObject.put("e_message", str3);
        }
        Long l = this.LJI;
        if (l != null) {
            jSONObject.put("db_file_memory_cost", l.longValue());
        }
        jSONObject.put("e_type", this.LJFF);
        Long l2 = this.LJ;
        if (l2 != null) {
            jSONObject.put("sc_bind_event_const", l2.longValue());
        }
        String str4 = this.LJII;
        if (str4 != null) {
            jSONObject.put("est_key", str4);
        }
        Long l3 = this.LJIIIIZZ;
        if (l3 != null) {
            jSONObject.put("sc_get_scene_const", l3.longValue());
        }
        jSONObject.put("psp_center_init_time", this.LJIIJ);
        jSONObject.put("db_code", this.LJIIIZ);
        try {
            new AwS435S0200000_34(EnumC1153320g7O.CENTER_INFO, jSONObject, 11).invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
