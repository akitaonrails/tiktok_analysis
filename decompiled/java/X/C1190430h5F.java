package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS38S1400000_18;
import kotlin.jvm.internal.AwS57S1300000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190430h5F extends FrameLayout {
    public final View LL;
    public final C1203280hPy LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1189590h3t LLILZ;
    public boolean LLILZIL;

    public C1190430h5F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public C1190430h5F(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e7q, this);
        this.LL = viewLJLLJ;
        this.LLILZ = (C1189590h3t) viewLJLLJ.findViewById(R.id.cik);
        C1203280hPy c1203280hPy = (C1203280hPy) viewLJLLJ.findViewById(R.id.rba);
        this.LLILLJJLI = c1203280hPy;
        c1203280hPy.setActiveColorInt(ColorProtector.parseColor("#ED742E"));
        this.LLILLL = (TuxTextView) viewLJLLJ.findViewById(R.id.rbi);
    }

    public final void LIZ(final PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, final String str, final InterfaceC1190700h5g interfaceC1190700h5g, final C1190440h5G c1190440h5G, final PoiReviewsApi.PoiReviewDisclaimer poiReviewDisclaimer, final UrlModel urlModel, final String str2, final PageFinder pageFinder) {
        String strK4;
        float fFloatValue;
        String str3;
        Float fLJIIIIZZ;
        Double d = poiReviewSummaryModel.score;
        InterfaceC665370Q7z interfaceC665370Q7zLJI = null;
        if (d != null) {
            strK4 = C786410Ut5.k4(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d.doubleValue())}, 1));
        } else {
            strK4 = null;
        }
        this.LLILZ.LIZIZ(C1190820h5s.LIZIZ(poiReviewSummaryModel, getContext()), poiReviewSummaryModel.brandName);
        C1189590h3t c1189590h3t = this.LLILZ;
        c1189590h3t.LLILLL.setTuxFont(72);
        C1189060h32.LJJII(c1189590h3t.LLILLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null);
        c1189590h3t.LLILLL.setTextColorRes(R.attr.a1h);
        C1203280hPy c1203280hPy = this.LLILLJJLI;
        if (strK4 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(strK4)) != null) {
            fFloatValue = fLJIIIIZZ.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        c1203280hPy.setValue(fFloatValue);
        TuxTextView tuxTextView = this.LLILLL;
        if (strK4 != null) {
            str3 = strK4;
        } else {
            str3 = "";
        }
        tuxTextView.setText(str3);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.getContext());
        if (c19egLIZIZ != null) {
            interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZIZ, null);
        }
        final String str4 = strK4;
        final InterfaceC665370Q7z interfaceC665370Q7z = interfaceC665370Q7zLJI;
        C2211631BhB.LJ(this.LL, new AwS57S1300000_18(this, str4, interfaceC665370Q7z, pageFinder, 12));
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0h5E
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                Map mapLJIIZILJ;
                Object c098200Yq;
                if (view != null) {
                    C1190430h5F c1190430h5F = this.LLILZ;
                    PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiReviewSummaryModel;
                    String str5 = str;
                    C1190440h5G c1190440h5G2 = c1190440h5G;
                    c1190430h5F.getClass();
                    Map<String, Object> mapLIZIZ = C178100mJ.LIZIZ(poiReviewSummaryModel2.trackInfo);
                    if (mapLIZIZ != null) {
                        mapLJIIZILJ = C2097608Jq.LJIIZILJ(mapLIZIZ);
                    } else {
                        mapLJIIZILJ = null;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("enter_from", "poi_reviews");
                        jSONObject.putOpt("enter_method", "multi_reviews_summary");
                        jSONObject.putOpt("poi_id", str5);
                        jSONObject.putOpt("review_source", poiReviewSummaryModel2.source);
                        jSONObject.putOpt("collect_info", c1190440h5G2.LIZLLL);
                        C120800d4.LIZ(jSONObject, mapLJIIZILJ);
                        jSONObject.putOpt("initial_poi_enter_from", c1190440h5G2.LJ);
                        jSONObject.putOpt("initial_poi_enter_method", c1190440h5G2.LJFF);
                        jSONObject.putOpt("initial_poi_from_group_id", c1190440h5G2.LJI);
                        jSONObject.putOpt("initial_poi_id", c1190440h5G2.LJII);
                        jSONObject.putOpt("poi_detail_enter_from", c1190440h5G2.LJIIIIZZ);
                        jSONObject.putOpt("poi_detail_enter_method", c1190440h5G2.LJIIIZ);
                        c098200Yq = C786410Ut5.J3(jSONObject);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = "";
                    }
                    String str6 = (String) c098200Yq;
                    C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                    String str7 = str4;
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    PageFinder pageFinder2 = pageFinder;
                    c1191160h6Q.getClass();
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z2);
                    C1189060h32.LJJ("tabelog_rating", str7, linkedHashMap);
                    C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
                    C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder2);
                    c1185040gwY.getClass();
                    C1185040gwY.LJFF("ttls_review_tabelog_banner_click", linkedHashMap, c1185050gwZ);
                    C1190430h5F c1190430h5F2 = this.LLILZ;
                    String str8 = str2;
                    PageFinder pageFinder3 = pageFinder;
                    C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c1190430h5F2.LL.getContext());
                    if (c19egLIZIZ2 != null) {
                        C1185430gxB.LJJIJL(C1185430gxB.LIZ, str8, "click", C1558360qeg.LJI(c19egLIZIZ2, null), "poi_secondary_reviews_page", "poi_review", pageFinder3);
                    }
                    interfaceC1190700h5g.LIZ(poiReviewSummaryModel);
                    C1191220h6W c1191220h6W = C1191220h6W.LIZ;
                    Context context = this.LLILZ.LL.getContext();
                    PoiReviewsApi.PoiReviewDisclaimer poiReviewDisclaimer2 = poiReviewDisclaimer;
                    UrlModel urlModel2 = urlModel;
                    AwS38S1400000_18 awS38S1400000_18 = new AwS38S1400000_18(this.LLILZ, poiReviewSummaryModel, str6, interfaceC665370Q7z, pageFinder, 4);
                    c1191220h6W.getClass();
                    C1191220h6W.LIZIZ(context, poiReviewDisclaimer2, urlModel2, awS38S1400000_18);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LL);
    }
}
