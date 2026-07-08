package X;

import X.C05YF;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1648750t0T<T extends C05YF> extends AbstractC2255721DQs<T> implements InterfaceC1653990t8v, InterfaceC379610EuV {
    public static final int LLILLL = 8;
    public final Function2<InterfaceC1653800t8c, InterfaceC1653990t8v, Unit> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1150));

    public final InterfaceC1653800t8c X1() {
        return (InterfaceC1653800t8c) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        W1().invoke(X1(), this);
        super.onCreate();
    }

    public Function2<InterfaceC1653800t8c, InterfaceC1653990t8v, Unit> W1() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1648750t0T(Function2<? super InterfaceC1653800t8c, ? super InterfaceC1653990t8v, Unit> function2) {
        this.LL = function2;
    }
}
