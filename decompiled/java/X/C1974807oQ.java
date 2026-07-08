package X;

import android.os.SystemClock;
import com.bytedance.common.jato.memory.HeapReferenceCutter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.07oQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1974807oQ implements InterfaceC1974907oR {
    public final Map<String, C2031807xc> LIZ = new HashMap();
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final boolean LIZ(List<C2031807xc> list) {
        Object objLIZ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
            try {
                Iterator it2 = ((HashMap) this.LIZ).entrySet().iterator();
                while (it2.hasNext()) {
                    if (((C2031807xc) ((Map.Entry) it2.next()).getValue()).LIZ() == null) {
                        it2.remove();
                    }
                }
                for (C2031807xc c2031807xc : list) {
                    if (SystemClock.elapsedRealtime() - c2031807xc.LIZIZ >= this.LIZJ && (objLIZ = c2031807xc.LIZ()) != null) {
                        if (this.LIZLLL) {
                            arrayList.add(objLIZ);
                        } else {
                            String name = objLIZ.getClass().getName();
                            C2031807xc c2031807xc2 = (C2031807xc) ((HashMap) this.LIZ).get(name);
                            if (c2031807xc2 == null) {
                                ((HashMap) this.LIZ).put(name, c2031807xc);
                            } else {
                                Object objLIZ2 = c2031807xc2.LIZ();
                                if (objLIZ2 == null) {
                                    ((HashMap) this.LIZ).put(name, c2031807xc);
                                } else if (!c2031807xc.LIZ.equals(c2031807xc2.LIZ) && objLIZ2 != objLIZ) {
                                    arrayList.add(objLIZ);
                                    arrayList2.add(objLIZ2);
                                }
                            }
                        }
                    }
                }
                if (arrayList.size() < this.LIZIZ) {
                    return false;
                }
                try {
                    if (arrayList2.isEmpty()) {
                        HeapReferenceCutter.LIZIZ(arrayList.toArray());
                    } else {
                        HeapReferenceCutter.LIZ(arrayList.toArray(), arrayList2.toArray());
                    }
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1974807oQ(int i, int i2, boolean z) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
    }
}
