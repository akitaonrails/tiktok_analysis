package X;

import android.util.SparseArray;
import com.bytedance.nita.memory.MemoryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0C87, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C87 implements Runnable {
    public static final C0C87 LL = new C0C87();

    public static void LIZ() {
        synchronized (MemoryManager.LLIZ) {
            try {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                int size = MemoryManager.LLILZ.size();
                for (int i = 0; i < size; i++) {
                    ArrayList<String> arrayList = MemoryManager.LLILZ;
                    String str = arrayList.get(i);
                    ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap2 = MemoryManager.LLILLJJLI.get(str);
                    if (concurrentHashMap2 != null) {
                        concurrentHashMap.put(str, concurrentHashMap2);
                    }
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("put remain ");
                    sbLIZ.append(arrayList.get(i));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clear all ");
                ConcurrentHashMap<String, ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>>> concurrentHashMap3 = MemoryManager.LLILLJJLI;
                sbLIZ2.append(concurrentHashMap3.size());
                C2188811AlT.LIZIZ(sbLIZ2);
                concurrentHashMap3.clear();
                concurrentHashMap3.putAll(concurrentHashMap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MemoryManager@d3f5.clearViewWhenLowMemory$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MemoryManager@d3f5.clearViewWhenLowMemory$1");
    }
}
