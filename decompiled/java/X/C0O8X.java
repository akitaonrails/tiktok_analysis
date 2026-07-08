package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0O8X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O8X {
    public long LIZJ;
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public String LIZLLL = "";

    public final void LIZ() {
        this.LIZIZ.put("duration", String.valueOf(System.currentTimeMillis() - this.LIZJ));
    }

    public final void LJ() {
        this.LIZ.clear();
        this.LIZIZ.clear();
        this.LIZJ = 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZJ = jCurrentTimeMillis;
        this.LIZIZ.put("time_stamp", String.valueOf(jCurrentTimeMillis));
    }

    public final void LJFF() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("comment_sli_monitor", true)) {
            if (this.LIZJ > 0 && !this.LIZIZ.containsKey("duration")) {
                LIZ();
            }
            if (!this.LIZIZ.containsKey("uid") && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                this.LIZIZ.put("uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            }
            if (!this.LIZIZ.containsKey("did")) {
                this.LIZIZ.put("did", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
            }
            try {
                if (this.LIZLLL.length() > 0) {
                    C793770VBv.LJII(this.LIZLLL, new JSONObject(C2097608Jq.LJIIZILJ(this.LIZ)), null, new JSONObject(C2097608Jq.LJIIZILJ(this.LIZIZ)));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZLLL(BaseResponse baseResponse) {
        Integer numValueOf;
        LogPbBean logPbBean;
        String imprId;
        if ((baseResponse instanceof BaseCommentResponse) && (logPbBean = ((BaseCommentResponse) baseResponse).logPd) != null && (imprId = logPbBean.getImprId()) != null) {
            this.LIZIZ.put("log_id", imprId);
        }
        if (baseResponse != null && baseResponse.status_code == 0) {
            this.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
        } else {
            this.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZ;
        Integer numValueOf2 = null;
        if (baseResponse != null) {
            numValueOf = Integer.valueOf(baseResponse.status_code);
        } else {
            numValueOf = null;
        }
        concurrentHashMap.put("status_code", String.valueOf(numValueOf));
        ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZ;
        if (baseResponse != null) {
            numValueOf2 = Integer.valueOf(baseResponse.error_code);
        }
        concurrentHashMap2.put("error_code", String.valueOf(numValueOf2));
    }

    public final void LJI(int i) {
        LIZIZ(CardStruct.IStatusCode.DEFAULT, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        LIZIZ(Integer.valueOf(i), "error_code");
        LIZIZ("-1", "status_code");
        LJFF();
    }

    public final void LIZIZ(Object obj, String str) {
        if (obj != null) {
            this.LIZ.put(str, obj);
        }
    }

    public final void LIZJ(Object obj, String str) {
        if (obj != null) {
            this.LIZIZ.put(str, obj);
        }
    }
}
