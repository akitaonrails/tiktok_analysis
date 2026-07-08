package X;

import Y.AkS490S0100000_29;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11Su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19505011Su<K, V, REQ, RESP> extends C11SX<K, V> implements InterfaceC19503911Sj<Pair<? extends K, ? extends V>> {
    public final /* synthetic */ C19503811Si<K, V> LIZIZ;

    @Override // X.InterfaceC19503911Sj
    public final void LIZJ(InterfaceC19504011Sk<Pair<K, V>> interfaceC19504011Sk) {
        this.LIZIZ.LIZJ(interfaceC19504011Sk);
    }

    @Override // X.InterfaceC19503911Sj
    public final C11JN LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC19505211Sw
    public final C11NZ<List<Pair<K, V>>> LJ() {
        return C11IR.LL;
    }

    public C19505011Su(C11T3 c11t3) {
        super(c11t3);
        this.LIZIZ = new C19503811Si<>(c11t3);
    }

    @Override // X.InterfaceC19505211Sw
    public final C11NZ<C1641660sp2<V>> request(K k) {
        if (k != null) {
            C11T4 c11t4 = (C11T4) LIZIZ();
            C11ON c11onLJJJJZI = c11t4.request(k).LJJJJZI(new AkS490S0100000_29(new AwS395S0200000_29(c11t4, (C11T4<int, V, REQ, RESP>) k, 116), 36));
            if (c11onLJJJJZI != null) {
                return c11onLJJJJZI;
            }
        }
        return C11IR.LL;
    }

    @Override // X.InterfaceC19505211Sw
    public final C11ON LIZ(Object obj, InterfaceC19505211Sw... interfaceC19505211SwArr) {
        return LIZLLL(false, (InterfaceC19505211Sw[]) Arrays.copyOf(interfaceC19505211SwArr, interfaceC19505211SwArr.length)).LJJLIIJ().LJJJI(C19505511Sz.LL).LJJIL(new C517401zw(new C5183020f(obj, (Object) 365), 5)).LJJJJZI(new AkS490S0100000_29(AFwS266S0000000_25.get$arr$(595), 35));
    }

    @Override // X.InterfaceC19505211Sw
    public final C11O8 LIZLLL(boolean z, InterfaceC19505211Sw... interfaceC19505211SwArr) {
        return C11SX.LJII(LJFF().LJJIL(new C19774912Yp(new AwS608S0100000_29(interfaceC19505211SwArr, (InterfaceC19505211Sw<?, ?>[]) 885), 9)).LJJJJZI(new AkS490S0100000_29(AFwS273S0000000_29.get$arr$(474), 34)), z).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
