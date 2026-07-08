package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContentV2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0RlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705160RlK extends AbstractC704860Rkq<C705210RlP> {
    public C705210RlP LIZIZ;
    public Map<String, FcpTemplateActionGroup> LIZJ;

    @Override // X.AbstractC704860Rkq
    public final void LIZ() {
        Map<String, Object> mapLJ;
        StandardTagContentV2 standardTagContentV2;
        Map map;
        List<Map> list;
        Double d;
        Double d2;
        String str;
        List<String> list2;
        Map map2;
        FcpUiTemplate fcpUiTemplate = this.LIZ;
        if (fcpUiTemplate == null || (mapLJ = fcpUiTemplate.getFieldsMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("background_color");
        C705200RlO c705200RlO = null;
        c705200RlO = null;
        String str2 = obj instanceof String ? (String) obj : null;
        Object obj2 = mapLJ.get("content");
        if (!C19719512Dh.LJII(obj2) || (map2 = (Map) obj2) == null) {
            standardTagContentV2 = null;
        } else {
            Object obj3 = map2.get("text");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map2.get("text_color");
            standardTagContentV2 = new StandardTagContentV2(str3, obj4 instanceof String ? (String) obj4 : null);
        }
        Object obj5 = mapLJ.get("action_key");
        String str4 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = mapLJ.get("avatar_group");
        if (C19719512Dh.LJII(obj6) && (map = (Map) obj6) != null) {
            ArrayList arrayList = new ArrayList();
            Object obj7 = map.get("url_list");
            if (!(obj7 instanceof List) || (list = (List) obj7) == null) {
                list = C13BV.INSTANCE;
            }
            for (Map map3 : list) {
                UrlModel urlModel = new UrlModel();
                Object obj8 = map3.get("uri");
                if (!(obj8 instanceof String) || (str = (String) obj8) == null) {
                    str = "";
                }
                urlModel.setUri(str);
                Object obj9 = map3.get("url_list");
                if (!(obj9 instanceof List) || (list2 = (List) obj9) == null) {
                    list2 = C13BV.INSTANCE;
                }
                urlModel.setUrlList(list2);
                arrayList.add(C438710HIf.LIZ(urlModel));
            }
            Object obj10 = map.get("max_display_count");
            Integer numValueOf = (!(obj10 instanceof Double) || (d2 = (Double) obj10) == null) ? null : Integer.valueOf((int) d2.doubleValue());
            Object obj11 = map.get("total_count");
            Integer numValueOf2 = (!(obj11 instanceof Double) || (d = (Double) obj11) == null) ? null : Integer.valueOf((int) d.doubleValue());
            Object obj12 = map.get("position");
            c705200RlO = new C705200RlO(numValueOf, numValueOf2, obj12 instanceof String ? (String) obj12 : null, arrayList);
        }
        this.LIZIZ = new C705210RlP(str2, standardTagContentV2, c705200RlO, str4);
    }

    @Override // X.AbstractC704860Rkq
    public final boolean LIZLLL() {
        StandardTagContentV2 standardTagContentV2 = this.LIZIZ.LIZIZ;
        return (standardTagContentV2 != null && C1533950q1J.LJ(standardTagContentV2.text)) || this.LIZIZ.LIZJ != null;
    }

    @Override // X.AbstractC704860Rkq
    public final Map<String, FcpTemplateActionGroup> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC704860Rkq
    public final /* bridge */ /* synthetic */ C705210RlP LIZJ() {
        return this.LIZIZ;
    }

    public C705160RlK(FcpUiTemplate fcpUiTemplate, String str) {
        super(fcpUiTemplate);
        this.LIZIZ = new C705210RlP(null, null, null, null);
        this.LIZJ = new LinkedHashMap();
    }
}
