package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS28S0101000_17;
import Y.ARunnableS86S0200000_17;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0fqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142730fqJ implements InterfaceC1142800fqQ<String> {
    public static int LJFF;
    public static int LJI;
    public static C1129890fVb LJII;
    public static final C1142730fqJ LIZ = new C1142730fqJ();
    public static final List<InterfaceC1142750fqL> LIZJ = new ArrayList();
    public static final Deque<C1139230fkf> LIZLLL = new ArrayDeque();
    public static final Map<String, C1139310fkn> LIZIZ = new HashMap();
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZLLL() {
        C1129890fVb c1129890fVb = LJII;
        if (c1129890fVb == null) {
            throw new IllegalStateException("Gift Resource config has to be initialized");
        }
        if (c1129890fVb.LIZ == null) {
            throw new IllegalStateException("File Cache Factory has to be initialized");
        }
        if (c1129890fVb.LIZIZ == null) {
            throw new IllegalStateException("Producer Factory has to be initialized");
        }
    }

    public final void LJFF() {
        InterfaceC1142740fqK interfaceC1142740fqK;
        int i;
        int i2 = LJFF;
        C1129890fVb c1129890fVb = LJII;
        if (i2 >= (c1129890fVb != null ? c1129890fVb.LIZLLL : 0)) {
            return;
        }
        ArrayDeque arrayDeque = (ArrayDeque) LIZLLL;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int i3 = LJI;
        C1129890fVb c1129890fVb2 = LJII;
        if (c1129890fVb2 == null || 1 > (i = c1129890fVb2.LJ) || i > i3) {
            LJFF++;
            C1139230fkf c1139230fkf = (C1139230fkf) arrayDeque.poll();
            C1129890fVb c1129890fVb3 = LJII;
            ((c1129890fVb3 == null || (interfaceC1142740fqK = c1129890fVb3.LIZIZ) == null) ? null : interfaceC1142740fqK.LIZ(c1139230fkf, c1129890fVb3)).LIZLLL(c1139230fkf, this);
            return;
        }
        arrayDeque.iterator();
        while (true) {
            ArrayDeque arrayDeque2 = (ArrayDeque) LIZLLL;
            if (arrayDeque2.peek() == null) {
                LJI = 0;
                return;
            }
            C1139230fkf c1139230fkf2 = (C1139230fkf) arrayDeque2.poll();
            C1139310fkn c1139310fkn = (C1139310fkn) ((HashMap) LIZIZ).get(c1139230fkf2.LIZ);
            if (c1139310fkn != null) {
                Iterator it2 = ((CopyOnWriteArrayList) c1139310fkn.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1142720fqI) it2.next()).LIZ(c1139230fkf2.LIZIZ);
                }
                ((HashMap) LIZIZ).remove(c1139230fkf2.LIZ);
            }
        }
    }

    public static final String LJ(C1139230fkf c1139230fkf) {
        String strLIZIZ;
        InterfaceC1138850fk3 interfaceC1138850fk3;
        C1129890fVb c1129890fVb = LJII;
        if (c1129890fVb != null && (interfaceC1138850fk3 = c1129890fVb.LIZ) != null) {
            strLIZIZ = interfaceC1138850fk3.LIZIZ(c1139230fkf);
        } else {
            strLIZIZ = null;
        }
        String strLIZ = C1142880fqY.LIZ(strLIZIZ);
        if (!c1139230fkf.LJFF) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append(C08HI.LIZ(c1139230fkf.LIZJ[0]));
                strLIZ = C2188811AlT.LIZIZ(sbLIZ);
                return strLIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strLIZ;
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZ(C1139230fkf c1139230fkf, String str) {
        String strLIZIZ;
        InterfaceC1138850fk3 interfaceC1138850fk3;
        LIZLLL();
        C1129890fVb c1129890fVb = LJII;
        if (c1129890fVb != null && (interfaceC1138850fk3 = c1129890fVb.LIZ) != null) {
            strLIZIZ = interfaceC1138850fk3.LIZIZ(c1139230fkf);
        } else {
            strLIZIZ = null;
        }
        String strLIZ = C1142880fqY.LIZ(strLIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(".fetched");
        try {
            new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).createNewFile();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C786410Ut5.LJJZZIII(LJ, new ARunnableS117S0100000_17(c1139230fkf, 163));
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZIZ(C1139230fkf c1139230fkf, int i) {
        C786410Ut5.LJJZZIII(LJ, new ARunnableS28S0101000_17(i, c1139230fkf, 8));
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZJ(C1139230fkf c1139230fkf, C1139250fkh c1139250fkh) {
        C786410Ut5.LJJZZIII(LJ, new ARunnableS86S0200000_17(c1139230fkf, c1139250fkh, 40));
    }
}
