package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence;

import X.C1338270kvh;
import X.C1770850wBP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C933460aOm;
import X.C933610aP1;
import X.C933680aP8;
import X.C933690aP9;
import X.InterfaceC0148002o;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC938950aXd;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS123S0101000_15;
import kotlin.jvm.internal.AwS29S0001000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestGuidenceViewModel extends AssemViewModel<C933680aP8> implements InterfaceC938950aXd {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        throw null;
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        throw null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C933680aP8(null, null, null);
    }

    public final void wQ2(C933460aOm c933460aOm) {
        C933460aOm c933460aOm2;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestGuidenceViewModel_updateGuidenceUser user:");
        Long lValueOf = null;
        if (c933460aOm != null && (user = c933460aOm.LIZ) != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
        if (c933460aOm == null && ((c933460aOm2 = getState().LL) == null || c933460aOm2.LIZ == null)) {
            return;
        }
        setState(new AwS594S0100000_15(c933460aOm, 200));
    }

    public final void yQ2(int i) {
        C933690aP9 c933690aP9 = getState().LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestGuidenceViewModel_updateShowInfo pos: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
        if (c933690aP9 != null && c933690aP9.LIZ != i) {
            setState(new AwS123S0101000_15(i, c933690aP9, 1));
        }
    }

    public final void zQ2(C933690aP9 c933690aP9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestGuidenceViewModel_updateShowInfo showInfo:");
        sbLIZ.append(c933690aP9);
        C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c933690aP9, getState().LLILLJJLI)) {
            return;
        }
        setState(new AwS594S0100000_15(c933690aP9, 201));
    }

    public final void xQ2(int i, boolean z) {
        C933610aP1 c933610aP1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestGuidenceViewModel_updateHideInfo closeType:");
        sbLIZ.append(i);
        sbLIZ.append(" forceUpdate:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
        if (!z && (c933610aP1 = getState().LLILLL) != null && i == c933610aP1.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiGuestGuidenceViewModel_updateHideInfo closeType:");
            sbLIZ2.append(i);
            C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        setState(new AwS29S0001000_15(i, 0));
    }

    public static void vQ2(MultiGuestGuidenceViewModel multiGuestGuidenceViewModel, InterfaceC2217241BqE interfaceC2217241BqE, LifecycleOwner lifecycleOwner, Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select state Subscribe [");
        sbLIZ.append(interfaceC2217241BqE);
        sbLIZ.append("] ");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(true);
        c1770850wBP.LIZ = true;
        AssemViewModel.selectSubscribe$default(multiGuestGuidenceViewModel, interfaceC2217241BqE, c1770850wBP, lifecycleOwner, null, function1, 8, null);
    }
}
