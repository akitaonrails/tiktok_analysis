package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777900wMm implements InterfaceC1806790x7N {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777900wMm)) {
            return false;
        }
        C1777900wMm c1777900wMm = (C1777900wMm) obj;
        return Intrinsics.LJFF(this.LIZ, c1777900wMm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777900wMm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777900wMm.LIZJ);
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 12;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoinDescriptionContentData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", learnMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777900wMm(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
