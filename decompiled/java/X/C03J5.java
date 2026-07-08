package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;

/* JADX INFO: renamed from: X.03J5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03J5 {
    public final LogisticExpressionArea LIZ;
    public final LogisticDTO LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;

    public final int hashCode() {
        LogisticExpressionArea logisticExpressionArea = this.LIZ;
        int iHashCode = (logisticExpressionArea == null ? 0 : logisticExpressionArea.hashCode()) * 31;
        LogisticDTO logisticDTO = this.LIZIZ;
        return ((((((((((((iHashCode + (logisticDTO != null ? logisticDTO.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public static C03J5 LIZ(C03J5 c03j5, boolean z) {
        return new C03J5(c03j5.LIZ, c03j5.LIZIZ, z, c03j5.LIZLLL, c03j5.LJ, c03j5.LJFF, c03j5.LJI, c03j5.LJII);
    }

    public C03J5(LogisticExpressionArea logisticExpressionArea, LogisticDTO logisticDTO, boolean z, boolean z2, boolean z3, int i, int i2, boolean z4) {
        this.LIZ = logisticExpressionArea;
        this.LIZIZ = logisticDTO;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z4;
    }
}
