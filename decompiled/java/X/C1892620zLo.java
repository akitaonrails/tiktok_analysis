package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892620zLo {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Boolean LJIIIZ;
    public String LJIIJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        C1189060h32.LJIL(jSONObject, "initial_poi_enter_from", this.LJIIIIZZ);
        C1189060h32.LJIL(jSONObject, "initial_poi_enter_method", this.LIZ);
        C1189060h32.LJIL(jSONObject, "ttls_live_action_type", this.LIZIZ);
        C1189060h32.LJIL(jSONObject, "ttls_live_from_group_id", this.LIZJ);
        C1189060h32.LJIL(jSONObject, "search_id", this.LIZLLL);
        C1189060h32.LJIL(jSONObject, "search_result_id", this.LJ);
        C1189060h32.LJIL(jSONObject, "search_keyword", this.LJFF);
        C1189060h32.LJIL(jSONObject, "search_type", this.LJI);
        C1189060h32.LJIL(jSONObject, "search_token_type", this.LJII);
        boolean zLJFF = Intrinsics.LJFF(this.LJIIIZ, Boolean.TRUE);
        String str = CardStruct.IStatusCode.DEFAULT;
        C1189060h32.LJIL(jSONObject, "is_live_ad", zLJFF ? "1" : CardStruct.IStatusCode.DEFAULT);
        String str2 = this.LJIIJ;
        if (str2 != null) {
            str = str2;
        }
        jSONObject.put("is_wand", str);
        return jSONObject;
    }

    public final void LIZIZ(Map<String, ? extends Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        Integer num;
        Object obj = map.get("param_live_enter_from_merge");
        String string = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LJIIIIZZ = str;
        Object obj2 = map.get("param_live_enter_method_merge");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        this.LIZ = str2;
        Object obj3 = map.get("param_live_action_type");
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        this.LIZIZ = str3;
        Object obj4 = map.get("param_enter_room_video_id");
        if (obj4 instanceof String) {
            str4 = (String) obj4;
        } else {
            str4 = null;
        }
        this.LIZJ = str4;
        Object obj5 = map.get("param_search_id");
        if (obj5 instanceof String) {
            str5 = (String) obj5;
        } else {
            str5 = null;
        }
        this.LIZLLL = str5;
        Object obj6 = map.get("param_search_result_id");
        if (obj6 instanceof String) {
            str6 = (String) obj6;
        } else {
            str6 = null;
        }
        this.LJ = str6;
        Object obj7 = map.get("param_search_keyword");
        if (obj7 instanceof String) {
            str7 = (String) obj7;
        } else {
            str7 = null;
        }
        this.LJFF = str7;
        Object obj8 = map.get("param_search_type");
        if (obj8 instanceof String) {
            str8 = (String) obj8;
        } else {
            str8 = null;
        }
        this.LJI = str8;
        Object obj9 = map.get("param_search_token_type");
        if (obj9 instanceof String) {
            str9 = (String) obj9;
        } else {
            str9 = null;
        }
        this.LJII = str9;
        Object obj10 = map.get("param_enter_from_effect_ad_bool");
        if (obj10 instanceof Boolean) {
            bool = (Boolean) obj10;
        } else {
            bool = null;
        }
        this.LJIIIZ = bool;
        Object obj11 = map.get("param_is_wand");
        if ((obj11 instanceof Integer) && (num = (Integer) obj11) != null) {
            string = num.toString();
        }
        this.LJIIJ = string;
    }
}
