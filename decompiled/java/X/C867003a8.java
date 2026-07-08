package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPopUpInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C867003a8 {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC861003Ya LIZJ;
    public final boolean LIZLLL;
    public final EnumC861103Yb LJ;
    public final PaymentPopUpInfo LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C867003a8)) {
            return false;
        }
        C867003a8 c867003a8 = (C867003a8) obj;
        return Intrinsics.LJFF(this.LIZ, c867003a8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c867003a8.LIZIZ) && this.LIZJ == c867003a8.LIZJ && this.LIZLLL == c867003a8.LIZLLL && this.LJ == c867003a8.LJ && Intrinsics.LJFF(this.LJFF, c867003a8.LJFF) && Intrinsics.LJFF(this.LJI, c867003a8.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        PaymentPopUpInfo paymentPopUpInfo = this.LJFF;
        int iHashCode2 = (iHashCode + (paymentPopUpInfo == null ? 0 : paymentPopUpInfo.hashCode())) * 31;
        String str = this.LJI;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackupPaymentEntryModel(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", switchRetainPopupInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", materialCollectionInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C867003a8 LIZ(C867003a8 c867003a8, boolean z, String str, int i) {
        String str2;
        String str3;
        EnumC861003Ya enumC861003Ya;
        EnumC861103Yb enumC861103Yb;
        String str4 = str;
        boolean z2 = z;
        PaymentPopUpInfo paymentPopUpInfo = null;
        if ((i & 1) != 0) {
            str2 = c867003a8.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = c867003a8.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            enumC861003Ya = c867003a8.LIZJ;
        } else {
            enumC861003Ya = null;
        }
        if ((i & 8) != 0) {
            z2 = c867003a8.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC861103Yb = c867003a8.LJ;
        } else {
            enumC861103Yb = null;
        }
        if ((i & 32) != 0) {
            paymentPopUpInfo = c867003a8.LJFF;
        }
        if ((i & 64) != 0) {
            str4 = c867003a8.LJI;
        }
        c867003a8.getClass();
        return new C867003a8(str2, str3, enumC861003Ya, z2, enumC861103Yb, paymentPopUpInfo, str4);
    }

    public C867003a8(String str, String str2, EnumC861003Ya enumC861003Ya, boolean z, EnumC861103Yb enumC861103Yb, PaymentPopUpInfo paymentPopUpInfo, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC861003Ya;
        this.LIZLLL = z;
        this.LJ = enumC861103Yb;
        this.LJFF = paymentPopUpInfo;
        this.LJI = str3;
    }
}
