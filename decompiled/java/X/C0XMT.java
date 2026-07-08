package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMT implements InterfaceC1051760dTa {
    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String strOptString = "h5";
        if (c1058910df7 != null && (jSONObject2 = c1058910df7.LIZLLL) != null) {
            strOptString = jSONObject2.optString("logout_from", "h5");
        }
        C0XQ7.LIZJ().logout(strOptString, "user_logout");
    }
}
