package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248401CzO extends C2248431CzR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2248401CzO)) {
            return false;
        }
        C2248401CzO c2248401CzO = (C2248401CzO) obj;
        return Intrinsics.LJFF(this.LIZ, c2248401CzO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2248401CzO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2248401CzO.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxFontResource(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", token=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2248401CzO(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
