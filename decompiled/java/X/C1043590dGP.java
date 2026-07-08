package X;

import com.ss.android.ugc.aweme.AnoleAutomationParamModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.0dGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043590dGP {
    public static final C1043590dGP LIZ = new C1043590dGP();

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 2) {
                return "high";
            }
            if (num.intValue() != 1) {
                if (num.intValue() == 0) {
                    return "low";
                }
                if (num.intValue() == 3) {
                    return "use_interaction";
                }
                return "middle";
            }
            return "middle";
        }
        return "middle";
    }

    public static void LIZLLL(String str, C1029740cu4 c1029740cu4, Map map) {
        if (!C298290Bmd.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            C1029740cu4 c1029740cu42 = new C1029740cu4(c1029740cu4.LIZ, c1029740cu4.LIZIZ, c1029740cu4.LIZJ, null, null, null, false, 120);
            C1043630dGT c1043630dGT = new C1043630dGT(str3, str2, c1029740cu42, str);
            C1043610dGR.LIZ.getClass();
            C1043600dGQ c1043600dGQLIZ = C1043610dGR.LIZ(str2);
            c1043600dGQLIZ.LIZJ = System.currentTimeMillis();
            C1015400cWw c1015400cWw = C1015400cWw.LIZ;
            String str4 = c1029740cu42.LIZ;
            String str5 = "-1";
            if (str4 == null) {
                str4 = "-1";
            }
            c1015400cWw.getClass();
            AnoleAutomationParamModel anoleAutomationParamModelLIZ = C1015400cWw.LIZ(str4, str3);
            anoleAutomationParamModelLIZ.LIZIZ.put(str2, str);
            anoleAutomationParamModelLIZ.LIZJ.put(str2, "start_task");
            C2274401E0o.LIZ.getClass();
            C1023960ckk c1023960ckk = C2274401E0o.LIZIZ;
            String str6 = c1029740cu42.LIZ;
            if (str6 != null) {
                str5 = str6;
            }
            c1043600dGQLIZ.logAd(c1023960ckk, str5, c1029740cu42.LIZIZ, c1029740cu42.LIZJ, new AwS614S0100000_35(c1043630dGT, 171));
            arrayList.add(Unit.LIZ);
        }
    }

    public static void LIZIZ(String str, String str2, C1029740cu4 c1029740cu4, Map map) {
        if (!C298290Bmd.LIZ()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            String str3 = (String) entry.getKey();
            entry.getValue();
            if (C1552050qUV.LIZIZ(str, str3)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str4 = (String) entry2.getKey();
            C1043630dGT c1043630dGT = new C1043630dGT((String) entry2.getValue(), str4, new C1029740cu4(c1029740cu4.LIZ, c1029740cu4.LIZIZ, c1029740cu4.LIZJ, null, null, null, false, 120), str2);
            C1043610dGR.LIZ.getClass();
            C1043610dGR.LIZ(str4).LJJIIZ(c1043630dGT, "from_cache", null, null);
            arrayList.add(Unit.LIZ);
        }
    }

    public static void LIZJ(String str, String str2, C1029740cu4 c1029740cu4, Map map) {
        if (!C298290Bmd.LIZ() || str == null) {
            return;
        }
        String str3 = (String) map.get(str);
        if (str3 == null) {
            str3 = "";
        }
        C1029740cu4 c1029740cu42 = new C1029740cu4(c1029740cu4.LIZ, c1029740cu4.LIZIZ, c1029740cu4.LIZJ, null, null, null, false, 120);
        C1043630dGT c1043630dGT = new C1043630dGT(str3, str, c1029740cu42, str2);
        C1043610dGR.LIZ.getClass();
        C1043600dGQ c1043600dGQLIZ = C1043610dGR.LIZ(str);
        System.currentTimeMillis();
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        String str4 = c1029740cu42.LIZ;
        String str5 = "-1";
        if (str4 == null) {
            str4 = "-1";
        }
        c1015400cWw.getClass();
        C1015400cWw.LIZ(str4, str3).LIZJ.put(str, "did_clean");
        C2274401E0o.LIZ.getClass();
        C1023960ckk c1023960ckk = C2274401E0o.LJI;
        String str6 = c1029740cu42.LIZ;
        if (str6 != null) {
            str5 = str6;
        }
        c1043600dGQLIZ.logAd(c1023960ckk, str5, c1029740cu42.LIZIZ, c1029740cu42.LIZJ, new AwS614S0100000_35(c1043630dGT, 170));
    }
}
