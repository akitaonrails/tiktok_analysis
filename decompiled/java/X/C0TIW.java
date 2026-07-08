package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0TIW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIW {
    public static final C0TIW LIZ = new C0TIW();

    public static void LIZ(long j, String str, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendResultEvent] isSuccess=");
        sbLIZ.append(z);
        sbLIZ.append(", timeInterval=");
        sbLIZ.append(j);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(str);
        C1022620cia.LIZ("AdFastScrollEvent", C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_success", str2);
        c2344009Gk.LIZLLL(j, "time_interval");
        if (C123100dR.LIZ(str)) {
            c2344009Gk.LJFF("error_code", str);
        }
        C20684815ws.LJIILLIIL("ad_fast_slow_sliding_result", c2344009Gk.LIZ);
    }
}
