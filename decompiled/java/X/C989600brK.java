package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989600brK extends AbstractC991850bux {
    public final C1009100cMm LIZ;
    public final Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989600brK)) {
            return false;
        }
        C989600brK c989600brK = (C989600brK) obj;
        return Intrinsics.LJFF(this.LIZ, c989600brK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c989600brK.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessComponentAppear(componentAppearModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotIdList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989600brK(C1009100cMm c1009100cMm, Set<String> set) {
        this.LIZ = c1009100cMm;
        this.LIZIZ = set;
    }
}
