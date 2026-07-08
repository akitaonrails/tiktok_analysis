package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AwS435S0200000_34;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213741Bka extends AbstractC2213971Bkx {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public String LIZ;
    public Long LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ = C204536151q.LIZ(EnumC2213771Bkd.TTMStateCodeSuccess);
    public String LJFF;
    public String LJI;
    public String LJII;

    public final void LIZ() throws JSONException {
        ThreadPoolExecutor threadPoolExecutor;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("e_code", this.LJ);
        jSONObject.put("esg_key", this.LIZ);
        jSONObject.put("se_type", this.LIZJ);
        jSONObject.put("esg_package_key", this.LJI);
        jSONObject.put("esg_package_md5", this.LJII);
        jSONObject.put("schedule_pending_task_size", C830860Wia.LIZJ.get());
        ExecutorService executorService = C830860Wia.LIZ;
        jSONObject.put("active_thread_count", (!(executorService instanceof ThreadPoolExecutor) || (threadPoolExecutor = (ThreadPoolExecutor) executorService) == null) ? -1 : threadPoolExecutor.getActiveCount());
        jSONObject.put("applog_pending_task_size", C829900Wh2.LIZ.getPendingTasksSize());
        jSONObject.put("feature_pending_task_size", C829910Wh3.LIZ.getPendingTasksSize());
        Long l = this.LIZIZ;
        if (l != null) {
            l.longValue();
            jSONObject.put("se_run_time", this.LIZIZ);
        }
        String str = this.LJFF;
        if (str != null) {
            jSONObject.put("e_message", str);
        }
        String str2 = this.LIZLLL;
        if (str2 != null) {
            jSONObject.put("es_key", str2);
        }
        try {
            new AwS435S0200000_34(EnumC1153320g7O.CENTER_INFO, jSONObject, 11).invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
