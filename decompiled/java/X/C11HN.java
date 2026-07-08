package X;

import Y.AObserverS236S0100000_34;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11HN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11HN<T> implements C11HO<T> {
    public final LiveData<T> LIZ;
    public final Function0<T> LIZIZ;
    public final Function1<T, Unit> LIZJ;

    public final T LJI() {
        return this.LIZIZ.invoke();
    }

    public final T LJII() {
        return this.LIZIZ.invoke();
    }

    public final void LJIIIIZZ(T t) {
        this.LIZJ.invoke(t);
    }

    @Override // X.C11HO
    public final void LJFF(C11HP c11hp, AObserverS236S0100000_34 aObserverS236S0100000_34) {
        this.LIZ.observe(c11hp, new C11HM(new AwS608S0100000_29(aObserverS236S0100000_34, 768)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11HN(LiveData<T> liveData, Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        this.LIZ = liveData;
        this.LIZIZ = function0;
        this.LIZJ = function1;
    }
}
