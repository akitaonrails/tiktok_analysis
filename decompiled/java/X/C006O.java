package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006O {
    public final long LIZ;
    public final long LIZIZ = 3;
    public final String LIZJ;
    public final EnumC2249641D3i LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C006O)) {
            return false;
        }
        C006O c006o = (C006O) obj;
        return this.LIZ == c006o.LIZ && this.LIZIZ == c006o.LIZIZ && Intrinsics.LJFF(this.LIZJ, c006o.LIZJ) && this.LIZLLL == c006o.LIZLLL;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC2249641D3i enumC2249641D3i = this.LIZLLL;
        return iHashCode + (enumC2249641D3i != null ? enumC2249641D3i.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DerivedMeta(createdAt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ttlSeconds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", originAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastServerState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C006O(long j, EnumC2249641D3i enumC2249641D3i, String str) {
        this.LIZ = j;
        this.LIZJ = str;
        this.LIZLLL = enumC2249641D3i;
    }
}
