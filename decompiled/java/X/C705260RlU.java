package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0RlU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705260RlU extends AbstractC704860Rkq<C705280RlW> {
    public C705280RlW LIZIZ;
    public Map<String, FcpTemplateActionGroup> LIZJ;

    @Override // X.AbstractC704860Rkq
    public final void LIZ() {
        Map<String, Object> mapLJ;
        Boolean bool;
        Boolean bool2;
        FcpUiTemplate fcpUiTemplate = this.LIZ;
        if (fcpUiTemplate == null || (mapLJ = fcpUiTemplate.getFieldsMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("need_enter_anim");
        C705270RlV c705270RlV = null;
        Boolean bool3 = obj instanceof Boolean ? (Boolean) obj : null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
        Object obj2 = mapLJ.get("need_exit_anim");
        boolean zBooleanValue3 = (!(obj2 instanceof Boolean) || (bool2 = (Boolean) obj2) == null) ? true : bool2.booleanValue();
        Object obj3 = mapLJ.get("button");
        Map map = obj3 instanceof Map ? (Map) obj3 : null;
        Object obj4 = mapLJ.get("icon");
        if (!(obj4 instanceof String) || obj4 == null) {
            obj4 = mapLJ.get("icon");
            if (!(obj4 instanceof Drawable)) {
                obj4 = null;
            }
        }
        Object obj5 = mapLJ.get("title");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = mapLJ.get("desc");
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        if (map != null) {
            Object obj7 = map.get("head_icon");
            if (!(obj7 instanceof String) || obj7 == null) {
                obj7 = map.get("head_icon");
                if (!(obj7 instanceof Drawable)) {
                    obj7 = null;
                }
            }
            Object obj8 = map.get("text");
            String str3 = obj8 instanceof String ? (String) obj8 : null;
            Object obj9 = map.get("variant");
            String str4 = obj9 instanceof String ? (String) obj9 : null;
            Object obj10 = map.get("action_key");
            String str5 = obj10 instanceof String ? (String) obj10 : null;
            Object obj11 = map.get("is_clicked");
            if ((obj11 instanceof Boolean) && (bool = (Boolean) obj11) != null) {
                zBooleanValue = bool.booleanValue();
            }
            c705270RlV = new C705270RlV("right_button", str3, null, str4, obj7, str5, Boolean.valueOf(zBooleanValue));
        }
        this.LIZIZ = new C705280RlW(obj4, str, str2, c705270RlV, zBooleanValue2, zBooleanValue3);
    }

    @Override // X.AbstractC704860Rkq
    public final boolean LIZLLL() {
        C705280RlW c705280RlW = this.LIZIZ;
        if (c705280RlW != null) {
            return (c705280RlW.LIZLLL == null && c705280RlW.LIZ == null && c705280RlW.LIZIZ == null && c705280RlW.LIZJ == null) ? false : true;
        }
        return false;
    }

    @Override // X.AbstractC704860Rkq
    public final Map<String, FcpTemplateActionGroup> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC704860Rkq
    public final /* bridge */ /* synthetic */ C705280RlW LIZJ() {
        return this.LIZIZ;
    }

    public C705260RlU(FcpUiTemplate fcpUiTemplate) {
        super(fcpUiTemplate);
        this.LIZIZ = new C705280RlW(null, null, null, null, false, true);
        this.LIZJ = new LinkedHashMap();
    }
}
