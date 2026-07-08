package X;

import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07QJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C07QN("tako_enable_text_animate")
public final class C07QJ {
    public static final C07QJ LIZ = new C07QJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(189));

    public static boolean LIZIZ() {
        return (!((Boolean) C1819207Ao.LIZIZ.getValue()).booleanValue() || (((Number) C1819207Ao.LIZ.getValue()).intValue() & 4) == 0) && (LIZJ() & 1) != 0;
    }

    public static int LIZJ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static boolean LIZ() {
        return (LIZJ() & 4) != 0;
    }
}
