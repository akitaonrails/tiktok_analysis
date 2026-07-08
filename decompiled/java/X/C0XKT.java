package X;

import com.bytedance.crash.Npth;

/* JADX INFO: renamed from: X.0XKT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XKT {
    public static volatile boolean LIZ;
    public static volatile int LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0XKS());

    public static int LIZIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static void LIZ(int i, boolean z) {
        if (!LIZ && z) {
            LIZ = true;
            Npth.addTag("sandbox_launch_exp", String.valueOf(i));
        }
    }
}
