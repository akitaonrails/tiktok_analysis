package X;

import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0iMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239520iMQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, DMGroupChatStickerModel dMGroupChatStickerModel) {
        C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sticker_type", String.valueOf(dMGroupChatStickerModel.getStickerType().getType()));
        linkedHashMap.put("ui_style", String.valueOf(dMGroupChatStickerModel.getUiStyle()));
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    public static void LIZ(String str, DMGroupChatStickerModel dMGroupChatStickerModel, C705930RmZ c705930RmZ) {
        String string;
        String string2;
        String etGroupType;
        String str2;
        Integer groupStatus;
        Long conversationShortId;
        C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DMGroupChatStickerGroupInfo groupInfo = dMGroupChatStickerModel.getGroupInfo();
        String str3 = "";
        if (groupInfo == null || (conversationShortId = groupInfo.getConversationShortId()) == null || (string = conversationShortId.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("conversation_id", string);
        DMGroupChatStickerGroupInfo groupInfo2 = dMGroupChatStickerModel.getGroupInfo();
        if (groupInfo2 == null || (groupStatus = groupInfo2.getGroupStatus()) == null || (string2 = groupStatus.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("group_status", string2);
        linkedHashMap.put("ui_style", String.valueOf(dMGroupChatStickerModel.getUiStyle()));
        DMGroupChatStickerGroupInfo groupInfo3 = dMGroupChatStickerModel.getGroupInfo();
        if (groupInfo3 == null || (etGroupType = groupInfo3.getEtGroupType()) == null) {
            etGroupType = "";
        }
        linkedHashMap.put("group_type", etGroupType);
        String str4 = dMGroupChatStickerModel.getEventTracking().get("source_enter_method");
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("source_enter_method", str4);
        if (c705930RmZ != null) {
            C0R60 c0r60 = c705930RmZ.LJIIZILJ;
            if (c0r60 == null || (str2 = c0r60.LIZ) == null) {
                str2 = "";
            }
            linkedHashMap.put("enter_from", str2);
            String str5 = c705930RmZ.LIZLLL;
            if (str5 != null) {
                str3 = str5;
            }
            linkedHashMap.put("aid", str3);
        }
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }
}
