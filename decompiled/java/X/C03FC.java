package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03FC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FC {
    public final LogisticDTO LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final LogisticExpressionArea LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C03FB LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03FC)) {
            return false;
        }
        C03FC c03fc = (C03FC) obj;
        return Intrinsics.LJFF(this.LIZ, c03fc.LIZ) && this.LIZIZ == c03fc.LIZIZ && this.LIZJ == c03fc.LIZJ && Intrinsics.LJFF(this.LIZLLL, c03fc.LIZLLL) && this.LJ == c03fc.LJ && this.LJFF == c03fc.LJFF && Intrinsics.LJFF(this.LJI, c03fc.LJI);
    }

    public C03FC(LogisticDTO logisticDTO, int i, int i2, LogisticExpressionArea logisticExpressionArea, boolean z, boolean z2, C03FB c03fb, int i3) {
        logisticExpressionArea = (i3 & 8) != 0 ? null : logisticExpressionArea;
        z = (i3 & 16) != 0 ? false : z;
        z2 = (i3 & 32) != 0 ? false : z2;
        c03fb = (i3 & 64) != 0 ? null : c03fb;
        this.LIZ = logisticDTO;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = logisticExpressionArea;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = c03fb;
    }
}
