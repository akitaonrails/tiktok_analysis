package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455490nyl {
    public static final Keva LIZ = Keva.getRepo("MusicSyncModeControl");

    public static boolean LIZ(String str) {
        if (Intrinsics.LJFF(str, "single_song")) {
            return false;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, Integer.MAX_VALUE, "studio_auto_sound_sync_follower_count", true);
        if (iLJIJ != 0) {
            C1403010mc7.LIZ.getCommerceService();
            if (C1465270oEX.LIZ() < iLJIJ) {
                return false;
            }
        }
        C1403010mc7.LIZ.getCommerceService();
        if (C1465270oEX.LIZ() >= C0C64.LJIILLIIL().LJIJ(31744, 10000, "enable_soundsync_remember_follower_count", true)) {
            return Intrinsics.LJFF(LIZ.getString("storeLastMode1", "default"), "default");
        }
        return Intrinsics.LJFF(LIZ.getString("storeLastMode1", "SYNC"), "default");
    }

    public static void LIZIZ(String str, boolean z) {
        String str2;
        if (Intrinsics.LJFF(str, "single_song")) {
            return;
        }
        Keva keva = LIZ;
        if (z) {
            str2 = "SYNC";
        } else {
            str2 = "default";
        }
        keva.storeString("storeLastMode1", str2);
    }
}
