package X;

import X.AbstractC1541130qCt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1541130qCt<T extends AbstractC1541130qCt<T>> implements InterfaceC1541360qDG, InterfaceC1541260qD6 {
    public final C1541080qCo<?> LIZ;
    public Function2<? super InterfaceC1541240qD4, ? super EnumC1541200qD0, Unit> LIZIZ;
    public final C08AB LIZJ;

    public boolean LIZ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    public abstract boolean LIZIZ();

    public abstract boolean LJ(T t);

    public abstract boolean LJFF(InterfaceC1541240qD4 interfaceC1541240qD4);

    public AbstractC1541130qCt(C1541080qCo<?> c1541080qCo) {
        this.LIZ = c1541080qCo;
        this.LIZJ = c1541080qCo.LJIIL;
    }

    public boolean LIZJ(C1540930qCZ c1540930qCZ) {
        return LIZ(c1540930qCZ);
    }

    public final void LIZLLL(InterfaceC1541240qD4 interfaceC1541240qD4, EnumC1541200qD0 enumC1541200qD0) {
        Function2<? super InterfaceC1541240qD4, ? super EnumC1541200qD0, Unit> function2 = this.LIZIZ;
        this.LIZIZ = null;
        if (function2 != null) {
            function2.invoke(interfaceC1541240qD4, enumC1541200qD0);
        }
    }
}
