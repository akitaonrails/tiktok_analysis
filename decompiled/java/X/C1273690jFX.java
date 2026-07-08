package X;

import Y.ARunnableS96S0000000_20;
import com.ss.ttlivestreamer.core.utils.QualcommGpuUtils;

/* JADX INFO: renamed from: X.0jFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273690jFX {
    public static C1273700jFY LIZ;
    public static final ThreadLocal<Boolean> LIZIZ = new ThreadLocal<>();
    public static final ARunnableS96S0000000_20 LIZJ = new ARunnableS96S0000000_20(2);

    public static boolean LIZ() {
        C1273700jFY c1273700jFY = LIZ;
        return c1273700jFY != null && c1273700jFY.LIZ != null && c1273700jFY.LIZJ && c1273700jFY.LIZIZ > 0;
    }

    public static void LIZIZ() {
        ThreadLocal<Boolean> threadLocal = LIZIZ;
        Boolean bool = threadLocal.get();
        if (LIZ() && bool != null && bool.booleanValue()) {
            threadLocal.set(Boolean.FALSE);
            QualcommGpuUtils.sendCommand(EnumC1083230eIL.DEFAULT);
        }
    }
}
