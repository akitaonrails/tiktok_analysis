package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K1C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1C {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K1C)) {
            return false;
        }
        C0K1C c0k1c = (C0K1C) obj;
        return Intrinsics.LJFF(this.LIZ, c0k1c.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k1c.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k1c.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BadgeItemInfo(bgStartColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bgEndColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strokeColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K1C(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
