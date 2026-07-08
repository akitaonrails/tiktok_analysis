package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555620qaG extends C723430SZh {
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555620qaG) && Intrinsics.LJFF(this.LIZJ, ((C1555620qaG) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateVScopeInstanceEventParams(type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555620qaG(String str) {
        this.LIZJ = str;
    }
}
