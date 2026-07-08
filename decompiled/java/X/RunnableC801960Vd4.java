package X;

import android.os.Process;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import dl3.h;
import im3.b;
import im3.o;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC801960Vd4 implements Runnable {
    public static final RunnableC801960Vd4 LLILLJJLI = new RunnableC801960Vd4();
    public volatile boolean LL;

    public final void LIZ() {
        try {
            JSONArray jSONArray = new JSONArray();
            int iMyPid = Process.myPid();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 0;
            boolean z = false;
            String strLIZLLL = CardStruct.IStatusCode.DEFAULT;
            for (f fVar : C801970Vd5.LIZLLL.keySet()) {
                ConcurrentLinkedQueue<C0VXT> concurrentLinkedQueue = C801970Vd5.LIZLLL.get(fVar);
                if (concurrentLinkedQueue != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    while (true) {
                        if (concurrentLinkedQueue.isEmpty()) {
                            break;
                        }
                        jSONArray2.put(concurrentLinkedQueue.poll().LIZ());
                        C801970Vd5.LJI.decrementAndGet();
                        i++;
                        if (i > 100) {
                            z = true;
                            break;
                        }
                    }
                    if (jSONArray2.length() != 0) {
                        JSONObject jSONObject = new JSONObject();
                        strLIZLLL = fVar.LIZLLL(CardStruct.IStatusCode.DEFAULT);
                        jSONObject.put("data", jSONArray2);
                        JSONObject jSONObject2 = Header.LIZIZ(fVar, jCurrentTimeMillis, CrashType.ENSURE, iMyPid).LIZ;
                        jSONObject2.put("from", "npth");
                        jSONObject.put("header", jSONObject2);
                        jSONArray.put(jSONObject);
                        if (z) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (jSONArray.length() != 0) {
                String str = h.LJIIJJI.LJI;
                HashMap map = new HashMap();
                map.put("device_id", strLIZLLL);
                map.put("os", "Android");
                map.put("sdk_version", AnonymousClass0825.LIZ);
                map.put("from", "npth");
                String strLIZJ = o.LIZJ(str, map);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("list", jSONArray);
                b.LJI(strLIZJ, jSONObject3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C801970Vd5.LJI.get() <= 0 && C801970Vd5.LJII.get() <= 0) {
            C801970Vd5.LJIIIIZZ = false;
        } else {
            C0VXF.postDelayed(this, 30000L);
            C801970Vd5.LJIIIIZZ = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EventDeliverer$UploadManager@d104.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EventDeliverer$UploadManager@d104.run");
    }
}
