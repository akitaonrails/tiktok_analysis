package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903890zdz {
    public final C1903960ze6 LIZ;
    public final C1903960ze6 LIZIZ;
    public final C1903960ze6 LIZJ;
    public final C1903960ze6 LIZLLL;
    public final C1903960ze6 LJ;
    public final C1903960ze6 LJFF;
    public final C1903960ze6 LJI;

    public C1903890zdz() {
        C1903960ze6 c1903960ze6 = C1903960ze6.LIZJ;
        this.LIZ = c1903960ze6;
        this.LIZIZ = c1903960ze6;
        this.LIZJ = c1903960ze6;
        this.LIZLLL = c1903960ze6;
        this.LJ = c1903960ze6;
        this.LJFF = c1903960ze6;
        this.LJI = c1903960ze6;
    }

    public final void LIZ(JSONObject jSONObject) {
        try {
            C1903960ze6 c1903960ze6 = this.LIZ;
            jSONObject.put("life_attach", c1903960ze6.LIZIZ - c1903960ze6.LIZ);
            C1903960ze6 c1903960ze62 = this.LIZIZ;
            jSONObject.put("life_create", c1903960ze62.LIZIZ - c1903960ze62.LIZ);
            C1903960ze6 c1903960ze63 = this.LIZJ;
            jSONObject.put("life_create_view", c1903960ze63.LIZIZ - c1903960ze63.LIZ);
            C1903960ze6 c1903960ze64 = this.LIZLLL;
            jSONObject.put("life_view_created", c1903960ze64.LIZIZ - c1903960ze64.LIZ);
            C1903960ze6 c1903960ze65 = this.LJ;
            jSONObject.put("life_activity_created", c1903960ze65.LIZIZ - c1903960ze65.LIZ);
            C1903960ze6 c1903960ze66 = this.LJFF;
            jSONObject.put("life_start", c1903960ze66.LIZIZ - c1903960ze66.LIZ);
            C1903960ze6 c1903960ze67 = this.LJI;
            C189200o6.m2constructorimpl(jSONObject.put("life_resume", c1903960ze67.LIZIZ - c1903960ze67.LIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
