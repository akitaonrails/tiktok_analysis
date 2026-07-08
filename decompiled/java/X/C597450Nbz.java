package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Nbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597450Nbz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PopupCardVO popupCardVO, Activity activity) {
        AnchorPinCardConfig anchorPinCardConfig;
        String str;
        if (activity != null && popupCardVO != null && (anchorPinCardConfig = popupCardVO.anchorPinCardConfig) != null && (str = anchorPinCardConfig.closeToastText) != null) {
            C597460Nc0.LIZ.getClass();
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (!C597460Nc0.LIZIZ.getBoolean("is_anchor_pin_card_close_toast_displayed", false)) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
                C597460Nc0.LIZ.getClass();
                try {
                    C597460Nc0.LIZIZ.storeBoolean("is_anchor_pin_card_close_toast_displayed", true);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
    }
}
