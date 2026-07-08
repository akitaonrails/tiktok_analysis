package X;

import Y.AObjectS78S0000000_28;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10Qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19245010Qu {
    public static final C19245010Qu LIZ = new C19245010Qu();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static final boolean LIZ() throws Throwable {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        INewUserDebugService iNewUserDebugServiceLIZIZ2;
        INewUserDebugService iNewUserDebugServiceLIZIZ3;
        INewUserDebugService iNewUserDebugServiceLIZIZ4;
        INewUserJourneyService iNewUserJourneyService;
        InterfaceC591620NIi interfaceC591620NIiLIZJ;
        try {
            C1865740yeS c1865740yeS = C1865740yeS.LIZ;
            AObjectS78S0000000_28 aObjectS78S0000000_28 = new AObjectS78S0000000_28(11);
            c1865740yeS.getClass();
            C1865740yeS.LIZLLL("SignalMarker_KMP", aObjectS78S0000000_28);
            if (LIZJ) {
                C19240510Pb.LIZ.getClass();
                if (C19240510Pb.LIZIZ() || C19240510Pb.LIZJ() || ((iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null)) != null && (interfaceC591620NIiLIZJ = iNewUserJourneyService.LIZJ()) != null && interfaceC591620NIiLIZJ.LJII())) {
                    if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ4 = C1865740yeS.LIZIZ()) != null) {
                        iNewUserDebugServiceLIZIZ4.LJI("SignalMarker_KMP", "shouldRefreshNUF=true, hit interestRefresh");
                    }
                    return true;
                }
            }
            if (LIZLLL) {
                C19240510Pb.LIZ.getClass();
                if (C19240510Pb.LIZIZ()) {
                    if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ3 = C1865740yeS.LIZIZ()) != null) {
                        iNewUserDebugServiceLIZIZ3.LJI("SignalMarker_KMP", "shouldRefreshNUF=true, hit nujAgeGateRefresh");
                    }
                    return true;
                }
            }
            if (LIZIZ) {
                C19240510Pb.LIZ.getClass();
                if (C19240510Pb.LIZJ()) {
                    if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ2 = C1865740yeS.LIZIZ()) != null) {
                        iNewUserDebugServiceLIZIZ2.LJI("SignalMarker_KMP", "shouldRefreshNUF=true, hit registerRefresh");
                    }
                    return true;
                }
            }
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
                iNewUserDebugServiceLIZIZ.LJI("SignalMarker_KMP", "shouldRefreshNUF=false, no branch hit");
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u8 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u8.getClass();
            C10U8.LIZ("SignalMarker_shouldRefreshNUF", e, mapLIZJ);
        }
        return false;
    }
}
