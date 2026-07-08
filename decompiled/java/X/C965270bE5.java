package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableChannelBasedTrackSupportGroupChannelIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicChannelAbInfoReport;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStaticLogOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bE5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965270bE5 {
    public final ConcurrentHashMap<String, Map<String, Object>> LIZ = new ConcurrentHashMap<>();

    public C965270bE5() {
        new ArrayList();
        new ConcurrentHashSet();
    }

    public final HashMap<String, String> LIZ(InterfaceC965240bE2 interfaceC965240bE2) {
        EnumC965280bE6 enumC965280bE6;
        String str;
        String idStr;
        boolean z;
        List<String> multiHostChannelAbInfoReportList;
        String strValueOf;
        boolean z2;
        Long groupChannelId;
        LiveMode streamType;
        Long groupChannelId2;
        String strValueOf2;
        HashMap<String, String> map = new HashMap<>();
        int scene = interfaceC965240bE2.getScene();
        if (scene != 0) {
            if (scene != 2) {
                if (scene != 4) {
                    enumC965280bE6 = EnumC965280bE6.MULTI_GUEST;
                } else {
                    enumC965280bE6 = EnumC965280bE6.MULTI_GUEST;
                }
            } else {
                enumC965280bE6 = EnumC965280bE6.MULTI_HOST;
            }
        } else {
            enumC965280bE6 = EnumC965280bE6.UNION;
        }
        map.put(Scene.SCENE_SERVICE, enumC965280bE6.toString());
        map.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
        String strLJJIJIIJI = interfaceC965240bE2.LJJIJIIJI();
        String strLIZ = "";
        if (strLJJIJIIJI == null) {
            strLJJIJIIJI = "";
        }
        map.put("linkmic_id", strLJJIJIIJI);
        map.put("inner_channel_id", String.valueOf(interfaceC965240bE2.getChannelId()));
        if (EnableChannelBasedTrackSupportGroupChannelIdSetting.INSTANCE.isEnable()) {
            if ((interfaceC965240bE2.getScene() != 2 && interfaceC965240bE2.getScene() != 0) || (groupChannelId2 = interfaceC965240bE2.getGroupChannelId()) == null || (strValueOf2 = groupChannelId2.toString()) == null) {
                strValueOf2 = String.valueOf(interfaceC965240bE2.getChannelId());
            }
            map.put("channel_id", strValueOf2);
        }
        String strValueOf3 = String.valueOf(interfaceC965240bE2.LJJIJ());
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        map.put("rtc_room_id", strValueOf3);
        map.put("anchor_net", String.valueOf(interfaceC965240bE2.LJIIJJI()));
        String str2 = interfaceC965240bE2.LJJIIJZLJL().layoutId;
        if (str2 == null) {
            str2 = "";
        }
        map.put("layout", str2);
        if (interfaceC965240bE2.LJJIIZI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        map.put("room_id", idStr);
        map.put("uid", UserService.getInstance().user().LJIJJLI().getIdStr());
        Room roomLIZ = interfaceC965240bE2.LIZ();
        if (roomLIZ != null && (streamType = roomLIZ.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        map.put("live_type", strLIZ);
        map.put("server_time", String.valueOf(C963140bAe.LIZIZ()));
        map.put("client_time", String.valueOf(System.currentTimeMillis()));
        if (interfaceC965240bE2.Zf() && !interfaceC965240bE2.LJJIIZI()) {
            z = true;
        } else {
            z = false;
        }
        map.put("is_moderator", String.valueOf(z));
        if (interfaceC965240bE2.LJJIIZI() && (interfaceC965240bE2.getScene() == 4 || interfaceC965240bE2.getScene() == 0)) {
            map.put("is_resume_broadcast", String.valueOf(interfaceC965240bE2.A0() ? 1 : 0));
        }
        JSONObject jSONObject = new JSONObject();
        int scene2 = interfaceC965240bE2.getScene();
        if (scene2 != 2) {
            if (scene2 != 4) {
                multiHostChannelAbInfoReportList = null;
            } else {
                multiHostChannelAbInfoReportList = LinkMicChannelAbInfoReport.INSTANCE.getMultiGuestChannelAbInfoReportList();
            }
        } else {
            multiHostChannelAbInfoReportList = LinkMicChannelAbInfoReport.INSTANCE.getMultiHostChannelAbInfoReportList();
        }
        if (interfaceC965240bE2.getScene() != 2 || (groupChannelId = interfaceC965240bE2.getGroupChannelId()) == null || (strValueOf = groupChannelId.toString()) == null) {
            strValueOf = String.valueOf(interfaceC965240bE2.getChannelId());
        }
        Map<String, Object> map2 = this.LIZ.get(strValueOf);
        if (multiHostChannelAbInfoReportList != null) {
            for (String str3 : multiHostChannelAbInfoReportList) {
                if (str3 != null) {
                    if (map2 != null && map2.containsKey(str3)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        try {
                            jSONObject.put(str3, map2.get(str3));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        if (C500260Jjc.LJJIIZ(strJ3)) {
            map.put("channel_ab_info", strJ3);
        }
        try {
            map.put("nqe_score", String.valueOf(TTNetInit.getEffectiveConnectionType()));
            map.put("http_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZIZ));
            map.put("trans_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZ));
            map.put("in_bg", CardStruct.IStatusCode.DEFAULT);
            return map;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return map;
        }
    }

    public static void LIZJ(String str, HashMap map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        if (Intrinsics.LJFF("livesdk_linkmic_im_received", str) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        } else {
            c474500IjALIZ.LIZ();
        }
    }

    public final void LIZIZ(InterfaceC965240bE2 interfaceC965240bE2, boolean z, int i, String str, String str2, String str3, String str4, int i2, String str5) {
        String str6;
        String idStr;
        JSONObject jSONObjectLJI;
        String strOptString;
        String strLJIL;
        String strLJIL2;
        HashMap<String, String> mapLIZ = LIZ(interfaceC965240bE2);
        if (z) {
            str6 = "success";
        } else {
            str6 = "failed";
        }
        mapLIZ.put("state", str6);
        mapLIZ.put("delay", String.valueOf(i));
        Room roomLIZ = interfaceC965240bE2.LIZ();
        if (roomLIZ == null || (idStr = roomLIZ.getIdStr()) == null) {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZ.put("anchor_id", idStr);
        mapLIZ.put("stream_url", str);
        mapLIZ.put("action_type", str2);
        if (!z) {
            mapLIZ.put("cur_process", str3);
        }
        if (str4.length() > 0) {
            mapLIZ.put("fail_reason", str4);
        }
        String str7 = "";
        if (LiveStaticLogOptSetting.enable()) {
            InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
            if (interfaceC480510Isr == null || (strLJIL = interfaceC480510Isr.LJIL(309)) == null) {
                strLJIL = "";
            }
            mapLIZ.put("cdn_ip", strLJIL);
            if (interfaceC480510Isr != null && (strLJIL2 = interfaceC480510Isr.LJIL(310)) != null) {
                str7 = strLJIL2;
            }
            mapLIZ.put("resolution_type", str7);
        } else {
            InterfaceC480510Isr interfaceC480510Isr2 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
            if (interfaceC480510Isr2 != null) {
                jSONObjectLJI = interfaceC480510Isr2.LJI();
                if (jSONObjectLJI == null || (strOptString = jSONObjectLJI.optString("cdn_ip:", "")) == null) {
                }
                mapLIZ.put("cdn_ip", strOptString);
                if (jSONObjectLJI != null && (strOptString = jSONObjectLJI.optString("resolution:", "")) != null) {
                    str7 = strOptString;
                }
                mapLIZ.put("resolution_type", str7);
            } else {
                jSONObjectLJI = null;
            }
            String strOptString2 = "";
            mapLIZ.put("cdn_ip", strOptString2);
            if (jSONObjectLJI != null) {
                str7 = strOptString;
            }
            mapLIZ.put("resolution_type", str7);
        }
        mapLIZ.put("live_room_mode", String.valueOf(i2));
        mapLIZ.put("last_sei", str5);
        LIZJ("livesdk_linkmic_audience_layout_recognize_rate", mapLIZ);
    }
}
