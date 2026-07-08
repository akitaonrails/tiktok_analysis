package X;

import Y.AgS162S0300000_2;
import Y.AgS193S0200000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06wH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768706wH implements InterfaceC346201Wa {
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
            default:
                return null;
        }
    }

    public C1768706wH(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final Object collect$0(C1768706wH c1768706wH, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1768706wH.l0).collect(new AgS193S0200000_2(interfaceC346701Wf, (InterfaceC1690500u5o) c1768706wH.l1, 13), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C1768706wH c1768706wH, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1768706wH.l0).collect(new AgS162S0300000_2(new C013C(), interfaceC346701Wf, (Function2) c1768706wH.l1, 4), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
