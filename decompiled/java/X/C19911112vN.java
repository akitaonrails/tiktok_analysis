package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19911112vN {
    public volatile InterfaceC19911612vS LIZ;
    public volatile AbstractC19855612mQ LIZIZ;

    public int hashCode() {
        return 1;
    }

    public final int LIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ.zze();
        }
        if (this.LIZ != null) {
            return this.LIZ.LJIILL();
        }
        return 0;
    }

    public final AbstractC19855612mQ LIZIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        synchronized (this) {
            try {
                if (this.LIZIZ != null) {
                    return this.LIZIZ;
                }
                if (this.LIZ == null) {
                    this.LIZIZ = AbstractC19855612mQ.zza;
                } else {
                    this.LIZIZ = this.LIZ.LJIILJJIL();
                }
                return this.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(InterfaceC19911612vS interfaceC19911612vS) {
        if (this.LIZ != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LIZ != null) {
                    return;
                }
                try {
                    this.LIZ = interfaceC19911612vS;
                    this.LIZIZ = AbstractC19855612mQ.zza;
                } catch (C19857612mk e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ = interfaceC19911612vS;
                    this.LIZIZ = AbstractC19855612mQ.zza;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19911112vN)) {
            return false;
        }
        C19911112vN c19911112vN = (C19911112vN) obj;
        InterfaceC19911612vS interfaceC19911612vS = this.LIZ;
        InterfaceC19911612vS interfaceC19911612vS2 = c19911112vN.LIZ;
        if (interfaceC19911612vS == null) {
            if (interfaceC19911612vS2 != null) {
                LIZJ(interfaceC19911612vS2.LJIIL());
                return this.LIZ.equals(interfaceC19911612vS2);
            }
            return LIZIZ().equals(c19911112vN.LIZIZ());
        }
        if (interfaceC19911612vS2 == null) {
            c19911112vN.LIZJ(interfaceC19911612vS.LJIIL());
            return interfaceC19911612vS.equals(c19911112vN.LIZ);
        }
        return interfaceC19911612vS.equals(interfaceC19911612vS2);
    }
}
