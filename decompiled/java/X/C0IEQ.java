package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IEQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEQ {
    public final Object LIZ = new Object();
    public final ArrayList<C463480IFm> LIZIZ = new ArrayList<>();
    public boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZ() {
        synchronized (this.LIZ) {
            try {
                if (this.LIZLLL) {
                    return;
                }
                this.LIZLLL = true;
                this.LIZJ = false;
                if (this.LIZIZ.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.LIZIZ);
                this.LIZIZ.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((C463480IFm) it2.next()).LIZ.run();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static final boolean LIZIZ(DataChannel dataChannel, boolean z, Runnable runnable) {
        C0IEQ c0ieq;
        if (z && dataChannel != null && (c0ieq = (C0IEQ) dataChannel.gg0(C749110Ta1.class)) != null) {
            C463480IFm c463480IFm = new C463480IFm(runnable);
            synchronized (c0ieq.LIZ) {
                try {
                    if (c0ieq.LIZJ && !c0ieq.LIZLLL) {
                        c0ieq.LIZIZ.add(c463480IFm);
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return false;
    }
}
