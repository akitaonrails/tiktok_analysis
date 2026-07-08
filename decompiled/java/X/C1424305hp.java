package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1424305hp {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1424305hp)) {
            return false;
        }
        C1424305hp c1424305hp = (C1424305hp) obj;
        return Intrinsics.LJFF(this.LIZ, c1424305hp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1424305hp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1424305hp.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadableEntry(effectId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sdkExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1424305hp(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
