package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q1Q {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2038712857:
                if (!str.equals("last_from_group_id")) {
                    return false;
                }
                return true;
            case -859561879:
                if (!str.equals("inner_search_id")) {
                    return false;
                }
                return true;
            case -659357102:
                if (!str.equals("search_keyword")) {
                    return false;
                }
                return true;
            case -539301789:
                if (!str.equals("search_rank")) {
                    return false;
                }
                return true;
            case -539219087:
                if (!str.equals("search_type")) {
                    return false;
                }
                return true;
            case -271543254:
                if (!str.equals("is_search_scene")) {
                    return false;
                }
                return true;
            case 3492908:
                if (!str.equals("rank")) {
                    return false;
                }
                return true;
            case 101507520:
                if (!str.equals("token_type")) {
                    return false;
                }
                return true;
            case 115324673:
                if (!str.equals("is_inner")) {
                    return false;
                }
                return true;
            case 422185195:
                if (!str.equals("process_id")) {
                    return false;
                }
                return true;
            case 506361563:
                if (!str.equals("group_id")) {
                    return false;
                }
                return true;
            case 707444888:
                if (!str.equals("search_third_item_id")) {
                    return false;
                }
                return C1833407Ga.LIZ();
            case 1155679910:
                if (!str.equals("search_result_id")) {
                    return false;
                }
                return true;
            case 1198625574:
                if (!str.equals("list_item_id")) {
                    return false;
                }
                return true;
            case 1460527127:
                if (!str.equals("end_to_end_search_session_id")) {
                    return false;
                }
                return true;
            case 1778207506:
                if (!str.equals("search_id")) {
                    return false;
                }
                return true;
            case 2108160551:
                if (!str.equals("search_enter_position")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static final void LIZ(C2344009Gk c2344009Gk, Map map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (LIZJ((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (C123100dR.LIZ((String) entry2.getValue())) {
                    c2344009Gk.LJFF((String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
    }

    public static final void LIZIZ(C736480Suk c736480Suk, Map map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (LIZJ((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (C123100dR.LIZ((String) entry2.getValue())) {
                    c736480Suk.LIZ((String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
    }
}
