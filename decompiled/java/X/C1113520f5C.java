package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorClusterSetting;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0f5C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113520f5C {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(AbstractC1110790f0n abstractC1110790f0n) {
        if (abstractC1110790f0n instanceof C239500wD) {
            int i = (int) ((SocialMessage) ((AbstractC1110800f0o) abstractC1110790f0n).LJIL).action;
            if (i == 1) {
                return "follow_message";
            }
            if (i == 3) {
                return "share_message";
            }
        }
        if (abstractC1110790f0n instanceof C1111000f18) {
            return "gift_message";
        }
        if (abstractC1110790f0n instanceof C1110310f01) {
            return "comment_message";
        }
        if (abstractC1110790f0n instanceof C180400mg) {
            return "like_message";
        }
        if ((abstractC1110790f0n instanceof C234500vP) && ((MemberMessage) ((AbstractC1110800f0o) abstractC1110790f0n).LJIL).action == 1) {
            return "enter_message";
        }
        if (abstractC1110790f0n instanceof C226800uA) {
            return "tip_message";
        }
        return "";
    }

    public static String LJI(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() == 5) {
            return "add_a_sticker";
        }
        if (num.intValue() == 1) {
            return "follow";
        }
        return num.toString();
    }

    public static void LIZIZ(long j, DataChannel dataChannel, boolean z) {
        String str;
        if (z) {
            str = "livesdk_follow";
        } else {
            str = "livesdk_unfollow";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIZ(dataChannel);
        c474500IjALIZ.LJJII("full_screen_mode_companion_tool_topic", "click_user_position");
        c474500IjALIZ.LJJII("live_anchor_c_audience", "request_page");
        c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(C1109770ez9 c1109770ez9, InteractionHubGoalMessage interactionHubGoalMessage, String str, boolean z, String str2, EnumC1083260eIO enumC1083260eIO) {
        String str3;
        long ownerUserId;
        CommonMessageData commonMessageData = interactionHubGoalMessage.baseMessage;
        if (commonMessageData != null) {
            str3 = commonMessageData.logId;
        } else {
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"is_show\":\"");
        sbLIZ.append(z ? 1 : 0);
        sbLIZ.append("\", \"drop_reason\":\"");
        sbLIZ.append(str2);
        sbLIZ.append("\", \"tip_id\":\"");
        sbLIZ.append(str);
        sbLIZ.append("\"}");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_companion_tool_tip_message_show");
        c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
        Room room = c1109770ez9.LJII;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(c1109770ez9.LJIIZILJ), "room_id");
        c474500IjALIZ.LJJII(LiveAnchorClusterSetting.INSTANCE.getValue(), "anchor_cluster_level");
        c474500IjALIZ.LJJII(str3, "log_id");
        c474500IjALIZ.LJJII(str, "tip_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_show");
        c474500IjALIZ.LJJII(str2, "drop_reason");
        c474500IjALIZ.LJJII(arrayList.toString(), "id_params");
        c474500IjALIZ.LJJII(enumC1083260eIO, "extended_screen_status");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[PHI: r1
      0x0096: PHI (r1v30 java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct>) = 
      (r1v10 java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct>)
      (r1v11 java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct>)
      (r1v33 java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct>)
     binds: [B:47:0x00d0, B:31:0x0094, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, com.bytedance.android.live.base.model.user.User r12, java.lang.String r13, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic r14, java.lang.String r15, java.lang.String r16, boolean r17, java.util.Map r18) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113520f5C.LIZJ(java.lang.String, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.live.base.model.user.User, java.lang.String, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic, java.lang.String, java.lang.String, boolean, java.util.Map):void");
    }

    public static void LJ(AbstractC1110790f0n abstractC1110790f0n, String str, String str2, String str3, int i, String str4, String str5, Integer num, String str6, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i2;
        String str7 = str6;
        Integer num2 = num;
        if ((i4 & 128) != 0) {
            num2 = null;
        }
        if ((i4 & 256) != 0) {
            str7 = "";
        }
        if ((i4 & 512) != 0) {
            i6 = 0;
        }
        if ((i4 & 1024) != 0) {
            i5 = 0;
        }
        LIZLLL("livesdk_companion_tool_label_show", abstractC1110790f0n, str, str2, str3, i, str4, str5, null, num2, str7, i6, i5);
    }

    public static void LIZLLL(String str, AbstractC1110790f0n abstractC1110790f0n, String str2, String str3, String str4, int i, String str5, String str6, String str7, Integer num, String str8, int i2, int i3) {
        String str9;
        long ownerUserId;
        Long lValueOf;
        Object objGg0;
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"is_show\":\"");
        sbLIZ.append(i);
        sbLIZ.append("\", \"drop_reason\":\"");
        sbLIZ.append(str5);
        sbLIZ.append("\", \"tag_id\":\"");
        sbLIZ.append(str3);
        sbLIZ.append("\"}");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = abstractC1110790f0n.LLIIIILZ().LJIIIZ;
        Long lValueOf2 = null;
        if (dataChannel != null && (objGg0 = dataChannel.gg0(LiveExtendedScreenStatus.class)) != null && objGg0 != EnumC1083260eIO.HIDE) {
            str9 = "comment_field";
        } else {
            str9 = "common";
        }
        C1142400fpm c1142400fpmLJ = C1136820fgm.LJ(abstractC1110790f0n.LLIIIILZ().LJIIIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(abstractC1110790f0n.LLIIIILZ().LJIIIZ);
        Room room = abstractC1110790f0n.LLIIIILZ().LJII;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(abstractC1110790f0n.LLJJIII()), "room_id");
        User user = abstractC1110790f0n.getUser();
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "tag_user_id");
        User user2 = abstractC1110790f0n.getUser();
        if (user2 != null) {
            lValueOf2 = Long.valueOf(user2.getId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "object_user_id");
        c474500IjALIZ.LJJII(LiveAnchorClusterSetting.INSTANCE.getValue(), "anchor_cluster_level");
        c474500IjALIZ.LJJII(abstractC1110790f0n.LLII(), "log_id");
        c474500IjALIZ.LJJII(str2, "msg_type");
        c474500IjALIZ.LJJII(str4, "crm_label");
        c474500IjALIZ.LJJII(str3, "topic_text");
        c474500IjALIZ.LJJII(Integer.valueOf(C1110670f0b.LIZ(abstractC1110790f0n.getUser(), c1142400fpmLJ)), "user_grade");
        c474500IjALIZ.LJJII("negative_screen", "page_name");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_show");
        c474500IjALIZ.LJJII(str5, "drop_reason");
        c474500IjALIZ.LJJII(arrayList.toString(), "id_params");
        c474500IjALIZ.LJJII(str6, "tag_show_type");
        c474500IjALIZ.LJJII(str9, "page_position");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "same_batch_tag_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "same_batch_tag_success_show_cnt");
        c474500IjALIZ.LJJII(str8, "biz_name");
        if (num != null) {
            c474500IjALIZ.LJJII(LJI(num), "action_type");
        }
        if (str7 != null) {
            c474500IjALIZ.LJJII(str7, "click_position");
        }
        c474500IjALIZ.LIZ();
    }
}
