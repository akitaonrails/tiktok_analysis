package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.198o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214908198o {
    @InterfaceC1294060jmO
    public static void LIZ(InterfaceC214902198i interfaceC214902198i) {
        if (interfaceC214902198i == null) {
            return;
        }
        WeakHashMap<InterfaceC214902198i, List<C214906198m>> weakHashMap = C480900ItU.LIZ;
        synchronized (weakHashMap) {
            try {
                List<C214906198m> list = weakHashMap.get(interfaceC214902198i);
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                Iterator<C214906198m> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().hookHideTemporary$saf_release();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
