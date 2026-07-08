package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.coupon.CouponInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04BW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BW {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<CouponInfo> LJFF;

    public C04BW() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04BW)) {
            return false;
        }
        C04BW c04bw = (C04BW) obj;
        return Intrinsics.LJFF(this.LIZ, c04bw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04bw.LIZIZ) && this.LIZJ == c04bw.LIZJ && this.LIZLLL == c04bw.LIZLLL && this.LJ == c04bw.LJ && Intrinsics.LJFF(this.LJFF, c04bw.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpPageMetrics(productId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productPrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stayTimeSec=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", skuOpenCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", skuSwitchCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", couponInfos=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C04BW(List list, String str, String str2, int i) {
        List list2 = list;
        this(0L, (i & 32) != 0 ? C13BV.INSTANCE : list2, 0, 0, (i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "");
    }

    public C04BW(long j, List list, int i, int i2, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = list;
    }

    public static C04BW LIZ(C04BW c04bw, String str, long j, int i, int i2, List list, int i3) {
        String str2;
        int i4 = i2;
        int i5 = i;
        long j2 = j;
        List list2 = list;
        String str3 = str;
        if ((i3 & 1) != 0) {
            str2 = c04bw.LIZ;
        } else {
            str2 = null;
        }
        if ((i3 & 2) != 0) {
            str3 = c04bw.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            j2 = c04bw.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i5 = c04bw.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c04bw.LJ;
        }
        if ((i3 & 32) != 0) {
            list2 = c04bw.LJFF;
        }
        c04bw.getClass();
        return new C04BW(j2, list2, i5, i4, str2, str3);
    }
}
