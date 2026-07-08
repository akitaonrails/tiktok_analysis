package X;

import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473020oR2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        return C1475000oUE.LIZIZ().isDebug() || Intrinsics.LJFF(C1475000oUE.LIZIZ().getChannel(), "local_test");
    }

    public static boolean LIZJ() {
        IRadarTransmitter iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ();
        return iRadarTransmitterLJIIIZ != null && iRadarTransmitterLJIIIZ.enabled();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZ(String str) {
        switch (str.hashCode()) {
            case -1472362992:
                if (!str.equals("Not-Render")) {
                    return -1;
                }
                return 2;
            case -782671117:
                if (!str.equals("Short-Stop")) {
                    return -1;
                }
                return 4;
            case -355504186:
                if (!str.equals("Stop-B4-Render")) {
                    return -1;
                }
                return 4;
            case 16226426:
                if (!str.equals("Pause-B4-Render")) {
                    return -1;
                }
                return 3;
            case 1503668517:
                if (!str.equals("Short-Pause")) {
                    return -1;
                }
                return 3;
            case 1909244093:
                if (!str.equals("IE-HideCoverTimeout")) {
                    return -1;
                }
                return 3;
            default:
                return -1;
        }
    }

    public static String LIZLLL(String str, Object obj, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(":");
        sb.append(str);
        int i = 0;
        if (objArr.length != 0) {
            sb.append(e3.e);
            for (Object obj2 : C13LQ.LJJLL(objArr)) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    sb.append(obj2);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            sb.append(e3.f);
        }
        return sb.toString();
    }
}
