package X;

import Y.ARunnableS111S0100000_11;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0SSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721760SSw {
    public final C0ST5 LIZIZ;
    public long LIZLLL;
    public boolean LJ;
    public long LJFF;
    public final long LIZ = 1500;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS111S0100000_11 LJI = new ARunnableS111S0100000_11(this, 126);

    public final void LIZ() {
        this.LJ = false;
        this.LIZJ.removeCallbacks(this.LJI);
        this.LIZLLL = 0L;
    }

    public C721760SSw(C0ST5 c0st5) {
        this.LIZIZ = c0st5;
    }
}
