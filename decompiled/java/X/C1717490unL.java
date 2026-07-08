package X;

import Y.ARunnableS59S0300000_26;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0unL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717490unL extends AbstractC1716900umO {
    public final String LJFF;
    public final boolean LJI;
    public final Function0<String> LJII;

    @Override // X.InterfaceC1717200ums
    public final String LJI() {
        return "OPEN_CA_ACCOUNT_NEED_SYNC";
    }

    public C1717490unL(String str, boolean z, Function0 function0) {
        super(null);
        this.LJFF = str;
        this.LJI = z;
        this.LJII = function0;
    }

    @Override // X.InterfaceC1717200ums
    public final void LJII(C19EG c19eg, C1717190umr c1717190umr, String str) {
        c19eg.runOnUiThread(new ARunnableS59S0300000_26(this, c19eg, c1717190umr, 9));
    }
}
