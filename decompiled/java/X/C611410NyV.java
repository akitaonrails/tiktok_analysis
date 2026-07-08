package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0NyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611410NyV {
    public final Map<String, String> LIZ = new ConcurrentHashMap();
    public final Map<String, String> LIZIZ = new ConcurrentHashMap();
    public final Gson LIZJ = new Gson();

    public static C611410NyV LIZJ() {
        return C584850Mwl.LIZ;
    }

    public final String LIZ(LogPbBean logPbBean) {
        if (logPbBean == null) {
            return "";
        }
        return GsonProtectorUtils.toJson(this.LIZJ, logPbBean);
    }

    public final String LIZIZ(String str) {
        if (TextUtils.isEmpty(str) || !((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return "";
        }
        return (String) ((ConcurrentHashMap) this.LIZ).get(str);
    }

    public final String LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = (String) ((ConcurrentHashMap) this.LIZ).get(str);
        if (((ConcurrentHashMap) this.LIZ).containsKey(str) && str2 != null) {
            try {
                LogPbBean logPbBean = (LogPbBean) this.LIZJ.LJII(str2, LogPbBean.class);
                if (logPbBean != null) {
                    return logPbBean.getImprId();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "";
    }

    public final String LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return (String) ((ConcurrentHashMap) this.LIZ).get(str);
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String json = GsonProtectorUtils.toJson(this.LIZJ, logPbBean);
        ((ConcurrentHashMap) this.LIZ).put(str, json);
        return json;
    }

    public final String LJFF(String str) {
        if (TextUtils.isEmpty(str) || !((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return "";
        }
        return (String) ((ConcurrentHashMap) this.LIZIZ).get(str);
    }

    public final void LJI(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            ((ConcurrentHashMap) this.LIZ).put(str, GsonProtectorUtils.toJson(this.LIZJ, logPbBean));
        }
    }

    public final void LJII(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            ((ConcurrentHashMap) this.LIZIZ).put(str, GsonProtectorUtils.toJson(this.LIZJ, logPbBean));
        }
    }
}
