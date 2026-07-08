package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13A0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13A0 {
    public static C13A0 LIZLLL;
    public C13A1 LIZ;
    public boolean LIZIZ;
    public final List<InterfaceC199653139v> LIZJ = new ArrayList();

    public final List<C2031807xc> LIZ() {
        C13A1 c13a1;
        if (!this.LIZIZ || (c13a1 = this.LIZ) == null) {
            return null;
        }
        while (true) {
            C2031807xc c2031807xc = (C2031807xc) c13a1.LIZIZ.poll();
            if (c2031807xc == null) {
                break;
            }
            ((ConcurrentHashMap) c13a1.LIZ).remove(c2031807xc.LIZ);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : ((ConcurrentHashMap) c13a1.LIZ).values()) {
            obj.getClass();
            arrayList.add(obj);
        }
        return arrayList;
    }
}
