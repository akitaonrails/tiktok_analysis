package Y;

import X.C036E;
import X.C0PM7;
import X.C0Q3E;
import X.C1200530hLX;
import X.C1233040iBy;
import X.C1ER1;
import X.C656420Pou;
import X.C682980Qqe;
import X.C684150QsX;
import X.C688480QzW;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.commercialize.ProductCard;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS169S0400000_10;

/* JADX INFO: loaded from: classes11.dex */
public class ACListenerS43S0201000_10 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS43S0201000_10 aCListenerS43S0201000_10, View view) {
        ((C682980Qqe) aCListenerS43S0201000_10.l0).LL.n3(aCListenerS43S0201000_10.i2, (ProductCard) aCListenerS43S0201000_10.l1);
    }

    public static final void onClick$1(ACListenerS43S0201000_10 aCListenerS43S0201000_10, View view) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                C656420Pou c656420Pou = (C656420Pou) aCListenerS43S0201000_10.l0;
                c656420Pou.LLILZLL.LJFF(aCListenerS43S0201000_10.i2, view, (Aweme) aCListenerS43S0201000_10.l1, c656420Pou.LLJILJILJ, false);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(((C656420Pou) aCListenerS43S0201000_10.l0).LLILZ);
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
    }

    public static final void onClick$2(ACListenerS43S0201000_10 aCListenerS43S0201000_10, View view) {
        if (aCListenerS43S0201000_10.i2 == ((ArrayList) ((SearchFeedbackOptionalFragment) aCListenerS43S0201000_10.l0).LLJILLL).size() - 1) {
            AwS169S0400000_10 awS169S0400000_10 = ((SearchFeedbackOptionalFragment) aCListenerS43S0201000_10.l0).LLJJI;
            if (awS169S0400000_10 != null) {
                awS169S0400000_10.invoke((FeedbackMultipleChoice) aCListenerS43S0201000_10.l1, Integer.valueOf(aCListenerS43S0201000_10.i2));
                return;
            }
            return;
        }
        SearchFeedbackOptionalFragment searchFeedbackOptionalFragment = (SearchFeedbackOptionalFragment) aCListenerS43S0201000_10.l0;
        C684150QsX c684150QsX = searchFeedbackOptionalFragment.LLJJ;
        if (c684150QsX == null) {
            return;
        }
        c684150QsX.invoke(searchFeedbackOptionalFragment, (FeedbackMultipleChoice) aCListenerS43S0201000_10.l1, Integer.valueOf(aCListenerS43S0201000_10.i2));
    }

    public static final void onClick$3(ACListenerS43S0201000_10 aCListenerS43S0201000_10, View view) {
        if (aCListenerS43S0201000_10.i2 == ((ArrayList) ((SearchFeedbackOptionalFragment) aCListenerS43S0201000_10.l0).LLJILLL).size() - 1) {
            AwS169S0400000_10 awS169S0400000_10 = ((SearchFeedbackOptionalFragment) aCListenerS43S0201000_10.l0).LLJJI;
            if (awS169S0400000_10 != null) {
                awS169S0400000_10.invoke((FeedbackMultipleChoice) aCListenerS43S0201000_10.l1, Integer.valueOf(aCListenerS43S0201000_10.i2));
                return;
            }
            return;
        }
        SearchFeedbackOptionalFragment searchFeedbackOptionalFragment = (SearchFeedbackOptionalFragment) aCListenerS43S0201000_10.l0;
        C684150QsX c684150QsX = searchFeedbackOptionalFragment.LLJJ;
        if (c684150QsX == null) {
            return;
        }
        c684150QsX.invoke(searchFeedbackOptionalFragment, (FeedbackMultipleChoice) aCListenerS43S0201000_10.l1, Integer.valueOf(aCListenerS43S0201000_10.i2));
    }

    public static final void onClick$4(ACListenerS43S0201000_10 aCListenerS43S0201000_10, View view) {
        Context context;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Aweme aweme = ((VideoItemParams) aCListenerS43S0201000_10.l0).getAweme();
        String str = ((VideoItemParams) aCListenerS43S0201000_10.l0).mEventType;
        FeedSearchBottomBarAssemV2 feedSearchBottomBarAssemV2 = (FeedSearchBottomBarAssemV2) aCListenerS43S0201000_10.l1;
        C688480QzW c688480QzW = feedSearchBottomBarAssemV2.LLLILZJ;
        String str2 = c688480QzW.LIZIZ;
        String str3 = c688480QzW.LIZ;
        String str4 = feedSearchBottomBarAssemV2.LLL;
        String strValueOf = String.valueOf(aCListenerS43S0201000_10.i2);
        String groupId = ((VideoItemParams) aCListenerS43S0201000_10.l0).getAweme().getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        String str5 = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILLL;
        C688480QzW c688480QzW2 = ((FeedSearchBottomBarAssemV2) aCListenerS43S0201000_10.l1).LLLILZJ;
        PromotionInfo promotionInfo = c688480QzW2.LIZLLL;
        String str6 = c688480QzW2.LJFF;
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688480QzW2.LIZ()));
        if (strLIZLLL == null) {
            strLIZLLL = CardStruct.IStatusCode.DEFAULT;
        }
        c1er1.LLLLIL(aweme, str, str2, str3, str4, CardStruct.IStatusCode.DEFAULT, strValueOf, groupId, str5, promotionInfo, str6, strLIZLLL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "related_search_anchor_v2");
        FeedSearchBottomBarAssemV2 feedSearchBottomBarAssemV22 = (FeedSearchBottomBarAssemV2) aCListenerS43S0201000_10.l1;
        Bundle bundleFp = FeedSearchBottomBarAssemV2.Fp((VideoItemParams) aCListenerS43S0201000_10.l0, feedSearchBottomBarAssemV22.LLLILZJ);
        ConstraintLayout constraintLayout = feedSearchBottomBarAssemV22.LLJLLIL;
        if (constraintLayout != null) {
            context = constraintLayout.getContext();
        } else {
            context = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//search");
        smartRouteBuildRoute.withParam(bundleFp);
        smartRouteBuildRoute.open();
        ((VideoItemParams) aCListenerS43S0201000_10.l0).getAweme().getAid();
    }

    public ACListenerS43S0201000_10(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
