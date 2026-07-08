package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092720eXe {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public C1092720eXe() {
        this("", "", 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092720eXe)) {
            return false;
        }
        C1092720eXe c1092720eXe = (C1092720eXe) obj;
        return Intrinsics.LJFF(this.LIZ, c1092720eXe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1092720eXe.LIZIZ) && this.LIZJ == c1092720eXe.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectResource(fileName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fileGeckoChannel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1092720eXe(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
