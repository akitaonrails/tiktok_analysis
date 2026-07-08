package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900550ZUn implements InterfaceC900570ZUp {
    public static Map LIZLLL(SessionInfo sessionInfo, GroupInviteCardContent groupInviteCardContent) {
        String strLIZLLL;
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (sessionInfo != null) {
            if (sessionInfo.isGroupChat()) {
                strLIZLLL = C1229100i5c.LIZLLL(sessionInfo.getConversationId());
            } else {
                strLIZLLL = "private";
            }
            linkedHashMap.put("chat_type", strLIZLLL);
            linkedHashMap.put("conversation_id", sessionInfo.getConversationId());
            GroupInfo group = groupInviteCardContent.getGroup();
            if (group == null || (str = group.conversationId) == null) {
                str = "";
            }
            linkedHashMap.put("join_conversation_id", str);
            InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
            GroupInfo group2 = groupInviteCardContent.getGroup();
            if (group2 != null) {
                str2 = group2.conversationId;
            } else {
                str2 = null;
            }
            C0Y8T c0y8tLJIL = interfaceC876950YajLIZIZ.LJIL(str2);
            if (c0y8tLJIL != null && c0y8tLJIL.isMember()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_already_in_group", str3);
            Map<String, String> eventExtra = groupInviteCardContent.getEventExtra();
            if (eventExtra != null) {
                for (Map.Entry<String, String> entry : eventExtra.entrySet()) {
                    String key = entry.getKey();
                    if (Intrinsics.LJFF(key, "a:et_group_type")) {
                        linkedHashMap.put("join_group_type", entry.getValue());
                    } else if (Intrinsics.LJFF(key, "a:et_chat_type")) {
                        linkedHashMap.put("join_chat_type", entry.getValue());
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC900570ZUp
    public final void LIZ(SessionInfo sessionInfo, GroupInviteCardContent groupInviteCardContent, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0Z2T(this, sessionInfo, groupInviteCardContent, interfaceC1493105sv, null), 3);
    }

    @Override // X.InterfaceC900570ZUp
    public final void LIZIZ(SessionInfo sessionInfo, GroupInviteCardContent groupInviteCardContent, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0Z2S(this, sessionInfo, groupInviteCardContent, interfaceC1493105sv, null), 3);
    }

    @Override // X.InterfaceC900570ZUp
    public final Map<String, String> LIZJ(String str, String str2, C900560ZUo c900560ZUo, EnumC1230500i7s enumC1230500i7s) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Pair[] pairArr = new Pair[7];
        String str8 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("join_enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("join_enter_method", str2);
        if (c900560ZUo == null || (str3 = c900560ZUo.LIZIZ) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("invite_enter_from", str3);
        if (c900560ZUo == null || (str4 = c900560ZUo.LIZJ) == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("invite_enter_method", str4);
        if (c900560ZUo == null || (str5 = c900560ZUo.LIZ) == null) {
            str5 = "";
        }
        pairArr[4] = new Pair("invite_event", str5);
        if (c900560ZUo == null || (str6 = c900560ZUo.LIZLLL) == null) {
            str6 = "";
        }
        pairArr[5] = new Pair("join_member_label", str6);
        if (c900560ZUo != null && (str7 = c900560ZUo.LJ) != null) {
            str8 = str7;
        }
        pairArr[6] = new Pair("join_member_type", str8);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (enumC1230500i7s != null) {
            mapLJIIJ.put("a:join_group_source", enumC1230500i7s.getValue());
        }
        return mapLJIIJ;
    }
}
