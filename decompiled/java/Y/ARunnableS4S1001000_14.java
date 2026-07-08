package Y;

import X.C1C7U;
import X.C786410Ut5;
import X.C895680ZBu;
import X.InterfaceC856150XiH;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS4S1001000_14 implements Runnable {
    public final int $t;
    public int i1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS4S1001000_14 aRunnableS4S1001000_14) {
        boolean zLIZ;
        C1C7U.LIZ("AudioCopyrightDetectProcessManager@33c0.startDetectTimeOutTask$1");
        try {
            C895680ZBu.LJIIIIZZ = true;
            List list = (List) ((LinkedHashMap) C895680ZBu.LIZJ).get(aRunnableS4S1001000_14.s0);
            if (list != null) {
                int i = aRunnableS4S1001000_14.i1;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC856150XiH) it2.next()).LIZ(3, null, 102, i);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AudioCopyrightDetectProcessManager@33c0.startDetectTimeOutTask$1");
    }

    public static final void run$1(ARunnableS4S1001000_14 aRunnableS4S1001000_14) {
        boolean zLIZ;
        C1C7U.LIZ("InboxUnreadConsistencyChecker@efbe.scheduleCheck$runnable$1");
        try {
            MessageQueue messageQueueMyQueue = Looper.myQueue();
            final int i = aRunnableS4S1001000_14.i1;
            final String str = aRunnableS4S1001000_14.s0;
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0ZA6
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    if (i == C0ZA1.LJFF && C0ZA1.LJ) {
                        C0ZA1.LIZ.getClass();
                        if (C0ZA1.LJ()) {
                            C0ZA1.LJFF(str, false);
                        }
                    }
                    return false;
                }
            }, messageQueueMyQueue);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxUnreadConsistencyChecker@efbe.scheduleCheck$runnable$1");
    }

    public static final void run$2(ARunnableS4S1001000_14 aRunnableS4S1001000_14) {
        boolean zLIZ;
        C1C7U.LIZ("InboxUnreadConsistencyChecker@efbe.scheduleReconfirm$runnable$1");
        try {
            MessageQueue messageQueueMyQueue = Looper.myQueue();
            final int i = aRunnableS4S1001000_14.i1;
            final String str = aRunnableS4S1001000_14.s0;
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0ZA5
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    C0ZA1.LIZLLL = null;
                    if (i != C0ZA1.LJFF || !C0ZA1.LJ) {
                        return false;
                    }
                    C0ZA1.LIZ.getClass();
                    if (!C0ZA1.LJ()) {
                        return false;
                    }
                    C0ZA1.LJFF(str, true);
                    return false;
                }
            }, messageQueueMyQueue);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxUnreadConsistencyChecker@efbe.scheduleReconfirm$runnable$1");
    }

    public ARunnableS4S1001000_14(int i, String str, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }
}
