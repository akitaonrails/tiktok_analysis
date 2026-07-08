package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088060eQ8 {
    public static final C01GW LIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(206));
    public static int LIZIZ;
    public static DataChannel LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static Handler LJFF;

    public static void LIZ(int i) {
        if (i == 291) {
            if (LIZLLL) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_anchor_share_special_effect_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJIJJLI(LIZJ);
                c474500IjALIZIZ.LJJII(Integer.valueOf(LIZIZ), "special_effect_amount");
                c474500IjALIZIZ.LIZ();
            } else {
                C474500IjA c474500IjALIZIZ2 = C0IJT.LIZIZ("livesdk_share_special_effect_audience_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ2.LJIJJLI(LIZJ);
                c474500IjALIZIZ2.LJJII(Integer.valueOf(LIZIZ), "special_effect_amount");
                c474500IjALIZIZ2.LIZ();
            }
            LIZIZ = 0;
            int i2 = LIZIZ;
            long j = LJ;
            if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_share_anim_show_count_each_min")) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("count", i2);
                    jSONObject.put("room_id", j);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1CC2.LJI("ttlive_share_anim_show_count_each_min", new JSONObject(), null, jSONObject);
            }
            Handler handler = LJFF;
            if (handler != null) {
                C786410Ut5.LJLJJI(291, 60000L, handler);
            }
        }
    }
}
