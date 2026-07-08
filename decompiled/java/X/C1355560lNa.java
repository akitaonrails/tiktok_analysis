package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355560lNa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1355560lNa)) {
            return false;
        }
        C1355560lNa c1355560lNa = (C1355560lNa) obj;
        return Intrinsics.LJFF(this.LIZ, c1355560lNa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1355560lNa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1355560lNa.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoinDescriptionContentModel(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", learnMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1355560lNa(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
