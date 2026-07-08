package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746510TQb {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C746510TQb)) {
            return false;
        }
        C746510TQb c746510TQb = (C746510TQb) obj;
        return this.LIZ == c746510TQb.LIZ && Intrinsics.LJFF(this.LIZIZ, c746510TQb.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BenefitDetail(iconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C746510TQb(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
