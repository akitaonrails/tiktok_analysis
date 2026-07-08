package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.100C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100C {
    public static final C100C LIZ = new C100C();
    public static volatile boolean LIZIZ;
    public static C100G LIZJ;

    public static boolean LJII() throws Throwable {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.tiktok.pns.compliance.foundation.init.PNSFoundationInitManager");
            try {
                cls.getMethod("install", new Class[0]).invoke(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                z = true;
                return true;
            } catch (InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return z;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return z;
        }
    }

    public final void LIZ() {
        if (LIZIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (LIZIZ) {
                    return;
                }
                if (!LJII()) {
                    throw new C100D("PNS Foundation: could not load com.tiktok.pns.compliance.foundation.init.PNSFoundationInitManager (ensure mini-compliance / compliance_common is on classpath) or call initFoundationService()");
                }
                if (!LIZIZ) {
                    throw new C100D("PNS Foundation: PNSFoundationInitManager.install() did not invoke initFoundationService()");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final InterfaceC1913680ztm LIZIZ() {
        Function0<InterfaceC1913680ztm> function0;
        InterfaceC1913680ztm interfaceC1913680ztmInvoke;
        LIZ();
        C100G c100g = LIZJ;
        if (c100g == null || (function0 = c100g.LJFF) == null || (interfaceC1913680ztmInvoke = function0.invoke()) == null) {
            throw new C100D("deviceInfoService not init");
        }
        return interfaceC1913680ztmInvoke;
    }

    public final InterfaceC1519030pdF LIZJ() {
        Function0<InterfaceC1519030pdF> function0;
        InterfaceC1519030pdF interfaceC1519030pdFInvoke;
        LIZ();
        C100G c100g = LIZJ;
        if (c100g == null || (function0 = c100g.LIZ) == null || (interfaceC1519030pdFInvoke = function0.invoke()) == null) {
            throw new C100D("logService not init");
        }
        return interfaceC1519030pdFInvoke;
    }

    public final InterfaceC1518570pcV LIZLLL() {
        Function0<InterfaceC1518570pcV> function0;
        InterfaceC1518570pcV interfaceC1518570pcVInvoke;
        LIZ();
        C100G c100g = LIZJ;
        if (c100g == null || (function0 = c100g.LIZLLL) == null || (interfaceC1518570pcVInvoke = function0.invoke()) == null) {
            throw new C100D("networkService not init");
        }
        return interfaceC1518570pcVInvoke;
    }

    public final InterfaceC1703650uR1 LJ() {
        Function0<InterfaceC1703650uR1> function0;
        InterfaceC1703650uR1 interfaceC1703650uR1Invoke;
        LIZ();
        C100G c100g = LIZJ;
        if (c100g == null || (function0 = c100g.LIZIZ) == null || (interfaceC1703650uR1Invoke = function0.invoke()) == null) {
            throw new C100D("routeService not init");
        }
        return interfaceC1703650uR1Invoke;
    }

    public final InterfaceC1888950zFt LJFF() {
        Function0<InterfaceC1888950zFt> function0;
        InterfaceC1888950zFt interfaceC1888950zFtInvoke;
        LIZ();
        C100G c100g = LIZJ;
        if (c100g == null || (function0 = c100g.LIZJ) == null || (interfaceC1888950zFtInvoke = function0.invoke()) == null) {
            throw new C100D("storageService not init");
        }
        return interfaceC1888950zFtInvoke;
    }

    public final InterfaceC1519070pdJ LJI() {
        Function0<InterfaceC1519070pdJ> function0;
        InterfaceC1519070pdJ interfaceC1519070pdJInvoke;
        LIZ();
        C100G c100g = LIZJ;
        if (c100g == null || (function0 = c100g.LJ) == null || (interfaceC1519070pdJInvoke = function0.invoke()) == null) {
            throw new C100D("userBehaviorService not init");
        }
        return interfaceC1519070pdJInvoke;
    }
}
