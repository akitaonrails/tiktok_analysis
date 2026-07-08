package X;

import Y.ARunnableS133S0100000_33;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.1ACh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175531ACh {
    public final C2175561ACk LIZ;
    public final C1ADZ LIZIZ;
    public long LJIIIIZZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final AtomicReference<EnumC1779790wPp> LJ = new AtomicReference<>(EnumC1779790wPp.PENDING);
    public final AtomicLong LJFF = new AtomicLong(0);
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public final ARunnableS133S0100000_33 LJIIIZ = new ARunnableS133S0100000_33(this, 66);
    public final ARunnableS133S0100000_33 LJIIJ = new ARunnableS133S0100000_33(this, 65);

    public C2175531ACh(C2175561ACk c2175561ACk, C1ACK c1ack) {
        this.LIZ = c2175561ACk;
        this.LIZIZ = c1ack;
    }
}
