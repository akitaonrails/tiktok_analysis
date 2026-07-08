package X;

import com.ss.android.ugc.aweme.nxet.ITracingService;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848530yCh {
    public static final C1848560yCk LIZ = C1848560yCk.LIZ;
    public static final C1848590yCn LIZIZ = C1848590yCn.LIZ;

    public static void LJ(Function1 function1, Object obj) {
        if (function1 != null) {
            function1.invoke(new C1848510yCf(obj));
        }
    }

    public static void LIZ(Object obj, String str, Function1 function1) {
        LIZJ(obj, str, EnumC1848020yBs.ELEMENT, function1);
    }

    public static void LIZIZ(String str, Function1 function1, int i) {
        if ((i & 64) != 0) {
            function1 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (function1 != null) {
            C891470Yy9 c891470Yy9 = new C891470Yy9();
            function1.invoke(c891470Yy9);
            linkedHashMap.putAll(c891470Yy9.LIZ);
        }
        C1848120yC2 c1848120yC2 = new C1848120yC2(false, false, linkedHashMap, str, null, null, null);
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIIJJI(c1848120yC2);
        }
    }

    public static void LIZLLL(Object obj, String str, Function1 function1) {
        LIZJ(obj, str, EnumC1848020yBs.PAGE, function1);
    }

    public static void LIZJ(Object obj, String str, EnumC1848020yBs enumC1848020yBs, Function1 function1) {
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIILLIIL(obj, str, enumC1848020yBs);
        }
        LJ(function1, obj);
    }
}
