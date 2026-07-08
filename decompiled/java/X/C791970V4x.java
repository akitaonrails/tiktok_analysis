package X;

import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791970V4x {
    public static final C791970V4x LJI = new C791970V4x();
    public static boolean LJII = false;
    public BPEAHandler LIZ;
    public ReferenceQueue<Object> LIZIZ;
    public Set<String> LIZJ;
    public C0V53 LIZLLL;
    public long LJ;
    public volatile C791750V4b LJFF;

    public static void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Runtime.getRuntime().gc();
        try {
            Thread.sleep(100L);
            System.runFinalization();
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GC time done, cost: ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ.append(" ms.");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }

    public final void LIZ(C791990V4z c791990V4z, String str) {
        BPEAHandler bPEAHandler;
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Leak:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Activity activity = (Activity) c791990V4z.get();
        if (activity == null) {
            return;
        }
        if (this.LIZLLL.LIZLLL && (bPEAHandler = this.LIZ) != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS82S0200000_13(this, c791990V4z, 9));
        }
        if (this.LIZLLL.LIZJ) {
            String name = activity.getClass().getName();
            boolean serviceSwitch = C790620Uzs.LIZ.getServiceSwitch("activity_leak_event");
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("activity_leak_event : ");
                sbLIZ2.append(serviceSwitch);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (serviceSwitch && !TextUtils.isEmpty(name)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(name, 1);
                    C792310V6f.LJIIIZ().LIZJ(new C790600Uzq("activity_leak_event", 0, null, jSONObject, null, null));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("upload leak activity:");
                sbLIZ3.append(activity.getLocalClassName());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        ((CopyOnWriteArraySet) this.LIZJ).remove(c791990V4z.LIZ);
        C0V5L c0v5l = this.LIZLLL.LJ;
        if (c0v5l != null) {
            c0v5l.LIZ(activity);
        }
    }
}
