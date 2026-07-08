package X;

import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1718160uoQ extends AbstractC1718270uob {
    public final String LJ;
    public final Function0<String> LJFF;

    @Override // X.InterfaceC1717200ums
    public String LJI() {
        return "RESET_MOBILE";
    }

    public C1718160uoQ(String str, Function0 function0) {
        this.LJ = str;
        this.LJFF = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.InterfaceC1718330uoh r9, X.InterfaceC1364105Vn r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718160uoQ.LJIILIIL(X.0uoh, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1717200ums
    public void LJII(C19EG c19eg, final C1717190umr c1717190umr, final String str) {
        String str2 = WalletCommonStepFragment._pnsPageId;
        C1222080huI.LIZ(c19eg, "RESET_MOBILE", this.LJ, new InterfaceC1221990hu9() { // from class: X.0uod
            @Override // X.InterfaceC1221990hu9
            public final void onSuccess(String str3) {
            }

            @Override // X.InterfaceC1221990hu9
            public final void onCancel() {
                c1717190umr.LIZ(null);
            }

            @Override // X.InterfaceC1221990hu9
            public final void onSuccess() {
                c1717190umr.LIZJ(null, str, null);
            }
        });
    }

    @Override // X.AbstractC1718270uob
    public Object LJIIL(C19EG c19eg, InterfaceC1718330uoh interfaceC1718330uoh, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJIILIIL = LJIILIIL(interfaceC1718330uoh, interfaceC1364105Vn);
        if (objLJIILIIL != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJIILIIL;
    }
}
