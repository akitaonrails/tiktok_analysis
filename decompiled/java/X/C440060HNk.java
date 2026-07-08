package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440060HNk implements InterfaceC440050HNj {
    public final String LIZ = null;
    public final String LIZIZ = null;
    public final String LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440060HNk)) {
            return false;
        }
        C440060HNk c440060HNk = (C440060HNk) obj;
        return Intrinsics.LJFF(this.LIZ, c440060HNk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c440060HNk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c440060HNk.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageElement(deviceImageAbsolutePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deviceImageLocalPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onlineImagePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
