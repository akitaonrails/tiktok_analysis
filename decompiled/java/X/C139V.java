package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.139V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C139V {
    public final Set<AbstractC1387200mCc> LIZ = Collections.newSetFromMap(new WeakHashMap());
    public final List<InterfaceC861690XrD> LIZIZ = new ArrayList();
    public final List<InterfaceC1688840u38> LIZJ = new ArrayList();
    public int LIZLLL = 0;
    public boolean LJ = false;

    public final void LIZIZ() {
        if (!this.LJ) {
            throw new IllegalStateException("call this method after CreativeActivityMonitor is inited!");
        }
    }

    public final boolean LIZ(InterfaceC1394580mOW<Object> interfaceC1394580mOW) {
        Set linkedHashSet;
        LIZIZ();
        if (((Boolean) C0AQ9.LIZ.getValue()).booleanValue()) {
            synchronized (this.LIZ) {
                try {
                    this.LIZ.size();
                    linkedHashSet = new LinkedHashSet(this.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            linkedHashSet = this.LIZ;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            if (interfaceC1394580mOW.apply(((AbstractC1387200mCc) it2.next()).LIZ)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ(C1688830u37 c1688830u37) {
        for (InterfaceC1688840u38 interfaceC1688840u38 : new ArrayList(this.LIZJ)) {
            if (interfaceC1688840u38 != null) {
                interfaceC1688840u38.LIZ(c1688830u37);
            }
        }
    }

    public final void LIZLLL(int i) {
        for (InterfaceC861690XrD interfaceC861690XrD : new ArrayList(this.LIZIZ)) {
            if (interfaceC861690XrD != null) {
                interfaceC861690XrD.onAppStateChanged(i);
            }
        }
    }
}
