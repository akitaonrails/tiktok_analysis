package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C875803bY {
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final n LJ;
    public final Map<String, Object> LJFF;
    public final String LJI;
    public final PaymentMethodsData LJII;
    public final EnterParams LJIIIIZZ;
    public final InterfaceC877803bs LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C875803bY)) {
            return false;
        }
        C875803bY c875803bY = (C875803bY) obj;
        return Intrinsics.LJFF(this.LIZ, c875803bY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c875803bY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c875803bY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c875803bY.LIZLLL) && Intrinsics.LJFF(this.LJ, c875803bY.LJ) && Intrinsics.LJFF(this.LJFF, c875803bY.LJFF) && Intrinsics.LJFF(this.LJI, c875803bY.LJI) && Intrinsics.LJFF(this.LJII, c875803bY.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c875803bY.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c875803bY.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        n nVar = this.LJ;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Map<String, Object> map = this.LJFF;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.LJI;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PaymentMethodsData paymentMethodsData = this.LJII;
        int iHashCode8 = (iHashCode7 + (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode())) * 31;
        EnterParams enterParams = this.LJIIIIZZ;
        return ((iHashCode8 + (enterParams != null ? enterParams.hashCode() : 0)) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalBindContext(scope=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", consultationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", firstConsultationId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paySource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preRiskParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", saleRegion=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", paymentMethodsData=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", enterParams=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", loadingDialogCallback=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C875803bY(InterfaceC497601wk interfaceC497601wk, String str, String str2, String str3, n nVar, Map<String, ? extends Object> map, String str4, PaymentMethodsData paymentMethodsData, EnterParams enterParams, InterfaceC877803bs interfaceC877803bs) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = nVar;
        this.LJFF = map;
        this.LJI = str4;
        this.LJII = paymentMethodsData;
        this.LJIIIIZZ = enterParams;
        this.LJIIIZ = interfaceC877803bs;
    }
}
