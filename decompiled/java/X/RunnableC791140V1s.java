package X;

import Y.ARunnableS8S1000000_13;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.monitor.collector.LockMonitorManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC791140V1s implements Runnable {
    public boolean LL;
    public boolean LLILLJJLI;
    public final long[] LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final long LLJ;
    public final C0V35 LLJI;
    public final C0V2W[] LLJIJIL;
    public final boolean LLJILJIL;
    public final Map<String, String> LLJILJILJ;

    /* JADX WARN: Type inference failed for: r0v63, types: [X.0V1t] */
    public final void LIZ() {
        try {
            LinkedList linkedList = new LinkedList();
            long[] jArr = this.LLILLL;
            if (jArr.length > 0) {
                C791250V2d.LJFF(jArr, linkedList, this.LLILZLL);
                C791250V2d.LJII(linkedList, new Object() { // from class: X.0V1t
                });
            }
            if (linkedList.size() > 2) {
                StringBuilder sb = new StringBuilder();
                long jMax = Math.max(this.LLILZIL, C791250V2d.LJ(linkedList, sb));
                Object objLIZJ = C791250V2d.LIZJ(linkedList);
                JSONObject jSONObject = new JSONObject();
                String string = sb.toString();
                C0V35 c0v35 = this.LLJI;
                if (c0v35 != null) {
                    if (!TextUtils.isEmpty("uuid")) {
                        c0v35.LJIIL = "uuid";
                    }
                    if (!TextUtils.isEmpty(string)) {
                        c0v35.LJIIJJI = string;
                    }
                }
                jSONObject.put("stack", string);
                jSONObject.put("stack_key", objLIZJ);
                jSONObject.put(Scene.SCENE_SERVICE, this.LLIZ);
                jSONObject.put("cost_time", jMax);
                jSONObject.put("cpu_cost", this.LLILZ);
                jSONObject.put("method_time", jMax);
                C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
                long j = this.LLILZLL;
                JSONObject jSONObjectLIZIZ = c791560V3iLIZLLL.LIZIZ(j - this.LLILZIL, j);
                long j2 = this.LLILZLL;
                jSONObjectLIZIZ.put("lock_monitor", LockMonitorManager.dumpLockInfo(j2 - this.LLILZIL, j2));
                int i = C0V2K.LIZ;
                long j3 = this.LLILZLL;
                String strLIZJ = C0V2K.LIZJ(SystemClock.uptimeMillis(), C0V2K.LIZIZ(j3 - this.LLILZIL, j3));
                if (C0V2E.LLJJI) {
                    strLIZJ = C08NB.LIZ(new C1887307aJ(strLIZJ, jMax));
                    C08NB.LIZ.clear();
                    C0V2E.LLJJI = false;
                } else {
                    C1887307aJ c1887307aJ = new C1887307aJ(strLIZJ, jMax);
                    if (C08NB.LIZ == null) {
                        C08NB.LIZ = new LinkedBlockingQueue<>(10);
                    }
                    try {
                        if (C08NB.LIZ.size() == 10) {
                            C08NB.LIZ.take();
                        }
                        C08NB.LIZ.put(c1887307aJ);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                jSONObjectLIZIZ.put("evil_method", strLIZJ);
                jSONObject.put("message", C0V36.LIZ(this.LLIZLLLIL));
                jSONObject.put("timestamp", this.LLILZLL);
                jSONObject.put("event_type", "lag_drop_frame");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("crash_section", C792400V6o.LJII(this.LLJ));
                jSONObject2.put("block_frame", String.valueOf(this.LLILLJJLI));
                jSONObject2.put("block_input", String.valueOf(this.LL));
                jSONObject2.put("trace_type", "message");
                Map<String, String> map = this.LLJILJILJ;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.LLJILJILJ.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                if (C0V2E.LLJJ) {
                    jSONObjectLIZIZ.put("dmt_stack_completion", C0V2W.LIZ(this.LLJIJIL));
                    jSONObject2.put("has_dmt_stack_completion", String.valueOf(!((ArrayList) r2).isEmpty()));
                }
                jSONObject.put("custom", jSONObjectLIZIZ);
                jSONObject.put("filters", jSONObject2);
                C0V1I c0v1i = new C0V1I("drop_frame_stack", jSONObject);
                if (this.LLJILJIL) {
                    c0v1i.LIZJ = true;
                }
                C792310V6f.LJIIIZ().LIZJ(c0v1i);
                C787900UvU.LIZ.LIZJ(new ARunnableS8S1000000_13("evil_method_end", 12));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C787900UvU.LIZ.LIZJ(new ARunnableS8S1000000_13("evil_method_analyse_exception", 12));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EvilMethodTracer$AnalyseTask@1a1.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EvilMethodTracer$AnalyseTask@1a1.run");
    }

    public RunnableC791140V1s(String str, long[] jArr, long j, long j2, long j3, String str2, long j4, C0V35 c0v35, C0V2W[] c0v2wArr, boolean z, Map map) {
        this.LLIZ = str;
        this.LLILZIL = j2;
        this.LLILZ = j;
        this.LLILLL = jArr;
        this.LLILZLL = j3;
        this.LLIZLLLIL = str2;
        this.LLJ = j4;
        this.LLJI = c0v35;
        this.LLJIJIL = c0v2wArr;
        this.LLJILJIL = z;
        this.LLJILJILJ = map;
    }
}
