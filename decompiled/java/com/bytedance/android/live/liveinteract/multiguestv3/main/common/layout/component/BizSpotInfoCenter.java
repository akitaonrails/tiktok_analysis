package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component;

import X.C002U;
import X.C01GW;
import X.C080500Rv;
import X.C20441214yg;
import X.C452501pT;
import X.C5182020e;
import X.InterfaceC927740aFY;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.BizSpotInfoCenter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWavePrivilegeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceSongNameChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;
import tikcast.linkmic.common.PosIdentity;
import webcast.im.BizLayoutState;
import webcast.im.BizSpotExtra;
import webcast.im.BizSpotInfo;
import webcast.im.JustDanceLayoutExtra;
import webcast.im.LinkMicLayoutStateMessage;
import webcast.im.MultiGuestBizLayoutExtra;
import webcast.im.MultiGuestBizSpotExtra;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC948500an2(name = "BIZ_SPOT_INFO_CENTER")
public final class BizSpotInfoCenter implements InterfaceC927740aFY {
    public static final /* synthetic */ int LJ = 0;
    public final DataChannel LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C5182020e(this, 29));
    public final Map<String, C080500Rv> LIZJ = new LinkedHashMap();
    public final C002U LIZLLL = new OnIMMessageListener() { // from class: X.002U
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "LayoutStateMessage";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            MultiGuestBizLayoutExtra multiGuestBizLayoutExtra;
            JustDanceLayoutExtra justDanceLayoutExtra;
            String str;
            PosIdentity posIdentity;
            String str2;
            C11PQ<SoundWareEffectExtra> c11pq;
            MultiGuestBizSpotExtra multiGuestBizSpotExtra;
            SoundWareEffectExtra soundWareEffectExtra;
            C080500Rv c080500RvLIZ;
            C11PQ<SoundWareEffectExtra> c11pq2;
            if (iMessage != null && (iMessage instanceof LinkMicLayoutStateMessage)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recieve LinkMicLayoutStateMessage， message_id = ");
                LinkMicLayoutStateMessage linkMicLayoutStateMessage = (LinkMicLayoutStateMessage) iMessage;
                sbLIZ.append(linkMicLayoutStateMessage.getMessageId());
                C20441214yg.LIZIZ("BizSpotInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                if (MultiGuestVoiceWavePrivilegeSetting.INSTANCE.enable()) {
                    BizSpotInfoCenter bizSpotInfoCenter = this.LL;
                    bizSpotInfoCenter.getClass();
                    for (BizSpotInfo bizSpotInfo : linkMicLayoutStateMessage.bizSpotList) {
                        PosIdentity posIdentity2 = bizSpotInfo.posIdentity;
                        Integer numValueOf = null;
                        if (posIdentity2 != null) {
                            numValueOf = Integer.valueOf(posIdentity2.type);
                        }
                        if (numValueOf == 1 && (posIdentity = bizSpotInfo.posIdentity) != null && (str2 = posIdentity.value) != null) {
                            BizSpotExtra bizSpotExtra = bizSpotInfo.bizSpotExtra;
                            if (bizSpotExtra != null && (multiGuestBizSpotExtra = bizSpotExtra.multiGuestBizSpotExtra) != null && (soundWareEffectExtra = multiGuestBizSpotExtra.soundWareEffectExtra) != null && (c080500RvLIZ = bizSpotInfoCenter.LIZ(str2)) != null && (c11pq2 = c080500RvLIZ.LIZ) != null) {
                                c11pq2.onNext(soundWareEffectExtra);
                                if (Unit.LIZ == null) {
                                }
                            }
                            C080500Rv c080500RvLIZ2 = bizSpotInfoCenter.LIZ(str2);
                            if (c080500RvLIZ2 != null && (c11pq = c080500RvLIZ2.LIZ) != null) {
                                c11pq.onNext(C053100Hh.LIZ);
                            }
                        }
                    }
                }
                BizLayoutState bizLayoutState = linkMicLayoutStateMessage.bizLayoutState;
                if (bizLayoutState != null && (multiGuestBizLayoutExtra = bizLayoutState.multiGuestBizLayoutExtra) != null && (justDanceLayoutExtra = multiGuestBizLayoutExtra.justDanceLayoutExtra) != null && (str = justDanceLayoutExtra.justDanceSongTitle) != null) {
                    BizSpotInfoCenter bizSpotInfoCenter2 = this.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LayoutStateMessage justDanceSongTitle = ");
                    sbLIZ2.append(str);
                    C20441214yg.LIZIZ("BizSpotInfoCenter", C2188811AlT.LIZIZ(sbLIZ2));
                    DataChannel dataChannel = bizSpotInfoCenter2.LIZ;
                    if (dataChannel != null) {
                        dataChannel.zW(MultiLetsDanceSongNameChannel.class, str);
                    }
                }
            }
        }
    };

    @Override // X.InterfaceC927740aFY
    public final void LIZIZ() {
        C20441214yg.LIZIZ("BizSpotInfoCenter", "BizSpotInfoCenter onDestroy");
        IMessageManager iMessageManager = (IMessageManager) this.LIZIZ.getValue();
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LIZLLL);
        }
        ((LinkedHashMap) this.LIZJ).clear();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.002U] */
    public BizSpotInfoCenter(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC927740aFY
    public final C080500Rv LIZ(String str) {
        if (a0.LJJJIL(str)) {
            return null;
        }
        if (this.LIZJ.containsKey(str)) {
            return (C080500Rv) ((LinkedHashMap) this.LIZJ).get(str);
        }
        C080500Rv c080500Rv = new C080500Rv(null);
        this.LIZJ.put(str, c080500Rv);
        return c080500Rv;
    }
}
