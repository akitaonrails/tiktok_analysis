package X;

import Y.ARunnableS18S1300000_23;
import Y.ARunnableS27S1200000_23;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS86S1300000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ovc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491980ovc {
    public static final C1491980ovc LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static Handler LJ;
    public static final ArrayMap<Integer, Executor> LJFF;
    public static InterfaceC1491880ovS LJI;
    public static final Map<String, InterfaceC1491850ovP> LJII;
    public static final C20136513qd LJIIIIZZ;
    public static final AtomicBoolean LJIIIZ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1491980ovc.class, "initTime", "getInitTime$pscheduler_release()J", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C1491980ovc();
        LIZJ = C452501pT.LIZIZ(new C0CB6());
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1492010ovf());
        LIZLLL = c01gwLIZIZ;
        LJFF = (ArrayMap) c01gwLIZIZ.getValue();
        LJII = new LinkedHashMap();
        C769700UHg.LIZ.getClass();
        LJIIIIZZ = new C20136513qd();
        LJIIIZ = new AtomicBoolean(false);
    }

    public final long LIZJ() {
        return ((Number) LJIIIIZZ.getValue(this, LIZIZ[0])).longValue();
    }

    public final <T> T LIZ(C1491990ovd c1491990ovd, Function0<? extends T> function0, Function0<? extends T> function02) {
        InterfaceC1491880ovS interfaceC1491880ovS;
        InterfaceC1491880ovS interfaceC1491880ovS2;
        InterfaceC1491970ovb interfaceC1491970ovb;
        int iIntValue;
        int iIntValue2;
        T tInvoke = null;
        LIZLLL(null, null, null);
        if (c1491990ovd.LIZIZ) {
            switch (C1492090ovn.LIZ[c1491990ovd.LIZJ.ordinal()]) {
                case 1:
                    Integer num = c1491990ovd.LIZLLL;
                    if (num == null || ((iIntValue2 = num.intValue()) <= 19 && iIntValue2 >= -20)) {
                        interfaceC1491970ovb = new InterfaceC1491970ovb() { // from class: X.0ova
                            @Override // X.InterfaceC1491970ovb
                            public final Object LIZ(Integer num2, String str, Function0 function03, Function0 function04) {
                                C1491980ovc.LIZ.getClass();
                                Executor executor = C1491980ovc.LJFF.get(0);
                                if (executor != null) {
                                    executor.execute(new ARunnableS18S1300000_23(num2, function03, str, function04, 7));
                                    return null;
                                }
                                return null;
                            }
                        };
                    } else {
                        throw new Exception("AsyncPriorityScheduler can't excute! schedulerRegister.extra must <= 19 && >= -20");
                    }
                    break;
                case 2:
                    interfaceC1491970ovb = new InterfaceC1491970ovb() { // from class: X.0ovX
                        @Override // X.InterfaceC1491970ovb
                        public final Object LIZ(Integer num2, String str, Function0 function03, Function0 function04) {
                            C1491920ovW c1491920ovW = new C1491920ovW(str, function03, function04);
                            C1491980ovc.LIZ.getClass();
                            InterfaceC1491850ovP interfaceC1491850ovP = (InterfaceC1491850ovP) ((LinkedHashMap) C1491980ovc.LJII).get(str);
                            if (interfaceC1491850ovP != null) {
                                try {
                                    return c1491920ovW.invoke();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C098200Yq c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                        interfaceC1491850ovP.LIZ();
                                        return null;
                                    }
                                    return null;
                                }
                            }
                            return c1491920ovW.invoke();
                        }
                    };
                    break;
                case 3:
                    if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                        Integer num2 = c1491990ovd.LIZLLL;
                        if (num2 != null && num2.intValue() < 0) {
                            throw new Exception("SleepScheduler can't excute! schedulerRegister.extra must >= 0");
                        }
                        interfaceC1491970ovb = new InterfaceC1491970ovb() { // from class: X.0ovT
                            @Override // X.InterfaceC1491970ovb
                            public final Object LIZ(Integer num3, String str, Function0 function03, Function0 function04) {
                                AwS86S1300000_23 awS86S1300000_23 = new AwS86S1300000_23(num3, str, function03, function04, 5);
                                C1491980ovc.LIZ.getClass();
                                InterfaceC1491850ovP interfaceC1491850ovP = (InterfaceC1491850ovP) ((LinkedHashMap) C1491980ovc.LJII).get(str);
                                if (interfaceC1491850ovP != null) {
                                    try {
                                        return awS86S1300000_23.invoke();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C098200Yq c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                            interfaceC1491850ovP.LIZ();
                                            return null;
                                        }
                                        return null;
                                    }
                                }
                                return awS86S1300000_23.invoke();
                            }
                        };
                    } else {
                        throw new Exception("SleepScheduler can't excute! can't sleep mainthread");
                    }
                    break;
                case 4:
                    Integer num3 = c1491990ovd.LIZLLL;
                    if (num3 != null && num3.intValue() >= LJFF.size()) {
                        throw new Exception("AsyncScheduler can't excute! schedulerRegister.extra number > excutorMap size");
                    }
                    interfaceC1491970ovb = new InterfaceC1491970ovb() { // from class: X.0ovZ
                        @Override // X.InterfaceC1491970ovb
                        public final Object LIZ(Integer num4, String str, Function0 function03, Function0 function04) {
                            int iIntValue3;
                            if (num4 != null) {
                                iIntValue3 = num4.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            C1491980ovc.LIZ.getClass();
                            Executor executor = C1491980ovc.LJFF.get(Integer.valueOf(iIntValue3));
                            if (executor != null) {
                                executor.execute(new ARunnableS27S1200000_23(function03, function04, str, 26));
                                return null;
                            }
                            return null;
                        }
                    };
                    break;
                    break;
                case 5:
                    Integer num4 = c1491990ovd.LIZLLL;
                    if (num4 != null && num4.intValue() < 0) {
                        throw new Exception("DelayScheduler can't excute! schedulerRegister.extra must >= 0");
                    }
                    interfaceC1491970ovb = new InterfaceC1491970ovb() { // from class: X.0ovO
                        @Override // X.InterfaceC1491970ovb
                        public final Object LIZ(Integer num5, String str, Function0 function03, Function0 function04) {
                            long jIntValue;
                            if (num5 != null) {
                                jIntValue = num5.intValue();
                            } else {
                                jIntValue = 0;
                            }
                            C1491980ovc.LIZ.getClass();
                            Handler handler = C1491980ovc.LJ;
                            if (handler == null) {
                                handler = null;
                            }
                            C786410Ut5.LJLIIL(jIntValue, handler, new ARunnableS27S1200000_23(function03, function04, str, 27));
                            return null;
                        }
                    };
                    break;
                    break;
                case 6:
                    if (function02 != null && function0 != null) {
                        interfaceC1491970ovb = new InterfaceC1491970ovb() { // from class: X.0ovU
                            @Override // X.InterfaceC1491970ovb
                            public final Object LIZ(Integer num5, String str, Function0 function03, Function0 function04) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (str != null) {
                                    C1491980ovc c1491980ovc = C1491980ovc.LIZ;
                                    c1491980ovc.getClass();
                                    InterfaceC1491880ovS interfaceC1491880ovS3 = C1491980ovc.LJI;
                                    if (interfaceC1491880ovS3 != null) {
                                        c1491980ovc.LIZJ();
                                        interfaceC1491880ovS3.LIZ();
                                    }
                                }
                                C1491910ovV c1491910ovV = new C1491910ovV(jCurrentTimeMillis, str, function04);
                                C1491980ovc.LIZ.getClass();
                                InterfaceC1491850ovP interfaceC1491850ovP = (InterfaceC1491850ovP) ((LinkedHashMap) C1491980ovc.LJII).get(str);
                                if (interfaceC1491850ovP != null) {
                                    try {
                                        return c1491910ovV.invoke();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C098200Yq c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                            interfaceC1491850ovP.LIZ();
                                            return null;
                                        }
                                        return null;
                                    }
                                }
                                return c1491910ovV.invoke();
                            }
                        };
                    } else {
                        throw new Exception("ReplaceScheduler can't excute! originalAction and schedulerRegister.targetAction must be not-null");
                    }
                    break;
                case 7:
                    Integer num5 = c1491990ovd.LIZLLL;
                    if (num5 == null || ((iIntValue = num5.intValue()) <= 19 && iIntValue >= -20)) {
                        interfaceC1491970ovb = new InterfaceC1491970ovb() { // from class: X.0ovQ
                            @Override // X.InterfaceC1491970ovb
                            public final Object LIZ(Integer num6, String str, Function0 function03, Function0 function04) {
                                AwS86S1300000_23 awS86S1300000_23 = new AwS86S1300000_23(num6, str, function03, function04, 8);
                                C1491980ovc.LIZ.getClass();
                                InterfaceC1491850ovP interfaceC1491850ovP = (InterfaceC1491850ovP) ((LinkedHashMap) C1491980ovc.LJII).get(str);
                                if (interfaceC1491850ovP != null) {
                                    try {
                                        return awS86S1300000_23.invoke();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C098200Yq c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                            interfaceC1491850ovP.LIZ();
                                            return null;
                                        }
                                        return null;
                                    }
                                }
                                return awS86S1300000_23.invoke();
                            }
                        };
                    } else {
                        throw new Exception("PriorityScheduler can't excute! schedulerRegister.extra must <= 19 && >= -20");
                    }
                    break;
                case 8:
                    interfaceC1491970ovb = C1491830ovN.LIZ;
                    break;
                default:
                    throw new C1954807lC();
            }
            T t = (T) interfaceC1491970ovb.LIZ(c1491990ovd.LIZLLL, c1491990ovd.LIZ, function02, function0);
            if (t == null) {
                return null;
            }
            return t;
        }
        System.currentTimeMillis();
        String str = c1491990ovd.LIZ;
        if (str != null && (interfaceC1491880ovS2 = LJI) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("origin");
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ.LIZJ();
            interfaceC1491880ovS2.LIZ();
        }
        if (function02 != null) {
            tInvoke = function02.invoke();
        }
        String str2 = c1491990ovd.LIZ;
        if (str2 != null && (interfaceC1491880ovS = LJI) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("origin");
            C2188811AlT.LIZIZ(sbLIZ2);
            System.currentTimeMillis();
            interfaceC1491880ovS.end();
        }
        return tInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Long] */
    public final void LIZLLL(Handler handler, InterfaceC1491880ovS interfaceC1491880ovS, InterfaceC1492000ove interfaceC1492000ove) {
        AtomicBoolean atomicBoolean = LJIIIZ;
        if (!atomicBoolean.get()) {
            synchronized (this) {
                try {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    LIZ.getClass();
                    if (LJ == null) {
                        if (handler == null) {
                            handler = (Handler) LIZJ.getValue();
                        }
                        LJ = handler;
                    }
                    LJI = interfaceC1491880ovS;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C20136513qd c20136513qd = LJIIIIZZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
                    c20136513qd.LL = Long.valueOf(jCurrentTimeMillis);
                    atomicBoolean.set(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
