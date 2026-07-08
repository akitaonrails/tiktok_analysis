package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionDetail;
import com.ss.android.ugc.aweme.model.VipSubscriptionStatus;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;

/* JADX INFO: renamed from: X.0s7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614640s7S {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJ(VipSubscriptionStatus vipSubscriptionStatus) {
        if (vipSubscriptionStatus != null) {
            int i = C1614650s7T.LIZ[vipSubscriptionStatus.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "unsubscribed";
                        }
                        return null;
                    }
                    return "expired";
                }
                return "cancelled";
            }
            return "subscribed";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8 A[PHI: r20
      0x00a8: PHI (r20v1 java.lang.String) = (r20v0 java.lang.String), (r20v3 java.lang.String) binds: [B:58:0x00a5, B:55:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r32, java.lang.String r33, java.util.List r34) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1614640s7S.LIZLLL(java.lang.String, java.lang.String, java.util.List):void");
    }

    public static void LIZIZ(String str, VipSubscriptionDetail vipSubscriptionDetail, String str2, Long l, Integer num) {
        VipSubscriptionStatus vipSubscriptionStatus;
        String cycleString = null;
        if (vipSubscriptionDetail != null) {
            vipSubscriptionStatus = vipSubscriptionDetail.status;
        } else {
            vipSubscriptionStatus = null;
        }
        String strLJ = LJ(vipSubscriptionStatus);
        if (vipSubscriptionDetail != null && vipSubscriptionDetail.status != VipSubscriptionStatus.SUBSCRIPTION_STATUS_EMPTY) {
            cycleString = vipSubscriptionDetail.cycle.toCycleString();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("subscribe_status", strLJ);
        c2344009Gk.LJFF("subscribed_type", cycleString);
        c2344009Gk.LJFF("click_position", str2);
        if (l != null) {
            c2344009Gk.LIZLLL(l.longValue(), "collection_id");
        }
        if (num != null) {
            c2344009Gk.LJFF("collection_position", String.valueOf(num.intValue()));
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("drama_subscription_page_click", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8 A[PHI: r45
      0x00a8: PHI (r45v1 java.lang.String) = (r45v0 java.lang.String), (r45v3 java.lang.String) binds: [B:58:0x00a5, B:55:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(boolean r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.util.List r68, X.C1155930gBb r69) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1614640s7S.LIZJ(boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.0gBb):void");
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, int i) {
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("stage", str);
        c2344009Gk.LJFF("result", str2);
        c2344009Gk.LJFF("entry_point", str3);
        if (str4.length() > 0) {
            c2344009Gk.LJFF("product_id", str4);
        }
        if (str5.length() > 0) {
            c2344009Gk.LJFF("base_plan_id", str5);
        }
        if (str6.length() > 0) {
            c2344009Gk.LJFF("offer_id", str6);
        }
        if (str7 != null && str7.length() > 0) {
            c2344009Gk.LJFF("failure_reason", str7);
        }
        if (num != null) {
            c2344009Gk.LJFF("product_count", String.valueOf(num.intValue()));
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("client_series_subscription_marketplace", c2344009Gk.LIZ);
        }
    }
}
