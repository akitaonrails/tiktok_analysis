package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C915503hx extends AbstractC916103i3 {
    public final String LJFF;
    public final boolean LJI;
    public final int LJII;
    public final String LJIIIIZZ;

    @Override // X.AbstractC916103i3
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetInstallmentAndCaryTypeResponse{detailId='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", supportInstallment=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C915503hx() {
    }

    public C915503hx(String str) {
        super(str);
        try {
            this.LJFF = this.LIZ.optString("detail_id");
            this.LJI = this.LIZ.optBoolean("installment_supported");
            this.LJII = this.LIZ.optInt("card_type");
            this.LJIIIIZZ = this.LIZ.optString("installment_bank_code");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
