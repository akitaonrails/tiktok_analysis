package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515901zh implements InterfaceC346201Wa {
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
            default:
                return null;
        }
    }

    public C515901zh(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final Object collect$0(C515901zh c515901zh, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c515901zh.l0).collect(new C492801vy((Function2) c515901zh.l1, interfaceC346701Wf), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C515901zh c515901zh, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLIZ = C23039090z.LIZ(interfaceC1364105Vn, new C414201jI(), new C413901jF(null, (InterfaceC1631630sYr) c515901zh.l1), interfaceC346701Wf, (InterfaceC346201Wa[]) c515901zh.l0);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public static final Object collect$2(C515901zh c515901zh, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLIZ = C23039090z.LIZ(interfaceC1364105Vn, new C414201jI(), new C415001jQ(null, (InterfaceC1685420txc) c515901zh.l1), interfaceC346701Wf, (InterfaceC346201Wa[]) c515901zh.l0);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
