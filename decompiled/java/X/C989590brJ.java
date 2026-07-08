package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989590brJ extends AbstractC991610buZ {
    public final C1009100cMm LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989590brJ) && Intrinsics.LJFF(this.LIZ, ((C989590brJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessComponentAppear(componentAppearModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989590brJ(C1009100cMm c1009100cMm) {
        this.LIZ = c1009100cMm;
    }
}
