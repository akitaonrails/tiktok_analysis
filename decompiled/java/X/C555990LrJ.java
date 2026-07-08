package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555990LrJ implements InterfaceC553240Lms {
    public final C556010LrL LIZ;
    public final AbstractC1406905f1 LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555990LrJ)) {
            return false;
        }
        C555990LrJ c555990LrJ = (C555990LrJ) obj;
        return Intrinsics.LJFF(this.LIZ, c555990LrJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c555990LrJ.LIZIZ) && this.LIZJ == c555990LrJ.LIZJ && this.LIZLLL == c555990LrJ.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lifecycle(meta=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", happenTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFirstRun=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC553240Lms
    public final C556010LrL getMeta() {
        return this.LIZ;
    }

    public C555990LrJ(C556010LrL c556010LrL, AbstractC1406905f1 abstractC1406905f1, long j, boolean z) {
        this.LIZ = c556010LrL;
        this.LIZIZ = abstractC1406905f1;
        this.LIZJ = j;
        this.LIZLLL = z;
    }

    public /* synthetic */ C555990LrJ(C556010LrL c556010LrL, C1405905er c1405905er, long j, int i) {
        this(c556010LrL, (AbstractC1406905f1) c1405905er, (i & 4) != 0 ? -1L : j, false);
    }
}
