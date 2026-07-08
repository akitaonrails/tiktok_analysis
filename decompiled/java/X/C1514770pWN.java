package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514770pWN {
    public final String LIZ;
    public final EnumC1520910pgH LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1514770pWN)) {
            return false;
        }
        C1514770pWN c1514770pWN = (C1514770pWN) obj;
        return Intrinsics.LJFF(this.LIZ, c1514770pWN.LIZ) && this.LIZIZ == c1514770pWN.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1514770pWN.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewMeta(containerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", viewEngineType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1514770pWN(String str, EnumC1520910pgH enumC1520910pgH, String str2) {
        this.LIZ = str;
        this.LIZIZ = enumC1520910pgH;
        this.LIZJ = str2;
    }
}
