package X;

import java.util.Map;

/* JADX INFO: renamed from: X.08d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2158908d1 {
    public final int LIZ;
    public final boolean LIZIZ;
    public final Long LIZJ = null;
    public final String LIZLLL = "personal_homepage";
    public final String LJ;

    public final Map<String, String> LIZ() {
        C13DA c13da = new C13DA();
        c13da.put("remaining_list", String.valueOf(this.LIZ));
        Long l = this.LIZJ;
        if (l != null) {
            c13da.put("remaining_expire_time", String.valueOf(l));
        }
        c13da.put("has_client_cache", String.valueOf(this.LIZIZ));
        c13da.put("enter_from", this.LIZLLL);
        String str = this.LJ;
        if (str != null && str.length() != 0) {
            c13da.put("server_check_info", this.LJ);
        }
        return c13da.build();
    }

    public C2158908d1(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LJ = str;
    }
}
