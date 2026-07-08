package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0erF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104870erF {
    public WeakReference<DataChannel> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public EnumC964170bCJ LIZLLL;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS117S0100000_17 LJFF = new ARunnableS117S0100000_17(this, 219);

    public final void LIZ(EnumC964170bCJ enumC964170bCJ) {
        EnumC964170bCJ enumC964170bCJ2 = this.LIZLLL;
        this.LIZLLL = enumC964170bCJ;
        if (enumC964170bCJ == null) {
            return;
        }
        EnumC964170bCJ enumC964170bCJ3 = EnumC964170bCJ.MATCH_START;
        if (enumC964170bCJ == enumC964170bCJ3) {
            if (enumC964170bCJ2 != enumC964170bCJ3) {
                this.LIZJ = false;
                this.LJ.removeCallbacks(this.LJFF);
                C786410Ut5.LJLIIL(3000L, this.LJ, this.LJFF);
                return;
            }
            return;
        }
        if (enumC964170bCJ != EnumC964170bCJ.SETTLE_START && enumC964170bCJ != EnumC964170bCJ.MATCH_END && enumC964170bCJ != EnumC964170bCJ.NONE) {
            return;
        }
        this.LIZJ = false;
        this.LJ.removeCallbacks(this.LJFF);
    }
}
