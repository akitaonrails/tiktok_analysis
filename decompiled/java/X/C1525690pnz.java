package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0pnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525690pnz {
    public final C809910Vpt LIZ;
    public final InterfaceC809840Vpm LIZIZ;
    public final List<InterfaceC596980NbE> LIZJ = new ArrayList();
    public final List<InterfaceC1525710po1> LIZLLL = new ArrayList();
    public final InterfaceC1525700po0 LJ;

    public final Object[] LIZJ() {
        Object[] array;
        synchronized (this.LIZJ) {
            try {
                array = ((ArrayList) this.LIZJ).size() > 0 ? ((ArrayList) this.LIZJ).toArray() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return array;
    }

    public final void LIZ(List<InterfaceC596980NbE> list) {
        boolean z;
        InterfaceC1525700po0 interfaceC1525700po0;
        synchronized (this.LIZJ) {
            try {
                ArrayList<InterfaceC596980NbE> arrayList = new ArrayList(list);
                synchronized (this.LIZJ) {
                    try {
                        z = false;
                        for (InterfaceC596980NbE interfaceC596980NbE : arrayList) {
                            if (interfaceC596980NbE != null && !((ArrayList) this.LIZJ).contains(interfaceC596980NbE)) {
                                ((ArrayList) this.LIZJ).add(interfaceC596980NbE);
                                z = true;
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && (interfaceC1525700po0 = this.LJ) != null) {
            long j = this.LIZ.LIZ;
            C1525590pnp c1525590pnp = ((C1526280pow) interfaceC1525700po0).LJI;
            c1525590pnp.LIZJ().removeMessages(102);
            C786410Ut5.LJLJLJ(c1525590pnp.LIZJ(), c1525590pnp.LIZJ().obtainMessage(102), 50L);
            c1525590pnp.LJFF(0, j, 50L);
        }
    }

    public final void LIZIZ(List<InterfaceC1525710po1> list) {
        synchronized (this.LIZLLL) {
            try {
                ArrayList<InterfaceC1525710po1> arrayList = new ArrayList(list);
                synchronized (this.LIZLLL) {
                    try {
                        for (InterfaceC1525710po1 interfaceC1525710po1 : arrayList) {
                            if (interfaceC1525710po1 != null && !((ArrayList) this.LIZLLL).contains(interfaceC1525710po1)) {
                                ((ArrayList) this.LIZLLL).add(interfaceC1525710po1);
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1525690pnz(C809910Vpt c809910Vpt, C1525680pny c1525680pny, InterfaceC1525700po0 interfaceC1525700po0) {
        this.LIZ = c809910Vpt;
        this.LIZIZ = c1525680pny;
        this.LJ = interfaceC1525700po0;
    }
}
