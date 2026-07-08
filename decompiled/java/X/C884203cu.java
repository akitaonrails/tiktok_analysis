package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.03cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C884203cu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC884003cs enumC884003cs, String str) {
        String str2;
        int i = C884103ct.LIZ[enumC884003cs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "save";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str2 = "close";
            }
        } else {
            str2 = "cancel";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C890103dr.LIZ.getClass();
        linkedHashMap.putAll(C890103dr.LIZJ);
        linkedHashMap.put("popup_name", "save_this_card");
        linkedHashMap.put("action_type", str2);
        linkedHashMap.put("option_type", "payment_type");
        linkedHashMap.put("page_name", str);
        C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
    }
}
