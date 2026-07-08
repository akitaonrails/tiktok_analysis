package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Y9 implements C07ZG {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Y9)) {
            return false;
        }
        C07Y9 c07y9 = (C07Y9) obj;
        return Intrinsics.LJFF(this.LIZ, c07y9.LIZ) && this.LIZIZ == c07y9.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Finished(workflowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", happenTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C07ZG
    public final String LIZ() {
        return this.LIZ;
    }

    public C07Y9(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
