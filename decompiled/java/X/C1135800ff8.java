package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectPrefabSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.gift.model.GiftEffectStreamSpec;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAudienceDeviceScoreSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0ff8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135800ff8 {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static String LJIL() {
        Long l;
        String str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Map map = (Map) dataChannelGlobal.gg0(C1148040fys.class);
        if (map != null && (str = (String) map.get("anchor_id")) != null) {
            return str;
        }
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        return (c0ir5 == null || (l = c0ir5.LIZLLL) == null) ? "" : l.toString();
    }

    public static boolean LJJIII() {
        IInteractService iInteractService = C1128450fTH.LIZ;
        return C1128450fTH.LJJII(UserService.getInstance().user().getCurrentUserId());
    }

    public static String LJJ() {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static boolean LJJII() {
        return Intrinsics.LJFF(LJJ(), LJIL());
    }

    public static Map LJI(InterfaceC1136020ffU interfaceC1136020ffU) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLJIL = null;
        if (interfaceC1136020ffU != null) {
            strLJIL = interfaceC1136020ffU.LJIL();
        }
        if (strLJIL != null) {
            HashMap map = (HashMap) C2203708kF.LIZ(interfaceC1136020ffU.LJIL());
            Object obj = map.get("from_platform");
            if (obj != null) {
                linkedHashMap.put("from_platform", obj);
            }
            Object obj2 = map.get("from_version");
            if (obj2 != null) {
                linkedHashMap.put("from_version", obj2);
            }
        } else if (interfaceC1136020ffU != null && interfaceC1136020ffU.LJIIL() != null) {
            GiftMonitorInfo giftMonitorInfoLJIIL = interfaceC1136020ffU.LJIIL();
            if (giftMonitorInfoLJIIL != null && (str2 = giftMonitorInfoLJIIL.fromPlatform) != null) {
                linkedHashMap.put("from_platform", str2);
            }
            GiftMonitorInfo giftMonitorInfoLJIIL2 = interfaceC1136020ffU.LJIIL();
            if (giftMonitorInfoLJIIL2 != null && (str = giftMonitorInfoLJIIL2.fromVersion) != null) {
                linkedHashMap.put("from_version", str);
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }

    public static Map LJII(GiftMessage giftMessage) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = null;
        if (giftMessage != null) {
            str3 = giftMessage.LLIZLLLIL;
        }
        if (str3 != null) {
            HashMap map = (HashMap) C2203708kF.LIZ(giftMessage.LLIZLLLIL);
            Object obj = map.get("from_platform");
            if (obj != null) {
                linkedHashMap.put("from_platform", obj);
            }
            Object obj2 = map.get("from_version");
            if (obj2 != null) {
                linkedHashMap.put("from_version", obj2);
            }
        } else if (giftMessage != null && giftMessage.giftMonitorInfo != null) {
            GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo != null && (str2 = giftMonitorInfo.fromPlatform) != null) {
                linkedHashMap.put("from_platform", str2);
            }
            GiftMonitorInfo giftMonitorInfo2 = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo2 != null && (str = giftMonitorInfo2.fromVersion) != null) {
                linkedHashMap.put("from_version", str);
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }

    public static Map LJIIIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        Object obj;
        Object obj2;
        String string;
        Object obj3;
        long jLJIIL;
        String string2;
        String string3;
        String string4;
        Object obj4;
        AssetBundle.PrefabBundle prefabBundleLJIILIIL;
        List<Long> list;
        GiftEffectStreamSpec giftEffectStreamSpecLJIILL;
        boolean z;
        List<Integer> listLJFF;
        String strLJJLIIIJ;
        Object obj5;
        Object obj6;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        List<Integer> listLJFF2;
        GiftEffect giftEffectLJIJI;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectStreamSpec giftEffectStreamSpec;
        GiftEffect giftEffectLJIJI2;
        GiftEffectSpecs giftEffectSpecs2;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        List<Long> list2;
        Room room;
        long jLIZ = C158B.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        boolean zLJIIJ = interfaceC1136020ffU.LJIIJ();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (zLJIIJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_first_send", obj);
        linkedHashMap.put("gift_type", String.valueOf(C1135870ffF.LJII(interfaceC1136020ffU)));
        if (interfaceC1136020ffU.LJ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_local", obj2);
        String str2 = "";
        if (c0ir5 == null || (room = c0ir5.LIZIZ) == null || (string = Integer.valueOf(room.getOrientation()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("room_type", string);
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL();
        boolean z2 = false;
        if (interfaceC1136800fgkLJIILL != null && interfaceC1136800fgkLJIILL.getId() == UserService.getInstance().user().getCurrentUserId()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_own_send", obj3);
        InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII != null) {
            jLJIIL = interfaceC1136230ffpLJJII.LJIIL();
        } else {
            jLJIIL = -1;
        }
        linkedHashMap.put("color_id", String.valueOf(jLJIIL));
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
        if (interfaceC1136160ffiLJIIIIZZ == null || (string2 = Long.valueOf(interfaceC1136160ffiLJIIIIZZ.getId()).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("gift_id", string2);
        linkedHashMap.put("msg_id", String.valueOf(interfaceC1136020ffU.getMessageId()));
        linkedHashMap.put("log_id", interfaceC1136020ffU.getLogId());
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
        if (interfaceC1136800fgkLIZJ == null || (string3 = Long.valueOf(interfaceC1136800fgkLIZJ.getId()).toString()) == null) {
            string3 = "";
        }
        linkedHashMap.put("to_user_id", string3);
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL2 = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL2 == null || (string4 = Long.valueOf(interfaceC1136800fgkLJIILL2.getId()).toString()) == null) {
            string4 = "";
        }
        linkedHashMap.put("from_user_id", string4);
        linkedHashMap.put("current_server_time_ms", String.valueOf(jLIZ));
        linkedHashMap.put("current_local_time_ms", String.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("combo_count", String.valueOf(interfaceC1136020ffU.getRepeatCount()));
        linkedHashMap.put("repeat_count", String.valueOf(interfaceC1136020ffU.getRepeatCount()));
        linkedHashMap.put("effect_id", String.valueOf(C1135870ffF.LJFF(interfaceC1136020ffU)));
        if (LJJII()) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_anchor", obj4);
        if (LJJII()) {
            C1140740fn6.LIZ().getClass();
            linkedHashMap.put("anchor_stable_mode", String.valueOf(C781880Ulm.LJI));
        }
        LiveGiftEffectLayerEnabledSetting liveGiftEffectLayerEnabledSetting = LiveGiftEffectLayerEnabledSetting.INSTANCE;
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII2 != null && (giftEffectLJIJI2 = interfaceC1136230ffpLJJII2.LJIJI()) != null && (giftEffectSpecs2 = giftEffectLJIJI2.specs) != null && (giftEffectPrefabSpec = giftEffectSpecs2.prefab) != null && (list2 = giftEffectPrefabSpec.prefabAssetIds) != null && list2.size() > 0) {
                linkedHashMap.put("is_outfit", "1");
                linkedHashMap.put("prefab_effect_ids", list2.toString());
            }
        } else {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII3 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII3 != null && (prefabBundleLJIILIIL = interfaceC1136230ffpLJJII3.LJIILIIL()) != null && (list = prefabBundleLJIILIIL.prefabEffectIds) != null && list.size() > 0) {
                linkedHashMap.put("is_outfit", "1");
                linkedHashMap.put("prefab_effect_ids", list.toString());
            }
        }
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII4 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII4 != null && (giftEffectLJIJI = interfaceC1136230ffpLJJII4.LJIJI()) != null && (giftEffectSpecs = giftEffectLJIJI.specs) != null && (giftEffectStreamSpec = giftEffectSpecs.streamEffectSpec) != null) {
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpec.basicAssetId));
                listLJIILJJIL.addAll(giftEffectStreamSpec.extraAssetIds);
                linkedHashMap.put("stream_effect_ids", listLJIILJJIL.toString());
            }
        } else {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII5 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII5 != null && (giftEffectStreamSpecLJIILL = interfaceC1136230ffpLJJII5.LJIILL()) != null) {
                List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpecLJIILL.basicAssetId));
                listLJIILJJIL2.addAll(giftEffectStreamSpecLJIILL.extraAssetIds);
                linkedHashMap.put("stream_effect_ids", listLJIILJJIL2.toString());
            }
        }
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ2 = interfaceC1136020ffU.LJIIIIZZ();
        linkedHashMap.put("gift_sub_type", String.valueOf(C1135870ffF.LJI(interfaceC1136020ffU)));
        if (interfaceC1136160ffiLJIIIIZZ2 != null && (listLJFF2 = interfaceC1136160ffiLJIIIIZZ2.LJFF()) != null && !listLJFF2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            linkedHashMap.put("gift_vertical_scenarios", "");
        } else {
            if (interfaceC1136160ffiLJIIIIZZ2 != null && (listLJFF = interfaceC1136160ffiLJIIIIZZ2.LJFF()) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(listLJFF, ",", null, null, 0, null, null, 62)) != null) {
                str2 = strLJJLIIIJ;
            }
            linkedHashMap.put("gift_vertical_scenarios", str2);
        }
        long jLJFF = C1135870ffF.LJFF(interfaceC1136020ffU);
        linkedHashMap.put("gift_price", String.valueOf(C1135870ffF.LIZJ(interfaceC1136020ffU)));
        if (C1138640fji.LIZLLL(jLJFF) != null) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_effect_model_ready", obj5);
        if (C1138640fji.LJII(null, Long.valueOf(jLJFF))) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_resource_ready", obj6);
        for (Map.Entry entry : ((LinkedHashMap) LJI(interfaceC1136020ffU)).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        int repeatCount = interfaceC1136020ffU.getRepeatCount();
        int iLJII = C1135870ffF.LJII(interfaceC1136020ffU);
        List<GiftMessage.SponsorshipInfo> listLJIJI = interfaceC1136020ffU.LJIJI();
        if ((listLJIJI != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(listLJIJI)) != null && sponsorshipInfo.giftGalleryClickSponsor) || interfaceC1136020ffU.LJIILJJIL()) {
            z2 = true;
        }
        c1133690fbj.getClass();
        linkedHashMap.put("msg_count", String.valueOf(C1133690fbj.LIZ(repeatCount, iLJII, z2)));
        if (C1135870ffF.LJIJI(interfaceC1136020ffU) == UserService.getInstance().user().getCurrentUserId()) {
            str = "1";
        }
        linkedHashMap.put("is_recipient", str);
        C01GW c01gw = C1140890fnL.LIZ;
        linkedHashMap.put("render_sdk_version", String.valueOf(1));
        return linkedHashMap;
    }

    public static long LJIIZILJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        GiftMonitorInfo giftMonitorInfoLJIIL;
        String strLJIL = null;
        if (interfaceC1136020ffU != null) {
            giftMonitorInfoLJIIL = interfaceC1136020ffU.LJIIL();
        } else {
            giftMonitorInfoLJIIL = null;
        }
        long j = 0;
        if (giftMonitorInfoLJIIL != null) {
            GiftMonitorInfo giftMonitorInfoLJIIL2 = interfaceC1136020ffU.LJIIL();
            if (giftMonitorInfoLJIIL2 == null) {
                return 0L;
            }
            return giftMonitorInfoLJIIL2.send_gift_req_start_ms;
        }
        if (interfaceC1136020ffU != null) {
            strLJIL = interfaceC1136020ffU.LJIL();
        }
        try {
            String str = (String) ((HashMap) C2203708kF.LIZ(strLJIL)).get("send_gift_req_start_ms");
            if (str != null) {
                j = CastLongProtector.parseLong(str);
                return j;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j;
    }

    public static long LJIJ(GiftMessage giftMessage) {
        String str = null;
        if (giftMessage != null && giftMessage.giftMonitorInfo != null) {
            return giftMessage.giftMonitorInfo.send_gift_req_start_ms;
        }
        if (giftMessage != null) {
            str = giftMessage.LLIZLLLIL;
        }
        try {
            String str2 = (String) ((HashMap) C2203708kF.LIZ(str)).get("send_gift_req_start_ms");
            if (str2 != null) {
                return CastLongProtector.parseLong(str2);
            }
            return 0L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static long LJIJI(InterfaceC1136020ffU interfaceC1136020ffU) {
        GiftMonitorInfo giftMonitorInfoLJIIL;
        Long lLJIILIIL;
        String strLJIL = null;
        if (interfaceC1136020ffU != null) {
            strLJIL = interfaceC1136020ffU.LJIL();
        }
        if (strLJIL != null) {
            String str = (String) ((HashMap) C2203708kF.LIZ(interfaceC1136020ffU.LJIL())).get("send_gift_start_client_local_ms");
            if (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
                return 0L;
            }
            return lLJIILIIL.longValue();
        }
        if (interfaceC1136020ffU == null || interfaceC1136020ffU.LJIIL() == null || (giftMonitorInfoLJIIL = interfaceC1136020ffU.LJIIL()) == null) {
            return 0L;
        }
        return giftMonitorInfoLJIIL.sendGiftStartClientLocalMs;
    }

    public static long LJIJJ(GiftMessage giftMessage) {
        String str = null;
        if (giftMessage != null) {
            str = giftMessage.LLIZLLLIL;
        }
        if (str != null) {
            String str2 = (String) ((HashMap) C2203708kF.LIZ(giftMessage.LLIZLLLIL)).get("send_gift_start_client_local_ms");
            if (str2 == null) {
                return 0L;
            }
            return CastLongProtector.parseLong(str2);
        }
        if (giftMessage == null || giftMessage.giftMonitorInfo == null) {
            return 0L;
        }
        return giftMessage.giftMonitorInfo.sendGiftStartClientLocalMs;
    }

    public static void LJIJJLI(Map map) {
        w.LIZ.getClass();
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("enter_method", w.LJIIL());
        map.put("action_type", w.LIZLLL());
        map.put("video_id", w.LJJII());
        map.put("anchor_id", String.valueOf(w.LJ()));
        map.put("room_id", String.valueOf(w.LJIJJ()));
        map.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        map.put("audience_device_score", String.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue()));
        map.put("broadcast_scene", C1128450fTH.LJIILLIIL());
        int value = LiveGiftUserConsumeLayerSetting.INSTANCE.getValue();
        if (value != 0) {
            map.put("live_user_consume_layer", String.valueOf(value));
        }
        map.put("current_server_time_ms", String.valueOf(C158B.LIZ()));
        map.put("current_local_time_ms", String.valueOf(System.currentTimeMillis()));
    }

    public static long LJJI(DataChannel dataChannel) {
        String clientVersion;
        Long lLIZIZ;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null && (clientVersion = room.getClientVersion()) != null && (lLIZIZ = C1946707jt.LIZIZ(clientVersion)) != null) {
            return lLIZIZ.longValue();
        }
        return 0L;
    }

    public static long LJJIFFI(GiftMessage giftMessage) {
        User user = giftMessage.toUser;
        if (user != null) {
            Long lValueOf = Long.valueOf(user.getId());
            if (lValueOf.longValue() > 0) {
                return lValueOf.longValue();
            }
        }
        GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
        if (giftMonitorInfo != null) {
            return giftMonitorInfo.to_user_id;
        }
        return -1L;
    }

    public static int LJJIIJ(Gift gift) {
        Integer numValueOf;
        if (gift != null) {
            numValueOf = Integer.valueOf(gift.type);
        } else {
            numValueOf = null;
        }
        return C1135870ffF.LJIILJJIL(numValueOf) ? 1 : 0;
    }

    public static boolean LJJIIJZLJL(InterfaceC1136020ffU interfaceC1136020ffU) {
        String string;
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL;
        String strLJJ = LJJ();
        if (interfaceC1136020ffU != null && (interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL()) != null) {
            string = Long.valueOf(interfaceC1136800fgkLJIILL.getId()).toString();
        } else {
            string = null;
        }
        return Intrinsics.LJFF(strLJJ, string);
    }

    public static boolean LJJIIZ(GiftMessage giftMessage) {
        String string;
        User user;
        String strLJJ = LJJ();
        if (giftMessage != null && (user = giftMessage.fromUser) != null) {
            string = Long.valueOf(user.getId()).toString();
        } else {
            string = null;
        }
        return Intrinsics.LJFF(strLJJ, string);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0014. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.List r7, org.json.JSONObject r8) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135800ff8.LIZ(java.util.List, org.json.JSONObject):void");
    }

    public static void LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string;
        AssetBundle.PrefabBundle prefabBundleLJIILIIL;
        List<Long> list;
        GiftEffectStreamSpec giftEffectStreamSpecLJIILL;
        long id;
        long id2;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        GiftEffect giftEffectLJIJI;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectStreamSpec giftEffectStreamSpec;
        GiftEffect giftEffectLJIJI2;
        GiftEffectSpecs giftEffectSpecs2;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        List<Long> list2;
        int repeatCount = interfaceC1136020ffU.getRepeatCount();
        jSONObject.put("is_local", interfaceC1136020ffU.LJ());
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL != null) {
            string = Long.valueOf(interfaceC1136800fgkLJIILL.getId()).toString();
        } else {
            string = null;
        }
        jSONObject.put("is_own_send", Intrinsics.LJFF(string, LJJ()) ? 1 : 0);
        jSONObject.put("is_first_send", interfaceC1136020ffU.LJIIJ() ? 1 : 0);
        for (Map.Entry entry : ((LinkedHashMap) LJI(interfaceC1136020ffU)).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        LiveGiftEffectLayerEnabledSetting liveGiftEffectLayerEnabledSetting = LiveGiftEffectLayerEnabledSetting.INSTANCE;
        String str = "1";
        boolean z = true;
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII != null && (giftEffectLJIJI2 = interfaceC1136230ffpLJJII.LJIJI()) != null && (giftEffectSpecs2 = giftEffectLJIJI2.specs) != null && (giftEffectPrefabSpec = giftEffectSpecs2.prefab) != null && (list2 = giftEffectPrefabSpec.prefabAssetIds) != null && list2.size() > 0) {
                jSONObject.put("is_outfit", "1");
                jSONObject.put("prefab_effect_ids", list2.toString());
            }
        } else {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII2 != null && (prefabBundleLJIILIIL = interfaceC1136230ffpLJJII2.LJIILIIL()) != null && (list = prefabBundleLJIILIIL.prefabEffectIds) != null && list.size() > 0) {
                jSONObject.put("is_outfit", "1");
                jSONObject.put("prefab_effect_ids", list.toString());
            }
        }
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII3 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII3 != null && (giftEffectLJIJI = interfaceC1136230ffpLJJII3.LJIJI()) != null && (giftEffectSpecs = giftEffectLJIJI.specs) != null && (giftEffectStreamSpec = giftEffectSpecs.streamEffectSpec) != null) {
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpec.basicAssetId));
                listLJIILJJIL.addAll(giftEffectStreamSpec.extraAssetIds);
                jSONObject.put("stream_effect_ids", listLJIILJJIL.toString());
            }
        } else {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII4 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII4 != null && (giftEffectStreamSpecLJIILL = interfaceC1136230ffpLJJII4.LJIILL()) != null) {
                List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpecLJIILL.basicAssetId));
                listLJIILJJIL2.addAll(giftEffectStreamSpecLJIILL.extraAssetIds);
                jSONObject.put("stream_effect_ids", listLJIILJJIL2.toString());
            }
        }
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL2 = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL2 != null) {
            id = interfaceC1136800fgkLJIILL2.getId();
        } else {
            id = 0;
        }
        jSONObject2.put("from_user_id", id);
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
        if (interfaceC1136800fgkLIZJ != null) {
            id2 = interfaceC1136800fgkLIZJ.getId();
        } else {
            id2 = 0;
        }
        jSONObject2.put("to_user_id", id2);
        jSONObject2.put("msg_id", interfaceC1136020ffU.getMessageId());
        Object logId = interfaceC1136020ffU.getLogId();
        if (logId == null) {
            logId = 0L;
        }
        jSONObject2.put("log_id", logId);
        jSONObject2.put("group_id", interfaceC1136020ffU.getGroupId());
        jSONObject2.put("combo_count", interfaceC1136020ffU.getRepeatCount());
        jSONObject2.put("repeat_count", repeatCount);
        jSONObject2.put("disable_gift_tracking", interfaceC1136020ffU.LJIJJLI() ? 1 : 0);
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        int iLJII = C1135870ffF.LJII(interfaceC1136020ffU);
        List<GiftMessage.SponsorshipInfo> listLJIJI = interfaceC1136020ffU.LJIJI();
        if ((listLJIJI == null || (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(listLJIJI)) == null || !sponsorshipInfo.giftGalleryClickSponsor) && !interfaceC1136020ffU.LJIILJJIL()) {
            z = false;
        }
        c1133690fbj.getClass();
        jSONObject2.put("msg_count", String.valueOf(C1133690fbj.LIZ(repeatCount, iLJII, z)));
        if (C1135870ffF.LJIJI(interfaceC1136020ffU) != UserService.getInstance().user().getCurrentUserId()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_recipient", str);
        jSONObject2.put("is_history_msg", C1135870ffF.LJIIIIZZ(interfaceC1136020ffU));
        try {
            C1136370fg3.LIZ.getClass();
            for (Map.Entry entry2 : C1136370fg3.LIZ(interfaceC1136020ffU, null).entrySet()) {
                jSONObject2.put((String) entry2.getKey(), entry2.getValue());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZJ(GiftMessage giftMessage, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string;
        AssetBundle.PrefabBundle prefabBundle;
        List<Long> list;
        GiftEffectStreamSpec giftEffectStreamSpec;
        long id;
        long id2;
        long j;
        int i;
        String str;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectStreamSpec giftEffectStreamSpec2;
        GiftEffectSpecs giftEffectSpecs2;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        List<Long> list2;
        int i2 = giftMessage.repeatCount;
        jSONObject.put("is_local", giftMessage.LLILLL);
        User user = giftMessage.fromUser;
        if (user != null) {
            string = Long.valueOf(user.getId()).toString();
        } else {
            string = null;
        }
        jSONObject.put("is_own_send", Intrinsics.LJFF(string, LJJ()) ? 1 : 0);
        jSONObject.put("is_first_send", giftMessage.isFirstSendGift ? 1 : 0);
        for (Map.Entry entry : ((LinkedHashMap) LJII(giftMessage)).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        LiveGiftEffectLayerEnabledSetting liveGiftEffectLayerEnabledSetting = LiveGiftEffectLayerEnabledSetting.INSTANCE;
        boolean z = true;
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            GiftEffect giftEffect = giftMessage.giftEffect;
            if (giftEffect != null && (giftEffectSpecs2 = giftEffect.specs) != null && (giftEffectPrefabSpec = giftEffectSpecs2.prefab) != null && (list2 = giftEffectPrefabSpec.prefabAssetIds) != null && list2.size() > 0) {
                jSONObject.put("prefab_effect_ids", list2.toString());
            }
        } else {
            AssetBundle assetBundle = giftMessage.assetBundle;
            if (assetBundle != null && (prefabBundle = assetBundle.prefabBundle) != null && (list = prefabBundle.prefabEffectIds) != null && list.size() > 0) {
                jSONObject.put("prefab_effect_ids", list.toString());
            }
        }
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            GiftEffect giftEffect2 = giftMessage.giftEffect;
            if (giftEffect2 != null && (giftEffectSpecs = giftEffect2.specs) != null && (giftEffectStreamSpec2 = giftEffectSpecs.streamEffectSpec) != null) {
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpec2.basicAssetId));
                listLJIILJJIL.addAll(giftEffectStreamSpec2.extraAssetIds);
                jSONObject.put("stream_effect_ids", listLJIILJJIL.toString());
            }
        } else {
            AssetBundle assetBundle2 = giftMessage.assetBundle;
            if (assetBundle2 != null && (giftEffectStreamSpec = assetBundle2.streamEffectSpec) != null) {
                List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpec.basicAssetId));
                listLJIILJJIL2.addAll(giftEffectStreamSpec.extraAssetIds);
                jSONObject.put("stream_effect_ids", listLJIILJJIL2.toString());
            }
        }
        User user2 = giftMessage.fromUser;
        if (user2 != null) {
            id = user2.getId();
        } else {
            id = 0;
        }
        jSONObject2.put("from_user_id", id);
        User user3 = giftMessage.toUser;
        if (user3 != null) {
            id2 = user3.getId();
        } else {
            id2 = 0;
        }
        jSONObject2.put("to_user_id", id2);
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData != null) {
            j = commonMessageData.messageId;
        } else {
            j = 0;
        }
        jSONObject2.put("msg_id", j);
        Object obj = giftMessage.mLogId;
        if (obj == null) {
            obj = 0L;
        }
        jSONObject2.put("log_id", obj);
        jSONObject2.put("group_id", giftMessage.groupId);
        jSONObject2.put("combo_count", giftMessage.comboCount);
        jSONObject2.put("repeat_count", i2);
        jSONObject2.put("disable_gift_tracking", giftMessage.disableGiftTracking ? 1 : 0);
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        Gift gift = giftMessage.mGift;
        if (gift != null) {
            i = gift.type;
        } else {
            i = 0;
        }
        List<GiftMessage.SponsorshipInfo> list3 = giftMessage.sponsorshipInfo;
        if ((list3 == null || (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list3)) == null || !sponsorshipInfo.giftGalleryClickSponsor) && !giftMessage.multiGenerateMessage) {
            z = false;
        }
        c1133690fbj.getClass();
        jSONObject2.put("msg_count", String.valueOf(C1133690fbj.LIZ(i2, i, z)));
        if (LJJIFFI(giftMessage) == UserService.getInstance().user().getCurrentUserId()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_recipient", str);
        jSONObject2.put("is_history_msg", C500260Jjc.LJIIJ(giftMessage));
        try {
            C1136370fg3.LIZ.getClass();
            for (Map.Entry entry2 : C1136370fg3.LIZJ(giftMessage, null).entrySet()) {
                jSONObject2.put((String) entry2.getKey(), entry2.getValue());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static Map LJIIIIZZ(GiftMessage giftMessage, long j, long j2) {
        Object obj;
        String string;
        Object obj2;
        String string2;
        Object obj3;
        long jLongValue;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        Object obj4;
        AssetBundle.PrefabBundle prefabBundle;
        List<Long> list;
        GiftEffectStreamSpec giftEffectStreamSpec;
        String string8;
        boolean z;
        List<Integer> list2;
        String strLJJLIIIJ;
        String strValueOf;
        long j3;
        Object obj5;
        Object obj6;
        int i;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        List<Integer> list3;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectStreamSpec giftEffectStreamSpec2;
        GiftEffectSpecs giftEffectSpecs2;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        List<Long> list4;
        Room room;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        String str = "1";
        if (giftMessage.isFirstSendGift) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_first_send", obj);
        Gift gift = giftMessage.mGift;
        String str2 = "";
        if (gift == null || (string = Integer.valueOf(gift.type).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("gift_type", string);
        if (giftMessage.LLILLL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_local", obj2);
        if (c0ir5 == null || (room = c0ir5.LIZIZ) == null || (string2 = Integer.valueOf(room.getOrientation()).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("room_type", string2);
        User user = giftMessage.fromUser;
        boolean z2 = false;
        if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_own_send", obj3);
        Long l = giftMessage.colorId;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        linkedHashMap.put("color_id", String.valueOf(jLongValue));
        Gift gift2 = giftMessage.mGift;
        if (gift2 == null || (string3 = Long.valueOf(gift2.id).toString()) == null) {
            string3 = "";
        }
        linkedHashMap.put("gift_id", string3);
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData == null || (string4 = Long.valueOf(commonMessageData.messageId).toString()) == null) {
            string4 = "";
        }
        linkedHashMap.put("msg_id", string4);
        String str3 = giftMessage.mLogId;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("log_id", str3);
        User user2 = giftMessage.toUser;
        if (user2 == null || (string5 = Long.valueOf(user2.getId()).toString()) == null) {
            string5 = "";
        }
        linkedHashMap.put("to_user_id", string5);
        User user3 = giftMessage.fromUser;
        if (user3 == null || (string6 = Long.valueOf(user3.getId()).toString()) == null) {
            string6 = "";
        }
        linkedHashMap.put("from_user_id", string6);
        linkedHashMap.put("current_server_time_ms", String.valueOf(j));
        linkedHashMap.put("current_local_time_ms", String.valueOf(j2));
        String strValueOf2 = String.valueOf(giftMessage.comboCount);
        if (strValueOf2 == null) {
            strValueOf2 = "";
        }
        linkedHashMap.put("combo_count", strValueOf2);
        String strValueOf3 = String.valueOf(giftMessage.repeatCount);
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        linkedHashMap.put("repeat_count", strValueOf3);
        Gift gift3 = giftMessage.mGift;
        if (gift3 == null || (string7 = Long.valueOf(gift3.primaryEffectId).toString()) == null) {
            string7 = "";
        }
        linkedHashMap.put("effect_id", string7);
        if (LJJII()) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_anchor", obj4);
        if (LJJII()) {
            C1140740fn6.LIZ().getClass();
            linkedHashMap.put("anchor_stable_mode", String.valueOf(C781880Ulm.LJI));
        }
        LiveGiftEffectLayerEnabledSetting liveGiftEffectLayerEnabledSetting = LiveGiftEffectLayerEnabledSetting.INSTANCE;
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            GiftEffect giftEffect = giftMessage.giftEffect;
            if (giftEffect != null && (giftEffectSpecs2 = giftEffect.specs) != null && (giftEffectPrefabSpec = giftEffectSpecs2.prefab) != null && (list4 = giftEffectPrefabSpec.prefabAssetIds) != null && list4.size() > 0) {
                linkedHashMap.put("prefab_effect_ids", list4.toString());
            }
        } else {
            AssetBundle assetBundle = giftMessage.assetBundle;
            if (assetBundle != null && (prefabBundle = assetBundle.prefabBundle) != null && (list = prefabBundle.prefabEffectIds) != null && list.size() > 0) {
                linkedHashMap.put("prefab_effect_ids", list.toString());
            }
        }
        if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
            GiftEffect giftEffect2 = giftMessage.giftEffect;
            if (giftEffect2 != null && (giftEffectSpecs = giftEffect2.specs) != null && (giftEffectStreamSpec2 = giftEffectSpecs.streamEffectSpec) != null) {
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpec2.basicAssetId));
                listLJIILJJIL.addAll(giftEffectStreamSpec2.extraAssetIds);
                linkedHashMap.put("stream_effect_ids", listLJIILJJIL.toString());
            }
        } else {
            AssetBundle assetBundle2 = giftMessage.assetBundle;
            if (assetBundle2 != null && (giftEffectStreamSpec = assetBundle2.streamEffectSpec) != null) {
                List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(Long.valueOf(giftEffectStreamSpec.basicAssetId));
                listLJIILJJIL2.addAll(giftEffectStreamSpec.extraAssetIds);
                linkedHashMap.put("stream_effect_ids", listLJIILJJIL2.toString());
            }
        }
        Gift gift4 = giftMessage.mGift;
        if (gift4 == null || (string8 = Integer.valueOf(gift4.giftSubType).toString()) == null) {
            string8 = "";
        }
        linkedHashMap.put("gift_sub_type", string8);
        if (gift4 != null && (list3 = gift4.giftVerticalScenarios) != null && !list3.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            linkedHashMap.put("gift_vertical_scenarios", "");
        } else {
            if (gift4 != null && (list2 = gift4.giftVerticalScenarios) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62)) != null) {
                str2 = strLJJLIIIJ;
            }
            linkedHashMap.put("gift_vertical_scenarios", str2);
        }
        if (gift4 == null) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(gift4.diamondCount);
        }
        linkedHashMap.put("gift_price", strValueOf);
        long j4 = 0;
        if (gift4 != null) {
            j3 = gift4.primaryEffectId;
        } else {
            j3 = 0;
        }
        if (C1138640fji.LIZLLL(j3) != null) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_effect_model_ready", obj5);
        if (gift4 != null) {
            j4 = gift4.primaryEffectId;
        }
        if (C1138640fji.LJII(null, Long.valueOf(j4))) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_resource_ready", obj6);
        for (Map.Entry entry : ((LinkedHashMap) LJII(giftMessage)).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        int i2 = giftMessage.repeatCount;
        Gift gift5 = giftMessage.mGift;
        if (gift5 != null) {
            i = gift5.type;
        } else {
            i = 0;
        }
        List<GiftMessage.SponsorshipInfo> list5 = giftMessage.sponsorshipInfo;
        if ((list5 != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list5)) != null && sponsorshipInfo.giftGalleryClickSponsor) || giftMessage.multiGenerateMessage) {
            z2 = true;
        }
        c1133690fbj.getClass();
        linkedHashMap.put("msg_count", String.valueOf(C1133690fbj.LIZ(i2, i, z2)));
        if (LJJIFFI(giftMessage) != UserService.getInstance().user().getCurrentUserId()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_recipient", str);
        C01GW c01gw = C1140890fnL.LIZ;
        linkedHashMap.put("render_sdk_version", String.valueOf(1));
        return linkedHashMap;
    }

    public static void LJIIL(InterfaceC1136020ffU interfaceC1136020ffU, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Object obj;
        int orientation;
        Object obj2;
        Object obj3;
        int orientation2;
        Object obj4;
        long jLJIIL;
        long id;
        long id2;
        boolean z;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        Room room;
        String resourceFormat;
        Room room2;
        long jLIZ = C158B.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        jSONObject.put("is_first_send", interfaceC1136020ffU.LJIIJ() ? 1 : 0);
        jSONObject.put("gift_type", C1135870ffF.LJII(interfaceC1136020ffU));
        String str = "1";
        if (interfaceC1136020ffU.LJ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_local", obj);
        if (c0ir5 != null && (room2 = c0ir5.LIZIZ) != null) {
            orientation = room2.getOrientation();
        } else {
            orientation = 0;
        }
        jSONObject.put("room_type", orientation);
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL != null && interfaceC1136800fgkLJIILL.getId() == UserService.getInstance().user().getCurrentUserId()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_own_send", obj2);
        String resourceFormat2 = null;
        if (interfaceC1136020ffU.LJIIIIZZ() != null) {
            AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(C1135870ffF.LJFF(interfaceC1136020ffU));
            if (assetsModelLIZLLL != null) {
                resourceFormat = assetsModelLIZLLL.getResourceFormat();
            } else {
                resourceFormat = null;
            }
            jSONObject.put("resources_format", resourceFormat);
        }
        jSONObject2.put("is_first_send", interfaceC1136020ffU.LJIIJ() ? 1 : 0);
        jSONObject2.put("gift_type", C1135870ffF.LJII(interfaceC1136020ffU));
        if (interfaceC1136020ffU.LJ()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_local", obj3);
        jSONObject2.put("is_anchor", LJJII() ? 1 : 0);
        if (c0ir5 != null && (room = c0ir5.LIZIZ) != null) {
            orientation2 = room.getOrientation();
        } else {
            orientation2 = 0;
        }
        jSONObject2.put("room_type", orientation2);
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL2 = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL2 != null && interfaceC1136800fgkLJIILL2.getId() == UserService.getInstance().user().getCurrentUserId()) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_own_send", obj4);
        if (interfaceC1136020ffU.LJIIIIZZ() != null) {
            AssetsModel assetsModelLIZLLL2 = C1138640fji.LIZLLL(C1135870ffF.LJFF(interfaceC1136020ffU));
            if (assetsModelLIZLLL2 != null) {
                resourceFormat2 = assetsModelLIZLLL2.getResourceFormat();
            }
            jSONObject2.put("resources_format", resourceFormat2);
        }
        InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII != null) {
            jLJIIL = interfaceC1136230ffpLJJII.LJIIL();
        } else {
            jLJIIL = -1;
        }
        jSONObject2.put("color_id", jLJIIL);
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
        long id3 = 0;
        if (interfaceC1136160ffiLJIIIIZZ != null) {
            id = interfaceC1136160ffiLJIIIIZZ.getId();
        } else {
            id = 0;
        }
        jSONObject2.put("gift_id", id);
        jSONObject2.put("msg_id", interfaceC1136020ffU.getMessageId());
        jSONObject2.put("log_id", interfaceC1136020ffU.getLogId());
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
        if (interfaceC1136800fgkLIZJ != null) {
            id2 = interfaceC1136800fgkLIZJ.getId();
        } else {
            id2 = 0;
        }
        jSONObject2.put("to_user_id", id2);
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL3 = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL3 != null) {
            id3 = interfaceC1136800fgkLJIILL3.getId();
        }
        jSONObject2.put("from_user_id", id3);
        jSONObject2.put("current_server_time_ms", jLIZ);
        jSONObject2.put("current_local_time_ms", jCurrentTimeMillis);
        jSONObject2.put("combo_count", interfaceC1136020ffU.getRepeatCount());
        jSONObject2.put("repeat_count", interfaceC1136020ffU.getRepeatCount());
        jSONObject2.put("effect_id", C1135870ffF.LJFF(interfaceC1136020ffU));
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        int repeatCount = interfaceC1136020ffU.getRepeatCount();
        int iLJII = C1135870ffF.LJII(interfaceC1136020ffU);
        List<GiftMessage.SponsorshipInfo> listLJIJI = interfaceC1136020ffU.LJIJI();
        if ((listLJIJI != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(listLJIJI)) != null && sponsorshipInfo.giftGalleryClickSponsor) || interfaceC1136020ffU.LJIILJJIL()) {
            z = true;
        } else {
            z = false;
        }
        c1133690fbj.getClass();
        jSONObject2.put("msg_count", String.valueOf(C1133690fbj.LIZ(repeatCount, iLJII, z)));
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ2 = interfaceC1136020ffU.LIZJ();
        if (interfaceC1136800fgkLIZJ2 == null || interfaceC1136800fgkLIZJ2.getId() != UserService.getInstance().user().getCurrentUserId()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_recipient", str);
        jSONObject2.put("is_history_msg", C1135870ffF.LJIIIIZZ(interfaceC1136020ffU));
    }

    public static long LJIILLIIL(GiftMessage giftMessage, long j, long j2) {
        User user = giftMessage.fromUser;
        if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
            return j - LJIJJ(giftMessage);
        }
        return j2 - LJIJ(giftMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZI(org.json.JSONObject r3, org.json.JSONObject r4, com.bytedance.android.livesdk.model.Gift r5) throws org.json.JSONException {
        /*
            r1 = 0
            if (r5 == 0) goto L73
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r5.giftSubInfo
        L5:
            r2 = 1
            if (r0 == 0) goto L71
            if (r5 == 0) goto Lc
            com.bytedance.android.livesdk.model.GiftLockInfo r1 = r5.giftSubInfo
        Lc:
            boolean r0 = r1.mLock
            if (r0 == 0) goto L71
            r1 = 1
        L11:
            java.lang.String r0 = "is_lock"
            r3.put(r0, r1)
            if (r5 == 0) goto L6f
            com.bytedance.android.live.base.model.ImageModel r0 = r5.previewImage
            if (r0 == 0) goto L6f
            java.util.List r0 = X.C842240X2g.LIZ(r0)
            if (r0 == 0) goto L6f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L6f
        L2a:
            java.lang.String r0 = "dynamic_preview"
            r3.put(r0, r2)
            int r1 = X.C1128590fTV.LJJIJLIJ
            java.lang.String r0 = "preview_count"
            r4.put(r0, r1)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L6c
            long r2 = X.C158B.LIZ()
            X.0fU7 r0 = X.C1130100fVw.LIZ
            long r0 = r0.LJI
            long r2 = r2 - r0
        L45:
            java.lang.String r0 = "panel_stay_time"
            r4.put(r0, r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = X.C1135800ff8.LIZ
            long r2 = r2 - r0
            java.lang.String r0 = "live_duration"
            r4.put(r0, r2)
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            X.0eTE r0 = r0.getOverloadScoreRetriever()
            java.lang.String r1 = r0.LJIIL()
            java.lang.String r0 = "overload_score"
            r4.put(r0, r1)
            return
        L6c:
            r2 = 0
            goto L45
        L6f:
            r2 = 0
            goto L2a
        L71:
            r1 = 0
            goto L11
        L73:
            r0 = r1
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135800ff8.LJJIIZI(org.json.JSONObject, org.json.JSONObject, com.bytedance.android.livesdk.model.Gift):void");
    }

    public static void LIZLLL(InterfaceC1136020ffU interfaceC1136020ffU, Long l, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ;
        boolean z;
        String strLJJLIIIJ;
        long jLongValue;
        if (interfaceC1136020ffU != null && (interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ()) != null) {
            long jLJFF = C1135870ffF.LJFF(interfaceC1136020ffU);
            jSONObject.put("gift_id", interfaceC1136160ffiLJIIIIZZ.getId());
            jSONObject.put("gift_type", C1135870ffF.LJII(interfaceC1136020ffU));
            jSONObject.put("gift_sub_type", C1135870ffF.LJI(interfaceC1136020ffU));
            List<Integer> listLJFF = interfaceC1136160ffiLJIIIIZZ.LJFF();
            int i = 0;
            if (listLJFF != null && !listLJFF.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            String resourceFormat = null;
            if (z) {
                jSONObject.put("gift_vertical_scenarios", "");
            } else {
                List<Integer> listLJFF2 = interfaceC1136160ffiLJIIIIZZ.LJFF();
                if (listLJFF2 != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(listLJFF2, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                jSONObject.put("gift_vertical_scenarios", strLJJLIIIJ);
            }
            jSONObject.put("gift_price", C1135870ffF.LIZJ(interfaceC1136020ffU));
            jSONObject.put("effect_id", jLJFF);
            if (C1138640fji.LIZLLL(jLJFF) != null) {
                i = 1;
            }
            jSONObject.put("is_effect_model_ready", i);
            jSONObject.put("is_resource_ready", C1138640fji.LJII(null, Long.valueOf(jLJFF)) ? 1 : 0);
            AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(jLJFF);
            if (assetsModelLIZLLL != null) {
                resourceFormat = assetsModelLIZLLL.getResourceFormat();
            }
            jSONObject.put("resources_format", resourceFormat);
            jSONObject.put("is_interactive_gift", C1135870ffF.LJIILJJIL(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU))) ? 1 : 0);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject2.put("color_id", jLongValue);
        }
    }

    public static void LJ(Gift gift, Long l, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        boolean z;
        String strLJJLIIIJ;
        long jLongValue;
        jSONObject.put("gift_id", gift.id);
        jSONObject.put("gift_type", gift.type);
        jSONObject.put("gift_sub_type", gift.giftSubType);
        List<Integer> list = gift.giftVerticalScenarios;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String resourceFormat = null;
        if (z) {
            jSONObject.put("gift_vertical_scenarios", "");
        } else {
            List<Integer> list2 = gift.giftVerticalScenarios;
            if (list2 != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            jSONObject.put("gift_vertical_scenarios", strLJJLIIIJ);
        }
        jSONObject.put("gift_price", gift.diamondCount);
        jSONObject.put("effect_id", gift.primaryEffectId);
        if (C1138640fji.LIZLLL(gift.primaryEffectId) != null) {
            i = 1;
        }
        jSONObject.put("is_effect_model_ready", i);
        jSONObject.put("is_resource_ready", C1138640fji.LJII(null, Long.valueOf(gift.primaryEffectId)) ? 1 : 0);
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(gift.primaryEffectId);
        if (assetsModelLIZLLL != null) {
            resourceFormat = assetsModelLIZLLL.getResourceFormat();
        }
        jSONObject.put("resources_format", resourceFormat);
        jSONObject.put("is_interactive_gift", LJJIIJ(gift));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject2.put("color_id", jLongValue);
    }

    public static Map LJFF(int i, int i2, int i3, int i4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("queue_size", String.valueOf(i3 + i4));
        linkedHashMap.put("self_queue_size", String.valueOf(i3));
        linkedHashMap.put("others_queue_size", String.valueOf(i4));
        linkedHashMap.put("queue_node_count", String.valueOf(i + i2));
        linkedHashMap.put("self_queue_node_count", String.valueOf(i));
        linkedHashMap.put("others_queue_node_count", String.valueOf(i2));
        return linkedHashMap;
    }

    public static void LJIILJJIL(JSONObject jSONObject, JSONObject jSONObject2, long j, long j2) {
        int orientation;
        long id;
        Room room;
        Room room2;
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        jSONObject.put("is_anchor", LJJII() ? 1 : 0);
        if (c0ir5 != null && (room2 = c0ir5.LIZIZ) != null) {
            orientation = room2.getOrientation();
        } else {
            orientation = 0;
        }
        jSONObject.put("room_type", orientation);
        jSONObject.put("broadcast_scene", C1128450fTH.LJIILLIIL());
        int value = LiveGiftUserConsumeLayerSetting.INSTANCE.getValue();
        if (value != 0) {
            jSONObject.put("live_user_consume_layer", value);
        }
        jSONObject.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        jSONObject.put("audience_device_score", Float.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue()));
        jSONObject.put("is_background", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() ? 1 : 0);
        jSONObject.put("is_pad", ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() ? 1 : 0);
        if (c0ir5 != null && (room = c0ir5.LIZIZ) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        jSONObject2.put("room_id", id);
        Long lLIZIZ = C1946707jt.LIZIZ(LJIL());
        if (lLIZIZ != null) {
            jSONObject2.put("anchor_id", lLIZIZ.longValue());
        }
        jSONObject2.put("current_server_time_ms", String.valueOf(j));
        jSONObject2.put("current_local_time_ms", String.valueOf(j2));
        jSONObject2.put("overload_score", ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL());
        if (LJJII()) {
            C1140740fn6.LIZ().getClass();
            jSONObject2.put("anchor_stable_mode", C781880Ulm.LJI);
        }
    }

    public static void LJIIJJI(GiftMessage giftMessage, JSONObject jSONObject, JSONObject jSONObject2, long j, long j2) throws JSONException {
        int i;
        Object obj;
        int orientation;
        Object obj2;
        int i2;
        Object obj3;
        int orientation2;
        Object obj4;
        long jLongValue;
        long j3;
        long j4;
        long id;
        long id2;
        int i3;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        Room room;
        String resourceFormat;
        Room room2;
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        jSONObject.put("is_first_send", giftMessage.isFirstSendGift ? 1 : 0);
        Gift gift = giftMessage.mGift;
        boolean z = false;
        if (gift != null) {
            i = gift.type;
        } else {
            i = 0;
        }
        jSONObject.put("gift_type", i);
        String str = "1";
        if (giftMessage.LLILLL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_local", obj);
        if (c0ir5 != null && (room2 = c0ir5.LIZIZ) != null) {
            orientation = room2.getOrientation();
        } else {
            orientation = 0;
        }
        jSONObject.put("room_type", orientation);
        User user = giftMessage.fromUser;
        if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_own_send", obj2);
        Gift gift2 = giftMessage.mGift;
        String resourceFormat2 = null;
        if (gift2 != null) {
            AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(gift2.primaryEffectId);
            if (assetsModelLIZLLL != null) {
                resourceFormat = assetsModelLIZLLL.getResourceFormat();
            } else {
                resourceFormat = null;
            }
            jSONObject.put("resources_format", resourceFormat);
        }
        jSONObject2.put("is_first_send", giftMessage.isFirstSendGift ? 1 : 0);
        Gift gift3 = giftMessage.mGift;
        if (gift3 != null) {
            i2 = gift3.type;
        } else {
            i2 = 0;
        }
        jSONObject2.put("gift_type", i2);
        if (giftMessage.LLILLL) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_local", obj3);
        jSONObject2.put("is_anchor", LJJII() ? 1 : 0);
        if (c0ir5 != null && (room = c0ir5.LIZIZ) != null) {
            orientation2 = room.getOrientation();
        } else {
            orientation2 = 0;
        }
        jSONObject2.put("room_type", orientation2);
        User user2 = giftMessage.fromUser;
        if (user2 != null && user2.getId() == UserService.getInstance().user().getCurrentUserId()) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_own_send", obj4);
        Gift gift4 = giftMessage.mGift;
        if (gift4 != null) {
            AssetsModel assetsModelLIZLLL2 = C1138640fji.LIZLLL(gift4.primaryEffectId);
            if (assetsModelLIZLLL2 != null) {
                resourceFormat2 = assetsModelLIZLLL2.getResourceFormat();
            }
            jSONObject.put("resources_format", resourceFormat2);
        }
        Long l = giftMessage.colorId;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        jSONObject2.put("color_id", jLongValue);
        Gift gift5 = giftMessage.mGift;
        long j5 = 0;
        if (gift5 != null) {
            j3 = gift5.id;
        } else {
            j3 = 0;
        }
        jSONObject2.put("gift_id", j3);
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData != null) {
            j4 = commonMessageData.messageId;
        } else {
            j4 = 0;
        }
        jSONObject2.put("msg_id", j4);
        Object obj5 = giftMessage.mLogId;
        if (obj5 == null) {
            obj5 = 0;
        }
        jSONObject2.put("log_id", obj5);
        User user3 = giftMessage.toUser;
        if (user3 != null) {
            id = user3.getId();
        } else {
            id = 0;
        }
        jSONObject2.put("to_user_id", id);
        User user4 = giftMessage.fromUser;
        if (user4 != null) {
            id2 = user4.getId();
        } else {
            id2 = 0;
        }
        jSONObject2.put("from_user_id", id2);
        jSONObject2.put("current_server_time_ms", j);
        jSONObject2.put("current_local_time_ms", j2);
        jSONObject2.put("combo_count", giftMessage.comboCount);
        jSONObject2.put("repeat_count", giftMessage.repeatCount);
        Gift gift6 = giftMessage.mGift;
        if (gift6 != null) {
            j5 = gift6.primaryEffectId;
        }
        jSONObject2.put("effect_id", j5);
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        int i4 = giftMessage.repeatCount;
        Gift gift7 = giftMessage.mGift;
        if (gift7 != null) {
            i3 = gift7.type;
        } else {
            i3 = 0;
        }
        List<GiftMessage.SponsorshipInfo> list = giftMessage.sponsorshipInfo;
        if ((list != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list)) != null && sponsorshipInfo.giftGalleryClickSponsor) || giftMessage.multiGenerateMessage) {
            z = true;
        }
        c1133690fbj.getClass();
        jSONObject2.put("msg_count", String.valueOf(C1133690fbj.LIZ(i4, i3, z)));
        if (LJJIFFI(giftMessage) != UserService.getInstance().user().getCurrentUserId()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_recipient", str);
        jSONObject2.put("is_history_msg", C500260Jjc.LJIIJ(giftMessage));
    }
}
