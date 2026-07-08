package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812520xGc extends AbstractC1812500xGa {
    public final EnumC768840UDy LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812520xGc)) {
            return false;
        }
        C1812520xGc c1812520xGc = (C1812520xGc) obj;
        return this.LIZ == c1812520xGc.LIZ && this.LIZIZ == c1812520xGc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1812520xGc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1812520xGc.LIZLLL) && this.LJ == c1812520xGc.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitData(broadcastScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", boardShowEntrance=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", panelType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812520xGc(EnumC768840UDy enumC768840UDy, int i, String str, String str2, int i2) {
        this.LIZ = enumC768840UDy;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i2;
    }
}
