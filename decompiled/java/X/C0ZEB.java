package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ZEB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZEB {
    public static void LIZ(C0ZE7 c0ze7) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        C0ZEC c0zec = new C0ZEC(c0ze7);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c0zec.LIZ;
        if (str != null) {
            linkedHashMap.put("position", str);
        }
        String str2 = c0zec.LIZIZ;
        if (str2 != null) {
            linkedHashMap.put("to_user_id", str2);
        }
        Integer num = c0zec.LJ;
        if (num != null) {
            num.intValue();
            linkedHashMap.put("rank_index", c0zec.LJ.toString());
        }
        String str3 = c0zec.LIZJ;
        if (str3 != null) {
            linkedHashMap.put("enter_method", str3);
        }
        String str4 = c0zec.LJFF;
        if (str4 != null) {
            linkedHashMap.put("to_group_id", str4);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0ZEA(c0ze7, interfaceC1493505szLIZIZ, linkedHashMap, null), 3);
    }

    public static void LIZIZ(C0ZE7 c0ze7) {
        C0I0B.LJFF.LIZIZ();
        if (c0ze7 != null) {
            if (c0ze7.LJIIIZ != null && c0ze7.LJIIJ == 0) {
                return;
            }
            if (c0ze7.LIZJ != null && c0ze7.LJIIJ == -1) {
                return;
            }
            C0ZEC c0zec = new C0ZEC(c0ze7);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = c0zec.LIZ;
            if (str != null) {
                linkedHashMap.put("position", str);
            }
            String str2 = c0zec.LIZIZ;
            if (str2 != null) {
                linkedHashMap.put("to_user_id", str2);
            }
            String str3 = c0zec.LJFF;
            if (str3 != null) {
                linkedHashMap.put("to_group_id", str3);
            }
            linkedHashMap.put("activity_status_level", String.valueOf(c0zec.LJI));
            C20684815ws.LJIILLIIL("activity_status_text_show", linkedHashMap);
        }
    }
}
