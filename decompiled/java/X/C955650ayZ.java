package X;

import kotlin.jvm.internal.AFwS203S0000000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ayZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955650ayZ {
    public static final C01GW LIZ = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(296));
    public static boolean LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    public static InterfaceC956290azb LIZ() {
        return (InterfaceC956290azb) LIZ.getValue();
    }

    public static void LIZIZ() {
        C20441214yg.LIZIZ("LiveInteractFeatureCollector", "onCoHostInviteSuccessFromInviteList");
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        LIZ().LIZ("co_host_invite_from_list", new JSONObject().putOpt("result", 1), 2, null);
    }

    public static void LIZJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProposeMatch, isTwoMatch == ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LiveInteractFeatureCollector", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            LIZJ++;
        } else {
            LIZLLL++;
        }
        LIZ().LIZ("match_invite_during_co_host_result", new JSONObject().putOpt("proposed_two_match_times", Integer.valueOf(LIZJ)).putOpt("proposed_multi_match_times", Integer.valueOf(LIZLLL)), 2, null);
    }
}
