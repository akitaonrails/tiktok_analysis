package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472910oQr {
    public static final C1472910oQr LIZ = new C1472910oQr();
    public static final Map<String, C1473150oRF> LIZIZ = Collections.synchronizedMap(new C603840NmI(100));
    public static String LIZJ;

    public static C1473150oRF LIZ(String str) {
        IRadarTransmitter iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ();
        if (iRadarTransmitterLJIIIZ != null && iRadarTransmitterLJIIIZ.analyzerEnabled() && !TextUtils.isEmpty(str) && !Intrinsics.LJFF("null", str)) {
            Map<String, C1473150oRF> map = LIZIZ;
            C1473150oRF c1473150oRF = map.get(str);
            if (c1473150oRF == null) {
                C1473150oRF c1473150oRF2 = new C1473150oRF(str);
                map.put(str, c1473150oRF2);
                return c1473150oRF2;
            }
            return c1473150oRF;
        }
        return null;
    }

    public static void LIZIZ(String str) {
        IRadarTransmitter iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ();
        if (iRadarTransmitterLJIIIZ != null) {
            iRadarTransmitterLJIIIZ.tag(str);
        }
    }
}
