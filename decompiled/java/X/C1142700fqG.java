package X;

import Y.ARunnableS23S0201000_17;
import Y.ARunnableS50S0300000_17;
import Y.ARunnableS86S0200000_17;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0fqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142700fqG implements InterfaceC1142800fqQ<String> {
    public static C1142700fqG LJIIIIZZ;
    public final C1129890fVb LIZIZ;
    public final List<InterfaceC1142750fqL> LIZJ = new CopyOnWriteArrayList();
    public final Deque<C1139230fkf> LIZLLL = new ArrayDeque();
    public final Map<String, Pair<Boolean, Long>> LJ = new ConcurrentHashMap();
    public int LJI = 0;
    public int LJII = 0;
    public final Map<String, C1139310fkn> LIZ = new HashMap();
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());

    public static C1142700fqG LJFF() {
        C1142700fqG c1142700fqG = LJIIIIZZ;
        if (c1142700fqG != null) {
            return c1142700fqG;
        }
        throw new IllegalStateException("GiftResourceManager is not initialized");
    }

    public final void LJII() {
        C1139230fkf c1139230fkf;
        if (this.LJI >= this.LIZIZ.LIZLLL || ((ArrayDeque) this.LIZLLL).isEmpty() || (c1139230fkf = (C1139230fkf) ((ArrayDeque) this.LIZLLL).poll()) == null) {
            return;
        }
        if (c1139230fkf.LJIIIZ && LJI(c1139230fkf)) {
            String str = c1139230fkf.LIZ;
            String strLIZLLL = LIZLLL(c1139230fkf);
            C1139310fkn c1139310fkn = (C1139310fkn) ((HashMap) this.LIZ).get(str);
            if (c1139310fkn != null) {
                Iterator it2 = ((CopyOnWriteArrayList) c1139310fkn.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1142720fqI) it2.next()).LIZJ(c1139230fkf.LIZIZ, strLIZLLL);
                }
            }
            ((HashMap) this.LIZ).remove(str);
            return;
        }
        C1129890fVb c1129890fVb = this.LIZIZ;
        int i = c1129890fVb.LJ;
        if (i <= 0 || this.LJII < i) {
            this.LJI++;
            c1129890fVb.LIZIZ.LIZ(c1139230fkf, c1129890fVb).LIZLLL(c1139230fkf, this);
            return;
        }
        ((ArrayDeque) this.LIZLLL).iterator();
        while (((ArrayDeque) this.LIZLLL).peek() != null) {
            C1139230fkf c1139230fkf2 = (C1139230fkf) ((ArrayDeque) this.LIZLLL).poll();
            C1139310fkn c1139310fkn2 = (C1139310fkn) ((HashMap) this.LIZ).get(c1139230fkf2.LIZ);
            if (c1139310fkn2 != null) {
                Iterator it3 = ((CopyOnWriteArrayList) c1139310fkn2.LIZIZ).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1142720fqI) it3.next()).LIZ(c1139230fkf2.LIZIZ);
                }
                ((HashMap) this.LIZ).remove(c1139230fkf2.LIZ);
            }
        }
        this.LJII = 0;
    }

    public C1142700fqG(C1129890fVb c1129890fVb) {
        this.LIZIZ = c1129890fVb;
    }

    public final String LIZLLL(C1139230fkf c1139230fkf) {
        String strLIZ = C1142880fqY.LIZ(this.LIZIZ.LIZ.LIZIZ(c1139230fkf));
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

    public final boolean LJI(C1139230fkf c1139230fkf) {
        String str;
        if (c1139230fkf == null || (str = c1139230fkf.LIZ) == null) {
            return false;
        }
        Pair pair = (Pair) ((ConcurrentHashMap) this.LJ).get(str);
        if (pair != null) {
            this.LIZIZ.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - ((Long) pair.second).longValue();
            this.LIZIZ.getClass();
            if (jCurrentTimeMillis < 600000) {
                return ((Boolean) pair.first).booleanValue();
            }
        }
        String strLIZ = C1142880fqY.LIZ(this.LIZIZ.LIZ.LIZIZ(c1139230fkf));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(".fetched");
        boolean zExists = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists();
        ((ConcurrentHashMap) this.LJ).put(c1139230fkf.LIZ, new Pair(Boolean.valueOf(zExists), Long.valueOf(System.currentTimeMillis())));
        return zExists;
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZ(C1139230fkf c1139230fkf, String str) {
        String strLIZ = C1142880fqY.LIZ(this.LIZIZ.LIZ.LIZIZ(c1139230fkf));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(".fetched");
        try {
            new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).createNewFile();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((ConcurrentHashMap) this.LJ).put(c1139230fkf.LIZ, new Pair(Boolean.TRUE, Long.valueOf(System.currentTimeMillis())));
        C786410Ut5.LJJZZIII(this.LJFF, new ARunnableS86S0200000_17(this, c1139230fkf, 1));
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZIZ(C1139230fkf c1139230fkf, int i) {
        C786410Ut5.LJJZZIII(this.LJFF, new ARunnableS23S0201000_17(i, c1139230fkf, this, 0));
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZJ(C1139230fkf c1139230fkf, C1139250fkh c1139250fkh) {
        C786410Ut5.LJJZZIII(this.LJFF, new ARunnableS50S0300000_17(this, c1139230fkf, c1139250fkh, 0));
    }

    public final String LJ(C1139230fkf c1139230fkf, Boolean bool) {
        if (c1139230fkf == null) {
            return null;
        }
        if (LJI(c1139230fkf)) {
            return LIZLLL(c1139230fkf);
        }
        if (bool.booleanValue()) {
            String str = c1139230fkf.LIZ;
            if (!((HashMap) this.LIZ).containsKey(str)) {
                ((HashMap) this.LIZ).put(str, new C1139310fkn(c1139230fkf));
                c1139230fkf.LIZ();
                C1129890fVb c1129890fVb = this.LIZIZ;
                c1129890fVb.LIZIZ.LIZ(c1139230fkf, c1129890fVb).LIZLLL(c1139230fkf, this);
            }
        }
        return null;
    }
}
