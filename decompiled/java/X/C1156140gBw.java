package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156140gBw extends AbstractC1156110gBt {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156140gBw)) {
            return false;
        }
        C1156140gBw c1156140gBw = (C1156140gBw) obj;
        return Intrinsics.LJFF(this.LIZ, c1156140gBw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156140gBw.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartCallAck(clientRequestId=");
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

    public C1156140gBw(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
