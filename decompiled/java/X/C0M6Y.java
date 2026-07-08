package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0M6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M6Y {
    public static final C0M6Y LIZ = new C0M6Y();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(333));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(334));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(332));

    public static InterfaceC562960M6c LIZIZ() {
        return (InterfaceC562960M6c) LIZJ.getValue();
    }

    public static void LIZ(String str) {
        InterfaceC562800M5m interfaceC562800M5m = (InterfaceC562800M5m) LIZLLL.getValue();
        if (interfaceC562800M5m != null) {
            interfaceC562800M5m.LJ("AIRemixDraftEntranceMobHelper", str);
        }
    }

    public static void LJFF(C0M6S c0m6s, C0M6S c0m6s2, int i) {
        String strLIZIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("from_status", c0m6s.name()), new Pair("to_status", c0m6s2.name()), new Pair("count", String.valueOf(i)));
        InterfaceC562960M6c interfaceC562960M6cLIZIZ = LIZIZ();
        if (interfaceC562960M6cLIZIZ != null) {
            InterfaceC562960M6c interfaceC562960M6cLIZIZ2 = LIZIZ();
            if (interfaceC562960M6cLIZIZ2 == null || (strLIZIZ = interfaceC562960M6cLIZIZ2.LIZIZ()) == null) {
                strLIZIZ = "";
            }
            interfaceC562960M6cLIZIZ.LIZ("draft_set_status_change", strLIZIZ, EnumC562940M6a.INFO, mapLJIIIIZZ, System.currentTimeMillis());
        }
    }

    public static void LIZLLL(String str, String str2, boolean z, boolean z2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("stage", str);
        c0lab.LJFF("has_container", z);
        c0lab.LJFF("has_controller", z2);
        c0lab.LJ("result", str2);
        C20684815ws.LJIILLIIL("ttcrt_airemix_draft_dot_animation_lifecycle", c0lab.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportDotAnimationLifecycle: stage: ");
        sbLIZ.append(str);
        sbLIZ.append(", result: ");
        sbLIZ.append(str2);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ(int i, String str, String str2, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("observer_type", str);
        c0lab.LJ("trigger_source", str2);
        c0lab.LIZ(i, "message_size");
        c0lab.LJFF("need_refresh", z);
        C20684815ws.LJIILLIIL("ttcrt_airemix_draft_observer_trigger", c0lab.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportObserverTrigger: observerType: ");
        sbLIZ.append(str);
        sbLIZ.append(", triggerSource: ");
        sbLIZ.append(str2);
        sbLIZ.append(", messageSize: ");
        sbLIZ.append(i);
        sbLIZ.append(", needRefresh: ");
        sbLIZ.append(z);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(C0M6S c0m6s, boolean z, boolean z2, String str, long j, String str2) {
        String str3;
        int i = C0M6T.LIZ[c0m6s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str3 = "default";
                } else {
                    str3 = "failed";
                }
            } else {
                str3 = "generating";
            }
        } else {
            str3 = "completed";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("draft_status", str3);
        c0lab.LJFF("is_valid_url", z);
        c0lab.LJFF("need_blur", z2);
        c0lab.LJ("result", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("fail_stage", str2);
        C20684815ws.LJIILLIIL("ttcrt_airemix_draft_cover_process_duration", c0lab.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportCoverProcessDuration: duration: ");
        sbLIZ.append(j);
        sbLIZ.append(", failStage: ");
        sbLIZ.append(str2);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
