package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879890z1H {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "register_package" : "follow_package" : "no_threshold_package" : "bind_acc_package" : "download_package";
    }

    public static void LIZIZ(InterfaceC1881340z3c interfaceC1881340z3c, String str, Map map, Boolean bool) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_search_card_module_show");
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(interfaceC1881340z3c))));
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "module_name");
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "is_shop_support");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(InterfaceC1881340z3c interfaceC1881340z3c, String str, String str2, Boolean bool) {
        Object c098200Yq;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null && C476770Imp.LIZLLL(str2)) {
            try {
                c098200Yq = C500260Jjc.LLF(new JSONObject(str2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                linkedHashMap.putAll((Map) c098200Yq);
            }
        }
        LIZ(interfaceC1881340z3c, "game_card", str, linkedHashMap, bool);
    }

    public static void LIZ(InterfaceC1881340z3c interfaceC1881340z3c, String str, String str2, Map map, Boolean bool) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_search_card_module_click");
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(interfaceC1881340z3c))));
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "module_name");
        c474500IjALIZ.LJJII(str2, "btn_name");
        if (bool != null) {
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "is_shop_support");
        }
        c474500IjALIZ.LIZ();
    }
}
