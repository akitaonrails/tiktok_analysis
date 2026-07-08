package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556010LrL {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C556010LrL)) {
            return false;
        }
        C556010LrL c556010LrL = (C556010LrL) obj;
        return Intrinsics.LJFF(this.LIZ, c556010LrL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c556010LrL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c556010LrL.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NodeMeta(nodeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nodeName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", etNodeName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C556010LrL(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
