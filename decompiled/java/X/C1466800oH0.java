package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0oH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466800oH0 implements InterfaceC1731706qJ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        switch (this.$t) {
            case 0:
                return getValue$0(this, obj, interfaceC2217461Bqa);
            case 1:
                return getValue$1(this, obj, interfaceC2217461Bqa);
            default:
                return null;
        }
    }

    public C1466800oH0(Function0 function0, int i) {
        this.$t = i;
        if (i != 0) {
            this.l2 = function0;
            this.l0 = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(261));
        } else {
            this.l2 = function0;
            this.l0 = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(260));
        }
    }

    public static final Object getValue$0(C1466800oH0 c1466800oH0, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C05YF c05yf = (C05YF) c1466800oH0.l1;
        if (c05yf == null) {
            C1DRG c1drg = (C1DRG) ((Function0) c1466800oH0.l2).invoke();
            C05YF c05yf2 = null;
            if (c1drg != null) {
                c05yf2 = (C05YF) c1drg.LJIIL(null, InterfaceC377540ErA.class);
            }
            c1466800oH0.l1 = c05yf2;
            if (c05yf2 == null) {
                return ((C01GW) c1466800oH0.l0).getValue();
            }
            return c05yf2;
        }
        return c05yf;
    }

    public static final Object getValue$1(C1466800oH0 c1466800oH0, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C05YF c05yf = (C05YF) c1466800oH0.l1;
        if (c05yf == null) {
            C1DRG c1drg = (C1DRG) ((Function0) c1466800oH0.l2).invoke();
            C05YF c05yf2 = null;
            if (c1drg != null) {
                c05yf2 = (C05YF) c1drg.LJIIL(null, InterfaceC1444410ngt.class);
            }
            c1466800oH0.l1 = c05yf2;
            if (c05yf2 == null) {
                return ((C01GW) c1466800oH0.l0).getValue();
            }
            return c05yf2;
        }
        return c05yf;
    }
}
