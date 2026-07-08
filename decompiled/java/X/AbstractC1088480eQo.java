package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.0eQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1088480eQo<T> extends AbstractC1088260eQS<T, Room> implements OnMessageListener {
    public final InterfaceC1088490eQp<T, Room> LLIZ;
    public IMessageManager LLIZLLLIL;

    @Override // X.AbstractC1088260eQS, X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void LJ() {
        super.LJ();
        IMessageManager iMessageManager = (IMessageManager) this.LLILLL.gg0(C776250Uch.class);
        this.LLIZLLLIL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(this.LLIZ.LIZ(), this);
        }
    }

    @Override // X.AbstractC1088260eQS, X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void release() {
        super.LJ();
        IMessageManager iMessageManager = this.LLIZLLLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this.LLIZ.LIZ(), this);
        }
        this.LLIZLLLIL = null;
    }

    @Override // X.AbstractC1088260eQS
    public final Object LJII(Room room) {
        return this.LLIZ.LIZIZ(room, this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        this.LLIZ.LIZJ(iMessage, this);
    }

    public AbstractC1088480eQo(DataChannel dataChannel, AbstractC1084540eKS<T> abstractC1084540eKS, InterfaceC1088490eQp<T, Room> interfaceC1088490eQp) {
        super(dataChannel, abstractC1084540eKS, RoomChannel.class);
        this.LLIZ = interfaceC1088490eQp;
    }
}
