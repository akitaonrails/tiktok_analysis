package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.099V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C099V {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static C099V valueOf(String str) {
        return (C099V) C08FF.LIZ(C099V.class, str);
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <T> void invoke(Function1<? super InterfaceC1364105Vn<? super T>, ? extends Object> function1, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        int i = C099X.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return;
                }
                C099Q.LIZ(interfaceC1364105Vn);
                try {
                    CoroutineContext context = interfaceC1364105Vn.getContext();
                    Object objLIZJ = C09AQ.LIZJ(context, null);
                    try {
                        C19719512Dh.LJ(1, function1);
                        Object objInvoke = function1.invoke(interfaceC1364105Vn);
                        if (objInvoke != C099R.LJFF()) {
                            C189200o6.m2constructorimpl(objInvoke);
                            interfaceC1364105Vn.resumeWith(objInvoke);
                            return;
                        }
                        return;
                    } finally {
                        C09AQ.LIZ(context, objLIZJ);
                    }
                } catch (Throwable th) {
                    return;
                }
            }
            C099U.LIZIZ(function1, interfaceC1364105Vn);
            return;
        }
        try {
            InterfaceC1364105Vn interfaceC1364105VnLIZLLL = C099M.LIZLLL(C099M.LIZ(function1, interfaceC1364105Vn));
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            C2252641DEw.LIZ(unit, null, interfaceC1364105VnLIZLLL);
        } finally {
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(Function2<? super R, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, R r, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        int i = C099X.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return;
                }
                C099Q.LIZ(interfaceC1364105Vn);
                try {
                    CoroutineContext context = interfaceC1364105Vn.getContext();
                    Object objLIZJ = C09AQ.LIZJ(context, null);
                    try {
                        C19719512Dh.LJ(2, function2);
                        Object objInvoke = function2.invoke(r, interfaceC1364105Vn);
                        if (objInvoke != C099R.LJFF()) {
                            C189200o6.m2constructorimpl(objInvoke);
                            interfaceC1364105Vn.resumeWith(objInvoke);
                            return;
                        }
                        return;
                    } finally {
                        C09AQ.LIZ(context, objLIZJ);
                    }
                } catch (Throwable th) {
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                    return;
                }
            }
            C099U.LIZJ(function2, r, interfaceC1364105Vn);
            return;
        }
        C099T.LIZ(function2, r, interfaceC1364105Vn);
    }
}
