package X;

import Y.AkS490S0100000_29;
import com.bytedance.vcloud.strategy.StrategyCenter;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19504911St<K, V> extends C11SX<K, List<? extends V>> implements InterfaceC19503911Sj<Pair<? extends K, ? extends List<? extends V>>>, InterfaceC19504111Sl<Pair<? extends K, ? extends List<? extends V>>> {
    public final /* synthetic */ C19503811Si<K, List<V>> LIZIZ;
    public final /* synthetic */ C19505111Sv<K, List<V>> LIZJ;

    @Override // X.InterfaceC19503911Sj
    public final void LIZJ(InterfaceC19504011Sk<Pair<K, List<V>>> interfaceC19504011Sk) {
        this.LIZIZ.LIZJ(interfaceC19504011Sk);
    }

    @Override // X.InterfaceC19503911Sj
    public final C11JN LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC19504111Sl
    public final void LJI(InterfaceC19504011Sk<Pair<K, List<V>>> interfaceC19504011Sk) {
        this.LIZJ.LJI(interfaceC19504011Sk);
    }

    @Override // X.InterfaceC19505211Sw
    public final C11NZ<List<Pair<K, List<V>>>> LJ() {
        return ((InterfaceC19505311Sx) LIZIZ()).getAll();
    }

    public C19504911St(C11T0 c11t0) {
        super(c11t0);
        this.LIZIZ = new C19503811Si<>(c11t0);
        this.LIZJ = new C19505111Sv<>(c11t0);
    }

    @Override // X.InterfaceC19505211Sw
    public final C11NZ<C1641660sp2<List<V>>> request(K k) {
        return ((InterfaceC19505311Sx) LIZIZ()).get(k);
    }

    @Override // X.InterfaceC19505211Sw
    public final C11ON LIZ(Object obj, InterfaceC19505211Sw... interfaceC19505211SwArr) {
        return LIZLLL(false, (InterfaceC19505211Sw[]) Arrays.copyOf(interfaceC19505211SwArr, interfaceC19505211SwArr.length)).LJJLIIJ().LJJJI(C19505511Sz.LL).LJJIL(new C517401zw(new C5183020f(obj, (Object) 297), 3)).LJJJJZI(new AkS490S0100000_29(AFwS266S0000000_25.get$arr$(544), 27));
    }

    @Override // X.InterfaceC19505211Sw
    public final C11O8 LIZLLL(boolean z, InterfaceC19505211Sw... interfaceC19505211SwArr) {
        return C11SX.LJII(LJFF().LJJIL(new C19774912Yp(new AwS608S0100000_29(interfaceC19505211SwArr, (InterfaceC19505211Sw<?, ?>[]) StrategyCenter.ENABLE_SMART_SERVICE), 7)).LJJJJZI(new AkS490S0100000_29(AFwS273S0000000_29.get$arr$(428), 28)), z).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
