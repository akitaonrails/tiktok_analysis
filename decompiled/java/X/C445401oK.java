package X;

import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.ReasonMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.01oK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C445401oK {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(List<? extends IdMessage> list, List<? extends ReasonMessage> list2) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            HashMap map = new HashMap();
            if (!list.isEmpty()) {
                map.put("successfulMessages", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list));
            }
            if (!list2.isEmpty()) {
                map.put("failedMessages", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list2));
            }
            C1143300frE.LJIIJJI().LIZIZ("ttlive_fetch_message_polling_succeeded", map);
        }
    }
}
