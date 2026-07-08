package X;

import Y.AgS284S0100000_3;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09r8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501209r8 implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;

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
            default:
                return null;
        }
    }

    public C2501209r8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object collect$0(C2501209r8 c2501209r8, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501209r8.l0).collect(new AgS284S0100000_3(interfaceC346701Wf, 10), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C2501209r8 c2501209r8, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501209r8.l0).collect(new AgS284S0100000_3(interfaceC346701Wf, 11), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$2(C2501209r8 c2501209r8, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501209r8.l0).collect(new AgS284S0100000_3(interfaceC346701Wf, 27), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$3(C2501209r8 c2501209r8, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501209r8.l0).collect(new AgS284S0100000_3(interfaceC346701Wf, 30), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
