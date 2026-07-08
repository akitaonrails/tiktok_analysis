package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.List;
import webcast.im.GuestInviteGuideMessage;
import webcast.im.GuestInviteMessage;

/* JADX INFO: renamed from: X.002R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C002R {
    public final DataChannel LIZ;
    public final C002S LIZIZ;
    public final C002Q LIZJ = new OnIMMessageListener() { // from class: X.002Q
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "guest-invite-message-channel";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            long jCurrentTimeMillis;
            if (iMessage == null) {
                return;
            }
            if (iMessage instanceof GuestInviteMessage) {
                C002R c002r = this.LL;
                GuestInviteMessage guestInviteMessage = (GuestInviteMessage) iMessage;
                c002r.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleGuestInviteMessage = ");
                sbLIZ.append(guestInviteMessage);
                C20441214yg.LIZIZ("GuestInviteMessageChannel", C2188811AlT.LIZIZ(sbLIZ));
                c002r.LIZIZ.bg2(new C0184003y(Long.valueOf(guestInviteMessage.inviterUserId), guestInviteMessage.inviterNickname, guestInviteMessage.inviterAvatar, true));
                return;
            }
            if (!(iMessage instanceof GuestInviteGuideMessage)) {
                return;
            }
            C002R c002r2 = this.LL;
            GuestInviteGuideMessage guestInviteGuideMessage = (GuestInviteGuideMessage) iMessage;
            c002r2.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleGuestInviteGuideMessage = ");
            sbLIZ2.append(guestInviteGuideMessage);
            C20441214yg.LIZIZ("GuestInviteMessageChannel", C2188811AlT.LIZIZ(sbLIZ2));
            C002S c002s = c002r2.LIZIZ;
            List<ImageModel> list = guestInviteGuideMessage.inviteeAvatar;
            int i = guestInviteGuideMessage.guestInviteDisplayType;
            int i2 = guestInviteGuideMessage.guestInviteClickAction;
            User user = guestInviteGuideMessage.inviteUser;
            if (i > 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = 0;
            }
            c002s.DR(new C00YI(list, i, i2, user, jCurrentTimeMillis, guestInviteGuideMessage.triggerType));
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.002Q] */
    public C002R(DataChannel dataChannel, C002S c002s) {
        this.LIZ = dataChannel;
        this.LIZIZ = c002s;
    }
}
