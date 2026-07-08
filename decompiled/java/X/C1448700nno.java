package X;

import android.util.Log;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0nno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448700nno {
    public static final InterfaceC1637880siw LIZ = C0CHQ.LIZ().LIZJ();

    public static void LIZ(Effect effect, boolean z, long j, ExceptionResult exceptionResult) {
        UrlModel fileUrl;
        String effectId;
        String name;
        C543670LTx c543670LTx = new C543670LTx();
        Gson gson = C0CHQ.LIZ().getGson();
        Integer numValueOf = null;
        if (effect != null) {
            fileUrl = effect.getFileUrl();
        } else {
            fileUrl = null;
        }
        String json = GsonProtectorUtils.toJson(gson, fileUrl);
        String str = "";
        if (json == null) {
            json = "";
        }
        c543670LTx.LIZ.put("url", json);
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        c543670LTx.LIZ.put("effect_id", effectId);
        if (effect != null && (name = effect.getName()) != null) {
            str = name;
        }
        c543670LTx.LIZ.put("effect_name", str);
        if (effect != null) {
            numValueOf = Integer.valueOf(effect.getEffectType());
        }
        c543670LTx.LIZ.put("effect_type", numValueOf);
        c543670LTx.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        if (!z && exceptionResult != null) {
            c543670LTx.LIZ.put("exception", Log.getStackTraceString(exceptionResult.getException()));
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(exceptionResult.getErrorCode()));
            c543670LTx.LIZLLL("errorMsg", exceptionResult.getMsg());
        }
        LIZ.LJIIJJI(!z ? 1 : 0, "edit_effect_download_error_rate", c543670LTx.LJ());
    }
}
