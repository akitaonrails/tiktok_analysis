package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895830ZCj {
    public static final C895830ZCj LIZ = new C895830ZCj();

    public static Map LIZJ(EnterChatParams enterChatParams) {
        String strLIZLLL;
        String uid;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int chatType = enterChatParams.getChatType();
        String str = "";
        if (chatType != 0) {
            if (chatType != 3) {
                strLIZLLL = "";
            } else {
                linkedHashMap.put("is_master", C1529305yl.LIZ(Boolean.valueOf(C0ZFW.LJIJ(enterChatParams.getSessionId()))));
                strLIZLLL = C1229100i5c.LIZLLL(enterChatParams.getSessionId());
            }
        } else if (enterChatParams.isTCM()) {
            strLIZLLL = "business";
        } else {
            strLIZLLL = "private";
        }
        Pair[] pairArr = new Pair[12];
        String enterFromForMob = enterChatParams.getEnterFromForMob();
        if (enterFromForMob == null) {
            enterFromForMob = "";
        }
        pairArr[0] = new Pair("enter_from", enterFromForMob);
        String enterMethodForMob = enterChatParams.getEnterMethodForMob();
        if (enterMethodForMob == null) {
            enterMethodForMob = "";
        }
        pairArr[1] = new Pair("enter_method", enterMethodForMob);
        String sessionId = enterChatParams.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        pairArr[2] = new Pair("conversation_id", sessionId);
        pairArr[3] = new Pair("author_id", enterChatParams.getAuthorId());
        String groupId = enterChatParams.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        pairArr[4] = new Pair("group_id", groupId);
        IMUser imUser = enterChatParams.getImUser();
        if (imUser == null || (uid = imUser.getUid()) == null) {
            uid = "";
        }
        pairArr[5] = new Pair("to_user_id", uid);
        pairArr[6] = new Pair("chat_type", strLIZLLL);
        String str2 = enterChatParams.getExtraMobParams().get("panel_source");
        if (str2 == null) {
            str2 = "";
        }
        pairArr[7] = new Pair("panel_source", str2);
        String str3 = "1";
        if (enterChatParams.isRecommendedChat()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("is_recommended_chat", obj);
        int innerPushType = enterChatParams.getInnerPushType();
        if (innerPushType != 27) {
            if (innerPushType != 31) {
                str3 = "";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
        }
        pairArr[9] = new Pair("online_order", str3);
        String outPushLabel = enterChatParams.getOutPushLabel();
        if (outPushLabel == null) {
            outPushLabel = "";
        }
        pairArr[10] = new Pair("push_label", outPushLabel);
        pairArr[11] = new Pair("group_type", C1229100i5c.LJI(enterChatParams.getSessionId()));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (enterChatParams.getExtraMobParams() != null && enterChatParams.getExtraMobParams().containsKey("is_from_push")) {
            String str4 = enterChatParams.getExtraMobParams().get("is_from_push");
            if (str4 == null) {
                str4 = "";
            }
            mapLJIIJ.put("is_from_push", str4);
            String str5 = enterChatParams.getExtraMobParams().get("push_id");
            if (str5 == null) {
                str5 = "";
            }
            mapLJIIJ.put("push_id", str5);
            String str6 = enterChatParams.getExtraMobParams().get("push_type");
            if (str6 != null) {
                str = str6;
            }
            mapLJIIJ.put("push_type", str);
        }
        linkedHashMap.putAll(mapLJIIJ);
        String buttonType = enterChatParams.getButtonType();
        if (buttonType != null) {
            linkedHashMap.put("button_type", buttonType);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams r25, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r26, boolean r27, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r28, X.InterfaceC1493105sv r29, boolean r30, boolean r31, X.InterfaceC1364105Vn<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C895830ZCj.LIZ(com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, boolean, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, X.05sv, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
