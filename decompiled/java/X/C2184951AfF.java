package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184951AfF {
    public final C2097508Jp<String, C2185001AfK> LIZ;
    public final InterfaceC1631620sYq<String, C2185001AfK, EnumC2184861Af6, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final boolean LIZLLL;
    public final C2185031AfN LJ;
    public final C2184971AfH LJFF;
    public final boolean LJI;
    public final C2184991AfJ LJII;
    public final C2184981AfI LJIIIIZZ;
    public final double LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final C2184941AfE LJIIL;
    public volatile boolean LJIILIIL;
    public final Set<String> LJIILJJIL;

    public final void LIZ() {
        C2184971AfH c2184971AfH = this.LJFF;
        c2184971AfH.LIZLLL = false;
        ((Handler) c2184971AfH.LJII.getValue()).removeCallbacks(c2184971AfH.LJIIIIZZ);
        C0NBO.LIZIZ().removeCallbacks(c2184971AfH.LJIIIZ);
        c2184971AfH.LJ = false;
        C2184991AfJ c2184991AfJ = this.LJII;
        if (c2184991AfJ != null && c2184991AfJ.LIZJ) {
            c2184991AfJ.LIZJ = false;
            C786410Ut5.LJJZZIII((Handler) c2184991AfJ.LJI.getValue(), c2184991AfJ.LJIIIZ);
        }
        C2184981AfI c2184981AfI = this.LJIIIIZZ;
        if (c2184981AfI != null) {
            c2184981AfI.LIZJ.size();
            ((ConcurrentHashMap.KeySetView) c2184981AfI.LIZLLL).size();
            ((ConcurrentHashMap.KeySetView) c2184981AfI.LJ).size();
            c2184981AfI.LIZJ.clear();
            ((ConcurrentHashMap.KeySetView) c2184981AfI.LIZLLL).clear();
            ((ConcurrentHashMap.KeySetView) c2184981AfI.LJ).clear();
        }
        ((ConcurrentHashMap.KeySetView) this.LJIILJJIL).clear();
    }

    public C2184951AfF(C2184901AfA c2184901AfA, C2097508Jp c2097508Jp, C2184871Af7 c2184871Af7, AwS434S0200000_33 awS434S0200000_33) {
        boolean z;
        C2184991AfJ c2184991AfJ;
        double d;
        this.LIZ = c2097508Jp;
        this.LIZIZ = c2184871Af7;
        this.LIZJ = awS434S0200000_33;
        C2184891Af9 c2184891Af9 = c2184901AfA.LJ;
        boolean z2 = c2184891Af9.LIZIZ;
        this.LIZLLL = z2;
        C2185031AfN c2185031AfN = new C2185031AfN();
        this.LJ = c2185031AfN;
        C2184971AfH c2184971AfH = new C2184971AfH();
        this.LJFF = c2184971AfH;
        if (c2184891Af9.LJII > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
        if (z) {
            c2184991AfJ = new C2184991AfJ();
        } else {
            c2184991AfJ = null;
        }
        this.LJII = c2184991AfJ;
        this.LJIIIIZZ = z2 ? new C2184981AfI(c2184891Af9.LJIIIIZZ) : null;
        this.LJIIJ = c2184891Af9.LJI;
        this.LJIIJJI = c2184891Af9.LJII;
        this.LJIILJJIL = ConcurrentHashMap.newKeySet();
        long j = c2184891Af9.LIZJ;
        j = j <= 0 ? 50L : j;
        long j2 = c2184891Af9.LJ;
        j2 = j2 <= 0 ? ((long) 8) * j : j2;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        iAvailableProcessors = iAvailableProcessors < 1 ? 1 : iAvailableProcessors;
        double dLIZJ = C13LZ.LIZJ(c2184891Af9.LJIIJ, 0.1d, 1.0d);
        double d2 = c2184891Af9.LJFF;
        double d3 = iAvailableProcessors;
        double d4 = (d2 < 0.0d ? 0.0d : d2) * d3;
        double d5 = d3 * dLIZJ;
        if (d4 < d5) {
            d = d4;
        } else {
            d = 0.8d * d5;
        }
        this.LJIIIZ = d;
        long j3 = c2184891Af9.LIZLLL;
        j3 = j3 <= 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j3;
        int i = c2184891Af9.LJIIIZ;
        i = i < 1 ? 1 : i;
        C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1));
        C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d5)}, 1));
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c2184891Af9.LJII);
            sbLIZ.append("ms");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LJIIL = new C2184941AfE(j, j2, j3, d, d5, c2184891Af9.LJI, c2184891Af9.LJII, i, c2184901AfA.LJFF, c2185031AfN, c2184971AfH, c2184991AfJ, c2184871Af7, new C2184961AfG(this), new AwS577S0100000_33(this, 3918));
    }
}
