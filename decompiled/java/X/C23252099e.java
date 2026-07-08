package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS286S0000000_3;

/* JADX INFO: renamed from: X.099e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23252099e {
    public static final CoroutineContext LIZIZ(InterfaceC497601wk interfaceC497601wk, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextLIZ = LIZ(interfaceC497601wk.getCoroutineContext(), coroutineContext, true);
        C1DFH c1dfh = C0PEM.LIZ;
        if (coroutineContextLIZ != c1dfh && coroutineContextLIZ.get(InterfaceC23139094v.LJJLIIJ) == null) {
            return coroutineContextLIZ.plus(c1dfh);
        }
        return coroutineContextLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    public static final CoroutineContext LIZ(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        AFwS286S0000000_3 aFwS286S0000000_3 = AFwS286S0000000_3.get$arr$(15);
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, aFwS286S0000000_3)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, aFwS286S0000000_3)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = coroutineContext2;
        C23271099x c23271099x = C23271099x.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(c23271099x, new C23254099g(c259800zU, z));
        if (zBooleanValue2) {
            c259800zU.element = ((CoroutineContext) c259800zU.element).fold(c23271099x, AFwS286S0000000_3.get$arr$(14));
        }
        return coroutineContext3.plus((CoroutineContext) c259800zU.element);
    }

    public static final C23251099d<?> LIZJ(InterfaceC1364105Vn<?> interfaceC1364105Vn, CoroutineContext coroutineContext, Object obj) {
        C23251099d<?> c23251099d = null;
        if (!(interfaceC1364105Vn instanceof InterfaceC23256099i) || coroutineContext.get(C23270099w.LL) == null) {
            return null;
        }
        InterfaceC23256099i callerFrame = (InterfaceC23256099i) interfaceC1364105Vn;
        while (true) {
            if ((callerFrame instanceof C23249099b) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                break;
            }
            if (callerFrame instanceof C23251099d) {
                c23251099d = (C23251099d) callerFrame;
                if (c23251099d != null) {
                    c23251099d.LJLJL(coroutineContext, obj);
                }
            }
        }
        return c23251099d;
    }
}
