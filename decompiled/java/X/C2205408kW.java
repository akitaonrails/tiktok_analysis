package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2205408kW {
    public final C2205208kU LIZ;
    public final C08LG LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1661));

    public final void LIZ(EnumC2255871DRh enumC2255871DRh) {
        int iIntValue;
        C2205208kU c2205208kU = this.LIZ;
        String storageKey = enumC2255871DRh.getStorageKey();
        ReentrantLock reentrantLock = c2205208kU.LIZJ;
        reentrantLock.lock();
        try {
            Map<String, Map<String, Integer>> mapLIZJ = c2205208kU.LIZJ();
            String str = c2205208kU.LIZLLL.format(new Date());
            Map<String, Integer> linkedHashMap = mapLIZJ.get(storageKey);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                mapLIZJ.put(storageKey, linkedHashMap);
            }
            Map<String, Integer> map = linkedHashMap;
            Integer num = map.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map.put(str, Integer.valueOf(iIntValue + 1));
            if (c2205208kU.LIZIZ) {
                c2205208kU.LIZIZ(mapLIZJ);
            }
            reentrantLock.unlock();
            this.LIZIZ.LJ(enumC2255871DRh.getStorageKey());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public C2205408kW(C2205208kU c2205208kU, C08LG c08lg) {
        this.LIZ = c2205208kU;
        this.LIZIZ = c08lg;
    }
}
