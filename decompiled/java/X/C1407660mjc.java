package X;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407660mjc implements InterfaceC1411260mpQ {
    public static boolean LIZJ;
    public final InterfaceC1650230t2r LIZ;
    public final Context LIZIZ;

    @Override // X.InterfaceC1411260mpQ
    public final String LIZIZ() {
        return "GUITAR";
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC1411260mpQ
    public final InterfaceC1650230t2r getCameraApiComponent() {
        return this.LIZ;
    }

    public C1407660mjc(InterfaceC1650230t2r interfaceC1650230t2r, Context context) {
        this.LIZ = interfaceC1650230t2r;
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC1411260mpQ
    public final void LIZ(int i, String str) {
        C1367960lha.LIZ.getClass();
        if (!C1367960lha.LIZ().LJZL(this.LIZIZ)) {
            C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(LJ(0.0d, 0.0d, 1)));
        } else if (!C1367960lha.LIZ().LJJLI(this.LIZIZ)) {
            C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(LJ(0.0d, 0.0d, 2)));
        } else {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1407630mjZ(this, i, null), 3);
        }
    }

    public static JSONObject LJ(double d, double d2, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", "GUITAR");
        jSONObject.put("permission", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("long_data", d);
        jSONObject2.put("lati_data", d2);
        jSONObject.put("body", jSONObject2);
        return jSONObject;
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZJ(int i, int i2, int i3, String str) {
        return C1411250mpP.LIZ(this, i, i2, i3, str);
    }
}
