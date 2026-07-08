package X;

import Y.ACListenerS142S0100000_7;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel.TryModeMultiGuestAnchorManageSheet;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ims, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476800Ims implements InterfaceViewOnClickListenerC1102800enu {
    public long LL = -1;
    public DataChannel LLILLJJLI;

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
    public final boolean f1() {
        return C500260Jjc.LJIIZILJ(this.LLILLJJLI);
    }

    public final void LIZ() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("ToolbarTryModeMultiGuestBehavior", "showTryModeMultiGuestAnchorManageDialog");
        if (C464790IKn.LIZ.LIZIZ(this.LL)) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LJI("ToolbarTryModeMultiGuestBehavior", "tryModeMultiGuestAnchorManageSheetOpened, so return");
            return;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        FragmentManager fragmentManager = dataChannel != null ? (FragmentManager) dataChannel.gg0(C748880TZe.class) : null;
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        this.LL = C19322110iZ.LIZLLL(fragmentManager, TryModeMultiGuestAnchorManageSheet.class, "try_mode_multi_guest_anchor_manage_dialog", sheetOptions, null);
        C0KX4.LIZ("livesdk_trymode_anchor_guest_connection_entrance_click", C474710IjV.LIZ(), null, true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick, showTryModeNewAnchor=");
        sbLIZ.append(C474650IjP.LIZ());
        sbLIZ.append(", TRY_MODE_MULTI_GUEST_WEBP_SHOW=");
        C20337914i1<Boolean> c20337914i1 = InterfaceC772600USk.Cf;
        sbLIZ.append(c20337914i1.LIZIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("ToolbarTryModeMultiGuestBehavior", strLIZIZ);
        if (C474650IjP.LIZ() && c20337914i1.LIZIZ().booleanValue()) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LJI("ToolbarTryModeMultiGuestBehavior", "show educationSheetFragment");
            LiveDialogFragment liveDialogFragmentCreateTryModeEducationDialogFragment = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createTryModeEducationDialogFragment("multi_guest", new ACListenerS142S0100000_7(this, 317));
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                liveDialogFragmentCreateTryModeEducationDialogFragment.show(fragmentManager, "try_mode_education_multi_guest_sheet");
                return;
            }
            return;
        }
        LIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("ToolbarTryModeMultiGuestBehavior", "onLoad");
        this.LLILLJJLI = dataChannel;
        C1322110kVd c1322110kVd = (C1322110kVd) interfaceC1103130eoR.findViewById(R.id.l8k);
        if (c1322110kVd != null) {
            c1322110kVd.setImageResource(R.drawable.eo_);
        }
    }
}
