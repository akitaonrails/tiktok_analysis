package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634530sdX implements IEffectDownloadProgressListener {
    public final IFetchEffectListener LIZ;
    public long LIZIZ;
    public long LIZJ;

    public C1634530sdX(C1634550sdZ c1634550sdZ) {
        this.LIZ = c1634550sdZ;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZIZ = System.currentTimeMillis();
        this.LIZJ = 0L;
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect r16) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1634530sdX.onSuccess(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        Object stackTrace;
        String effectId;
        try {
            if (C036E.LIZ.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(exceptionResult.getMsg());
                String json = "";
                if (exceptionResult.getErrorCode() != -1) {
                    stackTrace = "";
                } else {
                    stackTrace = exceptionResult.getException().getStackTrace();
                }
                sbLIZ.append(stackTrace);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
                C543670LTx c543670LTx = new C543670LTx();
                if (effect == null) {
                    effectId = "";
                } else {
                    effectId = effect.getEffectId();
                }
                c543670LTx.LIZ.put("sticker_id", effectId);
                c543670LTx.LIZ.put("errorCode", String.valueOf(exceptionResult.getErrorCode()));
                c543670LTx.LIZ.put("errorMsg", strLIZIZ);
                c543670LTx.LIZ.put("zip_model", 0);
                if (effect != null) {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), effect.getFileUrl());
                }
                c543670LTx.LIZ.put("url", json);
                interfaceC1637880siwLIZJ.LJIIJJI(1, "sticker_download_error_rate", c543670LTx.LJ());
                C543670LTx c543670LTx2 = new C543670LTx();
                c543670LTx2.LIZ.put("error_code", Integer.valueOf(exceptionResult.getErrorCode()));
                c543670LTx2.LIZ.put("error_msg", strLIZIZ);
                JSONObject jSONObjectLJ = c543670LTx2.LJ();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tag", "ttlive_sdk");
                    if (jSONObjectLJ != null) {
                        jSONObject.put("extra", jSONObjectLJ);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C0CHQ.LIZ().LIZJ().LJIIIZ("ttlive_download_sticker_all", 1, null, jSONObject);
                C0CHQ.LIZ().LIZJ().LJIIJJI(1, "ttlive_download_sticker_error", jSONObjectLJ);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C1442070nd7.LIZ(effect, this.LIZJ, System.currentTimeMillis() - this.LIZIZ, -1, exceptionResult);
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        if (this.LIZJ == 0) {
            this.LIZJ = j;
            C1442070nd7.LIZIZ(effect, j);
        }
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i, j);
        }
    }
}
