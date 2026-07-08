package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.PollConf;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0KWP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KWP extends C0KWR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        boolean z;
        int secret;
        long j;
        long jLongValue;
        long j2;
        Object objValueOf;
        Long l;
        Long l2;
        Boolean boolValueOf = null;
        C0KWQ c0kwq = (C0KWQ) C1909107dp.LIZJ(C0KWQ.class, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            String roomStatus = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getRoomStatus();
            if (roomStatus == null) {
                roomStatus = "";
            }
            linkedHashMap.put(Scene.SCENE_SERVICE, roomStatus);
            w.LIZ.getClass();
            linkedHashMap.put("anchor_id", String.valueOf(w.LJ()));
            linkedHashMap.put("room_id", String.valueOf(w.LJIJJ()));
            linkedHashMap.put("enter_from_merge", w.LJIIIZ());
            linkedHashMap.put("enter_method", w.LJIIL());
            linkedHashMap.put("action_type", w.LIZLLL());
            linkedHashMap.put("request_id", w.LJIJI());
            linkedHashMap.put("video_id", w.LJJII());
            EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) dataChannelGlobal.gg0(BroadcastPageChannel.class);
            if (enumC500290Jjf != null) {
                boolValueOf = Boolean.valueOf(enumC500290Jjf.isAudience());
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            linkedHashMap.put("is_anchor", str);
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            boolean zOptBoolean = false;
            if (roomAuthStatus != null) {
                z = roomAuthStatus.creditEntranceForAudience;
            } else {
                z = false;
            }
            linkedHashMap.put("credit_entrance_for_audience", Boolean.valueOf(z));
            User owner = room.getOwner();
            if (owner != null) {
                secret = owner.getSecret();
            } else {
                secret = 0;
            }
            linkedHashMap.put("is_sec_room", Integer.valueOf(secret));
            PollConf pollConf = room.pollConf;
            long jLongValue2 = 0;
            if (pollConf != null) {
                j = pollConf.pollTemplateOptimizeGroup;
            } else {
                j = 0;
            }
            linkedHashMap.put("poll_template_optimize_group", Long.valueOf(j));
            RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
            if (roomAuthStatus2 != null && (l2 = roomAuthStatus2.customizablepoll) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            linkedHashMap.put("customizable_poll_auth", Long.valueOf(jLongValue));
            RoomAuthStatus roomAuthStatus3 = room.getRoomAuthStatus();
            if (roomAuthStatus3 != null) {
                j2 = roomAuthStatus3.customizablegiftpoll;
            } else {
                j2 = 0;
            }
            linkedHashMap.put("customizable_gift_vote_auth", Long.valueOf(j2));
            Hashtag hashtag = room.hashtag;
            if (hashtag != null) {
                objValueOf = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(hashtag.isUseGameTagAsHashTag())) ? 1 : 0);
            } else {
                objValueOf = 0L;
            }
            linkedHashMap.put("hashtag_is_game", objValueOf);
            linkedHashMap.put("is_esport_live_room", Integer.valueOf(C500260Jjc.LJJI(room) ? 1 : 0));
            linkedHashMap.put("gs_guessing_xtab_ab_param", Long.valueOf(room.gsGuessingXtabAbParam));
            linkedHashMap.put("game_multi_guess_creator", Integer.valueOf(C500260Jjc.LJJJJ(room) ? 1 : 0));
            Hashtag hashtag2 = room.hashtag;
            if (hashtag2 != null && (l = hashtag2.id) != null) {
                jLongValue2 = l.longValue();
            }
            linkedHashMap.put("choose_hashtag_id", Long.valueOf(jLongValue2));
            linkedHashMap.put("is_guess_xtab_live_room", Integer.valueOf(C500260Jjc.LJJJ(room) ? 1 : 0));
            String str2 = room.roomCreateAbParam;
            if (str2 != null) {
                zOptBoolean = new JSONObject(str2).optBoolean("enable_guessing_onboard_2", false);
                Map<String, Object> map = C1338270kvh.LIZ;
            }
            linkedHashMap.put("gs_guessing_board_enable", Boolean.valueOf(zOptBoolean));
        }
        c0kwq.setRoomTrackParam(linkedHashMap);
        completionBlock.onSuccess(c0kwq, "");
    }
}
