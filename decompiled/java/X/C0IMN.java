package X;

import com.bytedance.android.livesdk.settings.Game2kSdkKeySetting;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IMN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IMN {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final Map<String, Integer> LIZJ;
    public static final Map<String, String> LIZLLL;
    public static final Map<String, String> LJ;

    static {
        Game2kSdkKeySetting game2kSdkKeySetting = Game2kSdkKeySetting.INSTANCE;
        String value = game2kSdkKeySetting.getValue();
        LIZ = value;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(game2kSdkKeySetting.getValue());
        sbLIZ.append("_60");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = strLIZIZ;
        LIZJ = C2097608Jq.LJIIJ(new Pair("ld", 360), new Pair("sd", 540), new Pair("hd", 720), new Pair("uhd", 1080), new Pair(value, 1440), new Pair(strLIZIZ, 1440), new Pair("origin", 2160));
        LIZLLL = C2097608Jq.LJIIJ(new Pair("auto", "Auto"), new Pair("ld", "360P"), new Pair("sd", "540P"), new Pair("hd", "720P"), new Pair("hd_60", "720P60"), new Pair("uhd", "1080P"), new Pair("uhd_60", "1080P60"), new Pair(value, "1440P"), new Pair(strLIZIZ, "1440P60"), new Pair("origin", "origin"));
        LJ = C2097608Jq.LJIIJ(new Pair("ld", "360p"), new Pair("sd", "540p"), new Pair("hd", "720p30"), new Pair("hd_60", "720P60"), new Pair("uhd", "1080p30"), new Pair("uhd_60", "1080p60"), new Pair(value, "1440P"), new Pair(strLIZIZ, "1440P60"), new Pair("origin", "origin"));
    }
}
