package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdui.components.list.a;
import java.util.LinkedList;
import t76.d;

/* JADX INFO: renamed from: X.0kNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317310kNt implements d {
    public final C1298420jtQ LIZ;
    public final BPEAHandler LIZIZ;
    public RunnableC1317300kNs LIZJ;
    public LinkedList<C1317320kNu> LIZLLL;
    public LinkedList<C1317320kNu> LJ;

    public final void LIZJ() {
        if (this.LIZJ != null) {
            return;
        }
        RunnableC1317300kNs runnableC1317300kNs = new RunnableC1317300kNs(this);
        this.LIZJ = runnableC1317300kNs;
        C786410Ut5.LJLIIL(50, this.LIZIZ, runnableC1317300kNs);
    }

    public C1317310kNt(C1298420jtQ c1298420jtQ) {
        this.LIZ = c1298420jtQ;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZIZ = bPEAHandler;
        this.LJ = new LinkedList<>();
        this.LIZLLL = new LinkedList<>();
        RunnableC1317300kNs runnableC1317300kNs = new RunnableC1317300kNs(this);
        this.LIZJ = runnableC1317300kNs;
        C786410Ut5.LJLIIL(50, bPEAHandler, runnableC1317300kNs);
    }

    public static boolean LIZLLL(C1317320kNu c1317320kNu) {
        if (c1317320kNu == null || c1317320kNu.LIZ.LL.LLILLJJLI == null || c1317320kNu.LIZIZ == null) {
            return false;
        }
        return true;
    }

    @Override // t76.d
    public final void LIZ(C1317410kO3 c1317410kO3) {
        int i = a.LLLZLZ;
        this.LJ.push(new C1317320kNu(c1317410kO3, "nodedisappear"));
        LIZJ();
    }

    @Override // t76.d
    public final void LIZIZ(C1317410kO3 c1317410kO3) {
        int i = a.LLLZLZ;
        this.LJ.push(new C1317320kNu(c1317410kO3, "nodeappear"));
        LIZJ();
    }
}
