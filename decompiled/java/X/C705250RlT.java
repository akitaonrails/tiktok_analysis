package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705250RlT extends AbstractC704860Rkq<C705290RlX> {
    public C705290RlX LIZIZ;
    public Map<String, FcpTemplateActionGroup> LIZJ;

    @Override // X.AbstractC704860Rkq
    public final void LIZ() {
        Map<String, Object> mapLJ;
        Set<Map.Entry> setEntrySet;
        Map map;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        FcpUiTemplate fcpUiTemplate = this.LIZ;
        if (fcpUiTemplate == null || (mapLJ = fcpUiTemplate.getFieldsMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("buttons");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = mapLJ.get("need_enter_anim");
        boolean zBooleanValue = (!(obj2 instanceof Boolean) || (bool3 = (Boolean) obj2) == null) ? false : bool3.booleanValue();
        Object obj3 = mapLJ.get("need_exit_anim");
        boolean zBooleanValue2 = (!(obj3 instanceof Boolean) || (bool2 = (Boolean) obj3) == null) ? true : bool2.booleanValue();
        ArrayList arrayList = new ArrayList();
        if (map2 != null && (setEntrySet = map2.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if ((value instanceof Map) && (map = (Map) value) != null) {
                    Object obj4 = map.get("text");
                    String str2 = obj4 instanceof String ? (String) obj4 : null;
                    Object obj5 = map.get("blocks");
                    List list = obj5 instanceof List ? (List) obj5 : null;
                    Object obj6 = map.get("variant");
                    if (!(obj6 instanceof String)) {
                        obj6 = null;
                    }
                    String str3 = Intrinsics.LJFF(obj6, "primary") ? "primary" : "secondary";
                    Object obj7 = map.get("head_icon");
                    if (!(obj7 instanceof String) || obj7 == null) {
                        obj7 = map.get("head_icon");
                        if (!(obj7 instanceof Drawable)) {
                            obj7 = null;
                        }
                    }
                    Object obj8 = map.get("action_key");
                    String str4 = obj8 instanceof String ? (String) obj8 : null;
                    Object obj9 = map.get("is_clicked");
                    arrayList.add(new C705270RlV(str, str2, list, str3, obj7, str4, Boolean.valueOf((!(obj9 instanceof Boolean) || (bool = (Boolean) obj9) == null) ? false : bool.booleanValue())));
                }
            }
        }
        this.LIZIZ = new C705290RlX(arrayList, zBooleanValue, zBooleanValue2);
    }

    @Override // X.AbstractC704860Rkq
    public final boolean LIZLLL() {
        if (!(!this.LIZIZ.LIZ.isEmpty())) {
            return false;
        }
        Iterator<C705270RlV> it2 = this.LIZIZ.LIZ.iterator();
        while (it2.hasNext()) {
            C705270RlV next = it2.next();
            C705270RlV c705270RlV = next;
            if (c705270RlV.LIZIZ != null || c705270RlV.LJ != null) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.AbstractC704860Rkq
    public final Map<String, FcpTemplateActionGroup> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC704860Rkq
    public final /* bridge */ /* synthetic */ C705290RlX LIZJ() {
        return this.LIZIZ;
    }

    public C705250RlT(FcpUiTemplate fcpUiTemplate) {
        super(fcpUiTemplate);
        this.LIZIZ = new C705290RlX(C13BV.INSTANCE, false, true);
        this.LIZJ = new LinkedHashMap();
    }
}
