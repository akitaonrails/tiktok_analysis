package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796080wq6 {
    public final String LIZ;

    public C1796080wq6(String str) {
        this.LIZ = new JSONObject(str).optString("countryCode");
    }
}
