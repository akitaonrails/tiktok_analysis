package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0axL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954890axL {
    public static final C956270azZ LIZ(C954640aww c954640aww) {
        JoinGroupMessageExtra joinGroupMessageExtra;
        InviteGroupMessage inviteGroupMessage;
        String str = "";
        double d = 0.0d;
        boolean zIsFromQueueReorder = false;
        if (c954640aww == null) {
            return new C956270azZ(0.0d, "", false);
        }
        Object obj = c954640aww.LJIIIIZZ;
        JoinGroupMessageExtra.InvitationReorderExtra invitationReorderExtra = null;
        if ((obj instanceof InviteGroupMessage) && (inviteGroupMessage = (InviteGroupMessage) obj) != null) {
            zIsFromQueueReorder = inviteGroupMessage.isFromQueueReorder();
        }
        MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
        if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
            invitationReorderExtra = joinGroupMessageExtra.invitationReorderExtra;
        }
        if (invitationReorderExtra != null) {
            d = invitationReorderExtra.strategyScore;
            String str2 = invitationReorderExtra.strategyName;
            if (str2 != null) {
                str = str2;
            }
        }
        return new C956270azZ(d, str, zIsFromQueueReorder);
    }
}
