package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335080DBq extends AbstractC335100DBs {
    public final AbstractC334660DAa LIZ;
    public final C334630D9x LIZIZ;
    public final C0DB8 LIZJ;
    public final C335070DBp LIZLLL;
    public final C0DAO LJ;
    public final C334550D9p LJFF;
    public final C0DBT LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C335080DBq)) {
            return false;
        }
        C335080DBq c335080DBq = (C335080DBq) obj;
        return Intrinsics.LJFF(this.LIZ, c335080DBq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c335080DBq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c335080DBq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c335080DBq.LIZLLL) && Intrinsics.LJFF(this.LJ, c335080DBq.LJ) && Intrinsics.LJFF(this.LJFF, c335080DBq.LJFF) && Intrinsics.LJFF(this.LJI, c335080DBq.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        C334550D9p c334550D9p = this.LJFF;
        int iHashCode2 = (iHashCode + (c334550D9p == null ? 0 : c334550D9p.hashCode())) * 31;
        C0DBT c0dbt = this.LJI;
        return iHashCode2 + (c0dbt != null ? c0dbt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Content(addressState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paymentState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomBarState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pageFlowState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", notice=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", loadingHud=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335080DBq(AbstractC334660DAa abstractC334660DAa, C334630D9x c334630D9x, C0DB8 c0db8, C335070DBp c335070DBp, C0DAO c0dao, C334550D9p c334550D9p, C0DBT c0dbt) {
        this.LIZ = abstractC334660DAa;
        this.LIZIZ = c334630D9x;
        this.LIZJ = c0db8;
        this.LIZLLL = c335070DBp;
        this.LJ = c0dao;
        this.LJFF = c334550D9p;
        this.LJI = c0dbt;
    }
}
