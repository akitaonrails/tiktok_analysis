package X;

import java.security.SecureRandom;

/* JADX INFO: renamed from: X.0pjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522720pjC {
    public static final /* synthetic */ int LIZ = 0;

    public static C828420Wee LIZ(String str, C1533790q13 c1533790q13) {
        C1E6N c1e6n;
        String str2;
        String str3;
        C1537480q70 c1537480q70LJ;
        String str4;
        String str5;
        if (c1533790q13.LIZ.LIZ()) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointWebView;
        } else if (c1533790q13.LIZ.LJJJ != EnumC1533980q1M.OTHER) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointLynx;
        } else {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointNative;
        }
        C828420Wee c828420Wee = new C828420Wee(c1e6n, C1E6N.SparkSecuritySolutionEndpointRemoteServer, C1E6B.SparkSecuritySolutionChannelNetwork);
        SecureRandom secureRandom = C828590Wev.LIZ;
        C1534070q1V c1534070q1V = c1533790q13.LJIIZILJ;
        if (c1534070q1V == null || (str2 = c1534070q1V.LJII.LIZLLL) == null) {
            str2 = c1533790q13.LIZ.LJJJJIZL;
        }
        C828590Wev.LIZLLL(c828420Wee, "URL", str2);
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        if (c1533490q0Z.LJJIIZ) {
            str3 = "preload";
        } else {
            Object obj = c1533490q0Z.LJFF.get("hybrid_channel");
            if (!(obj instanceof String) || (str3 = (String) obj) == null) {
                str3 = "forest";
            }
        }
        Object obj2 = c1533790q13.LIZ.LJFF.get("hybrid_channel");
        if ((obj2 instanceof String) && (str5 = (String) obj2) != null) {
            str3 = str5;
        }
        C828590Wev.LIZLLL(c828420Wee, "hybrid_channel", str3);
        Object obj3 = c1533790q13.LIZ.LJFF.get("source_location");
        if ((obj3 instanceof String) && (str4 = (String) obj3) != null) {
            str = str4;
        }
        C828590Wev.LIZLLL(c828420Wee, "source_location", str);
        Object obj4 = c1533790q13.LIZ.LJFF.get("rl_container_uuid");
        if (obj4 != null) {
            String str6 = (String) obj4;
            C1529870puj.LIZ.getClass();
            InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str6);
            if ((interfaceC1541990qEHLJFF != null && (c1537480q70LJ = interfaceC1541990qEHLJFF.getHybridContext()) != null) || (c1537480q70LJ = C1529870puj.LJ(str6)) != null) {
                C828590Wev.LIZLLL(c828420Wee, "origin_url", C1520080pew.LIZIZ(c1537480q70LJ.LJIJI()));
            }
        }
        return c828420Wee;
    }
}
