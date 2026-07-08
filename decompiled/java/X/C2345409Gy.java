package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09Gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2345409Gy {
    public static boolean LIZ;
    public static int LIZIZ = -1;
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public static final List<RunnableC2345109Gv> LIZLLL = new ArrayList();

    public static final boolean LIZ() {
        if (!LIZ) {
            return false;
        }
        if (LIZIZ < 0) {
            LIZIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "start_shoot_anim_opt_exp", true);
        }
        return LIZ && LIZIZ > 0;
    }

    public static final void LIZIZ(RunnableC2345109Gv runnableC2345109Gv) {
        ((ArrayList) LIZLLL).add(runnableC2345109Gv);
    }
}
