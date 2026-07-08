package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.04aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1126204aq {
    public volatile InterfaceC1079104Jx LIZ;
    public volatile InterfaceC1079104Jx LIZIZ;
    public volatile InterfaceC1079104Jx LIZJ;
    public volatile InterfaceC1079104Jx LIZLLL;

    public final InterfaceC1079104Jx LIZ() {
        if (this.LIZLLL == null) {
            synchronized (this) {
                try {
                    if (this.LIZLLL == null) {
                        try {
                            Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.ecommerce.saas.core.EComBusinessServiceDefault").newInstance();
                            if (objNewInstance instanceof InterfaceC1079104Jx) {
                                this.LIZLLL = (InterfaceC1079104Jx) objNewInstance;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("get biz service initializer error, ");
                            sbLIZ.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1126104ap.LIZ();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZLLL;
    }

    public final InterfaceC1079104Jx LIZIZ() {
        if (this.LIZIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZIZ == null) {
                        try {
                            Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.ecommerce.saas.core.EComBusinessServiceInitializer").newInstance();
                            if (objNewInstance instanceof InterfaceC1079104Jx) {
                                this.LIZIZ = (InterfaceC1079104Jx) objNewInstance;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("get biz service initializer error, ");
                            sbLIZ.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1126104ap.LIZ();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    public final InterfaceC1079104Jx LIZJ() {
        if (this.LIZJ == null) {
            synchronized (this) {
                try {
                    if (this.LIZJ == null) {
                        try {
                            Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.ecommerce.saas.core.EComHostServiceDefault").newInstance();
                            if (objNewInstance instanceof InterfaceC1079104Jx) {
                                this.LIZJ = (InterfaceC1079104Jx) objNewInstance;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("get host service default initializer error, ");
                            sbLIZ.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1126104ap.LIZ();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZJ;
    }

    public final <T extends AnonymousClass0317> T LIZLLL(Class<T> cls) {
        T t;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String name = cls.getName();
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        try {
                            Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.ecommerce.saas.core.EComHostServiceInitializer").newInstance();
                            if (objNewInstance instanceof InterfaceC1079104Jx) {
                                this.LIZ = (InterfaceC1079104Jx) objNewInstance;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("get host service initializer error, ");
                            sbLIZ.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1126104ap.LIZ();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        InterfaceC1079104Jx interfaceC1079104Jx = this.LIZ;
        if (interfaceC1079104Jx != null) {
            t = (T) interfaceC1079104Jx.getService(cls);
        } else {
            t = null;
        }
        int i = 1;
        if (t != null) {
            LJ(jElapsedRealtime, name, 1, true, false);
            return t;
        }
        InterfaceC1079104Jx interfaceC1079104JxLIZIZ = LIZIZ();
        if (interfaceC1079104JxLIZIZ != null) {
            T t2 = (T) interfaceC1079104JxLIZIZ.getService(cls);
            i = 2;
            if (t2 != null) {
                LJ(jElapsedRealtime, name, 2, true, false);
                return t2;
            }
        }
        InterfaceC1079104Jx interfaceC1079104JxLIZJ = LIZJ();
        if (interfaceC1079104JxLIZJ != null) {
            T t3 = (T) interfaceC1079104JxLIZJ.getService(cls);
            i = 1;
            if (t3 != null) {
                LJ(jElapsedRealtime, name, 1, true, true);
                return t3;
            }
        }
        InterfaceC1079104Jx interfaceC1079104JxLIZ = LIZ();
        if (interfaceC1079104JxLIZ != null) {
            T t4 = (T) interfaceC1079104JxLIZ.getService(cls);
            i = 2;
            if (t4 != null) {
                LJ(jElapsedRealtime, name, 2, true, true);
                return t4;
            }
        }
        LJ(jElapsedRealtime, name, i, false, false);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("not found service ");
        sbLIZ2.append(cls.getName());
        sbLIZ2.append(", please check serviceInitializer");
        throw new C05FI(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LJ(long j, String str, int i, boolean z, boolean z2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        IECSaaSCoreMonitorService iECSaaSCoreMonitorService = (IECSaaSCoreMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSaaSCoreMonitorService.class, false, false, false, 14, null);
        if (iECSaaSCoreMonitorService != null) {
            iECSaaSCoreMonitorService.LIZIZ(z, Boolean.valueOf(z2), str, i, jElapsedRealtime, null);
        }
    }
}
