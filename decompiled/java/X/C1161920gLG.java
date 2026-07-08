package X;

import com.bytedance.android.settings.LiveServiceManagerInitOptForHostService;
import com.bytedance.android.settings.LiveServiceManagerInitOptForLiveService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0gLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161920gLG {
    public static volatile InterfaceC1161930gLH LIZ;
    public static volatile InterfaceC1161930gLH LIZIZ;
    public static volatile InterfaceC1161930gLH LIZJ;
    public static volatile InterfaceC1161930gLH LIZLLL;

    static {
        new ConcurrentHashMap(128);
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = null;
    }

    public static InterfaceC1161930gLH LIZ() {
        if (LIZJ == null) {
            synchronized (C1161920gLG.class) {
                try {
                    if (LIZJ == null) {
                        try {
                            Object objNewInstance = Class.forName("com.bytedance.android.live.service.initializer.DummyHostServiceInitializer").newInstance();
                            if (objNewInstance instanceof InterfaceC1161930gLH) {
                                LIZJ = (InterfaceC1161930gLH) objNewInstance;
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static InterfaceC1161930gLH LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C1161920gLG.class) {
                try {
                    if (LIZLLL == null) {
                        try {
                            Object objNewInstance = Class.forName(LiveServiceManagerInitOptForLiveService.INSTANCE.isEnable() ? "com.bytedance.android.live.service.initializer.ServiceInitializerV3" : "com.bytedance.android.live.service.initializer.ServiceInitializerV2").newInstance();
                            if (objNewInstance instanceof InterfaceC1161930gLH) {
                                LIZLLL = (InterfaceC1161930gLH) objNewInstance;
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static <T extends C006A> T LIZJ(Class<T> cls) {
        T t;
        InterfaceC1161930gLH interfaceC1161930gLHLIZ;
        String str;
        if (LIZIZ == null) {
            synchronized (C1161920gLG.class) {
                try {
                    if (LIZIZ == null) {
                        try {
                            if (LiveServiceManagerInitOptForHostService.INSTANCE.isEnable()) {
                                str = "com.bytedance.android.live.service.initializer.HostServiceInitializerV2";
                            } else {
                                str = "com.bytedance.android.live.service.initializer.HostServiceInitializer";
                            }
                            Object objNewInstance = Class.forName(str).newInstance();
                            if (objNewInstance instanceof InterfaceC1161930gLH) {
                                LIZIZ = (InterfaceC1161930gLH) objNewInstance;
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        InterfaceC1161930gLH interfaceC1161930gLH = LIZIZ;
        if (interfaceC1161930gLH != null) {
            t = (T) interfaceC1161930gLH.getService(cls);
            if (t == null) {
            }
            return t;
        }
        t = null;
        InterfaceC1161930gLH interfaceC1161930gLHLIZIZ = LIZIZ();
        if ((interfaceC1161930gLHLIZIZ == null || (t = (T) interfaceC1161930gLHLIZIZ.getService(cls)) == null) && (interfaceC1161930gLHLIZ = LIZ()) != null) {
            return (T) interfaceC1161930gLHLIZ.getService(cls);
        }
        return t;
    }
}
