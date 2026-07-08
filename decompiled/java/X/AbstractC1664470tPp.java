package X;

import X.C05YF;
import com.bytedance.als.ui.state.LiveState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664470tPp<API_COMPONENT extends C05YF, STATE, ACTION> extends AbstractC2255721DQs<API_COMPONENT> implements C05YF {
    public final API_COMPONENT LL = this;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 785));

    public abstract Function0<STATE> o2();

    public abstract Function0<ACTION> w2();

    public final C1664680tQA<STATE> G2() {
        return (C1664680tQA) this.LLILLJJLI.getValue();
    }

    public final STATE T2() {
        return G2().LIZ;
    }

    public final <SCENE extends AbstractC1664490tPr<STATE, ACTION>> InterfaceC1731706qJ<Object, SCENE> W2() {
        Intrinsics.LJIILIIL();
        throw null;
    }

    @Override // X.AbstractC2255721DQs
    public API_COMPONENT getApiComponent() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <V> LiveState<V> H2(InterfaceC2217241BqE<STATE, ? extends V> interfaceC2217241BqE) {
        return G2().LIZ(interfaceC2217241BqE);
    }

    public final AbstractC1664490tPr<STATE, ACTION> W1(AbstractC1664490tPr<STATE, ACTION> abstractC1664490tPr) {
        abstractC1664490tPr.LLJJIJIIJIL = G2();
        abstractC1664490tPr.LLJJIJIL = w2().invoke();
        return abstractC1664490tPr;
    }

    public final AbstractC1664490tPr<STATE, ACTION> X1(Class<?> cls) {
        return (AbstractC1664490tPr) cls.newInstance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <V> LiveState<V> Z1(InterfaceC2217241BqE<STATE, ? extends V> interfaceC2217241BqE) {
        return G2().LIZ(interfaceC2217241BqE);
    }

    public final void c3(Function1<? super STATE, ? extends STATE> function1) {
        G2().LIZJ(function1, true);
    }

    public final void i3(Function1<? super STATE, ? extends STATE> function1) {
        G2().LIZLLL(function1, true);
    }

    public final void m3(Function1<? super STATE, Unit> function1) {
        function1.invoke(T2());
    }
}
