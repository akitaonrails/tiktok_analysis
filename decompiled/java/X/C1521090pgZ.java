package X;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1521090pgZ extends AbstractC1520070pev {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJ;
    public String LJFF;
    public JSONObject LJI;
    public final JSONObject LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public final List<String> LJIIJJI;

    public C1521090pgZ() {
        this.LIZIZ = C08HX.LJIIIIZZ();
        this.LIZJ = "unknown";
        this.LIZLLL = "";
        this.LJ = 0L;
        this.LJFF = "";
        this.LJI = new JSONObject();
        this.LJII = new JSONObject();
        this.LJIIJ = false;
        this.LJIIJJI = C1918807fO.LIZ;
    }

    public C1521090pgZ(int i) {
        this.LIZIZ = C08HX.LJIIIIZZ();
        this.LIZJ = "unknown";
        this.LIZLLL = "";
        this.LJ = 0L;
        this.LJFF = "";
        this.LJI = new JSONObject();
        this.LJII = new JSONObject();
        this.LJIIJ = false;
        this.LJIIJJI = C1918807fO.LIZ;
        this.LIZ = "";
        this.LIZJ = "web";
    }

    @Override // X.AbstractC1520070pev
    public void LIZ(JSONObject jSONObject) {
        C1520640pfq.LJIILIIL("navigation_id", this.LIZIZ, jSONObject);
        C1520640pfq.LJIILIIL("url", this.LIZ, jSONObject);
        C1520640pfq.LJIILIIL("container_type", this.LIZJ, jSONObject);
        C1520640pfq.LJIILIIL("native_page", this.LIZLLL, jSONObject);
        C1520640pfq.LJIILIIL("sdk_version", "1.0-tiktok-monorepo", jSONObject);
        C1520640pfq.LJIILIIL("virtual_aid", this.LJFF, jSONObject);
        C1520640pfq.LJIILJJIL(jSONObject, "context", this.LJI);
        C1520640pfq.LJIILIIL("sdk_version", "1.0-tiktok-monorepo", jSONObject);
        C1520640pfq.LJIILJJIL(jSONObject, "debug_context", this.LJII);
        long j = this.LJIIIIZZ;
        if (j != 0) {
            C1520640pfq.LJIIL("attach_ts", j, jSONObject);
        }
        long j2 = this.LJIIIZ;
        if (j2 != 0) {
            C1520640pfq.LJIIL("detach_ts", j2, jSONObject);
        }
        C1520640pfq.LJIILJJIL(jSONObject, "container_reuse", Boolean.valueOf(this.LJIIJ));
        C1520640pfq.LJIILIIL("monitor_package", "monitorV2", this.LJII);
        if (EnumC1521240pgo.vidReport.isEnabled()) {
            C1520640pfq.LJIILJJIL(jSONObject, "vids", new JSONArray((Collection) this.LJIIJJI));
        }
    }

    public final void LIZJ(Object obj, String str) {
        if (this.LJI == null) {
            this.LJI = new JSONObject();
        }
        C1520640pfq.LJIILIIL(str, String.valueOf(obj), this.LJI);
    }
}
