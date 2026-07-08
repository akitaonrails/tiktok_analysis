package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NOH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOH {
    public long LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJFF;
    public long LJI;
    public AnonymousClass0956 LJII;
    public long LIZ = -1;
    public final List<InterfaceC1631620sYq<Integer, Integer, Long, Unit>> LJ = new ArrayList();

    public final boolean LIZIZ() {
        int i = this.LIZJ;
        return i == 2 || i == 4;
    }

    public final void LIZJ() {
        ((ArrayList) this.LJ).clear();
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJII = null;
        this.LIZJ = 0;
    }

    public static void LJ(C0NOH c0noh) {
        AnonymousClass0956 anonymousClass0956 = c0noh.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c0noh.LJII = null;
        try {
            c0noh.LIZ = c0noh.LJI - c0noh.LIZIZ;
            c0noh.LJII = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C0NNN(c0noh, 1000L, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Long, Unit> interfaceC1631620sYq) {
        if (!((ArrayList) this.LJ).contains(interfaceC1631620sYq)) {
            ((ArrayList) this.LJ).add(interfaceC1631620sYq);
        }
    }

    public final void LIZLLL(C0NOI c0noi) {
        int i;
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJII = null;
        try {
            long j = c0noi.LIZ;
            long j2 = c0noi.LIZIZ;
            long jElapsedRealtime = c0noi.LIZJ;
            if (jElapsedRealtime <= 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            long j3 = c0noi.LIZLLL;
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setCountDownTime startTime = ");
            sbLIZ.append(j);
            sbLIZ.append(" , endTime = ");
            sbLIZ.append(j2);
            sbLIZ.append(" , createTime = ");
            sbLIZ.append(jElapsedRealtime);
            sbLIZ.append(" , serverTime = ");
            sbLIZ.append(j3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            this.LJFF = (j - j3) + jElapsedRealtime;
            this.LJI = (j2 - j3) + jElapsedRealtime;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.LIZIZ = jElapsedRealtime2;
            long j4 = this.LJI;
            this.LIZ = j4 - jElapsedRealtime2;
            if (this.LJFF <= jElapsedRealtime2 && jElapsedRealtime2 < j4) {
                i = 2;
            } else if (jElapsedRealtime2 >= j4) {
                i = 3;
            } else {
                i = 4;
            }
            this.LIZJ = i;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setCountDownTime currentState = ");
            sbLIZ2.append(this.LIZJ);
            C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LIZLLL = this.LIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
