package X;

/* JADX INFO: renamed from: X.0kOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1317530kOF {
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ = true;
    public ChoreographerFrameCallbackC1339260kxI LIZLLL;

    public abstract boolean LIZ(int i);

    public final void LIZIZ() {
        if (this.LIZLLL != null) {
            C786410Ut5.v2().removeFrameCallback(this.LIZLLL);
            this.LIZLLL = null;
        }
    }
}
