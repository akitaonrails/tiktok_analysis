package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810310VqX {
    public final TreeMap<C810290VqV, C810290VqV> LIZIZ = new TreeMap<>(new Comparator<C810290VqV>() { // from class: X.0VqW
        @Override // java.util.Comparator
        public final int compare(C810290VqV c810290VqV, C810290VqV c810290VqV2) {
            C810290VqV c810290VqV3 = c810290VqV;
            C810290VqV c810290VqV4 = c810290VqV2;
            if (c810290VqV3 == null) {
                return 1;
            }
            if (c810290VqV4 != null) {
                if (c810290VqV3.equals(c810290VqV4)) {
                    return 0;
                }
                if (c810290VqV3.LIZIZ > c810290VqV4.LIZIZ) {
                    return 1;
                }
                return -1;
            }
            return -1;
        }
    });
    public final int LIZ = 20;

    public final synchronized String LIZJ() {
        String string;
        string = "";
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<Map.Entry<C810290VqV, C810290VqV>> it2 = this.LIZIZ.entrySet().iterator();
            int i = 0;
            while (it2.hasNext()) {
                C810290VqV value = it2.next().getValue();
                if (value != null) {
                    if (i != r4.size() - 1) {
                        sb.append(value.toString());
                        sb.append(e3.g);
                    } else {
                        sb.append(value.toString());
                    }
                    i++;
                }
            }
            string = sb.toString();
            Logger.debug();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return string;
    }

    public final synchronized void LIZ(C810290VqV c810290VqV) {
        try {
            Logger.debug();
            if (Logger.debug()) {
                LIZJ();
            }
            if (this.LIZIZ.size() >= this.LIZ && !LIZIZ(c810290VqV)) {
                Logger.debug();
                TreeMap<C810290VqV, C810290VqV> treeMap = this.LIZIZ;
                treeMap.remove(treeMap.firstKey());
            }
            if (LIZIZ(c810290VqV)) {
                Logger.debug();
                this.LIZIZ.remove(c810290VqV);
            }
            this.LIZIZ.put(c810290VqV, c810290VqV);
            if (Logger.debug()) {
                LIZJ();
            }
            Logger.debug();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized boolean LIZIZ(C810290VqV c810290VqV) {
        boolean zContainsKey;
        zContainsKey = this.LIZIZ.containsKey(c810290VqV);
        Logger.debug();
        return zContainsKey;
    }
}
