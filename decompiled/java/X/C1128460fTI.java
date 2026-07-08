package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fTI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128460fTI {
    public static long LJI() {
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (c1095140ebYUw0 != null) {
            return c1095140ebYUw0.LIZ;
        }
        return 0L;
    }

    public static String LJII() {
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        return (c1095140ebYUw0 == null || c1095140ebYUw0.LJ != 2) ? LJI() > 0 ? "after" : "before" : "sleeping";
    }

    public static void LIZIZ(C474500IjA c474500IjA) {
        String str;
        User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str, "is_enigma");
    }

    public static void LIZJ(C474500IjA c474500IjA) {
        String str;
        String str2;
        if (C2868019e.LIZIZ(null)) {
            if (C2868019e.LIZIZ == EnumC2851018n.TIMEDCOMPETITION) {
                str = "group_show";
            } else {
                EnumC774050UXz enumC774050UXz = C2868019e.LIZJ;
                if (enumC774050UXz != null && enumC774050UXz.isViewerWishes()) {
                    str = "viewer_wishes";
                } else if (C2868019e.LIZIZ == EnumC2851018n.INROOMRANKING) {
                    str = "ranking";
                } else {
                    str = "na";
                }
            }
            c474500IjA.LJJII(str, "group_live_scene");
            if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148140fz2.class), Boolean.TRUE)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjA.LJJII(str2, "is_group_live_icy");
        }
    }

    public static void LIZLLL(C474500IjA c474500IjA) {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        C1128480fTK c1128480fTK = (C1128480fTK) DataChannelGlobal.LLILZ.gg0(C1148330fzL.class);
        String str4 = "";
        if (c1128480fTK == null) {
            numValueOf = "";
        } else {
            numValueOf = Integer.valueOf(c1128480fTK.LIZ);
        }
        c474500IjA.LJJII(numValueOf, "pk_task_type_num");
        if (c1128480fTK == null || (str = c1128480fTK.LIZIZ) == null) {
            str = "";
        }
        c474500IjA.LJJII(str, "pk_task_type");
        if (c1128480fTK == null || (str2 = c1128480fTK.LIZJ) == null) {
            str2 = "";
        }
        c474500IjA.LJJII(str2, "task_period_type");
        InterfaceC973730bRj interfaceC973730bRjYf2 = ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).yf2(false);
        if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.LJJLIIIJJI()) {
            str4 = "buff";
        } else {
            if (c1128480fTK != null) {
                str3 = c1128480fTK.LIZJ;
            } else {
                str3 = null;
            }
            if (C500260Jjc.LJJIIZ(str3)) {
                str4 = "in_progress";
            }
        }
        c474500IjA.LJJII(str4, "task_stage");
        c474500IjA.LJJII(C1140740fn6.LIZIZ().getConnectionType(), "connection_type");
        c474500IjA.LJJII(Long.valueOf(C1140740fn6.LIZIZ().getBattleId()), "pk_id");
    }

    public static String LJ(Gift gift) {
        Map<String, String> map;
        String str;
        if (gift == null || (map = gift.trackerParams) == null || (str = map.get("community_gift_status")) == null) {
            return "na";
        }
        return str;
    }

    public static String LJFF(Gift gift) {
        Map<String, String> map;
        String str;
        if (gift != null && (map = gift.trackerParams) != null && (str = map.get("community_heartme_gift_id")) != null && str.length() > 0) {
            return str;
        }
        return null;
    }

    public static int LJIIIIZZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1392885889) {
            if (iHashCode != -1385863765) {
                if (iHashCode == 92734940 && str.equals("after")) {
                    return 1;
                }
                return -1;
            }
            if (str.equals("sleeping")) {
                return 3;
            }
            return -1;
        }
        if (str.equals("before")) {
            return 0;
        }
        return -1;
    }

    public static String LJIIL(Gift gift) {
        Map<String, String> map;
        String str;
        if (gift == null || (map = gift.trackerParams) == null || (str = map.get("gift_subtype")) == null) {
            return "others";
        }
        return str;
    }

    public static String LJIILIIL(Gift gift) {
        Map<String, String> map;
        String str;
        if (gift != null && (map = gift.trackerParams) != null && (str = map.get("is_community_heartme_gift")) != null && str.length() > 0) {
            return str;
        }
        return null;
    }

    public static int LJIILJJIL(String str) {
        Map map;
        List list;
        Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.0fTJ
        }.getType();
        try {
            Gson gson = C19748512Ol.LIZJ;
            if (str == null) {
                str = "";
            }
            map = (Map) gson.LJIIIIZZ(str, type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            map = null;
        }
        if (map == null) {
            return 0;
        }
        Object obj = map.get(C1128760fTm.LJIILLIIL);
        if (!(obj instanceof List) || (list = (List) obj) == null || !(!list.isEmpty())) {
            return 0;
        }
        return 1;
    }

    public static void LIZ(C474500IjA c474500IjA, EnumC1125400fOM enumC1125400fOM) {
        if (C500260Jjc.LJJJI(Boolean.valueOf(C1128450fTH.LJJI()))) {
            if (enumC1125400fOM != null) {
                if (enumC1125400fOM != EnumC1125400fOM.GUEST_IN_ALL && enumC1125400fOM != EnumC1125400fOM.GUEST) {
                    c474500IjA.LJJII(0, "is_to_guest");
                } else {
                    c474500IjA.LJJII(1, "is_to_guest");
                }
            }
            List listLIZIZ = C1128450fTH.LIZIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C923380a8W) it2.next()).LIZ));
            }
            c474500IjA.LJJII(arrayList.toString(), "guest_id_list");
        }
        c474500IjA.LJJII(String.valueOf(C1140740fn6.LIZIZ().Uh()), "linker_mode");
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).xt1(c474500IjA);
    }

    public static String LJIIJ(Integer num, String str) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "Gift";
            }
            if (num.intValue() == 15) {
                return "Exclusive";
            }
            if (num.intValue() == 16) {
                return "Backpack";
            }
            if (num.intValue() == 14) {
                return "Reaction";
            }
            if (num.intValue() == 17) {
                return "Interactive";
            }
            if (num.intValue() == 18) {
                return "Music";
            }
        }
        if (Intrinsics.LJFF(str, "unknown")) {
            return "None";
        }
        if (str != null) {
            return str;
        }
        return "";
    }
}
