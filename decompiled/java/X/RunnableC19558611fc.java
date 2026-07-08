package X;

import Y.ARunnableS129S0100000_29;

/* JADX INFO: renamed from: X.11fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class RunnableC19558611fc implements Runnable {
    public boolean LL;
    public final /* synthetic */ C19557511fR LLILLJJLI;

    public final void LIZ() {
        boolean zLIZJ = this.LLILLJJLI.LJJIIJ.LIZJ();
        C19557511fR c19557511fR = this.LLILLJJLI;
        if (c19557511fR.LJJIJL) {
            if (zLIZJ && this.LL) {
                return;
            }
            this.LLILLJJLI.LJIL((int) c19557511fR.LJJIIJ.LIZIZ(), false);
            if (!zLIZJ) {
                this.LLILLJJLI.LJII.postDelayed(this, 1L);
                return;
            }
            this.LLILLJJLI.LIZLLL.setValue(C1452730nuJ.LIZJ());
            this.LLILLJJLI.LIZLLL.setValue(C1452730nuJ.LIZLLL(0L));
            this.LLILLJJLI.LJII.postDelayed(new ARunnableS129S0100000_29(this, 38), 100L);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VEEffectHelper$SeekSyncRunnable@e40.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEEffectHelper$SeekSyncRunnable@e40.run");
    }

    public RunnableC19558611fc(C19557511fR c19557511fR) {
        this.LLILLJJLI = c19557511fR;
    }
}
