package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18N9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18N9 {
    public static boolean LIZ(Aweme aweme) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        List listLJJZZI;
        Integer num;
        EcommerceInfo ecommerceInfo;
        boolean z2;
        if (aweme != null && aweme.isAd()) {
            if (((Number) C292960Be2.LIZ.getValue()).intValue() != 1) {
                return false;
            }
        } else if (((Number) C292970Be3.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        String name = null;
        if (aweme != null) {
            C1735020vFc.LIZ.getClass();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            if (!Intrinsics.LJFF(authorUid, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && ecommerceInfo.reviewsTabAnchor != null) {
                    z = true;
                } else {
                    z = false;
                }
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if ((anchors != null && anchors.size() == 1) || z) {
                    if (aweme.isAd() && z) {
                        AnchorBizUtils.LIZ.getClass();
                        listLJJZZI = AnchorBizUtils.LJJZ(aweme);
                    } else {
                        AnchorBizUtils.LIZ.getClass();
                        listLJJZZI = AnchorBizUtils.LJJZZI(aweme);
                    }
                    if (listLJJZZI != null && listLJJZZI.size() == 1 && (num = ((AnchorProductInfo) ListProtector.get(listLJJZZI, 0)).reviewNum) != null && num.intValue() > 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
