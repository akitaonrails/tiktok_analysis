package X;

import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R68, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R68 {
    public static final C0R68 LIZ = new C0R68();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C299570Boh());

    public static int LIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final boolean LIZIZ(Aweme aweme, String str, Boolean bool) {
        ICommercePromoteService iCommercePromoteService;
        LIZ.getClass();
        if (LIZ() == 0) {
            return false;
        }
        if ((aweme != null && (AwemeExtKt.isCard(aweme) || AwemeBizExtKt.isReferralFakeAweme(aweme) || aweme.getAwemeType() == 4004 || aweme.getAwemeType() == 4000 || aweme.getAwemeType() == 4001 || aweme.getAwemeType() == 4002 || aweme.getAwemeType() == 4003)) || (C1EE1.LIZIZ.LJJIZ() && Intrinsics.LJFF(str, "offline_mode_page"))) {
            return false;
        }
        if ((aweme != null && AwemeExtKt.isScheduleVideo(aweme)) || C20286514Zj.LJFF(aweme) || (aweme != null && AwemeBizExtKt.isReferralFakeAweme(aweme))) {
            return false;
        }
        if ((!C729510SjV.LJJI(aweme) || !C1601110rld.LIZ()) && ((!C729510SjV.LJJIJIL(aweme) || aweme == null || !AwemeExtKt.isProhibited(aweme)) && !C1594680rbG.LJII(aweme) && !C1594680rbG.LJIIJ(aweme) && !C1594680rbG.LJI(aweme))) {
            C1387620mDI.LIZ.getClass();
            if (C1387620mDI.LJI(aweme) || (aweme != null && C1003680cE2.LIZLLL(aweme))) {
                return false;
            }
            if (C1594680rbG.LIZLLL(aweme) && (bool == null || !Intrinsics.LJFF(bool, Boolean.FALSE))) {
                return false;
            }
            if ((LIZ() == 2 && aweme != null && !aweme.isAd() && (iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null)) != null && !iCommercePromoteService.LJJI(aweme)) || LIZ() == 1) {
                return true;
            }
        }
        return false;
    }
}
