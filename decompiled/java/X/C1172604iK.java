package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1172604iK extends AbstractC1172504iJ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172604iK)) {
            return false;
        }
        C1172604iK c1172604iK = (C1172604iK) obj;
        return Intrinsics.LJFF(this.LIZ, c1172604iK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1172604iK.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AfterUpdate(draftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1172604iK(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
