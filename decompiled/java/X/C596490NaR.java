package X;

import Y.ARunnableS14S1100000_9;
import Y.AfS133S0000000_9;
import com.bytedance.keva.Keva;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596490NaR {
    public static boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final C596490NaR LIZ = new C596490NaR();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(522));
    public static final AfS133S0000000_9 LJ = new AfS133S0000000_9(4);

    public static Keva LIZ() {
        return (Keva) LIZLLL.getValue();
    }

    public static void LIZIZ() {
        String string;
        if (LIZJ || (string = LIZ().getString("cached_aweme_raw_ad", "")) == null || string.length() == 0) {
            return;
        }
        long j = LIZ().getLong("play_order", 0L);
        long j2 = LIZ().getLong("play_duration", -1L);
        int i = LIZ().getInt("launch_type", 1);
        int i2 = LIZ().getInt("current_position", 0);
        int i3 = LIZ().getInt("video_nums", 0);
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j2));
        map.put("launch_type", Integer.valueOf(i));
        map.put("current_position", Integer.valueOf(i2));
        map.put("play_order", Long.valueOf(j));
        map.put("video_nums", Integer.valueOf(i3));
        LIZ().storeString("cached_aweme_raw_ad", "");
        LIZ().storeLong("play_duration", -1L);
        LIZ().storeLong("play_order", 0L);
        LIZ().storeInt("launch_type", 1);
        LIZ().storeInt("current_position", 0);
        LIZ().storeInt("video_nums", 0);
        LIZJ = true;
        C20684815ws.LJFF().execute(new ARunnableS14S1100000_9(map, string, 14));
    }
}
