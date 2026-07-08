package X;

import Y.AkS490S0100000_29;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11Ss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19504811Ss<K, V> extends C11SX<K, V> implements InterfaceC19503911Sj<Pair<? extends K, ? extends V>>, InterfaceC19504111Sl<Pair<? extends K, ? extends V>> {
    public final /* synthetic */ C19503811Si<K, V> LIZIZ;
    public final /* synthetic */ C19505111Sv<K, V> LIZJ;

    @Override // X.InterfaceC19503911Sj
    public final void LIZJ(InterfaceC19504011Sk<Pair<K, V>> interfaceC19504011Sk) {
        this.LIZIZ.LIZJ(interfaceC19504011Sk);
    }

    @Override // X.InterfaceC19503911Sj
    public final C11JN LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC19504111Sl
    public final void LJI(InterfaceC19504011Sk<Pair<K, V>> interfaceC19504011Sk) {
        this.LIZJ.LJI(interfaceC19504011Sk);
    }

    @Override // X.InterfaceC19505211Sw
    public final C11NZ<List<Pair<K, V>>> LJ() {
        return ((InterfaceC19505411Sy) LIZIZ()).getAll();
    }

    public C19504811Ss(C11T1 c11t1) {
        super(c11t1);
        this.LIZIZ = new C19503811Si<>(c11t1);
        this.LIZJ = new C19505111Sv<>(c11t1);
    }

    @Override // X.InterfaceC19505211Sw
    public final C11NZ<C1641660sp2<V>> request(K k) {
        return ((InterfaceC19505411Sy) LIZIZ()).get(k);
    }

    @Override // X.InterfaceC19505211Sw
    public final C11ON LIZ(Object obj, InterfaceC19505211Sw... interfaceC19505211SwArr) {
        return LIZLLL(false, (InterfaceC19505211Sw[]) Arrays.copyOf(interfaceC19505211SwArr, interfaceC19505211SwArr.length)).LJJLIIJ().LJJJI(C19505511Sz.LL).LJJIL(new C517401zw(new C5183020f(obj, (Object) 296), 2)).LJJJJZI(new AkS490S0100000_29(AFwS266S0000000_25.get$arr$(543), 26));
    }

    @Override // X.InterfaceC19505211Sw
    public final C11O8 LIZLLL(boolean z, InterfaceC19505211Sw... interfaceC19505211SwArr) {
        return C11SX.LJII(LJFF().LJJIL(new C19774912Yp(new AwS608S0100000_29(interfaceC19505211SwArr, (InterfaceC19505211Sw<?, ?>[]) 807), 6)).LJJJJZI(new AkS490S0100000_29(AFwS273S0000000_29.get$arr$(427), 25)), z).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
