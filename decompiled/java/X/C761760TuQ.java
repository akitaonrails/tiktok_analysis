package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761760TuQ {
    public static final void LIZ(LiveEffect liveEffect, DataChannel dataChannel) {
        C761820TuW c761820TuW = (C761820TuW) ((LinkedHashMap) C761830TuX.LJFF).get(Long.valueOf(liveEffect.getEffectId()));
        if (c761820TuW != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_voice_use_time");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(liveEffect.LJJJJZI(), "effect_name");
            c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
            c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - c761820TuW.LIZ), "use_time");
            c474500IjALIZ.LJJII(liveEffect.getResourceId(), "resource_id");
            Map<Long, String> map = C07NR.LIZ;
            c474500IjALIZ.LJJII(((LinkedHashMap) map).get(Long.valueOf(liveEffect.getEffectId())), "select_scene");
            c474500IjALIZ.LIZ();
            map.remove(Long.valueOf(liveEffect.getEffectId()));
        }
    }
}
