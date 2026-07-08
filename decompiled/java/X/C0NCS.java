package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NCS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCS {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NCS)) {
            return false;
        }
        C0NCS c0ncs = (C0NCS) obj;
        return Intrinsics.LJFF(this.LIZ, c0ncs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ncs.LIZIZ) && this.LIZJ == c0ncs.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerCustomConfig(vodTag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", vodSceneTag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enablePlayByPageVisibility=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NCS(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
