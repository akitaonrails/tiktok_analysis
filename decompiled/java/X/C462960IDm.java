package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: renamed from: X.0IDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462960IDm implements InterfaceC1731706qJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        switch (this.$t) {
            case 0:
                return getValue$0(this, obj, interfaceC2217461Bqa);
            case 1:
                return getValue$1(this, obj, interfaceC2217461Bqa);
            case 2:
                return getValue$2(this, obj, interfaceC2217461Bqa);
            case 3:
                return getValue$3(this, obj, interfaceC2217461Bqa);
            case 4:
                return getValue$4(this, obj, interfaceC2217461Bqa);
            case 5:
                return getValue$5(this, obj, interfaceC2217461Bqa);
            case 6:
                return getValue$6(this, obj, interfaceC2217461Bqa);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C462960IDm(Object obj, AssemVMLazy<S, VM> assemVMLazy) {
        this.$t = assemVMLazy;
        this.l0 = obj;
    }

    public static final Object getValue$0(C462960IDm c462960IDm, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c462960IDm.l0).getStub();
        if (stub != null) {
            return stub.LJ(C0HPQ.class);
        }
        return null;
    }

    public static final Object getValue$1(C462960IDm c462960IDm, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c462960IDm.l0).getStub();
        if (stub != null) {
            return stub.LJ(InterfaceC435730H6t.class);
        }
        return null;
    }

    public static final Object getValue$2(C462960IDm c462960IDm, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c462960IDm.l0).getStub();
        if (stub != null) {
            return stub.LJ(InterfaceC432920GyI.class);
        }
        return null;
    }

    public static final Object getValue$3(C462960IDm c462960IDm, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c462960IDm.l0).getStub();
        if (stub != null) {
            return stub.LJ(C0HNH.class);
        }
        return null;
    }

    public static final Object getValue$4(C462960IDm c462960IDm, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c462960IDm.l0).getStub();
        if (stub != null) {
            return stub.LJ(C441230HRx.class);
        }
        return null;
    }

    public static final Object getValue$5(C462960IDm c462960IDm, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c462960IDm.l0).getStub();
        if (stub != null) {
            return stub.LJ(InterfaceC451110HmX.class);
        }
        return null;
    }

    public static final Object getValue$6(C462960IDm c462960IDm, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        return ((AssemVMLazy) c462960IDm.l0).getValue();
    }
}
