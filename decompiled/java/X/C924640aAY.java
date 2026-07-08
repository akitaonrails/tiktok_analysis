package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.PermitBizContent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924640aAY {
    public static final C924640aAY LIZ = new C924640aAY();
    public static Integer LIZIZ;
    public static Long LIZJ;

    public static void LIZ(Map map) {
        boolean zBooleanValue;
        String str;
        String str2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Boolean bool = (Boolean) dataChannelGlobal.gg0(C930560aK6.class);
        boolean zBooleanValue2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = (Boolean) dataChannelGlobal.gg0(C930570aK7.class);
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        if (!zBooleanValue && !zBooleanValue2) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put("is_chat_link", str);
        if (zBooleanValue) {
            str2 = "chat_live";
        } else if (zBooleanValue2) {
            str2 = "chat_mutual_notice";
        } else {
            str2 = "other";
        }
        map.put("enter_from", str2);
    }

    public static void LJIIIIZZ(Long l) {
        LIZJ = l;
        if (C928400aGc.LLILLJJLI == null) {
            C928400aGc.LLILLJJLI = l;
        } else {
            if (l == null) {
                return;
            }
            C928400aGc.LLILLJJLI = l;
        }
    }

    public static void LIZIZ(long j, DataChannel dataChannel, String str, boolean z) {
        Object objGg0;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        if (C924810aAp.LJ().LJJIJLIJ) {
            return;
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("request_page", str);
        map.put("anchor_relationship", String.valueOf(j));
        String str3 = CardStruct.IStatusCode.DEFAULT;
        map.put("is_effect_icon", CardStruct.IStatusCode.DEFAULT);
        if (C925150aBN.LJJIII()) {
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_grey", obj);
            if (z) {
                map.put("grey_reason", "anchor_settings");
            }
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 3) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("anchor_request_settings_friends", obj2);
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF2 = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF2 != null && multiLiveAnchorPanelSettingsLJFF2.allowRequestFromFollowers == 3) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("anchor_request_settings_followers", obj3);
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF3 = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF3 != null && multiLiveAnchorPanelSettingsLJFF3.allowRequestFromOthers == 3) {
                str3 = "1";
            }
            map.put("anchor_request_settings_other_viewers", str3);
        }
        C917750ZzR.LIZIZ(map);
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C0TZM.class);
        } else {
            objGg0 = null;
        }
        if (Intrinsics.LJFF(objGg0, Boolean.FALSE)) {
            str2 = "landscape";
        } else {
            str2 = "portrait";
        }
        map.put("room_orientation", str2);
        C0KX4.LIZ("livesdk_guest_connection_icon_show", map, null, true);
        C924630aAX.LIZ.LJJIJLIJ(true, map, z);
    }

    public static void LIZLLL(String str, int i, int i2, Long l, Integer num, Long l2, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put(Scene.SCENE_SERVICE, str);
        map.put("response_status", String.valueOf(i));
        map.put("is_visible", String.valueOf(i2));
        if (l != null) {
            map.put("permission_error_code", String.valueOf(l.longValue()));
        }
        if (num != null) {
            map.put("error_code", String.valueOf(num.intValue()));
        }
        if (l2 != null) {
            map.put("duration", String.valueOf(l2.longValue()));
        }
        if (str2 != null) {
            map.put("log_id", str2);
        }
        C0KX4.LIZ("livesdk_linkmic_multi_guest_icon_show", map, Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()), true);
    }

    public static void LJII(boolean z, String str, String str2, String str3, int i, DataChannel dataChannel, EnumC918990a1R enumC918990a1R, boolean z2) {
        LIZJ(LIZ, z, "anchor_invite_guest", str, str2, str3, i, dataChannel, enumC918990a1R, false, false, "receiveInviteV", "acceptBtn", null, z2, 9856);
    }

    public final void LJI(boolean z, String str, String str2, String str3, int i, DataChannel dataChannel, EnumC918990a1R enumC918990a1R, PermitApplyMessage permitApplyMessage) {
        boolean z2;
        boolean z3;
        BusinessContent businessContent;
        MultiLiveContent multiLiveContent;
        PermitBizContent permitBizContent;
        BusinessContent businessContent2;
        MultiLiveContent multiLiveContent2;
        PermitBizContent permitBizContent2;
        SpotInfo next;
        MultiGuestSpotExtra multiGuestSpotExtra;
        String str4;
        if (C931790aM5.LIZIZ()) {
            List<SpotInfo> list = permitApplyMessage.spotList;
            Integer numValueOf = null;
            if (list != null) {
                Iterator<SpotInfo> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        PosIdentity posIdentity = next.posIdentity;
                        if (posIdentity != null) {
                            str4 = posIdentity.value;
                        } else {
                            str4 = null;
                        }
                        if (Intrinsics.LJFF(str4, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SpotInfo spotInfo = next;
                if (spotInfo != null && (multiGuestSpotExtra = spotInfo.multiGuestSpotExtra) != null) {
                    numValueOf = Integer.valueOf(multiGuestSpotExtra.spotRank);
                }
            }
            LIZIZ = numValueOf;
        }
        BizContentWrapper bizContentWrapper = permitApplyMessage.customMessage.bizContentWrapper;
        if (bizContentWrapper != null && (businessContent2 = bizContentWrapper.bizContent) != null && (multiLiveContent2 = businessContent2.multiLiveContent) != null && (permitBizContent2 = multiLiveContent2.permitIMContent) != null && permitBizContent2.linkUserType == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bizContentWrapper != null && (businessContent = bizContentWrapper.bizContent) != null && (multiLiveContent = businessContent.multiLiveContent) != null && (permitBizContent = multiLiveContent.permitIMContent) != null && permitBizContent.isFullPositionPreApproved) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZJ(this, z, "guest_apply_anchor", str, str2, str3, i, dataChannel, enumC918990a1R, z2, false, "receiveIM", "permit", null, z3, 9344);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, X.EnumC918970a1P r21, com.bytedance.ies.sdk.datachannel.DataChannel r22, long r23, java.util.Map r25) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924640aAY.LJFF(boolean, java.lang.String, java.lang.String, java.lang.String, int, X.0a1P, com.bytedance.ies.sdk.datachannel.DataChannel, long, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0513  */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C924640aAY r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, com.bytedance.ies.sdk.datachannel.DataChannel r20, X.EnumC918990a1R r21, boolean r22, boolean r23, java.lang.String r24, java.lang.String r25, X.C924760aAk r26, boolean r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924640aAY.LIZJ(X.0aAY, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.bytedance.ies.sdk.datachannel.DataChannel, X.0a1R, boolean, boolean, java.lang.String, java.lang.String, X.0aAk, boolean, int):void");
    }
}
