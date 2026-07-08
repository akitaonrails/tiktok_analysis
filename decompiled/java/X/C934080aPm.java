package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.GuestInviteViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0aPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934080aPm {
    public final AbstractC939840aZ4 LIZ;
    public final DataChannel LIZIZ;
    public IGuestInviteAbility LIZJ;
    public View LIZLLL;
    public View LJ;
    public ViewGroup LJFF;

    public final void LIZIZ() {
        IGuestInviteAbility iGuestInviteAbility;
        GuestInviteViewModel viewModel;
        GuestInviteViewModel viewModel2;
        IGuestInviteAbility iGuestInviteAbility2 = this.LIZJ;
        if (iGuestInviteAbility2 != null && (viewModel2 = iGuestInviteAbility2.getViewModel()) != null) {
            viewModel2.setState(AFwS250S0000000_15.get$arr$(3));
        }
        if (!C925790aCP.LIZ() || (iGuestInviteAbility = this.LIZJ) == null || (viewModel = iGuestInviteAbility.getViewModel()) == null) {
            return;
        }
        viewModel.AQ2(null, "empty_spot_guide");
    }

    public C934080aPm(AbstractC939840aZ4 abstractC939840aZ4, DataChannel dataChannel) {
        this.LIZ = abstractC939840aZ4;
        this.LIZIZ = dataChannel;
    }

    public final void LIZ(int i, int i2, User user, String str, String str2) {
        long id;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick, action=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("GuestInviteGuide", C2188811AlT.LIZIZ(sbLIZ));
        C943990afl.LIZ().LIZ("multi_guest_apply_page", "empty_mask");
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        C931740aM0.LJIIJ(C933710aPB.LJ(this.LIZ.getWindow().getPosIdentity()), "click", id, i, str, str2);
        C0JGU.LIZ(null);
    }
}
