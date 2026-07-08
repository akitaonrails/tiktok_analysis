package Y;

import X.C0IJT;
import X.C0UX8;
import X.C1102070emj;
import X.C1102230emz;
import X.C1113800f5e;
import X.C1113840f5i;
import X.C1119390fEf;
import X.C1161920gLG;
import X.C1C7U;
import X.C474500IjA;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Queue;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS10S1000000_17 implements Runnable {
    public final int $t;
    public String s0;

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
        C0UX8 c0ux8;
        C1113840f5i c1113840f5iPeek;
        HashSet<Object> hashSet;
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        String str = this.s0;
        HashMap<String, Queue<C1113840f5i>> map = C1113800f5e.LJI;
        Queue<C1113840f5i> queue = map.get(str);
        if (queue == null || queue.peek() == null) {
            return;
        }
        if (!C1113800f5e.LJIIIIZZ || ((c0ux8 = C1113800f5e.LJ) != null && (hashSet = C1113800f5e.LJIIIZ.get(c0ux8)) != null && !hashSet.isEmpty())) {
            C1113800f5e.LJIILL("unable", str);
            return;
        }
        Queue<C1113840f5i> queue2 = map.get(str);
        if (queue2 == null || (c1113840f5iPeek = queue2.peek()) == null) {
            return;
        }
        C1102230emz c1102230emz = (C1102230emz) ((LinkedHashMap) C1113800f5e.LJIILL).get(c1113840f5iPeek.LJFF);
        C1102070emj.LIZ.LJJI(C1113800f5e.LJIIJ.get(C1113800f5e.LJ), c1102230emz != null ? c1102230emz.LJFF : null, c1102230emz, C1113800f5e.LJIIIZ(c1113840f5iPeek, c1102230emz));
    }

    public static final void run$0(ARunnableS10S1000000_17 aRunnableS10S1000000_17) {
        boolean zLIZ;
        C1C7U.LIZ("TooltipStandardManager@a4d5.startTooltipDelay$1");
        try {
            aRunnableS10S1000000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TooltipStandardManager@a4d5.startTooltipDelay$1");
    }

    public static final void run$1(ARunnableS10S1000000_17 aRunnableS10S1000000_17) {
        String str;
        String str2 = aRunnableS10S1000000_17.s0;
        C1C7U.LIZ("LiveInitMonitorV3@fae5.monitorUpload$1L");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_init_time_all");
        int i = 0;
        do {
            long j = C1119390fEf.LIZIZ[i];
            long j2 = C1119390fEf.LIZJ[i];
            if (j > 0 && j2 > 0) {
                if (i != 0) {
                    if (i != 1) {
                        str = "";
                    } else {
                        str = "init_live_all_duration_no_sleep";
                    }
                } else {
                    str = "init_live_lite_duration_no_sleep";
                }
                c474500IjALIZ.LJJII(Long.valueOf(j2 - j), str);
            }
            i++;
        } while (i < 2);
        c474500IjALIZ.LJJIFFI(Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()), "device_score");
        c474500IjALIZ.LJJII(Boolean.valueOf(C1119390fEf.LIZLLL), "is_main_thread");
        c474500IjALIZ.LJJII(str2, "call_path");
        c474500IjALIZ.LJJII(Long.valueOf(C1119390fEf.LIZ - ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getApplicationInitTime()), "init_live_launch_task");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LIZ();
        }
        C1C7U.LIZIZ("LiveInitMonitorV3@fae5.monitorUpload$1L");
    }

    public ARunnableS10S1000000_17(String str, int i) {
        this.$t = i;
        if (i != 0) {
            this.s0 = str;
        } else {
            this.s0 = str;
        }
    }
}
