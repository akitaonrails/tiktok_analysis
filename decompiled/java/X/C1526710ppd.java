package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ppd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526710ppd implements InterfaceC1526950pq1 {
    public static final C1526730ppf LIZ = new AbstractC1526380pp6<InterfaceC1526950pq1>() { // from class: X.0ppf
        @Override // X.AbstractC1526380pp6
        public final InterfaceC1526950pq1 LIZ(Object[] objArr) {
            return new C1526710ppd();
        }
    };

    public static InterfaceC1526950pq1 LIZJ() {
        return LIZ.LIZIZ(new Object[0]);
    }

    @Override // X.InterfaceC1526950pq1
    public final void LIZ(boolean z) {
        JSONObject jSONObject = new JSONObject();
        C1499090p75.LIZ(z ? 1 : 0, "login", jSONObject);
        C1526300poy.LIZ("sync_account_status", jSONObject, null, null);
    }

    @Override // X.InterfaceC1526950pq1
    public final void LIZIZ(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C1499090p75.LIZJ("config", str, jSONObject);
        C1499090p75.LIZJ("error", str2, jSONObject);
        C1526300poy.LIZ("sync_config", jSONObject, null, null);
    }

    @Override // X.InterfaceC1526950pq1
    public final void ensureNotReachHere(Throwable th, String str) {
        C1526300poy.LIZLLL(str, th);
    }
}
