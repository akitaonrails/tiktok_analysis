package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00bT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C110900bT {
    public final Class<? extends InterfaceC547540Ldg> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C110900bT)) {
            return false;
        }
        C110900bT c110900bT = (C110900bT) obj;
        return Intrinsics.LJFF(this.LIZ, c110900bT.LIZ) && this.LIZIZ == c110900bT.LIZIZ && Intrinsics.LJFF(this.LIZJ, c110900bT.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcConfigRegistrarSpiEntry(serviceType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isDynamicFeature=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dynamicFeatureImplClassName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C110900bT(Class cls, String str, boolean z) {
        this.LIZ = cls;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
