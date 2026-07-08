package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS175S1100000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718210uoV extends C1718160uoQ {
    public final Function0<String> LJI;

    @Override // X.C1718160uoQ, X.InterfaceC1717200ums
    public final String LJI() {
        return "RESET_MOBILE";
    }

    public C1718210uoV(String str, Function0 function0) {
        super(str, function0);
        this.LJI = function0;
    }

    @Override // X.C1718160uoQ, X.InterfaceC1717200ums
    public final void LJII(C19EG c19eg, C1717190umr c1717190umr, String str) {
        FragmentManager fragmentManagerLJ;
        WalletCommonStepDialogFragment walletCommonStepDialogFragment = new WalletCommonStepDialogFragment(this, new AwS175S1100000_26(c1717190umr, str, 11), new AwS570S0100000_26(c1717190umr, 1521));
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
        if (abstractC1387200mCcLIZJ != null && (fragmentManagerLJ = abstractC1387200mCcLIZJ.LJ()) != null) {
            walletCommonStepDialogFragment.show(fragmentManagerLJ, "common_step_dialog");
        }
    }

    @Override // X.C1718160uoQ, X.AbstractC1718270uob
    public final Object LJIIL(C19EG c19eg, InterfaceC1718330uoh interfaceC1718330uoh, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJIILIIL = LJIILIIL(interfaceC1718330uoh, interfaceC1364105Vn);
        if (objLJIILIIL != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJIILIIL;
    }
}
