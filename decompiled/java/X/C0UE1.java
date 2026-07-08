package X;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.BroadcastEndPageSchemaOpenPanelEvent;
import com.bytedance.android.live.broadcast.BroadcastLiveBoardEvent;
import com.bytedance.android.live.broadcast.BroadcastLiveBoardForYouEvent;
import com.bytedance.android.live.broadcast.BroadcastLiveSMBOneStopEvent;
import com.bytedance.android.live.broadcast.BroadcastMorePanelEvent;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenCoHostPanelEvent;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenMultiGuestPanelEvent;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelEvent;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelParamsEvent;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelWithDataEvent;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenSettingsHighlightEvent;
import com.bytedance.android.live.broadcast.PreviewDecorationEditSchemeEvent;
import com.bytedance.android.live.broadcast.PreviewSchemaCreateBoardEvent;
import com.bytedance.android.live.broadcast.SchemaOpenBeautyPanelEvent;
import com.bytedance.android.live.broadcast.SchemaRealtimeLiveCenter;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.schema.BroadcastEnterTryModeEvent;
import com.bytedance.android.livesdk.broadcast.schema.PreviewSchemaOpenPanelEvent;
import com.bytedance.android.livesdk.broadcast.schema.PreviewSchemaOpenPanelParamsEvent;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfigMapping;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UE1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UE1 {
    public static final C01GW LIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(524));
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(525));
    public static final C01GW LIZJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(523));

    public static void LJ(String str) {
        if (str != null && str.length() != 0) {
            if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJJJJI()) {
                C766270U4b.LJIIJJI(str);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(String str, Map map) {
        String strNeedMapping2NewSettings;
        LIZ.getValue().getClass();
        String str2 = (String) map.get("panel_name");
        if (str2 != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1618876223) {
                if (iHashCode != -954574755) {
                    if (iHashCode != -318184504 || !str.equals("preview")) {
                        return;
                    }
                    switch (str2.hashCode()) {
                        case -1878046444:
                            if (str2.equals("play_book")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.PLAY_BOOK);
                            }
                            break;
                        case -1507887352:
                            if (str2.equals("live_center")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.LIVE_CENTER);
                            }
                            break;
                        case -1393028996:
                            if (str2.equals("beauty")) {
                                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                                Object obj = map.get("tab");
                                if (obj == null) {
                                    obj = "";
                                }
                                dataChannelGlobal.FQ2(SchemaOpenBeautyPanelEvent.class, obj);
                            }
                            break;
                        case -1306084975:
                            if (str2.equals("effect")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelParamsEvent.class, new Pair(C0UE0.EFFECT, map));
                            }
                            break;
                        case -620099758:
                            if (str2.equals("smb_one_stop")) {
                                DataChannelGlobal.LLILZ.FQ2(BroadcastLiveSMBOneStopEvent.class, C752560Tfa.LIZIZ(map));
                            }
                            break;
                        case -95503869:
                            if (str2.equals("comment_settings")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.COMMENT_SETTINGS);
                            }
                            break;
                        case 93908710:
                            if (str2.equals("board")) {
                                DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : map.entrySet()) {
                                    C786410Ut5.LJJJI((String) entry.getKey(), (String) entry.getValue(), bundle);
                                }
                                if (map.get("show_entrance") == null) {
                                    C786410Ut5.LJJJI("show_entrance", "preview", bundle);
                                }
                                dataChannelGlobal2.FQ2(BroadcastLiveBoardEvent.class, bundle);
                            }
                            break;
                        case 109400031:
                            if (str2.equals("share")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.SHARE);
                            }
                            break;
                        case 341203229:
                            if (str2.equals("subscription")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.SUBSCRIPTION);
                            }
                            break;
                        case 644830032:
                            if (str2.equals("board_for_you")) {
                                DataChannelGlobal.LLILZ.FQ2(BroadcastLiveBoardForYouEvent.class, C752560Tfa.LIZIZ(map));
                            }
                            break;
                        case 725987419:
                            if (str2.equals("location_scope_setting")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.LOCATION_SCOPE_SETTING);
                            }
                            break;
                        case 1008614022:
                            if (str2.equals("live_goal")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.GOAL);
                            }
                            break;
                        case 1047313019:
                            if (str2.equals("lop_age_assurance")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.LOP_AGE_ASSURANCE);
                            }
                            break;
                        case 1434631203:
                            if (str2.equals("settings")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.SETTINGS);
                            }
                            break;
                        case 1619363722:
                            if (str2.equals("about_me")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.ABOUT_ME);
                            }
                            break;
                        case 1953959335:
                            if (str2.equals("try_mode")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.TRY_MODE);
                            }
                            break;
                        case 2024161085:
                            if (str2.equals("ecom_probation")) {
                                DataChannelGlobal.LLILZ.FQ2(PreviewSchemaOpenPanelEvent.class, C0UE0.ECOM_PROBATION);
                            }
                            break;
                    }
                }
                if (!str.equals("broadcast_end")) {
                    return;
                }
                switch (str2.hashCode()) {
                    case -1172077849:
                        if (str2.equals("add_moderator")) {
                            DataChannelGlobal.LLILZ.FQ2(BroadcastEndPageSchemaOpenPanelEvent.class, C0UE0.ADD_MODERATOR);
                        }
                        break;
                    case -184788835:
                        if (str2.equals("blocked_keywords")) {
                            DataChannelGlobal.LLILZ.FQ2(BroadcastEndPageSchemaOpenPanelEvent.class, C0UE0.BLOCKED_KEYWORDS);
                        }
                        break;
                    case -174740773:
                        if (str2.equals("filter_comments")) {
                            DataChannelGlobal.LLILZ.FQ2(BroadcastEndPageSchemaOpenPanelEvent.class, C0UE0.FILTER_COMMENTS);
                        }
                        break;
                    case 725987419:
                        if (str2.equals("location_scope_setting")) {
                            DataChannelGlobal.LLILZ.FQ2(BroadcastEndPageSchemaOpenPanelEvent.class, C0UE0.LOCATION_SCOPE_SETTING);
                        }
                        break;
                }
            }
            if (!str.equals("broadcast")) {
                return;
            }
            switch (str2.hashCode()) {
                case -2119907047:
                    if (str2.equals("add_block_keyword")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.ADD_BLOCK_KEYWORD);
                    }
                    break;
                case -1890252483:
                    if (str2.equals("sticker")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.STICKER);
                    }
                    break;
                case -1657290239:
                    if (str2.equals("create_ai_summary_text_board")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.CREATE_AI_SUMMARY_TEXT_BOARD);
                    }
                    break;
                case -1535264204:
                    if (str2.equals("realtime_live_center")) {
                        DataChannelGlobal.LLILZ.FQ2(SchemaRealtimeLiveCenter.class, map);
                    }
                    break;
                case -1393028996:
                    if (str2.equals("beauty")) {
                        DataChannelGlobal dataChannelGlobal3 = DataChannelGlobal.LLILZ;
                        Object obj2 = map.get("tab");
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        dataChannelGlobal3.FQ2(SchemaOpenBeautyPanelEvent.class, obj2);
                    }
                    break;
                case -1310469752:
                    if (str2.equals("update_ai_summary_image_board")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.UPDATE_AI_SUMMARY_IMAGE_BOARD);
                    }
                    break;
                case -1306084975:
                    if (str2.equals("effect")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelParamsEvent.class, new Pair(C0UE0.EFFECT, map));
                    }
                    break;
                case -620099758:
                    if (str2.equals("smb_one_stop")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastLiveSMBOneStopEvent.class, C752560Tfa.LIZIZ(map));
                    }
                    break;
                case -449257483:
                    if (str2.equals("create_ai_summary_image_board")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.CREATE_AI_SUMMARY_IMAGE_BOARD);
                    }
                    break;
                case -95503869:
                    if (str2.equals("comment_settings")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.COMMENT_SETTINGS);
                    }
                    break;
                case 71620434:
                    if (str2.equals("multi_guest") && C752560Tfa.LIZ(2)) {
                        Object obj3 = map.get("enter_from");
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        HashMap map2 = new HashMap();
                        map2.putAll(map);
                        map2.remove("enter_from");
                        map2.remove("panel_name");
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenMultiGuestPanelEvent.class, new Pair(obj3, map2));
                        break;
                    }
                    break;
                case 93908710:
                    if (str2.equals("board")) {
                        DataChannelGlobal dataChannelGlobal4 = DataChannelGlobal.LLILZ;
                        Bundle bundle2 = new Bundle();
                        C786410Ut5.LJJJI("show_entrance", "broadcast", bundle2);
                        dataChannelGlobal4.FQ2(BroadcastLiveBoardEvent.class, bundle2);
                    }
                    break;
                case 103668165:
                    if (str2.equals("match") && C752560Tfa.LIZ(1)) {
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
                            C974210bSV c974210bSV = new C974210bSV("start_match", null);
                            c974210bSV.LJFF = "broadcast_schema";
                            C784440Upu.LIZ().LIZIZ(c974210bSV);
                        } else {
                            C974210bSV c974210bSV2 = new C974210bSV("start_co_host", null);
                            c974210bSV2.LJFF = "broadcast_schema";
                            C784440Upu.LIZ().LIZIZ(c974210bSV2);
                        }
                        break;
                    }
                    break;
                case 104263205:
                    if (str2.equals("music")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.MUSIC);
                    }
                    break;
                case 109400031:
                    if (str2.equals("share")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.SHARE);
                    }
                    break;
                case 374480792:
                    if (str2.equals("moderator_list")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.MODERATOR_LIST);
                    }
                    break;
                case 377558170:
                    if (str2.equals("more_panel")) {
                        String str3 = (String) map.get("cell_name");
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (LiveHostSettingsUIConfig.enable() && str3.length() > 0 && (strNeedMapping2NewSettings = LiveHostSettingsUIConfigMapping.INSTANCE.needMapping2NewSettings(str3)) != null) {
                            DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenSettingsHighlightEvent.class, strNeedMapping2NewSettings);
                        } else {
                            DataChannelGlobal dataChannelGlobal5 = DataChannelGlobal.LLILZ;
                            String str4 = (String) map.get("enter_from");
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str5 = (String) map.get("extra");
                            if (str5 == null) {
                                str5 = "";
                            }
                            dataChannelGlobal5.FQ2(BroadcastMorePanelEvent.class, new C773830UXd(str3, str4, str5));
                        }
                    }
                    break;
                case 393138702:
                    if (str2.equals("update_ai_summary_text_board")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.UPDATE_AI_SUMMARY_TEXT_BOARD);
                    }
                    break;
                case 511443643:
                    if (str2.equals("interact_panel")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.INTERACT_PANEL);
                    }
                    break;
                case 793662988:
                    if (str2.equals("effect_collection")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.EFFECT_COLLECTION);
                    }
                    break;
                case 937330075:
                    if (str2.equals("co_host") && C752560Tfa.LIZ(1)) {
                        DataChannelGlobal.LLILZ.GQ2(BroadcastSchemaOpenCoHostPanelEvent.class);
                        break;
                    }
                    break;
                case 1008614022:
                    if (str2.equals("live_goal")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.GOAL);
                    }
                    break;
                case 1143922840:
                    if (str2.equals("auto_post_living")) {
                        DataChannelGlobal dataChannelGlobal6 = DataChannelGlobal.LLILZ;
                        C0UE0 c0ue0 = C0UE0.AUTO_POST_LIVING_PANEL;
                        String str6 = (String) map.get("source");
                        if (str6 == null) {
                            str6 = "";
                        }
                        dataChannelGlobal6.FQ2(BroadcastSchemaOpenPanelWithDataEvent.class, new C0UE7(c0ue0, str6));
                    }
                    break;
                case 1434631203:
                    if (str2.equals("settings")) {
                        String str7 = (String) map.get("cell_name");
                        if (str7 != null && str7.length() != 0 && LiveHostSettingsUIConfig.enable()) {
                            DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenSettingsHighlightEvent.class, str7);
                        } else {
                            DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.SETTINGS);
                        }
                    }
                    break;
                case 1619363722:
                    if (str2.equals("about_me")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.ABOUT_ME);
                    }
                    break;
                case 2109452943:
                    if (str2.equals("ai_summary")) {
                        DataChannelGlobal.LLILZ.FQ2(BroadcastSchemaOpenPanelEvent.class, C0UE0.AI_SUMMARY);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        LJ((java.lang.String) r9.get("fail_tips"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r8, java.util.Map r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UE1.LIZJ(java.lang.String, java.util.Map):void");
    }

    public static void LIZLLL(String str, Map map) {
        if (Intrinsics.LJFF(str, "preview") && !C500260Jjc.LJJIJLIJ()) {
            return;
        }
        if (Intrinsics.LJFF(str, "broadcast") && !C500260Jjc.LJJJJI()) {
            return;
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController().Kc(map);
        ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).Kc(map);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, String str2, Map map) {
        if (Intrinsics.LJFF(str2, "set_effect") && Intrinsics.LJFF(map.get("category"), "sticker") && C0UE8.LIZ()) {
        }
        String str3 = "preview";
        if (!Intrinsics.LJFF("preview", str) && !Intrinsics.LJFF("broadcast", str) && !Intrinsics.LJFF("broadcast_end", str)) {
            LJ((String) map.get("fail_tips"));
            return;
        }
        try {
            switch (str2.hashCode()) {
                case -1645235806:
                    if (str2.equals("set_camera")) {
                        LIZJ(str, map);
                    }
                    break;
                case -1583568882:
                    if (str2.equals("set_effect")) {
                        LIZLLL(str, map);
                    }
                    break;
                case 71620434:
                    if (str2.equals("multi_guest")) {
                        C781270Ukn.LJIILJJIL().o22(str, map);
                    }
                    break;
                case 370633518:
                    if (str2.equals("enter_try_mode")) {
                        DataChannelGlobal.LLILZ.GQ2(BroadcastEnterTryModeEvent.class);
                    }
                    break;
                case 568613945:
                    if (str2.equals("decoration_edit")) {
                        ((C0UE4) LIZJ.getValue()).getClass();
                        if (Intrinsics.LJFF(str, "preview")) {
                            DataChannelGlobal.LLILZ.FQ2(PreviewDecorationEditSchemeEvent.class, map);
                        }
                    }
                    break;
                case 687944655:
                    if (str2.equals("open_panel")) {
                        LIZIZ(str, map);
                    }
                    break;
                case 1862616547:
                    if (str2.equals("create_board")) {
                        ((C0UE4) LIZJ.getValue()).getClass();
                        if (Intrinsics.LJFF(str, "preview")) {
                            String str4 = (String) map.get("show_entrance");
                            if (str4 != null) {
                                str3 = str4;
                            }
                            DataChannelGlobal.LLILZ.FQ2(PreviewSchemaCreateBoardEvent.class, str3);
                        }
                    }
                    break;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJ((String) map.get("fail_tips"));
            C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_broadcast_schema_dispatch_error");
            c760160TrqLIZ.LJII("page", str);
            c760160TrqLIZ.LJII(Scene.SCENE_SERVICE, str2);
            c760160TrqLIZ.LJII("params", map.toString());
            c760160TrqLIZ.LJII("error", th.getMessage());
            c760160TrqLIZ.LJIIIZ();
        }
    }
}
