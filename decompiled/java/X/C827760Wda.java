package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.legoImp.task.PitayaDlpTask;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827760Wda {
    public final double LIZ;
    public final int LIZIZ;
    public final IPitayaCore LIZJ;
    public final ArrayList<String> LIZLLL;

    public final void LIZ(PTYTaskData pTYTaskData, long j) throws JSONException {
        JSONObject params;
        JSONArray jSONArray;
        boolean z;
        if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
            Object obj = params.get("result");
            if ((obj instanceof JSONArray) && (jSONArray = (JSONArray) obj) != null) {
                long jCurrentTimeMillis = (System.currentTimeMillis() - j) / ((long) jSONArray.length());
                int i = 0;
                while (i < jSONArray.length()) {
                    int i2 = i + 1;
                    if (JSONArrayProtectorUtils.getDouble(jSONArray, i) >= this.LIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C793770VBv.LJII("dlp_breached_monitor", new JSONObject().put("breached", String.valueOf(z)), new JSONObject().put("cost", jCurrentTimeMillis), null);
                    i = i2;
                }
            }
        }
    }

    public C827760Wda(PitayaDlpTask pitayaDlpTask, double d, int i) {
        this.LIZ = d;
        this.LIZIZ = i;
        this.LIZLLL = new ArrayList<>(i);
        C844470XAv.LIZ.getClass();
        this.LIZJ = PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
        ALog.addMessageInterceptor(pitayaDlpTask.LLILZ);
    }
}
