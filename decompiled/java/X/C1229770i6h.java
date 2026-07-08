package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;

/* JADX INFO: renamed from: X.0i6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229770i6h {
    public static final DMGroupChatStickerGroupInfo LIZ(GroupPreviewDisplayMeta groupPreviewDisplayMeta) {
        int memberCount;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        IMContactApi.LIZ.getClass();
        String str = null;
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(C461720I8s.LIZIZ(), null, "im_local_db");
        if (iMUserLJIIL != null && (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null) {
            str = userB2CAccountInfo.userTags;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(String.valueOf(groupPreviewDisplayMeta.groupInfo.convShortId));
        if (c0y8tLIZ != null) {
            memberCount = c0y8tLIZ.getMemberCount();
        } else {
            memberCount = 1;
        }
        Long lValueOf = Long.valueOf(groupPreviewDisplayMeta.groupInfo.convShortId);
        GroupForPreview groupForPreview = groupPreviewDisplayMeta.groupInfo;
        String str2 = groupForPreview.groupName;
        String str3 = groupForPreview.accessCriteriaDesc;
        String str4 = groupForPreview.avatarUrl;
        String str5 = groupPreviewDisplayMeta.eventTracking.get("group_type");
        if (str5 == null) {
            str5 = "";
        }
        return new DMGroupChatStickerGroupInfo(lValueOf, str2, str3, str4, 2, str5, str, Integer.valueOf(memberCount), groupPreviewDisplayMeta.groupInfo.groupDesc);
    }
}
