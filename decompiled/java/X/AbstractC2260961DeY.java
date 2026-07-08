package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.1DeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2260961DeY {
    public final C2260931DeV LIZ;
    public Runnable LIZIZ;

    public void LIZ() {
    }

    public abstract void LIZIZ();

    public boolean LIZJ() {
        return false;
    }

    public void LIZLLL() {
    }

    public void LJFF() {
    }

    public void LJ() {
        Runnable runnable = this.LIZIZ;
        if (runnable != null) {
            HandlerHook.viewRemoveCallbacks(this.LIZ.LIZ, runnable);
        }
        this.LIZIZ = null;
    }

    public AbstractC2260961DeY(C2260931DeV c2260931DeV) {
        this.LIZ = c2260931DeV;
    }
}
