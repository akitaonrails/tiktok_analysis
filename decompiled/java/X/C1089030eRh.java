package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.EpiDecision;
import com.bytedance.android.livesdk.model.message.EpiMessage;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkEPIData;
import com.bytedance.android.livesdk.signaling.model.downlink.EPIFeatureData;
import com.bytedance.android.livesdkapi.depend.model.live.EPIFeatureValue;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089030eRh extends AbstractC1088260eQS<EpiDecision, Room> implements OnMessageListener, C0J6D {
    public IMessageManager LLIZ;

    @Override // X.AbstractC1088260eQS, X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void LJ() {
        super.LJ();
        IMessageManager iMessageManager = (IMessageManager) this.LLILLL.gg0(C776250Uch.class);
        this.LLIZ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.EPI_MESSAGE.getIntType(), this);
        }
    }

    @Override // X.AbstractC1088260eQS, X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void release() {
        super.release();
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.EPI_MESSAGE.getIntType(), this);
        }
        this.LLIZ = null;
    }

    public C1089030eRh(DataChannel dataChannel) {
        super(dataChannel, C1089110eRp.LIZLLL, RoomChannel.class);
    }

    @Override // X.C0J6D
    public final void LIZIZ(DownlinkEPIData downlinkEPIData) {
        Map<String, Long> map;
        Map<String, Float> map2;
        Map<String, String> map3;
        EpiDecision epiDecision = new EpiDecision();
        epiDecision.ts = downlinkEPIData.getTs();
        Map<String, String> decisions = downlinkEPIData.getDecisions();
        if (decisions == null) {
            decisions = new HashMap<>();
        }
        epiDecision.dataV2 = decisions;
        EPIFeatureValue ePIFeatureValue = new EPIFeatureValue();
        EPIFeatureData features = downlinkEPIData.getFeatures();
        if (features == null || (map = features.intFeature) == null) {
            map = new HashMap<>();
        }
        ePIFeatureValue.intFeature = map;
        EPIFeatureData features2 = downlinkEPIData.getFeatures();
        if (features2 == null || (map2 = features2.floatFeature) == null) {
            map2 = new HashMap<>();
        }
        ePIFeatureValue.floatFeature = map2;
        EPIFeatureData features3 = downlinkEPIData.getFeatures();
        if (features3 == null || (map3 = features3.stringFeature) == null) {
            map3 = new HashMap<>();
        }
        ePIFeatureValue.stringFeature = map3;
        epiDecision.LIZ = ePIFeatureValue;
        LJFF(epiDecision);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.bytedance.android.livesdk.model.message.EpiDecision] */
    @Override // X.AbstractC1088260eQS
    public final EpiDecision LJII(Room room) {
        EpiphronDecision epiphronDecision = room.decisions;
        if (epiphronDecision != null) {
            EpiDecision epiDecision = new EpiDecision();
            epiDecision.ts = epiphronDecision.ts;
            epiDecision.data = epiphronDecision.data;
            epiDecision.dataV2 = epiphronDecision.dataV2;
            epiDecision.serverFeatures = epiphronDecision.serverFeatures;
            epiDecision.LIZ = epiphronDecision.serverFeaturesV2;
            return epiDecision;
        }
        return this.LL.LIZIZ;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        EpiDecision epiDecision;
        if ((iMessage instanceof EpiMessage) && (epiDecision = ((EpiMessage) iMessage).decisions) != null) {
            LJFF(epiDecision);
        }
    }
}
