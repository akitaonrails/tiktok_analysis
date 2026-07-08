package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156080gBq extends AbstractC1156110gBt {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156080gBq)) {
            return false;
        }
        C1156080gBq c1156080gBq = (C1156080gBq) obj;
        return Intrinsics.LJFF(this.LIZ, c1156080gBq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156080gBq.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Accept(clientRequestId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clientSessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1156110gBt
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C1156080gBq(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
