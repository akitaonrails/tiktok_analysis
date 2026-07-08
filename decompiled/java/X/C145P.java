package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.145P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C145P {
    public static final ReentrantLock LIZ = new ReentrantLock();
    public static final List<JSONObject> LIZIZ = new LinkedList();

    public static void LIZ(float f, float f2, float f3, float f4, int i, long j) {
        ReentrantLock reentrantLock;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", j);
            jSONObject.put("force", f);
            jSONObject.put("majorRadius", f2);
            jSONObject.put("phase", i);
            jSONObject.put("x", f3);
            jSONObject.put("y", f4);
            try {
                try {
                    reentrantLock = LIZ;
                    reentrantLock.lockInterruptibly();
                    ((LinkedList) LIZIZ).add(jSONObject);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    reentrantLock = LIZ;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ.unlock();
                throw th;
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20221514Aj.LIZIZ();
        }
    }
}
