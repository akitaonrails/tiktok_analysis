package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGroupLiveRoomStatusSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128450fTH {
    public static final IInteractService LIZ = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
    public static final IGameLinkMicService LIZIZ = (IGameLinkMicService) C1161920gLG.LIZJ(IGameLinkMicService.class);
    public static final ILiveMatchService LIZJ = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
    public static final ILiveCompetitionExternalService LIZLLL = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);

    public static List LIZIZ() {
        return LIZ.nr2();
    }

    public static long LIZJ() {
        return LIZ.getBattleId();
    }

    public static String LIZLLL() {
        return LIZ.getConnectionType();
    }

    public static String LJ() {
        return LIZ.xw0();
    }

    public static String LJFF() {
        return LIZ.Fc2();
    }

    public static List LJIIIIZZ() {
        return LIZ.tH2();
    }

    @InterfaceC1294060jmO
    public static EnumC919050a1X LJIIIZ() {
        return (LiveGiftGroupLiveRoomStatusSettings.INSTANCE.isDisabled() && C2868019e.LIZIZ(null)) ? EnumC919050a1X.GROUP_LIVE : ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() ? EnumC919050a1X.LINE_UP : LIZ.He2(LIZLLL()) ? EnumC919050a1X.LINK_MIC_PK : LJII((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) > 0 ? EnumC919050a1X.LINK_MIC_GUEST : LJJIIJ() ? EnumC919050a1X.LINK_MIC_ANCHOR : C2868019e.LIZIZ(null) ? EnumC919050a1X.GROUP_LIVE : EnumC919050a1X.NORMAL_VIDEO;
    }

    public static EnumC919050a1X LJIIJ() {
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) {
            return EnumC919050a1X.LINE_UP;
        }
        IInteractService iInteractService = LIZ;
        return iInteractService.He2(LIZLLL()) ? EnumC919050a1X.LINK_MIC_PK : ((ArrayList) LJIILL()).isEmpty() ^ true ? EnumC919050a1X.LINK_MIC_GUEST : (LJJIIJ() && iInteractService.n30()) ? EnumC919050a1X.LINK_MIC_ANCHOR : C2868019e.LIZIZ(null) ? EnumC919050a1X.GROUP_LIVE : EnumC919050a1X.NORMAL_VIDEO;
    }

    public static long LJIIJJI() {
        InterfaceC973730bRj interfaceC973730bRjYf2 = LIZJ.yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            return interfaceC973730bRjYf2.LJJL();
        }
        return 0L;
    }

    public static Map LJIIL() {
        return LIZ.getMatchLogParams();
    }

    public static long LJIILIIL() {
        InterfaceC973730bRj interfaceC973730bRjYf2 = LIZJ.yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            return interfaceC973730bRjYf2.LJJJJJ();
        }
        return 0L;
    }

    public static final Pair<String, String> LJIILJJIL() {
        return LIZ.w72();
    }

    public static List LJIILL() {
        List<User> listM30 = LIZ.M30();
        ArrayList arrayList = new ArrayList();
        for (User user : listM30) {
            User user2 = user;
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null || user2.getId() != room.getOwnerUserId()) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    public static String LJIILLIIL() {
        return ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() ? "program_live" : (C1161920gLG.LIZJ(IMicRoomService.class) == null || !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) ? LIZ.Fc2() : "video_anchor_order";
    }

    public static String LJIIZILJ() {
        ILiveMatchService iLiveMatchService = LIZJ;
        return iLiveMatchService.co0() ? iLiveMatchService.my() : "";
    }

    public static String LJIJ() {
        String str = LIZJ.oA0().get("team_member_cnts");
        return str == null ? "1" : str;
    }

    public static boolean LJIJJLI() {
        return LIZ.L20();
    }

    public static boolean LJIL() {
        return LIZ.Nt();
    }

    public static boolean LJJI() {
        return LIZ.UN0();
    }

    public static boolean LJJIFFI() {
        return LIZ.p00();
    }

    public static boolean LJJIIJ() {
        return LIZ.w9();
    }

    public static boolean LJJIIZ() {
        return LIZ.vp0();
    }

    public static boolean LJJIIZI() {
        return LIZLLL.Al1();
    }

    public static boolean LJJIJ() {
        return LJI(UserService.getInstance().user().LJIJJLI(), (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == 2;
    }

    public static long LJJIJIIJI() {
        return LIZ.B62();
    }

    public static boolean LJJIJIIJIL() {
        IInteractService iInteractService = LIZ;
        boolean zUN0 = iInteractService.UN0();
        boolean zIb2 = iInteractService.ib2();
        boolean zYa1 = iInteractService.Ya1();
        boolean z = iInteractService.LJII() >= 1;
        boolean z2 = !(zIb2 || (zYa1 && z)) || zUN0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(zIb2);
        sbLIZ.append(' ');
        sbLIZ.append(zYa1);
        sbLIZ.append(' ');
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(z2);
        sbLIZ.append(", isInCohostWithGuest=");
        sbLIZ.append(zUN0);
        C20441214yg.LIZIZ("needFilterFlyMicGift", C2188811AlT.LIZIZ(sbLIZ));
        return z2;
    }

    public static int LJII(Room room) {
        LiveMode streamType;
        Long lValueOf = null;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        if (streamType == LiveMode.LIVE_STUDIO) {
            IGameLinkMicService iGameLinkMicService = LIZIZ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            return iGameLinkMicService.GT0(String.valueOf(lValueOf));
        }
        return LIZ.LJII();
    }

    public static String LJIJI(User user) {
        int i = C915540Zvs.LIZIZ[LIZ.ND(user).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "anchor";
                }
                return "user";
            }
            return "guest";
        }
        return "user";
    }

    public static final C0JG7 LJIJJ(long j) {
        IInteractService iInteractService = LIZ;
        User user = new User();
        user.setId(j);
        return iInteractService.ND(user);
    }

    public static boolean LJJ(DataChannel dataChannel) {
        RoomLinkInfo linkMicInfo;
        RoomLinkInfo.LinkmicLayoutConfig linkmicLayoutConfig;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if ((roomLJJLIIIIJ != null || (roomLJJLIIIIJ = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null) && (linkMicInfo = roomLJJLIIIIJ.getLinkMicInfo()) != null && (linkmicLayoutConfig = linkMicInfo.layoutConfig) != null && linkmicLayoutConfig.cohostEnlargeEnabled) {
            return true;
        }
        return false;
    }

    public static boolean LJJII(long j) {
        if (LJIJJ(j) == C0JG7.GUEST_AUDIENCE) {
            return true;
        }
        return false;
    }

    public static boolean LJJIII(long j) {
        if (LJJII(j)) {
            return true;
        }
        List listLIZIZ = LIZIZ();
        if (!(listLIZIZ instanceof Collection) || !listLIZIZ.isEmpty()) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                if (((C923380a8W) it2.next()).LIZ == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJJIIJZLJL(long j) {
        List<Long> listLIZLLL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = LIZJ.yf2(false);
        if (interfaceC973730bRjYf2 == null || (listLIZLLL = interfaceC973730bRjYf2.LIZLLL()) == null) {
            listLIZLLL = C13BV.INSTANCE;
        }
        return listLIZLLL.contains(Long.valueOf(j));
    }

    @InterfaceC1294060jmO
    public static void LIZ(C474500IjA c474500IjA, Long l) {
        int size;
        IInteractService iInteractService = LIZ;
        List<String> listZP2 = iInteractService.ZP2();
        if (listZP2 != null) {
            size = listZP2.size();
        } else {
            size = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(size), "guest_cnt");
        String strLJJLIIIJ = null;
        if (size > 0) {
            if (listZP2 != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(listZP2, ",", null, null, 0, null, null, 62);
            }
            c474500IjA.LJJII(strLJJLIIIJ, "link_id_list");
        }
        if (l != null && LJJII(l.longValue())) {
            String strSE = iInteractService.sE(l.longValue());
            if (strSE == null) {
                strSE = "";
            }
            c474500IjA.LJJII(strSE, "link_id");
        }
        c474500IjA.LJJII(LJIJI(UserService.getInstance().user().LJIJJLI()), "from_user_type");
        c474500IjA.LJJII(LJIILJJIL().getFirst(), "layout_setting");
        c474500IjA.LJJII(LJIILJJIL().getSecond(), "window_setting");
    }

    public static int LJI(User user, Room room) {
        LiveMode streamType;
        User owner;
        Long lValueOf = null;
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        if (streamType == LiveMode.LIVE_STUDIO) {
            IGameLinkMicService iGameLinkMicService = LIZIZ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            return iGameLinkMicService.Lo0(user, String.valueOf(lValueOf));
        }
        if (LJJI()) {
            List listLJIIIIZZ = LJIIIIZZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
            Iterator it2 = listLJIIIIZZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C923380a8W) it2.next()).LIZ));
            }
            if (!C500260Jjc.LJJJI(Boolean.valueOf(arrayList.contains(Long.valueOf(user.getId()))))) {
                if (room != null && (owner = room.getOwner()) != null && owner.getId() == user.getId()) {
                    return 2;
                }
                return LIZ.HA(user);
            }
            return 2;
        }
        return LIZ.HA(user);
    }
}
