package X;

import Y.AgS311S0100000_33;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1An0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189761An0 implements InterfaceC346201Wa {
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
            default:
                return null;
        }
    }

    public C2189761An0(C05YD c05yd, int i) {
        this.$t = i;
        this.l0 = c05yd;
    }

    public static final Object collect$0(C2189761An0 c2189761An0, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2189761An0.l0).collect(new AgS311S0100000_33(interfaceC346701Wf, 0), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C2189761An0 c2189761An0, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2189761An0.l0).collect(new AgS311S0100000_33(interfaceC346701Wf, 1), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$2(C2189761An0 c2189761An0, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2189761An0.l0).collect(new AgS311S0100000_33(interfaceC346701Wf, 2), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
