package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799880VZi {
    public static final ConcurrentHashMap<String, EnumC799870VZh> LIZLLL = new ConcurrentHashMap<>();
    public Context LIZ;
    public final Map<EnumC799870VZh, List<InterfaceC800080Va2>> LIZIZ = new ConcurrentHashMap();
    public final Map<EnumC799870VZh, List<InterfaceC800080Va2>> LIZJ = new ConcurrentHashMap();

    public final boolean LIZIZ() {
        synchronized (this.LIZIZ) {
            try {
                Map<EnumC799870VZh, List<InterfaceC800080Va2>> map = this.LIZIZ;
                EnumC799870VZh enumC799870VZh = EnumC799870VZh.IDLE;
                if (!((Collection) ((ConcurrentHashMap) map).get(enumC799870VZh)).isEmpty()) {
                    for (InterfaceC800080Va2 interfaceC800080Va2 : (Iterable) ((ConcurrentHashMap) this.LIZIZ).get(enumC799870VZh)) {
                        if (interfaceC800080Va2 instanceof InterfaceC799780VYy) {
                            ((InterfaceC799780VYy) interfaceC800080Va2).LJFF();
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZLLL(List list) {
        boolean z;
        boolean z2;
        C799900VZk.LIZ.getClass();
        IBootFinishTaskConfig iBootFinishTaskConfigLJIIJ = C799900VZk.LJFF().LJIIJ();
        if (iBootFinishTaskConfigLJIIJ == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC800080Va2 interfaceC800080Va2 = (InterfaceC800080Va2) it2.next();
            if (iBootFinishTaskConfigLJIIJ.LIZLLL().contains(interfaceC800080Va2.key())) {
                arrayList.add(interfaceC800080Va2);
            } else if (iBootFinishTaskConfigLJIIJ.LJII().contains(interfaceC800080Va2.key())) {
                arrayList2.add(interfaceC800080Va2);
            } else if (iBootFinishTaskConfigLJIIJ.LJFF().contains(interfaceC800080Va2.key())) {
                arrayList3.add(interfaceC800080Va2);
            } else if (iBootFinishTaskConfigLJIIJ.LIZIZ().contains(interfaceC800080Va2.key())) {
                arrayList4.add(interfaceC800080Va2);
            }
        }
        if (!iBootFinishTaskConfigLJIIJ.LJFF().isEmpty()) {
            list.removeAll(arrayList3);
            list.addAll(0, arrayList3);
            z = true;
        } else {
            z = false;
        }
        if (!iBootFinishTaskConfigLJIIJ.LJII().isEmpty()) {
            list.removeAll(arrayList2);
            list.addAll(0, arrayList2);
            z = true;
        }
        if (!iBootFinishTaskConfigLJIIJ.LIZLLL().isEmpty()) {
            list.removeAll(arrayList);
            list.addAll(0, arrayList);
            z2 = true;
        } else {
            z2 = z;
        }
        if (!iBootFinishTaskConfigLJIIJ.LIZIZ().isEmpty()) {
            list.removeAll(arrayList4);
            list.addAll(arrayList4);
            return true;
        }
        return z2;
    }

    public final boolean LIZ(EnumC799870VZh enumC799870VZh) {
        return !((Collection) ((ConcurrentHashMap) this.LIZIZ).get(enumC799870VZh)).isEmpty();
    }

    public final C0CCZ LIZJ(EnumC799870VZh enumC799870VZh) {
        synchronized (this.LIZIZ) {
            try {
                InterfaceC800080Va2 interfaceC800080Va2 = null;
                if (!(!((Collection) ((ConcurrentHashMap) this.LIZIZ).get(enumC799870VZh)).isEmpty())) {
                    return null;
                }
                List list = (List) ((ConcurrentHashMap) this.LIZIZ).get(enumC799870VZh);
                if (list != null) {
                    interfaceC800080Va2 = (InterfaceC800080Va2) list.remove(0);
                }
                C0CCZ c0ccz = (C0CCZ) interfaceC800080Va2;
                synchronized (this.LIZJ) {
                    try {
                        List list2 = (List) ((ConcurrentHashMap) this.LIZJ).get(C799750VYv.LIZ(c0ccz));
                        if (list2 != null) {
                            list2.add(c0ccz);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                return c0ccz;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void LJ(C0CCZ c0ccz) {
        synchronized (c0ccz) {
            try {
                EnumC799870VZh enumC799870VZhLIZ = C799750VYv.LIZ(c0ccz);
                if (((List) ((ConcurrentHashMap) this.LIZJ).get(enumC799870VZhLIZ)).contains(c0ccz)) {
                    C799900VZk.LIZ.getClass();
                    boolean z = true;
                    for (C800150Va9 c800150Va9 : C799900VZk.LJII.values()) {
                        EnumC800210VaF enumC800210VaFLIZIZ = c800150Va9.LIZLLL.LIZIZ(c0ccz);
                        if (enumC800210VaFLIZIZ != null) {
                            int i = C800200VaE.LIZ[enumC800210VaFLIZIZ.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        c800150Va9.LJ(c0ccz);
                                    }
                                } else {
                                    c800150Va9.LIZJ(c0ccz);
                                }
                                z = false;
                            } else {
                                c800150Va9.LIZLLL(c0ccz);
                            }
                        }
                    }
                    if (z) {
                        C799900VZk.LIZ.getClass();
                        InterfaceC799860VZg interfaceC799860VZg = C799900VZk.LJI;
                        if (interfaceC799860VZg != null) {
                            interfaceC799860VZg.LIZIZ(c0ccz);
                        }
                        Context context = this.LIZ;
                        if (context == null) {
                            context = null;
                        }
                        c0ccz.run(context);
                        List<InterfaceC800080Va2> listFinalizedBy = c0ccz.finalizedBy();
                        if (listFinalizedBy != null) {
                            C799890VZj c799890VZj = new C799890VZj();
                            Iterator<InterfaceC800080Va2> it2 = listFinalizedBy.iterator();
                            while (it2.hasNext()) {
                                c799890VZj.LIZ(it2.next());
                            }
                            c799890VZj.LIZIZ();
                        }
                        C799900VZk.LIZ.getClass();
                        InterfaceC799860VZg interfaceC799860VZg2 = C799900VZk.LJI;
                        if (interfaceC799860VZg2 != null) {
                            interfaceC799860VZg2.LIZ(c0ccz);
                        }
                    }
                    synchronized (this.LIZJ) {
                        try {
                            ((List) ((ConcurrentHashMap) this.LIZJ).get(enumC799870VZhLIZ)).remove(c0ccz);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean LJFF(EnumC799870VZh enumC799870VZh) {
        boolean z;
        synchronized (this.LIZIZ) {
            try {
                boolean z2 = true;
                z = false;
                if (!((Collection) ((ConcurrentHashMap) this.LIZIZ).get(enumC799870VZh)).isEmpty()) {
                    List<InterfaceC800080Va2> list = (List) ((ConcurrentHashMap) this.LIZIZ).get(enumC799870VZh);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC800080Va2 interfaceC800080Va2 : list) {
                        if (interfaceC800080Va2 instanceof InterfaceC799590VYf) {
                            if (((InterfaceC799590VYf) interfaceC800080Va2).priority() == 2) {
                                arrayList.add(interfaceC800080Va2);
                            } else if (((InterfaceC799590VYf) interfaceC800080Va2).priority() == 0) {
                                arrayList2.add(interfaceC800080Va2);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        list.removeAll(arrayList);
                        list.addAll(0, arrayList);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!arrayList2.isEmpty()) {
                        list.removeAll(arrayList2);
                        list.addAll(arrayList2);
                        z = true;
                    }
                    if (enumC799870VZh == EnumC799870VZh.BOOT_FINISH) {
                        if (!LIZLLL(list) && !z) {
                            z2 = false;
                        }
                        z = z2;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
