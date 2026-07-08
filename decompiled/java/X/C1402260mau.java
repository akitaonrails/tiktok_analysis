package X;

import Y.AgS207S0200000_21;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402260mau implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 1:
                return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 2:
                return collect$2(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 3:
                return collect$3(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 4:
                return collect$4(this, interfaceC346701Wf, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public C1402260mau(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object collect$0(C1402260mau c1402260mau, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1402260mau.l0).collect(new AgS207S0200000_21(interfaceC346701Wf, (C1364170lbT) c1402260mau.l1, 0), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C1402260mau c1402260mau, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1402260mau.l0).collect(new AgS207S0200000_21(interfaceC346701Wf, (C1364170lbT) c1402260mau.l1, 1), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$2(C1402260mau c1402260mau, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1402260mau.l0).collect(new AgS207S0200000_21(interfaceC346701Wf, (C1363950lb7) c1402260mau.l1, 2), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$3(C1402260mau c1402260mau, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1402260mau.l0).collect(new AgS207S0200000_21(interfaceC346701Wf, (C1363950lb7) c1402260mau.l1, 3), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$4(C1402260mau c1402260mau, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1402260mau.l0).collect(new AgS207S0200000_21(interfaceC346701Wf, (C1363970lb9) c1402260mau.l1, 6), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
