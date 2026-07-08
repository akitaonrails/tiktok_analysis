package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContentV2;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0RlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705170RlL extends AbstractC704860Rkq<C705220RlQ> {
    public C705220RlQ LIZIZ;
    public Map<String, FcpTemplateActionGroup> LIZJ;

    @Override // X.AbstractC704860Rkq
    public final void LIZ() {
        Map<String, Object> mapLJ;
        StandardTagContentV2 standardTagContentV2;
        Map map;
        FcpUiTemplate fcpUiTemplate = this.LIZ;
        if (fcpUiTemplate == null || (mapLJ = fcpUiTemplate.getFieldsMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("background_color");
        Object obj2 = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj3 = mapLJ.get("content");
        if (!C19719512Dh.LJII(obj3) || (map = (Map) obj3) == null) {
            standardTagContentV2 = null;
        } else {
            Object obj4 = map.get("text");
            String str2 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = map.get("text_color");
            standardTagContentV2 = new StandardTagContentV2(str2, obj5 instanceof String ? (String) obj5 : null);
        }
        Object obj6 = mapLJ.get("action_key");
        String str3 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = mapLJ.get("head_icon");
        if (!(obj7 instanceof String) || obj7 == null) {
            Object obj8 = mapLJ.get("head_icon");
            if (obj8 instanceof Drawable) {
                obj2 = obj8;
            }
        } else {
            obj2 = obj7;
        }
        this.LIZIZ = new C705220RlQ(str, standardTagContentV2, obj2, str3);
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
    public final /* bridge */ /* synthetic */ C705220RlQ LIZJ() {
        return this.LIZIZ;
    }

    public C705170RlL(FcpUiTemplate fcpUiTemplate, String str) {
        super(fcpUiTemplate);
        this.LIZIZ = new C705220RlQ(null, null, null, null);
        this.LIZJ = new LinkedHashMap();
    }
}
