package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AgreementConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C876803bi {
    public final Boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final AgreementConfiguration LJI;

    public C876803bi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C876803bi)) {
            return false;
        }
        C876803bi c876803bi = (C876803bi) obj;
        return Intrinsics.LJFF(this.LIZ, c876803bi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c876803bi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c876803bi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c876803bi.LIZLLL) && Intrinsics.LJFF(this.LJ, c876803bi.LJ) && Intrinsics.LJFF(this.LJFF, c876803bi.LJFF) && Intrinsics.LJFF(this.LJI, c876803bi.LJI);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AgreementConfiguration agreementConfiguration = this.LJI;
        return iHashCode6 + (agreementConfiguration != null ? agreementConfiguration.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackupPaymentAgreementData(needSaveBackupPaymentAgreement=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", agreementType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", merchantAgreementId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", merchantUserId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", riskInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", configuration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C876803bi(int i) {
        this(null, "BACKUP_PAYMENT_METHOD", null, null, null, null, null);
    }

    public static C876803bi LIZ(C876803bi c876803bi, Boolean bool) {
        String str = c876803bi.LIZIZ;
        String str2 = c876803bi.LIZJ;
        String str3 = c876803bi.LIZLLL;
        String str4 = c876803bi.LJ;
        String str5 = c876803bi.LJFF;
        AgreementConfiguration agreementConfiguration = c876803bi.LJI;
        c876803bi.getClass();
        return new C876803bi(bool, str, str2, str3, str4, str5, agreementConfiguration);
    }

    public C876803bi(Boolean bool, String str, String str2, String str3, String str4, String str5, AgreementConfiguration agreementConfiguration) {
        this.LIZ = bool;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = agreementConfiguration;
    }
}
