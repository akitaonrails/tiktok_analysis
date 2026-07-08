package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS277S0000000_32;

/* JADX INFO: renamed from: X.18dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21328418dO {
    public final C21329018dU LIZ;
    public final ConcurrentHashMap<Object, Object> LIZIZ;
    public final HashMap<String, InterfaceC332330D1b> LIZJ;
    public final C1488470opx LIZLLL;
    public final C21343718fr LJ;
    public final C21328818dS LJFF;

    public C21328418dO() {
        this(0);
    }

    public C21328418dO(C21329018dU c21329018dU) {
        this.LIZ = c21329018dU;
        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZIZ = concurrentHashMap;
        HashMap<String, InterfaceC332330D1b> map = new HashMap<>();
        this.LIZJ = map;
        this.LIZLLL = new C1488470opx(map, concurrentHashMap);
        this.LJ = new C21343718fr();
        this.LJFF = new C21328818dS(map);
    }

    public /* synthetic */ C21328418dO(int i) {
        this(new C21329018dU(LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public final Object LIZ(String str, Map<String, ? extends Object> map, C21325918cz c21325918cz, Function1<? super C14SW, Unit> function1) {
        C21328118dL c21328118dL;
        boolean z;
        C1545310qJd c1545310qJdLIZLLL;
        if (c21325918cz != null) {
            c21328118dL = c21325918cz.LJIIJ;
        } else {
            c21328118dL = null;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C013C c013c = new C013C();
            c013c.element = true;
            C1488350opl c1488350oplLIZ = this.LIZ.LIZ.LIZ.get(str.trim());
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            if (c1488350oplLIZ == null) {
                c013c.element = false;
                C21343718fr c21343718fr = this.LJ;
                C21328818dS c21328818dS = this.LJFF;
                c21343718fr.getClass();
                c1488350oplLIZ = C21343718fr.LIZ(str, c21328818dS);
                this.LIZ.LIZ.LIZ.put(str.trim(), c1488350oplLIZ);
            }
            long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
            Object objLIZ = C1488330opj.LIZ(c1488350oplLIZ, map, this.LIZLLL);
            long jElapsedRealtimeNanos4 = SystemClock.elapsedRealtimeNanos();
            if (c21328118dL == null || !c21328118dL.LIZ.LIZ.LJJIZ) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                boolean z2 = c013c.element;
                C21328218dM c21328218dM = c21328118dL.LIZJ;
                c21328218dM.LJFF += jElapsedRealtimeNanos3 - jElapsedRealtimeNanos;
                c21328218dM.LJI += jElapsedRealtimeNanos4 - jElapsedRealtimeNanos3;
                c21328218dM.LJII++;
                if (z2) {
                    c21328218dM.LJIIIIZZ++;
                }
            }
            if (C1325860kbg.LJII()) {
                C238400w2 c238400w2 = new C238400w2();
                if (c013c.element) {
                    long jElapsedRealtimeNanos5 = SystemClock.elapsedRealtimeNanos();
                    C21343718fr c21343718fr2 = this.LJ;
                    C21328818dS c21328818dS2 = this.LJFF;
                    c21343718fr2.getClass();
                    C21343718fr.LIZ(str, c21328818dS2);
                    c238400w2.element = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos5;
                }
                if (c21325918cz != null && (c1545310qJdLIZLLL = c21325918cz.LIZLLL()) != null) {
                    try {
                        C1549250qPz c1549250qPz = new C1549250qPz(str, objLIZ, c013c, jElapsedRealtimeNanos, jElapsedRealtimeNanos2, jElapsedRealtimeNanos3, jElapsedRealtimeNanos4, c238400w2);
                        if (C1325860kbg.LJII()) {
                            c1545310qJdLIZLLL.LIZIZ.add((C201900q9) c1549250qPz.invoke());
                            return objLIZ;
                        }
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        if (function1 != null) {
                            function1.invoke(new C14SW(str, th, 2000));
                        }
                        C1168400gVi.LIZIZ(new AwS277S0000000_32(str, th, 0));
                        return null;
                    }
                }
            }
            return objLIZ;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
