package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382120EyY {
    public final String LIZ;
    public final EnumC381990EyL LIZIZ;
    public final String LIZJ;

    public C382120EyY() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382120EyY)) {
            return false;
        }
        C382120EyY c382120EyY = (C382120EyY) obj;
        return Intrinsics.LJFF(this.LIZ, c382120EyY.LIZ) && this.LIZIZ == c382120EyY.LIZIZ && Intrinsics.LJFF(this.LIZJ, c382120EyY.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIInputItem(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382120EyY(String str, EnumC381990EyL enumC381990EyL, int i) {
        str = (i & 1) != 0 ? "" : str;
        enumC381990EyL = (i & 2) != 0 ? EnumC381990EyL.IMAGE : enumC381990EyL;
        this.LIZ = str;
        this.LIZIZ = enumC381990EyL;
        this.LIZJ = null;
    }
}
