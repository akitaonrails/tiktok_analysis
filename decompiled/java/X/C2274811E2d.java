package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.ECLiveAnimDowngradeScoreModel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.ECLiveAnimDowngradeSetting;

/* JADX INFO: renamed from: X.1E2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274811E2d {
    public static boolean LIZ() {
        Float f;
        if (!C2274801E2c.LIZ().pinCardAnimDowngrade) {
            if (!((ECLiveAnimDowngradeSetting) C2274801E2c.LIZIZ.getValue()).pinCardAnimDowngrade || (f = ((ECLiveAnimDowngradeScoreModel) C2274821E2e.LIZIZ.getValue()).pinCardAnimDowngradeScore) == null) {
                return false;
            }
            if (C1972307o1.LIZ() > f.floatValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ() {
        Float f;
        if (!C2274801E2c.LIZ().shopBagIconAnimDowngrade) {
            if (!((ECLiveAnimDowngradeSetting) C2274801E2c.LIZIZ.getValue()).shopBagIconAnimDowngrade || (f = ((ECLiveAnimDowngradeScoreModel) C2274821E2e.LIZIZ.getValue()).shopBagIconAnimDowngradeScore) == null) {
                return false;
            }
            if (C1972307o1.LIZ() > f.floatValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZJ() {
        Float f;
        if (!C2274801E2c.LIZ().shopBagPopupAnimDowngrade) {
            if (!((ECLiveAnimDowngradeSetting) C2274801E2c.LIZIZ.getValue()).shopBagPopupAnimDowngrade || (f = ((ECLiveAnimDowngradeScoreModel) C2274821E2e.LIZIZ.getValue()).shopBagPopupAnimDowngradeScore) == null) {
                return false;
            }
            if (C1972307o1.LIZ() > f.floatValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZLLL() {
        Float f;
        if (!C2274801E2c.LIZ().shortTouchPreviewAnimDowngrade) {
            if (!((ECLiveAnimDowngradeSetting) C2274801E2c.LIZIZ.getValue()).shortTouchPreviewAnimDowngrade || (f = ((ECLiveAnimDowngradeScoreModel) C2274821E2e.LIZIZ.getValue()).shortTouchPreviewAnimDowngradeScore) == null) {
                return false;
            }
            if (C1972307o1.LIZ() > f.floatValue()) {
                return false;
            }
        }
        return true;
    }
}
