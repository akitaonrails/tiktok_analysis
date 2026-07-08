package X;

import Y.AObjectS110S0000000_7;
import Y.AObjectS189S0300000_7;
import Y.AObjectS350S0100000_7;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Jf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497410Jf1 implements InterfaceViewOnClickListenerC1102800enu, Observer<C998850c6F> {
    public DataChannel LL;
    public final Context LLILLJJLI;
    public final AObjectS110S0000000_7 LLILLL = new AObjectS110S0000000_7(7);
    public C0UFE LLILZ;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        C0KX8 c0kx8 = (C0KX8) this.LL.gg0(LiveBanCapabilityChannel.class);
        if (this.LLILZ == C0UFE.ON) {
            return c0kx8 == null || !c0kx8.LIZIZ;
        }
        return false;
    }

    public C497410Jf1(Context context) {
        this.LLILLJJLI = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0KX8 c0kx8 = (C0KX8) this.LL.gg0(LiveBanCapabilityChannel.class);
        if (c0kx8 != null && c0kx8.LIZIZ) {
            C766270U4b.LIZLLL(2131844181);
        } else {
            C753070TgP.LIZJ(this.LL, this.LLILLL, new AObjectS350S0100000_7(this, 87), new AObjectS110S0000000_7(6), this.LLILLJJLI.getString(2131840781), Boolean.TRUE);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C998850c6F c998850c6F) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LL = dataChannel;
        C753070TgP.LIZJ(null, this.LLILLL, new AObjectS189S0300000_7(this, dataChannel, interfaceC1103130eoR, 0), null, null, Boolean.TRUE);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_detail_setting");
        c474500IjALIZ.LJIL();
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
        c474500IjALIZ.LJJIIZI(C494680Jac.LJIIZILJ(C517110KPt.LIZIZ()));
        c474500IjALIZ.LJ("show");
        c474500IjALIZ.LIZ();
        dataChannel.BQ2(C520010KaN.LJJIFFI(this.LLILLJJLI, true), LiveBanCapabilityChannel.class, new AObjectS350S0100000_7(interfaceC1103130eoR, 86));
    }
}
