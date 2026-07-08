package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868550yiz {
    public final C1868540yiy LIZ;
    public final C1867980yi4 LIZIZ;
    public final C19306410g2 LIZJ;

    public C1868550yiz() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868550yiz)) {
            return false;
        }
        C1868550yiz c1868550yiz = (C1868550yiz) obj;
        return Intrinsics.LJFF(this.LIZ, c1868550yiz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868550yiz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1868550yiz.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedLoginPanelConfig(loginPanelCommonConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sotlInitConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sotlPanelConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868550yiz(C1868540yiy c1868540yiy, int i) {
        C1867980yi4 c1867980yi4;
        c1868540yiy = (i & 1) != 0 ? new C1868540yiy(null, 7) : c1868540yiy;
        int i2 = 0;
        if ((i & 2) != 0) {
            c1867980yi4 = new C1867980yi4(0);
        } else {
            c1867980yi4 = null;
        }
        C19306410g2 c19306410g2 = (i & 4) != 0 ? new C19306410g2(i2) : null;
        this.LIZ = c1868540yiy;
        this.LIZIZ = c1867980yi4;
        this.LIZJ = c19306410g2;
    }
}
