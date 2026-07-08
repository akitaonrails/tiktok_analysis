package X;

import com.bytedance.android.livesdk.model.message.EpiDecision;
import com.bytedance.android.livesdk.model.message.EpiMessage;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;

/* JADX INFO: renamed from: X.0eRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1089040eRi<T> extends AbstractC1089020eRg<T> {
    @Override // X.AbstractC1089020eRg, X.AbstractC1088260eQS
    public final /* bridge */ /* synthetic */ Object LJII(Room room) {
        return LJII(room);
    }

    @Override // X.AbstractC1089020eRg
    /* JADX INFO: renamed from: LJIIIIZZ */
    public final T LJII(Room room) {
        Map<String, String> map;
        EpiphronDecision epiphronDecision = room.decisions;
        if (epiphronDecision != null) {
            map = epiphronDecision.serverFeatures;
        } else {
            map = null;
        }
        return LJIIIZ(map);
    }

    @Override // X.AbstractC1089020eRg, com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        EpiDecision epiDecision;
        T tLJIIIZ;
        if ((iMessage instanceof EpiMessage) && (epiDecision = ((EpiMessage) iMessage).decisions) != null && (tLJIIIZ = LJIIIZ(epiDecision.serverFeatures)) != null) {
            this.LLJ = tLJIIIZ;
            LJFF(tLJIIIZ);
        }
    }

    public AbstractC1089040eRi(DataChannel dataChannel, AbstractC1084540eKS<T> abstractC1084540eKS, InterfaceC1936307iD<T> interfaceC1936307iD) {
        super(dataChannel, abstractC1084540eKS, interfaceC1936307iD);
    }
}
