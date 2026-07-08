package X;

import java.util.Map;

/* JADX INFO: renamed from: X.08d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2159008d2 {
    public final Map<String, String> LIZ;

    public C2159008d2(int i, boolean z, Long l, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        z = (i2 & 2) != 0 ? false : z;
        l = (i2 & 4) != 0 ? null : l;
        String str = (i2 & 8) != 0 ? "personal_homepage" : null;
        C13DA c13da = new C13DA();
        c13da.put("remaining_list", String.valueOf(i));
        if (l != null) {
            c13da.put("remaining_expire_time", String.valueOf(l));
        }
        c13da.put("has_client_cache", String.valueOf(z));
        c13da.put("enter_from", str);
        this.LIZ = c13da.build();
    }
}
