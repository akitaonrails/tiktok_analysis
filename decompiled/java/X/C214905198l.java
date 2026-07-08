package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.198l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214905198l {
    public static final WeakHashMap<InterfaceC214902198i, List<AbstractC214914198u>> LIZ = new WeakHashMap<>();
    public static final WeakHashMap<AbstractC214914198u, WeakReference<InterfaceC214902198i>> LIZIZ = new WeakHashMap<>();

    public static void LIZ(InterfaceC214902198i interfaceC214902198i) {
        List<AbstractC214914198u> list;
        if (interfaceC214902198i == null) {
            return;
        }
        WeakHashMap<InterfaceC214902198i, List<AbstractC214914198u>> weakHashMap = LIZ;
        synchronized (weakHashMap) {
            try {
                list = weakHashMap.get(interfaceC214902198i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (list != null && !list.isEmpty()) {
            Iterator<AbstractC214914198u> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL();
            }
        }
    }

    public static void LIZIZ(InterfaceC214902198i interfaceC214902198i) {
        List<AbstractC214914198u> list;
        if (interfaceC214902198i == null) {
            return;
        }
        WeakHashMap<InterfaceC214902198i, List<AbstractC214914198u>> weakHashMap = LIZ;
        synchronized (weakHashMap) {
            try {
                list = weakHashMap.get(interfaceC214902198i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (list != null && !list.isEmpty()) {
            Iterator<AbstractC214914198u> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ();
            }
        }
    }

    public static void LIZLLL(AbstractC214914198u abstractC214914198u) {
        InterfaceC214902198i interfaceC214902198i;
        WeakHashMap<InterfaceC214902198i, List<AbstractC214914198u>> weakHashMap = LIZ;
        synchronized (weakHashMap) {
            try {
                WeakReference<InterfaceC214902198i> weakReferenceRemove = LIZIZ.remove(abstractC214914198u);
                if (weakReferenceRemove != null && (interfaceC214902198i = weakReferenceRemove.get()) != null) {
                    List<AbstractC214914198u> list = weakHashMap.get(interfaceC214902198i);
                    if (list != null) {
                        list.remove(abstractC214914198u);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(View view, AbstractC214914198u abstractC214914198u) {
        WeakHashMap<InterfaceC214902198i, List<AbstractC214914198u>> weakHashMap = LIZ;
        synchronized (weakHashMap) {
            try {
                WeakHashMap<AbstractC214914198u, WeakReference<InterfaceC214902198i>> weakHashMap2 = LIZIZ;
                if (weakHashMap2.get(abstractC214914198u) != null) {
                    return;
                }
                synchronized (weakHashMap) {
                    try {
                        InterfaceC214902198i interfaceC214902198iLIZ = C480900ItU.LIZ(view);
                        if (interfaceC214902198iLIZ == null) {
                            return;
                        }
                        List<AbstractC214914198u> list = weakHashMap.get(interfaceC214902198iLIZ);
                        if (list == null) {
                            weakHashMap.put(interfaceC214902198iLIZ, C1697810uHb.LJ(abstractC214914198u));
                        } else {
                            list.add(abstractC214914198u);
                        }
                        weakHashMap2.put(abstractC214914198u, new WeakReference<>(interfaceC214902198iLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
