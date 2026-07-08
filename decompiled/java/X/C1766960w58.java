package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766960w58 extends C1766940w56 {
    public static final /* synthetic */ int LJIIL = 0;
    public JSONObject LJIIJ;
    public JSONObject LJIIJJI;

    @Override // X.C1766940w56
    public final JSONObject LIZ() {
        JSONObject jSONObjectLIZ = super.LIZ();
        try {
            if (this.LJIIJ != null || this.LJIIJJI != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("page", this.LJIIJ);
                    jSONObject.put("unit", this.LJIIJJI);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                jSONObjectLIZ.put("content", jSONObject);
                return jSONObjectLIZ;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return jSONObjectLIZ;
    }

    public C1766960w58(C1766940w56 c1766940w56) {
        super(c1766940w56.LIZ, c1766940w56.LIZIZ, c1766940w56.LIZJ, c1766940w56.LIZLLL, c1766940w56.LJ, c1766940w56.LJFF, c1766940w56.LJI, c1766940w56.LJII);
    }
}
