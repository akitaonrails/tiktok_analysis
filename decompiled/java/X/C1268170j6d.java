package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import java.util.List;

/* JADX INFO: renamed from: X.0j6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268170j6d {
    public C1268190j6f LIZ;
    public final List<int[]> LIZIZ = C1697810uHb.LJIIJJI(new int[]{240, 320}, new int[]{480, 640}, new int[]{720, 1280}, new int[]{1080, 1920});
    public final List<List<Integer>> LIZJ = C1697810uHb.LJIIJJI(C1697810uHb.LJIIJJI(30976, 160), C1697810uHb.LJIIJJI(47872, 180), C1697810uHb.LJIIJJI(57600, 200), C1697810uHb.LJIIJJI(63360, 230), C1697810uHb.LJIIJJI(76800, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)), C1697810uHb.LJIIJJI(85860, 320), C1697810uHb.LJIIJJI(115200, 420), C1697810uHb.LJIIJJI(129600, 500), C1697810uHb.LJIIJJI(172800, 660), C1697810uHb.LJIIJJI(194400, 710), C1697810uHb.LJIIJJI(204480, 740), C1697810uHb.LJIIJJI(230400, 800), C1697810uHb.LJIIJJI(236160, 810), C1697810uHb.LJIIJJI(259200, 840), C1697810uHb.LJIIJJI(307200, 900), C1697810uHb.LJIIJJI(373248, 990), C1697810uHb.LJIIJJI(399600, 1030), C1697810uHb.LJIIJJI(414720, 1050), C1697810uHb.LJIIJJI(442368, 1090), C1697810uHb.LJIIJJI(524288, 1200), C1697810uHb.LJIIJJI(531360, 1220), C1697810uHb.LJIIJJI(589824, 1340), C1697810uHb.LJIIJJI(709920, 1580), C1697810uHb.LJIIJJI(737280, 1630), C1697810uHb.LJIIJJI(819200, 1790), C1697810uHb.LJIIJJI(921600, 2000), C1697810uHb.LJIIJJI(1658880, 2570), C1697810uHb.LJIIJJI(1843200, 2700), C1697810uHb.LJIIJJI(2073600, Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE)));

    public static int LIZ(int i, int i2) {
        int i3;
        if (i2 > 0 && (i3 = i % i2) != 0) {
            return i + (i2 - i3);
        }
        return i;
    }
}
