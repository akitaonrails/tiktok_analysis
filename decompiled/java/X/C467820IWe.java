package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.Skin;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467820IWe {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static boolean LJII;
    public static int LJIIIZ;
    public static final C0IVX LJFF = new C0IVX(0);
    public static String LJI = "";
    public static String LJIIIIZZ = "";
    public static int LJIIJ = 1;
    public static String LJIIJJI = "";
    public static String LJIIL = "";
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(94));
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(93));
    public static final C01GW LJIILL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(95));
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(92));

    public static HashMap LIZJ() {
        return (HashMap) LJIILJJIL.getValue();
    }

    public static List LIZLLL() {
        return (List) LJIILIIL.getValue();
    }

    public static void LJI() {
        if (LIZJ > 0 || LJ) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZJ = jCurrentTimeMillis;
        long j = LIZIZ;
        if (1 <= j && j < jCurrentTimeMillis) {
            LIZJ().put("request2respond_duration", String.valueOf(LIZJ - LIZIZ));
        }
        LIZJ().put("respond_timestamp", String.valueOf(LIZJ));
    }

    public static Map LIZIZ() {
        C0IVX c0ivx = (C0IVX) C13LP.LJJLIIIJL(LIZLLL());
        if (c0ivx == null) {
            c0ivx = LJFF;
        }
        return c0ivx.LIZ.length() == 0 ? c0ivx.LIZIZ.length() > 0 ? C2097908Jt.LIZJ(new Pair("drawer_from_room_id", c0ivx.LIZIZ)) : C2097608Jq.LJ() : c0ivx.LIZ();
    }

    public static Map LIZ(boolean z) {
        boolean z2;
        C0IVX c0ivx = LJFF;
        if (c0ivx.LIZ.length() > 0) {
            if (z && LIZLLL().isEmpty()) {
                return C2097608Jq.LJ();
            }
            return c0ivx.LIZ();
        }
        if (c0ivx.LIZIZ.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return C2097908Jt.LIZJ(new Pair("drawer_from_room_id", c0ivx.LIZIZ));
        }
        C0IVX c0ivx2 = (C0IVX) C13LP.LJJLIIIJL(LIZLLL());
        if (c0ivx2 != null) {
            c0ivx = c0ivx2;
        }
        if (c0ivx.LIZ.length() == 0) {
            if (c0ivx.LIZIZ.length() > 0) {
                return C2097908Jt.LIZJ(new Pair("drawer_from_room_id", c0ivx.LIZIZ));
            }
            return C2097608Jq.LJ();
        }
        return c0ivx.LIZ();
    }

    public static void LJ(boolean z) {
        if (z && LIZIZ > 0) {
            return;
        }
        LIZ = 0L;
        LIZIZ = 0L;
        LIZJ = 0L;
        LIZLLL = 0L;
        ((List) LJIILL.getValue()).clear();
        ((List) LJIILLIIL.getValue()).clear();
        LIZJ().clear();
    }

    public static void LJFF(boolean z) {
        if (LJ) {
            return;
        }
        LJ = true;
        if (z) {
            LIZJ().put("is_left_page", "1");
        } else {
            LIZJ().put("is_left_page", CardStruct.IStatusCode.DEFAULT);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_entrance_impr_duration");
        c474500IjALIZ.LJJIIZI(LIZJ());
        C01GW c01gw = LJIILL;
        c474500IjALIZ.LJJII(Integer.valueOf(((List) c01gw.getValue()).size()), "room_cnt");
        c474500IjALIZ.LJJII(c01gw.getValue().toString(), "room_id_list");
        c474500IjALIZ.LJJII(LJIILLIIL.getValue().toString(), "anchor_id_list");
        c474500IjALIZ.LJJII("drawer", "enter_from_merge");
        c474500IjALIZ.LJJII("live_cover", "enter_method");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
        LJ(false);
    }

    public static void LJII(Room room) {
        Object objValueOf;
        Skin skin;
        String str;
        C0IVX c0ivx = LJFF;
        String str2 = "";
        if (room == null) {
            objValueOf = "";
        } else {
            objValueOf = Long.valueOf(room.getId());
        }
        c0ivx.LIZIZ = objValueOf.toString();
        if (room != null && (skin = room.skin) != null && (str = skin.scene) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -885429821) {
                if (iHashCode != -413485602) {
                    if (iHashCode == -338411386 && str.equals("game_drawer_is_game") && LJII) {
                        str2 = "more_game";
                    }
                } else if (str.equals("game_drawer")) {
                    str2 = "esports";
                }
            } else if (str.equals("game_drawer_drops")) {
                str2 = "more_drops";
            }
        }
        c0ivx.LIZ = str2;
    }
}
