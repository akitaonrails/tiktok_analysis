package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameCreateInfoRttGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.GameResumeCrossDeviceEvent;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.ServerAndClientTimeGapGlobalChannel;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.model.GameServerFeature;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.GameOCRPingMessage;
import com.bytedance.android.livesdk.model.message.GameServerFeatureMessage;
import com.bytedance.android.livesdk.model.message.HighlightFragmentReadyMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00xW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C247600xW implements OnMessageListener {
    public static final List<String> LLILZLL = new ArrayList();
    public final C19EG LL;
    public final DataChannel LLILLJJLI;
    public boolean LLILLL;
    public IMessageManager LLILZ;
    public long LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(final IMessage iMessage) {
        DataChannel dataChannel;
        long jLongValue;
        DataChannel dataChannel2;
        if (iMessage instanceof HighlightFragmentReadyMessage) {
            Map<String, Object> map = C1338270kvh.LIZ;
            GameLiveFragment gameLiveFragment = ((HighlightFragmentReadyMessage) iMessage).gameLiveFragment;
            if (gameLiveFragment != null) {
                ArrayList arrayList = (ArrayList) LLILZLL;
                if (arrayList.contains(gameLiveFragment.fragmentIdStr)) {
                    String str = gameLiveFragment.fragmentIdStr;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("fragment_id", str);
                    linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    C1CC2.LJII(-2, C0KQH.LIZ("ttlive_highlight_to_draft_monitor"), linkedHashMap);
                    ((IGameService) C1161920gLG.LIZJ(IGameService.class)).KT(this.LL, gameLiveFragment);
                    arrayList.remove(gameLiveFragment.fragmentIdStr);
                    return;
                }
                return;
            }
            return;
        }
        if (iMessage instanceof MemberMessage) {
            if (!((BaseMessage) iMessage).isCurrentRoom(this.LLILZIL) || (dataChannel2 = this.LLILLJJLI) == null) {
                return;
            }
            dataChannel2.zW(MemberMessageChannel.class, iMessage);
            return;
        }
        if (iMessage instanceof GameOCRPingMessage) {
            GameOCRPingMessage gameOCRPingMessage = (GameOCRPingMessage) iMessage;
            if (!gameOCRPingMessage.isCurrentRoom(this.LLILZIL)) {
                return;
            }
            synchronized (C247800xY.LIZ) {
                C247700xX c247700xX = C247800xY.LIZIZ;
                c247700xX.LIZ = gameOCRPingMessage;
                c247700xX.LIZIZ = false;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Long l = (Long) dataChannelGlobal.gg0(ServerAndClientTimeGapGlobalChannel.class);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                Long l2 = (Long) dataChannelGlobal.gg0(GameCreateInfoRttGlobalChannel.class);
                if (l2 != null) {
                    l2.longValue();
                }
                c247700xX.LIZJ = (System.currentTimeMillis() - gameOCRPingMessage.pingTimestamp) + jLongValue;
                Map<String, Object> map2 = C1338270kvh.LIZ;
            }
            final double d = gameOCRPingMessage.confidence;
            C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0UhJ
                /* JADX WARN: Removed duplicated region for block: B:78:0x01f2  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0207  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r17) {
                    /*
                        Method dump skipped, instruction units count: 637
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C779110UhJ.accept(java.lang.Object):void");
                }
            });
            return;
        }
        if (iMessage instanceof GameServerFeatureMessage) {
            Map<String, Object> map3 = C1338270kvh.LIZ;
            List<GameServerFeature> list = ((GameServerFeatureMessage) iMessage).allFeatures;
            if (list == null) {
                return;
            }
            for (GameServerFeature gameServerFeature : list) {
                Map<String, Object> map4 = C1338270kvh.LIZ;
                ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).vT0(gameServerFeature.id, gameServerFeature.value, gameServerFeature.valueMap);
            }
            return;
        }
        if (!(iMessage instanceof ControlMessage) || ((ControlMessage) iMessage).action != 8 || (dataChannel = this.LLILLJJLI) == null) {
            return;
        }
        dataChannel.FQ2(GameResumeCrossDeviceEvent.class);
    }

    public C247600xW(C19EG c19eg, DataChannel dataChannel) {
        this.LL = c19eg;
        this.LLILLJJLI = dataChannel;
    }
}
