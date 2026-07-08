package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516130pYZ<R> {
    public final int LIZ;
    public final AbstractC1516230pYj<R> LIZIZ;
    public final long LIZJ;
    public final C1516060pYS LIZLLL;
    public boolean LJ;
    public EnumC1516190pYf LJFF;
    public final long LJI;

    public C1516130pYZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1516130pYZ)) {
            return false;
        }
        C1516130pYZ c1516130pYZ = (C1516130pYZ) obj;
        return this.LIZ == c1516130pYZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1516130pYZ.LIZIZ) && this.LIZJ == c1516130pYZ.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1516130pYZ.LIZLLL) && this.LJ == c1516130pYZ.LJ && this.LJFF == c1516130pYZ.LJFF && this.LJI == c1516130pYZ.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        C1516060pYS c1516060pYS = this.LIZLLL;
        return ((((((iHashCode + (c1516060pYS == null ? 0 : c1516060pYS.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParsedChunk(seq=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", parsedAtMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ruleMatch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", delivered=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", deferState=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", timeoutAtMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1516130pYZ(int i, AbstractC1516230pYj abstractC1516230pYj, long j, C1516060pYS c1516060pYS, EnumC1516190pYf enumC1516190pYf, long j2) {
        this.LIZ = i;
        this.LIZIZ = abstractC1516230pYj;
        this.LIZJ = j;
        this.LIZLLL = c1516060pYS;
        this.LJ = false;
        this.LJFF = enumC1516190pYf;
        this.LJI = j2;
    }
}
