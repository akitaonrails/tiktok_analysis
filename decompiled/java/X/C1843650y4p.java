package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0y4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843650y4p {
    public static final C1843650y4p LIZ = new C1843650y4p();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3067));

    public static void LIZIZ() {
        C1022620cia.LIZ("FeatureUploadEvent", "[reportStartFetch]");
        AnonymousClass1455.LIZ.getClass();
        boolean zLJII = AnonymousClass1455.LJII();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "start_fetch");
        c2344009Gk.LIZJ(zLJII ? 1 : 0, "pitaya_is_ready");
        C20684815ws.LJIILLIIL("tt_ad_feature_upload", c2344009Gk.LIZ);
    }

    public static void LIZ(long j, String str, boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportFetchSuccess] duration=");
        sbLIZ.append(j);
        sbLIZ.append(", isEmpty=");
        sbLIZ.append(z);
        C1022620cia.LIZ("FeatureUploadEvent", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "fetch_success");
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(i, "is_empty");
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            c2344009Gk.LJFF("content", str);
        }
        C20684815ws.LJIILLIIL("tt_ad_feature_upload", c2344009Gk.LIZ);
    }
}
