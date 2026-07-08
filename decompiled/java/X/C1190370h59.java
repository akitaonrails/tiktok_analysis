package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190370h59 extends FrameLayout {
    public final C427500GpY LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public EnumC1189990h4X LLILZ;
    public PoiReviewsListViewModel LLILZIL;

    public final EnumC1189990h4X getCurrScene() {
        return this.LLILZ;
    }

    public final PoiReviewsListViewModel getVm() {
        return this.LLILZIL;
    }

    public C1190370h59(Context context) {
        super(context);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e7d, this, true);
        this.LL = (C427500GpY) findViewById(R.id.m48);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.m4l);
        this.LLILLL = (TuxTextView) findViewById(R.id.m4d);
        findViewById(R.id.m4c);
    }

    public final void setCurrScene(EnumC1189990h4X enumC1189990h4X) {
        this.LLILZ = enumC1189990h4X;
    }

    public final void setVm(PoiReviewsListViewModel poiReviewsListViewModel) {
        this.LLILZIL = poiReviewsListViewModel;
    }
}
