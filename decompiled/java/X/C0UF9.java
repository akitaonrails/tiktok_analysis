package X;

import Y.AObjectS312S0200000_12;
import Y.AObjectS355S0100000_12;
import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.dataChannel.TurnOnVisualRelatedFunctionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UF9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UF9 extends C0UDO {
    public View LL;
    public final /* synthetic */ VideoWidget LLILLJJLI;

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        String str = C924810aAp.LJ().LJIILJJIL;
        this.LLILLJJLI.getClass();
        return C781270Ukn.LJIILJJIL().rl2(str) || !C781270Ukn.LJIILJJIL().o1();
    }

    public C0UF9(VideoWidget videoWidget) {
        this.LLILLJJLI = videoWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveStickerLogManager().LJI();
        String str = C924810aAp.LJ().LJIILJJIL;
        this.LLILLJJLI.getClass();
        if (!C781270Ukn.LJIILJJIL().rl2(str) && C781270Ukn.LJIILJJIL().o1()) {
            return;
        }
        if (C500260Jjc.LJJJJIZL(this.LL)) {
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_EFFECT);
        }
        this.LLILLJJLI.F1(false, false, true, false, false, null);
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        super.WH(interfaceC1103130eoR, dataChannel);
        this.LL = interfaceC1103130eoR.findViewById(R.id.y7r);
        String str = C924810aAp.LJ().LJIILJJIL;
        this.LLILLJJLI.getClass();
        if (!C781270Ukn.LJIILJJIL().rl2(str) && C781270Ukn.LJIILJJIL().o1()) {
            interfaceC1103130eoR.setAlpha(this.LLILLJJLI.LL.floatValue());
        }
        dataChannel.BQ2(this.LLILLJJLI, TurnOnVisualRelatedFunctionEvent.class, new AObjectS312S0200000_12(this, interfaceC1103130eoR, 2));
        C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_EFFECT;
        RedDotExtensionKt.LJI(this.LL, this.LLILLJJLI, null, c0ux6, new AObjectS355S0100000_12(this, 24));
    }
}
