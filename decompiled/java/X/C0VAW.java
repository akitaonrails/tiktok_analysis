package X;

import Y.ARunnableS32S0110000_13;
import com.bytedance.apm.core.ActivityLifeObserver;

/* JADX INFO: renamed from: X.0VAW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VAW implements C0VAV {
    public boolean LIZ;
    public final String LIZIZ = "cpu_active_time";

    @Override // X.C0VAV
    public final void LJ() {
        C787900UvU.LIZ.LIZJ(new ARunnableS32S0110000_13(this, this.LIZ, 3));
    }

    public C0VAW() {
        C792400V6o.LJIIIZ();
        this.LIZ = ActivityLifeObserver.getInstance().isForeground();
    }
}
