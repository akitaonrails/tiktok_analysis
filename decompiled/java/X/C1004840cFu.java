package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;

/* JADX INFO: renamed from: X.0cFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004840cFu {
    public int LIZ = 0;
    public boolean LIZIZ = false;
    public boolean LIZJ = false;
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = false;
    public boolean LJI = false;
    public boolean LJII = false;
    public String LJIIIIZZ = null;
    public int LJIIIZ = -1;
    public String LJIIJ = "";
    public boolean LJIIJJI = false;
    public String LJIIL = null;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;

    public static boolean LIZ() {
        long jLIZIZ = ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
        C1358720lSg.LIZ.getClass();
        return !C2205108kT.LIZ(jLIZIZ, C1358720lSg.LIZIZ().getLong(C1358720lSg.LIZ("recorded_time_stamp"), 0L));
    }

    public static boolean LIZIZ() {
        int i;
        if (LIZ()) {
            i = 0;
        } else {
            C1358720lSg.LIZ.getClass();
            i = C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("recorded_times"), 0);
        }
        return i >= ((Number) C264180AWy.LIZ.getValue()).intValue();
    }
}
