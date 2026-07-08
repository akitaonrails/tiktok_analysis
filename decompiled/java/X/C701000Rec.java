package X;

import com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS66S0100100_11;

/* JADX INFO: renamed from: X.0Rec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701000Rec {
    public static final void LIZ(C701270Rf3 c701270Rf3) {
        String str;
        C700970ReZ c700970ReZLIZ;
        C701040Reg c701040Reg;
        C700170RdH c700170RdH = c701270Rf3.LIZIZ;
        C700970ReZ c700970ReZ = c701270Rf3.LIZ;
        if (c700170RdH != null) {
            str = c700170RdH.LIZLLL;
        } else {
            str = null;
        }
        if (!FcpKmpDecisionExp.LIZ(str) && c700970ReZ != null && (c700970ReZLIZ = C701280Rf4.LIZ(c700970ReZ)) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            new C701100Rem(jCurrentTimeMillis, c700970ReZLIZ);
            C0T6L.LIZLLL();
            if ((((Number) C299490BoZ.LIZ.getValue()).intValue() & 4) != 4 && c700170RdH != null && (c701040Reg = c700170RdH.LIZ) != null) {
                ConcurrentHashMap<String, C700970ReZ> concurrentHashMapLIZIZ = c701040Reg.LIZIZ();
                InterfaceC697640RYc interfaceC697640RYc = c700170RdH.LJII;
                C700050Rd5 c700050Rd5 = new C700050Rd5(c701040Reg);
                for (C700970ReZ c700970ReZ2 : concurrentHashMapLIZIZ.values()) {
                    InterfaceC700010Rd1 interfaceC700010Rd1LIZJ = c700170RdH.LIZ.LIZJ(c700970ReZ2.LIZJ);
                    if (interfaceC700010Rd1LIZJ != null) {
                        boolean z = c700970ReZ2.LJI;
                        if (z && interfaceC697640RYc != null) {
                            interfaceC697640RYc.rk(c700970ReZ2, new AwS377S0200000_11(c700050Rd5, interfaceC700010Rd1LIZJ, 8));
                        } else {
                            c700050Rd5.invoke(interfaceC700010Rd1LIZJ, Boolean.valueOf(z));
                        }
                    }
                }
            }
            new C701160Res(System.currentTimeMillis(), c700970ReZLIZ, jCurrentTimeMillis);
            C0T6L.LIZLLL();
        }
    }

    public static final void LIZJ(C701270Rf3 c701270Rf3) {
        String str;
        C700970ReZ c700970ReZLIZ;
        ConcurrentHashMap<String, C700970ReZ> concurrentHashMapLIZIZ;
        ConcurrentHashMap<String, InterfaceC700010Rd1> concurrentHashMapLIZLLL;
        ConcurrentHashMap<String, InterfaceC700010Rd1> concurrentHashMapLIZLLL2;
        C700170RdH c700170RdH = c701270Rf3.LIZIZ;
        C700970ReZ c700970ReZ = c701270Rf3.LIZ;
        if (c700170RdH != null) {
            str = c700170RdH.LIZLLL;
        } else {
            str = null;
        }
        if (!FcpKmpDecisionExp.LIZ(str) && c700970ReZ != null && (c700970ReZLIZ = C701280Rf4.LIZ(c700970ReZ)) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            new C701090Rel(jCurrentTimeMillis, c700970ReZLIZ);
            C0T6L.LIZLLL();
            if (c700170RdH != null) {
                C701040Reg c701040Reg = c700170RdH.LIZ;
                if (c701040Reg != null && (concurrentHashMapLIZLLL2 = c701040Reg.LIZLLL()) != null) {
                    Iterator<Map.Entry<String, InterfaceC700010Rd1>> it2 = concurrentHashMapLIZLLL2.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().LJFF(c700170RdH.LIZ);
                    }
                }
                C701040Reg c701040Reg2 = c700170RdH.LIZ;
                if (c701040Reg2 != null && (concurrentHashMapLIZLLL = c701040Reg2.LIZLLL()) != null) {
                    concurrentHashMapLIZLLL.clear();
                }
                C701040Reg c701040Reg3 = c700170RdH.LIZ;
                if (c701040Reg3 != null && (concurrentHashMapLIZIZ = c701040Reg3.LIZIZ()) != null) {
                    concurrentHashMapLIZIZ.clear();
                }
            }
            new C701150Rer(System.currentTimeMillis(), c700970ReZLIZ, jCurrentTimeMillis);
            C0T6L.LIZLLL();
        }
        c701270Rf3.LIZ = null;
    }

    public static final void LIZIZ(C701270Rf3 c701270Rf3, Object obj) {
        String str;
        C700970ReZ c700970ReZLIZ;
        C700260RdQ c700260RdQ = (C700260RdQ) C700690Re7.LJFF(obj);
        if (c700260RdQ != null) {
            C700170RdH c700170RdH = c701270Rf3.LIZIZ;
            C700970ReZ c700970ReZ = c701270Rf3.LIZ;
            if (c700170RdH != null) {
                str = c700170RdH.LIZLLL;
            } else {
                str = null;
            }
            if (!FcpKmpDecisionExp.LIZ(str) && c700970ReZ != null && (c700970ReZLIZ = C701280Rf4.LIZ(c700970ReZ)) != null) {
                C238400w2 c238400w2 = new C238400w2();
                c238400w2.element = System.currentTimeMillis();
                new C701060Rei(c238400w2, c700970ReZLIZ);
                C0T6L.LIZLLL();
                C700990Reb.LIZ(c700970ReZLIZ);
                C238400w2 c238400w22 = new C238400w2();
                c238400w22.element = System.currentTimeMillis();
                new C701110Ren(c238400w22, c700970ReZLIZ, c238400w2);
                C0T6L.LIZLLL();
                c238400w2.element = System.currentTimeMillis();
                new C701070Rej(c238400w2, c700970ReZLIZ);
                C0T6L.LIZLLL();
                C700990Reb.LIZIZ(c700170RdH, c700970ReZLIZ, C701300Rf6.LIZ, c700260RdQ.LIZ);
                c238400w22.element = System.currentTimeMillis();
                new C701050Reh(c238400w22, c700970ReZLIZ, c238400w2);
                C0T6L.LIZLLL();
            }
        }
    }

    public static final void LIZLLL(C701270Rf3 c701270Rf3, Object obj) {
        String str;
        C700970ReZ c700970ReZLIZ;
        C700260RdQ c700260RdQ = (C700260RdQ) C700690Re7.LJFF(obj);
        if (c700260RdQ != null) {
            C700170RdH c700170RdH = c701270Rf3.LIZIZ;
            C700970ReZ c700970ReZ = c701270Rf3.LIZ;
            if (c700170RdH != null) {
                str = c700170RdH.LIZLLL;
            } else {
                str = null;
            }
            if (!FcpKmpDecisionExp.LIZ(str) && c700970ReZ != null && (c700970ReZLIZ = C701280Rf4.LIZ(c700970ReZ)) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                new AwS66S0100100_11(jCurrentTimeMillis, c700970ReZLIZ, 0);
                C0T6L.LIZLLL();
                C700990Reb.LIZIZ(c700170RdH, c700970ReZLIZ, C701320Rf8.LIZ, c700260RdQ.LIZ);
                new C701080Rek(System.currentTimeMillis(), c700970ReZLIZ, jCurrentTimeMillis);
                C0T6L.LIZLLL();
            }
        }
    }
}
