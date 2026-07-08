package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.03Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C839703Pv extends AbstractC839903Px {
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Boolean LJ;
    public final String LJFF;

    @Override // X.AbstractC839903Px, X.C041O
    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        map.putAll(super.LIZ());
        map.put("is_retry", this.LIZJ ? "yes" : "no");
        map.put("is_success", this.LIZLLL ? "yes" : "no");
        Boolean bool = this.LJ;
        if (bool != null) {
            map.put("is_incomplete_data", bool.booleanValue() ? "yes" : "no");
        }
        String str = this.LJFF;
        if (str != null) {
            map.put("error_code", str);
        }
        return map;
    }

    public C839703Pv(boolean z, boolean z2, String str, Boolean bool) {
        super("rd_tiktokec_first_bill_info_request_result");
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = bool;
        this.LJFF = str;
    }
}
