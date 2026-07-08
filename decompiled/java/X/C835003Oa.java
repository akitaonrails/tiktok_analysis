package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.03Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C835003Oa extends AbstractC818603Hs {
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final Object LJFF;

    @Override // X.C041O
    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("button_for", this.LIZJ);
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            map.put("is_address_deliverable", bool.booleanValue() ? "yes" : "no");
        }
        Boolean bool2 = this.LJ;
        if (bool2 != null) {
            map.put("is_delivery_info_complete", bool2.booleanValue() ? "yes" : "no");
        }
        Object obj = this.LJFF;
        if (obj != null) {
            map.put("order_summary_info", obj);
        }
        return map;
    }

    public C835003Oa(String str, Boolean bool, Boolean bool2, Object obj) {
        super("tiktokec_order_submit_button_click");
        this.LIZJ = str;
        this.LIZLLL = bool;
        this.LJ = bool2;
        this.LJFF = obj;
    }
}
