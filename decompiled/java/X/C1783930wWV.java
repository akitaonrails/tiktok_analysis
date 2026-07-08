package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783930wWV {
    public final String LIZ;
    public final C1783920wWU LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1783930wWV)) {
            return false;
        }
        C1783930wWV c1783930wWV = (C1783930wWV) obj;
        return Intrinsics.LJFF(this.LIZ, c1783930wWV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1783930wWV.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxPreloadArtifacts(initData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1783930wWV(String str, C1783920wWU c1783920wWU) {
        this.LIZ = str;
        this.LIZIZ = c1783920wWU;
    }
}
