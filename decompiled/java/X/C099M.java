package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.099M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C099M {
    public static final <T> InterfaceC1364105Vn<T> LIZJ(final InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        final CoroutineContext context = interfaceC1364105Vn.getContext();
        if (context == C23271099x.INSTANCE) {
            return new AbstractC23141094x(interfaceC1364105Vn) { // from class: X.099P
                @Override // njp.a
                public Object invokeSuspend(Object obj) {
                    C155000ia.LIZIZ(obj);
                    return obj;
                }
            };
        }
        return new AbstractC23140094w(interfaceC1364105Vn, context) { // from class: X.099O
            @Override // njp.a
            public Object invokeSuspend(Object obj) {
                C155000ia.LIZIZ(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> InterfaceC1364105Vn<T> LIZLLL(InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        AbstractC23140094w abstractC23140094w;
        InterfaceC1364105Vn<T> interfaceC1364105Vn2;
        if ((interfaceC1364105Vn instanceof AbstractC23140094w) && (abstractC23140094w = (AbstractC23140094w) interfaceC1364105Vn) != null && (interfaceC1364105Vn2 = (InterfaceC1364105Vn<T>) abstractC23140094w.intercepted()) != null) {
            return interfaceC1364105Vn2;
        }
        return interfaceC1364105Vn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> InterfaceC1364105Vn<Unit> LIZ(final Function1<? super InterfaceC1364105Vn<? super T>, ? extends Object> function1, final InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C099Q.LIZ(interfaceC1364105Vn);
        if (function1 instanceof a) {
            return ((a) function1).create(interfaceC1364105Vn);
        }
        final CoroutineContext context = interfaceC1364105Vn.getContext();
        if (context == C23271099x.INSTANCE) {
            return new AbstractC23141094x(interfaceC1364105Vn) { // from class: X.099L
                public int LL;

                @Override // njp.a
                public Object invokeSuspend(Object obj) {
                    int i = this.LL;
                    if (i != 0) {
                        if (i == 1) {
                            this.LL = 2;
                            C155000ia.LIZIZ(obj);
                            return obj;
                        }
                        "This coroutine had already completed".toString();
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.LL = 1;
                    C155000ia.LIZIZ(obj);
                    Function1 function12 = function1;
                    C19719512Dh.LJ(1, function12);
                    return function12.invoke(this);
                }
            };
        }
        return new AbstractC23140094w(interfaceC1364105Vn, context) { // from class: X.099N
            public int LL;

            @Override // njp.a
            public Object invokeSuspend(Object obj) {
                int i = this.LL;
                if (i != 0) {
                    if (i == 1) {
                        this.LL = 2;
                        C155000ia.LIZIZ(obj);
                        return obj;
                    }
                    "This coroutine had already completed".toString();
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.LL = 1;
                C155000ia.LIZIZ(obj);
                Function1 function12 = function1;
                C19719512Dh.LJ(1, function12);
                return function12.invoke(this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> InterfaceC1364105Vn<Unit> LIZIZ(final Function2<? super R, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, final R r, final InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C099Q.LIZ(interfaceC1364105Vn);
        if (function2 instanceof a) {
            return ((a) function2).create(r, interfaceC1364105Vn);
        }
        final CoroutineContext context = interfaceC1364105Vn.getContext();
        if (context == C23271099x.INSTANCE) {
            return new AbstractC23141094x(interfaceC1364105Vn) { // from class: X.099J
                public int LL;

                @Override // njp.a
                public Object invokeSuspend(Object obj) {
                    int i = this.LL;
                    if (i != 0) {
                        if (i == 1) {
                            this.LL = 2;
                            C155000ia.LIZIZ(obj);
                            return obj;
                        }
                        "This coroutine had already completed".toString();
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.LL = 1;
                    C155000ia.LIZIZ(obj);
                    Function2 function22 = function2;
                    C19719512Dh.LJ(2, function22);
                    return function22.invoke(r, this);
                }
            };
        }
        return new AbstractC23140094w(interfaceC1364105Vn, context) { // from class: X.099K
            public int LL;

            @Override // njp.a
            public Object invokeSuspend(Object obj) {
                int i = this.LL;
                if (i != 0) {
                    if (i == 1) {
                        this.LL = 2;
                        C155000ia.LIZIZ(obj);
                        return obj;
                    }
                    "This coroutine had already completed".toString();
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.LL = 1;
                C155000ia.LIZIZ(obj);
                Function2 function22 = function2;
                C19719512Dh.LJ(2, function22);
                return function22.invoke(r, this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, P, T> Object LJ(InterfaceC1631620sYq<? super R, ? super P, ? super InterfaceC1364105Vn<? super T>, ? extends Object> interfaceC1631620sYq, R r, P p, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C099Q.LIZ(interfaceC1364105Vn);
        InterfaceC1364105Vn interfaceC1364105VnLIZJ = LIZJ(interfaceC1364105Vn);
        C19719512Dh.LJ(3, interfaceC1631620sYq);
        return interfaceC1631620sYq.invoke(r, p, interfaceC1364105VnLIZJ);
    }
}
