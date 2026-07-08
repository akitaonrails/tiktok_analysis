package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC832580WlM {
    public Object LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ AbstractC832390Wl3 LIZJ;

    public AbstractC832580WlM(AbstractC832390Wl3 abstractC832390Wl3, Object obj) {
        this.LIZJ = abstractC832390Wl3;
        this.LIZ = obj;
    }

    public abstract void LIZ();

    public abstract void LIZIZ();

    public final void LIZJ() {
        synchronized (this) {
            try {
                this.LIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL() {
        LIZJ();
        synchronized (this.LIZJ.zzt) {
            try {
                this.LIZJ.zzt.remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
