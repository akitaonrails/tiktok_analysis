package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557590qdR {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557590qdR)) {
            return false;
        }
        C1557590qdR c1557590qdR = (C1557590qdR) obj;
        return Intrinsics.LJFF(this.LIZ, c1557590qdR.LIZ) && this.LIZIZ == c1557590qdR.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1557590qdR.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeClientAIChatContext(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isGroup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", peerUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557590qdR(String str, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
    }
}
