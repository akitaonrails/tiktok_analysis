package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZA {
    public final EnumC1799930wwJ LIZ;
    public final String LIZIZ;
    public final C07Z4 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZA)) {
            return false;
        }
        C07ZA c07za = (C07ZA) obj;
        return this.LIZ == c07za.LIZ && Intrinsics.LJFF(this.LIZIZ, c07za.LIZIZ) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LIZJ, c07za.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31 * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitMission(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reward=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", cta=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZA(EnumC1799930wwJ enumC1799930wwJ, String str, C07Z4 c07z4) {
        this.LIZ = enumC1799930wwJ;
        this.LIZIZ = str;
        this.LIZJ = c07z4;
    }
}
