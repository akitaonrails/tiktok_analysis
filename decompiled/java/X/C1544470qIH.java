package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544470qIH extends AbstractC1544480qII<JSONObject> {
    public final EnumC1543740qH6 LIZJ;
    public InterfaceC634840OvC LIZLLL;
    public final C1549590qQX LJ;

    @Override // X.AbstractC1544480qII
    public final EnumC1063300dmC LIZ() {
        EnumC1543740qH6 enumC1543740qH6 = this.LIZJ;
        return enumC1543740qH6 == EnumC1543740qH6.SDUI ? EnumC1063300dmC.SDUI : enumC1543740qH6 == EnumC1543740qH6.NATIVEVIEW ? EnumC1063300dmC.NATIVEVIEW : EnumC1063300dmC.WEB;
    }

    @Override // X.AbstractC1544480qII
    public final /* bridge */ /* synthetic */ InterfaceC1544510qIL<JSONObject> LIZIZ() {
        return this.LJ;
    }

    public /* synthetic */ C1544470qIH(InterfaceC1063710dmr interfaceC1063710dmr, JSONObject jSONObject) {
        this(interfaceC1063710dmr, jSONObject, EnumC1543740qH6.Web);
    }

    @Override // X.AbstractC1544480qII
    public final JSONObject LIZLLL(int i, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i);
        jSONObject.put("msg", str);
        return jSONObject;
    }

    public C1544470qIH(InterfaceC1063710dmr interfaceC1063710dmr, JSONObject jSONObject, EnumC1543740qH6 enumC1543740qH6) {
        super(interfaceC1063710dmr, jSONObject);
        this.LIZJ = enumC1543740qH6;
        C1549590qQX c1549590qQX = new C1549590qQX();
        c1549590qQX.LIZ = this.LIZLLL;
        this.LJ = c1549590qQX;
    }
}
