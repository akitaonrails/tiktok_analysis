package X;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0pRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1511710pRR {
    public static boolean LIZ;

    public static ScheduledExecutorService LIZ() {
        if (C1511670pRN.LIZ && !LIZ) {
            LIZ = true;
            C1511670pRN.LIZJ("ml#task", "use Default ScheduledExecutorService!", new Throwable("for debug!!"));
        }
        return C1511720pRS.LIZ;
    }
}
