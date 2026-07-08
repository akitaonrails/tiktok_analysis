package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1172404iI extends AbstractC1172504iJ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1172404iI) && Intrinsics.LJFF(this.LIZ, ((C1172404iI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AfterSave(draftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1172404iI(String str) {
        this.LIZ = str;
    }
}
