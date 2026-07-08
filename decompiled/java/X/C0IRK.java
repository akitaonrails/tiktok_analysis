package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0IRK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IRK<T> {
    public static C0IRK LIZIZ;
    public final Map<String, C0IRJ> LIZ = new ConcurrentHashMap();

    public static C0IRK LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C0IRK.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0IRK();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final C0IRJ LIZJ(String str) {
        C0IRJ c0irj = (C0IRJ) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c0irj == null) {
            C0IRJ c0irj2 = new C0IRJ();
            ((ConcurrentHashMap) this.LIZ).put(str, c0irj2);
            return c0irj2;
        }
        return c0irj;
    }

    public final Object LIZ(int i, Class cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls.getName());
        sbLIZ.append(i);
        C0IRJ c0irjLIZJ = LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (((ArrayList) c0irjLIZJ.LIZ).size() >= 1) {
            List list = c0irjLIZJ.LIZ;
            return ListProtector.remove(list, ((ArrayList) list).size() - 1);
        }
        return null;
    }

    public final void LIZLLL(int i, Object obj) {
        Class<?> cls = obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls.getName());
        sbLIZ.append(i);
        ArrayList arrayList = (ArrayList) LIZJ(C2188811AlT.LIZIZ(sbLIZ)).LIZ;
        int size = arrayList.size();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(cls.getName());
        sbLIZ2.append(i);
        if (size < LIZJ(C2188811AlT.LIZIZ(sbLIZ2)).LIZIZ && !arrayList.contains(obj)) {
            arrayList.add(obj);
        }
    }
}
