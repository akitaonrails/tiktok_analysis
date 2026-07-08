package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999370c75 {
    public static final C999370c75 LIZ = new C999370c75();

    public static String LIZ(EnumC999300c6y enumC999300c6y) {
        AbstractC999330c71 displayArea = enumC999300c6y.getDisplayArea();
        if (Intrinsics.LJFF(displayArea, C999360c74.LIZ)) {
            return "1";
        }
        if (Intrinsics.LJFF(displayArea, C999350c73.LIZ)) {
            return "2";
        }
        if (Intrinsics.LJFF(displayArea, C999340c72.LIZ)) {
            return "3";
        }
        return "";
    }

    public static String LIZIZ(EnumC999300c6y enumC999300c6y) {
        int i = C999290c6x.LIZ[enumC999300c6y.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "PGC schedule";
                    }
                    return "EC lynx card";
                }
                return "EC 1-line content";
            }
            return "EC promo info";
        }
        return "EC native card";
    }

    public static void LIZJ(C1ACA c1aca) {
        Set<EnumC999300c6y> set;
        List listLLIIII;
        Object objValueOf;
        LiveRoomStruct liveRoomStruct;
        User user;
        String uid;
        LiveRoomStruct liveRoomStruct2;
        String str = null;
        if (c1aca != null && (set = c1aca.LJLJL) != null && (listLLIIII = C13LP.LLIIII(set)) != null && !listLLIIII.isEmpty()) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(listLLIIII, ",", null, null, 0, null, AFwS252S0000000_16.get$arr$(391), 30);
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(listLLIIII, ",", null, null, 0, null, AFwS252S0000000_16.get$arr$(392), 30);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("container_name", strLJJLIIIJ);
            c2344009Gk.LJIIIIZZ("container_lines", strLJJLIIIJ2);
            c2344009Gk.LJIIIIZZ("click_type", "click");
            if (c1aca != null) {
                str = c1aca.LIZLLL;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from_merge", str);
            if (c1aca == null || (liveRoomStruct2 = c1aca.LIZJ) == null) {
                objValueOf = "";
            } else {
                objValueOf = Long.valueOf(liveRoomStruct2.id);
            }
            c2344009Gk.LJ(objValueOf, "room_id");
            if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && (user = liveRoomStruct.owner) != null && (uid = user.getUid()) != null) {
                str2 = uid;
            }
            c2344009Gk.LJIIIIZZ("anchor_id", str2);
            C20684815ws.LJIILLIIL("livesdk_live_cell_expansion", c2344009Gk.LIZ);
        }
    }

    public static void LIZLLL(EnumC999300c6y enumC999300c6y, C1ACA c1aca) {
        Object objValueOf;
        LiveRoomStruct liveRoomStruct;
        User user;
        String uid;
        LiveRoomStruct liveRoomStruct2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("container_name", LIZIZ(enumC999300c6y));
        c2344009Gk.LJIIIIZZ("container_lines", LIZ(enumC999300c6y));
        c2344009Gk.LJIIIIZZ("click_type", "show");
        String str = null;
        if (c1aca != null) {
            str = c1aca.LIZLLL;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from_merge", str);
        if (c1aca == null || (liveRoomStruct2 = c1aca.LIZJ) == null) {
            objValueOf = "";
        } else {
            objValueOf = Long.valueOf(liveRoomStruct2.id);
        }
        c2344009Gk.LJ(objValueOf, "room_id");
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && (user = liveRoomStruct.owner) != null && (uid = user.getUid()) != null) {
            str2 = uid;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", str2);
        C20684815ws.LJIILLIIL("livesdk_live_cell_expansion", c2344009Gk.LIZ);
    }
}
