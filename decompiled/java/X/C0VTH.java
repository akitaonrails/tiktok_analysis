package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0VTH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTH {
    public static C0V2S LIZ;
    public static C0VTJ LIZIZ;
    public static int LIZJ;
    public static final boolean LIZLLL;

    static {
        int i = Keva.getRepo("vsync_probe_repo").getInt("key", 0);
        LIZJ = i;
        LIZLLL = (i & 4) > 0;
    }

    public static void LIZ(boolean z, boolean z2) {
        int i;
        int i2 = LIZJ;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = i | i2;
        LIZJ = i3;
        if (z2) {
            LIZJ = i3 | 4;
        }
        Keva.getRepo("vsync_probe_repo").storeInt("key", LIZJ);
    }
}
