package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0aRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935410aRv {
    public static final Map LIZIZ(DataChannel dataChannel, Map map) {
        BasePlaybookService basePlaybookServiceLIZIZ;
        if (C930540aK4.LIZJ()) {
            basePlaybookServiceLIZIZ = C784920Uqg.LIZIZ(dataChannel);
            if (!(basePlaybookServiceLIZIZ instanceof BasePlaybookService)) {
                return null;
            }
        } else {
            Object objLIZIZ = C935150aRV.LIZIZ();
            if (!(objLIZIZ instanceof BasePlaybookService)) {
                return null;
            }
            basePlaybookServiceLIZIZ = (BasePlaybookService) objLIZIZ;
        }
        if (basePlaybookServiceLIZIZ == null) {
            return null;
        }
        return basePlaybookServiceLIZIZ.LJJIJIIJIL("livesdk_multiguest_playbook_feature_set", map);
    }

    public static final void LIZ(DataChannel dataChannel, String str, Map map) {
        BasePlaybookService basePlaybookServiceLIZIZ;
        Map<String, String> mapLJJIJIIJIL;
        if (C930540aK4.LIZJ()) {
            basePlaybookServiceLIZIZ = C784920Uqg.LIZIZ(dataChannel);
            if (!(basePlaybookServiceLIZIZ instanceof BasePlaybookService)) {
                return;
            }
        } else {
            Object objLIZIZ = C935150aRV.LIZIZ();
            if (!(objLIZIZ instanceof BasePlaybookService)) {
                return;
            } else {
                basePlaybookServiceLIZIZ = (BasePlaybookService) objLIZIZ;
            }
        }
        if (basePlaybookServiceLIZIZ != null && (mapLJJIJIIJIL = basePlaybookServiceLIZIZ.LJJIJIIJIL(str, null)) != null) {
            map.putAll(mapLJJIJIIJIL);
        }
    }
}
