package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900930ZVz implements C0ZW3 {
    public final C0ZW5 LIZ;
    public final List<InterfaceC900840ZVq> LIZIZ;
    public final List<InterfaceC900840ZVq> LIZJ;
    public final List<InterfaceC900840ZVq> LIZLLL;
    public final C900920ZVy LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900930ZVz)) {
            return false;
        }
        C900930ZVz c900930ZVz = (C900930ZVz) obj;
        return Intrinsics.LJFF(this.LIZ, c900930ZVz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c900930ZVz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c900930ZVz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c900930ZVz.LIZLLL) && Intrinsics.LJFF(this.LJ, c900930ZVz.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HasImage(imageViewData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadingOverlay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", successOverlay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", failOverlay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onClickBasedOnImageLoadingState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZW3
    public final boolean LIZ(C0ZW3 c0zw3) {
        return C0ZW0.LIZ(this, c0zw3);
    }

    @Override // X.C0ZW3
    public final boolean LIZIZ(C0ZW3 c0zw3) {
        return C0ZW0.LIZIZ(this, c0zw3);
    }

    @Override // X.C0ZW3
    public final boolean LIZJ(C0ZW3 c0zw3) {
        return C0ZW0.LIZJ(this, c0zw3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C900930ZVz(C0ZW5 c0zw5, List<? extends InterfaceC900840ZVq> list, List<? extends InterfaceC900840ZVq> list2, List<? extends InterfaceC900840ZVq> list3, C900920ZVy c900920ZVy) {
        this.LIZ = c0zw5;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = c900920ZVy;
    }
}
