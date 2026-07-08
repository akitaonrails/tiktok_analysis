package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1866507St {
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static C1866907Sx LIZ = new C1866907Sx(new C1867107Sz("", "", "", "", "", "", "", false));
    public static final C1866707Sv LIZIZ = new C1866707Sv();
    public static final C1865807Sm LIZJ = new C1865807Sm();
    public static boolean LJI = true;

    public static void LIZIZ(C1867107Sz c1867107Sz) {
        LIZ = new C1866907Sx(c1867107Sz);
        C1866707Sv c1866707Sv = LIZIZ;
        c1866707Sv.LIZJ = null;
        c1866707Sv.LIZ = null;
        c1866707Sv.LIZIZ = false;
        c1866707Sv.LIZLLL = 0;
    }

    public static void LIZ(String str, String str2, Map map, boolean z) {
        String str3 = str2;
        String str4 = str;
        String str5 = (String) map.get("shoot_way");
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        String str7 = (String) map.get("creation_id");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = (String) map.get("from_group_id");
        if (str8 == null) {
            str8 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        String str9 = (String) map.get("from_group_id_prop_list");
        if (str9 == null) {
            str9 = "";
        }
        String str10 = (String) map.get("from_group_id_prop_resource_list");
        if (str10 != null) {
            str6 = str10;
        }
        LIZIZ(new C1867107Sz(str5, str7, str8, str4, str3, str9, str6, z));
        if (z) {
            LIZJ.LIZ(C2097608Jq.LJ());
        } else {
            LIZJ.LIZ(map);
        }
        LIZLLL = false;
        LJ = false;
        LJFF = false;
        Intrinsics.LJFF(str5, "story");
        LJI = true;
    }
}
