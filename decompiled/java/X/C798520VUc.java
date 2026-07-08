package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798520VUc {
    public static Map<String, ? extends InterfaceC798580VUi> LIZJ;
    public static C1957307lb LIZLLL;
    public static List<? extends C0VTW> LJ;
    public static List<? extends C0VUR> LJFF;
    public static Executor LJI;
    public static List<? extends InterfaceC798600VUk> LJII;
    public static final C798520VUc LIZ = new C798520VUc();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final Map<String, InterfaceC798560VUg> LJIIIIZZ = new LinkedHashMap();

    public static final void LIZIZ(String str) {
        InterfaceC798600VUk next;
        if (LIZIZ.get()) {
            List<? extends InterfaceC798600VUk> list = LJII;
            C1957307lb c1957307lb = null;
            if (list == null) {
                list = null;
            }
            Iterator<? extends InterfaceC798600VUk> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.I0(str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC798600VUk interfaceC798600VUk = next;
            if (interfaceC798600VUk != null && interfaceC798600VUk.LIZ(str)) {
                Map<String, InterfaceC798560VUg> map = LJIIIIZZ;
                InterfaceC798560VUg c798670VUr = (InterfaceC798560VUg) ((LinkedHashMap) map).get(str);
                if (c798670VUr == null) {
                    synchronized (map) {
                        try {
                            c798670VUr = (InterfaceC798560VUg) ((LinkedHashMap) map).get(str);
                            if (c798670VUr == null) {
                                InterfaceC798580VUi interfaceC798580VUi = C798550VUf.LIZ.get(str);
                                if (interfaceC798580VUi != null) {
                                    c798670VUr = interfaceC798580VUi.LIZ(str);
                                    if (c798670VUr == null) {
                                        return;
                                    }
                                } else {
                                    C798550VUf.LIZIZ.getClass();
                                    c798670VUr = new C798670VUr(str);
                                }
                                map.put(str, c798670VUr);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                if (c798670VUr.LIZJ()) {
                    C1957307lb c1957307lb2 = LIZLLL;
                    if (c1957307lb2 != null) {
                        c1957307lb = c1957307lb2;
                    }
                    Iterator<InterfaceC798590VUj> it3 = c1957307lb.iterator();
                    while (it3.hasNext()) {
                        it3.next().LJIIJ(str);
                    }
                }
            }
        }
    }

    public static final void LIZJ(String str) {
        InterfaceC798560VUg interfaceC798560VUg;
        if (LIZIZ.get() && (interfaceC798560VUg = (InterfaceC798560VUg) ((LinkedHashMap) LJIIIIZZ).get(str)) != null && interfaceC798560VUg.stop()) {
            C1957307lb c1957307lb = LIZLLL;
            if (c1957307lb == null) {
                c1957307lb = null;
            }
            Iterator<InterfaceC798590VUj> it2 = c1957307lb.iterator();
            while (it2.hasNext()) {
                it2.next().onStop(str);
            }
            Map<String, InterfaceC798560VUg> map = LJIIIIZZ;
            synchronized (map) {
                try {
                    map.remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static final void LIZ(String str, String str2, String str3) {
        InterfaceC798560VUg interfaceC798560VUg;
        if (str2 != null && str3 != null && LIZIZ.get() && (interfaceC798560VUg = (InterfaceC798560VUg) ((LinkedHashMap) LJIIIIZZ).get(str)) != null) {
            interfaceC798560VUg.LIZ(str2, str3);
        }
    }
}
