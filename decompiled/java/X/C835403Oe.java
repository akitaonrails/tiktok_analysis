package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.03Oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C835403Oe extends AbstractC818603Hs {
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.C041O
    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        String str = this.LIZJ;
        if (str != null) {
            map.put("error_code", str);
        }
        map.put("is_retry", this.LIZLLL ? "yes" : "no");
        map.put("is_first_enter", this.LJ ? "yes" : "no");
        return map;
    }

    public C835403Oe(String str, boolean z, boolean z2) {
        super("tiktokec_order_submit_load_fail");
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
