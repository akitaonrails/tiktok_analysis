package Y;

import X.C0HTI;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1188440h22;
import X.C1188460h24;
import X.C1188720h2U;
import X.C1188950h2r;
import X.C1188960h2s;
import X.C1189060h32;
import X.C1190970h67;
import X.C1191160h6Q;
import X.C1388190mED;
import X.C1391960mKI;
import X.C19EG;
import X.C2344009Gk;
import X.C2520009uA;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS14S2200000_18 implements View.OnClickListener {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS14S2200000_18 aCListenerS14S2200000_18, View view) {
        String str;
        Context context;
        String str2;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo;
        Fragment fragmentLIZ;
        String str3 = null;
        if (C2520009uA.LIZ) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService == null || (fragmentLIZ = iDetailFeedSafService.LIZ((C1188960h2s) aCListenerS14S2200000_18.l2)) == null || (context = fragmentLIZ.getActivity()) == null) {
                context = ((C1188960h2s) aCListenerS14S2200000_18.l2).getContext();
            }
            C1188460h24 c1188460h24 = C1188460h24.LIZ;
            Aweme aweme = (Aweme) aCListenerS14S2200000_18.l3;
            String str4 = aCListenerS14S2200000_18.s0;
            c1188460h24.getClass();
            C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, "poi_tag", str4);
            if (c1188440h22LJ != null) {
                Aweme aweme2 = (Aweme) aCListenerS14S2200000_18.l3;
                C1188960h2s c1188960h2s = (C1188960h2s) aCListenerS14S2200000_18.l2;
                String str5 = aCListenerS14S2200000_18.s0;
                String str6 = aCListenerS14S2200000_18.s1;
                C1188720h2U c1188720h2U = C1188720h2U.LIZ;
                if (aweme2 != null && (poiDataStruct = aweme2.getPoiDataStruct()) != null && (poiAnchorInfo = poiDataStruct.videoTag) != null) {
                    str2 = poiAnchorInfo.schema;
                } else {
                    str2 = null;
                }
                PageFinder pageFinderVia = PageFinder.via((View) c1188960h2s);
                c1188720h2U.getClass();
                C1188720h2U.LIZIZ(context, str2, aweme2, c1188440h22LJ, pageFinderVia, str5, str6, null, null, null, null, null, null, false, null, false, "c1480.d0");
            }
        }
        C1188950h2r c1188950h2r = C1188950h2r.LIZ;
        Aweme aweme3 = (Aweme) aCListenerS14S2200000_18.l3;
        String str7 = aCListenerS14S2200000_18.s0;
        String str8 = aCListenerS14S2200000_18.s1;
        PageFinder pageFinderVia2 = PageFinder.via((View) aCListenerS14S2200000_18.l2);
        c1188950h2r.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str7);
        c2344009Gk.LJIIIIZZ("dist_poi_entrance_type", "tag");
        c2344009Gk.LJIIIIZZ("dist_poi_entrance_subtype", str8);
        PoiDataStruct poiDataStruct2 = aweme3.getPoiDataStruct();
        if (poiDataStruct2 != null) {
            str = poiDataStruct2.poiId;
        } else {
            str = null;
        }
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", str);
        C1188950h2r.LIZIZ(c2344009Gk, aweme3);
        PoiDataStruct poiDataStruct3 = aweme3.getPoiDataStruct();
        if (poiDataStruct3 != null) {
            str3 = poiDataStruct3.collectInfo;
        }
        C1189060h32.LIZJ(c2344009Gk, str3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia2);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_dist_poi_entrance_click", map, c1185050gwZ);
    }

    public static final void onClick$1(ACListenerS14S2200000_18 aCListenerS14S2200000_18, View view) {
        FragmentManager supportFragmentManager;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = aCListenerS14S2200000_18.s0;
        String str2 = aCListenerS14S2200000_18.s1;
        Double d = ((PoiReviewsApi.PoiReviewSummaryModel) aCListenerS14S2200000_18.l2).score;
        PageFinder pageFinder = ((C1190970h67) aCListenerS14S2200000_18.l3).getPageFinder();
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_reviews");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(d));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_rating_rules_entrance_click", linkedHashMap, c1185050gwZ);
        C1190970h67 c1190970h67 = (C1190970h67) aCListenerS14S2200000_18.l3;
        c1190970h67.getClass();
        C1191160h6Q.LJJIZ(c1190970h67.LLJIJIL, c1190970h67.LLJILJIL, c1190970h67.LLJILJILJ, "show", c1190970h67.getPageFinder());
        C1391960mKI c1391960mKI = new C1391960mKI();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.x0;
        c1391960mKI.LIZLLL = c0hti.LIZ(c1190970h67.getContext());
        c1391960mKI.LJI = 1;
        c1391960mKI.LIZ = false;
        c1391960mKI.LJII = c1190970h67.getContext().getString(2131844741);
        c1391960mKI.LJIIIIZZ = c1190970h67.getContext().getString(2131844739);
        c1391960mKI.LIZIZ(c1190970h67.getContext().getString(2131844740), new AwS632S0100000_18(c1190970h67, 322));
        TuxPanel tuxPanel = c1391960mKI.LIZ().LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1190970h67.getContext());
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxPanel.show(supportFragmentManager, "poi_rating");
        }
    }

    public ACListenerS14S2200000_18(Object obj, Object obj2, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
        this.s1 = str2;
    }
}
