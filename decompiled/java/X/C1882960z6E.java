package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0z6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882960z6E {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(InterfaceC1883090z6R interfaceC1883090z6R, int i, String str) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C474500IjA c474500IjALIZ = LIZ(interfaceC1883090z6R, "error", "mix_first_page", null);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_msg");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(InterfaceC1881340z3c interfaceC1881340z3c, String str, Map map) {
        Map<String, Object> map2 = C1338270kvh.LIZ;
        C474500IjA c474500IjALIZ = LIZ(interfaceC1881340z3c, "finish", "mix_first_page", map);
        c474500IjALIZ.LJJII(str, "finish_type");
        c474500IjALIZ.LIZ();
    }

    public static C474500IjA LIZ(InterfaceC1881340z3c interfaceC1881340z3c, String str, String str2, Map map) {
        C1882420z5M c1882420z5MLIZLLL;
        String strLJIILLIIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_mix_load_trace");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        if (interfaceC1881340z3c == null || (strLJIILLIIL = interfaceC1881340z3c.LJIILLIIL()) == null) {
            strLJIILLIIL = "";
        }
        c474500IjALIZ.LJJII(strLJIILLIIL, "mix_page_tag");
        c474500IjALIZ.LJJII(str, "action");
        c474500IjALIZ.LJJII(str2, "content_type");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
            }
        }
        return c474500IjALIZ;
    }

    public static void LIZIZ(InterfaceC1881340z3c interfaceC1881340z3c, InterfaceC1883030z6L interfaceC1883030z6L, String str, Map map) {
        Map<String, String> mapLJFF;
        C1882410z5L c1882410z5LLIZIZ;
        Map<String, Object> map2 = C1338270kvh.LIZ;
        C474500IjA c474500IjALIZ = LIZ(interfaceC1881340z3c, "finish", "mix_card", map);
        if (interfaceC1883030z6L != null && (c1882410z5LLIZIZ = C1882380z5I.LIZIZ(interfaceC1883030z6L)) != null) {
            mapLJFF = C476770Imp.LJFF(C1882380z5I.LIZ(c1882410z5LLIZIZ));
        } else {
            mapLJFF = null;
        }
        c474500IjALIZ.LJJIIZI(mapLJFF);
        c474500IjALIZ.LJJII(str, "finish_type");
        c474500IjALIZ.LIZ();
    }
}
