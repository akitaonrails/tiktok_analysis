package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.1Beq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210181Beq {
    public final Map<Integer, CopyOnWriteArraySet<InterfaceC2211161BgQ>> LIZ = new ConcurrentHashMap();

    public final boolean LIZIZ(int i) {
        return !((ConcurrentHashMap) this.LIZ).containsKey(Integer.valueOf(i));
    }

    public final void LIZ(int i, InterfaceC2211161BgQ interfaceC2211161BgQ) {
        if (LIZIZ(i)) {
            ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(i), new CopyOnWriteArraySet());
        }
        if (interfaceC2211161BgQ != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.add(interfaceC2211161BgQ);
            }
        }
    }

    public final void LIZLLL(int i, String str, String str2) {
        if (LIZIZ(i)) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2211161BgQ) it2.next()).LIZ(str, str2);
        }
    }

    public final void LJ(int i, String str, String str2) {
        if (LIZIZ(i)) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2211161BgQ) it2.next()).LIZIZ(str, str2);
        }
    }

    public final void LIZJ(String str, String str2, int i, long j, String str3, String str4, long j2) {
        if (LIZIZ(i)) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2211161BgQ) it2.next()).LIZJ(j, j2, str, str2, str3, str4);
        }
    }
}
