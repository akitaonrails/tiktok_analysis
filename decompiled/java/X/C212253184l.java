package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;

/* JADX INFO: renamed from: X.184l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212253184l extends C185J<FrameLayout, PromotionLabel> {
    public C212253184l(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public final void LJIIJ(PromotionLabel promotionLabel) {
        if (!PinCardRefactorSettings.LIZ().fansExclusiveEnable) {
            LJIIIZ(false);
            return;
        }
        if (promotionLabel != null) {
            ViewGroup viewGroup = (ViewGroup) this.LIZ;
            C212335187p c212335187p = C212335187p.LIZ;
            Context context = this.LIZJ;
            C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, null);
            c212335187p.getClass();
            viewGroup.addView(C212335187p.LIZIZ(context, c212337187rLIZ));
            LJIIIZ(true);
            return;
        }
        LJIIIZ(false);
    }
}
