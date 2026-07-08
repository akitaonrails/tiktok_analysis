package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362160lYE {
    public final Fragment LIZ;
    public final SharePackage LIZIZ;
    public final String LIZJ;
    public final List<InterfaceC1369790lkX> LIZLLL;
    public final InterfaceC1362600lYw LJ;
    public final ShareContactListViewModel LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362160lYE)) {
            return false;
        }
        C1362160lYE c1362160lYE = (C1362160lYE) obj;
        return Intrinsics.LJFF(this.LIZ, c1362160lYE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1362160lYE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1362160lYE.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1362160lYE.LIZLLL) && Intrinsics.LJFF(this.LJ, c1362160lYE.LJ) && Intrinsics.LJFF(this.LJFF, c1362160lYE.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        SharePackage sharePackage = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (sharePackage == null ? 0 : sharePackage.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        InterfaceC1362600lYw interfaceC1362600lYw = this.LJ;
        return ((iHashCode2 + (interfaceC1362600lYw != null ? interfaceC1362600lYw.hashCode() : 0)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickHandlerContext(fragment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sharePackage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", channelList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imShareCallback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", contactListVM=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1362160lYE(Fragment fragment, SharePackage sharePackage, String str, List<? extends InterfaceC1369790lkX> list, InterfaceC1362600lYw interfaceC1362600lYw, ShareContactListViewModel shareContactListViewModel) {
        this.LIZ = fragment;
        this.LIZIZ = sharePackage;
        this.LIZJ = str;
        this.LIZLLL = list;
        this.LJ = interfaceC1362600lYw;
        this.LJFF = shareContactListViewModel;
    }
}
