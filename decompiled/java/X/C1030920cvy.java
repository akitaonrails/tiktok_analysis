package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030920cvy {
    public static C2472609mW LIZ;
    public static String LIZIZ;
    public static InterfaceC1030970cw3 LIZJ;
    public static final long LIZLLL = ((Number) C302570BtX.LIZIZ.getValue()).longValue();
    public static EnumC1030940cw0 LJ = EnumC1030940cw0.DEFAULT;
    public static PthreadTimer LJFF;
    public static C1030870cvt LJI;
    public static boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        C0X52 c0x52LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C1030870cvt c1030870cvt = LJI;
            if (c1030870cvt != null) {
                Map<String, Long> map = c1030870cvt.LIZ;
                C1030850cvr.LIZ.getClass();
                map.put(C1030850cvr.LIZLLL.LIZ, Long.valueOf(C1030960cw2.LIZ()));
            }
            C08TN.LIZ().LJ("splash_request", false);
            c0x52LIZ = C1056780dbg.LIZ(LJI);
        } catch (Exception e) {
            e = e;
            c0x52LIZ = null;
        }
        try {
            C08TN.LIZ().LJI("splash_request");
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        C1030870cvt c1030870cvt2 = LJI;
        if (c1030870cvt2 != null) {
            Map<String, Long> map2 = c1030870cvt2.LIZ;
            C1030850cvr.LIZ.getClass();
            map2.put(C1030850cvr.LJ.LIZ, Long.valueOf(C1030960cw2.LIZ()));
        }
        C1030870cvt c1030870cvt3 = LJI;
        if (c1030870cvt3 != null) {
            Long lValueOf = Long.valueOf(jElapsedRealtime2);
            Map<String, Long> map3 = c1030870cvt3.LIZ;
            C1030850cvr.LIZ.getClass();
            map3.put(C1030850cvr.LJFF.LIZ, lValueOf);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realtime splash  type:REQUEST_COST cost time:");
        sbLIZ.append(jElapsedRealtime2);
        sbLIZ.append(" curr:");
        sbLIZ.append(C1030960cw2.LIZ());
        sbLIZ.append(" success:");
        sbLIZ.append(c0x52LIZ != null ? Boolean.valueOf(c0x52LIZ.LIZJ()) : null);
        sbLIZ.append(" ret:");
        sbLIZ.append(c0x52LIZ != null ? (String) c0x52LIZ.LIZIZ : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = (c0x52LIZ == null || !c0x52LIZ.LIZJ()) ? 0 : 1;
        C1030870cvt c1030870cvt4 = LJI;
        if (c1030870cvt4 != null) {
            C1020790cfd c1020790cfd = new C1020790cfd(new Object[0]);
            C1030840cvq.LIZ.getClass();
            c1020790cfd.log(C1030840cvq.LIZIZ, new AwS124S0101000_16(c1030870cvt4, i, 0));
        }
        SystemClock.elapsedRealtime();
        LIZIZ = (c0x52LIZ == null || !c0x52LIZ.LIZJ()) ? null : (String) c0x52LIZ.LIZIZ;
        C2472609mW c2472609mW = LIZ;
        if (c2472609mW == null || c2472609mW.LIZIZ()) {
            return;
        }
        LIZ = null;
        LJ = EnumC1030940cw0.RESPONSE_IN_TIME;
        PthreadTimer pthreadTimer = LJFF;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        LJFF = null;
        InterfaceC1030970cw3 interfaceC1030970cw3 = LIZJ;
        if (interfaceC1030970cw3 != null) {
            interfaceC1030970cw3.LIZ();
        }
    }

    public static void LIZIZ() {
        SystemClock.elapsedRealtime();
        C1499670p81.LIZIZ.LIZJ();
        SystemClock.elapsedRealtime();
        LJ = EnumC1030940cw0.REQUEST_START;
        LIZIZ = null;
        C2472609mW c2472609mW = LIZ;
        if (c2472609mW != null) {
            try {
                c2472609mW.cancel();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZ = null;
        }
        C1030870cvt c1030870cvt = new C1030870cvt();
        LJI = c1030870cvt;
        long j = LIZLLL;
        Long lValueOf = Long.valueOf(j);
        Map<String, Long> map = c1030870cvt.LIZ;
        C1030850cvr.LIZ.getClass();
        map.put(C1030850cvr.LJIIIZ.LIZ, lValueOf);
        C1030870cvt c1030870cvt2 = LJI;
        if (c1030870cvt2 != null) {
            C1020790cfd c1020790cfd = new C1020790cfd(new Object[0]);
            C1030840cvq.LIZ.getClass();
            c1020790cfd.log(C1030840cvq.LIZIZ, new AwS595S0100000_16(c1030870cvt2, 23));
        }
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            LJ = EnumC1030940cw0.RESPONSE_IN_TIME_NO_NET;
            LIZIZ = null;
            InterfaceC1030970cw3 interfaceC1030970cw3 = LIZJ;
            if (interfaceC1030970cw3 != null) {
                interfaceC1030970cw3.LIZ();
            }
            C1030870cvt c1030870cvt3 = LJI;
            if (c1030870cvt3 != null) {
                C1020790cfd c1020790cfd2 = new C1020790cfd(new Object[0]);
                C1030840cvq.LIZ.getClass();
                c1020790cfd2.log(C1030840cvq.LIZIZ, new AwS595S0100000_16(c1030870cvt3, 22));
                return;
            }
            return;
        }
        LIZ = new C2472609mW();
        PthreadTimer pthreadTimer = LJFF;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        LJFF = null;
        PthreadTimer pthreadTimer2 = new PthreadTimer("RealTimeSplashManager");
        pthreadTimer2.schedule(new C0W9W() { // from class: X.0cvz
            public static void LIZ() {
                try {
                    C2472609mW c2472609mW2 = C1030920cvy.LIZ;
                    if (c2472609mW2 != null) {
                        c2472609mW2.cancel();
                    }
                } catch (IllegalStateException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C1030920cvy.LIZ = null;
                C1030920cvy.LJ = EnumC1030940cw0.RESPONSE_TIMEOUT;
                C1030870cvt c1030870cvt4 = C1030920cvy.LJI;
                if (c1030870cvt4 != null) {
                    C1020790cfd c1020790cfd3 = new C1020790cfd(new Object[0]);
                    C1030840cvq.LIZ.getClass();
                    c1020790cfd3.log(C1030840cvq.LIZIZ, new AwS595S0100000_16(c1030870cvt4, 24));
                }
                InterfaceC1030970cw3 interfaceC1030970cw32 = C1030920cvy.LIZJ;
                if (interfaceC1030970cw32 != null) {
                    interfaceC1030970cw32.LIZ();
                }
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("RealTimeSplashManager@8654.tryRealTimeSplashRequestInBg$1$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    LIZ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("RealTimeSplashManager@8654.tryRealTimeSplashRequestInBg$1$1");
            }
        }, j);
        LJFF = pthreadTimer2;
        if (!C0CAU.LIZ()) {
            LIZ();
            return;
        }
        Callable callable = new Callable() { // from class: X.0CL4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("RealTimeSplashManager@8654.tryRealTimeSplashRequestInBg$2");
                C1030920cvy.LIZ();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RealTimeSplashManager@8654.tryRealTimeSplashRequestInBg$2");
                return unit;
            }
        };
        ExecutorService executorServiceLIZIZ = C823050WQl.LIZIZ();
        C2472609mW c2472609mW2 = LIZ;
        C15O7.LIZIZ(callable, executorServiceLIZIZ, c2472609mW2 != null ? c2472609mW2.LIZ() : null);
    }
}
