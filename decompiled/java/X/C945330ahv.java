package X;

import Y.ACListenerS150S0100000_15;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.multihost.trymode.TryModeCoHostManageSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ahv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945330ahv implements InterfaceViewOnClickListenerC1102800enu {
    public DataChannel LL;
    public C1126540fQC LLILLJJLI;
    public long LLILLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
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
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLILLL >= 500) {
            this.LLILLL = jUptimeMillis;
            C955400ayA.LLIFFJFJJ("connection_invite", null, null, null, null, 30);
            C925600aC6.LJIIZILJ(this.LL);
            if (C474650IjP.LIZ() && InterfaceC772600USk.Bf.LIZIZ().booleanValue()) {
                FragmentManager fragmentManagerLJII = C500260Jjc.LJII(this.LL);
                if (fragmentManagerLJII != null) {
                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createTryModeEducationDialogFragment("co_host", new ACListenerS150S0100000_15(this, 285)).show(fragmentManagerLJII, "try_mode_interaction_co_host_sheet");
                    return;
                }
                return;
            }
            FragmentManager fragmentManagerLJII2 = C500260Jjc.LJII(this.LL);
            if (fragmentManagerLJII2 == null) {
                return;
            }
            C19322110iZ.LIZLLL(fragmentManagerLJII2, TryModeCoHostManageSheet.class, "try_mode_co_host_anchor_manage_dialog", null, null);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        boolean zBooleanValue;
        Boolean bool;
        interfaceC1103130eoR.getContext();
        this.LL = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C780690Ujr.class)) != null) {
            zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                ((TextView) interfaceC1103130eoR.findViewById(R.id.y7s)).setText(C497740JfY.LJIJI(2131843401));
                this.LLILLJJLI = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.y74);
            }
        } else {
            zBooleanValue = false;
        }
        C1322110kVd c1322110kVd = (C1322110kVd) interfaceC1103130eoR.findViewById(R.id.l8k);
        if (c1322110kVd != null) {
            if (zBooleanValue) {
                C1126540fQC c1126540fQC = this.LLILLJJLI;
                if (c1126540fQC != null) {
                    c1126540fQC.setImageResource(R.drawable.eo2);
                    return;
                }
                return;
            }
            c1322110kVd.setImageResource(R.drawable.eo2);
        }
    }
}
