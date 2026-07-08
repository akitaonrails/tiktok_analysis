package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.17wY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21192417wY {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        return C1867300ygy.LIZ() ? "v2" : "v1";
    }

    public static EnumC21192517wZ LJIIIZ(EnumC21192917wd enumC21192917wd) {
        switch (C21193017we.LIZ[enumC21192917wd.ordinal()]) {
            case 1:
                return EnumC21192517wZ.SLOT_CALLBACK_PREPARE_TO_SHOW;
            case 2:
                return EnumC21192517wZ.PREPARE_TO_SHOW;
            case 3:
                return EnumC21192517wZ.ON_SLOT_CREATED;
            case 4:
                return EnumC21192517wZ.ON_SLOT_CREATED_FROM_RESPONSE;
            case 5:
                return EnumC21192517wZ.WAIT_FOR_SHOW;
            case 6:
                return EnumC21192517wZ.MORE_WAIT_FOR_SHOW;
            case 7:
                return EnumC21192517wZ.NOTIFY_SHOW;
            case 8:
                return EnumC21192517wZ.ON_VIEW_CREATED;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC21192517wZ.DID_SHOW;
            default:
                return EnumC21192517wZ.DEFAULT;
        }
    }

    public static void LJIIIIZZ(Map map, C1563990qnl c1563990qnl) {
        if (C07J3.LIZ()) {
            C21183117v3.LIZ(map, c1563990qnl);
        }
        C1421105hJ.LIZJ("rd_ttec_pin_card_event", map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static void LIZIZ(EnumC21192517wZ enumC21192517wZ, C1563990qnl c1563990qnl, Map map) {
        String lowerCase;
        ?? r0;
        if (c1563990qnl == null) {
            return;
        }
        Map<String, String> map2 = c1563990qnl.LIZJ;
        ?? r6 = 0;
        boolean zLJJIIJZLJL = u.LJJIIJZLJL(c1563990qnl.LIZ, "message", false);
        Pair[] pairArr = new Pair[10];
        String strName = enumC21192517wZ.name();
        Locale locale = Locale.ROOT;
        pairArr[0] = new Pair("step", strName.toLowerCase(locale));
        String str = map2.get("role");
        Integer numLJIIJJI = null;
        if (str != null) {
            lowerCase = str.toLowerCase(locale);
        } else {
            lowerCase = null;
        }
        ?? r7 = 1;
        pairArr[1] = new Pair("role", lowerCase);
        pairArr[2] = new Pair("room_id", map2.get("room_id"));
        pairArr[3] = new Pair("product_id", map2.get("product_id"));
        String str2 = map2.get("is_page_visible");
        if (str2 != null) {
            r0 = Boolean.parseBoolean(str2);
        } else {
            r0 = 1;
        }
        pairArr[4] = new Pair("is_page_visible", Integer.valueOf((int) r0));
        String str3 = map2.get("is_keyboard_showing");
        if (str3 != null) {
            r6 = Boolean.parseBoolean(str3);
        }
        pairArr[5] = new Pair("is_keyboard_showing", Integer.valueOf((int) r6));
        String str4 = map2.get("has_ec_perm");
        if (str4 != null) {
            r7 = Boolean.parseBoolean(str4);
        }
        pairArr[6] = new Pair("has_ec_perm", Integer.valueOf((int) r7));
        pairArr[7] = new Pair("is_from_message", Integer.valueOf(zLJJIIJZLJL ? 1 : 0));
        String str5 = map2.get("card_type");
        if (str5 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str5);
        }
        pairArr[8] = new Pair("card_type", numLJIIJJI);
        pairArr[9] = new Pair("code_type", LIZ());
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && !mapLJIIJ.containsKey(key)) {
                mapLJIIJ.put(key, value);
            }
        }
        LJIIIIZZ(mapLJIIJ, c1563990qnl);
    }

    public static void LJ(EnumC21192517wZ enumC21192517wZ, String str, String str2, Integer num, String str3, C1563990qnl c1563990qnl) {
        try {
            if (Intrinsics.LJFF(C1865520ye6.LIZ("rd_ttec_pin_card_event"), Boolean.FALSE)) {
                return;
            }
            LJIIIIZZ(C2097608Jq.LJIIJ(new Pair("step", enumC21192517wZ.name().toLowerCase(Locale.ROOT)), new Pair("room_id", str), new Pair("product_id", str2), new Pair("card_type", num), new Pair("extra", str3), new Pair("code_type", LIZ())), c1563990qnl);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJII(EnumC21192517wZ enumC21192517wZ, String str, String str2, boolean z, Integer num, String str3, C1563990qnl c1563990qnl) {
        try {
            if (Intrinsics.LJFF(C1865520ye6.LIZ("rd_ttec_pin_card_event"), Boolean.FALSE)) {
                return;
            }
            LJIIIIZZ(C2097608Jq.LJIIJ(new Pair("step", enumC21192517wZ.name().toLowerCase(Locale.ROOT)), new Pair("room_id", str), new Pair("product_id", str2), new Pair("is_from_message", Integer.valueOf(z ? 1 : 0)), new Pair("card_type", num), new Pair("step_extra", str3), new Pair("code_type", LIZ())), c1563990qnl);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZLLL(EnumC21192517wZ enumC21192517wZ, String str, String str2, boolean z, boolean z2, boolean z3, Integer num, C1563990qnl c1563990qnl) {
        try {
            if (Intrinsics.LJFF(C1865520ye6.LIZ("rd_ttec_pin_card_event"), Boolean.FALSE)) {
                return;
            }
            String strName = enumC21192517wZ.name();
            Locale locale = Locale.ROOT;
            LJIIIIZZ(C2097608Jq.LJIIJ(new Pair("step", strName.toLowerCase(locale)), new Pair("role", str.toLowerCase(locale)), new Pair("room_id", str2), new Pair("product_id", null), new Pair("is_page_visible", Integer.valueOf(z ? 1 : 0)), new Pair("is_keyboard_showing", Integer.valueOf(z2 ? 1 : 0)), new Pair("has_ec_perm", Integer.valueOf(z3 ? 1 : 0)), new Pair("is_from_message", 0), new Pair("card_type", num), new Pair("code_type", LIZ())), c1563990qnl);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJFF(EnumC21192517wZ enumC21192517wZ, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Integer num, C1563990qnl c1563990qnl) {
        try {
            if (Intrinsics.LJFF(C1865520ye6.LIZ("rd_ttec_pin_card_event"), Boolean.FALSE)) {
                return;
            }
            String strName = enumC21192517wZ.name();
            Locale locale = Locale.ROOT;
            LJIIIIZZ(C2097608Jq.LJIIJ(new Pair("step", strName.toLowerCase(locale)), new Pair("role", str.toLowerCase(locale)), new Pair("room_id", str2), new Pair("product_id", str3), new Pair("is_page_visible", Integer.valueOf(z ? 1 : 0)), new Pair("is_keyboard_showing", Integer.valueOf(z2 ? 1 : 0)), new Pair("has_ec_perm", Integer.valueOf(z3 ? 1 : 0)), new Pair("is_from_message", Integer.valueOf(z4 ? 1 : 0)), new Pair("card_type", num), new Pair("code_type", LIZ())), c1563990qnl);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJI(EnumC21192917wd enumC21192917wd, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Integer num, C1563990qnl c1563990qnl) {
        try {
            String strName = enumC21192917wd.name();
            Locale locale = Locale.ROOT;
            C1421105hJ.LIZLLL("rd_tiktokec_live_popup_card_show", new Pair("step", strName.toLowerCase(locale)), new Pair("role", str.toLowerCase(locale)), new Pair("room_id", str2), new Pair("product_id", str3), new Pair("is_page_visible", Integer.valueOf(z ? 1 : 0)), new Pair("is_keyboard_showing", Integer.valueOf(z2 ? 1 : 0)), new Pair("has_ec_perm", Integer.valueOf(z3 ? 1 : 0)), new Pair("is_from_message", Integer.valueOf(z4 ? 1 : 0)), new Pair("card_type", num));
            LJFF(LJIIIZ(enumC21192917wd), str, str2, str3, z, z2, z3, z4, num, c1563990qnl);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
