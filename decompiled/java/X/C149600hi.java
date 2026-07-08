package X;

import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.00hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C149600hi implements OnMessageListener {
    public IMessageManager LL;
    public boolean LLILLJJLI;

    public C149600hi() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        boolean z = false;
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        }
        this.LLILLJJLI = z;
    }

    public final void LIZ(DataChannel dataChannel) {
        boolean zBooleanValue;
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILLJJLI = zBooleanValue;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        this.LL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.GIFT_COLLECTION_UPDATE_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.GIFT_PROGRESS_MESSAGE.getIntType(), this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149600hi.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
