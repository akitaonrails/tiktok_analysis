package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475990oVp implements InterfaceC1476060oVw {
    public final String LIZ;
    public final ConcurrentHashMap<String, C1476010oVr> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1476030oVt
    public final List<InterfaceC1476030oVt> LIZ() {
        return C13LP.LLIIII(this.LIZIZ.values());
    }

    @Override // X.InterfaceC1476030oVt
    public final long LIZJ() {
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C1476010oVr) it2.next()).LIZJ;
        }
        return j;
    }

    @Override // X.InterfaceC1476030oVt
    public final long LIZLLL() {
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C1476010oVr) it2.next()).LIZIZ;
        }
        return j;
    }

    @Override // X.InterfaceC1476030oVt
    public final float LJ() {
        return C1476050oVv.LIZ(this);
    }

    @Override // X.InterfaceC1476030oVt
    public final String key() {
        return this.LIZ;
    }

    public C1475990oVp(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1476060oVw
    public final void LIZIZ(long j, long j2, String str) {
        C1476010oVr c1476010oVrPutIfAbsent;
        ConcurrentHashMap<String, C1476010oVr> concurrentHashMap = this.LIZIZ;
        C1476010oVr c1476010oVr = concurrentHashMap.get(str);
        if (c1476010oVr == null && (c1476010oVrPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1476010oVr = new C1476010oVr()))) != null) {
            c1476010oVr = c1476010oVrPutIfAbsent;
        }
        c1476010oVr.LIZIZ(j, j2, str);
    }
}
