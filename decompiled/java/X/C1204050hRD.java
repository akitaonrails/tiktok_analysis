package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.nearby.container.NearbyFragment;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1204050hRD implements Observer, InterfaceC1635506an {
    public final /* synthetic */ NearbyFragment LL;

    public C1204050hRD(NearbyFragment nearbyFragment) {
        this.LL = nearbyFragment;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, NearbyFragment.class, "onRegionChange", "onRegionChange(Lcom/ss/android/ugc/nearby/roaming/RoamingLocationInfo;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        RoamingLocationInfo roamingLocationInfo = (RoamingLocationInfo) obj;
        NearbyFragment nearbyFragment = this.LL;
        nearbyFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFragment onRegionChange: ");
        sbLIZ.append(roamingLocationInfo.manualRegionName);
        C2188811AlT.LIZIZ(sbLIZ);
        NearbyContainerViewModel nearbyContainerViewModelWR = nearbyFragment.WR();
        C1203730hQh.LIZ.getClass();
        C1203960hR4 c1203960hR4 = C1203730hQh.LIZLLL;
        String str2 = roamingLocationInfo.manualRegion;
        RoamingLocationInfo roamingLocationInfo2 = nearbyContainerViewModelWR.LLILLJJLI;
        if (roamingLocationInfo2 != null) {
            str = roamingLocationInfo2.manualRegion;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str2, str)) {
            nearbyContainerViewModelWR.LLILLJJLI = roamingLocationInfo;
            nearbyContainerViewModelWR.DQ2(c1203960hR4);
        }
    }
}
