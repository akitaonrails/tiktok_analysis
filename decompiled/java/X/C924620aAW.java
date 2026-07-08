package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS97S1000000_12;

/* JADX INFO: renamed from: X.0aAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924620aAW {
    public static final Map<String, String> LJIILL() {
        String string;
        String str;
        String strInvoke;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        RtcUserInfo rtcUserInfoG0 = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.G0() : null;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (rtcUserInfoG0 == null || (string = Long.valueOf(rtcUserInfoG0.channelId).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("channel_id", string);
        Function0<String> function0 = C474640IjO.LIZJ;
        if (function0 != null && (strInvoke = function0.invoke()) != null) {
            str2 = strInvoke;
        }
        linkedHashMap.put("link_id", str2);
        AwS97S1000000_12 awS97S1000000_12 = C474640IjO.LJFF;
        if (awS97S1000000_12 == null || (str = awS97S1000000_12.s0) == null) {
            str = "";
        }
        linkedHashMap.put("event_page", str);
        return linkedHashMap;
    }

    public static final void LIZIZ(Map map) {
        Map<String, Long> mapLJFF;
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ != null && (mapLJFF = interfaceC924740aAiLIZ.LJFF()) != null) {
            for (Map.Entry<String, Long> entry : mapLJFF.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(entry.getKey());
                sbLIZ.append("_duration");
                ((HashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(entry.getValue().longValue()));
            }
        }
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ2 != null) {
            interfaceC924740aAiLIZ2.LJII();
        }
    }

    public static final void LIZJ(Map map) {
        String strLLJI;
        String resourceId;
        HashMap map2 = (HashMap) map;
        map2.put("enhance_level", String.valueOf(C924790aAn.LIZLLL().LJ));
        if (C924790aAn.LIZLLL().LJFF != null) {
            strLLJI = C924790aAn.LIZLLL().LJFF.LLJI();
            resourceId = C924790aAn.LIZLLL().LJFF.getResourceId();
        } else {
            strLLJI = "";
            resourceId = "";
        }
        map2.put("sticker_id", strLLJI);
        map2.put("sticker_resource_id", resourceId);
    }

    public static final void LJ(Map map) {
        EnterRoomConfig.GuestUser guestUser;
        Long lLJII;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            guestUser = roomsData.guestUser;
        } else {
            guestUser = null;
        }
        if (guestUser != null) {
            long j = guestUser.uid;
            if (j > 0 && ((lLJII = C930540aK4.LJII()) == null || j != lLJII.longValue())) {
                map.put("mg_distribution_type", "guest");
                map.put("distribution_user_list", String.valueOf(guestUser.uid));
                return;
            }
        }
        map.put("mg_distribution_type", "anchor");
        map.put("distribution_user_list", String.valueOf(C930540aK4.LJII()));
    }

    public static final void LJFF(C474500IjA c474500IjA) {
        Integer numValueOf;
        Room roomLJJIII = PlaybookUtilKt.LJJIII();
        if (roomLJJIII != null) {
            numValueOf = Integer.valueOf((int) roomLJJIII.visibleScopeType);
        } else {
            numValueOf = null;
        }
        c474500IjA.LJJII(C473420IhQ.LIZ(numValueOf), "distribution_type");
    }

    public static final void LJII(Map map) {
        map.put("enhance_level", String.valueOf(C924790aAn.LIZLLL().LJ));
    }

    public static final void LJIIIIZZ(Map map) {
        String str;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJIIIZ) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put("is_muted", str);
    }

    public static final void LJIIIZ(Map map) {
        String strLJIILJJIL;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            strLJIILJJIL = multiGuestDataHolder.LJIILJJIL();
        } else {
            strLJIILJJIL = "";
        }
        map.put("guest_permission", strLJIILJJIL);
    }

    public static final void LJIIJ(Map map) {
        String resourceId;
        String string;
        LiveEffect liveEffect = C924790aAn.LIZLLL().LJFF;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
            resourceId = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("sticker_resource_id", resourceId);
        LiveEffect liveEffect2 = C924790aAn.LIZLLL().LJFF;
        if (liveEffect2 != null && (string = Long.valueOf(liveEffect2.getEffectId()).toString()) != null) {
            str = string;
        }
        map.put("sticker_id", str);
    }

    public static final void LJIIJJI(Map map) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        map.put("is_multi_guest_moderator", C923330a8R.LIZLLL());
    }

    public static final void LJIIL(Map map) {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        Map<String, String> map2;
        Object obj;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (map2 = roomsData.mgDistributionInfo) != null) {
            if (map2.containsKey("mg_distribution_type")) {
                map.putAll(map2);
                obj = Unit.LIZ;
            } else {
                LJ(map);
                obj = map;
            }
            if (obj != null) {
                return;
            }
        }
        LJ(map);
    }

    public static final void LJIILIIL(C474500IjA c474500IjA) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01Z4.LIZ(null, linkedHashMap);
        c474500IjA.LJJIIZI(linkedHashMap);
    }

    public static final void LIZ(C474500IjA c474500IjA, Long l) {
        String strLJIL;
        if (l == null) {
            return;
        }
        InterfaceC921620a5g interfaceC921620a5gLIZJ = C921180a4y.LIZJ();
        if (interfaceC921620a5gLIZJ == null || (strLJIL = interfaceC921620a5gLIZJ.LJIL(l.longValue())) == null) {
            strLJIL = "";
        }
        c474500IjA.LJJII(strLJIL, "agree_user_type");
    }

    public static final void LIZLLL(DataChannel dataChannel, Map map) {
        Boolean bool;
        String str;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C750260Tbs.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            str = "background_to_foreground";
        } else {
            str = "connection_success";
        }
        ((HashMap) map).put("connection_success_type", str);
    }

    public static final void LJI(DataChannel dataChannel, Map map) {
        EnterRoomConfig.RoomsData roomsData;
        String str;
        EnterRoomConfig.RoomsData roomsData2;
        String str2;
        if (dataChannel != null) {
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) dataChannel.gg0(C956800b0Q.class);
            if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null && (str2 = roomsData2.enterFromMerge) != null) {
                ((HashMap) map).put("enter_from_merge", str2);
            }
            EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) dataChannel.gg0(C956800b0Q.class);
            if (enterRoomConfig2 != null && (roomsData = enterRoomConfig2.mRoomsData) != null && (str = roomsData.enterMethod) != null) {
                ((HashMap) map).put("enter_method", str);
            }
        }
    }

    public static final int LJIILJJIL(InterfaceC927510aFB interfaceC927510aFB, String str) {
        if (interfaceC927510aFB == null || str == null || str.length() == 0 || !interfaceC927510aFB.LJIJ(str)) {
            return 0;
        }
        return 1;
    }
}
