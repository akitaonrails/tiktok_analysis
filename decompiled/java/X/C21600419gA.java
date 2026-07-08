package X;

import android.os.Handler;
import android.view.VelocityTracker;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19gA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21600419gA {
    public static boolean LJIILLIIL;
    public static int LJIIZILJ;
    public static int LJIJ;
    public static InterfaceC21605119gv LJIJI;
    public static Handler LJIJJ;
    public float LIZ;
    public float LIZIZ;
    public long LIZJ;
    public boolean LJ;
    public long LJFF;
    public boolean LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public JSONObject LJIIL;
    public JSONObject LJIILIIL;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C21603619gg());
    public final RunnableC21600719gD LJI = new Runnable() { // from class: X.19gD
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("ScrollTracker@77b6.checkTryScrollAgainRunnable$1");
            try {
                C21600419gA c21600419gA = this.LL;
                c21600419gA.LJ = false;
                InterfaceC21605119gv interfaceC21605119gv = C21600419gA.LJIJI;
                if (interfaceC21605119gv != null) {
                    interfaceC21605119gv.LIZ(c21600419gA.LJIIL);
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("ScrollTracker@77b6.checkTryScrollAgainRunnable$1");
        }
    };
    public final RunnableC21600819gE LJII = new Runnable() { // from class: X.19gE
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("ScrollTracker@77b6.checkScrollToOriginRunnable$1");
            try {
                InterfaceC21605119gv interfaceC21605119gv = C21600419gA.LJIJI;
                if (interfaceC21605119gv != null) {
                    interfaceC21605119gv.LIZ(this.LL.LJIIL);
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("ScrollTracker@77b6.checkScrollToOriginRunnable$1");
        }
    };
    public double LJIIIIZZ = -1.0d;
    public final HashSet<InterfaceC21604319gn> LJIILJJIL = new HashSet<>();
    public int LJIILL = -1;

    public final VelocityTracker LIZ() {
        return (VelocityTracker) this.LIZLLL.getValue();
    }

    public final void LIZIZ(InterfaceC21604319gn interfaceC21604319gn) {
        this.LJIILJJIL.add(interfaceC21604319gn);
    }

    public final void LIZJ(InterfaceC21604319gn interfaceC21604319gn) {
        this.LJIILJJIL.remove(interfaceC21604319gn);
    }
}
