package X;

import Y.ACListenerS147S0100000_12;
import android.view.View;
import com.bytedance.android.live.EchoModeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768660UDg implements InterfaceViewOnClickListenerC1102800enu {
    public C20743716Ff LL;
    public View LLILLJJLI;
    public DataChannel LLILLL;

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
    public final boolean dj() {
        return false;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
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
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LLILLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_earphone_monitor_effective_switch");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII(Integer.valueOf(Boolean.compare(C768620UDc.LIZ.LJI(), false)), "earphone_status");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 != null) {
            dataChannel3.zQ2(this);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLL = dataChannel;
        this.LL = (C20743716Ff) interfaceC1103130eoR.findViewById(R.id.ghy);
        View viewFindViewById = interfaceC1103130eoR.findViewById(R.id.y7r);
        this.LLILLJJLI = viewFindViewById;
        C500260Jjc.LJLJLJ(viewFindViewById, false);
        C20743716Ff c20743716Ff = this.LL;
        if (c20743716Ff != null) {
            c20743716Ff.setToggleEnabled(false);
        }
        C20743716Ff c20743716Ff2 = this.LL;
        if (c20743716Ff2 != null) {
            c20743716Ff2.setDebounceClickEnabled(true);
        }
        C20743716Ff c20743716Ff3 = this.LL;
        if (c20743716Ff3 != null) {
            c20743716Ff3.setDelayInterval(500L);
        }
        C20743716Ff c20743716Ff4 = this.LL;
        if (c20743716Ff4 != null) {
            c20743716Ff4.setEnabled(false);
        }
        C20743716Ff c20743716Ff5 = this.LL;
        if (c20743716Ff5 != null) {
            c20743716Ff5.setDisabledAlpha(1.0f);
        }
        C1834150xpV.LJIIJ(this.LL, true);
        if (dataChannel != null) {
            dataChannel.DQ2(EchoModeChannel.class, this, new AwS591S0100000_12(this, 750));
        }
        C20743716Ff c20743716Ff6 = this.LL;
        if (c20743716Ff6 != null) {
            C786410Ut5.k8(c20743716Ff6, new ACListenerS147S0100000_12(this, 299));
        }
    }
}
