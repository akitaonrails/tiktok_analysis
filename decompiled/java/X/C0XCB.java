package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XCB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCB extends C0XCG {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public int LJIIL;
    public int LJIILIIL;

    @Override // X.C0XCG
    public final JSONObject LIZ() {
        Object obj;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", this.LIZLLL ? "success" : "fail");
            jSONObject.put("duration", this.LIZIZ - this.LIZ);
            jSONObject.put("time_out", this.LIZJ);
            jSONObject.put("response_doken", this.LJ ? 1 : 0);
            jSONObject.put("response_dtoken_sign", this.LJI ? 1 : 0);
            jSONObject.put("private_key_error_code", this.LJFF ? 0 : -1);
            jSONObject.put("private_key_error_msg", "");
            jSONObject.put("public_key_error_code", this.LJFF ? 0 : -1);
            jSONObject.put("public_key_error_msg", "");
            jSONObject.put("response_error_code", -1);
            jSONObject.put("response_error_msg", "");
            jSONObject.put("logid", this.LJII);
            jSONObject.put("path", this.LJIIIIZZ);
            jSONObject.put("host", this.LJIIIZ);
            jSONObject.put("from_error", this.LJIIJ);
            jSONObject.put("from_scene", this.LJIIJJI);
            jSONObject.put("local_dtoken", this.LJIIL);
            jSONObject.put("local_dtoken_sign", this.LJIILIIL);
            C189200o6.m2constructorimpl(jSONObject);
            obj = jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object jSONObject2 = obj;
        if (thM5exceptionOrNullimpl != null) {
            jSONObject2 = new JSONObject();
        }
        return (JSONObject) jSONObject2;
    }

    @Override // X.C0XCG
    public final void LIZJ() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJI = false;
        this.LJFF = false;
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = 0;
        this.LJIILIIL = 0;
    }
}
