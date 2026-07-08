package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0Zyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917290Zyh {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static EnumC918970a1P LJIIIZ;
    public static final C917290Zyh LIZ = new C917290Zyh();
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(305));
    public static boolean LJIIJJI = true;
    public static String LJIIL = "";
    public static String LJIILIIL = "";

    public static Room LIZ() {
        return (Room) LJIIJ.getValue();
    }

    public static void LJIIJJI() {
        boolean z = LIZLLL;
        if (z == (!LJ)) {
            LJIIIIZZ(z ? "fixed" : "unfixed", LJIILIIL);
        }
        boolean z2 = LIZIZ;
        if (z2 == (!LIZJ)) {
            LJII(z2 ? "float" : "grid", LJIILIIL);
        }
        LIZIZ = false;
        LIZJ = false;
        LIZLLL = false;
        LJ = false;
        LJFF = false;
        LJIIJJI = true;
        LJI = 0L;
        LJII = 0L;
        LJIIL = "";
        LJIILIIL = "";
    }

    public static String LIZIZ(List list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (i != 0) {
                    arrayList.add(obj);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(177), 30);
    }

    public static void LJFF(String str) {
        long id;
        String idStr;
        InterfaceC2262081DgM currentUser;
        if (LJIIIIZZ == 0) {
            return;
        }
        Pair pairLJII = C917520Zz4.LJII(LJIIIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_layout_type_duration_onstage");
        c474500IjALIZ.LJIL();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        Room roomLIZ = LIZ();
        if (roomLIZ != null) {
            idStr = roomLIZ.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII(str, "trigger");
        c474500IjALIZ.LJJII(pairLJII.getFirst(), "layout_setting");
        c474500IjALIZ.LJJII(pairLJII.getSecond(), "window_setting");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LJIIIIZZ), "duration");
        C917650ZzH.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        LJIIIIZZ = 0L;
    }

    public static void LJI(String str) {
        String idStr;
        InterfaceC2262081DgM currentUser;
        long id = 0;
        if (LJIIIIZZ != 0) {
            return;
        }
        LJIIIIZZ = System.currentTimeMillis();
        EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
        LJIIIZ = enumC918970a1PLJIILIIL;
        Pair pairLJII = C917520Zz4.LJII(enumC918970a1PLJIILIIL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_layout_type_start_onstage");
        c474500IjALIZ.LJIL();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        Room roomLIZ = LIZ();
        if (roomLIZ != null) {
            idStr = roomLIZ.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII(str, "trigger");
        c474500IjALIZ.LJJII(pairLJII.getFirst(), "layout_setting");
        c474500IjALIZ.LJJII(pairLJII.getSecond(), "window_setting");
        C917650ZzH.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static final void LJIILIIL(boolean z) {
        if (z) {
            if (!LIZLLL) {
                boolean zLJIIIIZZ = LJIIIIZZ("unfixed", LJIILIIL);
                LIZJ("livesdk_anchor_window_type_start", "fixed", LJIIL, false, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                LJI = jCurrentTimeMillis;
                if (zLJIIIIZZ || jCurrentTimeMillis != 0) {
                    LIZLLL = true;
                    LJ = false;
                    return;
                }
                return;
            }
            return;
        }
        if (LJ) {
            return;
        }
        boolean zLJIIIIZZ2 = LJIIIIZZ("fixed", LJIILIIL);
        if (!LJIIJJI || LJFF) {
            LIZJ("livesdk_anchor_window_type_start", "unfixed", LJIIL, false, true);
            LJI = System.currentTimeMillis();
        }
        if (!zLJIIIIZZ2 && LJI == 0) {
            return;
        }
        LIZLLL = false;
        LJ = true;
        if (!LJIIJJI) {
            return;
        }
        LJ = false;
    }

    public final void LJIIJ(boolean z) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
        if (multiLiveAnchorPanelSettings == null) {
            return;
        }
        EnumC918990a1R enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettings);
        if (z) {
            if (enumC918990a1RLIZ != null) {
                int i = C916550ZxV.LIZ[enumC918990a1RLIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        LJIIIZ(EnumC918990a1R.ZOOM_GRID_GUEST, false);
                        return;
                    }
                    return;
                }
                LJIIIZ(EnumC918990a1R.ZOOM_PANEL, false);
                return;
            }
            return;
        }
        if (enumC918990a1RLIZ == null) {
            return;
        }
        int i2 = C916550ZxV.LIZ[enumC918990a1RLIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            LJIIIZ(EnumC918990a1R.GRID_FLOAT, false);
            return;
        }
        LJIIIZ(EnumC918990a1R.FLOAT, false);
    }

    public static boolean LJII(String str, String str2) {
        if (LJII == 0) {
            return false;
        }
        LIZJ("livesdk_anchor_layout_type_duration", str, str2, true, false);
        LJII = 0L;
        return true;
    }

    public static boolean LJIIIIZZ(String str, String str2) {
        if (LJI == 0) {
            return false;
        }
        LIZJ("livesdk_anchor_window_type_duration", str, str2, true, true);
        LJI = 0L;
        return true;
    }

    public static final void LJIIL(boolean z, boolean z2) {
        String str = "float";
        if (z) {
            if (!LIZIZ) {
                boolean zLJII = LJII("grid", LJIILIIL);
                if (z2 || !LJIIJJI || LJFF) {
                    LIZJ("livesdk_anchor_layout_type_start", "float", LJIIL, false, false);
                    LJII = System.currentTimeMillis();
                }
                if (zLJII || LJII != 0) {
                    LIZIZ = true;
                    LIZJ = false;
                    if (!z2 && LJIIJJI) {
                        LIZIZ = false;
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (!LIZJ) {
            boolean zLJII2 = LJII("float", LJIILIIL);
            if (z2 || !LJIIJJI || LJFF) {
                LIZJ("livesdk_anchor_layout_type_start", "grid", LJIIL, false, false);
                LJII = System.currentTimeMillis();
            }
            if (!zLJII2 && LJII == 0) {
                return;
            }
            LIZIZ = false;
            LIZJ = true;
            if (z2 || !LJIIJJI) {
                return;
            }
            LIZJ = false;
            return;
        }
        if (!LJIIJJI || z2 || LJII == 0) {
            return;
        }
        if (LIZJ) {
            str = "grid";
        }
        LJII(str, LJIILIIL);
        LIZIZ = false;
        LIZJ = false;
    }

    public final void LJIIIZ(EnumC918990a1R enumC918990a1R, boolean z) {
        int i;
        LJFF = z;
        if (enumC918990a1R == null) {
            i = -1;
        } else {
            i = C916550ZxV.LIZ[enumC918990a1R.ordinal()];
        }
        switch (i) {
            case 1:
                LJIILIIL(false);
                LJIIL(true, false);
                break;
            case 2:
                LJIILIIL(false);
                LJIIL(false, false);
                break;
            case 3:
                LJIILIIL(true);
                LJIIL(true, true);
                break;
            case 4:
                LJIILIIL(true);
                LJIIL(false, true);
                break;
            case 5:
                LJIIL = "enlarge_guest";
                LJIILIIL = "enlarge_guest";
                LJIILIIL(true);
                LJIIL(true, true);
                break;
            case 6:
            case 7:
                LJIIL = "enlarge_guest";
                LJIILIIL = "enlarge_guest";
                LJIILIIL(true);
                LJIIL(false, true);
                break;
            default:
                LJIIL = "";
                break;
        }
        LJFF("switch_layout");
        if (C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()) > 0) {
            LJI("switch_layout");
        }
    }

    public static void LJ(int i, Integer num, String str) {
        String idStr;
        long id;
        InterfaceC2262081DgM currentUser;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_bonus_setting_icon");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "action_type");
        Room roomLIZ = LIZ();
        if (roomLIZ != null) {
            idStr = roomLIZ.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(i), "guest_cnt");
        c474500IjALIZ.LJJII(C917750ZzR.LJFF(num), "bonus_type");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        C917650ZzH.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(int i, Integer num, Integer num2, String str) {
        String idStr;
        long id;
        InterfaceC2262081DgM currentUser;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_bonus_page");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "action_type");
        Room roomLIZ = LIZ();
        if (roomLIZ != null) {
            idStr = roomLIZ.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(i), "guest_cnt");
        if (num != null) {
            c474500IjALIZ.LJJII(C917750ZzR.LJFF(num), "bonus_type");
        }
        if (num2 != null) {
            c474500IjALIZ.LJJII(C917750ZzR.LJFF(num2), "switch_to");
        }
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        C917650ZzH.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, String str2, String str3, boolean z, boolean z2) {
        long id;
        String idStr;
        InterfaceC2262081DgM currentUser;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        Room roomLIZ = LIZ();
        if (roomLIZ != null) {
            idStr = roomLIZ.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII(str3, "trigger");
        C917650ZzH.LIZJ(c474500IjALIZ);
        if (z2) {
            c474500IjALIZ.LJJII(str2, "window_type");
            if (z) {
                c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LJI), "duration");
                c474500IjALIZ.LIZ();
                return;
            } else {
                c474500IjALIZ.LIZ();
                return;
            }
        }
        c474500IjALIZ.LJJII(str2, "layout_type");
        if (z) {
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LJII), "duration");
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LIZ();
        }
    }
}
