package X;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847910XOb {
    public static final C847910XOb LIZ = new C847910XOb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0XHG());
    public static final Map<String, C847950XOf> LIZJ = new LinkedHashMap();
    public static final Map<String, C847950XOf> LIZLLL = new LinkedHashMap();
    public static final Map<String, C847950XOf> LJ = new LinkedHashMap();
    public static final Map<String, Map<String, C847950XOf>> LJFF = new LinkedHashMap();
    public static final Map<String, C847950XOf> LJI = new LinkedHashMap();
    public static final Map<String, C847950XOf> LJII = new LinkedHashMap();
    public static final List<C847950XOf> LJIIIIZZ = new ArrayList();
    public static C0XH6 LJIIIZ = C847850XNv.LIZ;

    public static List LIZJ() {
        List<String> list = LJIIIZ.get().auth_broadcast_domains;
        List<String> list2 = (list == null || list.isEmpty()) ? LJIIIZ.get().domains : LJIIIZ.get().auth_broadcast_domains;
        return list2 == null ? C13BV.INSTANCE : list2;
    }

    public static C847950XOf LJFF() {
        ArrayList arrayList = (ArrayList) LJIIIIZZ;
        if (!arrayList.isEmpty()) {
            return (C847950XOf) C13LP.LJJLIIIJL(arrayList);
        }
        return null;
    }

    public static void LJIIJJI(boolean z) {
        C847950XOf c847950XOf;
        C0XFF.LIZ("TTPRelated", "start ttp context");
        if (z) {
            List<C847950XOf> list = LJIIIIZZ;
            C847950XOf c847950XOfLJFF = LJFF();
            if (c847950XOfLJFF != null) {
                c847950XOf = new C847950XOf(c847950XOfLJFF.LJ, c847950XOfLJFF.LIZ, c847950XOfLJFF.LIZIZ, c847950XOfLJFF.LIZJ, c847950XOfLJFF.LIZLLL, c847950XOfLJFF.LJFF, c847950XOfLJFF.LJI);
            } else {
                c847950XOf = new C847950XOf(0);
            }
            ((ArrayList) list).add(c847950XOf);
            return;
        }
        ((ArrayList) LJIIIIZZ).add(new C847950XOf(0));
    }

    public static void LIZ(String str, String str2) {
        String str3;
        HashMap map = new HashMap();
        C847950XOf c847950XOfLJFF = LJFF();
        if (c847950XOfLJFF != null && (str3 = c847950XOfLJFF.LIZ) != null && str3.length() != 0) {
            String str4 = c847950XOfLJFF.LIZLLL;
            if (str4 != null) {
                map.put("hashed_id", str4);
            }
            Integer num = c847950XOfLJFF.LJ;
            if (num != null) {
                map.put("type", String.valueOf(num.intValue()));
            }
            String str5 = c847950XOfLJFF.LJFF;
            if (str5 != null) {
                map.put("platform_app_id", str5);
            }
            String str6 = c847950XOfLJFF.LJI;
            if (str6 != null) {
                map.put("pre_path", str6);
            }
            String str7 = c847950XOfLJFF.LIZ;
            if (str7 != null) {
                map.put("final_domain", str7);
            }
            if (str != null) {
                map.put("sec_uid", str);
            }
            if (str2 != null) {
                map.put("screen_name", str2);
            }
            Iterator it2 = LIZJ().iterator();
            while (it2.hasNext()) {
                LJIIIIZZ(0, (String) it2.next(), map);
            }
        }
    }

    public static String LIZIZ(int i, String str) {
        if (i != 5 && i != 6) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("aDy0TUhtql92P7hScCs97YWMT-jub2q9");
            return C08HM.LJ(MessageDigest.getInstance("SHA-256").digest(C2188811AlT.LIZIZ(sbLIZ).getBytes(Charsets.UTF_8)));
        }
        return str;
    }

    public static void LJIIIIZZ(int i, String str, Map map) {
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C847940XOe(i, str, map, null), 3);
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4, String str5) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", str);
        jSONObject.put("path", str2);
        jSONObject.put("vdc", str3);
        jSONObject.put("region", str4);
        jSONObject.put("error_msg", str5);
        C0XG9.LJ("passport_local_region_check_result", jSONObject);
    }

    public static void LJIIL(int i, int i2, String str, String str2, String str3, String str4) {
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C847930XOd(i2, i, str, str2, str3, str4, null), 3);
    }

    public static void LJ(String str, String str2, int i, String str3, CountDownLatch countDownLatch, List list, boolean z, int i2) {
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C847920XOc(str, z, str2, i, str3, countDownLatch, list, i2, null), 3);
    }

    public static void LJI(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C847950XOf c847950XOfLJFF;
        C847950XOf c847950XOf = new C847950XOf(Integer.valueOf(i), str5, str7, str6, str4, str2, str);
        switch (i) {
            case 1:
                LIZJ.put(str4, c847950XOf);
                break;
            case 2:
                LIZLLL.put(str4, c847950XOf);
                break;
            case 3:
                LJ.put(str4, c847950XOf);
                break;
            case 4:
                Map<String, Map<String, C847950XOf>> map = LJFF;
                Map<String, C847950XOf> linkedHashMap = (Map) ((LinkedHashMap) map).get(str3);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    map.put(str3, linkedHashMap);
                }
                linkedHashMap.put(str4, c847950XOf);
                break;
            case 5:
                LJI.put(str4, c847950XOf);
                break;
            case 6:
                LJII.put(str4, c847950XOf);
                break;
        }
        if (!z && (c847950XOfLJFF = LJFF()) != null) {
            c847950XOfLJFF.LIZLLL = c847950XOf.LIZLLL;
            c847950XOfLJFF.LJ = c847950XOf.LJ;
            c847950XOfLJFF.LJFF = c847950XOf.LJFF;
            c847950XOfLJFF.LIZ = c847950XOf.LIZ;
            c847950XOfLJFF.LIZIZ = c847950XOf.LIZIZ;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, int r30) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C847910XOb.LIZLLL(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int):java.lang.String");
    }
}
