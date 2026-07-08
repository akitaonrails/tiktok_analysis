package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0CP9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CP9 {
    public static C0CP8 LIZ = C0CP8.COLD_BOOT_BEGIN;
    public static final CopyOnWriteArrayList<C0CP3> LIZIZ = new CopyOnWriteArrayList<>();

    public static boolean LIZ() {
        return LIZ == C0CP8.COLD_BOOT_END || LIZ == C0CP8.WARM_BOOT_END;
    }

    public static boolean LIZIZ() {
        return LIZ == C0CP8.COLD_BOOT_BEGIN || LIZ == C0CP8.COLD_BOOT_END;
    }
}
