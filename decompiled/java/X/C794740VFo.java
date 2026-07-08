package X;

import Y.ARunnableS113S0100000_13;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794740VFo implements InterfaceC794770VFr, InterfaceC794710VFl {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public String LJ;
    public final AbstractC794540VEu LJFF;
    public String LJI;
    public Map<String, String> LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public C794750VFp LJIIJJI;

    public final JSONObject LJII() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.LIZIZ);
            jSONObject.put("span_id", this.LIZJ);
            jSONObject.put("operation_name", this.LIZ);
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                jSONObject.put("parent_id", this.LIZLLL);
            }
            if (!TextUtils.isEmpty(this.LJ)) {
                jSONObject.put("reference_id", this.LJ);
            }
            jSONObject.put("start_timestamp", this.LJIIIZ);
            jSONObject.put("finish_timestamp", this.LJIIJ);
            Map<String, String> map = this.LJII;
            if (map != null && !((HashMap) map).isEmpty()) {
                jSONObject.put("tags", new JSONObject(this.LJII));
            }
            if (!C2106708Nd.LIZ(null)) {
                new JSONArray();
                throw null;
            }
            jSONObject.put("thread_id", this.LJI);
            jSONObject.put("is_finished", 1);
            C794750VFp c794750VFp = this.LJIIJJI;
            if (c794750VFp != null) {
                jSONObject.put("movingline", c794750VFp.LIZ());
            }
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC794700VFk
    public final String LIZIZ() {
        AbstractC794540VEu abstractC794540VEu = this.LJFF;
        C794620VFc c794620VFc = abstractC794540VEu.LIZJ;
        String str = c794620VFc.LIZJ;
        String strJ4 = C786410Ut5.j4("%02x", new Object[]{Byte.valueOf(c794620VFc.LJFF ? (byte) 1 : C792750V7x.LIZIZ().LIZJ(abstractC794540VEu.LIZJ.LIZ, this.LJIIIIZZ))});
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("03");
        sbLIZ.append("-");
        sbLIZ.append(str);
        sbLIZ.append("-");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("-");
        sbLIZ.append(strJ4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJI() {
        String str = this.LJI;
        if (str == null || str.isEmpty()) {
            this.LJI = C786410Ut5.u3().getName();
        }
        this.LJIIJ = System.currentTimeMillis();
        C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(this, 253));
    }

    @Override // X.InterfaceC794700VFk
    public final String LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC794700VFk
    public final String LJIJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC794700VFk
    public final C794740VFo LIZLLL(String str) {
        this.LJ = str;
        return this;
    }

    @Override // X.InterfaceC794700VFk
    public final void LJ(C794750VFp c794750VFp) {
        this.LJIIJJI = c794750VFp;
    }

    @Override // X.InterfaceC794700VFk
    public final C794740VFo LJFF(String str) {
        this.LIZLLL = str;
        return this;
    }

    @Override // X.InterfaceC794710VFl
    public final void LIZ(long j, long j2) {
        String str = this.LJI;
        if (str == null || str.isEmpty()) {
            this.LJI = C786410Ut5.u3().getName();
        }
        this.LJIIIZ = j;
        this.LJIIJ = j2;
        C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(this, 252));
    }

    public C794740VFo(String str, AbstractC794540VEu abstractC794540VEu, long j) {
        this.LIZ = str;
        this.LJFF = abstractC794540VEu;
        this.LIZIZ = "tracer_window_span";
        this.LIZJ = C786410Ut5.j4("%016x", new Object[]{Long.valueOf(j)});
    }

    public C794740VFo(String str, String str2, AbstractC794540VEu abstractC794540VEu) {
        String strLIZ = C794830VFx.LIZ();
        this.LIZ = str;
        this.LJFF = abstractC794540VEu;
        this.LIZIZ = str2;
        this.LIZJ = strLIZ;
    }
}
