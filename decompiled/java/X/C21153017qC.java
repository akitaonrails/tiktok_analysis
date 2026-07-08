package X;

import android.os.Looper;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17qC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21153017qC {
    public static boolean LIZIZ;
    public static final C21153017qC LIZ = new C21153017qC();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C21153117qD());

    public static void LIZ(final Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            Runnable runnable = new Runnable(function0) { // from class: X.17qB
                public final boolean LL = true;
                public final Function0<Unit> LLILLJJLI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FluencyOptManager$TaskOnCommit@8099.run");
                    try {
                        this.LLILLJJLI.invoke();
                        if (this.LL) {
                            C21153017qC.LIZ.getClass();
                            C01GW c01gw = C21153017qC.LIZJ;
                            if (((LinkedList) c01gw.getValue()).isEmpty()) {
                                C21153017qC.LIZIZ = false;
                            } else {
                                RunnableC21152917qB runnableC21152917qB = (RunnableC21152917qB) ((LinkedList) c01gw.getValue()).removeFirst();
                                if (runnableC21152917qB != null) {
                                    C21153017qC.LIZIZ = true;
                                    C20639086r.LIZLLL(runnableC21152917qB);
                                }
                            }
                        } else {
                            C21153017qC.LIZIZ = false;
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FluencyOptManager$TaskOnCommit@8099.run");
                }

                {
                    this.LLILLJJLI = function0;
                }
            };
            if (LIZIZ) {
                ((LinkedList) LIZJ.getValue()).addLast(runnable);
                return;
            } else {
                LIZIZ = true;
                C20639086r.LIZLLL(runnable);
                return;
            }
        }
        throw new IllegalStateException("the commit task must be submitted on ui thread!");
    }
}
