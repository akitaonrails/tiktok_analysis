package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1AtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193811AtX extends C2193821AtY {
    public C2193811AtX(C2193851Atb c2193851Atb) {
        super(c2193851Atb);
    }

    public final C2193821AtY LIZ(Long l) {
        ((ReentrantLock) this.LIZ).lock();
        ((ReentrantLock) this.LIZ).unlock();
        return this;
    }

    public final void LIZIZ(Long l) {
        Long lValueOf;
        if (l == null) {
            lValueOf = null;
        } else {
            getClass();
            lValueOf = Long.valueOf(System.currentTimeMillis() + (l.longValue() * 1000));
        }
        LIZ(lValueOf);
    }

    public final void LIZJ(String str) {
        boolean z;
        boolean z2 = true;
        if (str != null) {
            if (this.LJ != null && this.LIZJ != null && this.LIZLLL != null) {
                z = true;
            } else {
                z = false;
            }
            C19864312np.LIZLLL("Please use the Builder and call setJsonFactory, setTransport and setClientSecrets", z);
        }
        ((ReentrantLock) this.LIZ).lock();
        if (str != null) {
            try {
                if (this.LJ == null || this.LIZJ == null || this.LIZLLL == null || this.LJFF == null) {
                    z2 = false;
                }
                C19864312np.LIZLLL("Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl", z2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) this.LIZ).unlock();
                throw th;
            }
        }
        ((ReentrantLock) this.LIZ).unlock();
    }
}
