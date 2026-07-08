package X;

import Y.AkS490S0100000_29;
import kotlin.Pair;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11TI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TI<V, K1, V1> implements InterfaceC742320T9y<V, Pair<? extends K1, ? extends V1>> {
    public final InterfaceC19505211Sw<K1, V1> LIZ;
    public final C11TH<?, V, K1, V1> LIZIZ;

    @Override // X.InterfaceC742320T9y
    public final C098D<Pair<K1, V1>> LIZIZ(C11NZ<V> c11nz) {
        if (this.LIZIZ instanceof C11TD) {
            return c11nz.LJJJI(new AkS490S0100000_29(new AwS608S0100000_29(this, 529), 4)).LJJJ(new AkS490S0100000_29(new AwS608S0100000_29(this, 530), 5), false);
        }
        throw new RuntimeException();
    }

    public C11TI(InterfaceC19505211Sw<K1, V1> interfaceC19505211Sw, C11TH<?, V, K1, V1> c11th) {
        this.LIZ = interfaceC19505211Sw;
        this.LIZIZ = c11th;
    }
}
