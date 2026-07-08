package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777920wMo {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777920wMo)) {
            return false;
        }
        C1777920wMo c1777920wMo = (C1777920wMo) obj;
        return this.LIZ == c1777920wMo.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777920wMo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777920wMo.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarButtonActionSpec(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buttonType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777920wMo(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
