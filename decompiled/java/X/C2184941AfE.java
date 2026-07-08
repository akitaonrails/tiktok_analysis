package X;

import Y.ARunnableS133S0100000_33;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184941AfE {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final long LJFF;
    public final long LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final C2185031AfN LJIIIZ;
    public final C2184971AfH LJIIJ;
    public final C2184991AfJ LJIIJJI;
    public final InterfaceC1631620sYq<String, C2185001AfK, EnumC2184861Af6, Unit> LJIIL;
    public final Function1<List<Pair<String, C2185001AfK>>, List<Pair<String, C2185001AfK>>> LJIILIIL;
    public final Function0<Unit> LJIILJJIL;
    public final boolean LJIILL;
    public final Object LJIILLIIL;
    public final ArrayDeque<Pair<String, C2185001AfK>> LJIIZILJ;
    public final ConcurrentLinkedQueue<Pair<String, C2185001AfK>> LJIJ;
    public volatile List<Pair<String, C2185001AfK>> LJIJI;
    public volatile long LJIJJ;
    public long LJIJJLI;
    public volatile double LJIL;
    public volatile long LJJ;
    public volatile boolean LJJI;

    public final void LIZ() {
        synchronized (this.LJIILLIIL) {
            while (true) {
                try {
                    Pair<String, C2185001AfK> pairPoll = this.LJIJ.poll();
                    if (pairPoll != null) {
                        this.LJIIZILJ.addFirst(pairPoll);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final boolean LIZJ() {
        boolean zIsEmpty;
        synchronized (this.LJIILLIIL) {
            try {
                zIsEmpty = this.LJIIZILJ.isEmpty();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zIsEmpty;
    }

    public final void LIZLLL() {
        synchronized (this.LJIILLIIL) {
            try {
                this.LJIIZILJ.size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(EnumC2184861Af6 enumC2184861Af6) {
        LIZ();
        List<Pair> arrayList = C13BV.INSTANCE;
        this.LJIJI = arrayList;
        synchronized (this.LJIILLIIL) {
            try {
                if (!this.LJIIZILJ.isEmpty()) {
                    arrayList = new ArrayList(this.LJIIZILJ);
                    this.LJIIZILJ.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (Pair pair : arrayList) {
            this.LJIIL.invoke((String) pair.getFirst(), (C2185001AfK) pair.getSecond(), enumC2184861Af6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<kotlin.Pair<java.lang.String, X.1AfK>>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    public final List<Pair<String, C2185001AfK>> LJ(int i) {
        ?? arrayList;
        if (i <= 0) {
            return C13BV.INSTANCE;
        }
        synchronized (this.LJIILLIIL) {
            try {
                int iMin = Math.min(i, this.LJIIZILJ.size());
                if (iMin == 0) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList(iMin);
                    for (int i2 = 0; i2 < iMin && (!this.LJIIZILJ.isEmpty()); i2++) {
                        arrayList.add(this.LJIIZILJ.removeFirst());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final void LJFF(long j) {
        C786410Ut5.LJLIIL(j, C0NBO.LIZIZ(), new ARunnableS133S0100000_33(this, 99));
    }

    public C2184941AfE(long j, long j2, long j3, double d, double d2, long j4, long j5, int i, String str, C2185031AfN c2185031AfN, C2184971AfH c2184971AfH, C2184991AfJ c2184991AfJ, C2184871Af7 c2184871Af7, C2184961AfG c2184961AfG, AwS577S0100000_33 awS577S0100000_33) {
        boolean z;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = d;
        this.LJ = d2;
        this.LJFF = j4;
        this.LJI = j5;
        this.LJII = i;
        this.LJIIIIZZ = str;
        this.LJIIIZ = c2185031AfN;
        this.LJIIJ = c2184971AfH;
        this.LJIIJJI = c2184991AfJ;
        this.LJIIL = c2184871Af7;
        this.LJIILIIL = c2184961AfG;
        this.LJIILJJIL = awS577S0100000_33;
        if (j5 > 0 && c2184991AfJ != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILL = z;
        this.LJIILLIIL = new Object();
        this.LJIIZILJ = new ArrayDeque<>();
        this.LJIJ = new ConcurrentLinkedQueue<>();
        this.LJIJI = C13BV.INSTANCE;
        this.LJIJJ = j;
    }
}
