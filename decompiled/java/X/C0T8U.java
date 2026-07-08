package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0T8U, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8U extends FrameLayout {
    public final View LL;
    public final LinearLayout LLILLJJLI;
    public final int LLILLL;
    public PoiReviewsListViewModel LLILZ;

    public final PoiReviewsListViewModel getVm() {
        return this.LLILZ;
    }

    public final void setVm(PoiReviewsListViewModel poiReviewsListViewModel) {
        this.LLILZ = poiReviewsListViewModel;
    }

    public C0T8U(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e7g, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (LinearLayout) viewLJLLJ.findViewById(R.id.ycq);
    }
}
