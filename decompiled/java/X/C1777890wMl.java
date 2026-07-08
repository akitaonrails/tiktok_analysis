package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0wMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777890wMl implements InterfaceC1806790x7N {
    public final IapListResult.ActivityInfo LIZ;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777890wMl) && Intrinsics.LJFF(this.LIZ, ((C1777890wMl) obj).LIZ);
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 3;
    }

    public final int hashCode() {
        IapListResult.ActivityInfo activityInfo = this.LIZ;
        if (activityInfo == null) {
            return 0;
        }
        return activityInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletActivityBannerItemData(activityInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777890wMl(IapListResult.ActivityInfo activityInfo) {
        this.LIZ = activityInfo;
    }
}
