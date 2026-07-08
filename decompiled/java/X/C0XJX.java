package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XJX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJX {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0XJX)) {
            return false;
        }
        C0XJX c0xjx = (C0XJX) obj;
        return Intrinsics.LJFF(this.LIZ, c0xjx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0xjx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0xjx.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppInstallTarget(appname=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pkgName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scheme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XJX(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
