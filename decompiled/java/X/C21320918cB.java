package X;

import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.worker.JsWorker;

/* JADX INFO: renamed from: X.18cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21320918cB {
    public final JsWorker.EngineType LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final JSModuleManager LJFF;
    public final boolean LJI;

    public C21320918cB(C21320818cA c21320818cA) {
        this.LIZ = c21320818cA.LIZ;
        this.LIZIZ = c21320818cA.LIZIZ;
        this.LIZJ = c21320818cA.LIZJ;
        this.LJ = c21320818cA.LIZLLL;
        boolean z = c21320818cA.LJ;
        this.LIZLLL = z;
        this.LJFF = c21320818cA.LJFF;
        boolean z2 = c21320818cA.LJI;
        this.LJI = z2;
        if (z2 && !z) {
            throw new IllegalArgumentException("Platform thread must be used with multi thread enabled");
        }
    }
}
