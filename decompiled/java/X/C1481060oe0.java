package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.ab.PlayerTypeAbConfig;

/* JADX INFO: renamed from: X.0oe0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481060oe0 {
    public static PlayerTypeAbConfig LIZ = null;
    public static Boolean LIZIZ = null;
    public static String LIZJ = null;
    public static int LIZLLL = -1;
    public static boolean LJ = true;
    public static boolean LJFF = false;
    public static String LJI = null;
    public static int LJII = -1;
    public static boolean LJIIIIZZ = true;
    public static Boolean LJIIIZ;

    public static boolean LJ() {
        try {
            if (LIZJ == null) {
                LIZJ = Build.HARDWARE;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ = null;
        }
        return LIZJ != null && LIZJ.toLowerCase().startsWith("mt");
    }

    public static boolean LJI() {
        return ((Boolean) C0AOS.LIZ.getValue()).booleanValue() ? C1480850odf.LIZJ.isUseSurfaceView() && ((Boolean) C0AOT.LIZ.getValue()).booleanValue() : ((Boolean) C1474810oTv.u0.getValue()).booleanValue();
    }

    public static boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_reuse_engine", false) == 1;
    }

    public static boolean LJFF() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "player_preload_v3", true) == 1;
    }

    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "play";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        int i = LJII + 1;
        LJII = i;
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(Video video) {
        if (video != null) {
            return video.getAid();
        }
        return "null";
    }

    public static boolean LIZJ(boolean z) {
        if (LIZ == null) {
            LIZ = C1481000odu.LIZ();
        }
        PlayerTypeAbConfig playerTypeAbConfig = LIZ;
        if (playerTypeAbConfig == null) {
            return false;
        }
        if (z) {
            if (playerTypeAbConfig.bytevc1DecodeType != 1) {
                return false;
            }
        } else if (playerTypeAbConfig.h264DecodeType != 1) {
            return false;
        }
        return true;
    }

    public static void LJII(String str, long j, long j2, int i, byte[] bArr) {
        C582130MsN.LIZ().LJ().getClass();
        C1014030cUj.LIZ.LJIIL(str, j, j2, i, bArr);
    }
}
