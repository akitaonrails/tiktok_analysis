package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895720zQo {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final List<InterfaceC1895740zQq> LIZ = new ArrayList();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC1879320z0M LJ = RunnableC1879320z0M.LL;
    public static final C1895730zQp LJFF = new C1895730zQp();

    public static void LIZIZ() {
        if (LIZJ) {
            LIZJ = false;
            LIZIZ.removeCallbacks(LJ);
        }
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1895740zQq) it2.next()).LIZ();
        }
        ((ArrayList) LIZ).clear();
        LIZJ = false;
        LIZLLL = false;
    }

    public static void LIZJ() {
        C786410Ut5.LJLIIL(((C1899200zWQ.LIZ(C1899200zWQ.LIZ) + ((long) 86400)) - ((long) C1899200zWQ.LIZIZ())) * 1000, LIZIZ, new RunnableC1869980ylI(LJFF));
    }

    public static void LIZLLL() {
        if (!LIZJ) {
            LIZJ = true;
            C786410Ut5.LJLIIL(1000L, LIZIZ, LJ);
        }
        if (LIZLLL) {
            return;
        }
        LIZLLL = true;
        LIZJ();
    }

    public static void LIZ(InterfaceC1895740zQq interfaceC1895740zQq) {
        ArrayList arrayList = (ArrayList) LIZ;
        if (arrayList.contains(interfaceC1895740zQq)) {
            return;
        }
        arrayList.add(interfaceC1895740zQq);
        if (!arrayList.isEmpty()) {
            LIZLLL();
        }
    }
}
