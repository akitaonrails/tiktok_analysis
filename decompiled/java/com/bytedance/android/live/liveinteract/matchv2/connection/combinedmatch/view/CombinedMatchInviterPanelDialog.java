package com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.view;

import X.C01GW;
import X.C1091700eW0;
import X.C1397510mTF;
import X.C1911200zpm;
import X.C19EH;
import X.C20441214yg;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C978100bYm;
import X.C979690bbL;
import X.InterfaceC978780bZs;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.coordinator.CombinedMatchInviterPanelDismissEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CombinedMatchInviterPanelDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCHELIOSwjJ2EwJyguICE2LCgtPSw7ZjMlLDh9CyohKyY9LSEBKDswIAwiPyYnLTccKCE2JAElKCM8Lw==";
    public final C978100bYm LLJLLL;
    public Integer LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 143));
    public boolean LLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void nS() {
        this.LLL = true;
        super.nS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        this.LLL = true;
        C1911200zpm.LIZIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        super.onDestroy();
        C979690bbL c979690bbL = this.LLJLLL.LJIIIZ;
        if (c979690bbL == null || (weakReference = c979690bbL.LIZ) == null || (interfaceC978780bZs = weakReference.get()) == null) {
            return;
        }
        interfaceC978780bZs.LIZIZ(this.LLL);
    }

    public CombinedMatchInviterPanelDialog(C978100bYm c978100bYm) {
        this.LLJLLL = c978100bYm;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C497740JfY.LIZLLL(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.dimBehindType = this.LLJLLL.LJIILL ? 1 : 0;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        DataChannel dataChannel;
        if (i == 4) {
            this.LLL = true;
        }
        CombinedMatchInviterFragment combinedMatchInviterFragment = (CombinedMatchInviterFragment) this.LLJZIJLIL.getValue();
        boolean z = this.LLL;
        combinedMatchInviterFragment.getClass();
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", "onParentContainerDismiss");
        if (combinedMatchInviterFragment.LLJJI && !combinedMatchInviterFragment.LLJJ && (dataChannel = combinedMatchInviterFragment.LLIZ) != null) {
            dataChannel.LC0(CombinedMatchInviterPanelDismissEvent.class, Boolean.TRUE);
        }
        combinedMatchInviterFragment.LLJJI = true;
        C1397510mTF c1397510mTF = combinedMatchInviterFragment.LLJILJILJ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        InteractDisconnectDialog interactDisconnectDialog = combinedMatchInviterFragment.LLJILLL;
        if (interactDisconnectDialog != null) {
            interactDisconnectDialog.dismiss();
        }
        if (z && combinedMatchInviterFragment.LLJJIJI) {
            combinedMatchInviterFragment.PR();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        super.onViewCreated(view, bundle);
        Integer num = this.LLJZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(iIntValue, (Fragment) this.LLJZIJLIL.getValue());
            c19ehLJIIJ.LJIIJ();
        }
        C979690bbL c979690bbL = this.LLJLLL.LJIIIZ;
        if (c979690bbL != null && (weakReference = c979690bbL.LIZ) != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(View.generateViewId());
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -2));
        this.LLJZ = Integer.valueOf(c1091700eW0.getId());
        return c1091700eW0;
    }
}
