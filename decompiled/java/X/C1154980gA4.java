package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gA4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154980gA4 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C1154980gA4() {
        this(null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154980gA4)) {
            return false;
        }
        C1154980gA4 c1154980gA4 = (C1154980gA4) obj;
        return Intrinsics.LJFF(this.LIZ, c1154980gA4.LIZ) && this.LIZIZ == c1154980gA4.LIZIZ && this.LIZJ == c1154980gA4.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HomeSidebarOpenParams(entranceFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showFirstMinisGuide=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showFeedSidebarGuide=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154980gA4(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
