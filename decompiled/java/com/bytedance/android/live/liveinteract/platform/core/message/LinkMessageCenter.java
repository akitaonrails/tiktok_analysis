package com.bytedance.android.live.liveinteract.platform.core.message;

import X.C001A;
import X.C1AZW;
import X.C2188811AlT;
import X.C776250Uch;
import X.EnumC1303240k1C;
import X.InterfaceC490501vb;
import X.InterfaceC948500an2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "LINK_MESSAGE_CENTER")
public final class LinkMessageCenter implements OnMessageListener {
    public final DataChannel LL;
    public final List<InterfaceC490501vb> LLILLJJLI = new ArrayList();

    public final void LIZIZ() {
        IMessageManager iMessageManager = (IMessageManager) this.LL.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LINK_MIC_SIGNAL.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_MIC.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.SOCIAL.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_CO_HOST_GUIDE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_SCREEN_CHANGE_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_STATE_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.COHOST_RESERVE_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_MIC_AD_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_BUSINESS_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINKMIC_ANIMATION_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_LAYOUT_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.COMPETITION_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.CAPSULE_MESSAGE.getIntType(), this);
        }
    }

    public final void LIZJ() {
        try {
            IMessageManager iMessageManager = (IMessageManager) this.LL.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AZW.LJFF(LIZLLL(66), "removeMessageListener failed", e.getMessage(), null);
        }
    }

    public LinkMessageCenter(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void LIZ(InterfaceC490501vb interfaceC490501vb) {
        ((ArrayList) this.LLILLJJLI).add(interfaceC490501vb);
    }

    public final String LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_LinkMessageCenter_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ(InterfaceC490501vb interfaceC490501vb) {
        if (((ArrayList) this.LLILLJJLI).contains(interfaceC490501vb)) {
            ((ArrayList) this.LLILLJJLI).remove(interfaceC490501vb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:248:0x0474  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r19) {
        /*
            Method dump skipped, instruction units count: 2424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
