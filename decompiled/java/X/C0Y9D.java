package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9D {
    public final String LIZ;
    public final List<C0Y8T> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y9D)) {
            return false;
        }
        C0Y9D c0y9d = (C0Y9D) obj;
        return Intrinsics.LJFF(this.LIZ, c0y9d.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0y9d.LIZIZ) && this.LIZJ == c0y9d.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestQueryResult(originQueryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y9D(String str, boolean z, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
    }
}
