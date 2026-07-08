package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882707Yz implements C07ZG {
    public final String LIZ;
    public final EnumC2398509aZ LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1882707Yz)) {
            return false;
        }
        C1882707Yz c1882707Yz = (C1882707Yz) obj;
        return Intrinsics.LJFF(this.LIZ, c1882707Yz.LIZ) && this.LIZIZ == c1882707Yz.LIZIZ && this.LIZJ == c1882707Yz.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC2398509aZ enumC2398509aZ = this.LIZIZ;
        return ((iHashCode + (enumC2398509aZ == null ? 0 : enumC2398509aZ.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cancelled(workflowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cancelReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", happenTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C07ZG
    public final String LIZ() {
        return this.LIZ;
    }

    public C1882707Yz(String str, EnumC2398509aZ enumC2398509aZ, long j) {
        this.LIZ = str;
        this.LIZIZ = enumC2398509aZ;
        this.LIZJ = j;
    }
}
