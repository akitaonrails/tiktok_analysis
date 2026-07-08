package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C873003b6 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InstallmentInfo LJ;
    public final PaymentMethod LJFF;
    public InstallmentPlan LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873003b6)) {
            return false;
        }
        C873003b6 c873003b6 = (C873003b6) obj;
        return Intrinsics.LJFF(this.LIZ, c873003b6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873003b6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c873003b6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c873003b6.LIZLLL) && Intrinsics.LJFF(this.LJ, c873003b6.LJ) && Intrinsics.LJFF(this.LJFF, c873003b6.LJFF) && Intrinsics.LJFF(this.LJI, c873003b6.LJI) && Intrinsics.LJFF(this.LJII, c873003b6.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        InstallmentPlan installmentPlan = this.LJI;
        int iHashCode5 = (iHashCode4 + (installmentPlan == null ? 0 : installmentPlan.hashCode())) * 31;
        String str5 = this.LJII;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public /* synthetic */ C873003b6(String str, String str2, String str3, String str4, InstallmentInfo installmentInfo, PaymentMethod paymentMethod, String str5, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, installmentInfo, paymentMethod, (InstallmentPlan) null, (i & 128) != 0 ? null : str5);
    }

    public C873003b6(String str, String str2, String str3, String str4, InstallmentInfo installmentInfo, PaymentMethod paymentMethod, InstallmentPlan installmentPlan, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = installmentInfo;
        this.LJFF = paymentMethod;
        this.LJI = installmentPlan;
        this.LJII = str5;
    }
}
