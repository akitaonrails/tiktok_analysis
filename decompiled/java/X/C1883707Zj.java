package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883707Zj {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883707Zj)) {
            return false;
        }
        C1883707Zj c1883707Zj = (C1883707Zj) obj;
        return Intrinsics.LJFF(this.LIZ, c1883707Zj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1883707Zj.LIZIZ) && this.LIZJ == c1883707Zj.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedLocation(locationStr=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mobErrCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1883707Zj(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
