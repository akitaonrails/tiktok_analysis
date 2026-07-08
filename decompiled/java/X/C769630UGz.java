package X;

import Y.AObjectS115S0000000_12;
import Y.AObjectS191S0300000_12;
import Y.AObjectS355S0100000_12;
import android.view.View;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C769630UGz extends C0UDO {
    public View LL;
    public final AObjectS115S0000000_12 LLILLJJLI = new AObjectS115S0000000_12(8);
    public final /* synthetic */ VideoWidget LLILLL;

    public final void LIZ() {
        if (C500260Jjc.LJJJJIZL(this.LL)) {
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PROPS);
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        VideoWidget videoWidget = this.LLILLL;
        iBroadcastService.openStickerPropsDialog("toolbar", videoWidget.dataChannel, videoWidget.LLJJLIIIJLLLLLLLZ, videoWidget.LLJJIJI);
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        C0KX8 c0kx8 = (C0KX8) this.LLILLL.dataChannel.gg0(LiveBanCapabilityChannel.class);
        return c0kx8 == null || !c0kx8.LIZJ;
    }

    public C769630UGz(VideoWidget videoWidget) {
        this.LLILLL = videoWidget;
        DataChannelGlobal.LLILZ.BQ2(this, videoWidget, BroadcastSchemaOpenPanelEvent.class, new AObjectS355S0100000_12(this, 51));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LIZ();
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        super.WH(interfaceC1103130eoR, dataChannel);
        this.LL = interfaceC1103130eoR.findViewById(R.id.y7r);
        EnumC1102750enp.PROPS.setEnableClick(dataChannel, false);
        C753070TgP.LIZJ(null, this.LLILLJJLI, new AObjectS191S0300000_12(this, dataChannel, interfaceC1103130eoR, 1), null, null, Boolean.TRUE);
    }
}
