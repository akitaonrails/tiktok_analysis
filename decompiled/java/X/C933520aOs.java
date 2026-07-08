package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.MultiGuestGuidenceViewModel;
import com.bytedance.android.live.liveinteract.voicechat.main.anchor.VoiceChatAnchorWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933520aOs {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public IGuidenceAbility LIZJ;
    public C11JF LIZLLL;
    public boolean LJ;
    public final C01GW LJFF = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 952));

    public static void LIZ() {
        C940770aaZ.LIZ().LIZIZ();
        for (AbstractC939840aZ4 abstractC939840aZ4 : (ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.VOICE_NO_GUEST, null)) {
            if (abstractC939840aZ4 instanceof C933730aPD) {
                ((C933730aPD) abstractC939840aZ4).LIZLLL();
            }
        }
    }

    public final void LIZIZ(List<? extends User> list) {
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933460aOm c933460aOm;
        User user;
        MultiGuestGuidenceViewModel viewModel2;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        IGuidenceAbility iGuidenceAbility2 = this.LIZJ;
        if (iGuidenceAbility2 != null && (viewModel = iGuidenceAbility2.getViewModel()) != null && (state = viewModel.getState()) != null && (c933460aOm = state.LL) != null && (user = c933460aOm.LIZ) != null) {
            for (Object obj : (ArrayList) list) {
                if (((User) obj).getId() == user.getId()) {
                    if (obj != null) {
                        if (this.LJ && (iGuidenceAbility = this.LIZJ) != null && (viewModel3 = iGuidenceAbility.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && c933460aOm2.LIZ != null) {
                            this.LJ = false;
                            LIZJ(new C933610aP1(2));
                        }
                        IGuidenceAbility iGuidenceAbility3 = this.LIZJ;
                        if (iGuidenceAbility3 != null && (viewModel2 = iGuidenceAbility3.getViewModel()) != null) {
                            viewModel2.wQ2(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void LIZJ(C933610aP1 c933610aP1) {
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933690aP9 c933690aP9;
        IGuidenceAbility iGuidenceAbility2;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state2;
        C933460aOm c933460aOm;
        if (c933610aP1 != null && (iGuidenceAbility = this.LIZJ) != null && (viewModel = iGuidenceAbility.getViewModel()) != null && (state = viewModel.getState()) != null && (c933690aP9 = state.LLILLJJLI) != null && (iGuidenceAbility2 = this.LIZJ) != null && (viewModel2 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel2.getState()) != null && (c933460aOm = state2.LL) != null) {
            C931740aM0.LIZ(8, c933690aP9.LIZ, c933460aOm.LIZIZ, String.valueOf(c933610aP1.LIZ), c933460aOm.LIZ, false, null);
        }
    }

    public C933520aOs(VoiceChatAnchorWidget voiceChatAnchorWidget, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = voiceChatAnchorWidget;
    }

    public final void LIZLLL(int i, Long l) {
        Long lValueOf;
        MultiGuestGuidenceViewModel viewModel;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state;
        C933460aOm c933460aOm;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        User user;
        if (l != null) {
            IGuidenceAbility iGuidenceAbility2 = this.LIZJ;
            if (iGuidenceAbility2 != null && (viewModel3 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && (user = c933460aOm2.LIZ) != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(lValueOf, l)) {
                if (this.LJ && (iGuidenceAbility = this.LIZJ) != null && (viewModel2 = iGuidenceAbility.getViewModel()) != null && (state = viewModel2.getState()) != null && (c933460aOm = state.LL) != null && c933460aOm.LIZ != null) {
                    this.LJ = false;
                    LIZJ(new C933610aP1(i));
                }
                IGuidenceAbility iGuidenceAbility3 = this.LIZJ;
                if (iGuidenceAbility3 != null && (viewModel = iGuidenceAbility3.getViewModel()) != null) {
                    viewModel.wQ2(null);
                }
            }
        }
    }
}
