package Y;

import X.C12AK;
import X.C12AN;
import X.C12AO;
import X.C1662060tLw;
import X.C197039127h;
import X.C197106129w;
import X.C197109129z;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;

/* JADX INFO: loaded from: classes30.dex */
public class ACListenerS26S0301000_29 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS26S0301000_29 aCListenerS26S0301000_29, View view) {
        String str;
        EffectStructV2 effectStructV2;
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = ((C12AK) aCListenerS26S0301000_29.l0).LL;
        if (effectRecommendationCardViewModel != null) {
            Integer numValueOf = Integer.valueOf(aCListenerS26S0301000_29.i3);
            CardContent cardContent = (CardContent) aCListenerS26S0301000_29.l1;
            if (cardContent != null && (effectStructV2 = cardContent.effect) != null) {
                str = effectStructV2.effectId;
            } else {
                str = null;
            }
            effectRecommendationCardViewModel.vQ2(new C12AO(((CardView) aCListenerS26S0301000_29.l2).getContext(), str, numValueOf));
        }
    }

    public static final void onClick$1(ACListenerS26S0301000_29 aCListenerS26S0301000_29, View view) {
        String str;
        EffectStructV2 effectStructV2;
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = ((C12AK) aCListenerS26S0301000_29.l0).LL;
        if (effectRecommendationCardViewModel != null) {
            Integer numValueOf = Integer.valueOf(aCListenerS26S0301000_29.i3);
            CardContent cardContent = (CardContent) aCListenerS26S0301000_29.l1;
            if (cardContent != null && (effectStructV2 = cardContent.effect) != null) {
                str = effectStructV2.effectId;
            } else {
                str = null;
            }
            effectRecommendationCardViewModel.vQ2(new C12AN(((CardView) aCListenerS26S0301000_29.l2).getContext(), str, numValueOf));
        }
    }

    public static final void onClick$2(ACListenerS26S0301000_29 aCListenerS26S0301000_29, View view) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel;
        String str;
        EffectStructV2 effectStructV2;
        if (!C1662060tLw.LIZIZ(view) && (effectRecommendationCarouselViewModel = ((C197109129z) aCListenerS26S0301000_29.l0).LLLLIILL) != null) {
            Integer numValueOf = Integer.valueOf(aCListenerS26S0301000_29.i3);
            CardContent cardContent = (CardContent) aCListenerS26S0301000_29.l1;
            if (cardContent != null && (effectStructV2 = cardContent.effect) != null) {
                str = effectStructV2.effectId;
            } else {
                str = null;
            }
            effectRecommendationCarouselViewModel.vQ2(new C197106129w(((C197039127h) aCListenerS26S0301000_29.l2).getContext(), str, numValueOf));
        }
    }

    public ACListenerS26S0301000_29(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
