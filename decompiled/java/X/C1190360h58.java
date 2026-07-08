package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190360h58 extends FrameLayout {
    public final View LL;
    public final LinearLayout LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TuxIconView LLILZ;
    public final View LLILZIL;
    public final int LLILZLL;
    public EnumC1189990h4X LLIZ;
    public PoiReviewsListViewModel LLIZLLLIL;
    public PoiReviewsLandingViewModel LLJ;
    public int LLJI;

    public final PoiReviewsLandingViewModel getContentVM() {
        return this.LLJ;
    }

    public final EnumC1189990h4X getCurrScene() {
        return this.LLIZ;
    }

    public final int getSelectedSorting() {
        return this.LLJI;
    }

    public final PoiReviewsListViewModel getVm() {
        return this.LLIZLLLIL;
    }

    public final void setContentVM(PoiReviewsLandingViewModel poiReviewsLandingViewModel) {
        this.LLJ = poiReviewsLandingViewModel;
    }

    public final void setCurrScene(EnumC1189990h4X enumC1189990h4X) {
        this.LLIZ = enumC1189990h4X;
    }

    public final void setSelectedSorting(int i) {
        this.LLJI = i;
    }

    public final void setVm(PoiReviewsListViewModel poiReviewsListViewModel) {
        this.LLIZLLLIL = poiReviewsListViewModel;
    }

    public C1190360h58(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e7f, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (LinearLayout) viewLJLLJ.findViewById(R.id.ycq);
        this.LLILLL = (LinearLayout) viewLJLLJ.findViewById(R.id.cgh);
        this.LLILZ = (TuxIconView) viewLJLLJ.findViewById(R.id.rb2);
        this.LLILZIL = viewLJLLJ.findViewById(R.id.rb0);
    }
}
