package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0lT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358930lT1 {
    public static final C1358930lT1 LIZ = new C1358930lT1();

    public static boolean LIZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null) {
            return false;
        }
        if (C298760BnO.LIZ()) {
            if (!C1359600lU6.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(", isAllowedAweme, avoidBy cannot_create_repost");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        } else if (C1359600lU6.LIZJ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(aweme.getAid());
            sbLIZ2.append(", isAllowedAweme, avoidBy cannot_consume_repost");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (!C1358940lT2.LJIIIIZZ(aweme)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(aweme.getAid());
            sbLIZ3.append(", isAllowedAweme, avoidBy no_permission");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        if (C729510SjV.LJJIJIL(aweme)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(aweme.getAid());
            sbLIZ4.append(", isAllowedAweme, avoidBy is_story");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ4));
            return false;
        }
        if ((AwemeExtKt.isAdTraffic(aweme) && !((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIL(aweme)) || ((commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isDiversionAd())) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(aweme.getAid());
            sbLIZ5.append(", isAllowedAweme, avoidBy is_ad");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ5));
            return false;
        }
        if (C729980SkG.LJIIIIZZ(aweme) && !C429520Gso.LIZ() && !C263730AVf.LIZ()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(aweme.getAid());
            sbLIZ6.append(", isAllowedAweme, avoidBy is_mine");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ6));
            return false;
        }
        if (C0OAD.LIZIZ(aweme)) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(aweme.getAid());
            sbLIZ7.append(", isAllowedAweme, avoidBy is_ftc_take_down");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ7));
            return false;
        }
        if (aweme.isCanPlay() && !AwemeExtKt.isDelete(aweme)) {
            if (!C729980SkG.LJIIIIZZ(aweme)) {
                C735280Sso.LIZ.getClass();
                if (C735280Sso.LJFF(aweme)) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(aweme.getAid());
                    sbLIZ8.append(", isAllowedAweme, avoidBy is_private");
                    C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ8));
                    return false;
                }
            }
            if (aweme.isSubOnlyVideo()) {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append(aweme.getAid());
                sbLIZ9.append(", isAllowedAweme, avoidBy is_sub_video");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ9));
                return false;
            }
            if (!C729980SkG.LJIIIIZZ(aweme)) {
                C735280Sso.LIZ.getClass();
                if (C735280Sso.LIZJ(aweme) && !C735280Sso.LIZLLL(aweme)) {
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append(aweme.getAid());
                    sbLIZ10.append(", isAllowedAweme, avoidBy not_friend");
                    C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ10));
                    return false;
                }
            }
            if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append(aweme.getAid());
                sbLIZ11.append(", isAllowedAweme, avoidBy video_end");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ11));
                return false;
            }
            if (C1017070cZd.LJLJLLL(aweme)) {
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append(aweme.getAid());
                sbLIZ12.append(", isAllowedAweme, avoidBy dynamic_ad");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ12));
                return false;
            }
            if (AwemeExtKt.isProhibited(aweme)) {
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append(aweme.getAid());
                sbLIZ13.append(", isAllowedAweme, avoidBy is_prohibited");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ13));
                return false;
            }
            if (C1017070cZd.LJJLIL(aweme)) {
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append(aweme.getAid());
                sbLIZ14.append(", isAllowedAweme, avoidBy is_Adx");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ14));
                return false;
            }
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append(aweme.getAid());
            sbLIZ15.append(", isAllowedAweme: true");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ15));
            return true;
        }
        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
        sbLIZ16.append(aweme.getAid());
        sbLIZ16.append(", isAllowedAweme, avoidBy cannot_play_or_delete");
        C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ16));
        return false;
    }
}
