package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.concurrent.CopyOnWriteArrayList;
import webcast.im.AvatarGenerateResultMessage;
import webcast.im.AvatarReportDeleteMessage;
import webcast.im.AvatarStyleResultMessage;

/* JADX INFO: renamed from: X.0114, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0114 {
    public final DataChannel LIZ;
    public final CopyOnWriteArrayList<AnonymousClass0115> LIZIZ = new CopyOnWriteArrayList<>();
    public final AnonymousClass0113 LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0113, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public AnonymousClass0114(DataChannel dataChannel) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        ?? r2 = new OnIMMessageListener() { // from class: X.0113
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "avatar-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage == null) {
                    return;
                }
                if (iMessage instanceof AvatarStyleResultMessage) {
                    CopyOnWriteArrayList<AnonymousClass0115> copyOnWriteArrayList = this.LL.LIZIZ;
                    if (copyOnWriteArrayList != null) {
                        for (AnonymousClass0115 anonymousClass0115 : copyOnWriteArrayList) {
                            if (anonymousClass0115 != null) {
                                AvatarStyleResultMessage avatarStyleResultMessage = (AvatarStyleResultMessage) iMessage;
                                anonymousClass0115.LIZ(new C936360aTS(avatarStyleResultMessage.taskId, avatarStyleResultMessage.image, avatarStyleResultMessage.status, avatarStyleResultMessage.statusMessage));
                            }
                        }
                        return;
                    }
                    return;
                }
                if (iMessage instanceof AvatarGenerateResultMessage) {
                    CopyOnWriteArrayList<AnonymousClass0115> copyOnWriteArrayList2 = this.LL.LIZIZ;
                    if (copyOnWriteArrayList2 != null) {
                        for (AnonymousClass0115 anonymousClass01152 : copyOnWriteArrayList2) {
                            if (anonymousClass01152 != null) {
                                anonymousClass01152.LIZIZ(((AvatarGenerateResultMessage) iMessage).avatar);
                            }
                        }
                        return;
                    }
                    return;
                }
                if (iMessage instanceof AvatarReportDeleteMessage) {
                    CopyOnWriteArrayList<AnonymousClass0115> copyOnWriteArrayList3 = this.LL.LIZIZ;
                    if (copyOnWriteArrayList3 != null) {
                        for (AnonymousClass0115 anonymousClass01153 : copyOnWriteArrayList3) {
                            if (anonymousClass01153 != null) {
                                anonymousClass01153.LIZJ(new AnonymousClass0117(((AvatarReportDeleteMessage) iMessage).avatarId));
                            }
                        }
                    }
                    C936250aTH.LIZ();
                }
            }
        };
        this.LIZJ = r2;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.AVATAR_STYLE_RESULT_MESSAGE.getIntType(), (OnIMMessageListener) r2);
            iMessageManager.addMessageListener(C001A.AVATAR_GENERATE_RESULT_MESSAGE.getIntType(), (OnIMMessageListener) r2);
            iMessageManager.addMessageListener(C001A.AVATAR_REPORT_DELETE_MESSAGE.getIntType(), (OnIMMessageListener) r2);
        }
    }
}
