package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0axm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955160axm extends AbstractC955360ay6 {
    public final EnumC965730bEp LIZ;
    public final EnumC965730bEp LIZIZ;
    public final C955230axt LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955160axm)) {
            return false;
        }
        C955160axm c955160axm = (C955160axm) obj;
        return this.LIZ == c955160axm.LIZ && this.LIZIZ == c955160axm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c955160axm.LIZJ);
    }

    public final int hashCode() {
        EnumC965730bEp enumC965730bEp = this.LIZ;
        int iHashCode = (enumC965730bEp == null ? 0 : enumC965730bEp.hashCode()) * 31;
        EnumC965730bEp enumC965730bEp2 = this.LIZIZ;
        return ((iHashCode + (enumC965730bEp2 != null ? enumC965730bEp2.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutArchChange(new=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", old=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955160axm(EnumC965730bEp enumC965730bEp, EnumC965730bEp enumC965730bEp2, C955230axt c955230axt) {
        this.LIZ = enumC965730bEp;
        this.LIZIZ = enumC965730bEp2;
        this.LIZJ = c955230axt;
    }
}
