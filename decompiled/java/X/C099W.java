package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.099W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C099W {
    public static final <T, V> Object LIZ(CoroutineContext coroutineContext, V v, Object obj, Function2<? super V, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        Object objLIZJ = C09AQ.LIZJ(coroutineContext, obj);
        try {
            C099Y c099y = new C099Y(interfaceC1364105Vn, coroutineContext);
            C19719512Dh.LJ(2, function2);
            Object objInvoke = function2.invoke(v, c099y);
            C09AQ.LIZ(coroutineContext, objLIZJ);
            if (objInvoke == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            return objInvoke;
        } catch (Throwable th) {
            C09AQ.LIZ(coroutineContext, objLIZJ);
            throw th;
        }
    }
}
