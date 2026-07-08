package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0Ydh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878790Ydh {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        return Keva.getRepo(LIZIZ());
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("im_message_request_keva");
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ() {
        boolean z = LIZ().getBoolean("show_message_request_unread_red_dot", true);
        LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getShow - ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public static void LIZLLL(long j) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLastConsumedMRTime - ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        kevaLIZ.storeLong("mr_consume_time", j);
    }

    public static void LJ(boolean z) {
        Keva kevaLIZ = LIZ();
        LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeShow - ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        kevaLIZ.storeBoolean("show_message_request_unread_red_dot", z);
    }
}
