package X;

import Y.ARunnableS113S0100000_13;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0ViC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805140ViC {
    public final int LIZ;
    public final ConcurrentLinkedQueue<C805150ViD> LIZIZ = new ConcurrentLinkedQueue<>();

    public C805140ViC(int i, int i2) {
        this.LIZ = i2;
        C807400Vlq.LJ().scheduleWithFixedDelay(new ARunnableS113S0100000_13(this, 245), 0L, i, TimeUnit.SECONDS);
    }
}
