package X;

import Y.ARunnableS133S0100000_33;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1APp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178991APp {
    public final C08U8 LIZJ;
    public final C2178971APn LIZLLL;
    public final long LJII;
    public final int LJIIIIZZ;
    public final Set<InterfaceC2179001APq> LIZ = new HashSet();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public C2179051APv LJ = null;
    public boolean LJFF = false;
    public int LJI = 0;

    public final void LIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        C08U8 c08u8 = this.LIZJ;
        c08u8.LIZ.execute(new ARunnableS133S0100000_33(this, 107));
    }

    public C2178991APp(C08U8 c08u8, C2178971APn c2178971APn, long j, int i) {
        this.LJII = 10000L;
        this.LJIIIIZZ = 5;
        this.LIZJ = c08u8;
        this.LIZLLL = c2178971APn;
        this.LJII = j;
        this.LJIIIIZZ = i;
    }
}
