package X;

import Y.ARunnableS92S0200000_23;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0qTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551680qTu {
    public final String LIZ;
    public volatile ARunnableS92S0200000_23 LIZLLL;
    public boolean LJFF;
    public final List<Function1<Boolean, Unit>> LIZIZ = new CopyOnWriteArrayList();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(241));

    public final void LIZJ() {
        C1553130qWF.LIZ("gecko-debug-tag", "pauseDownload");
        if (this.LIZJ.compareAndSet(false, true)) {
            Iterator<Function1<Boolean, Unit>> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(Boolean.TRUE);
            }
        }
    }

    public final void LIZ() {
        if (this.LIZJ.compareAndSet(true, false)) {
            Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(Boolean.FALSE);
            }
            ARunnableS92S0200000_23 aRunnableS92S0200000_23 = this.LIZLLL;
            if (aRunnableS92S0200000_23 != null) {
                ((Handler) this.LJ.getValue()).removeCallbacks(aRunnableS92S0200000_23);
                this.LIZLLL = null;
            }
        }
    }

    public final boolean LIZIZ() {
        return this.LIZJ.get();
    }

    public C1551680qTu(String str) {
        this.LIZ = str;
    }

    public final void LIZLLL(Function1<? super Boolean, Unit> function1) {
        ((CopyOnWriteArrayList) this.LIZIZ).remove(function1);
    }
}
