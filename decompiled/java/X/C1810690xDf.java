package X;

import android.util.SparseLongArray;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveMusicSpotlightSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0xDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810690xDf {
    public static int LJ;
    public static boolean LJFF;
    public static final C1810690xDf LIZ = new C1810690xDf();
    public static String LIZIZ = "live_play";
    public static String LIZJ = "expand";
    public static String LIZLLL = "collapse";
    public static String LJI = "";
    public static final Set<Integer> LJII = new LinkedHashSet();
    public static final HashMap<Pair<Integer, Integer>, String> LJIIIIZZ = new HashMap<>();

    public static void LIZLLL(C474500IjA c474500IjA) {
        String str;
        String strValueOf;
        int iLIZ = C1810700xDg.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                if (iLIZ != 3) {
                    str = "";
                } else {
                    str = "publicity_period";
                }
            } else {
                str = "campaign_period";
            }
        } else {
            str = "warm_up_period";
        }
        c474500IjA.LJJII(str, "activity_stage");
        c474500IjA.LJJII("ranking_banner", "banner_from");
        long jLIZIZ = C1810700xDg.LIZIZ(RankTypeV2.LJJIIZI.type, false);
        if (1 <= jLIZIZ && jLIZIZ < 100) {
            strValueOf = String.valueOf(jLIZIZ);
        } else {
            strValueOf = "99+";
        }
        c474500IjA.LJJII(strValueOf, "league_match_rank");
    }

    public static String LJI(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJIIIZ(C1842470y2v c1842470y2v) {
        Integer numValueOf;
        RankAnimationInfo rankAnimationInfo = c1842470y2v.LJI;
        if (rankAnimationInfo != null) {
            numValueOf = Integer.valueOf(rankAnimationInfo.type);
        } else {
            numValueOf = null;
        }
        int i = RankAnimationType.LJ.type;
        if (numValueOf != null && numValueOf.intValue() == i) {
            return "spotlight_highlight";
        }
        int i2 = RankAnimationType.LJIJ.type;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            return "first_highlight";
        }
        return "normal";
    }

    public static void LJJIZ(RankListV2Response.RankInfo rankInfo) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow_private_host_popup");
        c474500IjALIZ.LJJII(Long.valueOf(rankInfo.user.getId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(rankInfo.roomId), "room_id");
        c474500IjALIZ.LIZ();
    }

    public static String LJJJI(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "last";
        }
        return "this";
    }

    public static String LJJJIL(Long l) {
        if (l != null && l.longValue() == -1) {
            return "last";
        }
        return "this";
    }

    public static String LJJJJIZL(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "anchor";
        }
        return "user";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C474500IjA r6, com.bytedance.ies.sdk.datachannel.DataChannel r7) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LIZ(X.0IjA, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C474500IjA r6, com.bytedance.ies.sdk.datachannel.DataChannel r7) {
        /*
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = X.C500260Jjc.LJIIZILJ(r7)
            if (r0 == 0) goto La
            return
        La:
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel> r0 = com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel.class
            java.lang.Object r2 = r7.gg0(r0)
            X.0ebY r2 = (X.C1095140ebY) r2
            if (r2 == 0) goto L3c
            long r0 = r2.LIZ
        L16:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fans_club_level"
            r6.LJJII(r1, r0)
            if (r2 == 0) goto L39
            long r4 = r2.LIZ
            int r3 = r2.LJ
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L39
            r0 = 1
            if (r3 != r0) goto L36
            java.lang.String r1 = "1"
        L30:
            java.lang.String r0 = "fans_club_status"
            r6.LJJII(r1, r0)
            return
        L36:
            java.lang.String r1 = "3"
            goto L30
        L39:
            java.lang.String r1 = "0"
            goto L30
        L3c:
            r0 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJ(X.0IjA, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static C474500IjA LJII(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        return c474500IjALIZ;
    }

    public static void LJIIJJI(DataChannel dataChannel, C1842470y2v c1842470y2v) {
        String str;
        long ownerUserId;
        Room room;
        if (c1842470y2v.LIZ.LIZIZ.group_type != EnumC1811400xEo.E_COMMERCE.getType()) {
            return;
        }
        Set<Integer> set = LJII;
        if (set.contains(Integer.valueOf(c1842470y2v.LIZ.LIZIZ.type))) {
            return;
        }
        set.add(Integer.valueOf(c1842470y2v.LIZ.LIZIZ.type));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_sale_rank_entrance_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_self");
        c474500IjALIZ.LJJII(Long.valueOf(c1842470y2v.LJ), "author_rank");
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "author_id");
        c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        c474500IjALIZ.LJJII("live", "page_name");
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        c474500IjALIZ.LJJII(c1842470y2v.LIZ.LIZIZ.rankName, "rank_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(DataChannel dataChannel, RankListV2Response.RankView rankView) {
        Long lValueOf;
        Long lValueOf2;
        int i;
        Room room;
        RankListV2Response.RankInfo rankInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_sale_rank_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(LJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))), "is_self");
        Long lValueOf3 = null;
        if (rankView != null && (rankInfo = rankView.ownerRank) != null) {
            lValueOf = Long.valueOf(rankInfo.rank);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "author_rank");
        if (rankView != null) {
            lValueOf2 = Long.valueOf(rankView.LIZ);
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(LJJJIL(lValueOf2), "rank_period");
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf3 = Long.valueOf(room.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(lValueOf3, "author_id");
        c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        c474500IjALIZ.LJJII("live", "page_name");
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        if (rankView != null) {
            i = rankView.rankType;
        } else {
            i = RankTypeV2.LJJIJIIJI.type;
        }
        c474500IjALIZ.LJJII(C235000vU.LIZ(i, 0).rankName, "rank_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILLIIL(DataChannel dataChannel, RankListV2Response.RankInfo rankInfo) {
        boolean z;
        String str;
        String str2;
        Room room;
        String strLJI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIZ(dataChannel);
        if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1()) {
            ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Wz0(c474500IjALIZ);
        }
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(room.getId())), "server_heat_level");
            c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(room.getId())), "client_heat_level");
            c474500IjALIZ.LJJII(Long.valueOf(room.liveSubOnly), "is_sub_only_live");
            if (room.getOwner() != null && room.getOwner().isAnchorHasSubQualification()) {
                C1810690xDf c1810690xDf = LIZ;
                Boolean boolValueOf = Boolean.valueOf(room.getOwner().isSubscribed());
                c1810690xDf.getClass();
                strLJI = LJI(boolValueOf);
            } else {
                strLJI = "-1";
            }
            c474500IjALIZ.LJJII(strLJI, "is_subscription");
            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
        }
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, dataChannel, "user_live_follow"));
        if (Intrinsics.LJFF(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "manual_pk")) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                str2 = "pk_phase";
            } else {
                str2 = LiveCenterMockToolSwitch.PUNISH;
            }
            c474500IjALIZ.LJJII(str2, "match_status");
            c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(iLiveHostCrossRoomEventHelper.getIsTransfer()), "is_transfer");
        c474500IjALIZ.LJJII(Long.valueOf(iLiveHostCrossRoomEventHelper.getIsMatchOpponent()), "is_match_opponent");
        if (C924810aAp.LJ().LJJII > 0) {
            z = true;
        } else {
            z = false;
        }
        String strLJI2 = LJI(Boolean.valueOf(z));
        if (!Intrinsics.LJFF(Boolean.valueOf(C497740JfY.LJIL()), Boolean.FALSE)) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(LJI(Boolean.valueOf(Intrinsics.LJFF(w.LJIIL(), "portal"))), "is_portal_user");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJ()), "portal_id");
        c474500IjALIZ.LJJII("live_audience_c_anchor", "request_page");
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "connection_type");
        c474500IjALIZ.LJJII("private_host_follow", "click_user_position");
        c474500IjALIZ.LJJII(Long.valueOf(rankInfo.user.getId()), "to_user_id");
        c474500IjALIZ.LJJII(strLJI2, "is_guest_connection");
        c474500IjALIZ.LJJII(str, "room_orientation");
        c474500IjALIZ.LJJIIZI(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(Long.valueOf(rankInfo.user.getId())));
        c474500IjALIZ.LIZ();
    }

    public static void LJIIZILJ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_discover_creator_button_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII("friends_ranking", "event_page");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_discover_creator_button_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII("friends_ranking", "event_page");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJI(DataChannel dataChannel, String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pk_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII("quick_match", "icon_style");
        c474500IjALIZ.LJJII(str, "request_from");
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null && iInteractService.L6()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_enlarge_mode");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(com.bytedance.ies.sdk.datachannel.DataChannel r5, X.C1842470y2v r6) {
        /*
            X.0xDD r0 = r6.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r3 = r0.LIZIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJJIIJZLJL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            com.bytedance.android.livesdk.model.message.RankAnimationInfo r0 = r6.LJI
            r4 = 0
            if (r0 == 0) goto L3f
            int r0 = r0.type
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L18:
            com.bytedance.android.livesdk.rank.api.RankAnimationType r0 = com.bytedance.android.livesdk.rank.api.RankAnimationType.LIZJ
            int r1 = r0.type
            if (r2 == 0) goto L24
            int r0 = r2.intValue()
            if (r0 == r1) goto L30
        L24:
            com.bytedance.android.livesdk.rank.api.RankAnimationType r0 = com.bytedance.android.livesdk.rank.api.RankAnimationType.LIZLLL
            int r1 = r0.type
            if (r2 == 0) goto L4a
            int r0 = r2.intValue()
            if (r0 != r1) goto L4a
        L30:
            java.util.Set<java.lang.Integer> r1 = X.C1810690xDf.LJII
            int r0 = r3.type
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L41
            return
        L3f:
            r2 = r4
            goto L18
        L41:
            int r0 = r3.type
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
        L4a:
            java.lang.String r0 = "livesdk_music_spotlight_entrance_show"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            r3.LJIJJLI(r5)
            LIZ(r3, r5)
            java.lang.String r1 = LJIIIZ(r6)
            java.lang.String r0 = "entrance_status"
            r3.LJJII(r1, r0)
            com.bytedance.android.livesdk.livesetting.rank.LiveRankEntranceSplitSetting r2 = com.bytedance.android.livesdk.livesetting.rank.LiveRankEntranceSplitSetting.INSTANCE
            boolean r0 = r2.isSplitEnabled()
            if (r0 == 0) goto La0
            java.lang.String r1 = "independent"
        L69:
            java.lang.String r0 = "entrance_style"
            r3.LJJII(r1, r0)
            boolean r0 = r2.isSplitEnabled()
            if (r0 == 0) goto L9d
            java.lang.String r1 = X.C1810690xDf.LIZLLL
        L76:
            java.lang.String r0 = "entry_display_mode"
            r3.LJJII(r1, r0)
            com.bytedance.android.livesdk.livesetting.rank.LiveMusicSpotlightSetting r0 = com.bytedance.android.livesdk.livesetting.rank.LiveMusicSpotlightSetting.INSTANCE
            java.lang.String r1 = r0.getCreatorTypeName()
            java.lang.String r0 = "music_anchor_type"
            r3.LJJII(r1, r0)
            if (r5 == 0) goto L90
            boolean r0 = X.C500260Jjc.LJIIZILJ(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L90:
            java.lang.String r1 = LJJJJIZL(r4)
            java.lang.String r0 = "normal_user_type"
            r3.LJJII(r1, r0)
            r3.LIZ()
            return
        L9d:
            java.lang.String r1 = X.C1810690xDf.LIZJ
            goto L76
        La0:
            java.lang.String r1 = "carousel"
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJJII(com.bytedance.ies.sdk.datachannel.DataChannel, X.0y2v):void");
    }

    public static void LJJIJIL(DataChannel dataChannel, C1810410xDD c1810410xDD) {
        long ownerUserId;
        Boolean boolValueOf;
        Room room;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hourly_rank_entrance_key_ranking_show");
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(LJJJJIZL(boolValueOf), "user_type");
        c474500IjALIZ.LJJII(c1810410xDD.LIZIZ.rankName, "rank_type");
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        c474500IjALIZ.LJJII(Long.valueOf(C1810700xDg.LIZIZ(c1810410xDD.LIZIZ.type, false)), "anchor_rank_index");
        c474500IjALIZ.LJJII(Integer.valueOf(LJFF ? 1 : 0), "is_final_rank");
        c474500IjALIZ.LJJII(1, "is_fully_display");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJL(DataChannel dataChannel, boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ranking_league_bottom_bar");
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(LJJJJIZL(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))), "user_type");
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJJJI(EnumC1811400xEo enumC1811400xEo, EnumC1100320eju enumC1100320eju) {
        String str;
        if (enumC1100320eju == EnumC1100320eju.EXPAND) {
            str = "expand";
        } else {
            str = "collapse";
        }
        if (enumC1811400xEo != null) {
            int i = C1811390xEn.LIZ[enumC1811400xEo.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    LIZLLL = str;
                    return;
                }
            } else {
                LIZJ = str;
                return;
            }
        }
        LIZJ = str;
    }

    public static void LIZJ(Map map, C1810410xDD c1810410xDD, DataChannel dataChannel) {
        LIZIZ(map, c1810410xDD.LIZIZ, c1810410xDD.LIZ, c1810410xDD.LJ, dataChannel);
    }

    public static void LJFF(C474500IjA c474500IjA, DataChannel dataChannel, Long l) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjA.LJJII(String.valueOf(jLongValue), "anchor_community_level");
        LJ(c474500IjA, dataChannel);
    }

    public static String LJIIIIZZ(RankTypeV2 rankTypeV2, EnumC1811400xEo enumC1811400xEo, DataChannel dataChannel) {
        if (C500260Jjc.LJIIZILJ(dataChannel) && enumC1811400xEo == EnumC1811400xEo.GAME_RANK && C1810700xDg.LIZLLL(dataChannel) != 1) {
            return "2";
        }
        if (C500260Jjc.LJIIZILJ(dataChannel) && enumC1811400xEo == EnumC1811400xEo.GIFT_RANK && C1810700xDg.LJ(dataChannel) != 1) {
            return "2";
        }
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        if (C1810700xDg.LIZIZ(rankTypeV2.type, false) >= 0) {
            long jLIZIZ = C1810700xDg.LIZIZ(rankTypeV2.type, false);
            if (1 <= jLIZIZ && jLIZIZ < 100) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static void LJIILL(RankListV2Response.RankView rankView, DataChannel dataChannel, String str) {
        Long lValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            linkedHashMap.put("user_type", "anchor");
        } else {
            w.LIZ.getClass();
            linkedHashMap.put("enter_from_merge", w.LJIIIZ());
            linkedHashMap.put("enter_method", w.LJIIL());
            linkedHashMap.put("user_type", "user");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_faq_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "event_page");
        if (rankView != null) {
            lValueOf = Long.valueOf(rankView.LIZ);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(LJJJIL(lValueOf), "rank_period");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJ(DataChannel dataChannel, String str, boolean z) {
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pk_icon_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII("quick_match", "icon_style");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_clickable");
        c474500IjALIZ.LJJII(str, "request_from");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(com.bytedance.android.livesdk.rank.api.RankTypeV2 r7, com.bytedance.ies.sdk.datachannel.DataChannel r8, java.lang.String r9) {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r6 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r6
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 0
            if (r6 == 0) goto Lb6
            long r0 = r6.getOwnerUserId()
        L17:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            if (r6 == 0) goto L21
            long r4 = r6.getId()
        L21:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "anchor_id"
            r3.put(r0, r2)
            java.lang.String r0 = "room_id"
            r3.put(r0, r1)
            r4 = 0
            if (r8 == 0) goto Lb4
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = X.C751980Tee.LIZJ(r8)
            if (r0 == 0) goto Lb4
            int[] r1 = X.C1811390xEn.LIZIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
        L40:
            r2 = 1
            if (r1 == r2) goto Lb1
            r0 = 2
            if (r1 == r0) goto Lae
            java.lang.String r1 = "third_party"
        L48:
            java.lang.String r0 = "live_type"
            r3.put(r0, r1)
            if (r8 == 0) goto L9d
            boolean r0 = X.C500260Jjc.LJIIZILJ(r8)
            if (r0 != r2) goto L9d
        L55:
            boolean r0 = X.C500260Jjc.LJIIZILJ(r8)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L5d:
            java.lang.String r1 = LJJJJIZL(r4)
            java.lang.String r0 = "user_type"
            r3.put(r0, r1)
            java.lang.String r1 = r7.rankName
            java.lang.String r0 = "rank_type"
            r3.put(r0, r1)
            if (r9 != 0) goto L71
            java.lang.String r9 = ""
        L71:
            java.lang.String r0 = "notice_type"
            r3.put(r0, r9)
            java.lang.String r0 = "livesdk_rank_notice_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJIJJLI(r8)
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJIJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L96
            com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting r0 = com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting.INSTANCE
            boolean r0 = r0.isInBonusTime()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_bonus_time"
            r2.LJJII(r1, r0)
        L96:
            r2.LJJIIZI(r3)
            r2.LIZ()
            return
        L9d:
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r1 = qo2.w.LIZLLL()
            java.lang.String r0 = "action_type"
            r3.put(r0, r1)
            if (r8 == 0) goto L5d
            goto L55
        Lae:
            java.lang.String r1 = "screen_share"
            goto L48
        Lb1:
            java.lang.String r1 = "video_live"
            goto L48
        Lb4:
            r1 = -1
            goto L40
        Lb6:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJJIII(com.bytedance.android.livesdk.rank.api.RankTypeV2, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):void");
    }

    public static void LJJIIJZLJL(DataChannel dataChannel, boolean z, RankListV2Response.RankInfo rankInfo) {
        long ownerUserId;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rank", String.valueOf(rankInfo.rank));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id = 0;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        linkedHashMap.put("anchor_id", String.valueOf(ownerUserId));
        if (room != null) {
            id = room.getId();
        }
        linkedHashMap.put("room_id", String.valueOf(id));
        linkedHashMap.put("enter_from", "click");
        if (z) {
            linkedHashMap.put("user_type", "anchor");
        } else {
            w.LIZ.getClass();
            linkedHashMap.put("enter_from_merge", w.LJIIIZ());
            linkedHashMap.put("enter_method", w.LJIIL());
            linkedHashMap.put("user_type", "user");
        }
        C474500IjA c474500IjALJII = LJII("livesdk_live_rank_click", linkedHashMap);
        c474500IjALJII.LJIJJLI(dataChannel);
        c474500IjALJII.LIZ();
    }

    public static void LJJIJ(RankTypeV2 rankTypeV2, DataChannel dataChannel, String str) {
        Boolean boolValueOf;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_entrance_status_switch");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(LiveMusicSpotlightSetting.INSTANCE.getCreatorTypeName(), "music_anchor_type");
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(LJJJJIZL(boolValueOf), "normal_user_type");
        if (rankTypeV2 == null || (str2 = rankTypeV2.rankName) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "rank_type");
        c474500IjALIZ.LJJII(str, "switch_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJLIJ(RankTypeV2 rankTypeV2, DataChannel dataChannel, String str) {
        Boolean boolValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_notice_click");
        LIZ(c474500IjALIZ, dataChannel);
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(LJJJJIZL(boolValueOf), "user_type");
        c474500IjALIZ.LJJII(rankTypeV2.rankName, "rank_type");
        c474500IjALIZ.LJJII(str, "notice_type");
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
            c474500IjALIZ.LJJII(Integer.valueOf(LivePopularityRankingBonusTimeSetting.INSTANCE.isInBonusTime() ? 1 : 0), "is_bonus_time");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJIL(RankTypeV2 rankTypeV2, RankListV2Response.RankInfo rankInfo, DataChannel dataChannel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_merge", "live_detail");
        linkedHashMap.put("enter_method", rankTypeV2.rankName);
        linkedHashMap.put("anchor_id", String.valueOf(rankInfo.user.getId()));
        linkedHashMap.put("room_id", String.valueOf(rankInfo.roomId));
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("is_return", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("content_type", rankTypeV2.rankName);
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        linkedHashMap.put("from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        linkedHashMap.put("from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        Long l = rankInfo.user.followStatus;
        if (l != null) {
            linkedHashMap.put("initial_follow_status", String.valueOf(l.longValue()));
        }
        linkedHashMap.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
        C474500IjA c474500IjALJII = LJII("livesdk_live_show", linkedHashMap);
        c474500IjALJII.LJIJJLI(dataChannel);
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            c474500IjALJII.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
        }
        c474500IjALJII.LIZ();
    }

    public static void LJIILIIL(DataChannel dataChannel, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_switch_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("live", "page_name");
        c474500IjALIZ.LJJII("sale_rank", "switch_name");
        c474500IjALIZ.LJJII(str, "live_status");
        if (str2 == null) {
            str2 = "more_page_setting";
        }
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(str3, "result");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(X.C1810410xDD r4, com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankView r5, com.bytedance.ies.sdk.datachannel.DataChannel r6, java.lang.String r7) {
        /*
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            LIZJ(r2, r4, r6)
            java.lang.String r0 = "livesdk_faq_enter_click"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            r3.LJIJJLI(r6)
            LIZ(r3, r6)
            r4 = 0
            if (r6 == 0) goto L77
            boolean r0 = X.C500260Jjc.LJIIZILJ(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L1f:
            java.lang.String r1 = LJJJJIZL(r0)
            java.lang.String r0 = "user_type"
            r3.LJJII(r1, r0)
            java.lang.String r0 = "event_page"
            r3.LJJII(r7, r0)
            if (r5 == 0) goto L75
            long r0 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L35:
            java.lang.String r1 = LJJJIL(r0)
            java.lang.String r0 = "rank_period"
            r3.LJJII(r1, r0)
            r1 = 1
            if (r5 == 0) goto L6d
            java.util.List<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo> r0 = r5.ranks
            if (r0 == 0) goto L5f
            int r0 = r0.size()
            if (r0 != 0) goto L5f
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = LJI(r0)
            java.lang.String r0 = "is_empty"
            r3.LJJII(r1, r0)
            r3.LJJIIZI(r2)
            r3.LIZ()
            return
        L5f:
            webcast.api.ranklist.RankExtraInfo r0 = r5.rankExtraInfo
            if (r0 == 0) goto L6d
            webcast.api.ranklist.HallOfFameRankExtra r0 = r0.hallOfFameRankExtra
            if (r0 == 0) goto L6d
            boolean r0 = r0.isFirstDay
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L6d:
            boolean r0 = X.C500260Jjc.LJJJI(r4)
            if (r0 != 0) goto L4b
            r1 = 0
            goto L4b
        L75:
            r0 = r4
            goto L35
        L77:
            r0 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJIILJJIL(X.0xDD, com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):void");
    }

    public static void LJIJJLI(DataChannel dataChannel, String str, String str2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_invite_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "invitee_list");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII("anchor", "connection_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_clickable");
        c474500IjALIZ.LIZ();
    }

    public static void LJIL(DataChannel dataChannel, String str, String str2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_invite_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "invitee_list");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII("manual_pk", "connection_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_clickable");
        c474500IjALIZ.LIZ();
    }

    public static void LJJ(RankTypeV2 rankTypeV2, boolean z, DataChannel dataChannel, boolean z2) {
        EnumC1090760eUU unAvailableClickReason;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (unAvailableClickReason = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
            unAvailableClickReason = EnumC1090760eUU.UNKNOWN;
        }
        iGiftService.monitorGiftIconShow(dataChannel, z, unAvailableClickReason, LJJJJIZL(Boolean.valueOf(z2)), rankTypeV2.rankName, C924810aAp.LJ().LJJII);
    }

    public static void LJJI(C1810410xDD c1810410xDD, RankListV2Response.RankView rankView, DataChannel dataChannel, String str) {
        boolean z;
        Boolean boolValueOf;
        RankListV2Response.RankInfo rankInfo;
        RankListV2Response.TeamRankExtra teamRankExtra;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RankTypeV2 rankTypeV2 = c1810410xDD.LIZIZ;
        EnumC1811400xEo enumC1811400xEo = c1810410xDD.LIZ;
        if (rankView != null && rankView.LIZ == -1) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(linkedHashMap, rankTypeV2, enumC1811400xEo, z, dataChannel);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_historical_weekly_rank_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        Long lValueOf = null;
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(LJJJJIZL(boolValueOf), "user_type");
        c474500IjALIZ.LJJII(c1810410xDD.LIZIZ.rankName, "rank_type");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJII(str, "entrance_ui_style");
        if (Intrinsics.LJFF(c1810410xDD.LIZIZ, RankTypeV2.LJIJJLI)) {
            C1810690xDf c1810690xDf = LIZ;
            if (rankView != null && (rankInfo = rankView.ownerRank) != null && (teamRankExtra = rankInfo.teamRankExtra) != null) {
                lValueOf = Long.valueOf(teamRankExtra.communityLevel);
            }
            c1810690xDf.getClass();
            LJFF(c474500IjALIZ, dataChannel, lValueOf);
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo r14, X.C1790680whO r15, boolean r16, com.bytedance.ies.sdk.datachannel.DataChannel r17) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJJIIJ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo, X.0whO, boolean, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LJJIIZI(C1810410xDD c1810410xDD, DataChannel dataChannel, String str, boolean z) {
        String str2;
        Boolean bool;
        String str3;
        String str4;
        if (z) {
            Set<Integer> set = LJII;
            if (set.contains(Integer.valueOf(c1810410xDD.LIZIZ.type))) {
                return;
            } else {
                set.add(Integer.valueOf(c1810410xDD.LIZIZ.type));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(linkedHashMap, c1810410xDD, dataChannel);
        if (Intrinsics.LJFF(str, "room_topleft") && !z) {
            str2 = LIZIZ;
        } else {
            str2 = "live_play";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hourly_rank_entrance_show");
        LIZ(c474500IjALIZ, dataChannel);
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        c474500IjALIZ.LJJII(LJJJJIZL(bool), "user_type");
        c474500IjALIZ.LJJII(c1810410xDD.LIZIZ.rankName, "rank_type");
        c474500IjALIZ.LJJII(Integer.valueOf(LJ), "if_music_spotlight_button");
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LJJII(str2, "show_reason");
        if (Intrinsics.LJFF(c1810410xDD.LIZIZ, RankTypeV2.LJIJJLI)) {
            c474500IjALIZ.LJJII(Integer.valueOf(LivePopularityRankingBonusTimeSetting.INSTANCE.isInBonusTime() ? 1 : 0), "is_bonus_time");
            LIZ.getClass();
            LJ(c474500IjALIZ, dataChannel);
        }
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        c474500IjALIZ.LJJII(Long.valueOf(C1810700xDg.LIZIZ(c1810410xDD.LIZIZ.type, false)), "anchor_rank_index");
        c474500IjALIZ.LJJII(1, "is_fully_display");
        c474500IjALIZ.LJJII(Integer.valueOf(C1078940eBQ.LIZIZ(dataChannel, c1810410xDD.LIZIZ.type, false, -1L) ? 1 : 0), "is_midday_sprint");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            w wVar = w.LIZ;
            wVar.getClass();
            c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
            c474500IjALIZ.LJJII(wVar.LIZJ(), "live_type");
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJIJL();
        }
        if (Intrinsics.LJFF(str, "room_topleft")) {
            boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
            if (zLJIIZILJ) {
                str3 = "anchor";
            } else {
                UserAttr userAttr = UserService.getInstance().user().getCurrentUser().getUserAttr();
                if (userAttr != null && userAttr.isAdmin) {
                    str3 = "admin";
                } else {
                    str3 = "viewer";
                }
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_hourly_rank_entrance_show_frame_check");
            c474500IjALIZ2.LJIJJLI(dataChannel);
            LIZ(c474500IjALIZ2, dataChannel);
            c474500IjALIZ2.LJJII(str3, "user_type");
            if (zLJIIZILJ) {
                str4 = "live_take_detail";
            } else {
                str4 = "live_detail";
            }
            c474500IjALIZ2.LJJII(str4, "event_page");
            c474500IjALIZ2.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIIJI(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankView r15, X.C1810410xDD r16, boolean r17, com.bytedance.ies.sdk.datachannel.DataChannel r18) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJJIJIIJI(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView, X.0xDD, boolean, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZIZ(Map map, RankTypeV2 rankTypeV2, EnumC1811400xEo enumC1811400xEo, boolean z, DataChannel dataChannel) {
        String str;
        if (C500260Jjc.LJIIZILJ(dataChannel) && enumC1811400xEo == EnumC1811400xEo.GAME_RANK && C1810700xDg.LIZLLL(dataChannel) != 1) {
            map.put("anchor_rank", "2");
            return;
        }
        if (C500260Jjc.LJIIZILJ(dataChannel) && enumC1811400xEo == EnumC1811400xEo.GIFT_RANK && !z && C1810700xDg.LJ(dataChannel) != 1) {
            map.put("anchor_rank", "2");
            return;
        }
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        if (C1810700xDg.LIZIZ(rankTypeV2.type, z) < 0) {
            str = "-1";
        } else {
            long jLIZIZ = C1810700xDg.LIZIZ(rankTypeV2.type, z);
            if (1 <= jLIZIZ && jLIZIZ < 100) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
        }
        map.put("anchor_rank", str);
    }

    public static void LJJIIZ(C1810410xDD c1810410xDD, DataChannel dataChannel, String str, boolean z, boolean z2) {
        Object objGg0;
        String str2;
        String str3;
        int i;
        boolean z3;
        String str4;
        String str5;
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        if (!z) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == EnumC1083260eIO.SHOW) {
            linkedHashMap.put("event_page", "live_extended_comment_filed");
        }
        if (Intrinsics.LJFF(str, "room_topleft")) {
            str2 = LIZIZ;
        } else {
            str2 = "live_play";
        }
        LIZJ(linkedHashMap, c1810410xDD, dataChannel);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hourly_rank_entrance_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(LJJJJIZL(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))), "user_type");
        c474500IjALIZ.LJJII(c1810410xDD.LIZIZ.rankName, "rank_type");
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LJJII(str2, "show_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(LJ), "if_music_spotlight_button");
        if (!Intrinsics.LJFF(Boolean.valueOf(C497740JfY.LJIL()), Boolean.FALSE)) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        c474500IjALIZ.LJJII(str3, "room_orientation");
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.viewerRankList == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_locked");
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        c474500IjALIZ.LJJII(Long.valueOf(C1810700xDg.LIZIZ(c1810410xDD.LIZIZ.type, false)), "anchor_rank_index");
        int i2 = c1810410xDD.LIZIZ.type;
        SparseLongArray sparseLongArray2 = C1810700xDg.LIZLLL;
        if (sparseLongArray2.indexOfKey(i2) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long j = sparseLongArray2.get(i2);
            if (j >= 0) {
                C1810690xDf c1810690xDf = LIZ;
                long jLIZIZ = C1810700xDg.LIZIZ(c1810410xDD.LIZIZ.type, false);
                c1810690xDf.getClass();
                long j2 = 2;
                if (jLIZIZ != 1) {
                    if (2 <= jLIZIZ && jLIZIZ < 100) {
                        j2 = jLIZIZ - 1;
                    } else {
                        j2 = 99;
                    }
                }
                c474500IjALIZ.LJJII(Long.valueOf(j2), "comparison_rank");
                String str6 = "score_diff";
                c474500IjALIZ.LJJII(Long.valueOf(j), "score_diff");
                if (!z2) {
                    str6 = "rank";
                }
                c474500IjALIZ.LJJII(str6, "click_comparison_reason");
            }
        }
        if (Intrinsics.LJFF(c1810410xDD.LIZIZ, RankTypeV2.LJIJJLI)) {
            c474500IjALIZ.LJJII(Integer.valueOf(LivePopularityRankingBonusTimeSetting.INSTANCE.isInBonusTime() ? 1 : 0), "is_bonus_time");
            LIZ.getClass();
            LJ(c474500IjALIZ, dataChannel);
        }
        c474500IjALIZ.LJJII(Boolean.valueOf(LJFF), "is_final_rank");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(1, "is_fully_display");
        c474500IjALIZ.LJJII(Integer.valueOf(C1078940eBQ.LIZIZ(dataChannel, c1810410xDD.LIZIZ.type, false, -1L) ? 1 : 0), "is_midday_sprint");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
        if (Intrinsics.LJFF(str, "room_topleft")) {
            boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
            if (zLJIIZILJ) {
                str4 = "anchor";
            } else {
                UserAttr userAttr = UserService.getInstance().user().getCurrentUser().getUserAttr();
                if (userAttr != null && userAttr.isAdmin) {
                    str4 = "admin";
                } else {
                    str4 = "viewer";
                }
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_hourly_rank_entrance_click_frame_check");
            c474500IjALIZ2.LJIJJLI(dataChannel);
            LIZ(c474500IjALIZ2, dataChannel);
            c474500IjALIZ2.LJJII(str4, "user_type");
            if (zLJIIZILJ) {
                str5 = "live_take_detail";
            } else {
                str5 = "live_detail";
            }
            c474500IjALIZ2.LJJII(str5, "event_page");
            c474500IjALIZ2.LIZ();
        }
    }

    public static void LJJIJIIJIL(DataChannel dataChannel, String str, String str2, String str3, C1810410xDD c1810410xDD) {
        Boolean boolValueOf;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_rank_change", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJIJJLI(dataChannel);
        c474500IjALIZIZ.LJJII(str, "rank_from");
        c474500IjALIZIZ.LJJII(str2, "rank_to");
        c474500IjALIZIZ.LJJII(str3, "change_type");
        c474500IjALIZIZ.LJJII(c1810410xDD.LIZIZ.rankName, "rank_type");
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        c474500IjALIZIZ.LJJII(LJJJJIZL(boolValueOf), "user_type");
        c474500IjALIZIZ.LJJII(1, "is_fully_display");
        c474500IjALIZIZ.LIZ();
    }

    public static void LJJJ(RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22, EnumC1811400xEo enumC1811400xEo, DataChannel dataChannel, boolean z) {
        Boolean boolValueOf;
        LJIIIIZZ.put(new Pair<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), "click");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(linkedHashMap, rankTypeV2, enumC1811400xEo, z, dataChannel);
        C474500IjA c474500IjALJII = LJII("livesdk_switch_tab", linkedHashMap);
        LIZ(c474500IjALJII, dataChannel);
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        c474500IjALJII.LJJII(LJJJJIZL(boolValueOf), "user_type");
        c474500IjALJII.LJJII(rankTypeV22.rankName, "from_rank_type");
        c474500IjALJII.LJJII(rankTypeV2.rankName, "to_rank_type");
        c474500IjALJII.LJJII(LJJJI(Boolean.valueOf(z)), "rank_period");
        c474500IjALJII.LJJII("click", "enter_from");
        c474500IjALJII.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJ(java.lang.String r2, com.bytedance.android.live.base.model.user.User r3, com.bytedance.android.livesdk.model.BorderInfo r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, boolean r6) {
        /*
            if (r6 == 0) goto Le
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZIZ
            java.lang.String r0 = r0.rankName
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto Le
            java.lang.String r2 = "last_week_rank"
        Le:
            if (r5 == 0) goto L1b
            boolean r1 = X.C500260Jjc.LJIIZILJ(r5)
            r0 = 1
            if (r1 != r0) goto L1b
        L17:
            X.C496970JeJ.LIZJ(r3, r2, r2, r0, r4)
            return
        L1b:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJJJJ(java.lang.String, com.bytedance.android.live.base.model.user.User, com.bytedance.android.livesdk.model.BorderInfo, com.bytedance.ies.sdk.datachannel.DataChannel, boolean):void");
    }

    public static void LJIIJ(DataChannel dataChannel, String str, String str2, String str3, String str4, RankListV2Response.RankView rankView) {
        Long lValueOf;
        RankListV2Response.RankInfo rankInfo;
        RankListV2Response.TeamRankExtra teamRankExtra;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_list_bottom_button_action");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "button_type");
        c474500IjALIZ.LJJII(str2, "rank_type");
        c474500IjALIZ.LJJII(str3, "action_type");
        c474500IjALIZ.LJJII(LJJJJIZL(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))), "user_type");
        if (Intrinsics.LJFF(str2, RankTypeV2.LJIJJLI.rankName)) {
            c474500IjALIZ.LJJII(Integer.valueOf(LivePopularityRankingBonusTimeSetting.INSTANCE.isInBonusTime() ? 1 : 0), "is_bonus_time");
            C1810690xDf c1810690xDf = LIZ;
            if (rankView != null && (rankInfo = rankView.ownerRank) != null && (teamRankExtra = rankInfo.teamRankExtra) != null) {
                lValueOf = Long.valueOf(teamRankExtra.communityLevel);
            } else {
                lValueOf = null;
            }
            c1810690xDf.getClass();
            LJFF(c474500IjALIZ, dataChannel, lValueOf);
        }
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            if (!Intrinsics.LJFF(str4, "")) {
                str = str4;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(str, EnumC1808150x9Z.SET_RANKING_STICKER_BTN.getButtonType()) ? 1 : 0), "is_set_sticker_show");
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(X.C1810690xDf r12, com.bytedance.ies.sdk.datachannel.DataChannel r13, com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankView r14, X.C1810410xDD r15, boolean r16, java.lang.String r17, java.lang.String r18, int r19) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810690xDf.LJJIFFI(X.0xDf, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView, X.0xDD, boolean, java.lang.String, java.lang.String, int):void");
    }
}
