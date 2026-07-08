package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.01Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C332201Qq {
    public static final Keva LIZ = Keva.getRepo("music_dsp_common_repo");

    public static boolean LIZ(String str, boolean z) {
        return LIZ.getBoolean(str, z);
    }

    public static void LIZIZ(String str, boolean z) {
        LIZ.storeBoolean(str, z);
    }
}
