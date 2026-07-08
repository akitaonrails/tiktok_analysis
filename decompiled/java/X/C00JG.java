package X;

import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList;
import com.bytedance.android.livesdk.model.message.GroupLiveMemberNotifyMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.00JG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00JG implements OnMessageListener {
    public final DataChannel LL;

    public C00JG(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C00JH c00jh;
        if (iMessage != null && (iMessage instanceof GroupLiveMemberNotifyMessage)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMessage;host=");
            GroupLiveMemberNotifyMessage groupLiveMemberNotifyMessage = (GroupLiveMemberNotifyMessage) iMessage;
            sbLIZ.append(groupLiveMemberNotifyMessage.hostUserId);
            sbLIZ.append(";members=");
            sbLIZ.append(groupLiveMemberNotifyMessage.memberInfo.size());
            C20441214yg.LIZIZ("GroupLiveMemberService", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LL;
            if (dataChannel != null && (c00jh = (C00JH) dataChannel.gg0(GroupLiveMemberList.class)) != null && c00jh.LIZIZ >= groupLiveMemberNotifyMessage.baseMessage.createTime) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ignore older IM ");
                sbLIZ2.append(groupLiveMemberNotifyMessage.getMessageId());
                C20441214yg.LIZIZ("GroupLiveMemberService", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            C00JH c00jh2 = new C00JH(groupLiveMemberNotifyMessage.memberInfo, groupLiveMemberNotifyMessage.baseMessage.createTime);
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.zW(GroupLiveMemberList.class, c00jh2);
        }
    }
}
