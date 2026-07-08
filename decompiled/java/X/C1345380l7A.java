package X;

import defpackage.d1;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345380l7A extends C1345390l7B {
    public boolean LJIJJ;
    public Boolean LJIJJLI;
    public long LJIL;
    public long LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public EnumC2010207u8 LJJII;
    public final d1 LJJIII;
    public int LJJIIJ;

    public static long LJ(long j, long j2) {
        if (j <= -1 || j2 <= -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    public C1345380l7A() {
        EnumC2010207u8 enumC2010207u8 = EnumC2010207u8.NONE;
        d1 d1Var = new d1("CommentPageLoadPerfEventV2");
        super("comment_page_load_time_v3");
        this.LJIJJ = true;
        this.LJIJJLI = null;
        this.LJIL = -1L;
        this.LJJ = -1L;
        this.LJJI = false;
        this.LJJIFFI = false;
        this.LJJII = enumC2010207u8;
        this.LJJIII = d1Var;
        this.LJJIIJ = 0;
    }

    @Override // X.C1345390l7B, X.AbstractC1345440l7G
    public final boolean LIZ() {
        if (this.LIZ.length() <= 0 || this.LIZJ <= 0) {
            return false;
        }
        return this.LJIL > 0 || this.LJJIFFI;
    }

    @Override // X.C1345390l7B, X.AbstractC1345440l7G
    public final JSONObject LIZJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_load_to_data_bind", LJ(this.LIZJ, this.LJIILL));
        jSONObject.put("page_load_to_first_frame", LJ(this.LIZJ, this.LJIILLIIL));
        jSONObject.put("first_frame_to_data_bind", LJ(this.LJIILLIIL, this.LJIILL));
        jSONObject.put("page_load_to_page_create_view", LJ(this.LIZJ, this.LIZLLL));
        jSONObject.put("page_create_view_duration", LJ(this.LIZLLL, this.LJ));
        jSONObject.put("page_view_inflate_duration", LJ(this.LJFF, this.LJI));
        jSONObject.put("page_view_created_duration", LJ(this.LJII, this.LJIIIIZZ));
        jSONObject.put("list_create_view_duration", LJ(this.LJIIIZ, this.LJIIJ));
        jSONObject.put("list_view_created_duration", LJ(this.LJIIJJI, this.LJIIL));
        jSONObject.put("list_activity_created_duration", LJ(this.LJIILIIL, this.LJIILJJIL));
        jSONObject.put("list_activity_created_to_first_frame", LJ(this.LJIILJJIL, this.LJIILLIIL));
        jSONObject.put("is_first_show", this.LJIJJ);
        jSONObject.put("result", this.LJIJJLI);
        jSONObject.put("duration_before_network", LJ(this.LIZJ, this.LJIL));
        jSONObject.put("duration_network", LJ(this.LJIL, this.LJJ));
        for (Map.Entry entry : ((LinkedHashMap) this.LJJIII.LIZJ()).entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        jSONObject.put("hit_cache_type", this.LJJIII.LIZLLL);
        jSONObject.put("duration_after_network", LJ(this.LJJ, this.LJIILL));
        jSONObject.put("is_poor_network", this.LJJI);
        jSONObject.put("is_preload", this.LJJII.getValue());
        if (this.LIZ.length() > 0) {
            jSONObject.put("enter_from", this.LIZIZ);
        }
        jSONObject.put("list_count", this.LJIIZILJ);
        jSONObject.put("is_pre_create", this.LJIJ);
        jSONObject.put("is_prebind", this.LJJIFFI);
        jSONObject.put("req_count", this.LJJIIJ);
        return jSONObject;
    }

    @Override // X.C1345390l7B, X.AbstractC1345440l7G
    public final void LIZIZ() {
        super.LIZIZ();
        this.LJIJJ = true;
        this.LJIJJLI = null;
        this.LJIL = -1L;
        this.LJJ = -1L;
        this.LIZJ = -1L;
        this.LJJI = false;
        this.LJJII = EnumC2010207u8.NONE;
        d1 d1Var = this.LJJIII;
        d1Var.LIZIZ.clear();
        d1Var.LIZJ.clear();
        d1Var.LIZLLL = 0;
        this.LJJIIJ = 0;
    }
}
