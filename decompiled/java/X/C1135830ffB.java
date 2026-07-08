package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ffB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135830ffB {
    public static final C1135830ffB LIZ = new C1135830ffB();

    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(boolean r16, X.InterfaceC1136020ffU r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135830ffB.LIZ(boolean, X.0ffU, boolean):void");
    }

    public static void LIZIZ(GiftMessage giftMessage, long j, long j2) {
        Long lValueOf;
        String str;
        String str2;
        long j3;
        boolean zLJJII = C1135800ff8.LJJII();
        boolean zLJJIII = C1135800ff8.LJJIII();
        boolean zLJJIIZ = C1135800ff8.LJJIIZ(giftMessage);
        if (zLJJII) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LIZLLL) {
                C1138230fj3.LIZ("LiveGiftReceiveQueueMonitor", "onReceivedGiftMessage, return by shouldDowngradeTrackingExcludeRendering");
                return;
            }
        } else if (!zLJJIII && !zLJJIIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceivedGiftMessage id(");
        sbLIZ.append(giftMessage.giftId);
        sbLIZ.append(") isLocal(");
        sbLIZ.append(giftMessage.LLILLL);
        sbLIZ.append(") from(");
        sbLIZ.append(giftMessage.fromUser.getId());
        sbLIZ.append(") to(");
        User user = giftMessage.toUser;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(')');
        C1138230fj3.LIZJ("LiveGiftReceiveQueueMonitor", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject2, j, j2);
        Gift gift = giftMessage.mGift;
        if (gift == null) {
            return;
        }
        C1135800ff8.LJ(gift, giftMessage.colorId, jSONObject, jSONObject2);
        C1135800ff8.LIZJ(giftMessage, jSONObject, jSONObject2);
        C1136080ffa.LIZJ(jSONObject2);
        MatchInfo matchInfo = giftMessage.matchInfo;
        if (matchInfo != null && matchInfo.critical > 1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("has_critical", str);
        jSONObject2.put("send_receive_dur", C1135800ff8.LJIILLIIL(giftMessage, j2, j));
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData != null) {
            long j4 = commonMessageData.createTime;
            if (giftMessage.LLILLL) {
                j3 = j2 - j4;
            } else {
                j3 = j - j4;
            }
            jSONObject2.put("msg_create_receive_dur", j3);
        }
        if (zLJJIIZ) {
            if (giftMessage.LLILLL) {
                str2 = "gift_msg_receive_self_fake";
            } else {
                str2 = "gift_msg_receive_self_real";
            }
        } else if (zLJJII) {
            str2 = "gift_msg_receive_anchor";
        } else {
            str2 = "gift_msg_receive_guest";
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
        C20441214yg.LIZIZ("LiveGiftReceiveQueueMonitor", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
