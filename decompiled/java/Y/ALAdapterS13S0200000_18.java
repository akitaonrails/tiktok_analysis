package Y;

import X.C118300cf;
import X.C1196900hFg;
import X.C13LP;
import X.C2188811AlT;
import X.C339190DRl;
import X.C786410Ut5;
import X.InterfaceC1191710h7J;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.poi.PoiAnchorCardCarouselLabel;
import com.ss.android.ugc.aweme.poi.PoiAnchorCardSecondLineCarousel;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ALAdapterS13S0200000_18 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS13S0200000_18 aLAdapterS13S0200000_18, Animator animator) {
        String strLJJLIIIJ;
        List<PoiAnchorCardCarouselLabel> list = ((PoiAnchorCardSecondLineCarousel) aLAdapterS13S0200000_18.l0).labels;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, "", null, null, 0, null, AFwS256S0000000_18.get$arr$(852), 30)) == null) {
            strLJJLIIIJ = "";
        }
        if (strLJJLIIIJ.length() > 0 && !((ArrayList) ((C1196900hFg) aLAdapterS13S0200000_18.l1).LLL).contains(strLJJLIIIJ)) {
            ((ArrayList) ((C1196900hFg) aLAdapterS13S0200000_18.l1).LLL).add(strLJJLIIIJ);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS13S0200000_18 aLAdapterS13S0200000_18, Animator animator) {
        super.onAnimationEnd(animator);
        C118300cf c118300cf = (C118300cf) aLAdapterS13S0200000_18.l0;
        int i = c118300cf.element + 1;
        c118300cf.element = i;
        if (i >= ((PoiRecommendDishesGalleryAssem) aLAdapterS13S0200000_18.l1).op().size()) {
            View view = ((PoiRecommendDishesGalleryAssem) aLAdapterS13S0200000_18.l1).LLJZIJLIL;
            if (view != null) {
                C339190DRl.LIZIZ(view);
            }
            View view2 = ((PoiRecommendDishesGalleryAssem) aLAdapterS13S0200000_18.l1).LLJZIJLIL;
            if (view2 != null) {
                C786410Ut5.ed(view2, 0.0f);
            }
            View view3 = ((PoiRecommendDishesGalleryAssem) aLAdapterS13S0200000_18.l1).LLJZIJLIL;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
            for (View view4 : ((PoiRecommendDishesGalleryAssem) aLAdapterS13S0200000_18.l1).op()) {
                if (view4 != null) {
                    C786410Ut5.ed(view4, 0.0f);
                }
            }
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS13S0200000_18 aLAdapterS13S0200000_18, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stage_reviews_cell: bgcolor highlight disappear end pos: ");
        sbLIZ.append(((PoiReviewsListItemCell) aLAdapterS13S0200000_18.l0).getBindingAdapterPosition());
        sbLIZ.append(" review_id: ");
        sbLIZ.append(((PoiReviewsApi.PoiReviewModel) aLAdapterS13S0200000_18.l1).getReviewId());
        sbLIZ.append(" viewId: ");
        sbLIZ.append(((PoiReviewsListItemCell) aLAdapterS13S0200000_18.l0).itemView.hashCode());
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        ((PoiReviewsListItemCell) aLAdapterS13S0200000_18.l0).T5().Q80((PoiReviewsApi.PoiReviewModel) aLAdapterS13S0200000_18.l1);
    }

    public static final void onAnimationEnd$3(ALAdapterS13S0200000_18 aLAdapterS13S0200000_18, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stage_reviews_cell: bgcolor highlight disappear end pos: ");
        sbLIZ.append(((RefactorTTReviewCell) aLAdapterS13S0200000_18.l0).getBindingAdapterPosition());
        sbLIZ.append(" review_id: ");
        sbLIZ.append(((PoiReviewsApi.PoiReviewModel) aLAdapterS13S0200000_18.l1).getReviewId());
        sbLIZ.append(" viewId: ");
        sbLIZ.append(((RefactorTTReviewCell) aLAdapterS13S0200000_18.l0).itemView.hashCode());
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1191710h7J interfaceC1191710h7J = ((RefactorTTReviewCell) aLAdapterS13S0200000_18.l0).LLILZLL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.Q80((PoiReviewsApi.PoiReviewModel) aLAdapterS13S0200000_18.l1);
        }
    }

    public ALAdapterS13S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
