package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS116S0201000_35;
import kotlin.jvm.internal.AwS120S0110000_35;
import kotlin.jvm.internal.AwS140S0101000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS56S0301000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS85S1000000_35;

/* JADX INFO: renamed from: X.1DW5, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DW5 implements C1DW6 {
    public final C01GW LL = C452501pT.LIZIZ(new C2217008mO());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1DPU());

    public final void LIZ(Function1<? super C1DW6, Unit> function1) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C05C7(this, function1, null), 3);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        LIZ(new AwS614S0100000_35(c869590Y9l, 200));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
        LIZ(new AwS614S0100000_35(c869590Y9l, 199));
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
        ((CopyOnWriteArraySet) this.LLILLJJLI.getValue()).add(c1dw6);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        LIZ(new AwS614S0100000_35(c869590Y9l, 197));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
        LIZ(new AwS614S0100000_35(list, (List<C1460620o72>) 198));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
        LIZ(new AwS85S1000000_35(str, 12));
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
        ((CopyOnWriteArraySet) this.LLILLJJLI.getValue()).remove(c1dw6);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
        LIZ(new AwS140S0101000_35(c869590Y9l, i, 6));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
        LIZ(new AwS401S0200000_35((List) list, (List<C869590Y9l>) enumC872590YKz, (EnumC872590YKz) 51));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        LIZ(new AwS401S0200000_35(list, list2, (List<? extends C869590Y9l>) 52));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
        LIZ(new AwS120S0110000_35(c869590Y9l, z, 3));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
        LIZ(new AwS120S0110000_35((List) list, (List<C869590Y9l>) z, true));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        LIZ(new AwS116S0201000_35(i, c0yc9, c869590Y9l, 4));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        LIZ(new AwS116S0201000_35((List) list, (List<C869590Y9l>) i, (int) c0y7p, (C0Y7P) 2));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
        LIZ(new AwS116S0201000_35(c0y3i, i, c0ya6, 3));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        LIZ(new C1DW8(i, str, list, l));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        Integer numValueOf;
        LIZ(new AwS56S0301000_35(c0y3i, (C0Y3I) list, (List<? extends C869590Y9l>) map, (Map<String, Map<String, String>>) i, 0));
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateMessage with ");
        Integer numValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" && ");
        if (map != null) {
            numValueOf2 = Integer.valueOf(map.size());
        }
        sbLIZ.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("GlobalMsgObserver");
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
        LIZ(new C1DW4(c0y3i, c869590Y9l, map, map2, l, l2));
    }
}
