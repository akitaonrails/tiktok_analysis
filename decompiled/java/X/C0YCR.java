package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0YCR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCR {
    public final InterfaceC863730XuV LIZ;
    public final C868780Y6i LIZIZ;
    public final C0YLL LIZJ;
    public final C0YJ8 LIZLLL;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public Function0<? extends C868140Y3w> LJIJI;
    public C0YJA LJIJJ;
    public C0YCU LJ = C0YCU.INSTANTIATE;
    public String LJFF = "";
    public Set<Integer> LJIILL = new LinkedHashSet();
    public final C054G LJIJJLI = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C0YCS(CoroutineExceptionHandler.LJJLIL, this)));

    public final void LIZ() {
        C868780Y6i.LJIILJJIL(this.LIZIZ, "InitMetricsHelper", "onLogout", 4);
        this.LJI = SystemClock.uptimeMillis();
        this.LJIILLIIL = true;
        this.LJ = C0YCU.INSTANTIATE;
        this.LJFF = "";
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LJIILIIL = 0;
        this.LJIILJJIL = 0;
        this.LJIILL = new LinkedHashSet();
        this.LJIIZILJ = false;
        this.LJIJ = false;
        C23118094a.LJ(this.LJIJJLI.LL);
    }

    public final void LIZLLL() {
        if (this.LJIJ) {
            return;
        }
        C0YCU c0ycu = this.LJ;
        C0YCU c0ycu2 = C0YCU.LOGIN;
        if (c0ycu.compareTo(c0ycu2) >= 0 && this.LJ.compareTo(C0YCU.COMPLETED) < 0) {
            this.LJIILIIL++;
        } else if (this.LJ.compareTo(c0ycu2) < 0) {
            this.LJIILJJIL++;
            this.LJIILIIL++;
        }
    }

    public final void LJ() {
        if (this.LJIJ) {
            return;
        }
        C0YCU c0ycu = this.LJ;
        C0YCU c0ycu2 = C0YCU.LOGIN;
        if (c0ycu.compareTo(c0ycu2) >= 0 && this.LJ.compareTo(C0YCU.COMPLETED) < 0) {
            this.LJIIJJI++;
        } else if (this.LJ.compareTo(c0ycu2) < 0) {
            this.LJIIL++;
            this.LJIIJJI++;
        }
    }

    public final void LIZIZ(boolean z) {
        if (this.LJIJ) {
            return;
        }
        this.LJIJ = true;
        C0YJA c0yja = this.LJIJJ;
        if (c0yja == null) {
            return;
        }
        C0YJ9 c0yj9 = new C0YJ9(c0yja);
        c0yj9.LIZJ("imsdk_init_perf");
        c0yj9.LIZ(Integer.valueOf(!z ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        Map<String, String> mapLJIIIIZZ = this.LIZLLL.LJIIIIZZ("imsdk_init_perf");
        if (mapLJIIIIZZ != null && !mapLJIIIIZZ.isEmpty()) {
            c0yj9.LIZIZ(mapLJIIIIZZ);
        }
        if (!z) {
            c0yj9.LIZ(this.LJFF, "error");
            c0yj9.LIZ(this.LJ, "fail_stage");
        }
        if (this.LJ.compareTo(C0YCU.INSTANTIATE) > 0) {
            if (this.LJIILLIIL) {
                c0yj9.LIZ(Long.valueOf(this.LJII - this.LJI), "logout_duration");
            } else {
                c0yj9.LIZ(Long.valueOf(this.LJII - this.LJI), "instantiation_duration");
            }
        }
        if (this.LJ.compareTo(C0YCU.LOGIN) > 0) {
            c0yj9.LIZ(Long.valueOf(this.LJIIIIZZ - this.LJII), "login_duration");
            c0yj9.LIZ(Long.valueOf(this.LJIIIIZZ - this.LJI), "total_init_duration");
        }
        if (this.LJ.compareTo(C0YCU.DATA_SYNC) > 0) {
            if (this.LJIIJ == 0) {
                this.LJIIJ = this.LJIIIZ;
            }
            if (this.LJIIZILJ) {
                c0yj9.LIZ(Long.valueOf(this.LJIIIZ - this.LJIIIIZZ), "datasync_init_duration");
            }
            c0yj9.LIZ(Long.valueOf(this.LJIIJ - this.LJIIIIZZ), "datasync_duration");
            c0yj9.LIZ(Long.valueOf(this.LJIIJ - this.LJI), "total_startup_duration");
        }
        c0yj9.LIZ(Integer.valueOf(this.LJIIJJI), "network_request_count");
        c0yj9.LIZ(Integer.valueOf(this.LJIIL), "network_request_count_before_login");
        c0yj9.LIZ(Integer.valueOf(this.LJIILIIL), "db_request_count");
        c0yj9.LIZ(Integer.valueOf(this.LJIILJJIL), "db_request_count_before_login");
        c0yj9.LJ(0.001f);
    }

    public final void LIZJ(String str) {
        this.LJFF = str;
        C23250099c.LIZLLL(this.LJIJJLI, null, null, new C0Y5V(this, null), 3);
    }

    public final void LJFF(C0YCU c0ycu) {
        if (c0ycu.compareTo(this.LJ) < 0) {
            return;
        }
        C868780Y6i c868780Y6i = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entering new stage ");
        sbLIZ.append(c0ycu);
        sbLIZ.append(" from ");
        sbLIZ.append(this.LJ);
        C868780Y6i.LJIILJJIL(c868780Y6i, "InitMetricsHelper", C2188811AlT.LIZIZ(sbLIZ), 4);
        int i = C0YCT.LIZ[c0ycu.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LJIIIIZZ = SystemClock.uptimeMillis();
            }
        } else {
            this.LJII = SystemClock.uptimeMillis();
        }
        this.LJ = c0ycu;
    }

    public C0YCR(InterfaceC863730XuV interfaceC863730XuV, C868780Y6i c868780Y6i, C0YLL c0yll, C0YJ8 c0yj8) {
        this.LIZ = interfaceC863730XuV;
        this.LIZIZ = c868780Y6i;
        this.LIZJ = c0yll;
        this.LIZLLL = c0yj8;
        C868780Y6i.LJIILJJIL(c868780Y6i, "InitMetricsHelper", "IMSDK instantiated", 4);
        this.LJI = SystemClock.uptimeMillis();
    }
}
