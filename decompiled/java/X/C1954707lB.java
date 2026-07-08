package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07lB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1954707lB {
    public static final C1954707lB LIZ = new C1954707lB();
    public static final ConcurrentHashMap<Class<?>, Object> LIZIZ = new ConcurrentHashMap<>();
    public static volatile InterfaceC1954907lD LIZJ;
    public static volatile InterfaceC1954907lD LIZLLL;
    public static volatile InterfaceC1954907lD LJ;

    public final InterfaceC1954907lD LIZ() {
        if (LJ == null) {
            synchronized (this) {
                try {
                    if (LJ == null) {
                        Object objNewInstance = Class.forName("com.ss.android.ugc.tiktok.pipo.saas.hostimpl.PipoDefaultHostServiceInitializer").newInstance();
                        if (!(objNewInstance instanceof InterfaceC1954907lD)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("pipo host default service instance class not impl IPipoServiceInitializer, clazz=");
                            sbLIZ.append(objNewInstance != null ? objNewInstance.getClass().getName() : null);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        LJ = (InterfaceC1954907lD) objNewInstance;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final InterfaceC1954907lD LIZIZ() {
        if (LIZJ == null) {
            synchronized (this) {
                try {
                    if (LIZJ == null) {
                        Object objNewInstance = Class.forName("com.ss.android.ugc.tiktok.pipo.saas.hostimpl.PipoGeneralHostServiceInitializer").newInstance();
                        if (!(objNewInstance instanceof InterfaceC1954907lD)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("pipo host general service instance class not impl IPipoServiceInitializer, clazz=");
                            sbLIZ.append(objNewInstance != null ? objNewInstance.getClass().getName() : null);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        LIZJ = (InterfaceC1954907lD) objNewInstance;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final InterfaceC1954907lD LIZJ() {
        if (LIZLLL == null) {
            synchronized (this) {
                try {
                    if (LIZLLL == null) {
                        Object objNewInstance = Class.forName("com.ss.android.ugc.tiktok.pipo.saas.hostimpl.PipoHostServiceInitializer").newInstance();
                        if (!(objNewInstance instanceof InterfaceC1954907lD)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("pipo host service instance class not impl IPipoServiceInitializer, clazz=");
                            sbLIZ.append(objNewInstance != null ? objNewInstance.getClass().getName() : null);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        LIZLLL = (InterfaceC1954907lD) objNewInstance;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static Object LIZLLL(Class cls) {
        Object objLJ;
        Object obj = LIZIZ.get(cls);
        if (obj == null) {
            synchronized (cls) {
                try {
                    objLJ = LIZ.LJ(cls);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return objLJ;
        }
        return obj;
    }

    public final <T> T LJ(Class<T> cls) {
        T t;
        T t2;
        T t3;
        InterfaceC1954907lD interfaceC1954907lDLIZ;
        InterfaceC1954907lD interfaceC1954907lDLIZJ;
        T t4 = (T) LIZIZ.get(cls);
        if (t4 != null) {
            return t4;
        }
        String message = null;
        try {
            InterfaceC1954907lD interfaceC1954907lDLIZIZ = LIZIZ();
            if (interfaceC1954907lDLIZIZ != null) {
                t = (T) interfaceC1954907lDLIZIZ.createService(cls);
            } else {
                t = null;
            }
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            t = null;
        }
        if (t != null) {
            LIZIZ.put((Class<?>) cls, t);
            return t;
        }
        try {
            interfaceC1954907lDLIZJ = LIZJ();
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
        }
        if (interfaceC1954907lDLIZJ != null) {
            t2 = (T) interfaceC1954907lDLIZJ.createService(cls);
        } else {
            t2 = null;
        }
        if (t2 != null) {
            LIZIZ.put((Class<?>) cls, t2);
            return t2;
        }
        try {
            interfaceC1954907lDLIZ = LIZ();
        } catch (Throwable th3) {
            th = th3;
            TryCatchGuardChecker.doCheck(th);
        }
        if (interfaceC1954907lDLIZ != null) {
            t3 = (T) interfaceC1954907lDLIZ.createService(cls);
        } else {
            t3 = null;
        }
        if (t3 != null) {
            StringBuilder sb = new StringBuilder("pipo saas service initialized null, use default impl, clazz=");
            sb.append(cls.getSimpleName());
            sb.append(", cause=");
            if (th != null) {
                message = th.getMessage();
            }
            sb.append(message);
            C1AF0.LIZJ(sb.toString());
            return t3;
        }
        StringBuilder sb2 = new StringBuilder("service initialized null, pls check, clazz=");
        sb2.append(cls.getSimpleName());
        sb2.append(", cause=");
        if (th != null) {
            message = th.getMessage();
        }
        sb2.append(message);
        throw new RuntimeException(sb2.toString(), th);
    }
}
