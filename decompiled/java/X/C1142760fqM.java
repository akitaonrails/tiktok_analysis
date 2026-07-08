package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0fqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142760fqM implements InterfaceC1142710fqH<String>, InterfaceC1142800fqQ<String> {
    public final InterfaceC1142710fqH<String> LIZ;
    public InterfaceC1142800fqQ<String> LIZIZ;
    public C1142810fqR LIZJ;

    public C1142760fqM(C1142770fqN c1142770fqN) {
        this.LIZ = c1142770fqN;
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZ(C1139230fkf c1139230fkf, String str) {
        String str2 = str;
        String strSubstring = null;
        try {
            strSubstring = str2.substring(0, str2.lastIndexOf("/"));
            C2111408Oy.LIZ(str2, strSubstring);
            InterfaceC1142800fqQ<String> interfaceC1142800fqQ = this.LIZIZ;
            if (interfaceC1142800fqQ != null) {
                interfaceC1142800fqQ.LIZ(c1139230fkf, strSubstring);
            }
            new C0VSJ(str2).delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(c1139230fkf, new C1139330fkp("unzip exception", e, c1139230fkf));
            if (strSubstring != null) {
                C1142880fqY.LIZJ(new C0VSJ(strSubstring));
            }
        }
        if (this.LIZJ != null) {
            long jNanoTime = System.nanoTime();
            Iterator it2 = ((CopyOnWriteArrayList) C1142700fqG.LJFF().LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1142750fqL) it2.next()).LIZJ(jNanoTime, c1139230fkf);
            }
        }
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZIZ(C1139230fkf c1139230fkf, int i) {
        InterfaceC1142800fqQ<String> interfaceC1142800fqQ = this.LIZIZ;
        if (interfaceC1142800fqQ == null) {
            return;
        }
        interfaceC1142800fqQ.LIZIZ(c1139230fkf, i);
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZJ(C1139230fkf c1139230fkf, C1139250fkh c1139250fkh) {
        InterfaceC1142800fqQ<String> interfaceC1142800fqQ = this.LIZIZ;
        if (interfaceC1142800fqQ == null) {
            return;
        }
        interfaceC1142800fqQ.LIZJ(c1139230fkf, c1139250fkh);
    }

    @Override // X.InterfaceC1142710fqH
    public final void LIZLLL(C1139230fkf c1139230fkf, InterfaceC1142800fqQ<String> interfaceC1142800fqQ) {
        this.LIZIZ = interfaceC1142800fqQ;
        this.LIZ.LIZLLL(c1139230fkf, this);
    }
}
