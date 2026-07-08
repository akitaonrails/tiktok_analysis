package X;

import Y.AfS4S0200100_15;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0bi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983820bi0 {
    public static final TimeUnit LIZJ = TimeUnit.SECONDS;
    public final HashSet<InterfaceC983810bhz> LIZ = new HashSet<>();
    public C19487111Lx LIZIZ;

    public final void LIZ(String str, InterfaceC983810bhz interfaceC983810bhz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addTimerCallback, source=");
        sbLIZ.append(str);
        sbLIZ.append(", timerCallback=");
        sbLIZ.append(interfaceC983810bhz.getName());
        sbLIZ.append(", presize=");
        sbLIZ.append(this.LIZ.size());
        C20441214yg.LIZIZ("CompetitionTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.add(interfaceC983810bhz);
        C19487111Lx c19487111Lx = this.LIZIZ;
        if (c19487111Lx == null || C176600m4.LIZIZ(Boolean.valueOf(c19487111Lx.isDisposed()))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addTimerCallback_");
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("start, source=");
            sbLIZ3.append(strLIZIZ);
            C20441214yg.LIZIZ("CompetitionTimerManager", C2188811AlT.LIZIZ(sbLIZ3));
            C19487111Lx c19487111Lx2 = this.LIZIZ;
            if (c19487111Lx2 != null) {
                C500260Jjc.LJJLIIIJLJLI(c19487111Lx2);
            }
            this.LIZIZ = null;
            TimeUnit timeUnit = LIZJ;
            this.LIZIZ = (C19487111Lx) new C11IW(C11NZ.LJJJJL(0L, 1L, timeUnit, C11S5.LIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS4S0200100_15(this, timeUnit, 3)).LJJIIJZLJL(new C987090bnH(this, timeUnit, 0)).LJJIJIIJI(new C516401zm(timeUnit, 2))).LJIILL().LJIIZILJ();
        }
    }

    public final void LIZJ(String str, InterfaceC983810bhz interfaceC983810bhz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeTimerCallback, source=");
        sbLIZ.append(str);
        sbLIZ.append(", timerCallback=");
        sbLIZ.append(interfaceC983810bhz.getName());
        sbLIZ.append(", presize=");
        sbLIZ.append(this.LIZ.size());
        C20441214yg.LIZIZ("CompetitionTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.remove(interfaceC983810bhz);
        if (this.LIZ.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("removeTimerCallback_");
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("stop, source=");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", presize=");
            sbLIZ3.append(this.LIZ.size());
            C20441214yg.LIZIZ("CompetitionTimerManager", C2188811AlT.LIZIZ(sbLIZ3));
            C19487111Lx c19487111Lx = this.LIZIZ;
            if (c19487111Lx != null) {
                C500260Jjc.LJJLIIIJLJLI(c19487111Lx);
            }
            this.LIZIZ = null;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("clearTimerCallback, source=");
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(", presize=");
            sbLIZ4.append(this.LIZ.size());
            C20441214yg.LIZIZ("CompetitionTimerManager", C2188811AlT.LIZIZ(sbLIZ4));
            this.LIZ.clear();
        }
    }

    public final void LIZIZ(long j, long j2, TimeUnit timeUnit) {
        try {
            Iterator<InterfaceC983810bhz> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJ(j, j2, timeUnit);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchInterval, exception = ");
            sbLIZ.append(Unit.LIZ);
            C20441214yg.LJ("CompetitionTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
