package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0685, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0685 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z) {
        String str;
        C0I0B.LJFF.LIZIZ();
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationAnalytics graduation_notification_click isLearnMoreBtn = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", "notification_page");
        if (z) {
            str = "learn_more";
        } else {
            str = "manage_now";
        }
        pairArr[1] = new Pair("button", str);
        C20684815ws.LJIILLIIL("graduation_notification_click", C2097608Jq.LJIIJ(pairArr));
    }
}
