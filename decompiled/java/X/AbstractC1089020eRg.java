package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.EpiDecision;
import com.bytedance.android.livesdk.model.message.EpiMessage;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Map;

/* JADX INFO: renamed from: X.0eRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1089020eRg<T> extends AbstractC1088260eQS<T, Room> implements OnMessageListener {
    public final InterfaceC1936307iD<T> LLIZ;
    public IMessageManager LLIZLLLIL;
    public T LLJ;

    @Override // X.AbstractC1088260eQS, X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void LJ() {
        super.LJ();
        IMessageManager iMessageManager = (IMessageManager) this.LLILLL.gg0(C776250Uch.class);
        this.LLIZLLLIL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.EPI_MESSAGE.getIntType(), this);
        }
    }

    @Override // X.AbstractC1088260eQS, X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void release() {
        super.LJ();
        IMessageManager iMessageManager = this.LLIZLLLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.EPI_MESSAGE.getIntType(), this);
        }
        this.LLIZLLLIL = null;
    }

    @Override // X.AbstractC1088260eQS
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public T LJII(Room room) {
        Map<String, String> map;
        EpiphronDecision epiphronDecision = room.decisions;
        if (epiphronDecision != null) {
            map = epiphronDecision.data;
        } else {
            map = null;
        }
        return LJIIIZ(map);
    }

    public final T LJIIIZ(Map<String, String> map) {
        String str;
        if (map != null && (str = map.get(this.LL.LIZ)) != null) {
            return this.LLIZ.parse(str);
        }
        return null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        EpiDecision epiDecision;
        T tLJIIIZ;
        if ((iMessage instanceof EpiMessage) && (epiDecision = ((EpiMessage) iMessage).decisions) != null && (tLJIIIZ = LJIIIZ(epiDecision.data)) != null) {
            this.LLJ = tLJIIIZ;
            LJFF(tLJIIIZ);
        }
    }

    public AbstractC1089020eRg(DataChannel dataChannel, AbstractC1084540eKS<T> abstractC1084540eKS, InterfaceC1936307iD<T> interfaceC1936307iD) {
        super(dataChannel, abstractC1084540eKS, RoomChannel.class);
        this.LLIZ = interfaceC1936307iD;
    }
}
