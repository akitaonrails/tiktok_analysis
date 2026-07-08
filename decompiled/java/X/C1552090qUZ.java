package X;

import com.bytedance.geckox.task.HandlerTimerTask;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0qUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552090qUZ {
    public final InterfaceC1553630qX3 LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public final void LIZIZ() {
        if (this.LIZLLL.get()) {
            this.LIZIZ = 0;
            HandlerTimerTask.TimeHandler timeHandler = C1553420qWi.LIZ.LIZ.LIZ;
            if (timeHandler != null) {
                timeHandler.removeMessages(2);
            }
            this.LIZLLL.set(false);
        }
    }

    public final void LIZ() {
        boolean zLJI = MethodIDManager.LJI(137906);
        this.LIZIZ = this.LIZIZ + 1;
        long jFloor = (long) Math.floor((Math.random() + 0.5d) * Math.pow(2.0d, Math.min(r2 - 2, 8)) * 5.0d);
        int i = (int) (((long) this.LIZJ) + jFloor);
        this.LIZJ = i;
        if (i > 5115) {
            LIZIZ();
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1553420qWi.LIZ.LIZ(new AbstractC1552990qW1() { // from class: X.0qVd
            @Override // X.AbstractC1552990qW1
            public final int LIZIZ() {
                return 2;
            }

            @Override // X.AbstractC1552990qW1
            public final void LIZ() {
                C1553090qWB c1553090qWB = (C1553090qWB) this.LIZJ.LIZ;
                c1553090qWB.getClass();
                C1553130qWF.LIZ("gecko-debug-tag", "sync global settings retry");
                c1553090qWB.LIZ.LIZJ(2, false);
                this.LIZJ.LIZ();
            }
        }, jFloor * 1000);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C1552090qUZ(C1553090qWB c1553090qWB) {
        this.LIZ = c1553090qWB;
    }
}
