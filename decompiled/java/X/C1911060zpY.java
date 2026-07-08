package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0zpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911060zpY {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public final void LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action", str);
        String str2 = this.LIZ;
        if (str2 != null) {
            linkedHashMap.put("user_type", str2);
        }
        String str3 = this.LIZIZ;
        if (str3 != null) {
            linkedHashMap.put("enter_from", str3);
        }
        String str4 = this.LIZJ;
        if (str4 != null) {
            linkedHashMap.put("enter_method", str4);
        }
        String str5 = this.LIZLLL;
        if (str5 != null) {
            linkedHashMap.put("ngo_name", str5);
        }
        String str6 = this.LJ;
        if (str6 != null) {
            linkedHashMap.put("fundraiser_id", str6);
        }
        String str7 = this.LJFF;
        if (str7 != null) {
            linkedHashMap.put("fundraiser_owner_id", str7);
        }
        String str8 = this.LJI;
        if (str8 != null) {
            linkedHashMap.put("from_user_id", str8);
        }
        String str9 = this.LJII;
        if (str9 != null) {
            linkedHashMap.put("donation_show_amt", str9);
        }
        String str10 = this.LJIIIIZZ;
        if (str10 != null) {
            linkedHashMap.put("donor_show_cnt", str10);
        }
        C20684815ws.LJIILLIIL("donation_panel_click", linkedHashMap);
    }
}
