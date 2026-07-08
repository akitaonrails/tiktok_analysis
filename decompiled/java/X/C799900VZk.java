package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799900VZk {
    public static Context LJ;
    public static InterfaceC799690VYp LJFF;
    public static InterfaceC799860VZg LJI;
    public static final C799900VZk LIZ = new C799900VZk();
    public static final C799880VZi LIZIZ = new C799880VZi();
    public static final C799910VZl LIZJ = new C799910VZl();
    public static final C799820VZc LIZLLL = new C799820VZc();
    public static final ConcurrentHashMap<String, C800150Va9> LJII = new ConcurrentHashMap<>();
    public static final HashMap<EnumC799980VZs, InterfaceC800100Va4> LJIIIIZZ = new HashMap<>();

    public static void LIZIZ() {
        if (C0CP9.LIZ == C0CP8.COLD_BOOT_BEGIN) {
            C0CP9.LIZ = C0CP8.COLD_BOOT_END;
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0CP2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BootStateMachine@9240.bootFinish$1");
                    try {
                        Iterator<C0CP3> it2 = C0CP9.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ();
                        }
                        C0CP9.LIZIZ.clear();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BootStateMachine@9240.bootFinish$1");
                }
            });
            LIZ.getClass();
            HashMap<EnumC799980VZs, InterfaceC800100Va4> map = LJIIIIZZ;
            InterfaceC800100Va4 interfaceC800100Va4 = map.get(EnumC799980VZs.REQUEST_BOOT_FINISH);
            if (interfaceC800100Va4 != null) {
                interfaceC800100Va4.LJFF();
            }
            InterfaceC800100Va4 interfaceC800100Va42 = map.get(EnumC799980VZs.REQUEST_IDLE);
            if (interfaceC800100Va42 != null) {
                interfaceC800100Va42.LJFF();
            }
        }
        if (C0CP9.LIZ == C0CP8.WARM_BOOT_BEGIN) {
            C0CP9.LIZ = C0CP8.WARM_BOOT_END;
            LIZ.getClass();
            HashMap<EnumC799980VZs, InterfaceC800100Va4> map2 = LJIIIIZZ;
            InterfaceC800100Va4 interfaceC800100Va43 = map2.get(EnumC799980VZs.REQUEST_BOOT_FINISH);
            if (interfaceC800100Va43 != null) {
                interfaceC800100Va43.LJFF();
            }
            InterfaceC800100Va4 interfaceC800100Va44 = map2.get(EnumC799980VZs.REQUEST_IDLE);
            if (interfaceC800100Va44 != null) {
                interfaceC800100Va44.LJFF();
            }
        }
        InterfaceC800100Va4 interfaceC800100Va45 = LJIIIIZZ.get(EnumC799980VZs.TASK_BOOT_FINISH);
        if (interfaceC800100Va45 != null) {
            interfaceC800100Va45.LJFF();
        }
    }

    public static InterfaceC799690VYp LJFF() {
        InterfaceC799690VYp interfaceC799690VYp = LJFF;
        if (interfaceC799690VYp != null) {
            return interfaceC799690VYp;
        }
        return null;
    }

    public static C800150Va9 LIZ(InterfaceC800110Va5 interfaceC800110Va5) {
        ConcurrentHashMap<String, C800150Va9> concurrentHashMap = LJII;
        C800150Va9 c800150Va9 = concurrentHashMap.get(interfaceC800110Va5.scene());
        if (c800150Va9 == null) {
            C800150Va9 c800150Va92 = new C800150Va9(interfaceC800110Va5);
            concurrentHashMap.put(interfaceC800110Va5.scene(), c800150Va92);
            return c800150Va92;
        }
        return c800150Va9;
    }

    public static void LIZJ(C0CCZ c0ccz) {
        if (!c0ccz.meetTrigger()) {
            return;
        }
        C799880VZi c799880VZi = LIZIZ;
        c799880VZi.getClass();
        EnumC799870VZh enumC799870VZhLIZ = C799750VYv.LIZ(c0ccz);
        if (((List) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(enumC799870VZhLIZ)).contains(c0ccz)) {
            synchronized (c799880VZi.LIZIZ) {
                try {
                    ((List) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(enumC799870VZhLIZ)).remove(c0ccz);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            synchronized (c799880VZi.LIZJ) {
                try {
                    if (!((List) ((ConcurrentHashMap) c799880VZi.LIZJ).get(enumC799870VZhLIZ)).contains(c0ccz)) {
                        ((List) ((ConcurrentHashMap) c799880VZi.LIZJ).get(enumC799870VZhLIZ)).add(c0ccz);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        if (((List) ((ConcurrentHashMap) c799880VZi.LIZJ).get(enumC799870VZhLIZ)).contains(c0ccz)) {
            LIZ.getClass();
            InterfaceC799860VZg interfaceC799860VZg = LJI;
            if (interfaceC799860VZg != null) {
                interfaceC799860VZg.LIZIZ(c0ccz);
            }
            c799880VZi.LJ(c0ccz);
            InterfaceC799860VZg interfaceC799860VZg2 = LJI;
            if (interfaceC799860VZg2 != null) {
                interfaceC799860VZg2.LIZ(c0ccz);
            }
        }
    }

    public static InterfaceC800080Va2 LIZLLL(InterfaceC800080Va2 interfaceC800080Va2) {
        InterfaceC800100Va4 interfaceC800100Va4 = LJIIIIZZ.get(interfaceC800080Va2.triggerType());
        if (interfaceC800100Va4 != null) {
            return interfaceC800100Va4.LIZIZ(interfaceC800080Va2);
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static InterfaceC800080Va2 LJ(Class cls) {
        return LIZLLL((InterfaceC800080Va2) cls.newInstance());
    }

    public static void LJI(String str) {
        LJII.remove(str);
    }
}
