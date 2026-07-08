package X;

import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188600h2I {
    public final View LIZ;
    public final SmartImageView LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final TuxTextView LJ;
    public final View LJFF;
    public final TuxIconView LJI;
    public final TuxTextView LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final TuxTextView LJIIJ;
    public final C1849470yED LJIIJJI;

    public C1188600h2I(View view) {
        this.LIZ = view;
        this.LIZIZ = (SmartImageView) view.findViewById(R.id.jhu);
        this.LIZJ = view.findViewById(R.id.jhw);
        this.LIZLLL = view.findViewById(R.id.jhx);
        this.LJ = (TuxTextView) view.findViewById(R.id.r53);
        View viewFindViewById = view.findViewById(R.id.r9h);
        this.LJFF = viewFindViewById;
        this.LJI = (TuxIconView) view.findViewById(R.id.r9j);
        this.LJII = (TuxTextView) view.findViewById(R.id.r9i);
        View viewFindViewById2 = view.findViewById(R.id.r9g);
        this.LJIIIIZZ = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.rdi);
        this.LJIIIZ = viewFindViewById3;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.qzg);
        this.LJIIJ = tuxTextView;
        this.LJIIJJI = new C1849470yED(tuxTextView, viewFindViewById2, viewFindViewById3, viewFindViewById, view.findViewById(R.id.e6f), null);
    }

    public final void LIZ(C1188610h2J c1188610h2J) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = c1188610h2J.LIZJ;
        if (c1188610h2J.LJI == 3 && poiReviewSummaryModel != null && poiReviewSummaryModel.score != null && !Intrinsics.LJFF(poiReviewSummaryModel.noRating, Boolean.TRUE)) {
            C337180DJs.LIZJ(this.LJFF);
            C337180DJs.LIZJ(this.LJI);
            this.LJII.setText(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{poiReviewSummaryModel.score}, 1)));
            return;
        }
        C337180DJs.LIZ(this.LJFF);
    }

    public final void LIZIZ(boolean z) {
        int i;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.LIZ.getContext(), R.style.y0);
        if (z) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1k;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, contextThemeWrapper);
        if (numLIZJ != null) {
            this.LJII.setTextColor(numLIZJ.intValue());
        }
    }
}
