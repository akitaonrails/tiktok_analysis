package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;

/* JADX INFO: renamed from: X.0Pu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C659610Pu3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnhancedProduct.Style.values().length];
        try {
            iArr[EnhancedProduct.Style.STYLE_WEAK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnhancedProduct.Style.STYLE_ANCHOR_SMALL_PRODUCT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnhancedProduct.Style.STYLE_ANCHOR_PROMOTION_TITLE_WITH_PLAY_ANIMATION.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnhancedProduct.Style.STYLE_STRONG.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnhancedProduct.Style.STYLE_STRONG_V2.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
