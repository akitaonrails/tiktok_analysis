package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C877103bl {
    public static final /* synthetic */ int LIZ = 0;

    public static LinkedHashMap LIZ(C877303bn c877303bn) {
        LinkedHashMap linkedHashMapLIZIZ = LIZIZ(c877303bn.LIZLLL);
        String str = c877303bn.LIZIZ;
        if (str != null) {
            linkedHashMapLIZIZ.put("entrance_info", str);
        }
        return linkedHashMapLIZIZ;
    }

    public static LinkedHashMap LIZIZ(Map map) {
        Integer numValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (Intrinsics.LJFF(key, "is_auto")) {
                    if (value instanceof Integer) {
                        numValueOf = (Integer) value;
                    } else if (value instanceof Long) {
                        numValueOf = Integer.valueOf((int) ((Number) value).longValue());
                    } else if (value instanceof Boolean) {
                        numValueOf = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
                    } else if (value instanceof String) {
                        numValueOf = C2095008Iq.LJIIJJI((String) value);
                    }
                    if (numValueOf != null) {
                        linkedHashMap.put(key, Integer.valueOf(numValueOf.intValue()));
                    }
                } else {
                    linkedHashMap.put(key, value);
                }
            }
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        return linkedHashMap;
    }

    public static void LIZJ(C867003a8 c867003a8, C877303bn c877303bn) {
        int i = C861303Yd.LIZ[c867003a8.LJ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            LinkedHashMap linkedHashMapLIZ = LIZ(c877303bn);
            linkedHashMapLIZ.put("page_name", c877303bn.LIZ);
            linkedHashMapLIZ.put("action_type", "click");
            linkedHashMapLIZ.put("banner_id", "add_backup_payment");
            linkedHashMapLIZ.put("backup_payment_status", Integer.valueOf(LJIIIIZZ(c867003a8, c877303bn)));
            C1018503yZ.LIZIZ("tiktokec_banner_click", linkedHashMapLIZ, true);
            return;
        }
        LinkedHashMap linkedHashMapLIZ2 = LIZ(c877303bn);
        linkedHashMapLIZ2.put("page_name", c877303bn.LIZ);
        linkedHashMapLIZ2.put("button_name", "trun_on_backup_payment");
        linkedHashMapLIZ2.put("button_type", "backup_payment");
        linkedHashMapLIZ2.put("button_status", Integer.valueOf(c867003a8.LIZLLL ? 1 : 0));
        C1018503yZ.LIZIZ("tiktokec_button_click", linkedHashMapLIZ2, true);
    }

    public static void LIZLLL(C867003a8 c867003a8, C877303bn c877303bn) {
        int i = C861303Yd.LIZ[c867003a8.LJ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            LinkedHashMap linkedHashMapLIZ = LIZ(c877303bn);
            linkedHashMapLIZ.put("page_name", c877303bn.LIZ);
            linkedHashMapLIZ.put("banner_id", "add_backup_payment");
            linkedHashMapLIZ.put("backup_payment_status", Integer.valueOf(LJIIIIZZ(c867003a8, c877303bn)));
            C1018503yZ.LIZIZ("tiktokec_banner_show", linkedHashMapLIZ, true);
            return;
        }
        LinkedHashMap linkedHashMapLIZ2 = LIZ(c877303bn);
        linkedHashMapLIZ2.put("page_name", c877303bn.LIZ);
        linkedHashMapLIZ2.put("button_name", "trun_on_backup_payment");
        linkedHashMapLIZ2.put("button_type", "backup_payment");
        linkedHashMapLIZ2.put("button_status", Integer.valueOf(c867003a8.LIZLLL ? 1 : 0));
        C1018503yZ.LIZIZ("tiktokec_button_show", linkedHashMapLIZ2, true);
    }

    public static void LJ(String str, Map map) {
        LinkedHashMap linkedHashMapLIZIZ = LIZIZ(map);
        linkedHashMapLIZIZ.put("page_name", "active_backup_payment");
        linkedHashMapLIZIZ.put("button_name", str);
        linkedHashMapLIZIZ.put("button_type", "backup_payment");
        C1018503yZ.LIZIZ("tiktokec_button_click", linkedHashMapLIZIZ, true);
    }

    public static void LJFF(String str, Map map) {
        LinkedHashMap linkedHashMapLIZIZ = LIZIZ(map);
        linkedHashMapLIZIZ.put("page_name", "active_backup_payment");
        linkedHashMapLIZIZ.put("button_name", str);
        linkedHashMapLIZIZ.put("button_type", "backup_payment");
        C1018503yZ.LIZIZ("tiktokec_button_show", linkedHashMapLIZIZ, true);
    }

    public static void LJII(C877303bn c877303bn, boolean z) {
        String str;
        LinkedHashMap linkedHashMapLIZ = LIZ(c877303bn);
        linkedHashMapLIZ.put("page_name", c877303bn.LIZ);
        linkedHashMapLIZ.put("popup_name", "turn_off_backup_payment");
        if (z) {
            str = "keep_on";
        } else {
            str = "turn_off";
        }
        linkedHashMapLIZ.put("action_type", str);
        C1018503yZ.LIZIZ("tiktokec_popup_click", linkedHashMapLIZ, true);
    }

    public static int LJIIIIZZ(C867003a8 c867003a8, C877303bn c877303bn) {
        int i = C861303Yd.LIZ[c867003a8.LJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 0;
            }
            throw new C1954807lC();
        }
        Boolean bool = c877303bn.LJFF;
        return bool != null ? bool.booleanValue() ? 1 : 0 : c867003a8.LIZLLL ? 1 : 0;
    }

    public static void LJI(C877303bn c877303bn, String str, String str2) {
        LinkedHashMap linkedHashMapLIZ = LIZ(c877303bn);
        linkedHashMapLIZ.put("page_name", str2);
        linkedHashMapLIZ.put("popup_name", str);
        C1018503yZ.LIZIZ("tiktokec_popup_show", linkedHashMapLIZ, true);
    }
}
