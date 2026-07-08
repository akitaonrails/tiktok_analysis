package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C204800qc implements InterfaceC204700qb {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C204800qc) && Intrinsics.LJFF(this.LIZ, ((C204800qc) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomNextShowingDropsData(dropsId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C204800qc(String str) {
        this.LIZ = str;
    }
}
