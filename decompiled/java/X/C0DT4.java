package X;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.android.livesdk.dataChannel.CaptionStartShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0DT4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DT4 {
    public final DataChannel LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final Map<String, String> LIZ() {
        HashMap map = new HashMap();
        map.put("anchor_id", this.LIZIZ);
        map.put("room_id", this.LIZJ);
        map.put("app_language", this.LIZLLL);
        map.put("caption_language", this.LJ);
        map.put("caption_type", this.LJFF);
        map.put("device_model", Build.MODEL);
        return map;
    }

    public final void LIZJ(long j, long j2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_show_duration");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        Map<String, String> mapLIZ = LIZ();
        HashMap map = (HashMap) mapLIZ;
        map.put("duration", String.valueOf(j));
        map.put("message_id", String.valueOf(j2));
        c474500IjALIZ.LJJIIZI(mapLIZ);
        c474500IjALIZ.LIZ();
    }

    public final void LIZIZ(long j, String str, Function0 function0, boolean z) {
        long jLongValue;
        Long l = (Long) this.LIZ.gg0(CaptionStartShowEvent.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if ((!Intrinsics.LJFF(str, "leave") || j == 0) && (jLongValue == 0 || z)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_duration");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        Map<String, String> mapLIZ = LIZ();
        HashMap map = (HashMap) mapLIZ;
        map.put("reason", str);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        map.put("duration", String.valueOf(jElapsedRealtime / j2));
        if (Intrinsics.LJFF(str, "leave")) {
            map.put("duration", String.valueOf((SystemClock.elapsedRealtime() - j) / j2));
            w.LIZ.getClass();
            map.put("enter_from_merge", w.LJIIIZ());
            map.put("enter_method", w.LJIIL());
            map.put("action_type", w.LIZLLL());
        }
        c474500IjALIZ.LJJIIZI(mapLIZ);
        c474500IjALIZ.LIZ();
        this.LIZ.zW(CaptionStartShowEvent.class, 0L);
        if (!Intrinsics.LJFF(str, "close") && !Intrinsics.LJFF(str, "leave")) {
            return;
        }
        function0.invoke();
    }

    public final void LIZLLL(long j, long j2, long j3, long j4, Map<String, String> map) {
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_show");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        Map<String, String> mapLIZ = LIZ();
        HashMap map2 = (HashMap) mapLIZ;
        map2.put("caption_time", String.valueOf(j));
        if (j2 == 0) {
            j2 = j;
        }
        map2.put("caption_arrive_time", String.valueOf(j2));
        if (j3 != 0) {
            j = j3;
        }
        map2.put("caption_show_time", String.valueOf(j));
        if (j3 == -1) {
            i = 0;
        } else {
            i = 1;
        }
        map2.put("is_show", String.valueOf(i));
        map2.put("message_id", String.valueOf(j4));
        c474500IjALIZ.LJJIIZI(mapLIZ);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public C0DT4(DataChannel dataChannel, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = dataChannel;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
