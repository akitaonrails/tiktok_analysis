package X;

import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705000Rl4 extends AbstractC704860Rkq<C704990Rl3> {
    public final String LIZIZ;
    public C704990Rl3 LIZJ;
    public Map<String, FcpTemplateActionGroup> LIZLLL;

    @Override // X.AbstractC704860Rkq
    public final void LIZ() {
        Map<String, Object> mapLJ;
        C698170Ra3 c698170Ra3;
        C698170Ra3 c698170Ra32;
        Map map;
        int iLIZIZ;
        Number number;
        Number number2;
        int iLIZIZ2;
        int iLIZIZ3;
        Number number3;
        Number number4;
        FcpUiTemplate fcpUiTemplate = this.LIZ;
        if (fcpUiTemplate == null || (mapLJ = fcpUiTemplate.getFieldsMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("content");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = mapLJ.get("action_key");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = mapLJ.get("front_icon");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        int iLIZIZ4 = 0;
        if (map2 != null) {
            Object obj4 = map2.get("token");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = map2.get("width");
            if (!(obj5 instanceof Number) || (number4 = (Number) obj5) == null) {
                iLIZIZ2 = 0;
            } else {
                C1546210qL5.LIZ.getClass();
                iLIZIZ2 = C814420VxA.LIZIZ(C1546210qL5.LIZ(number4));
            }
            Object obj6 = map2.get("height");
            if (!(obj6 instanceof Number) || (number3 = (Number) obj6) == null) {
                iLIZIZ3 = 0;
            } else {
                C1546210qL5.LIZ.getClass();
                iLIZIZ3 = C814420VxA.LIZIZ(C1546210qL5.LIZ(number3));
            }
            c698170Ra3 = new C698170Ra3(str3, iLIZIZ2, iLIZIZ3);
        } else {
            c698170Ra3 = null;
        }
        Object obj7 = mapLJ.get("back_icon");
        if (!(obj7 instanceof Map) || (map = (Map) obj7) == null) {
            c698170Ra32 = null;
        } else {
            Object obj8 = map.get("token");
            String str4 = obj8 instanceof String ? (String) obj8 : null;
            Object obj9 = map.get("width");
            if (!(obj9 instanceof Number) || (number2 = (Number) obj9) == null) {
                iLIZIZ = 0;
            } else {
                C1546210qL5.LIZ.getClass();
                iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(number2));
            }
            Object obj10 = map.get("height");
            if ((obj10 instanceof Number) && (number = (Number) obj10) != null) {
                C1546210qL5.LIZ.getClass();
                iLIZIZ4 = C814420VxA.LIZIZ(C1546210qL5.LIZ(number));
            }
            c698170Ra32 = new C698170Ra3(str4, iLIZIZ, iLIZIZ4);
        }
        Object obj11 = mapLJ.get("font_size");
        String str5 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = mapLJ.get("font_color");
        this.LIZJ = new C704990Rl3(c698170Ra3, str, c698170Ra32, str2, str5, obj12 instanceof String ? (String) obj12 : null);
    }

    @Override // X.AbstractC704860Rkq
    public final boolean LIZLLL() {
        String str = this.LIZJ.LIZIZ;
        return str != null && C1533950q1J.LJ(str);
    }

    @Override // X.AbstractC704860Rkq
    public final Map<String, FcpTemplateActionGroup> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC704860Rkq
    public final /* bridge */ /* synthetic */ C704990Rl3 LIZJ() {
        return this.LIZJ;
    }

    public C705000Rl4(FcpUiTemplate fcpUiTemplate, String str) {
        super(fcpUiTemplate);
        this.LIZIZ = str;
        this.LIZJ = new C704990Rl3(null, null, null, null, null, null);
        this.LIZLLL = new LinkedHashMap();
    }
}
