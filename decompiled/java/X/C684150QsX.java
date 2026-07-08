package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS219S0300000_10;

/* JADX INFO: renamed from: X.0QsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684150QsX extends C09AY implements InterfaceC1631620sYq<Fragment, FeedbackMultipleChoice, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C683220Qr2 LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ SearchFeedbackOptionalFragment LLILZ;
    public final /* synthetic */ Function2<C683220Qr2, FeedbackMultipleChoice, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C684150QsX(boolean z, C683220Qr2 c683220Qr2, View view, SearchFeedbackOptionalFragment searchFeedbackOptionalFragment, Function2<? super C683220Qr2, ? super FeedbackMultipleChoice, Unit> function2) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = c683220Qr2;
        this.LLILLL = view;
        this.LLILZ = searchFeedbackOptionalFragment;
        this.LLILZIL = function2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, FeedbackMultipleChoice feedbackMultipleChoice, Integer num) {
        Map<String, String> map;
        FeedbackMultipleChoice feedbackMultipleChoice2 = feedbackMultipleChoice;
        int iIntValue = num.intValue();
        if (this.LL) {
            boolean z = C0Q9J.LIZ;
            C683220Qr2 c683220Qr2 = this.LLILLJJLI;
            C0Q3E.LJI();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c683220Qr2 != null && (map = c683220Qr2.LJ) != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("reason_rank", String.valueOf(iIntValue));
            linkedHashMap.put("click_reason", feedbackMultipleChoice2.getKey());
            C20684815ws.LJIILLIIL("search_result_feedback_submit", linkedHashMap);
            View view = this.LLILLL;
            SearchFeedbackOptionalFragment searchFeedbackOptionalFragment = this.LLILZ;
            C683220Qr2 c683220Qr22 = this.LLILLJJLI;
            C684120QsU.LJFF(view, searchFeedbackOptionalFragment, c683220Qr22, feedbackMultipleChoice2, null, new AwS219S0300000_10((Function2) this.LLILZIL, (Function2<? super C683220Qr2, ? super FeedbackMultipleChoice, Unit>) c683220Qr22, (C683220Qr2) feedbackMultipleChoice2, (FeedbackMultipleChoice) 4));
        } else {
            boolean z2 = C0Q9J.LIZ;
            View view2 = this.LLILLL;
            SearchFeedbackOptionalFragment searchFeedbackOptionalFragment2 = this.LLILZ;
            C683220Qr2 c683220Qr23 = this.LLILLJJLI;
            C684120QsU.LIZ(view2, searchFeedbackOptionalFragment2, c683220Qr23, feedbackMultipleChoice2, iIntValue, false, new AwS219S0300000_10((Function2) this.LLILZIL, (Function2<? super C683220Qr2, ? super FeedbackMultipleChoice, Unit>) c683220Qr23, (C683220Qr2) feedbackMultipleChoice2, (FeedbackMultipleChoice) 5));
        }
        return Unit.LIZ;
    }
}
