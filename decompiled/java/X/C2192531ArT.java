package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ArT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192531ArT<Q> implements InterfaceC2192541ArU<Q> {
    public final Object LIZ;
    public final InterfaceC1631620sYq<Object, C1DEF<?>, Object, Unit> LIZIZ;
    public final InterfaceC1631620sYq<Object, Object, Object, Object> LIZJ;
    public final InterfaceC1631620sYq<C1DEF<?>, Object, Object, Function1<Throwable, Unit>> LIZLLL;

    @Override // X.InterfaceC2192551ArV
    public final InterfaceC1631620sYq<C1DEF<?>, Object, Object, Function1<Throwable, Unit>> LIZ() {
        return this.LIZLLL;
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
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2192531ArT(Object obj, InterfaceC1631620sYq<Object, ? super C1DEF<?>, Object, Unit> interfaceC1631620sYq, InterfaceC1631620sYq<Object, Object, Object, ? extends Object> interfaceC1631620sYq2, InterfaceC1631620sYq<? super C1DEF<?>, Object, Object, ? extends Function1<? super Throwable, Unit>> interfaceC1631620sYq3) {
        this.LIZ = obj;
        this.LIZIZ = interfaceC1631620sYq;
        this.LIZJ = interfaceC1631620sYq2;
        this.LIZLLL = interfaceC1631620sYq3;
    }
}
