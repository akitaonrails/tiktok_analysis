package X;

import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: renamed from: X.0ycz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864830ycz implements InterfaceC1731706qJ {
    public final int $t;
    public Object l0;

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

    public C1864830ycz(PowerCell powerCell, int i) {
        this.$t = i;
        this.l0 = powerCell;
    }

    public static final Object getValue$0(C1864830ycz c1864830ycz, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c1864830ycz.l0).getStub();
        if (stub != null) {
            return stub.LJ(InterfaceC1834090xpP.class);
        }
        return null;
    }

    public static final Object getValue$1(C1864830ycz c1864830ycz, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = ((PowerCell) c1864830ycz.l0).getStub();
        if (stub != null) {
            return stub.LJ(InterfaceC1844380y60.class);
        }
        return null;
    }
}
