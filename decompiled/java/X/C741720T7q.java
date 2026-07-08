package X;

import com.bytedance.android.live.liveinteract.api.BattleBonusTaskAddOnHeightChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0T7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741720T7q {
    public final DataChannel LIZ;

    public C741720T7q(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustGiftTrayMarginAddOn source:");
        sbLIZ.append(str);
        sbLIZ.append(" marginBottom:");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("TakeTheStageGiftPanelLayoutHelper", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(BattleBonusTaskAddOnHeightChannel.class, Integer.valueOf(i));
        }
    }
}
