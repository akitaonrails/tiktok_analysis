package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780250wQZ implements InterfaceC1785400wYs {
    public final long LIZ;
    public final int LIZIZ;
    public final C1780260wQa LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780250wQZ)) {
            return false;
        }
        C1780250wQZ c1780250wQZ = (C1780250wQZ) obj;
        return this.LIZ == c1780250wQZ.LIZ && this.LIZIZ == c1780250wQZ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1780250wQZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1780250wQZ.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        return iY2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecuteCommand(targetUserId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", optimisticAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", successToastRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780250wQZ(long j, int i, C1780260wQa c1780260wQa, Integer num) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = c1780260wQa;
        this.LIZLLL = num;
    }
}
