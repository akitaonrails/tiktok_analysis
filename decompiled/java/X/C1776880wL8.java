package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776880wL8 {
    public String LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776880wL8)) {
            return false;
        }
        C1776880wL8 c1776880wL8 = (C1776880wL8) obj;
        return Intrinsics.LJFF(this.LIZ, c1776880wL8.LIZ) && Float.compare(this.LIZIZ, c1776880wL8.LIZIZ) == 0 && this.LIZJ == c1776880wL8.LIZJ && this.LIZLLL == c1776880wL8.LIZLLL && this.LJ == c1776880wL8.LJ && this.LJFF == c1776880wL8.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposeExposureConfig(itemId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', exposurePercent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exposureTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", repeatItemInPage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", repeatPageShow=");
        sbLIZ.append(this.LJ);
        sbLIZ.append("，dataChangeExposure=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776880wL8(String str, float f, int i, boolean z, boolean z2, int i2) {
        f = (i2 & 2) != 0 ? 0.5f : f;
        i = (i2 & 4) != 0 ? 500 : i;
        z = (i2 & 8) != 0 ? false : z;
        z2 = (i2 & 16) != 0 ? false : z2;
        boolean z3 = (i2 & 32) != 0;
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
