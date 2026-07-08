package X;

import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21331518dt {
    public final long LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final CopyOnWriteArrayList<InterfaceC21331618du> LIZLLL;
    public final BPEAHandler LJ;
    public final ARunnableS132S0100000_32 LJFF;

    public C21331518dt() {
        this(1000L);
    }

    public final void LIZ() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            "Must be called on main thread".toString();
            throw new IllegalStateException("Must be called on main thread");
        }
        this.LIZJ = true;
        if (this.LIZIZ) {
            this.LIZIZ = false;
            this.LJ.removeCallbacks(this.LJFF);
        }
    }

    public C21331518dt(long j) {
        this.LIZ = j;
        this.LIZLLL = new CopyOnWriteArrayList<>();
        this.LJ = new BPEAHandler(Looper.getMainLooper());
        this.LJFF = new ARunnableS132S0100000_32(this, 108);
    }

    public final void LIZIZ(InterfaceC21331618du interfaceC21331618du) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (!this.LIZJ && this.LIZLLL.addIfAbsent(interfaceC21331618du) && !this.LIZIZ && !this.LIZJ) {
                this.LIZIZ = true;
                LIZJ(this.LIZ);
                return;
            }
            return;
        }
        "Must be called on main thread".toString();
        throw new IllegalStateException("Must be called on main thread");
    }

    public final void LIZJ(long j) {
        if (!this.LIZIZ || this.LIZJ || this.LIZLLL.isEmpty()) {
            return;
        }
        if (j < 0) {
            j = 0;
        }
        C786410Ut5.LJLIIL(j, this.LJ, this.LJFF);
    }

    public final void LIZLLL(InterfaceC21331618du interfaceC21331618du) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LIZLLL.remove(interfaceC21331618du);
            if (this.LIZIZ && this.LIZLLL.isEmpty() && this.LIZIZ) {
                this.LIZIZ = false;
                this.LJ.removeCallbacks(this.LJFF);
                return;
            }
            return;
        }
        "Must be called on main thread".toString();
        throw new IllegalStateException("Must be called on main thread");
    }
}
