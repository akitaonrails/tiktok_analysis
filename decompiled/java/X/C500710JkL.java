package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500710JkL implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public final /* synthetic */ C500730JkN LL;

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

    public final void LIZ() {
        C500730JkN c500730JkN = this.LL;
        int i = !C0W78.LJFF(c500730JkN.LL.getActivity()) ? 1 : 0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_float_window_red_dot_click");
        c474500IjALIZ.LJJII(c500730JkN.LLIZLLLIL.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_red_dot");
        c474500IjALIZ.LJJII("overlay_permission", "type");
        c474500IjALIZ.LIZ();
        C500730JkN c500730JkN2 = this.LL;
        c500730JkN2.LLILZ = "float_window_setting";
        C500260Jjc.LJJJJJ(c500730JkN2.LL, null, new C500700JkK(c500730JkN2, null), 3);
    }

    public C500710JkL(C500730JkN c500730JkN) {
        this.LL = c500730JkN;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LIZ();
    }

    public final void LIZJ(View view, C16F5 c16f5) {
        boolean z = !C0W78.LJFF(this.LL.LL.getActivity());
        C500260Jjc.LJLJLJ(view, z);
        if (z) {
            C500730JkN c500730JkN = this.LL;
            c500730JkN.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_float_window_red_dot_show");
            c474500IjALIZ.LJJII(c500730JkN.LLIZLLLIL.getValue(), "anchor_id");
            c474500IjALIZ.LJJII("overlay_permission", "type");
            c474500IjALIZ.LIZ();
        }
        String strLJIJI = C497740JfY.LJIJI(2131842182);
        if (c16f5 != null) {
            c16f5.setText(strLJIJI);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LIZJ(interfaceC1103130eoR.findViewById(R.id.y7r), (C16F5) interfaceC1103130eoR.findViewById(R.id.y7t));
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        View view = c499640Jic.LIZ;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        LIZJ(c499640Jic.LJFF, c499640Jic.LIZJ);
        View view2 = c499640Jic.LIZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS111S0200000_7(this, dataChannel, 33), view2);
        }
    }
}
