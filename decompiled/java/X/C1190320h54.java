package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190320h54 extends FrameLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;
    public PoiReviewsListViewModel LLILZIL;

    public final PoiReviewsListViewModel getVm() {
        return this.LLILZIL;
    }

    public C1190320h54(Context context) {
        super(context);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e7e, this, true);
        this.LL = (TuxIconView) findViewById(R.id.m4e);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.m4l);
        this.LLILLL = (TuxTextView) findViewById(R.id.m4d);
        this.LLILZ = (LinearLayout) findViewById(R.id.m4c);
    }

    public final void setVm(PoiReviewsListViewModel poiReviewsListViewModel) {
        this.LLILZIL = poiReviewsListViewModel;
    }
}
