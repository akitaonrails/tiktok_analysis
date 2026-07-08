package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import dtj.u7;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0seP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635070seP implements IFetchEffectChannelListener {
    public final IFetchEffectChannelListener LIZ;
    public final C138P LIZIZ = C138P.LIZ();
    public final String LIZJ;
    public Map<String, Object> LIZLLL;
    public int LJ;

    public final void LIZ() {
        if (this.LJ == 0) {
            if (C0CHQ.LIZ().LIZJ().LJIIJ()) {
                this.LJ = 1;
            } else {
                this.LJ = -1;
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        int iIntValue;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknow error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
        }
        if (u7.LIZ() && !u7.LIZLLL()) {
            IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZ;
            if (iFetchEffectChannelListener != null) {
                iFetchEffectChannelListener.onFail(exceptionResult);
                return;
            }
            return;
        }
        Map<String, Object> map = this.LIZLLL;
        if (map != null && map.containsKey("is_story")) {
            iIntValue = ((Integer) this.LIZLLL.get("is_story")).intValue();
        } else {
            iIntValue = 0;
        }
        if (u7.LJ() || u7.LIZLLL()) {
            InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(errorCode));
            c543670LTx.LIZ.put("errorDesc", msg);
            c543670LTx.LIZ.put("panel", this.LIZJ);
            c543670LTx.LIZ.put("is_story", Integer.valueOf(iIntValue));
            interfaceC1637880siwLIZJ.LJIIJJI(1, "sticker_list_error_rate", c543670LTx.LJ());
        }
        if (u7.LJ()) {
            C543670LTx c543670LTx2 = new C543670LTx();
            c543670LTx2.LIZ.put("error_code", Integer.valueOf(errorCode));
            c543670LTx2.LIZ.put("error_msg", msg);
            c543670LTx2.LIZ.put("panel_type", this.LIZJ);
            JSONObject jSONObjectLJ = c543670LTx2.LJ();
            LIZ();
            if (this.LJ >= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tag", "ttlive_sdk");
                    if (jSONObjectLJ != null) {
                        jSONObject.put("extra", jSONObjectLJ);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C0CHQ.LIZ().LIZJ().LJIIIZ("ttlive_load_sticker_list_all", 1, null, jSONObject);
            }
            C0CHQ.LIZ().LIZJ().LJIIJJI(1, "ttlive_load_sticker_list_error", jSONObjectLJ);
        }
        IFetchEffectChannelListener iFetchEffectChannelListener2 = this.LIZ;
        if (iFetchEffectChannelListener2 != null) {
            iFetchEffectChannelListener2.onFail(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        int iIntValue;
        if (u7.LIZ() && !u7.LIZLLL()) {
            IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZ;
            if (iFetchEffectChannelListener != null) {
                iFetchEffectChannelListener.onSuccess(effectChannelResponse);
                return;
            }
            return;
        }
        long jLIZIZ = this.LIZIZ.LIZIZ(TimeUnit.MILLISECONDS);
        Map<String, Object> map = this.LIZLLL;
        if (map != null && map.containsKey("is_story")) {
            iIntValue = ((Integer) this.LIZLLL.get("is_story")).intValue();
        } else {
            iIntValue = 0;
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("duration", Long.valueOf(jLIZIZ));
        c543670LTx.LIZ.put("is_story", Integer.valueOf(iIntValue));
        c543670LTx.LIZ.put("panel", this.LIZJ);
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        Map<String, Object> map2 = this.LIZLLL;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                try {
                    jSONObjectLJ.put(str, this.LIZLLL.get(str).toString());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (u7.LJ() || u7.LIZLLL()) {
            C0CHQ.LIZ().LIZJ().LJIIJJI(0, "sticker_list_error_rate", jSONObjectLJ);
        }
        if (u7.LJ()) {
            LIZ();
            if (this.LJ >= 0) {
                C543670LTx c543670LTx2 = new C543670LTx();
                c543670LTx2.LIZ.put("panel_type", this.LIZJ);
                JSONObject jSONObjectLJ2 = c543670LTx2.LJ();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tag", "ttlive_sdk");
                    if (jSONObjectLJ2 != null) {
                        jSONObject.put("extra", jSONObjectLJ2);
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C0CHQ.LIZ().LIZJ().LJIIIZ("ttlive_load_sticker_list_all", 0, jSONObjectLJ, jSONObject);
            }
        }
        IFetchEffectChannelListener iFetchEffectChannelListener2 = this.LIZ;
        if (iFetchEffectChannelListener2 == null) {
            return;
        }
        iFetchEffectChannelListener2.onSuccess(effectChannelResponse);
    }

    public C1635070seP(String str, C1635030seL c1635030seL) {
        this.LIZ = c1635030seL;
        this.LIZJ = str;
    }
}
