package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517360KQs {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C517360KQs)) {
            return false;
        }
        C517360KQs c517360KQs = (C517360KQs) obj;
        return Intrinsics.LJFF(this.LIZ, c517360KQs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c517360KQs.LIZIZ) && this.LIZJ == c517360KQs.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parts(symbol=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", amountText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSuffix=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C517360KQs(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
