package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS358S0000000_35;

/* JADX INFO: renamed from: X.1DE9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DE9 implements InterfaceC2192551ArV {
    public final Object LIZ;
    public final InterfaceC1631620sYq<Object, C1DEF<?>, Object, Unit> LIZIZ;
    public final InterfaceC1631620sYq<C1DEF<?>, Object, Object, Function1<Throwable, Unit>> LIZJ = null;
    public final AFwS358S0000000_35 LIZLLL = C1DEA.LIZ;

    @Override // X.InterfaceC2192551ArV
    public final InterfaceC1631620sYq<C1DEF<?>, Object, Object, Function1<Throwable, Unit>> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2192551ArV
    public final InterfaceC1631620sYq<Object, C1DEF<?>, Object, Unit> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2192551ArV
    public final Object LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2192551ArV
    public final InterfaceC1631620sYq<Object, Object, Object, Object> LIZLLL() {
        return this.LIZLLL;
    }

    public C1DE9(C1DEC c1dec, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LIZ = c1dec;
        this.LIZIZ = interfaceC1631620sYq;
    }
}
