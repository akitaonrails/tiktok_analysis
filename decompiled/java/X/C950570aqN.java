package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0aqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950570aqN {
    public static final MHJoinReplyBizContent LIZ(C954640aww c954640aww) {
        int i;
        String str;
        JoinGroupMessageExtra joinGroupMessageExtra;
        MHJoinReplyBizContent mHJoinReplyBizContent = new MHJoinReplyBizContent(0, "", 0);
        MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
        int i2 = 0;
        if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
            i = (int) joinGroupMessageExtra.sourceType;
        } else {
            i = 0;
        }
        mHJoinReplyBizContent.sourceType = i;
        if (mHJoinBizContent == null || (str = mHJoinBizContent.LIZ) == null) {
            str = "";
        }
        mHJoinReplyBizContent.algoRequestId = str;
        if (mHJoinBizContent != null) {
            i2 = mHJoinBizContent.matchedPreferenceTag;
        }
        mHJoinReplyBizContent.matchedPreferenceTag = LIZJ(i2);
        return mHJoinReplyBizContent;
    }

    public static final int LIZJ(int i) {
        if (!C1152520g66.LIZ()) {
            return 0;
        }
        return i;
    }

    public static final void LIZIZ(C954640aww c954640aww, String str, String str2) {
        int i;
        if (!C1152520g66.LIZ()) {
            return;
        }
        MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
        if (mHJoinBizContent != null) {
            i = mHJoinBizContent.matchedPreferenceTag;
        } else {
            i = 0;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        int i2 = linkCrossRoomDataHolderLIZIZ.LJJLI;
        linkCrossRoomDataHolderLIZIZ.LJJLI = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("captured matched_preference_tag=");
        sbLIZ.append(i);
        sbLIZ.append(" from JoinGroupBizContent (");
        sbLIZ.append(str2);
        sbLIZ.append(") (was=");
        sbLIZ.append(i2);
        sbLIZ.append(')');
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }
}
