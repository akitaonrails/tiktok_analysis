package X;

import Y.ARunnableS109S0100000_9;
import android.os.Handler;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0MwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584640MwQ {
    public static final C01GW<Handler> LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(517));
    public final String LIZ;
    public final long LIZIZ;
    public boolean LIZJ;
    public ARunnableS109S0100000_9 LIZLLL;

    public final void LIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C0N5P.LIZ.LIZLLL(this.LIZ, new C0N5R(16L, 30L));
        ARunnableS109S0100000_9 aRunnableS109S0100000_9 = new ARunnableS109S0100000_9(this, 184);
        this.LIZLLL = aRunnableS109S0100000_9;
        C786410Ut5.LJLIIL(this.LIZIZ, LJ.getValue(), aRunnableS109S0100000_9);
    }

    public final void LIZIZ() {
        if (this.LIZJ) {
            ARunnableS109S0100000_9 aRunnableS109S0100000_9 = this.LIZLLL;
            if (aRunnableS109S0100000_9 != null) {
                LJ.getValue().removeCallbacks(aRunnableS109S0100000_9);
                this.LIZLLL = null;
            }
            C0N5P c0n5p = C0N5P.LIZ;
            C0N5P.LJ(this.LIZ);
            this.LIZJ = false;
        }
    }

    public C584640MwQ(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
