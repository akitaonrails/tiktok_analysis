package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1345390l7B extends AbstractC1345440l7G {
    public String LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public EnumC1342450l2R LJIJI;

    public static final long LIZLLL(long j, long j2) {
        if (j <= -1 || j2 <= -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    @Override // X.AbstractC1345440l7G
    public boolean LIZ() {
        if (this.LIZ.length() <= 0 || this.LIZJ <= 0) {
            return false;
        }
        return (this.LJIILLIIL > 0 && this.LJIILL > 0) || this.LJIJ;
    }

    @Override // X.AbstractC1345440l7G
    public void LIZIZ() {
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        this.LJIILL = -1L;
        this.LJIILLIIL = -1L;
        this.LJIJ = false;
    }

    @Override // X.AbstractC1345440l7G
    public JSONObject LIZJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_load_to_data_bind", LIZLLL(this.LIZJ, this.LJIILL));
        jSONObject.put("page_load_to_first_frame", LIZLLL(this.LIZJ, this.LJIILLIIL));
        jSONObject.put("first_frame_to_data_bind", LIZLLL(this.LJIILLIIL, this.LJIILL));
        jSONObject.put("page_load_to_page_create_view", LIZLLL(this.LIZJ, this.LIZLLL));
        jSONObject.put("page_create_view_duration", LIZLLL(this.LIZLLL, this.LJ));
        jSONObject.put("page_view_inflate_duration", LIZLLL(this.LJFF, this.LJI));
        jSONObject.put("page_view_created_duration", LIZLLL(this.LJII, this.LJIIIIZZ));
        jSONObject.put("list_create_view_duration", LIZLLL(this.LJIIIZ, this.LJIIJ));
        jSONObject.put("list_view_created_duration", LIZLLL(this.LJIIJJI, this.LJIIL));
        jSONObject.put("list_activity_created_duration", LIZLLL(this.LJIILIIL, this.LJIILJJIL));
        jSONObject.put("list_activity_created_to_first_frame", LIZLLL(this.LJIILJJIL, this.LJIILLIIL));
        if (this.LIZ.length() > 0) {
            jSONObject.put("enter_from", this.LIZIZ);
        }
        jSONObject.put("list_count", this.LJIIZILJ);
        jSONObject.put("is_pre_create", this.LJIJ);
        jSONObject.put("sort_type", C1342490l2V.LIZ(this.LJIJI));
        return jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345390l7B(String str) {
        super(str);
        EnumC1342450l2R enumC1342450l2R = EnumC1342450l2R.DEFAULT_SORT;
        this.LIZIZ = "";
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        this.LJIILL = -1L;
        this.LJIILLIIL = -1L;
        this.LJIIZILJ = 0;
        this.LJIJ = false;
        this.LJIJI = enumC1342450l2R;
    }
}
