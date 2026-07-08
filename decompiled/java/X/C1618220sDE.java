package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0sDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618220sDE {
    public static final C1618220sDE LIZ = new C1618220sDE();

    public static void LIZ(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("fail_reason", str2);
        LIZJ(c2344009Gk, str, "midroll_ads_blocked");
    }

    public static void LIZIZ(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("fail_reason", str2);
        LIZJ(c2344009Gk, str, "midroll_ads_request_failed");
    }

    public static void LIZJ(C2344009Gk c2344009Gk, String str, String str2) {
        String str3;
        if (C0N6Z.LIZJ(str)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_longvideo_reshow", str3);
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
    }
}
