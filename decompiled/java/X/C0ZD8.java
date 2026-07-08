package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.IMNudgeAndStreakService;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZD8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZD8 implements InterfaceC895030Z9h {
    public static final C0ZD8 LIZIZ = new C0ZD8();

    public static String LJ(boolean z) {
        if (C286570BLb.LIZ()) {
            return EnumC895050Z9j.STICKER.getValue();
        }
        if (z) {
            return EnumC895050Z9j.NUDGE_BACK.getValue();
        }
        return EnumC895050Z9j.NUDGE.getValue();
    }

    @Override // X.InterfaceC895030Z9h
    public final void LJJII(String str) {
        C1440005kM.LIZ(new C0ZDB());
    }

    public static Map LIZJ(boolean z, C0ZDA c0zda) {
        String str;
        String str2;
        String str3;
        if (c0zda.LJIIIIZZ == null) {
            return null;
        }
        C13DA c13da = new C13DA();
        Map<String, String> map = c0zda.LJIIIIZZ;
        if (map != null) {
            c13da.putAll(map);
        }
        String str4 = c0zda.LIZIZ;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        c13da.put("enter_method", str4);
        LIZIZ.getClass();
        c13da.put("message_type", LJ(z));
        c13da.put("message_from", EnumC895110Z9p.NUDGE.getValue());
        C894980Z9c c894980Z9c = c0zda.LIZJ;
        if (c894980Z9c == null || (str = c894980Z9c.LIZ) == null) {
            str = "";
        }
        c13da.put("interaction_type", str);
        C894980Z9c c894980Z9c2 = c0zda.LIZJ;
        if (c894980Z9c2 != null && (str3 = c894980Z9c2.LIZIZ) != null) {
            str5 = str3;
        }
        c13da.put("interaction_name", str5);
        c13da.put("sticker_id", String.valueOf(C0Z4Q.LIZ().stickerId));
        if (z) {
            str2 = "v1_basic_nudge_back_src";
        } else {
            str2 = "v1_basic_nudge_src";
        }
        c13da.put("a:light_interaction_name", str2);
        return c13da.build();
    }

    public static Map LIZLLL(boolean z, C0ZDA c0zda) {
        boolean z2;
        String str;
        boolean z3;
        String str2;
        Map<String, String> map = c0zda.LJIIIIZZ;
        if (map != null && !map.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str3 = "v1_basic_nudge_back_src";
        if (!z2) {
            if (!z) {
                str3 = "v1_basic_nudge_src";
            }
            return C2097908Jt.LIZJ(new Pair("a:light_interaction_name", str3));
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("message_type", LJ(z));
        String str4 = c0zda.LIZ;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        pairArr[1] = new Pair("enter_from", str4);
        String str6 = c0zda.LIZIZ;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[2] = new Pair("enter_method", str6);
        pairArr[3] = new Pair("message_from", EnumC895110Z9p.NUDGE.getValue());
        C894980Z9c c894980Z9c = c0zda.LIZJ;
        if (c894980Z9c == null || (str = c894980Z9c.LIZ) == null) {
            str = "";
        }
        pairArr[4] = new Pair("interaction_type", str);
        C894980Z9c c894980Z9c2 = c0zda.LIZJ;
        if (c894980Z9c2 != null && (str2 = c894980Z9c2.LIZIZ) != null) {
            str5 = str2;
        }
        pairArr[5] = new Pair("interaction_name", str5);
        pairArr[6] = new Pair("sticker_id", String.valueOf(C0Z4Q.LIZ().stickerId));
        if (!z) {
            str3 = "v1_basic_nudge_src";
        }
        pairArr[7] = new Pair("a:light_interaction_name", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String str7 = c0zda.LJ;
        if (str7 != null && str7.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 && str7 != null) {
            mapLJIIJ.put("inbox_search_position", str7);
        }
        String str8 = c0zda.LJFF;
        if (str8 != null && str8.length() != 0) {
            mapLJIIJ.put("inbox_search_cell_type", str8);
        }
        String str9 = c0zda.LJI;
        if (str9 != null && str9.length() != 0 && str9 != null) {
            mapLJIIJ.put("inbox_search_tab_name", str9);
        }
        Map<String, String> map2 = c0zda.LJII;
        if (map2 != null) {
            mapLJIIJ.putAll(map2);
        }
        return mapLJIIJ;
    }

    @Override // X.InterfaceC895030Z9h
    public final boolean LJJJJ(C0ZD9 c0zd9, String str, C0ZDA c0zda, C0ZDM c0zdm, String str2) {
        return IMNudgeAndStreakService.LJFF.LIZIZ(c0zd9, false, C0YNP.LJ(str), c0zda, c0zdm, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    @Override // X.InterfaceC895030Z9h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(X.C0ZD9 r35, boolean r36, java.lang.String r37, X.C0ZDA r38, X.C0ZDM r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZD8.LIZIZ(X.0ZD9, boolean, java.lang.String, X.0ZDA, X.0ZDM, java.lang.String):boolean");
    }
}
