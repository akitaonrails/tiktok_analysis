package X;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184911AfB {
    public static C2184901AfA LIZIZ;
    public static boolean LIZJ;
    public static boolean LJ;
    public static C2184951AfF LJII;
    public static final C2184911AfB LIZ = new C2184911AfB();
    public static final C2097508Jp<String, C2185001AfK> LIZLLL = new C2097508Jp<>();
    public static final ConcurrentHashMap<C2184901AfA, Boolean> LJFF = new ConcurrentHashMap<>();
    public static final ArrayDeque<C2184901AfA> LJI = new ArrayDeque<>();
    public static final C2184921AfC LJIIIIZZ = new InterfaceC202113146l() { // from class: X.1AfC
        @Override // X.InterfaceC202113146l
        public final void LIZ(String str) {
            C2184981AfI c2184981AfI;
            C2185011AfL c2185011AfL;
            C2184951AfF c2184951AfF = C2184911AfB.LJII;
            if (c2184951AfF != null && !c2184951AfF.LJIILIIL && (c2184981AfI = c2184951AfF.LJIIIIZZ) != null && (c2185011AfL = c2184981AfI.LIZIZ.get()) != null) {
                c2184981AfI.LIZIZ.remove();
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - c2185011AfL.LIZ;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - c2185011AfL.LIZIZ;
                if (jElapsedRealtime > 0 && jCurrentThreadTimeMillis / jElapsedRealtime > c2184981AfI.LIZ) {
                    c2184981AfI.LIZJ.put(c2185011AfL.LIZJ, Long.valueOf(C786410Ut5.u3().getId()));
                }
            }
        }

        @Override // X.InterfaceC202113146l
        public final void LIZIZ(String str) throws InterruptedException {
            Thread threadU3;
            String name;
            C2184981AfI c2184981AfI;
            C2184901AfA c2184901AfA;
            Integer numValueOf;
            long jLongValue;
            String strLIZIZ;
            C2185001AfK c2185001AfKLIZJ;
            C2184951AfF c2184951AfF;
            C2184981AfI c2184981AfI2;
            int i;
            C2184301AeC c2184301AeC;
            C2184911AfB.LIZ.getClass();
            if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                String name2 = C786410Ut5.u3().getName();
                if (str != null && str.length() != 0 && !a0.LJJIIZI(str, "milo", false) && name2 != null && name2.length() != 0 && (c2184901AfA = C2184911AfB.LIZIZ) != null) {
                    C1713420ugm.LJ = c2184901AfA;
                    Iterator it2 = ((ArrayList) C1713420ugm.LIZ).iterator();
                    C2184301AeC c2184301AeC2 = null;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1701700uNs c1701700uNsLIZIZ = ((InterfaceC2185021AfM) it2.next()).LIZIZ(c2184901AfA, str, name2);
                        if (c1701700uNsLIZIZ != null && (numValueOf = Integer.valueOf(c1701700uNsLIZIZ.LIZ)) != null) {
                            if (numValueOf.intValue() == 1) {
                                if (c2184301AeC2 != null || (c2184301AeC2 = c1701700uNsLIZIZ.LIZIZ) != null) {
                                    long j = c2184301AeC2.LJIIIIZZ;
                                    if (j > 0 && str != null && str.length() > 0) {
                                        C1713420ugm.LIZIZ.put(str, Long.valueOf(j));
                                        C1713420ugm.LIZJ.put(str, c2184301AeC2.LJFF);
                                        C1713420ugm.LIZLLL.put(str, Boolean.valueOf(c2184301AeC2.LJIIJ));
                                    }
                                }
                                C2184901AfA c2184901AfA2 = C2184911AfB.LIZIZ;
                                if (c2184901AfA2 != null && (i = c2184901AfA2.LIZ) > 0 && C2184911AfB.LIZLLL.size() > i) {
                                    C2184911AfB.LIZLLL(EnumC2184861Af6.QUEUE_FULL);
                                }
                                String name3 = C786410Ut5.u3().getName();
                                EnumC2184291AeB enumC2184291AeB = C1713420ugm.LIZJ.get(str);
                                if (enumC2184291AeB == null) {
                                    enumC2184291AeB = EnumC2184291AeB.TIME;
                                }
                                Long l = C1713420ugm.LIZIZ.get(str);
                                if (l != null && l.longValue() != 0) {
                                    jLongValue = l.longValue();
                                } else {
                                    C2184901AfA c2184901AfA3 = C1713420ugm.LJ;
                                    if (c2184901AfA3 != null) {
                                        jLongValue = c2184901AfA3.LIZJ;
                                    } else {
                                        jLongValue = Mp4ScreenVideoLoadTimeout.CONTROL;
                                    }
                                }
                                int i2 = C2184851Af5.LIZ[enumC2184291AeB.ordinal()];
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(name3);
                                        sbLIZ.append(':');
                                        sbLIZ.append(str);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        c2185001AfKLIZJ = C2184911AfB.LIZJ(strLIZIZ, EnumC2184291AeB.PARK, str);
                                        if (!c2185001AfKLIZJ.LIZIZ) {
                                            c2185001AfKLIZJ.LJFF = SystemClock.elapsedRealtime();
                                            c2185001AfKLIZJ.LJI = jLongValue;
                                            c2185001AfKLIZJ.LIZIZ = true;
                                            try {
                                                try {
                                                    boolean zAwait = c2185001AfKLIZJ.LIZ.await(jLongValue, TimeUnit.MILLISECONDS);
                                                    SystemClock.elapsedRealtime();
                                                    if (zAwait && c2185001AfKLIZJ.LJ && (c2184951AfF = C2184911AfB.LJII) != null && !c2184951AfF.LJIILIIL && (c2184981AfI2 = c2184951AfF.LJIIIIZZ) != null) {
                                                        c2184981AfI2.LIZ(strLIZIZ);
                                                    }
                                                } catch (InterruptedException e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                    C786410Ut5.u3().interrupt();
                                                    SystemClock.elapsedRealtime();
                                                }
                                                c2185001AfKLIZJ.LIZIZ = false;
                                                C2184911AfB.LIZLLL.remove(strLIZIZ);
                                            } finally {
                                            }
                                        }
                                    }
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(name3);
                                    sbLIZ2.append(':');
                                    sbLIZ2.append(str);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                    c2185001AfKLIZJ = C2184911AfB.LIZJ(strLIZIZ, EnumC2184291AeB.TIME, str);
                                    try {
                                        try {
                                            c2185001AfKLIZJ.LJFF = SystemClock.elapsedRealtime();
                                            c2185001AfKLIZJ.LJI = jLongValue;
                                            c2185001AfKLIZJ.LIZIZ = true;
                                            Thread.sleep(jLongValue);
                                        } catch (InterruptedException e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            C786410Ut5.u3().interrupt();
                                        }
                                        SystemClock.elapsedRealtime();
                                        c2185001AfKLIZJ.LIZIZ = false;
                                        C2184911AfB.LIZLLL.remove(strLIZIZ);
                                    } finally {
                                    }
                                }
                            } else {
                                if (numValueOf.intValue() == 2) {
                                    break;
                                }
                                if (numValueOf.intValue() == 0 && c2184301AeC2 == null && (c2184301AeC = c1701700uNsLIZIZ.LIZIZ) != null) {
                                    c2184301AeC2 = c2184301AeC;
                                }
                            }
                        }
                    }
                }
            }
            C2184951AfF c2184951AfF2 = C2184911AfB.LJII;
            if (c2184951AfF2 != null && !c2184951AfF2.LJIILIIL && c2184951AfF2.LIZLLL && !((ConcurrentHashMap.KeySetView) c2184951AfF2.LJIILJJIL).isEmpty() && str != null && (threadU3 = C786410Ut5.u3()) != Looper.getMainLooper().getThread() && !c2184951AfF2.LJIIL.LJJI && (name = threadU3.getName()) != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(name);
                sbLIZ3.append(':');
                sbLIZ3.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                if (((ConcurrentHashMap.KeySetView) c2184951AfF2.LJIILJJIL).contains(strLIZIZ2)) {
                    C2185001AfK c2185001AfK = c2184951AfF2.LIZ.get(strLIZIZ2);
                    if (c2185001AfK == null) {
                        ((ConcurrentHashMap.KeySetView) c2184951AfF2.LJIILJJIL).remove(strLIZIZ2);
                        return;
                    }
                    if (!Intrinsics.LJFF(c2185001AfK.LIZLLL, "re-lock")) {
                        return;
                    }
                    if (!c2185001AfK.LIZIZ) {
                        ((ConcurrentHashMap.KeySetView) c2184951AfF2.LJIILJJIL).remove(strLIZIZ2);
                        return;
                    }
                    long j2 = c2184951AfF2.LJIIL.LJIJJ;
                    if (j2 < 1) {
                        j2 = 1;
                    }
                    SystemClock.elapsedRealtime();
                    boolean zAwait2 = c2185001AfK.LIZ.await(j2, TimeUnit.MILLISECONDS);
                    SystemClock.elapsedRealtime();
                    ((ConcurrentHashMap.KeySetView) c2184951AfF2.LJIILJJIL).remove(strLIZIZ2);
                    if (zAwait2 && c2185001AfK.LJ && (c2184981AfI = c2184951AfF2.LJIIIIZZ) != null) {
                        c2184981AfI.LIZ(strLIZIZ2);
                    }
                    c2185001AfK.LIZIZ = false;
                    c2184951AfF2.LIZ.remove(strLIZIZ2);
                }
            }
        }
    };

    public static void LIZIZ() {
        boolean z = LJ;
        if (LIZJ == z) {
            return;
        }
        LIZJ = z;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Interceptor] ON  scene=");
            C2184901AfA c2184901AfA = LIZIZ;
            sbLIZ.append(c2184901AfA != null ? c2184901AfA.LJFF : null);
            C2188811AlT.LIZIZ(sbLIZ);
            C202111146j.LIZ(LJIIIIZZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[Interceptor] OFF scene=");
        C2184901AfA c2184901AfA2 = LIZIZ;
        sbLIZ2.append(c2184901AfA2 != null ? c2184901AfA2.LJFF : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        C202111146j.LIZIZ(LJIIIIZZ);
        C1C7V.LJ = null;
    }

    public static void LJFF() {
        ArrayDeque<C2184901AfA> arrayDeque = LJI;
        C2184901AfA c2184901AfAPollFirst = arrayDeque.pollFirst();
        if (c2184901AfAPollFirst == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayDeque, 10));
        Iterator<C2184901AfA> it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJFF);
        }
        LIZ(c2184901AfAPollFirst);
    }

    public static void LIZ(C2184901AfA c2184901AfA) {
        for (InterfaceC2185021AfM interfaceC2185021AfM : (ArrayList) C1713420ugm.LIZ) {
            if (interfaceC2185021AfM instanceof C1701690uNr) {
                interfaceC2185021AfM.LIZ(c2184901AfA);
            }
        }
        LJ = true;
        LIZIZ = c2184901AfA;
        LIZIZ();
    }

    public static void LIZLLL(EnumC2184861Af6 enumC2184861Af6) {
        C2097508Jp<String, C2185001AfK> c2097508Jp = LIZLLL;
        if (c2097508Jp.size() == 0) {
            return;
        }
        c2097508Jp.LIZ(new AwS612S0100000_33(enumC2184861Af6, 187));
    }

    public static void LJI(EnumC2184861Af6 enumC2184861Af6) {
        LIZLLL.size();
        C2184951AfF c2184951AfF = LJII;
        if (c2184951AfF != null) {
            c2184951AfF.LJIILIIL = true;
            C2184941AfE c2184941AfE = c2184951AfF.LJIIL;
            c2184941AfE.LJJI = true;
            c2184941AfE.LIZIZ(enumC2184861Af6);
            if (c2184951AfF.LIZLLL && !((ConcurrentHashMap.KeySetView) c2184951AfF.LJIILJJIL).isEmpty()) {
                ArrayList arrayList = new ArrayList(c2184951AfF.LJIILJJIL);
                ((ConcurrentHashMap.KeySetView) c2184951AfF.LJIILJJIL).clear();
                for (Object obj : arrayList) {
                    C2185001AfK c2185001AfK = c2184951AfF.LIZ.get(obj);
                    if (c2185001AfK != null && c2185001AfK.LIZIZ) {
                        c2184951AfF.LIZIZ.invoke((String) obj, c2185001AfK, enumC2184861Af6);
                    }
                }
            }
            c2184951AfF.LIZ();
            LJII = null;
        }
        LJ = false;
        LIZIZ();
        LIZLLL(enumC2184861Af6);
        LIZLLL.clear();
        LIZIZ = null;
    }

    public static void LJ(C2185001AfK c2185001AfK, EnumC2184861Af6 enumC2184861Af6) {
        if (!c2185001AfK.LIZIZ || c2185001AfK.LIZJ != EnumC2184291AeB.PARK) {
            return;
        }
        try {
            int i = C2184851Af5.LIZJ[enumC2184861Af6.ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                throw new C1954807lC();
            }
            if (enumC2184861Af6 == EnumC2184861Af6.STAGGERED_RELEASE) {
                c2185001AfK.LJ = true;
            }
            c2185001AfK.LIZIZ = false;
            c2185001AfK.LIZ.countDown();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2200821BBo.LIZIZ) {
                throw th;
            }
        }
    }

    public static C2185001AfK LIZJ(String str, EnumC2184291AeB enumC2184291AeB, String str2) {
        String str3;
        C2097508Jp<String, C2185001AfK> c2097508Jp = LIZLLL;
        C2185001AfK c2185001AfK = c2097508Jp.get(str);
        if (c2185001AfK == null) {
            c2185001AfK = new C2185001AfK();
            c2097508Jp.put(str, c2185001AfK);
        }
        c2185001AfK.LIZJ = enumC2184291AeB;
        C2184901AfA c2184901AfA = LIZIZ;
        if (c2184901AfA == null || (str3 = c2184901AfA.LJFF) == null) {
            str3 = "";
        }
        c2185001AfK.LIZLLL = str3;
        c2185001AfK.LJII = Intrinsics.LJFF(C1713420ugm.LIZLLL.get(str2), Boolean.TRUE);
        return c2185001AfK;
    }
}
