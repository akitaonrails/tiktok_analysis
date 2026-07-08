package X;

import Y.ARunnableS17S1200000_12;
import Y.AfS148S0200000_12;
import Y.AkS484S0100000_23;
import android.graphics.Point;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.setting.TTLHVideoResolutionPortraitSettings;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCreateRoomRequestOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDonationOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAiGeneratedToggleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostEnableNetControlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostNetControlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSimulateAutoStartMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSimulateRoomId;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSimulationEnable;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostTrimRoomSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnableInitTimeCostOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHLiveABSettings;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorAdaptStrategyAddParamsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomCreateUserInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0URq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772400URq {
    public static final C772400URq LIZ = new C772400URq();

    public static void LIZLLL(LiveMode liveMode) {
        EnumC772440URu enumC772440URu;
        boolean z;
        int i = C198200pY.LIZ[liveMode.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    enumC772440URu = EnumC772440URu.ROOM_TYPE_UNKNOWN;
                } else {
                    enumC772440URu = EnumC772440URu.ROOM_TYPE_AUDIO;
                }
            } else {
                enumC772440URu = EnumC772440URu.ROOM_TYPE_GAME;
            }
        } else {
            enumC772440URu = EnumC772440URu.ROOM_TYPE_VIDEO;
        }
        C1271250jBb c1271250jBb = C1271270jBd.LIZ;
        C1271260jBc c1271260jBc = c1271250jBb.LIZ;
        if (enumC772440URu == EnumC772440URu.ROOM_TYPE_VIDEO) {
            z = true;
        } else {
            z = false;
        }
        c1271260jBc.LJI = z;
        Point pointLIZIZ = C14KS.LIZIZ(C497740JfY.LJII());
        String strValue = TTLHLiveABSettings.INSTANCE.value();
        if (!M2LEnableInitTimeCostOpt.INSTANCE.enabled() || !C781520UlC.LJIIJJI(liveMode)) {
            z2 = false;
        }
        c1271250jBb.LJIIIIZZ(pointLIZIZ.x, pointLIZIZ.y, strValue, z2, TTLHVideoResolutionPortraitSettings.anchorEverLinked());
    }

    public static void LJ(Room room) {
        if (room != null && room.getOwner() == null) {
            if (LiveHostTrimRoomSetting.INSTANCE.enable() || room.getOwner() == null) {
                User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                RoomCreateUserInfo roomCreateUserInfo = room.roomCreateUserInfo;
                if (roomCreateUserInfo != null) {
                    User.FansClubInfo fansClubInfo = roomCreateUserInfo.fansClubInfo;
                    if (fansClubInfo != null) {
                        userLJIJJLI.fansClubInfo = fansClubInfo;
                    }
                    SubscribeInfo subscribeInfo = roomCreateUserInfo.subscribeInfo;
                    if (subscribeInfo != null) {
                        userLJIJJLI.setSubscribeInfo(subscribeInfo);
                    }
                    User.OwnRoom ownRoom = room.roomCreateUserInfo.ownRoom;
                    if (ownRoom != null) {
                        userLJIJJLI.setOwnRoom(ownRoom);
                    }
                }
                room.setOwner(userLJIJJLI);
            }
        }
    }

    public final void LIZ(C772410URr c772410URr, String str) {
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
        if (LiveCreateRoomRequestOptSetting.INSTANCE.isEnable() && C772350URl.LIZJ.LIZIZ()) {
            return;
        }
        C772350URl.LIZJ.LIZJ(true);
        Integer numLIZ = InterfaceC772190UQv.o4.LIZ();
        if (numLIZ != null && numLIZ.intValue() != 0) {
            C0IUA.LJIJJ = numLIZ.intValue();
        }
        LIZIZ(c772410URr, str, 0);
    }

    public final void LIZIZ(C772410URr c772410URr, String str, int i) {
        String strValueOf;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        String strValue;
        String str3;
        String string;
        C772350URl c772350URl = C772350URl.LIZ;
        if (C772350URl.LIZJ.LIZIZ() && i <= 30) {
            if (LiveHostEnableNetControlSetting.INSTANCE.enable()) {
                C20441214yg.LIZIZ("HostNetCtrl", "create room");
                LiveDispatchConfig configByScene = LiveHostNetControlConfig.INSTANCE.getConfigByScene("biz_live_broadcast_create_room");
                if (configByScene != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create room: ");
                    sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), configByScene));
                    C20441214yg.LIZIZ("HostNetCtrl", C2188811AlT.LIZIZ(sbLIZ));
                    ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerNetworkControl(configByScene.getSceneName(), configByScene);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("thread: ");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C20441214yg.LIZIZ("LiveCreateRoomOptHelper", C2188811AlT.LIZIZ(sbLIZ2));
            LiveBroadcastResourceOptSetting liveBroadcastResourceOptSetting = LiveBroadcastResourceOptSetting.INSTANCE;
            int i7 = 1;
            if (liveBroadcastResourceOptSetting.enable() && !C772530USd.LIZ) {
                C772530USd.LIZ = true;
                C20441214yg.LIZIZ("BroadcastResOpt", "startOpt");
                C772530USd.LIZJ();
                C772530USd.LJIIIIZZ();
                if (liveBroadcastResourceOptSetting.throttleAppLog()) {
                    try {
                        if (!C772430URt.LIZ) {
                            C772430URt.LIZ = true;
                            BlockHelper.beginBlock();
                            C786410Ut5.LJLIIL(9000L, C772430URt.LIZIZ, C772430URt.LIZJ);
                            C20441214yg.LIZIZ("BroadcastResOpt", "applog blocked");
                        }
                        C20441214yg.LIZIZ("BroadcastResOpt", "applog flush throttled");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("throttleAppLog error: ");
                        sbLIZ3.append(th.getMessage());
                        C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                C772530USd.LIZIZ();
            }
            LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.QUIC);
            String string2 = "";
            if (!LiveDonationOptSetting.INSTANCE.enable() && c772410URr.LJIILIIL != null) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, String.valueOf(c772410URr.LJIILIIL.id));
                    jSONObject.put("content", c772410URr.LJIILIIL.content);
                    jSONObject.put("type", 3);
                    jSONObject.put("x", -1);
                    jSONObject.put("y", -1);
                    jSONObject.put("w", C12ES.LJIIJ(C497740JfY.LJII()));
                    jSONObject.put("h", C12ES.LJIIIIZZ(C497740JfY.LJII()));
                    jSONArray.put(jSONObject);
                    string2 = jSONArray.toString();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    string2 = "";
                }
            }
            C771680UOw.LJIIJ = c772410URr.LIZJ;
            C0IHL c0ihl = new C0IHL(0);
            c0ihl.LIZ("gen_replay", String.valueOf(c772410URr.LJIIL));
            c0ihl.LIZ("gift_auth", String.valueOf(c772410URr.LJI));
            c0ihl.LIZ("chat_auth", String.valueOf(c772410URr.LJII));
            c0ihl.LIZ("optout_gift_gallery", String.valueOf(c772410URr.LJJIIJ));
            c0ihl.LIZ("chat_sub_only_auth", String.valueOf(c772410URr.LJIIIIZZ));
            c0ihl.LIZ("transaction_history", String.valueOf(c772410URr.LJIIIZ));
            c0ihl.LIZ("shopping_ranking", String.valueOf(c772410URr.LJIIJJI));
            c0ihl.LIZ("friend_rank_switch", String.valueOf(c772410URr.LJIIJ));
            c0ihl.LIZ("title", c772410URr.LIZJ);
            c0ihl.LIZ("cover_uri", c772410URr.LIZLLL);
            c0ihl.LIZ("game", "");
            int i8 = c772410URr.LJ;
            if (i8 != -1) {
                strValueOf = String.valueOf(i8);
            } else {
                strValueOf = "";
            }
            c0ihl.LIZ("tags", strValueOf);
            c0ihl.LIZ("live_agreement", String.valueOf(0));
            c0ihl.LIZ("deco_list", string2);
            c0ihl.LIZ("has_commerce_goods", String.valueOf(false));
            c0ihl.LIZ("hashtag_id", String.valueOf(c772410URr.LJIILLIIL));
            c0ihl.LIZ("live_sub_only", String.valueOf(c772410URr.LJJIIZ));
            c0ihl.LIZ("disable_preview_sub_only", String.valueOf(c772410URr.LJJIJIIJI));
            c0ihl.LIZ("star_comment_switch", String.valueOf(c772410URr.LJJIZ.starCommentSwitch));
            c0ihl.LIZ("grant_group", String.valueOf(c772410URr.LJJIZ.grantGroup));
            c0ihl.LIZ("grant_level", String.valueOf(c772410URr.LJJIZ.grantLevel));
            c0ihl.LIZ("star_comment_qualification", String.valueOf(c772410URr.LJJIZ.starCommentQualification));
            c0ihl.LIZ("live_sub_only_use_music", String.valueOf(c772410URr.LJJJ));
            HashMap<String, String> map = c0ihl.LIZ;
            if (c772410URr.LJJIL) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (!LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
                i2 = 0;
            }
            map.put("allow_preview_duration_exp", String.valueOf(i2));
            long j = c772410URr.LJJIIZI;
            if (j >= 0) {
                map.put("live_sub_only_tier", String.valueOf(j));
            }
            long j2 = c772410URr.LJJIJ;
            if (j2 >= 0) {
                map.put("live_sub_only_month", String.valueOf(j2));
            }
            LiveMode liveMode = c772410URr.LIZIZ;
            if (liveMode == LiveMode.VIDEO) {
                map.put("probe_recommend_resolution", String.valueOf(c772410URr.LJJI));
                map.put("is_user_select", String.valueOf(c772410URr.LJJIFFI));
                C1D47 c1d47 = c772410URr.LJJJJL;
                if (c1d47 != null) {
                    map.put("overwrite_push_base_parameter", String.valueOf(c1d47.LIZLLL));
                    map.put("overwrite_push_base_default_bit_rate", String.valueOf(c772410URr.LJJJJL.LIZJ));
                    map.put("overwrite_push_base_max_bit_rate", String.valueOf(c772410URr.LJJJJL.LIZ));
                    map.put("overwrite_push_base_min_bit_rate", String.valueOf(c772410URr.LJJJJL.LIZIZ));
                    map.put("overwrite_push_base_resolution", String.valueOf(c772410URr.LJJJJL.LIZJ()));
                }
            } else if (liveMode == LiveMode.AUDIO) {
                map.put("live_audio", String.valueOf(1));
            } else if (liveMode == LiveMode.LIVE_VOICE) {
                map.put("live_voice", String.valueOf(1));
            } else if (liveMode == LiveMode.THIRD_PARTY) {
                map.put("third_party", String.valueOf(1));
            } else if (liveMode == LiveMode.SCREEN_RECORD) {
                map.put("screen_shot", String.valueOf(1));
                map.put("live_room_mode", String.valueOf(4));
                map.put("orientation", String.valueOf(c772410URr.LJIILL));
                if (!TextUtils.isEmpty(c772410URr.LJIJ)) {
                    map.put("sdk_key", c772410URr.LJIJ);
                }
            }
            long j3 = c772410URr.LJIJI;
            if (j3 != 0) {
                map.put("game_tag_id", String.valueOf(j3));
            }
            map.put("ecom_bc_toggle", String.valueOf(c772410URr.LJJIII));
            map.put("open_commercial_content_toggle", String.valueOf(c772410URr.LJJIIJZLJL.openCommercialContentToggle));
            map.put("commercial_content_promote_myself", String.valueOf(c772410URr.LJJIIJZLJL.promoteMyself));
            map.put("commercial_content_promote_third_party", String.valueOf(c772410URr.LJJIIJZLJL.promoteThirdParty));
            map.put("hold_living_room", String.valueOf(!c772410URr.LJIILJJIL ? 1 : 0));
            map.put("event_id", String.valueOf(c772410URr.LJIIZILJ));
            map.put("mobile_binded", String.valueOf(c772410URr.LJIJJ ? 1 : 0));
            map.put("mobile_validated", String.valueOf(c772410URr.LJIJJLI ? 1 : 0));
            map.put("screenshot_cover_status", String.valueOf(c772410URr.LJIL));
            map.put("age_restricted", String.valueOf(c772410URr.LJJII));
            map.put("create_source", String.valueOf(c772410URr.LJJIJIL));
            if (!TextUtils.isEmpty(c772410URr.LJJIJL)) {
                map.put("create_source_detail", String.valueOf(c772410URr.LJJIJL));
            }
            if (InterfaceC1106030et7.i6.LIZIZ().booleanValue()) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            map.put("spam_comments", String.valueOf(i3));
            if (InterfaceC1106030et7.j6.LIZIZ().booleanValue()) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            map.put("chat_l_2", String.valueOf(i4));
            if (InterfaceC1106030et7.k6.LIZIZ().booleanValue()) {
                i5 = 1;
            } else {
                i5 = 2;
            }
            map.put("community_flagged_chat_auth", String.valueOf(i5));
            if (InterfaceC1106030et7.l6.LIZIZ().booleanValue()) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            map.put("community_flagged_chat_review_auth", String.valueOf(i6));
            if (InterfaceC1106030et7.F4.LIZIZ().booleanValue()) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            map.put("enigma_whisper", str2);
            map.put("caption", String.valueOf(c772410URr.LJJIJIIJIL));
            map.put("group_chat_id", String.valueOf(c772410URr.LJJJI));
            map.put("enable_http_dns", String.valueOf(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).liveStrategyIsHttpDnsNotReady(1) ? 1 : 0));
            map.put("mute_duration", String.valueOf(((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).mx()));
            try {
                C0JT6<Boolean> c0jt6 = InterfaceC1106030et7.I7;
                if (c0jt6.LIZ() != null && !c0jt6.LIZ().booleanValue()) {
                    i7 = 2;
                }
                map.put("comment_tray_switch", String.valueOf(i7));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                map.put("comment_tray_switch", "1");
            }
            if (LiveAnchorAdaptStrategyAddParamsSetting.INSTANCE.getValue()) {
                HashMap map2 = new HashMap();
                map2.put("user_type", "anchor");
                map2.put("anchor_anr_opt", "1");
                ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).fillUploadFeatures(map2, "create_room");
                List<Long> list = C472970Igh.LIZ;
                String strLJIIIZ = C472970Igh.LJIIIZ(map2, null);
                if (strLJIIIZ != null) {
                    map.put("epi_features", strLJIIIZ);
                }
            }
            String strValueOf2 = String.valueOf(System.currentTimeMillis());
            map.put("timestamp", strValueOf2);
            map.put("tmp_method_from", str);
            if (i > 0) {
                map.put("retry_auto", String.valueOf(i));
            }
            if (LiveHostAiGeneratedToggleSetting.INSTANCE.enable()) {
                C0JT6<Boolean> c0jt62 = InterfaceC772190UQv.O3;
                if (c0jt62.LIZ() != null) {
                    string = c0jt62.LIZ().toString();
                } else {
                    string = Boolean.toString(false);
                }
                map.put("aigc_self_disclosure_switch", string);
            }
            if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getAudienceControlStatus()) {
                map.put("account_level_age_restricted", "4");
            } else {
                map.put("account_level_age_restricted", CardStruct.IStatusCode.DEFAULT);
            }
            int i9 = c772410URr.LJJJIL;
            if (i9 != -1) {
                map.put("visible_scope_type", String.valueOf(i9));
            }
            map.put("multi_guest_group_chat_auto_approve", String.valueOf(c772410URr.LJJJJIZL));
            if (HostAddLocationSetting.INSTANCE.enable()) {
                map.put("encrypted_latitude", c772410URr.LJJJJ);
                map.put("encrypted_longitude", c772410URr.LJJJJI);
            }
            map.put("is_gps_enabled", String.valueOf(c772410URr.LJJJJJL));
            map.put("enable_stream_translation", String.valueOf(c772410URr.LJJJJJ));
            BroadcastTimeLog.LIZ("room_create_start", strValueOf2);
            if (C491500JPg.LIZIZ().getHasPermission().getValue().booleanValue()) {
                if (C491500JPg.LIZIZ().getSwitchStateFlow().getValue().booleanValue()) {
                    str3 = "1";
                } else {
                    str3 = "2";
                }
                map.put("comment_reply_switch", str3);
            }
            if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable() && c772410URr.LIZIZ == LiveMode.SCREEN_RECORD) {
                map.put("game_bitrate_type", C19370910qR.LIZ().getValue());
            }
            C480460Ism.LIZ().getClass();
            C11NZ<StartLiveResponse<Room>> c11nzCreateRoom = ((RoomRetrofitApi) C480460Ism.LIZIZ(RoomRetrofitApi.class)).createRoom(map);
            if (LiveHostSimulationEnable.enable()) {
                if (TextUtils.isEmpty(LiveHostSimulateRoomId.value())) {
                    strValue = InterfaceC772190UQv.f125a3.LIZIZ();
                } else {
                    strValue = LiveHostSimulateRoomId.value();
                }
                if (!TextUtils.isEmpty(strValue)) {
                    map.put("simulation_room_id", strValue);
                    map.put("simulation_auto_start_message", String.valueOf(LiveHostSimulateAutoStartMessage.value()));
                    C480460Ism.LIZ().getClass();
                    c11nzCreateRoom = ((RoomRetrofitApi) C480460Ism.LIZIZ(RoomRetrofitApi.class)).createRoomReplay(map);
                }
            }
            InterfaceC420801kM interfaceC420801kMLJJLL = c11nzCreateRoom.LJJJJZI(new AkS484S0100000_23(this, 1)).LJJIJIIJIL(new AfS148S0200000_12(this, c772410URr, 55)).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(this, c772410URr, 56), new AfS148S0200000_12(this, c772410URr, 57));
            C772350URl c772350URl2 = C772350URl.LIZ;
            synchronized (c772350URl2) {
                if (LiveCreateRoomRequestOptSetting.INSTANCE.isEnable()) {
                    C772350URl.LIZIZ.LIZ(interfaceC420801kMLJJLL);
                }
            }
            C0URK.LIZ.LIZ((C11JF) interfaceC420801kMLJJLL);
            c772350URl2.LIZ(new ARunnableS17S1200000_12(this, c772410URr, str, 10));
            return;
        }
        c772350URl.LIZIZ();
    }

    public static void LIZJ(LiveMode liveMode, boolean z, int i, String str) {
        String str2;
        String str3;
        if (liveMode != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = "";
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_broadcast_path_get_room_create", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJIL();
        if (!z) {
            str3 = "normal";
        } else {
            str3 = "oneTab";
        }
        c474500IjALIZIZ.LJJII(str3, "enter_from");
        c474500IjALIZIZ.LJJII(str2, "live_mode");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_success");
        c474500IjALIZIZ.LJJII("normal", "is_smooth");
        c474500IjALIZIZ.LJJII(0, "is_continue");
        c474500IjALIZIZ.LJJII(str, "error");
        c474500IjALIZIZ.LIZ();
    }
}
