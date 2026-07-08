package X;

import com.bytedance.android.livesdk.game.model.GameServerFeature;
import com.bytedance.android.livesdk.model.message.GameServerFeatureMessage;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00JM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00JM implements OnMessageListener {
    public DataChannel LL;

    public final void LIZ(DataChannel dataChannel) {
        IMessageManager iMessageManager;
        this.LL = dataChannel;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.GAME_SERVER_FEATURE_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            if (iMessage instanceof GameServerFeatureMessage) {
                Map<String, Object> map = C1338270kvh.LIZ;
                List<GameServerFeature> list = ((GameServerFeatureMessage) iMessage).allFeatures;
                if (list != null) {
                    for (GameServerFeature gameServerFeature : list) {
                        Map<String, Object> map2 = C1338270kvh.LIZ;
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).vT0(gameServerFeature.id, gameServerFeature.value, gameServerFeature.valueMap);
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
