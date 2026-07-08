package X;

import Y.AObjectS78S0000000_28;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1865740yeS {
    public static final C1865740yeS LIZ = new C1865740yeS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS78S0000000_28(16));
    public static final C01GW LIZJ = C452501pT.LIZIZ(new AObjectS78S0000000_28(17));

    public static boolean LIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static INewUserDebugService LIZIZ() {
        return (INewUserDebugService) LIZIZ.getValue();
    }

    public static void LIZJ(String str, String str2) {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        if (LIZ() && (iNewUserDebugServiceLIZIZ = LIZIZ()) != null) {
            iNewUserDebugServiceLIZIZ.LJI(str, str2);
        }
    }

    public static void LIZLLL(String str, Function0 function0) {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        if (LIZ() && (iNewUserDebugServiceLIZIZ = LIZIZ()) != null) {
            iNewUserDebugServiceLIZIZ.LJI(str, (String) function0.invoke());
        }
    }
}
