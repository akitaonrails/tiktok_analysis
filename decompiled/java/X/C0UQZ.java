package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.live.liveinteract.multiguestv3.PreviewMgGuideInviteUidListChannel;
import com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel;
import com.bytedance.android.livesdk.broadcast.PreviewPromoteTopicChannel;
import com.bytedance.android.livesdk.broadcast.PreviewSourceParamsDataChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.OpenInteractPanelChannel;
import com.bytedance.android.livesdk.dataChannel.OpenViewerWishesSetupChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewRevisionCoverChangeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSimulateAutoStartMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSimulationEnable;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookCoverSchemaSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreInviteGuestParamsEnableSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UQZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(JSONObject jSONObject) {
        String strOptString;
        Long lLJIILIIL;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("multi_guest_guide_invite_user_list");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("uid")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strOptString)) != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    String strOptString2 = jSONObjectOptJSONObject.optString("user_name");
                    if (strOptString2 != null) {
                        arrayList.add(new C418801k2(jLongValue, strOptString2));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                DataChannelGlobal.LLILZ.HQ2(PreviewMgGuideInviteUidListChannel.class, arrayList);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parseMgGuideInviteUidList: size=");
                sbLIZ.append(arrayList.size());
                C20441214yg.LIZIZ("ParseSchemaHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("ParseSchemaHelper", "parseMgGuideInviteUidList failed", e);
        }
    }

    public static void LIZ(Context context, DataChannel dataChannel, Bundle bundle) {
        Object objLIZ;
        long jLongValue;
        Hashtag hashtagS62;
        int iIntValue;
        Context contextLJJIIZI;
        String str = CardStruct.IStatusCode.DEFAULT;
        String string = bundle.getString("enter_from_type");
        String string2 = bundle.getString("enter_from");
        String str2 = "";
        String string3 = bundle.getString("enter_method", "");
        String string4 = bundle.getString("live_tab_show_type", "");
        C0UOP c0uop = (C0UOP) dataChannel.gg0(C758410Tp1.class);
        if (c0uop != null && c0uop.LJII) {
            c0uop.LJIIIIZZ = bundle.getLong("check_permission_duration", 0L);
            long j = bundle.getLong("start_add_preview_fragment_time", 0L);
            if (j > 0) {
                c0uop.LJ = j;
                c0uop.LJIIIZ = System.currentTimeMillis() - j;
            }
        }
        LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        dataChannel.SX0(C749520Tag.class, string);
        dataChannel.SX0(C0UNN.class, string2);
        dataChannel.SX0(C772030UQf.class, string3);
        dataChannel.SX0(C772100UQm.class, string4);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C931040aKs.class, "");
        dataChannelGlobal.JQ2(C930620aKC.class, new LinkedHashMap());
        if (LiveHostSimulationEnable.enable()) {
            InterfaceC772190UQv.f125a3.LJFF("");
            InterfaceC772190UQv.b3.LJFF("");
        }
        String string5 = bundle.getString("sourceParams");
        if (string5 != null) {
            try {
                JSONObject jSONObject = new JSONObject(string5);
                dataChannel.zW(PreviewSourceParamsDataChannel.class, jSONObject);
                String strOptString = jSONObject.optString("request_from");
                String strOptString2 = jSONObject.optString("request_page");
                long jOptLong = jSONObject.optLong("hashtag_id");
                long jOptLong2 = jSONObject.optLong("game_tag_id");
                String strOptString3 = jSONObject.optString("game_tag_name");
                try {
                    String strOptString4 = jSONObject.optString("hashtag_title");
                    int iOptInt = jSONObject.optInt("showApplyDialog");
                    int iOptInt2 = jSONObject.optInt("room_create_source");
                    String strOptString5 = jSONObject.optString("create_source_detail");
                    String strOptString6 = jSONObject.optString("popup_panel_url");
                    String strOptString7 = jSONObject.optString("entrance_request_id");
                    String strOptString8 = jSONObject.optString("entrance_room_id");
                    String strOptString9 = jSONObject.optString("toplive_guidance_type");
                    String strOptString10 = jSONObject.optString("click_position");
                    String strOptString11 = jSONObject.optString("toplive_guidance_is_show_tooltip", CardStruct.IStatusCode.DEFAULT);
                    try {
                        objLIZ = Integer.valueOf(jSONObject.optInt("gp_open_current_promote"));
                        C189200o6.m2constructorimpl(objLIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        objLIZ = C155000ia.LIZ(th);
                        C189200o6.m2constructorimpl(objLIZ);
                    }
                    if (C189200o6.m7isFailureimpl(objLIZ)) {
                        objLIZ = 0;
                    }
                    String strValueOf = String.valueOf(((Number) objLIZ).intValue());
                    if (C1533950q1J.LJ(strOptString8)) {
                        Map mapLJIIJ = C2097608Jq.LJIIJ(C0OFE.LIZ("entrance_room_id", strOptString8));
                        if (C1533950q1J.LJ(strOptString7)) {
                            mapLJIIJ.put("entrance_request_id", strOptString7);
                        }
                        dataChannel.SX0(C750470TcD.class, mapLJIIJ);
                    }
                    if (C1533950q1J.LJ(strOptString9)) {
                        dataChannel.SX0(C750480TcE.class, C2097608Jq.LJIIIIZZ(C0OFE.LIZ("guidance_type", strOptString9), C0OFE.LIZ("is_show_tooltip", strOptString11), C0OFE.LIZ("click_position", strOptString10)));
                    }
                    String strOptString12 = jSONObject.optString("template_id");
                    if (strOptString12.length() > 0) {
                        dataChannel.SX0(C772040UQg.class, strOptString12);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strOptString13 = jSONObject.optString("push_from");
                    if (C1533950q1J.LJ(strOptString13) && strOptString13 != null) {
                        linkedHashMap.put("push_from", strOptString13);
                    }
                    String strOptString14 = jSONObject.optString("entrance_request_id");
                    if (C1533950q1J.LJ(strOptString14) && strOptString14 != null) {
                        linkedHashMap.put("entrance_request_id", strOptString14);
                    }
                    String strOptString15 = jSONObject.optString("request_id");
                    if (C1533950q1J.LJ(strOptString15) && strOptString15 != null) {
                        linkedHashMap.put("request_id", strOptString15);
                    }
                    String strOptString16 = jSONObject.optString("is_ad");
                    if (C1533950q1J.LJ(strOptString16) && strOptString16 != null) {
                        linkedHashMap.put("is_ad", strOptString16);
                    }
                    if (C500260Jjc.LJJIIZ(jSONObject.optString("item_id"))) {
                        strOptString12 = jSONObject.optString("item_id");
                    }
                    if (C1533950q1J.LJ(strOptString12) && strOptString12 != null) {
                        linkedHashMap.put("item_id", strOptString12);
                    }
                    if (!linkedHashMap.isEmpty()) {
                        dataChannel.SX0(C750490TcF.class, linkedHashMap);
                    }
                    String strOptString17 = jSONObject.optString("feed_text_type");
                    if (C1533950q1J.LJ(strOptString17)) {
                        dataChannel.SX0(C0UJC.class, strOptString17);
                    }
                    String strOptString18 = jSONObject.optString("enter_from");
                    if (C1533950q1J.LJ(strOptString18)) {
                        dataChannel.SX0(C0UNN.class, strOptString18);
                    }
                    if (C1533950q1J.LJ(jSONObject.optString("lschannel"))) {
                        dataChannel.SX0(C771420UNw.class, jSONObject.optString("lschannel"));
                    }
                    String strOptString19 = jSONObject.optString("effect_resource_id");
                    if (strOptString19.length() > 0) {
                        dataChannel.SX0(C0UJD.class, strOptString19);
                    }
                    String strOptString20 = jSONObject.optString("mt_co_host_offlive_inviter_id");
                    DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(strOptString20);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    dataChannelGlobal2.JQ2(C944430agT.class, Long.valueOf(jLongValue));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    String str3 = (String) dataChannel.gg0(C0UNN.class);
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap2.put("enter_from", str3);
                    String strOptString21 = jSONObject.optString("remind_channel");
                    if (C1533950q1J.LJ(strOptString21) && strOptString21 != null) {
                        linkedHashMap2.put("remind_channel", strOptString21);
                    }
                    String strOptString22 = jSONObject.optString("mapping_id");
                    if (C1533950q1J.LJ(strOptString22) && strOptString22 != null) {
                        linkedHashMap2.put("mapping_id", strOptString22);
                    }
                    String strOptString23 = jSONObject.optString("pull_cohost_panel");
                    if (C1533950q1J.LJ(strOptString23) && strOptString23 != null) {
                        linkedHashMap2.put("pull_cohost_panel", strOptString23);
                    }
                    String strOptString24 = jSONObject.optString("token");
                    if (C1533950q1J.LJ(strOptString24) && strOptString24 != null) {
                        linkedHashMap2.put("token", strOptString24);
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        dataChannelGlobal2.JQ2(C944420agS.class, linkedHashMap2);
                    }
                    dataChannelGlobal2.JQ2(C930740aKO.class, Boolean.valueOf(Boolean.parseBoolean(jSONObject.optString("show_playbook_banner"))));
                    String strOptString25 = jSONObject.optString("banner_id");
                    String strOptString26 = jSONObject.optString("banner_from");
                    boolean zOptBoolean = jSONObject.optBoolean("use_internal_schema", false);
                    String strOptString27 = jSONObject.optString("schema_params");
                    boolean zOptBoolean2 = jSONObject.optBoolean("auto_karaoke", false);
                    InterfaceC765730U1z karaokeModule = C781270Ukn.LJI().getKaraokeModule();
                    if (karaokeModule != null) {
                        ((C765720U1y) karaokeModule).LIZ(zOptBoolean2);
                    }
                    if (zOptBoolean && strOptString27.length() > 0) {
                        dataChannel.SX0(C755670Tkb.class, strOptString27);
                    }
                    if (jSONObject.optBoolean("should_show_encourage_guidance", false)) {
                        dataChannel.SX0(C771530UOh.class, new C772120UQo(jSONObject.optString("push_from", ""), jSONObject.optString("push_label", ""), jSONObject.optString("rule_id", "")));
                    }
                    if (jSONObject.optBoolean("should_show_new_host_encourage_guidance", false)) {
                        dataChannel.SX0(C771500UOe.class, Boolean.TRUE);
                    }
                    String strOptString28 = jSONObject.optString("push_from");
                    String strOptString29 = jSONObject.optString("rank_enter_type");
                    if (C1533950q1J.LJ(strOptString28) || C1533950q1J.LJ(strOptString29)) {
                        Bundle bundle2 = new Bundle();
                        C786410Ut5.LJJJI("push_from", strOptString28, bundle2);
                        C786410Ut5.LJJJI("rank_enter_type", strOptString29, bundle2);
                        dataChannel.SX0(C772020UQe.class, bundle2);
                    }
                    C1121960fIo.LIZ(dataChannel, jSONObject);
                    if (MultiGuestPreInviteGuestParamsEnableSetting.INSTANCE.isEnable()) {
                        LIZIZ(jSONObject);
                    }
                    C20392214qm.LIZIZ(dataChannel, jSONObject);
                    String strOptString30 = jSONObject.optString("live_title");
                    if (strOptString30.length() > 0) {
                        Map map = (Map) dataChannel.gg0(PreviewLiveModeTitleChannel.class);
                        if (map != null) {
                            LiveMode liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
                            if (liveModeLIZJ == null) {
                                liveModeLIZJ = LiveMode.VIDEO;
                            }
                            map.put(liveModeLIZJ, strOptString30);
                        }
                        dataChannel.zW(PreviewTitleChannel.class, jSONObject.optString(strOptString30));
                    }
                    if (LinkMicPlaybookCoverSchemaSetting.INSTANCE.isEnable()) {
                        String strOptString31 = jSONObject.optString("cover_url");
                        String strOptString32 = jSONObject.optString("cover_uri");
                        if (C500260Jjc.LJJIIZ(strOptString31) && C500260Jjc.LJJIIZ(strOptString32)) {
                            dataChannel.zW(PreviewRevisionCoverChangeChannel.class, new Pair(strOptString32, Collections.singletonList(strOptString31)));
                        }
                    }
                    dataChannel.SX0(C772000UQc.class, Integer.valueOf(iOptInt2));
                    dataChannel.SX0(C772090UQl.class, strOptString5);
                    dataChannel.SX0(C0ULR.class, strOptString6);
                    dataChannelGlobal2.JQ2(C930950aKj.class, strOptString25);
                    dataChannelGlobal2.JQ2(C930960aKk.class, strOptString26);
                    dataChannel.SX0(C771430UNx.class, new C772150UQr(jSONObject.optString("child_tab"), jSONObject.optString("convert_game_live_acu_type"), jSONObject.optString("tmp_id")));
                    dataChannelGlobal2.JQ2(C931040aKs.class, strOptString);
                    if (Intrinsics.LJFF(jSONObject.optString("display_viewerwishes_setup", ""), "1")) {
                        String strOptString33 = jSONObject.optString(Scene.SCENE_SERVICE);
                        if (strOptString33 == null) {
                            strOptString33 = "";
                        }
                        String strOptString34 = jSONObject.optString("skip_new_guidance");
                        if (strOptString34 == null) {
                            strOptString34 = "";
                        }
                        boolean zLJFF = Intrinsics.LJFF(strOptString34, "1");
                        String strOptString35 = jSONObject.optString("campaign_gift_list");
                        if (strOptString35 == null) {
                            strOptString35 = "";
                        }
                        String strOptString36 = jSONObject.optString("campaign_name");
                        if (strOptString36 == null) {
                            strOptString36 = "";
                        }
                        String strOptString37 = jSONObject.optString("campaign_activity_id");
                        if (strOptString37 == null) {
                            strOptString37 = "";
                        }
                        String strOptString38 = jSONObject.optString("save_type");
                        if (strOptString38 == null) {
                            strOptString38 = "";
                        }
                        String strOptString39 = jSONObject.optString("template_id");
                        if (strOptString39 == null) {
                            strOptString39 = "";
                        }
                        dataChannel.zW(OpenViewerWishesSetupChannel.class, new C773980UXs(strOptString33, strOptString35, strOptString36, strOptString37, strOptString38, strOptString39, zLJFF));
                    }
                    if (Intrinsics.LJFF(jSONObject.optString("display_interaction", CardStruct.IStatusCode.DEFAULT), "1")) {
                        dataChannel.zW(OpenInteractPanelChannel.class, Boolean.TRUE);
                    }
                    dataChannel.SX0(C0ULI.class, strOptString2);
                    dataChannel.SX0(C749500Tae.class, C2097908Jt.LIZJ(C0OFE.LIZ("gp_open_current_promote", strValueOf)));
                    Long lValueOf = Long.valueOf(jOptLong2);
                    if (lValueOf.longValue() != 0) {
                        long jLongValue2 = lValueOf.longValue();
                        GameTag gameTag = new GameTag(null, null, null, null, 0, null, null, null, null, 511, null);
                        gameTag.id = Long.valueOf(jLongValue2);
                        strOptString3.toString();
                        gameTag.showName = strOptString3;
                        C754700Tj2.LIZLLL(gameTag);
                        dataChannel.SX0(C754660Tiy.class, String.valueOf(jLongValue2));
                    }
                    if (jOptLong != 0 && !Intrinsics.LJFF(strOptString4, "")) {
                        hashtagS62 = new Hashtag(Long.valueOf(jOptLong), strOptString4, null, 0);
                        C754700Tj2.LJ(hashtagS62);
                    } else {
                        hashtagS62 = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).s62(liveMode);
                    }
                    dataChannel.zW(HashtagChangedChannel.class, hashtagS62);
                    if (iOptInt == 1 && (contextLJJIIZI = C520010KaN.LJJIIZI(context, false)) != null) {
                        C771930UPv.LIZIZ(dataChannel, contextLJJIIZI, liveMode.getModeFromServer());
                    }
                    Integer numValueOf = Integer.valueOf(jSONObject.optInt("back_to_event", -1));
                    if (numValueOf.intValue() != -1) {
                        dataChannel.SX0(C772060UQi.class, Integer.valueOf(numValueOf.intValue()));
                    }
                    if (LiveHostSimulationEnable.enable()) {
                        C20337914i1<String> c20337914i1 = InterfaceC772190UQv.f125a3;
                        String strOptString40 = jSONObject.optString("simulation_room_id");
                        if (strOptString40 == null) {
                            strOptString40 = "";
                        }
                        c20337914i1.LJFF(strOptString40);
                        C20337914i1<String> c20337914i12 = InterfaceC772190UQv.b3;
                        String strOptString41 = jSONObject.optString("simulation_anchor_id");
                        if (strOptString41 != null) {
                            str2 = strOptString41;
                        }
                        c20337914i12.LJFF(str2);
                        String strOptString42 = jSONObject.optString("simulation_auto_start_message");
                        if (strOptString42 != null) {
                            str = strOptString42;
                        }
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
                        if (numLJIIJJI != null) {
                            iIntValue = numLJIIJJI.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        LiveHostSimulateAutoStartMessage.setAutoStartMessage(iIntValue);
                    }
                    String strOptString43 = jSONObject.optString("promote_topic_id");
                    String strOptString44 = jSONObject.optString("promote_topic_name");
                    if (strOptString43.length() > 0 && strOptString44.length() > 0) {
                        dataChannel.zW(PreviewPromoteTopicChannel.class, C0OFE.LIZ(strOptString43, strOptString44));
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    String strOptString45 = jSONObject.optString("inner_room_id");
                    if (C1533950q1J.LJ(strOptString45) && strOptString45 != null) {
                        linkedHashMap3.put("inner_room_id", strOptString45);
                    }
                    String strOptString46 = jSONObject.optString("inner_enter_from_merge");
                    if (C1533950q1J.LJ(strOptString46) && strOptString46 != null) {
                        linkedHashMap3.put("inner_enter_from_merge", strOptString46);
                    }
                    String strOptString47 = jSONObject.optString("inner_enter_method");
                    if (C1533950q1J.LJ(strOptString47) && strOptString47 != null) {
                        linkedHashMap3.put("inner_enter_method", strOptString47);
                    }
                    dataChannelGlobal2.JQ2(C930620aKC.class, linkedHashMap3);
                    dataChannel.SX0(C772110UQn.class, string5);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LIZIZ("ParseSchemaHelper", "source params json parse failed!");
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        C0IUA.LJII(C0UQX.LIZLLL(dataChannel, (String) DataChannelGlobal.LLILZ.gg0(C931040aKs.class), (String) dataChannel.gg0(C0UNN.class), string3));
    }
}
