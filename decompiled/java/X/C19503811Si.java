package X;

import Y.AfS198S0100000_29;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11Si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19503811Si<K, V> implements InterfaceC19503911Sj<Pair<? extends K, ? extends V>> {
    public final WeakReference<InterfaceC1305030k45<Pair<K, V>>> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(325));

    @Override // X.InterfaceC19503911Sj
    public final C11JN LJFF() {
        return ((C11NZ) this.LIZIZ.getValue()).LJJIJIIJIL(new AfS198S0100000_29(new AwS608S0100000_29(this, (C19503811Si<Object, Object>) 584), 24));
    }

    public C19503811Si(InterfaceC1305030k45<Pair<K, V>> interfaceC1305030k45) {
        this.LIZ = new WeakReference<>(interfaceC1305030k45);
    }

    @Override // X.InterfaceC19503911Sj
    public final void LIZJ(InterfaceC19504011Sk<Pair<K, V>> interfaceC19504011Sk) {
        ((AbstractC19503411Se) this.LIZIZ.getValue()).accept(interfaceC19504011Sk);
    }
}
