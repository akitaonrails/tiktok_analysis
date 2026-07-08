package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520340pfM extends C1520560pfi {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public C1520350pfN LJIILIIL;

    public C1520340pfM() {
        super("custom");
    }

    @Override // X.C1520560pfi
    public final String LIZIZ() {
        C1520350pfN c1520350pfN = this.LJIILIIL;
        if (c1520350pfN == null) {
            return "";
        }
        String str = c1520350pfN.LIZIZ;
        return (str == null || !C1520370pfP.LIZ(str)) ? super.LIZIZ() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    @Override // X.C1520560pfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJII() {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1520340pfM.LJII():org.json.JSONObject");
    }

    public final JSONObject LJIIIIZZ() {
        JSONObject jSONObject = new JSONObject();
        C1520350pfN c1520350pfN = this.LJIILIIL;
        C12868051u.LJI(jSONObject, "eventName", c1520350pfN != null ? c1520350pfN.LIZJ : null);
        C12868051u.LJI(jSONObject, "tracing", null);
        JSONObject jSONObject2 = new JSONObject();
        Object[] objArr = new Object[4];
        C1520350pfN c1520350pfN2 = this.LJIILIIL;
        objArr[0] = c1520350pfN2 != null ? c1520350pfN2.LJII : null;
        objArr[1] = c1520350pfN2 != null ? c1520350pfN2.LIZLLL : null;
        objArr[2] = c1520350pfN2 != null ? c1520350pfN2.LJI : null;
        objArr[3] = c1520350pfN2 != null ? c1520350pfN2.LJ : null;
        C12868051u.LJFF(jSONObject2, objArr);
        C12868051u.LJI(jSONObject, "info", jSONObject2);
        return jSONObject;
    }
}
