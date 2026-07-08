package Y;

import X.C0IJT;
import X.C0IUV;
import X.C1C7U;
import X.C465350IMr;
import X.C474500IjA;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS0S0100200_7 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        long j = this.j1;
        long j2 = this.j2;
        C465350IMr c465350IMr = (C465350IMr) this.l0;
        if (SlardarSampleSetting.INSTANCE.isReport("livesdk_room_enter_full_link_duration", 0.0d)) {
            HashMap map = new HashMap();
            map.put("request_total_time", String.valueOf(j2 - j));
            String str = c465350IMr.LIZIZ;
            if (str != null) {
                map.put("enter_from_merge", str);
            }
            String str2 = c465350IMr.LIZJ;
            if (str2 != null) {
                map.put("enter_method", str2);
            }
            String str3 = c465350IMr.LIZ;
            if (str3 != null) {
                map.put("action_type", str3);
            }
            String str4 = c465350IMr.LJ;
            if (str4 != null) {
                map.put("path", str4);
            }
            String str5 = c465350IMr.LJFF;
            if (str5 != null) {
                map.put(Scene.SCENE_SERVICE, str5);
            }
            String str6 = c465350IMr.LJI;
            if (str6 != null) {
                map.put("is_from_ec", str6);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_enter_full_link_duration");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(map);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJJIJL();
            }
        }
    }

    public static final void run$0(ARunnableS0S0100200_7 aRunnableS0S0100200_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveEnterRoomMonitor$Companion@20f9.reportLog$1");
        try {
            aRunnableS0S0100200_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveEnterRoomMonitor$Companion@20f9.reportLog$1");
    }

    public static final void run$1(ARunnableS0S0100200_7 aRunnableS0S0100200_7) {
        boolean zLIZ;
        C1C7U.LIZ("NewFeedStyleEntranceUtils@a570.startInnerFeedWithPreDataV2Later$1");
        try {
            C0IUV.LJIIL(aRunnableS0S0100200_7.j1, aRunnableS0S0100200_7.j2, (Map) aRunnableS0S0100200_7.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewFeedStyleEntranceUtils@a570.startInnerFeedWithPreDataV2Later$1");
    }

    public ARunnableS0S0100200_7(long j, long j2, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.j2 = j2;
        this.l0 = obj;
    }
}
