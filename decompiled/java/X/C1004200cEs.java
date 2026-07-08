package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonTrigger;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004200cEs extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ QuickShareButtonTrigger LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004200cEs(QuickShareButtonTrigger quickShareButtonTrigger, VideoItemParams videoItemParams) {
        super(1);
        this.LL = quickShareButtonTrigger;
        this.LLILLJJLI = videoItemParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        LinearLayout.LayoutParams layoutParams;
        boolean z = true;
        ((QuickShareVM) this.LL.LLJLILLLLZIIL.getValue()).LLILZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryContention = true aid=");
        sbLIZ.append(this.LLILLJJLI.getAweme().getAid());
        sbLIZ.append(' ');
        sbLIZ.append(this.LL.LJJIJL());
        sbLIZ.append(' ');
        if (this.LL.LJJIJL().getVisibility() != 0) {
            z = false;
        }
        sbLIZ.append(z);
        C1720006oQ.LJ("QuickShareTrigger", C2188811AlT.LIZIZ(sbLIZ));
        C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
        String aid = this.LLILLJJLI.getAweme().getAid();
        c1004550cFR.getClass();
        if (!C1004550cFR.LIZIZ(aid)) {
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(this.LL.LJJIJL());
            if ((marginLayoutParamsLJI instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) marginLayoutParamsLJI) != null) {
                QuickShareButtonTrigger quickShareButtonTrigger = this.LL;
                layoutParams.bottomMargin = -((int) quickShareButtonTrigger.LJJIJL().getResources().getDimension(R.dimen.a2u));
                C786410Ut5.W5(quickShareButtonTrigger.LJJIJL(), marginLayoutParamsLJI);
            }
        }
        return Unit.LIZ;
    }
}
