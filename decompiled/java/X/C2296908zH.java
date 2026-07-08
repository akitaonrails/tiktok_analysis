package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08zH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2296908zH {
    public static C23119094b LIZ() {
        return new C23119094b(null);
    }

    public static final <R> Object LIZIZ(Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super R>, ? extends Object> function2, final InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        final CoroutineContext context = interfaceC1364105Vn.getContext();
        C099Z<T> c099z = new C099Z<T>(interfaceC1364105Vn, context) { // from class: X.08zI
            @Override // kotlinx.coroutines.JobSupport
            public final boolean LJJIJL(Throwable th) {
                return false;
            }
        };
        Object objLIZ = C099C.LIZ(c099z, c099z, function2);
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
