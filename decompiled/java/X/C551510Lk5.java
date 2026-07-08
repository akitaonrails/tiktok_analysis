package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551510Lk5 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551510Lk5)) {
            return false;
        }
        C551510Lk5 c551510Lk5 = (C551510Lk5) obj;
        return Intrinsics.LJFF(this.LIZ, c551510Lk5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c551510Lk5.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowLink(from=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", to=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551510Lk5(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
