package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.BizSpotInfoCenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: renamed from: X.00S0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00S0 {
    public static InterfaceC927740aFY LIZIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("BIZ_SPOT_INFO_CENTER");
        if (objLJIIIZ instanceof InterfaceC927740aFY) {
            return (InterfaceC927740aFY) objLJIIIZ;
        }
        return null;
    }

    public static void LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            BizSpotInfoCenter bizSpotInfoCenter = new BizSpotInfoCenter(dataChannel);
            IMessageManager iMessageManager = (IMessageManager) bizSpotInfoCenter.LIZIZ.getValue();
            if (iMessageManager != null) {
                iMessageManager.addStickyMessageListener(C001A.LINK_MIC_LAYOUT_STATE_MESSAGE.getIntType(), (OnIMMessageListener) bizSpotInfoCenter.LIZLLL);
            }
            C948450amx.LIZIZ.LJFF(bizSpotInfoCenter, null);
            C1AZW.LJIIJ(12, "BizSpotInfoCenter", "BizSpotInfoCenter create instance", null, null);
        }
    }
}
