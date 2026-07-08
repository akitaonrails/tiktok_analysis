package X;

import com.lynx.tasm.LynxEnv;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ph5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521410ph5 extends C1521090pgZ {
    public int LJIIL;
    public String LJIILIIL = "";
    public final String LJIILJJIL = LynxEnv.inst().getLynxVersion();

    public C1521410ph5() {
        this.LIZJ = "lynx";
    }

    @Override // X.C1521090pgZ, X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        super.LIZ(jSONObject);
        C1520640pfq.LJIIJJI(this.LJIIL, "template_state", jSONObject);
        C1520640pfq.LJIILIIL("lynx_version", this.LJIILJJIL, jSONObject);
        C1520640pfq.LJIILIIL("page_version", this.LJIILIIL, jSONObject);
    }
}
