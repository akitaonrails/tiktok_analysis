package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.internal.AwS9S0410000_15;

/* JADX INFO: renamed from: X.0aEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927250aEl {
    public Fragment LIZ;
    public IWindowAbility LIZIZ;

    public final Fragment LIZIZ() {
        Fragment fragment;
        Fragment fragment2 = this.LIZ;
        if (fragment2 == null || !fragment2.isAdded() || (fragment = this.LIZ) == null) {
            return null;
        }
        return fragment;
    }

    public final IWindowAbility LIZJ() {
        IWindowAbility iWindowAbility = this.LIZIZ;
        if (iWindowAbility == null) {
            Fragment fragmentLIZIZ = LIZIZ();
            if (fragmentLIZIZ == null || (iWindowAbility = (IWindowAbility) C1555540qa8.LIZIZ(C1558360qeg.LJFF(fragmentLIZIZ, "linkMicScope"), IWindowAbility.class, null)) == null) {
                return null;
            }
            this.LIZIZ = iWindowAbility;
        }
        return iWindowAbility;
    }

    public final void LIZ() {
        IWindowAbility iWindowAbilityLIZJ = LIZJ();
        if (iWindowAbilityLIZJ != null) {
            iWindowAbilityLIZJ.Cc2();
        }
        this.LIZIZ = null;
        Fragment fragmentLIZIZ = LIZIZ();
        if (fragmentLIZIZ != null) {
            C723850SaN.LJIIIIZZ(fragmentLIZIZ, C13LE.LIZ(WindowMaskAssem.class));
            C1555540qa8.LJI(C1558360qeg.LJFF(fragmentLIZIZ, "linkMicScope"), IWindowAbility.class);
        }
    }

    public final void LIZLLL(LiveWidget liveWidget, ViewGroup viewGroup, InterfaceC921620a5g interfaceC921620a5g, boolean z) {
        boolean zLJI = MethodIDManager.LJI(71639);
        Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
        if (fragmentLIZ != null) {
            this.LIZ = fragmentLIZ;
            C723850SaN.LIZ(fragmentLIZ, false, null, new AwS9S0410000_15(fragmentLIZ, z, liveWidget, interfaceC921620a5g, viewGroup, 2), 3);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
