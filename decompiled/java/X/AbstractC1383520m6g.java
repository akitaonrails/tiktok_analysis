package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1383520m6g {
    public final String LIZ;
    public long LIZIZ;

    public abstract String LIZ();

    public abstract void LIZJ(int i);

    public AbstractC1383520m6g(String str) {
        this.LIZ = str;
    }

    public void LIZLLL(String str, String str2) {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("duration", Long.valueOf(jCurrentTimeMillis));
                c2241008qG.LIZ.put("tools_use_downloader", Boolean.TRUE);
                c2241008qG.LIZ.put("from", this.LIZ);
                c2241008qG.LIZ.put("url", LIZ());
                c2241008qG.LIZ.put("cur_url", str);
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_download_error_rate", 0, jSONObjectLJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void LIZIZ(Exception exc, Integer num, String str) {
        int iIntValue;
        String strLIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", LIZ());
                    jSONObject.put("from", this.LIZ);
                    jSONObject.put("tools_use_downloader", true);
                    if (exc == null) {
                        strLIZ = "null exception";
                    } else {
                        strLIZ = C1331420kke.LIZ(exc);
                    }
                    jSONObject.put("exception", strLIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_download_error_rate", 1, jSONObject);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C612410O0h.LIZ(iIntValue, str, LIZ(), this.LIZ);
    }
}
