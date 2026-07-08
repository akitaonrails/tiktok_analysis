package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0rtx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606270rtx implements InterfaceC426680GoE {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C1256160inG LIZJ;
    public final C728900SiW LIZLLL;
    public final WeakReference<Activity> LJ;

    public C1606270rtx() {
        this(false, false, null, null, 31);
    }

    public C1606270rtx(boolean z, boolean z2, C728900SiW c728900SiW, WeakReference weakReference, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        c728900SiW = (i & 8) != 0 ? null : c728900SiW;
        weakReference = (i & 16) != 0 ? null : weakReference;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = null;
        this.LIZLLL = c728900SiW;
        this.LJ = weakReference;
    }
}
