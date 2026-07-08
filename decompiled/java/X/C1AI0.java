package X;

import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.viewer_picks.model.ProfileExtra;
import com.bytedance.android.livesdk.viewer_picks.model.ProfileExtraGameInteraction;
import com.bytedance.android.livesdk.viewer_picks.model.ProfileExtraGameInteractionExternal;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.1AI0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AI0 {
    public static final C1AI0 LIZ = new C1AI0();
    public static C2176881AHm LIZIZ;
    public static Boolean LIZJ;
    public static long LIZLLL;
    public static long LJ;

    public static boolean LJFF() {
        return ViewerWishesConfig.INSTANCE.getGetValue().anchorEnabled;
    }

    public static C787510Uur LJ(C2176881AHm c2176881AHm) {
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        ProfileExtraGameInteractionExternal profileExtraGameInteractionExternal;
        String str;
        ProfileExtraGameInteraction profileExtraGameInteraction;
        String str2 = null;
        if (c2176881AHm == null || (c1125770fOx = c2176881AHm.LIZIZ) == null || (viewerPicksInfo = c1125770fOx.LIZIZ) == null || viewerPicksInfo.scene != 6) {
            return null;
        }
        ProfileExtra profileExtra = viewerPicksInfo.extra;
        if (profileExtra != null && (profileExtraGameInteraction = profileExtra.gameInteraction) != null) {
            profileExtraGameInteractionExternal = profileExtraGameInteraction.external;
        } else {
            profileExtraGameInteractionExternal = null;
        }
        if (profileExtraGameInteractionExternal != null) {
            str2 = profileExtraGameInteractionExternal.gameTagId;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (profileExtraGameInteractionExternal != null && (str = profileExtraGameInteractionExternal.gameName) != null) {
            str3 = str;
        }
        return new C787510Uur(str2, str3);
    }

    public static void LJIIL(C1AI2 c1ai2) {
        Object objValueOf;
        if (!LJFF()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_wish_content_edit");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII(c1ai2.LIZ, "action_type");
        c474500IjALIZ.LJJII(c1ai2.LJIILJJIL, "gift_id");
        c474500IjALIZ.LJJII(c1ai2.LJIILL, "gift_price");
        c474500IjALIZ.LJJII(c1ai2.LJIJ, "pre_wish_content");
        c474500IjALIZ.LJJII(String.valueOf(c1ai2.LJIJI), "aft_wish_content");
        Boolean bool = c1ai2.LJJIJIIJI;
        if (bool != null) {
            objValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "is_campaign_anchor");
        c474500IjALIZ.LJJII(c1ai2.LIZJ, "entrance");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(C1AI2 c1ai2) {
        Object objValueOf;
        if (Intrinsics.LJFF(c1ai2.LIZ, "click")) {
            LJ = System.currentTimeMillis();
        }
        if (!LJFF()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_entrance");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII(c1ai2.LIZ, "action_type");
        c474500IjALIZ.LJJII(c1ai2.LIZIZ, "connect_type");
        c474500IjALIZ.LJJII(c1ai2.LIZJ, "entrance");
        Boolean bool = c1ai2.LJJIJIIJI;
        if (bool != null) {
            objValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "is_campaign_anchor");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILJJIL(C1AI2 c1ai2) {
        if (!LJFF()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_FAQ");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII(c1ai2.LJIIIZ, "faq_type");
        c474500IjALIZ.LJJII(c1ai2.LJIIJ, "user_type");
        c474500IjALIZ.LJJII(c1ai2.LJJIIJZLJL, "viewer_wishes_live_type");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZ, "orientation");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILL(C1AI2 c1ai2) {
        if (!LJFF()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_front_row_wish_popup");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII("delete_front_row_wish", "popup_type");
        c474500IjALIZ.LJJII(c1ai2.LIZ, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILLIIL(C1AI2 c1ai2) {
        if (!LJFF()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_new_user_guide");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII(c1ai2.LIZ, "action_type");
        c474500IjALIZ.LJJII(c1ai2.LIZJ, "entrance");
        if (Intrinsics.LJFF(c1ai2.LIZ, "close")) {
            c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - c1ai2.LJII) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIZILJ(C1AI2 c1ai2) {
        if (!LJFF()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_notification");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII(c1ai2.LIZJ, "entrance");
        c474500IjALIZ.LJJII(c1ai2.LIZ, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJ(C1AI2 c1ai2) {
        Object objValueOf;
        if (!LJFF()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_setting_page_click");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII(c1ai2.LIZJ, "entrance");
        c474500IjALIZ.LJJII(c1ai2.LIZLLL, "button_type");
        Boolean bool = c1ai2.LJJIJIIJI;
        Object objValueOf2 = null;
        if (bool != null) {
            objValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "is_campaign_anchor");
        c474500IjALIZ.LJJII(c1ai2.LJJIJIL, "vw_type");
        c474500IjALIZ.LJJII(Integer.valueOf(c1ai2.LJJIJL ? 1 : 0), "is_new");
        c474500IjALIZ.LJJII(c1ai2.LJJIJLIJ, "campaign_id");
        Boolean bool2 = c1ai2.LJJJ;
        if (bool2 != null) {
            objValueOf2 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
        }
        c474500IjALIZ.LJJII(objValueOf2, "is_front_row_wish");
        c474500IjALIZ.LIZ();
    }

    public static final C474500IjA LIZIZ(C474500IjA c474500IjA, String str) {
        C787510Uur c787510UurLJ = LJ(LIZIZ);
        if (c787510UurLJ == null) {
            return c474500IjA;
        }
        c474500IjA.LJJII(str, "if_interactive_set");
        c474500IjA.LJJII(c787510UurLJ.LIZ, "interactive_game_id");
        c474500IjA.LJJII(c787510UurLJ.LIZIZ, "interactive_game_name");
        return c474500IjA;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[PHI: r6
      0x0041: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:20:0x003f, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[PHI: r6
      0x004f: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:20:0x003f, B:22:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1AI3 LIZLLL(com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo r11, com.bytedance.ies.sdk.datachannel.DataChannel r12) {
        /*
            r10 = 0
            if (r11 == 0) goto L78
            com.bytedance.android.livesdk.viewer_picks.model.ProfileExtra r0 = r11.extra
            if (r0 == 0) goto L78
            com.bytedance.android.livesdk.viewer_picks.model.ProfileExtraGameInteraction r0 = r0.gameInteraction
            if (r0 == 0) goto L78
            com.bytedance.android.livesdk.viewer_picks.model.ProfileExtraGameInteractionExternal r0 = r0.external
            if (r0 == 0) goto L78
            X.0Uur r4 = new X.0Uur
            java.lang.String r1 = r0.gameTagId
            java.lang.String r0 = r0.gameName
            r4.<init>(r1, r0)
        L18:
            if (r12 == 0) goto L24
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r12.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            if (r2 != 0) goto L2a
        L24:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r0 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = X.C500260Jjc.LJJLI()
        L2a:
            X.1AI3 r5 = new X.1AI3
            java.lang.String r3 = "0"
            if (r2 == 0) goto L3e
            long r0 = r2.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r6 = r0.toString()
            if (r6 != 0) goto L41
        L3e:
            r6 = r3
            if (r2 == 0) goto L4f
        L41:
            long r0 = r2.getOwnerUserId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r7 = r0.toString()
            if (r7 != 0) goto L50
        L4f:
            r7 = r3
        L50:
            java.lang.String r8 = r4.LIZ
            java.lang.String r9 = r4.LIZIZ
            if (r2 == 0) goto L64
            com.bytedance.android.livesdk.game.model.GameTagDetail r0 = r2.gameTagDetail
            if (r0 == 0) goto L64
            long r0 = r0.gameTagId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r10 = r0.toString()
        L64:
            java.lang.String r11 = ""
            if (r10 != 0) goto L69
            r10 = r11
        L69:
            if (r2 == 0) goto L74
            com.bytedance.android.livesdk.game.model.GameTagDetail r0 = r2.gameTagDetail
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.gameTagName
            if (r0 == 0) goto L74
            r11 = r0
        L74:
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L78:
            if (r12 == 0) goto L84
            java.lang.Class<com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus> r0 = com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus.class
            java.lang.Object r0 = r12.gg0(r0)
            X.1AHm r0 = (X.C2176881AHm) r0
            if (r0 != 0) goto L86
        L84:
            X.1AHm r0 = X.C1AI0.LIZIZ
        L86:
            X.0Uur r4 = LJ(r0)
            if (r4 != 0) goto L18
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AI0.LIZLLL(com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo, com.bytedance.ies.sdk.datachannel.DataChannel):X.1AI3");
    }

    public static void LJI(DataChannel dataChannel, String str) {
        C1AI3 c1ai3LIZLLL;
        if (!ViewerWishesConfig.INSTANCE.getGetValue().audienceEnabled || (c1ai3LIZLLL = LIZLLL(null, dataChannel)) == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_faq_entrance");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZ, "room_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZJ, "interactive_game_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZLLL, "interactive_game_name");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LJ, "game_tag_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LJFF, "game_tag_name");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(C1AI2 c1ai2, C2176921AHq c2176921AHq) {
        Object objValueOf;
        if (Intrinsics.LJFF(c1ai2.LJJIJIIJIL, Boolean.TRUE) && !LJFF()) {
            return;
        }
        Boolean bool = c1ai2.LJJIJIIJIL;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.LJFF(bool, bool2) && !ViewerWishesConfig.INSTANCE.getGetValue().audienceEnabled) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_component");
        c474500IjALIZ.LJJII(c1ai2.LJFF, "event_page");
        c474500IjALIZ.LJJII(c1ai2.LJJJJJL, "source");
        c474500IjALIZ.LJJII(c1ai2.LJI, "component_type");
        c474500IjALIZ.LJJII(c1ai2.LJIIJ, "user_type");
        c474500IjALIZ.LJJII(c1ai2.LIZ, "action_type");
        c474500IjALIZ.LJJII(c1ai2.LJIIJJI, "show_gift_id_set");
        c474500IjALIZ.LJJII(c1ai2.LJIIL, "show_gift_price_set");
        c474500IjALIZ.LJJII(c1ai2.LJIILIIL, "show_wish_content_set");
        c474500IjALIZ.LJJII(c1ai2.LJJIII, "show_gift_score_set");
        Boolean bool3 = c1ai2.LJJJI;
        Object objValueOf2 = null;
        if (bool3 != null) {
            objValueOf = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "is_front_row_wish");
        c474500IjALIZ.LJJII(Integer.valueOf(c1ai2.LJJIL ? 1 : 0), "is_fold");
        c474500IjALIZ.LJJII(c1ai2.LJJIIJZLJL, "viewer_wishes_live_type");
        if (Intrinsics.LJFF(c1ai2.LIZ, "click")) {
            if (Intrinsics.LJFF(c1ai2.LJJIJIIJIL, bool2)) {
                c474500IjALIZ.LJJII(c1ai2.LJIILJJIL, "click_gift_id");
                c474500IjALIZ.LJJII(c1ai2.LJIILL, "click_gift_price");
                c474500IjALIZ.LJJII(c1ai2.LJIIZILJ, "click_wish_content");
                c474500IjALIZ.LJJII(c1ai2.LJJIIJ, "click_gift_score");
            }
            Boolean bool4 = c1ai2.LJJJ;
            if (bool4 != null) {
                objValueOf2 = Integer.valueOf(bool4.booleanValue() ? 1 : 0);
            }
            c474500IjALIZ.LJJII(objValueOf2, "click_front_row_wish");
        }
        c474500IjALIZ.LJJII(c1ai2.LJJIIZ, "orientation");
        c474500IjALIZ.LJJII(c1ai2.LJJIZ, "head_image_show");
        if (Intrinsics.LJFF(c1ai2.LJFF, "live_preview") && c2176921AHq != null) {
            c474500IjALIZ.LJJII(c2176921AHq.LIZIZ, "anchor_id");
            c474500IjALIZ.LJJII(c2176921AHq.LIZ, "room_id");
            c474500IjALIZ.LJJII(c2176921AHq.LIZJ, "enter_from_merge");
        } else {
            c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
            c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
            c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C474500IjA LIZ(X.C474500IjA r6, com.bytedance.android.livesdk.model.Gift r7, long r8) {
        /*
            X.1AHm r0 = X.C1AI0.LIZIZ
            X.0Uur r3 = LJ(r0)
            if (r3 != 0) goto L9
            return r6
        L9:
            r2 = 1
            if (r7 == 0) goto L7f
            java.util.List<java.lang.Integer> r1 = r7.giftVerticalScenarios
            if (r1 == 0) goto L7f
            r0 = 37
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != r2) goto L7f
            java.lang.String r1 = "1"
        L1e:
            java.lang.String r0 = "if_interactive"
            r6.LJJII(r1, r0)
            java.lang.String r1 = "interactive_game_id"
            java.lang.String r0 = r3.LIZ
            r6.LJJII(r0, r1)
            java.lang.String r1 = "interactive_game_name"
            java.lang.String r0 = r3.LIZIZ
            r6.LJJII(r0, r1)
            X.1AHm r0 = X.C1AI0.LIZIZ
            r5 = 0
            if (r0 == 0) goto L75
            X.0fOx r0 = r0.LIZIZ
            if (r0 == 0) goto L75
            com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo r0 = r0.LIZIZ
            if (r0 == 0) goto L75
            java.util.List<com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore> r0 = r0.giftPickList
            if (r0 == 0) goto L75
            java.util.Iterator r4 = r0.iterator()
        L46:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore r0 = (com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore) r0
            com.bytedance.android.livesdk.viewer_picks.model.GiftPick r0 = r0.giftPick
            if (r0 == 0) goto L46
            long r1 = r0.giftId
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L46
        L5d:
            com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore r3 = (com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore) r3
            if (r3 == 0) goto L75
            com.bytedance.android.livesdk.viewer_picks.model.GiftPick r0 = r3.giftPick
            if (r0 == 0) goto L75
            com.bytedance.android.livesdk.viewer_picks.model.GiftPickExtra r0 = r0.extra
            if (r0 == 0) goto L75
            com.bytedance.android.livesdk.viewer_picks.model.GiftPickExtraGameInteraction r0 = r0.gameInteraction
            if (r0 == 0) goto L75
            com.bytedance.android.livesdk.viewer_picks.model.GiftPickExtraGameInteractionStorage r0 = r0.storage
            if (r0 == 0) goto L75
            java.lang.String r1 = r0.instruction
            if (r1 != 0) goto L77
        L75:
            java.lang.String r1 = ""
        L77:
            java.lang.String r0 = "command_id"
            r6.LJJII(r1, r0)
            return r6
        L7d:
            r3 = r5
            goto L5d
        L7f:
            java.lang.String r1 = "0"
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AI0.LIZ(X.0IjA, com.bytedance.android.livesdk.model.Gift, long):X.0IjA");
    }

    public static void LJII(DataChannel dataChannel, String str, ViewerPicksInfo viewerPicksInfo) {
        C1AI3 c1ai3LIZLLL;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        C2176881AHm c2176881AHm2;
        C1125770fOx c1125770fOx2;
        if (!ViewerWishesConfig.INSTANCE.getGetValue().audienceEnabled) {
            return;
        }
        if ((viewerPicksInfo == null && ((dataChannel == null || (c2176881AHm2 = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) == null || (c1125770fOx2 = c2176881AHm2.LIZIZ) == null || (viewerPicksInfo = c1125770fOx2.LIZIZ) == null) && ((c2176881AHm = LIZIZ) == null || (c1125770fOx = c2176881AHm.LIZIZ) == null || (viewerPicksInfo = c1125770fOx.LIZIZ) == null))) || viewerPicksInfo.scene != 6 || (c1ai3LIZLLL = LIZLLL(viewerPicksInfo, dataChannel)) == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_audience_interactive_gameplay_bulletin");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZ, "room_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZJ, "interactive_game_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LIZLLL, "interactive_game_name");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LJ, "game_tag_id");
        c474500IjALIZ.LJJII(c1ai3LIZLLL.LJFF, "game_tag_name");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(String str, String str2, String str3) {
        String string;
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_cohost_mg_popup");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(string, "anchor_id");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            lValueOf = Long.valueOf(roomLJJLI.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "popup_type");
        c474500IjALIZ.LJJII(str3, "click_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJI(long j, Integer num, String str, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C474500IjA c474500IjALIZJ = C0IJT.LIZJ("ttlive_viewer_wishes_setting_page_request_result");
        c474500IjALIZJ.LJJII(Integer.valueOf(z ? 1 : 0), "is_success");
        c474500IjALIZJ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        c474500IjALIZJ.LJJII(num, "error_code");
        c474500IjALIZJ.LJJII(str, "error_from");
        c474500IjALIZJ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C474500IjA r9, boolean r10, long r11, java.util.List r13, int r14) {
        /*
            r0 = r14 & 1
            r8 = 0
            if (r0 == 0) goto L6
            r10 = 0
        L6:
            r0 = r14 & 2
            if (r0 == 0) goto Lc
            r11 = 0
        Lc:
            r0 = r14 & 4
            r4 = 0
            if (r0 == 0) goto L12
            r13 = r4
        L12:
            com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig r0 = com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig.INSTANCE
            com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig$ViewerWishesConfigModel r0 = r0.getGetValue()
            boolean r0 = r0.audienceEnabled
            if (r0 == 0) goto Lb4
            X.1AHm r0 = X.C1AI0.LIZIZ
            if (r0 == 0) goto Lb4
            X.0fOx r2 = r0.LIZIZ
            if (r2 == 0) goto Lb4
            com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo r0 = r2.LIZIZ
            if (r0 == 0) goto L2e
            int r0 = r0.scene
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L2e:
            java.lang.String r3 = "viewer_wishes_live_type"
            if (r4 == 0) goto L95
            int r1 = r4.intValue()
            r0 = 3
            if (r1 == r0) goto L8f
            int r1 = r4.intValue()
            r0 = 5
            if (r1 == r0) goto L8f
            int r1 = r4.intValue()
            r0 = 6
            if (r1 == r0) goto L8f
            int r1 = r4.intValue()
            r0 = 2
            if (r1 != r0) goto L95
            java.lang.String r0 = "group_live"
            r9.LJJII(r0, r3)
        L53:
            if (r10 == 0) goto Lb4
            java.util.List<java.lang.Long> r0 = r2.LIZ
            if (r0 == 0) goto La0
            java.util.Iterator r7 = r0.iterator()
        L5d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r7.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 != 0) goto L73
            r8 = 1
            goto L5d
        L73:
            if (r13 == 0) goto L5d
            java.util.Iterator r1 = r13.iterator()
        L79:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L79
            r8 = 1
            goto L79
        L8f:
            java.lang.String r0 = "game"
            r9.LJJII(r0, r3)
            goto L53
        L95:
            java.lang.String r0 = "single_live"
            r9.LJJII(r0, r3)
            goto L53
        L9b:
            if (r8 == 0) goto La0
            java.lang.String r1 = "1"
            goto La2
        La0:
            java.lang.String r1 = "0"
        La2:
            java.lang.String r0 = "is_viewer_wishes_gift"
            r9.LJJII(r1, r0)
            java.util.List<java.lang.Long> r0 = r2.LIZ
            if (r0 == 0) goto Lb4
            java.lang.String r1 = "viewer_wishes_gift_list"
            java.lang.String r0 = r0.toString()
            r9.LJJII(r0, r1)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AI0.LIZJ(X.0IjA, boolean, long, java.util.List, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo r48, com.bytedance.ies.sdk.datachannel.DataChannel r49, boolean r50, java.lang.String r51, java.lang.String r52, boolean r53, X.C2176921AHq r54) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AI0.LJIIJJI(com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, java.lang.String, java.lang.String, boolean, X.1AHq):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.util.List r52, com.bytedance.ies.sdk.datachannel.DataChannel r53, int r54, boolean r55, boolean r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, boolean r60) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AI0.LJIIJ(java.util.List, com.bytedance.ies.sdk.datachannel.DataChannel, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
