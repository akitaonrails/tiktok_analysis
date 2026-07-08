package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BannerStyle;

/* JADX INFO: renamed from: X.03Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C800603Au {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[BannerStyle.values().length];
        try {
            iArr[BannerStyle.BANNER_STYLE_DISCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[BannerStyle.BANNER_STYLE_FREE_SHIPPING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[BannerStyle.BANNER_STYLE_DISCOUNTS_WITH_FREE_SHIPPING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[BannerStyle.BANNER_STYLE_OVERSEAS_SHIPPING.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
