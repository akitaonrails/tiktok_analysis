package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19901012tk {
    public volatile InterfaceC19901112tl LIZ;
    public volatile AbstractC19854812mI LIZIZ;

    public int hashCode() {
        return 1;
    }

    public final int LIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ.zzb();
        }
        if (this.LIZ != null) {
            return this.LIZ.LIZIZ();
        }
        return 0;
    }

    public final AbstractC19854812mI LIZIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        synchronized (this) {
            try {
                if (this.LIZIZ != null) {
                    return this.LIZIZ;
                }
                if (this.LIZ == null) {
                    this.LIZIZ = AbstractC19854812mI.zza;
                } else {
                    this.LIZIZ = this.LIZ.LIZ();
                }
                return this.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final InterfaceC19901112tl LIZJ(InterfaceC19901112tl interfaceC19901112tl) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        try {
                            this.LIZ = interfaceC19901112tl;
                            this.LIZIZ = AbstractC19854812mI.zza;
                        } catch (C19903212u6 e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZ = interfaceC19901112tl;
                            this.LIZIZ = AbstractC19854812mI.zza;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19901012tk)) {
            return false;
        }
        C19901012tk c19901012tk = (C19901012tk) obj;
        InterfaceC19901112tl interfaceC19901112tl = this.LIZ;
        InterfaceC19901112tl interfaceC19901112tl2 = c19901012tk.LIZ;
        if (interfaceC19901112tl == null) {
            if (interfaceC19901112tl2 == null) {
                return LIZIZ().equals(c19901012tk.LIZIZ());
            }
            return LIZJ(interfaceC19901112tl2.LJII()).equals(interfaceC19901112tl2);
        }
        if (interfaceC19901112tl2 != null) {
            return interfaceC19901112tl.equals(interfaceC19901112tl2);
        }
        return interfaceC19901112tl.equals(c19901012tk.LIZJ(interfaceC19901112tl.LJII()));
    }
}
