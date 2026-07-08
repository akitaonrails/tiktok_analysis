package X;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.1DEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252641DEw {
    public static final C09AU LIZ = new C09AU("UNDEFINED");
    public static final C09AU LIZIZ = new C09AU("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final void LIZ(Object obj, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object completedExceptionally;
        C23251099d<?> c23251099dLIZJ;
        if (interfaceC1364105Vn instanceof C2252621DEu) {
            C2252621DEu c2252621DEu = (C2252621DEu) interfaceC1364105Vn;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            if (thM5exceptionOrNullimpl == null) {
                if (function1 != null) {
                    completedExceptionally = new C1165404hA(function1, obj);
                } else {
                    completedExceptionally = obj;
                }
            } else {
                completedExceptionally = new CompletedExceptionally(thM5exceptionOrNullimpl, false, 2, null);
            }
            if (c2252621DEu.LLILZ.isDispatchNeeded(c2252621DEu.getContext())) {
                c2252621DEu.LLILZLL = completedExceptionally;
                c2252621DEu.LLILLL = 1;
                C0WQQ.LIZ(c2252621DEu.LLILZ, c2252621DEu.getContext(), c2252621DEu);
                return;
            }
            AbstractC2252601DEs abstractC2252601DEsLIZ = C23262099o.LIZ();
            if (abstractC2252601DEsLIZ.isUnconfinedLoopActive()) {
                c2252621DEu.LLILZLL = completedExceptionally;
                c2252621DEu.LLILLL = 1;
                abstractC2252601DEsLIZ.dispatchUnconfined(c2252621DEu);
                return;
            }
            abstractC2252601DEsLIZ.incrementUseCount(true);
            try {
                C09AE c09ae = (C09AE) c2252621DEu.getContext().get(C09AE.LJJLJ);
                if (c09ae != null && !c09ae.isActive()) {
                    CancellationException cancellationExceptionLJJJLL = c09ae.LJJJLL();
                    c2252621DEu.LIZ(completedExceptionally, cancellationExceptionLJJJLL);
                    C098200Yq c098200Yq = new C098200Yq(cancellationExceptionLJJJLL);
                    C189200o6.m2constructorimpl(c098200Yq);
                    c2252621DEu.resumeWith(c098200Yq);
                } else {
                    InterfaceC1364105Vn<T> interfaceC1364105Vn2 = c2252621DEu.LLILZIL;
                    Object obj2 = c2252621DEu.LLIZ;
                    CoroutineContext context = interfaceC1364105Vn2.getContext();
                    Object objLIZJ = C09AQ.LIZJ(context, obj2);
                    if (objLIZJ != C09AQ.LIZ) {
                        c23251099dLIZJ = C23252099e.LIZJ(interfaceC1364105Vn2, context, objLIZJ);
                    } else {
                        c23251099dLIZJ = null;
                    }
                    try {
                        c2252621DEu.LLILZIL.resumeWith(obj);
                        if (c23251099dLIZJ == null || c23251099dLIZJ.LJLJJL()) {
                            C09AQ.LIZ(context, objLIZJ);
                        }
                    } catch (Throwable th) {
                        if (c23251099dLIZJ == null || c23251099dLIZJ.LJLJJL()) {
                            C09AQ.LIZ(context, objLIZJ);
                        }
                        throw th;
                    }
                }
                while (abstractC2252601DEsLIZ.processUnconfinedEvent()) {
                }
            } finally {
                try {
                } finally {
                }
            }
            return;
        }
        interfaceC1364105Vn.resumeWith(obj);
    }
}
