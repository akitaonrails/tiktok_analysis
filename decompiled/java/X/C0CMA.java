package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CMA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CMA {
    public static Function2<? super CopyOnWriteArrayList<C0CM8>, ? super C0CME, Unit> LIZ;
    public static Function2<? super CopyOnWriteArrayList<C0CM8>, ? super C0CME, Unit> LIZIZ;
    public static Function2<? super CopyOnWriteArrayList<C0CM8>, ? super C0CME, Unit> LIZJ;

    public static void LIZ(C19EG c19eg, C0CME c0cme) {
        ((ConcurrentHashMap) c0cme.getCache$launcher_lazy_util_release().LIZJ.getValue()).remove(c19eg.getLocalClassName());
        ((ConcurrentHashMap) c0cme.getCache$launcher_lazy_util_release().LIZ.getValue()).remove(c19eg.getLocalClassName());
        ((ConcurrentHashMap) c0cme.getCache$launcher_lazy_util_release().LIZIZ.getValue()).remove(c19eg.getLocalClassName());
        LIZJ = null;
        LIZ = null;
        LIZIZ = null;
    }
}
