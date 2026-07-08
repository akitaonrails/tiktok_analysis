package X;

import Y.ARunnableS18S0100100_13;
import com.ss.android.ugc.aweme.trace.TraceLogConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VGA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGA {
    public static volatile C0VGD LIZJ;
    public static C0V3K LIZLLL;
    public static boolean LJ;
    public static volatile Boolean LJFF;
    public static volatile boolean LJI;
    public static final ConcurrentHashMap<String, C807160VlS> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C807090VlL> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LJII = C452501pT.LIZIZ(new C0V3B());

    public static TraceLogConfig LIZ() {
        C0VGD c0vgd = LIZJ;
        if (c0vgd != null) {
            if (c0vgd.LIZ) {
                List<String> list = c0vgd.LIZJ;
                List<String> list2 = c0vgd.LIZLLL;
                List<String> list3 = c0vgd.LJ;
                List<String> list4 = c0vgd.LJFF;
                Boolean bool = Boolean.TRUE;
                return new TraceLogConfig(bool, Boolean.FALSE, null, list3, null, null, null, null, list, list2, null, bool, null, list4, null, null, null, null, null, null, null);
            }
            if (c0vgd.LIZIZ) {
                return (TraceLogConfig) C0VGB.LIZIZ.getValue();
            }
        }
        return C0VGB.LIZ;
    }

    public static boolean LIZJ() {
        C0VGD c0vgd = LIZJ;
        return (c0vgd != null && c0vgd.LIZ) || Intrinsics.LJFF(LIZ().logForceTraceEnable, Boolean.TRUE);
    }

    public static boolean LIZLLL() {
        Boolean boolValueOf;
        if (LJFF == null) {
            if (LIZJ() || !C806950Vl7.LIZIZ.LJII()) {
                boolValueOf = Boolean.FALSE;
            } else {
                boolValueOf = Boolean.valueOf(C792750V7x.LIZIZ().LIZJ("app.ui.page", false) == 0);
            }
            LJFF = boolValueOf;
        }
        return Intrinsics.LJFF(LJFF, Boolean.TRUE);
    }

    public static boolean LJ() {
        Integer num = LIZ().logPrefOptFlag;
        return (num == null || (num.intValue() & 2) == 0) ? false : true;
    }

    public static boolean LJFF() {
        Integer num = LIZ().logPrefOptFlag;
        return (num == null || (num.intValue() & 1) == 0) ? false : true;
    }

    public static void LJI() {
        Long l = LIZ().logResetCheckPointTs;
        LJII(l != null ? l.longValue() : 60000L, new C0VGE());
    }

    public static C807090VlL LIZIZ(String str) {
        return LIZIZ.get(str);
    }

    public static void LJIIIIZZ(Function1 function1) {
        LJII(0L, function1);
    }

    public static void LJII(long j, Function1 function1) {
        if (!LJI) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0V3D c0v3d = (C0V3D) LJII.getValue();
        ARunnableS18S0100100_13 aRunnableS18S0100100_13 = new ARunnableS18S0100100_13(jCurrentTimeMillis, function1, 2);
        if (j < 0) {
            j = 0;
        }
        c0v3d.LIZIZ(j, aRunnableS18S0100100_13);
    }
}
