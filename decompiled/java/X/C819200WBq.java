package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0WBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819200WBq implements InterfaceC819180WBo {
    public static volatile C819680WDm LJ;
    public final C0WC2 LIZ;
    public final C0WC2 LIZIZ;
    public final InterfaceC819290WBz LIZJ;
    public final C0WCW LIZLLL;

    public static C819200WBq LIZ() {
        C819680WDm c819680WDm = LJ;
        if (c819680WDm != null) {
            return c819680WDm.LLILZLL.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void LIZIZ(Context context) {
        if (LJ == null) {
            synchronized (C819200WBq.class) {
                try {
                    if (LJ == null) {
                        context.getClass();
                        LJ = new C819680WDm(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final C819150WBl LIZJ(C819190WBp c819190WBp) {
        Set setSingleton;
        if (c819190WBp instanceof InterfaceC819220WBs) {
            setSingleton = Collections.unmodifiableSet(c819190WBp.LIZ());
        } else {
            setSingleton = Collections.singleton(new C814570VxP("proto"));
        }
        C818570W9f c818570W9fLIZ = AbstractC818550W9d.LIZ();
        c819190WBp.getClass();
        c818570W9fLIZ.LIZIZ("cct");
        c818570W9fLIZ.LIZIZ = c819190WBp.LIZJ();
        return new C819150WBl(setSingleton, c818570W9fLIZ.LIZ(), this);
    }

    public C819200WBq(C0WC2 c0wc2, C0WC2 c0wc22, InterfaceC819290WBz interfaceC819290WBz, C0WCW c0wcw, final C0WCQ c0wcq) {
        this.LIZ = c0wc2;
        this.LIZIZ = c0wc22;
        this.LIZJ = interfaceC819290WBz;
        this.LIZLLL = c0wcw;
        c0wcq.LIZ.execute(new Runnable() { // from class: X.0WCN
            @Override // java.lang.Runnable
            public final void run() {
                final C0WCQ c0wcq2 = c0wcq;
                c0wcq2.getClass();
                C1C7U.LIZ("WorkInitializer@3608.ensureContextsScheduled$1L");
                c0wcq2.LIZLLL.LIZIZ(new C0WCL() { // from class: X.0WCO
                    @Override // X.C0WCL
                    public final Object execute() {
                        C0WCQ c0wcq3 = c0wcq2;
                        Iterator<AbstractC818550W9d> it2 = c0wcq3.LIZIZ.LJJLIIIJLJLI().iterator();
                        while (it2.hasNext()) {
                            c0wcq3.LIZJ.LIZ(it2.next(), 1);
                        }
                        return null;
                    }
                });
                C1C7U.LIZIZ("WorkInitializer@3608.ensureContextsScheduled$1L");
            }
        });
    }
}
