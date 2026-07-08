package X;

import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18Mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21271218Mc {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJII;
    public int LJIIIIZZ;
    public long LIZ = -1;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public final List<InterfaceC1631620sYq<Integer, Integer, Long, Unit>> LJFF = new ArrayList();
    public long LJI = 1000;
    public final ARunnableS132S0100000_32 LJIIIZ = new ARunnableS132S0100000_32(this, 88);

    public final void LIZ() {
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        long j3 = this.LIZIZ;
        if (j <= j3 && j3 < j2) {
            this.LJII = 2;
            this.LIZ = j2 - j3;
        } else if (j3 >= j2) {
            this.LIZ = 0L;
            this.LJII = 3;
        }
        Iterator<InterfaceC1631620sYq<Integer, Integer, Long, Unit>> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Integer.valueOf(this.LJII), Integer.valueOf(this.LJIIIIZZ), Long.valueOf(this.LIZ));
        }
        this.LJIIIIZZ = this.LJII;
    }
}
