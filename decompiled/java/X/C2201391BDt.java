package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.1BDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201391BDt implements InterfaceC2201401BDu {
    public final C2209901BeO LIZ;
    public final CopyOnWriteArraySet<InterfaceC2201401BDu> LIZIZ = new CopyOnWriteArraySet<>();

    public C2201391BDt(C2209901BeO c2209901BeO) {
        this.LIZ = c2209901BeO;
    }

    @Override // X.InterfaceC2201401BDu
    public final void LIZ(long j, String str, boolean z) {
        Iterator<InterfaceC2201401BDu> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ(j, str, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.LJJZZI.LJIIZILJ(Collections.singletonList("LaunchObserverHolder"), "invoke onLaunch callback failed", th, new Object[0]);
            }
        }
    }
}
