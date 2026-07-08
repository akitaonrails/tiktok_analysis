package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1520360pfO {
    public String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;
    public JSONObject LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public EnumC993170bx5 LJIIJJI;
    public InterfaceC1520860pgC LJIIL;

    public final C1520350pfN LIZ() {
        C1520350pfN c1520350pfN = new C1520350pfN();
        c1520350pfN.LIZJ = this.LIZJ;
        c1520350pfN.LJIIIZ = this.LJIIJJI;
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        c1520350pfN.LIZ = str;
        String str2 = this.LIZIZ;
        c1520350pfN.LIZIZ = str2 != null ? str2 : "";
        JSONObject jSONObject = this.LIZLLL;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c1520350pfN.LIZLLL = jSONObject;
        JSONObject jSONObject2 = this.LJ;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        c1520350pfN.LJ = jSONObject2;
        JSONObject jSONObject3 = this.LJFF;
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        c1520350pfN.LJFF = jSONObject3;
        c1520350pfN.LJIIJJI = this.LJIIJ;
        JSONObject jSONObject4 = this.LJI;
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        this.LJI = jSONObject4;
        c1520350pfN.LJI = jSONObject4;
        JSONObject jSONObject5 = this.LJII;
        if (jSONObject5 == null) {
            jSONObject5 = new JSONObject();
        }
        c1520350pfN.LJII = jSONObject5;
        c1520350pfN.LJIIJ = this.LJIIIZ;
        c1520350pfN.LJIIIIZZ = this.LJIIIIZZ;
        InterfaceC1520860pgC interfaceC1520860pgC = this.LJIIL;
        if (interfaceC1520860pgC == null) {
            C1520380pfQ.LIZ.getClass();
            interfaceC1520860pgC = C1520380pfQ.LJ.LIZ;
        }
        c1520350pfN.LJIIL = interfaceC1520860pgC;
        return c1520350pfN;
    }

    public C1520360pfO(String str) {
        this.LIZJ = str;
    }

    public final void LIZIZ(int i) {
        if (i < 0 || i > 8) {
            i = 8;
        }
        this.LJIIJ = i;
    }
}
