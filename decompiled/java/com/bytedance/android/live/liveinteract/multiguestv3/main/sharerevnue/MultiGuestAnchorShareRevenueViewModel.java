package com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue;

import X.C1770850wBP;
import X.C2188811AlT;
import X.C916490ZxP;
import X.C916740Zxo;
import X.C917750ZzR;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.InterfaceC938950aXd;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAnchorShareRevenueViewModel extends AssemViewModel<C916740Zxo> implements InterfaceC938950aXd {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ4;
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        Long lValueOf = null;
        Integer numValueOf = (multiGuestDataHolderLIZJ == null || (multiLiveAnchorPanelSettingsLIZIZ4 = multiGuestDataHolderLIZJ.LIZIZ()) == null) ? null : Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ4.LIZ);
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
        Integer numValueOf2 = (multiGuestDataHolderLIZJ2 == null || (multiLiveAnchorPanelSettingsLIZIZ3 = multiGuestDataHolderLIZJ2.LIZIZ()) == null) ? null : Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ3.LIZIZ);
        MultiGuestDataHolder multiGuestDataHolderLIZJ3 = C916490ZxP.LIZJ();
        Boolean boolValueOf = (multiGuestDataHolderLIZJ3 == null || (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ3.LIZIZ()) == null) ? null : Boolean.valueOf(multiLiveAnchorPanelSettingsLIZIZ2.LIZJ);
        MultiGuestDataHolder multiGuestDataHolderLIZJ4 = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ4 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ4.LIZIZ()) != null) {
            lValueOf = Long.valueOf(multiLiveAnchorPanelSettingsLIZIZ.multiGuestShareRevenueInfoVersion);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestAnchorShareRevenueViewModel#defaultState revenueShare:");
        sbLIZ.append(numValueOf);
        sbLIZ.append(" revenueShareRatio:");
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" enableSettingRatio:");
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" revenueSettingVersion: ");
        sbLIZ.append(lValueOf);
        C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return new C916740Zxo(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, boolValueOf != null ? boolValueOf.booleanValue() : false, lValueOf != null ? lValueOf.longValue() : 0L);
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        C917750ZzR.LJII("MultiGuestAnchorShareRevenueViewModel#onDestroy");
        C917750ZzR.LJII("MultiGuestRevenueShareSettingHelper#clearSnapshotData");
        C917750ZzR.LIZIZ = null;
        C917750ZzR.LIZ = null;
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        C917750ZzR.LJII("MultiGuestAnchorShareRevenueViewModel#onCreate");
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(false);
        c1770850wBP.LIZ = false;
        AssemViewModel.subscribe$default(this, this, c1770850wBP, null, AFwS250S0000000_15.get$arr$(57), 4, null);
    }

    public static void vQ2(MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel, LifecycleOwner lifecycleOwner, Function1 function1) {
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(false);
        c1770850wBP.LIZ = false;
        AssemViewModel.subscribe$default(multiGuestAnchorShareRevenueViewModel, lifecycleOwner, c1770850wBP, null, function1, 4, null);
    }
}
