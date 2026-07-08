package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572340Mca<V> implements InterfaceC608270NtR<Object, V> {
    public final V LL;
    public final Function0<C443120HZe<Keva, String, V>> LLILLJJLI;
    public V LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, (C572340Mca<Object>) 996));

    /* JADX WARN: Multi-variable type inference failed */
    public C572340Mca(Function0 function0, Object obj) {
        this.LL = obj;
        this.LLILLJJLI = function0;
        this.LLILLL = obj;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final V getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        if (Intrinsics.LJFF(this.LLILLL, this.LL)) {
            this.LLILLL = (V) C12848051a.LIZ((Keva) ((C443120HZe) this.LLILZ.getValue()).getFirst(), ((C443120HZe) this.LLILZ.getValue()).getThird(), (String) ((C443120HZe) this.LLILZ.getValue()).getSecond());
        }
        return this.LLILLL;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, V v) {
        this.LLILLL = v;
        C12848051a.LIZIZ((Keva) ((C443120HZe) this.LLILZ.getValue()).getFirst(), v, (String) ((C443120HZe) this.LLILZ.getValue()).getSecond());
    }
}
