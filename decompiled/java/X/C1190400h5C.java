package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h5C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190400h5C extends FrameLayout {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final View LL;
    public final View LLILLJJLI;
    public final ViewGroup LLILLL;
    public final ViewGroup LLILZ;
    public final TuxTextView LLILZIL;
    public final C1203310hQ1 LLILZLL;
    public final TuxTextView LLIZ;
    public final C1189590h3t LLIZLLLIL;
    public boolean LLJ;
    public final View LLJI;
    public C1190440h5G LLJIJIL;

    public C1190400h5C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e81, this);
        this.LL = viewLJLLJ;
        View viewFindViewById = viewLJLLJ.findViewById(R.id.rb9);
        this.LLILLJJLI = viewFindViewById;
        viewLJLLJ.findViewById(R.id.r4z);
        this.LLILLL = (ViewGroup) viewLJLLJ.findViewById(R.id.raz);
        this.LLILZIL = (TuxTextView) viewLJLLJ.findViewById(R.id.rbi);
        this.LLILZLL = (C1203310hQ1) viewLJLLJ.findViewById(R.id.rba);
        this.LLIZ = (TuxTextView) viewLJLLJ.findViewById(R.id.rb8);
        this.LLIZLLLIL = (C1189590h3t) viewLJLLJ.findViewById(R.id.cik);
        this.LLILZ = (ViewGroup) viewLJLLJ.findViewById(R.id.xtb);
        this.LLJI = viewLJLLJ.findViewById(R.id.xvx);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    public final void LIZ(boolean z, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, String str) {
        C1190440h5G c1190440h5G;
        C1190440h5G c1190440h5G2;
        long jLongValue;
        int value;
        if (poiReviewSummaryModel != null) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            C1190440h5G c1190440h5G3 = this.LLJIJIL;
            if (c1190440h5G3 == null) {
                c1190440h5G = null;
            } else {
                c1190440h5G = c1190440h5G3;
            }
            c1190440h5G.getClass();
            if (c1190440h5G3 == null) {
                c1190440h5G2 = null;
            } else {
                c1190440h5G2 = c1190440h5G3;
            }
            String str2 = c1190440h5G2.LIZ;
            if (c1190440h5G3 == null) {
                c1190440h5G3 = null;
            }
            String str3 = c1190440h5G3.LIZLLL;
            Double d = poiReviewSummaryModel.score;
            Long l = poiReviewSummaryModel.totalCount;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Integer num = poiReviewSummaryModel.source;
            if (num != null) {
                value = num.intValue();
            } else {
                value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(this, null);
            PageFinder pageFinderVia = PageFinder.via((View) this);
            c1191160h6Q.getClass();
            C1191160h6Q.LJJIIZI("poi_reviews", str2, str3, d, jLongValue, value, z, str, interfaceC665370Q7zLJ, pageFinderVia);
        }
    }
}
