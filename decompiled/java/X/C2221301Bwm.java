package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1Bwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2221301Bwm implements InterfaceC2221401Bww {
    public final EnumC1288180jcu LIZ;
    public final /* synthetic */ C2221281Bwk LIZIZ;

    @Override // X.InterfaceC2221401Bww
    public final void execute() {
        ((ReentrantLock) this.LIZIZ.LIZJ).lock();
        this.LIZIZ.LIZLLL.signalAll();
        ((ReentrantLock) this.LIZIZ.LIZJ).unlock();
        InterfaceC1436020nTM interfaceC1436020nTM = this.LIZIZ.LJIIIZ;
        if (interfaceC1436020nTM != null) {
            interfaceC1436020nTM.LIZ(this.LIZ);
        }
        ((ReentrantLock) this.LIZIZ.LIZ).lock();
        this.LIZIZ.LIZIZ.signalAll();
        ((ReentrantLock) this.LIZIZ.LIZ).unlock();
        C133L c133l = this.LIZIZ.LJFF;
        if (c133l != null) {
            try {
                c133l.close();
                this.LIZIZ.LJII(true, "raf.close();", new Object[0]);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C2221281Bwk c2221281Bwk = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("raf.close() ");
                sbLIZ.append(e.getMessage());
                c2221281Bwk.LJII(true, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            }
        }
        C2221281Bwk c2221281Bwk2 = this.LIZIZ;
        if (!c2221281Bwk2.LJIJI && c2221281Bwk2.LJIILJJIL.exists()) {
            this.LIZIZ.LJIILJJIL.delete();
        }
        this.LIZIZ.LJ.LIZ.quit();
    }

    public C2221301Bwm(C2221281Bwk c2221281Bwk, EnumC1288180jcu enumC1288180jcu) {
        this.LIZIZ = c2221281Bwk;
        this.LIZ = enumC1288180jcu;
    }
}
