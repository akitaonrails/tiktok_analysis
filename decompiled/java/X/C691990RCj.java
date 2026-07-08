package X;

import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691990RCj {
    public final Queue<C0R5L> LIZ = new LinkedList();
    public final HandlerThread LIZIZ;
    public final C01GW LIZJ;

    public final List<C0RCR> LIZ() {
        ArrayList arrayList = new ArrayList();
        C692000RCk c692000RCk = null;
        while (true) {
            try {
                C0R5L c0r5l = (C0R5L) ((LinkedList) this.LIZ).peek();
                if (c0r5l == null) {
                    return C13BV.INSTANCE;
                }
                if (c0r5l instanceof C692000RCk) {
                    if (c692000RCk != null) {
                        return arrayList;
                    }
                    arrayList.clear();
                    c692000RCk = (C692000RCk) c0r5l;
                    ((LinkedList) this.LIZ).remove();
                } else if (c0r5l instanceof C0RCR) {
                    if (c692000RCk != null) {
                        C0RCR c0rcr = (C0RCR) c0r5l;
                        c0rcr.LIZJ = new C691980RCi(c692000RCk.LIZIZ, c692000RCk.LIZJ, c692000RCk.LIZLLL, c692000RCk.LJ);
                        C0RCU c0rcu = c0rcr.LIZIZ;
                        if (c0rcu != null) {
                            c0rcu.LIZ -= c692000RCk.LIZ;
                        }
                        arrayList.add(c0r5l);
                    }
                    ((LinkedList) this.LIZ).remove();
                } else if (c0r5l instanceof C0RCS) {
                    ((LinkedList) this.LIZ).remove();
                    return arrayList;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList.clear();
                C1AF0.LJFF(e, "ComponentUIShakeDetect search frame error msg!");
                return arrayList;
            }
        }
    }

    public C691990RCj() {
        HandlerThread handlerThread = new HandlerThread("component_ui_detect");
        handlerThread.start();
        this.LIZIZ = handlerThread;
        this.LIZJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1600));
    }
}
