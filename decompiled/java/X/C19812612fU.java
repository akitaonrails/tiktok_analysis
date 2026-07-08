package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12fU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19812612fU<V> {
    public static final Object LJFF = new Object();
    public final String LIZ;
    public final InterfaceC19812712fV<V> LIZIZ;
    public final V LIZJ;
    public final Object LIZLLL;
    public volatile V LJ;

    public C19812612fU() {
        throw null;
    }

    public final V LIZ(V v) {
        V v2;
        synchronized (this.LIZLLL) {
            try {
            } finally {
            }
        }
        if (v != null) {
            return v;
        }
        if (C19813212fa.LIZ == null) {
            return this.LIZJ;
        }
        synchronized (LJFF) {
            try {
                if (C19812512fT.LIZ()) {
                    if (this.LJ == null) {
                        v2 = this.LIZJ;
                    } else {
                        v2 = this.LJ;
                    }
                    return v2;
                }
                try {
                    for (C19812612fU<?> c19812612fU : C19817012gC.LIZ) {
                        if (!C19812512fT.LIZ()) {
                            V v3 = null;
                            try {
                                InterfaceC19812712fV<?> interfaceC19812712fV = c19812612fU.LIZIZ;
                                if (interfaceC19812712fV != null) {
                                    v3 = (V) interfaceC19812712fV.zza();
                                }
                            } catch (IllegalStateException e) {
                            }
                            synchronized (LJFF) {
                                try {
                                    c19812612fU.LJ = v3;
                                } finally {
                                }
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException e2) {
                }
                InterfaceC19812712fV<V> interfaceC19812712fV2 = this.LIZIZ;
                if (interfaceC19812712fV2 == null) {
                    return this.LIZJ;
                }
                try {
                    return interfaceC19812712fV2.zza();
                } catch (IllegalStateException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return this.LIZJ;
                } catch (SecurityException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return this.LIZJ;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19812612fU(String str, Object obj, InterfaceC19812712fV interfaceC19812712fV) {
        this.LIZLLL = new Object();
        this.LJ = null;
        this.LIZ = str;
        this.LIZJ = obj;
        this.LIZIZ = interfaceC19812712fV;
    }
}
