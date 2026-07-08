package X;

import Y.AfS194S0100000_25;
import Y.AkS329S0200000_25;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sT0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628000sT0 extends AbstractC1628090sT9 {
    public static final int LLJLL = 8;
    public final InterfaceC1626500sQa LLJJL;
    public final InterfaceC1626510sQb LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    public final boolean o7() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    @Override // X.AbstractC1628090sT9
    public String t5() {
        return (String) this.LLJLIL.getValue();
    }

    @Override // X.AbstractC1628090sT9
    public String x5() {
        return (String) this.LLJLILLLLZIIL.getValue();
    }

    private final void n7() {
        this.LLJJIII.LIZ(A0().LJL(C11S5.LIZ()).LJJIL(new InterfaceC19483011Ki() { // from class: X.0sT4
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C0VJ6;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sT3
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return (AbstractC789580UyC) obj;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 65)));
    }

    @Override // X.AbstractC1628090sT9
    public void L6() {
        LLILZ().onNext(new C789550Uy9("click_carousel", false));
    }

    @Override // X.AbstractC1628090sT9, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        n7();
        s7(S5());
    }

    @Override // X.AbstractC1628090sT9
    public void u6() {
        o1().onNext(C1626800sR4.LIZJ);
    }

    private final void s7(C11PQ<Boolean> c11pq) {
        this.LLJJIII.LIZ(C11NZ.LJIIJ(LJJJJJL().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sT2
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return Boolean.valueOf(obj instanceof AbstractC1626750sQz);
            }
        }).LJJIFFI(), this.LLJJIJIIJIL, new InterfaceC500500Jk0() { // from class: X.0sT1
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                boolean z;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() && !bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJLIIIL(new AkS329S0200000_25(this, c11pq, 0)).LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 66)));
    }

    public C1628000sT0(C19A3 c19a3, InterfaceC1626500sQa interfaceC1626500sQa, InterfaceC1626510sQb interfaceC1626510sQb, InterfaceC332600D2c interfaceC332600D2c) {
        super(c19a3, interfaceC1626500sQa, interfaceC1626510sQb, interfaceC332600D2c);
        this.LLJJL = interfaceC1626500sQa;
        this.LLJJLIIIJLLLLLLLZ = interfaceC1626510sQb;
        this.LLJL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(336));
        this.LLJLIL = C452501pT.LIZIZ(new AwS426S0200000_25(this, c19a3, 107));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 683));
    }
}
