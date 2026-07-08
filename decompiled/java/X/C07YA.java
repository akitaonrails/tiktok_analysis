package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YA implements C07ZG {
    public final String LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07YA)) {
            return false;
        }
        C07YA c07ya = (C07YA) obj;
        return Intrinsics.LJFF(this.LIZ, c07ya.LIZ) && this.LIZIZ == c07ya.LIZIZ && this.LIZJ == c07ya.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Started(workflowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", happenTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isRestore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C07ZG
    public final String LIZ() {
        return this.LIZ;
    }

    public C07YA(String str, long j, boolean z) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = z;
    }
}
