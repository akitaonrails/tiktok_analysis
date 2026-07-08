package X;

/* JADX INFO: renamed from: X.0s9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616050s9j {
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C13E8<Runnable> LIZ = new C13E8<>();
    public final ChoreographerFrameCallbackC1620780sHM LIZLLL = new ChoreographerFrameCallbackC1620780sHM(this, 0);

    public final void LIZ() {
        if (this.LIZIZ || this.LIZJ || this.LIZ.isEmpty()) {
            return;
        }
        this.LIZIZ = true;
        C786410Ut5.v2().postFrameCallback(this.LIZLLL);
    }
}
