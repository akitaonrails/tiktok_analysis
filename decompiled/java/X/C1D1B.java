package X;

import Y.AgS312S0100000_34;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1D1B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D1B implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 1:
                return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public C1D1B(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object collect$0(C1D1B c1d1b, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1d1b.l0).collect(new AgS312S0100000_34(interfaceC346701Wf, 0), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C1D1B c1d1b, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1d1b.l0).collect(new AgS312S0100000_34(interfaceC346701Wf, 1), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
