package X;

import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362170lYF {
    public final C1362190lYH LIZ;
    public final InterfaceC1362400lYc LIZIZ;
    public final SharePackage LIZJ;
    public final C1362380lYa LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362170lYF)) {
            return false;
        }
        C1362170lYF c1362170lYF = (C1362170lYF) obj;
        return Intrinsics.LJFF(this.LIZ, c1362170lYF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1362170lYF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1362170lYF.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1362170lYF.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C1362380lYa c1362380lYa = this.LIZLLL;
        return iHashCode + (c1362380lYa == null ? 0 : c1362380lYa.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemStateContext(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stateQuery=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sharePackage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", initExtras=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1362170lYF(C1362190lYH c1362190lYH, ShareContactListViewModel shareContactListViewModel, SharePackage sharePackage, C1362380lYa c1362380lYa) {
        this.LIZ = c1362190lYH;
        this.LIZIZ = shareContactListViewModel;
        this.LIZJ = sharePackage;
        this.LIZLLL = c1362380lYa;
    }
}
