package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ff7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135790ff7 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZJ(C1135810ff9 c1135810ff9) {
        String str;
        GiftMonitorInfo giftMonitorInfo;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Integer numValueOf;
        Integer numValueOf2;
        String idStr;
        Long lValueOf5;
        Long lValueOf6;
        Long lValueOf7;
        Long lValueOf8;
        Long lValueOf9;
        User user;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Long lLJIILIIL3;
        Long lValueOf10;
        Long lLJIILIIL4;
        Long lValueOf11;
        Long lLJIILIIL5;
        GiftMessage giftMessage = c1135810ff9.LIZ;
        Long lValueOf12 = null;
        if (giftMessage != null) {
            str = giftMessage.LLIZLLLIL;
        } else {
            str = null;
        }
        if (str != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2203708kF.LIZ(giftMessage.LLIZLLLIL));
            String str2 = (String) linkedHashMap.get("send_gift_profit_core_start_ms");
            if (str2 != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(str2)) != null) {
                long jLongValue = lLJIILIIL4.longValue();
                String str3 = (String) linkedHashMap.get("send_gift_profit_api_end_ms");
                if (str3 != null && (lLJIILIIL5 = C2095008Iq.LJIILIIL(str3)) != null) {
                    lValueOf11 = Long.valueOf(lLJIILIIL5.longValue() - jLongValue);
                } else {
                    lValueOf11 = null;
                }
                linkedHashMap.put("profitapi_dur", String.valueOf(lValueOf11));
            }
            String str4 = (String) linkedHashMap.get("send_gift_profit_api_end_ms");
            if (str4 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str4)) != null) {
                long jLongValue2 = lLJIILIIL3.longValue();
                CommonMessageData commonMessageData = giftMessage.baseMessage;
                if (commonMessageData != null) {
                    lValueOf10 = Long.valueOf(commonMessageData.createTime - jLongValue2);
                } else {
                    lValueOf10 = null;
                }
                linkedHashMap.put("response_receive_dur", String.valueOf(lValueOf10));
            }
            String str5 = (String) linkedHashMap.get("send_gift_profit_api_start_ms");
            if (str5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str5)) != null) {
                long jLongValue3 = lLJIILIIL.longValue();
                String str6 = (String) linkedHashMap.get("send_gift_profit_core_start_ms");
                if (str6 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str6)) != null) {
                    lValueOf12 = Long.valueOf(lLJIILIIL2.longValue() - jLongValue3);
                }
                linkedHashMap.put("profitapi_precheck_dur", String.valueOf(lValueOf12));
            }
            return linkedHashMap;
        }
        if (giftMessage != null) {
            giftMonitorInfo = giftMessage.giftMonitorInfo;
        } else {
            giftMonitorInfo = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (giftMonitorInfo != null) {
            lValueOf = Long.valueOf(giftMonitorInfo.anchor_id);
        } else {
            lValueOf = null;
        }
        linkedHashMap2.put("anchor_id", String.valueOf(lValueOf));
        if (giftMessage != null && (user = giftMessage.fromUser) != null) {
            lValueOf2 = Long.valueOf(user.getId());
        } else {
            lValueOf2 = null;
        }
        linkedHashMap2.put("from_user_id", String.valueOf(lValueOf2));
        if (giftMessage != null) {
            lValueOf3 = Long.valueOf(giftMessage.giftId);
        } else {
            lValueOf3 = null;
        }
        linkedHashMap2.put("gift_id", String.valueOf(lValueOf3));
        if (giftMessage != null) {
            lValueOf4 = Long.valueOf(giftMessage.getMessageId());
        } else {
            lValueOf4 = null;
        }
        linkedHashMap2.put("msg_id", String.valueOf(lValueOf4));
        if (giftMessage != null) {
            numValueOf = Integer.valueOf(giftMessage.repeatCount);
        } else {
            numValueOf = null;
        }
        linkedHashMap2.put("repeat_count", String.valueOf(numValueOf));
        if (giftMessage != null) {
            numValueOf2 = Integer.valueOf(giftMessage.repeatEnd);
        } else {
            numValueOf2 = null;
        }
        linkedHashMap2.put("repeat_end", String.valueOf(numValueOf2));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (Room.isValid(room) && room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap2.put("room_id", idStr);
        if (giftMonitorInfo != null) {
            lValueOf5 = Long.valueOf(giftMonitorInfo.send_gift_profit_api_start_ms);
        } else {
            lValueOf5 = null;
        }
        linkedHashMap2.put("send_gift_profit_api_start_ms", String.valueOf(lValueOf5));
        if (giftMonitorInfo != null) {
            long j = giftMonitorInfo.send_gift_profit_core_start_ms;
            linkedHashMap2.put("send_gift_profit_core_start_ms", String.valueOf(j));
            CommonMessageData commonMessageData2 = giftMessage.baseMessage;
            if (commonMessageData2 != null) {
                lValueOf9 = Long.valueOf(commonMessageData2.createTime - j);
            } else {
                lValueOf9 = null;
            }
            linkedHashMap2.put("profitapi_message_dur", String.valueOf(lValueOf9));
            lValueOf6 = Long.valueOf(giftMonitorInfo.send_gift_req_start_ms);
        } else {
            lValueOf6 = null;
        }
        linkedHashMap2.put("send_gift_req_start_ms", String.valueOf(lValueOf6));
        if (giftMonitorInfo != null) {
            lValueOf7 = Long.valueOf(giftMonitorInfo.send_gift_send_message_success_ms);
        } else {
            lValueOf7 = null;
        }
        linkedHashMap2.put("send_gift_send_message_success_ms", String.valueOf(lValueOf7));
        if (giftMonitorInfo != null) {
            lValueOf8 = Long.valueOf(giftMonitorInfo.send_profit_api_dur);
        } else {
            lValueOf8 = null;
        }
        linkedHashMap2.put("send_profitapi_dur", String.valueOf(lValueOf8));
        if (giftMonitorInfo != null) {
            linkedHashMap2.put("profitapi_precheck_dur", String.valueOf(giftMonitorInfo.send_gift_profit_core_start_ms - giftMonitorInfo.send_gift_profit_api_start_ms));
            lValueOf12 = Long.valueOf(giftMonitorInfo.to_user_id);
        }
        linkedHashMap2.put("to_user_id", String.valueOf(lValueOf12));
        linkedHashMap2.put("is_history_msg", String.valueOf(C500260Jjc.LJIIJ(giftMessage)));
        return linkedHashMap2;
    }

    public static void LIZ(C474500IjA c474500IjA, GiftMessage giftMessage) {
        for (Map.Entry entry : ((LinkedHashMap) C1135800ff8.LJII(giftMessage)).entrySet()) {
            c474500IjA.LJJII(entry.getValue(), (String) entry.getKey());
        }
    }

    public static void LIZIZ(JSONObject jSONObject, C1135810ff9 c1135810ff9) throws JSONException {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        c1135810ff9.LJJJJIZL.LIZ(jSONObject);
        Long lLIZJ = c1135810ff9.LJJJJIZL.LIZJ("trayShow");
        if (lLIZJ != null && lLIZJ.longValue() > 0) {
            C1136330ffz c1136330ffzLIZIZ = c1135810ff9.LJJJJIZL.LIZIZ();
            long jLongValue4 = -1;
            int i = 0;
            if (c1136330ffzLIZIZ.LIZ > 0) {
                long[] jArr = {lLIZJ.longValue(), c1136330ffzLIZIZ.LIZ};
                int i2 = 0;
                while (true) {
                    if (jArr[i2] <= 0) {
                        jLongValue3 = -1;
                        break;
                    }
                    i2++;
                    if (i2 >= 2) {
                        jLongValue3 = lLIZJ.longValue() - c1136330ffzLIZIZ.LIZ;
                        break;
                    }
                }
                jSONObject.put("send_show_total_dur", jLongValue3);
            }
            if (c1136330ffzLIZIZ.LIZIZ > 0) {
                long[] jArr2 = {lLIZJ.longValue(), c1136330ffzLIZIZ.LIZIZ};
                int i3 = 0;
                while (true) {
                    if (jArr2[i3] <= 0) {
                        jLongValue2 = -1;
                        break;
                    }
                    i3++;
                    if (i3 >= 2) {
                        jLongValue2 = lLIZJ.longValue() - c1136330ffzLIZIZ.LIZIZ;
                        break;
                    }
                }
                jSONObject.put("receive_show_dur", jLongValue2);
            }
            if (c1136330ffzLIZIZ.LIZIZ > 0) {
                long[] jArr3 = {lLIZJ.longValue(), c1136330ffzLIZIZ.LIZIZ};
                int i4 = 0;
                while (true) {
                    if (jArr3[i4] <= 0) {
                        jLongValue = -1;
                        break;
                    }
                    i4++;
                    if (i4 >= 2) {
                        jLongValue = (lLIZJ.longValue() - c1136330ffzLIZIZ.LIZIZ) - c1136330ffzLIZIZ.LJII;
                        break;
                    }
                }
                jSONObject.put("receive_show_without_queue_dur", jLongValue);
            }
            if (c1136330ffzLIZIZ.LIZJ > 0) {
                long[] jArr4 = {lLIZJ.longValue(), c1136330ffzLIZIZ.LIZJ};
                while (true) {
                    if (jArr4[i] <= 0) {
                        break;
                    }
                    i++;
                    if (i >= 2) {
                        jLongValue4 = lLIZJ.longValue() - c1136330ffzLIZIZ.LIZJ;
                        break;
                    }
                }
                jSONObject.put("dequeue_show_dur", jLongValue4);
            }
        }
    }

    public static void LIZLLL(DataChannel dataChannel, String str) {
        Boolean bool;
        String str2;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("gift_tray_gift_click", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJII(str, "click_type");
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIFFI(bool)) {
            if (InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()) {
                str2 = "close";
            } else {
                str2 = "right_panel";
            }
            c474500IjALIZIZ.LJJII(str2, "public_area_status");
        }
        c474500IjALIZIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C1135810ff9 r25, long r26, long r28) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135790ff7.LJFF(X.0ff9, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5 A[PHI: r2
      0x00d5: PHI (r2v6 long) = (r2v5 long), (r2v20 long) binds: [B:64:0x00d1, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df A[PHI: r2
      0x00df: PHI (r2v2 long) = (r2v1 long), (r2v22 long) binds: [B:68:0x00db, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.InterfaceC1136020ffU r10, X.EnumC1133520fbS r11, X.EnumC1136250ffr r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135790ff7.LJI(X.0ffU, X.0fbS, X.0ffr):void");
    }

    public static void LJIIIIZZ(C1135810ff9 c1135810ff9, EnumC1133520fbS enumC1133520fbS, EnumC1136250ffr enumC1136250ffr) {
        Long lValueOf;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        ConcurrentHashSet concurrentHashSet;
        long jLIZ = C158B.LIZ() + AbstractC19994813Le.Default.nextLong(1L, 5L);
        JSONObject jSONObject = new JSONObject();
        GiftMessage giftMessage = null;
        if (c1135810ff9 != null) {
            lValueOf = Long.valueOf(c1135810ff9.LJJIII);
        } else {
            lValueOf = null;
        }
        jSONObject.put("send_gift_receive_message_ms", lValueOf);
        long j8 = 0;
        if (c1135810ff9 != null) {
            j = c1135810ff9.LJJIIJZLJL;
            j2 = c1135810ff9.LJJIII;
        } else {
            j = 0;
            j2 = 0;
        }
        jSONObject.put("before_queue_dur", j - j2);
        if (c1135810ff9 != null) {
            j3 = c1135810ff9.LJJIIZ;
            j4 = c1135810ff9.LJJIIJZLJL;
        } else {
            j3 = 0;
            j4 = 0;
        }
        jSONObject.put("in_queue_dur", j3 - j4);
        if (c1135810ff9 != null) {
            j5 = c1135810ff9.LJJIIZ;
        } else {
            j5 = 0;
        }
        jSONObject.put("out_queue_dur", jLIZ - j5);
        if (c1135810ff9 != null) {
            j6 = c1135810ff9.LJJIII;
        } else {
            j6 = 0;
        }
        long j9 = jLIZ - j6;
        if (c1135810ff9 != null) {
            j7 = c1135810ff9.LJJIIZ;
            j8 = c1135810ff9.LJJIIJZLJL;
        } else {
            j7 = 0;
        }
        jSONObject.put("receive_show_without_queue_dur", j9 - (j7 - j8));
        int i = 1;
        if (c1135810ff9 != null && (concurrentHashSet = c1135810ff9.LJJJJ) != null) {
            i = 0;
            if (!concurrentHashSet.isEmpty()) {
                Iterator it2 = concurrentHashSet.iterator();
                while (it2.hasNext()) {
                    if ((!((C1136650fgV) it2.next()).LIZJ) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        jSONObject.put("msg_total", i);
        jSONObject.put("phase", "enqueue");
        if (c1135810ff9 != null) {
            giftMessage = c1135810ff9.LIZ;
        }
        LJIIIZ(giftMessage, enumC1133520fbS, enumC1136250ffr, jSONObject);
    }

    public static void LJII(InterfaceC1136020ffU interfaceC1136020ffU, EnumC1133520fbS enumC1133520fbS, EnumC1136250ffr enumC1136250ffr, JSONObject jSONObject) throws JSONException {
        Integer numValueOf;
        String strName;
        Integer numValueOf2;
        Object obj;
        Long lValueOf;
        Integer numValueOf3;
        String strName2;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        String logId;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        Object objValueOf4;
        String str;
        Long lValueOf6;
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ;
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL;
        Object objValueOf5;
        Object objValueOf6;
        int code;
        String desc;
        long jLJIIZILJ;
        Long lValueOf7;
        String str2;
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ2;
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL2;
        C1136240ffq c1136240ffqLJJIFFI;
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL3;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled() && C1135800ff8.LJJII()) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LJ) {
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject3.put(next, jSONObject.opt(next));
            }
        }
        if (enumC1133520fbS != null) {
            numValueOf = Integer.valueOf(enumC1133520fbS.getCode());
        } else {
            numValueOf = null;
        }
        jSONObject3.put("error_code", numValueOf);
        if (enumC1133520fbS != null) {
            strName = enumC1133520fbS.name();
        } else {
            strName = null;
        }
        jSONObject3.put("error_msg", strName);
        if (enumC1133520fbS != null) {
            numValueOf2 = Integer.valueOf(enumC1133520fbS.getCode());
        } else {
            numValueOf2 = null;
        }
        jSONObject2.put("error_code", numValueOf2);
        jSONObject3.put("is_anchor", C1135800ff8.LJJII() ? 1 : 0);
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject3.put("anchor_id", obj);
        if (interfaceC1136020ffU != null && (interfaceC1136800fgkLJIILL3 = interfaceC1136020ffU.LJIILL()) != null && interfaceC1136800fgkLJIILL3.getId() == UserService.getInstance().user().getCurrentUserId()) {
            str3 = "1";
        }
        jSONObject3.put("is_own_send", str3);
        if (interfaceC1136020ffU != null && (c1136240ffqLJJIFFI = interfaceC1136020ffU.LJJIFFI()) != null) {
            lValueOf = Long.valueOf(c1136240ffqLJJIFFI.LIZIZ);
        } else {
            lValueOf = null;
        }
        jSONObject3.put("create_ms", lValueOf);
        if (enumC1133520fbS != null) {
            numValueOf3 = Integer.valueOf(enumC1133520fbS.getCode());
        } else {
            numValueOf3 = null;
        }
        jSONObject3.put("error_code", numValueOf3);
        if (enumC1133520fbS != null) {
            strName2 = enumC1133520fbS.name();
        } else {
            strName2 = null;
        }
        jSONObject3.put("error_msg", strName2);
        jSONObject3.put("gift_type", C1135870ffF.LJII(interfaceC1136020ffU));
        if (interfaceC1136020ffU != null) {
            lValueOf2 = Long.valueOf(interfaceC1136020ffU.getGiftId());
        } else {
            lValueOf2 = null;
        }
        jSONObject3.put("gift_id", lValueOf2);
        if (interfaceC1136020ffU != null && (interfaceC1136800fgkLJIILL2 = interfaceC1136020ffU.LJIILL()) != null) {
            lValueOf3 = Long.valueOf(interfaceC1136800fgkLJIILL2.getId());
        } else {
            lValueOf3 = null;
        }
        jSONObject3.put("from_user_id", lValueOf3);
        if (interfaceC1136020ffU != null && (interfaceC1136800fgkLIZJ2 = interfaceC1136020ffU.LIZJ()) != null) {
            lValueOf4 = Long.valueOf(interfaceC1136800fgkLIZJ2.getId());
        } else {
            lValueOf4 = null;
        }
        jSONObject3.put("to_user_id", lValueOf4);
        if (interfaceC1136020ffU != null) {
            lValueOf5 = Long.valueOf(interfaceC1136020ffU.getMessageId());
        } else {
            lValueOf5 = null;
        }
        jSONObject3.put("msg_id", lValueOf5);
        if (interfaceC1136020ffU != null) {
            logId = interfaceC1136020ffU.getLogId();
        } else {
            logId = null;
        }
        jSONObject3.put("log_id", logId);
        jSONObject3.put("phase", "enqueue");
        jSONObject3.put("is_history_msg", C1135870ffF.LJIIIIZZ(interfaceC1136020ffU));
        if (interfaceC1136020ffU != null) {
            boolean zLJJII = C1135800ff8.LJJII();
            boolean zLJJIII = C1135800ff8.LJJIII();
            boolean zLJJIIJZLJL = C1135800ff8.LJJIIJZLJL(interfaceC1136020ffU);
            if (zLJJII || zLJJIII || zLJJIIJZLJL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onTrayShowFail id(");
                sbLIZ.append(interfaceC1136020ffU.getGiftId());
                sbLIZ.append(") isLocal(");
                sbLIZ.append(interfaceC1136020ffU.LJ());
                sbLIZ.append(") from(");
                InterfaceC1136800fgk interfaceC1136800fgkLJIILL4 = interfaceC1136020ffU.LJIILL();
                if (interfaceC1136800fgkLJIILL4 != null) {
                    objValueOf5 = Long.valueOf(interfaceC1136800fgkLJIILL4.getId());
                } else {
                    objValueOf5 = null;
                }
                sbLIZ.append(objValueOf5);
                sbLIZ.append(") to(");
                InterfaceC1136800fgk interfaceC1136800fgkLIZJ3 = interfaceC1136020ffU.LIZJ();
                if (interfaceC1136800fgkLIZJ3 != null) {
                    objValueOf6 = Long.valueOf(interfaceC1136800fgkLIZJ3.getId());
                } else {
                    objValueOf6 = null;
                }
                sbLIZ.append(objValueOf6);
                sbLIZ.append(')');
                C20441214yg.LIZIZ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ));
                JSONObject jSONObject4 = new JSONObject();
                int code2 = 0;
                jSONObject4.put("tray_position", 0);
                jSONObject4.put("is_combo", 0);
                if (enumC1133520fbS != null) {
                    code2 = enumC1133520fbS.getCode();
                }
                jSONObject4.put("error_code", code2);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("tray_position", 0);
                if (enumC1133520fbS != null) {
                    code = enumC1133520fbS.getCode();
                } else {
                    code = 0;
                }
                jSONObject5.put("error_code", code);
                if (enumC1133520fbS == null || (desc = enumC1133520fbS.getDesc()) == null) {
                    desc = "";
                }
                jSONObject5.put("error_message", desc);
                jSONObject5.put("is_combo", 0);
                jSONObject5.put("is_fallback_tray", 0);
                jSONObject5.put("phase", "enqueue");
                jSONObject5.put("msg_total", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLIZ = C158B.LIZ();
                InterfaceC1136800fgk interfaceC1136800fgkLJIILL5 = interfaceC1136020ffU.LJIILL();
                if (interfaceC1136800fgkLJIILL5 != null && interfaceC1136800fgkLJIILL5.getId() == UserService.getInstance().user().getCurrentUserId()) {
                    jLJIIZILJ = jCurrentTimeMillis - C1135800ff8.LJIJI(interfaceC1136020ffU);
                } else {
                    jLJIIZILJ = jLIZ - C1135800ff8.LJIIZILJ(interfaceC1136020ffU);
                }
                jSONObject5.put("send_receive_dur", jLJIIZILJ);
                C1135800ff8.LJIILJJIL(jSONObject4, jSONObject5, C158B.LIZ(), System.currentTimeMillis());
                if (interfaceC1136020ffU.LJIIIIZZ() != null) {
                    InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
                    if (interfaceC1136230ffpLJJII != null) {
                        lValueOf7 = Long.valueOf(interfaceC1136230ffpLJJII.LJIIL());
                    } else {
                        lValueOf7 = null;
                    }
                    C1135800ff8.LIZLLL(interfaceC1136020ffU, lValueOf7, jSONObject4, jSONObject5);
                    C1135800ff8.LIZIZ(interfaceC1136020ffU, jSONObject4, jSONObject5);
                    C1136080ffa.LIZJ(jSONObject5);
                    if (zLJJIIJZLJL) {
                        str2 = "gift_msg_show_fail_self";
                    } else if (zLJJII) {
                        str2 = "gift_msg_show_fail_anchor";
                    } else {
                        str2 = "gift_msg_show_fail_guest";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
                    c474500IjALIZ.LJJIIJZLJL(jSONObject4);
                    c474500IjALIZ.LJJIIJZLJL(jSONObject5);
                    c474500IjALIZ.LIZ();
                    C1CC2.LJ(str2, jSONObject4, new JSONObject(), jSONObject5);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reported(");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(')');
                    C20441214yg.LIZIZ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        String phase = enumC1136250ffr.getPhase();
        if (!GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
            boolean zLJJII2 = C1135800ff8.LJJII();
            boolean zLJJIII2 = C1135800ff8.LJJIII();
            boolean zLJJIIJZLJL2 = C1135800ff8.LJJIIJZLJL(interfaceC1136020ffU);
            if (zLJJII2) {
                C1140740fn6.LIZ().getClass();
                if (C781880Ulm.LJ) {
                    return;
                }
            } else if (!zLJJIII2 && !zLJJIIJZLJL2) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onTrayShowStatus id(");
            if (interfaceC1136020ffU != null) {
                objValueOf = Long.valueOf(interfaceC1136020ffU.getGiftId());
            } else {
                objValueOf = null;
            }
            sbLIZ3.append(objValueOf);
            sbLIZ3.append(") isLocal(");
            if (interfaceC1136020ffU != null) {
                objValueOf2 = Boolean.valueOf(interfaceC1136020ffU.LJ());
            } else {
                objValueOf2 = null;
            }
            sbLIZ3.append(objValueOf2);
            sbLIZ3.append(") from(");
            if (interfaceC1136020ffU != null && (interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL()) != null) {
                objValueOf3 = Long.valueOf(interfaceC1136800fgkLJIILL.getId());
            } else {
                objValueOf3 = null;
            }
            sbLIZ3.append(objValueOf3);
            sbLIZ3.append(") to(");
            if (interfaceC1136020ffU != null && (interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ()) != null) {
                objValueOf4 = Long.valueOf(interfaceC1136800fgkLIZJ.getId());
            } else {
                objValueOf4 = null;
            }
            sbLIZ3.append(objValueOf4);
            sbLIZ3.append(')');
            C1138230fj3.LIZJ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ3));
            jSONObject3.put("phase", phase);
            C1135800ff8.LJIILJJIL(jSONObject2, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
            if (interfaceC1136020ffU != null) {
                InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
                if (interfaceC1136230ffpLJJII2 != null) {
                    lValueOf6 = Long.valueOf(interfaceC1136230ffpLJJII2.LJIIL());
                } else {
                    lValueOf6 = null;
                }
                C1135800ff8.LIZLLL(interfaceC1136020ffU, lValueOf6, jSONObject2, jSONObject3);
                C1135800ff8.LIZIZ(interfaceC1136020ffU, jSONObject2, jSONObject3);
            }
            C1136080ffa.LIZJ(jSONObject3);
            if (zLJJIIJZLJL2) {
                str = "gift_msg_show_status_self";
            } else if (zLJJII2) {
                str = "gift_msg_show_status_anchor";
            } else {
                str = "gift_msg_show_status_guest";
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ(str);
            c474500IjALIZ2.LJJIIJZLJL(jSONObject2);
            c474500IjALIZ2.LJJIIJZLJL(jSONObject3);
            c474500IjALIZ2.LIZ();
            C1CC2.LJ(str, jSONObject2, new JSONObject(), jSONObject3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("reported(");
            sbLIZ4.append(str);
            sbLIZ4.append(')');
            C20441214yg.LIZIZ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public static void LJIIIZ(GiftMessage giftMessage, EnumC1133520fbS enumC1133520fbS, EnumC1136250ffr enumC1136250ffr, JSONObject jSONObject) throws JSONException {
        Integer numValueOf;
        String strName;
        Integer numValueOf2;
        Object obj;
        Long lValueOf;
        Integer numValueOf3;
        String strName2;
        Integer numValueOf4;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        Long lValueOf7;
        int code;
        int code2;
        String desc;
        String str;
        CommonMessageData commonMessageData;
        User user;
        User user2;
        Gift gift;
        CommonMessageData commonMessageData2;
        User user3;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled() && C1135800ff8.LJJII()) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LJ) {
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject3.put(next, jSONObject.opt(next));
            }
        }
        Long lValueOf8 = null;
        if (enumC1133520fbS != null) {
            numValueOf = Integer.valueOf(enumC1133520fbS.getCode());
        } else {
            numValueOf = null;
        }
        jSONObject3.put("error_code", numValueOf);
        if (enumC1133520fbS != null) {
            strName = enumC1133520fbS.name();
        } else {
            strName = null;
        }
        jSONObject3.put("error_msg", strName);
        if (enumC1133520fbS != null) {
            numValueOf2 = Integer.valueOf(enumC1133520fbS.getCode());
        } else {
            numValueOf2 = null;
        }
        jSONObject2.put("error_code", numValueOf2);
        jSONObject3.put("is_anchor", C1135800ff8.LJJII() ? 1 : 0);
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject3.put("anchor_id", obj);
        if (giftMessage != null && (user3 = giftMessage.fromUser) != null && user3.getId() == UserService.getInstance().user().getCurrentUserId()) {
            str2 = "1";
        }
        jSONObject3.put("is_own_send", str2);
        if (giftMessage != null && (commonMessageData2 = giftMessage.baseMessage) != null) {
            lValueOf = Long.valueOf(commonMessageData2.createTime);
        } else {
            lValueOf = null;
        }
        jSONObject3.put("create_ms", lValueOf);
        if (enumC1133520fbS != null) {
            numValueOf3 = Integer.valueOf(enumC1133520fbS.getCode());
        } else {
            numValueOf3 = null;
        }
        jSONObject3.put("error_code", numValueOf3);
        if (enumC1133520fbS != null) {
            strName2 = enumC1133520fbS.name();
        } else {
            strName2 = null;
        }
        jSONObject3.put("error_msg", strName2);
        if (giftMessage != null && (gift = giftMessage.mGift) != null) {
            numValueOf4 = Integer.valueOf(gift.type);
        } else {
            numValueOf4 = null;
        }
        jSONObject3.put("gift_type", numValueOf4);
        if (giftMessage != null) {
            lValueOf2 = Long.valueOf(giftMessage.giftId);
        } else {
            lValueOf2 = null;
        }
        jSONObject3.put("gift_id", lValueOf2);
        if (giftMessage != null && (user2 = giftMessage.fromUser) != null) {
            lValueOf3 = Long.valueOf(user2.getId());
        } else {
            lValueOf3 = null;
        }
        jSONObject3.put("from_user_id", lValueOf3);
        if (giftMessage != null && (user = giftMessage.toUser) != null) {
            lValueOf4 = Long.valueOf(user.getId());
        } else {
            lValueOf4 = null;
        }
        jSONObject3.put("to_user_id", lValueOf4);
        if (giftMessage != null && (commonMessageData = giftMessage.baseMessage) != null) {
            lValueOf5 = Long.valueOf(commonMessageData.messageId);
        } else {
            lValueOf5 = null;
        }
        jSONObject3.put("msg_id", lValueOf5);
        if (giftMessage != null) {
            lValueOf6 = Long.valueOf(giftMessage.getMessageId());
        } else {
            lValueOf6 = null;
        }
        jSONObject3.put("log_id", lValueOf6);
        jSONObject3.put("phase", "enqueue");
        jSONObject3.put("is_history_msg", C500260Jjc.LJIIJ(giftMessage));
        if (giftMessage != null) {
            boolean zLJJII = C1135800ff8.LJJII();
            boolean zLJJIII = C1135800ff8.LJJIII();
            boolean zLJJIIZ = C1135800ff8.LJJIIZ(giftMessage);
            if (zLJJII || zLJJIII || zLJJIIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onTrayShowFail id(");
                sbLIZ.append(giftMessage.giftId);
                sbLIZ.append(") isLocal(");
                sbLIZ.append(giftMessage.LLILLL);
                sbLIZ.append(") from(");
                User user4 = giftMessage.fromUser;
                if (user4 != null) {
                    lValueOf7 = Long.valueOf(user4.getId());
                } else {
                    lValueOf7 = null;
                }
                sbLIZ.append(lValueOf7);
                sbLIZ.append(") to(");
                User user5 = giftMessage.toUser;
                if (user5 != null) {
                    lValueOf8 = Long.valueOf(user5.getId());
                }
                sbLIZ.append(lValueOf8);
                sbLIZ.append(')');
                C20441214yg.LIZIZ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ));
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("tray_position", 0);
                jSONObject4.put("is_combo", 0);
                if (enumC1133520fbS != null) {
                    code = enumC1133520fbS.getCode();
                } else {
                    code = 0;
                }
                jSONObject4.put("error_code", code);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("tray_position", 0);
                if (enumC1133520fbS != null) {
                    code2 = enumC1133520fbS.getCode();
                } else {
                    code2 = 0;
                }
                jSONObject5.put("error_code", code2);
                if (enumC1133520fbS == null || (desc = enumC1133520fbS.getDesc()) == null) {
                    desc = "";
                }
                jSONObject5.put("error_message", desc);
                jSONObject5.put("is_combo", 0);
                jSONObject5.put("is_fallback_tray", 0);
                jSONObject5.put("phase", "enqueue");
                jSONObject5.put("msg_total", 0);
                jSONObject5.put("send_receive_dur", C1135800ff8.LJIILLIIL(giftMessage, System.currentTimeMillis(), C158B.LIZ()));
                C1135800ff8.LJIILJJIL(jSONObject4, jSONObject5, C158B.LIZ(), System.currentTimeMillis());
                Gift gift2 = giftMessage.mGift;
                if (gift2 != null) {
                    C1135800ff8.LJ(gift2, giftMessage.colorId, jSONObject4, jSONObject5);
                    C1135800ff8.LIZJ(giftMessage, jSONObject4, jSONObject5);
                    C1136080ffa.LIZJ(jSONObject5);
                    if (zLJJIIZ) {
                        str = "gift_msg_show_fail_self";
                    } else if (zLJJII) {
                        str = "gift_msg_show_fail_anchor";
                    } else {
                        str = "gift_msg_show_fail_guest";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                    c474500IjALIZ.LJJIIJZLJL(jSONObject4);
                    c474500IjALIZ.LJJIIJZLJL(jSONObject5);
                    c474500IjALIZ.LIZ();
                    C1CC2.LJ(str, jSONObject4, new JSONObject(), jSONObject5);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reported(");
                    sbLIZ2.append(str);
                    sbLIZ2.append(')');
                    C20441214yg.LIZIZ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        LJIIJ(giftMessage, jSONObject2, jSONObject3, enumC1136250ffr.getPhase());
    }

    public static void LJIIJ(GiftMessage giftMessage, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        Long lValueOf;
        Boolean boolValueOf;
        Long lValueOf2;
        String str2;
        User user;
        User user2;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
            return;
        }
        boolean zLJJII = C1135800ff8.LJJII();
        boolean zLJJIII = C1135800ff8.LJJIII();
        boolean zLJJIIZ = C1135800ff8.LJJIIZ(giftMessage);
        if (zLJJII) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LJ) {
                return;
            }
        } else if (!zLJJIII && !zLJJIIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTrayShowStatus id(");
        Long lValueOf3 = null;
        if (giftMessage != null) {
            lValueOf = Long.valueOf(giftMessage.giftId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(") isLocal(");
        if (giftMessage != null) {
            boolValueOf = Boolean.valueOf(giftMessage.LLILLL);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(") from(");
        if (giftMessage != null && (user2 = giftMessage.fromUser) != null) {
            lValueOf2 = Long.valueOf(user2.getId());
        } else {
            lValueOf2 = null;
        }
        sbLIZ.append(lValueOf2);
        sbLIZ.append(") to(");
        if (giftMessage != null && (user = giftMessage.toUser) != null) {
            lValueOf3 = Long.valueOf(user.getId());
        }
        sbLIZ.append(lValueOf3);
        sbLIZ.append(')');
        C1138230fj3.LIZJ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ));
        jSONObject2.put("phase", str);
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject2, C158B.LIZ(), System.currentTimeMillis());
        if (giftMessage != null) {
            C1135800ff8.LJ(giftMessage.mGift, giftMessage.colorId, jSONObject, jSONObject2);
            C1135800ff8.LIZJ(giftMessage, jSONObject, jSONObject2);
        }
        C1136080ffa.LIZJ(jSONObject2);
        if (zLJJIIZ) {
            str2 = "gift_msg_show_status_self";
        } else if (zLJJII) {
            str2 = "gift_msg_show_status_anchor";
        } else {
            str2 = "gift_msg_show_status_guest";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
        C1CC2.LJ(str2, jSONObject, new JSONObject(), jSONObject2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("reported(");
        sbLIZ2.append(str2);
        sbLIZ2.append(')');
        C20441214yg.LIZIZ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LJ(GiftMessage giftMessage, GiftMessage giftMessage2, int i, int i2, boolean z) {
        int i3;
        long id;
        long j;
        long id2;
        long id3;
        Integer numValueOf;
        if (C1135800ff8.LJJII()) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LIZLLL) {
                return;
            }
        }
        int i4 = 0;
        Integer numValueOf2 = null;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled() && !C1135800ff8.LJJII() && !C1135800ff8.LJJIII() && !C1135800ff8.LJJIIZ(giftMessage) && GiftEventTrackSamplingSetting.shouldBlock(giftMessage)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onShowInterruptMessage, interrupted_gift_id:");
            sbLIZ.append(giftMessage.giftId);
            sbLIZ.append(", interrupted_gift_type:");
            Gift gift = giftMessage.mGift;
            if (gift != null) {
                numValueOf = Integer.valueOf(gift.type);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", interrupt_gift_id:");
            sbLIZ.append(giftMessage2.giftId);
            sbLIZ.append(", interrupt_gift_type:");
            Gift gift2 = giftMessage2.mGift;
            if (gift2 != null) {
                numValueOf2 = Integer.valueOf(gift2.type);
            }
            sbLIZ.append(numValueOf2);
            C1138230fj3.LIZJ("LiveGiftTrayMonitor", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("interrupted_gift_id", giftMessage.giftId);
        Gift gift3 = giftMessage.mGift;
        if (gift3 != null) {
            i3 = gift3.type;
        } else {
            i3 = 0;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("interrupted_gift_type", i3).put("interrupt_gift_id", giftMessage2.giftId);
        Gift gift4 = giftMessage2.mGift;
        if (gift4 != null) {
            i4 = gift4.type;
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("interrupt_gift_type", i4).put("is_own_send", z ? 1 : 0).put("is_anchor", C1135800ff8.LJJII() ? 1 : 0);
        GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
        long id4 = 0;
        if (giftMonitorInfo != null) {
            id = giftMonitorInfo.to_user_id;
        } else {
            id = 0;
        }
        GiftMonitorInfo giftMonitorInfo2 = giftMessage2.giftMonitorInfo;
        if (giftMonitorInfo2 != null) {
            j = giftMonitorInfo2.to_user_id;
        } else {
            j = 0;
        }
        JSONObject jSONObject = new JSONObject();
        User user = giftMessage.fromUser;
        if (user != null) {
            id2 = user.getId();
        } else {
            id2 = 0;
        }
        JSONObject jSONObjectPut4 = jSONObject.put("interrupted_gift_from_user_id", id2);
        if (id <= 0) {
            User user2 = giftMessage.toUser;
            if (user2 != null) {
                id = user2.getId();
            } else {
                id = 0;
            }
        }
        JSONObject jSONObjectPut5 = jSONObjectPut4.put("interrupted_gift_to_user_id", id);
        User user3 = giftMessage2.fromUser;
        if (user3 != null) {
            id3 = user3.getId();
        } else {
            id3 = 0;
        }
        JSONObject jSONObjectPut6 = jSONObjectPut5.put("interrupt_gift_from_user_id", id3);
        if (j > 0) {
            id4 = j;
        } else {
            User user4 = giftMessage2.toUser;
            if (user4 != null) {
                id4 = user4.getId();
            }
        }
        JSONObject jSONObjectPut7 = jSONObjectPut6.put("interrupt_gift_to_user_id", id4).put("interrupted_gift_interrupted_combo_count", i).put("interrupted_gift_total_combo_count", i2).put("is_interrupted_history_msg", C500260Jjc.LJIIJ(giftMessage)).put("is_interrupt_history_msg", C500260Jjc.LJIIJ(giftMessage2));
        HashMap map = new HashMap();
        C1135800ff8.LJIJJLI(map);
        for (Map.Entry entry : map.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_msg_show_interrupt");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObjectPut3);
        c474500IjALIZ.LJJIIJZLJL(jSONObjectPut7);
        c474500IjALIZ.LIZ();
        C1CC2.LJ("gift_msg_show_interrupt", jSONObjectPut3, null, jSONObjectPut7);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(X.C1135810ff9 r49, boolean r50, int r51, int r52, com.bytedance.ies.sdk.datachannel.DataChannel r53, boolean r54, long r55, long r57) {
        /*
            Method dump skipped, instruction units count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135790ff7.LJIIJJI(X.0ff9, boolean, int, int, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, long, long):void");
    }
}
