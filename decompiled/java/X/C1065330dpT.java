package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065330dpT {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"anchor_type", "main_anchor_type", "multi_anchor", "anchor_number", "component_key", "main_component_key", "enter_from", "enter_method", "author_id", "music_id", "group_id"});

    public static JSONObject LIZJ(Map map) {
        Integer numValueOf;
        Integer numValueOf2 = null;
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(map);
        String str = (String) map.get("multi_anchor");
        if (str != null) {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
        } else {
            numValueOf = null;
        }
        jSONObject.put("multi_anchor", numValueOf);
        String str2 = (String) map.get("anchor_number");
        if (str2 != null) {
            numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
        }
        jSONObject.put("anchor_number", numValueOf2);
        return jSONObject;
    }

    public static JSONObject LIZLLL(C2344009Gk c2344009Gk) {
        Map<String, String> map;
        if (c2344009Gk != null) {
            map = c2344009Gk.LIZ;
        } else {
            map = null;
        }
        return LIZJ(map);
    }

    public static String LJ(Aweme aweme) {
        Long lValueOf;
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) {
            return "";
        }
        Music music = aweme.getMusic();
        if (music != null) {
            lValueOf = Long.valueOf(music.getId());
        } else {
            lValueOf = null;
        }
        return String.valueOf(lValueOf);
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = null;
        }
        for (Object obj : LIZ) {
            if (linkedHashMap != null) {
                linkedHashMap.remove(obj);
            }
        }
        c2344009Gk.LJII(linkedHashMap);
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str, Object obj) {
        if (TextUtils.isEmpty(c2344009Gk.LJIIIZ(str)) && obj != null) {
            c2344009Gk.LJ(obj, str);
        }
    }

    public static C2344009Gk LJFF(AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        C1065100dp6 c1065100dp6 = new C1065100dp6(anchorCommonStruct.getLogExtra());
        C2344009Gk c2344009GkLIZLLL = c1065100dp6.LIZLLL();
        c2344009GkLIZLLL.LJIIIIZZ("enter_method", "comment_top_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_id", c1065100dp6.LIZ());
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_name", c1065100dp6.LIZIZ());
        String strLJ = c1065100dp6.LJ();
        if (strLJ.length() == 0) {
            strLJ = anchorCommonStruct.getComponentKey();
        }
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_type", strLJ);
        c2344009GkLIZLLL.LIZJ(0, "multi_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("group_id", aweme.getAid());
        c2344009GkLIZLLL.LJIIIIZZ("anchor_id", c1065100dp6.LJFF());
        c2344009GkLIZLLL.LJIIIIZZ("anchor_name", c1065100dp6.LJI());
        String strLIZJ = c1065100dp6.LIZJ();
        if (strLIZJ.length() == 0) {
            strLIZJ = anchorCommonStruct.getComponentKey();
        }
        c2344009GkLIZLLL.LJIIIIZZ("anchor_type", strLIZJ);
        c2344009GkLIZLLL.LIZJ(1, "anchor_number");
        c2344009GkLIZLLL.LJIIIIZZ("request_id", aweme.getRequestId());
        c2344009GkLIZLLL.LJIIIIZZ("enter_from", str);
        c2344009GkLIZLLL.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009GkLIZLLL.LJIIIIZZ("music_id", LJ(aweme));
        c2344009GkLIZLLL.LJIIIIZZ("click_method", "click_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("component_key", anchorCommonStruct.getComponentKey());
        c2344009GkLIZLLL.LJIIIIZZ("main_component_key", anchorCommonStruct.getComponentKey());
        return c2344009GkLIZLLL;
    }

    public static C2344009Gk LJI(AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        C1065100dp6 c1065100dp6 = new C1065100dp6(anchorCommonStruct.getLogExtra());
        C2344009Gk c2344009GkLIZLLL = c1065100dp6.LIZLLL();
        c2344009GkLIZLLL.LJIIIIZZ("enter_method", "comment_top_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_id", c1065100dp6.LIZ());
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_name", c1065100dp6.LIZIZ());
        String strLJ = c1065100dp6.LJ();
        if (strLJ.length() == 0) {
            strLJ = anchorCommonStruct.getComponentKey();
        }
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_type", strLJ);
        c2344009GkLIZLLL.LIZJ(0, "multi_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("group_id", aweme.getAid());
        c2344009GkLIZLLL.LJIIIIZZ("anchor_id", c1065100dp6.LJFF());
        c2344009GkLIZLLL.LJIIIIZZ("anchor_name", c1065100dp6.LJI());
        String strLIZJ = c1065100dp6.LIZJ();
        if (strLIZJ.length() == 0) {
            strLIZJ = anchorCommonStruct.getComponentKey();
        }
        c2344009GkLIZLLL.LJIIIIZZ("anchor_type", strLIZJ);
        c2344009GkLIZLLL.LIZJ(1, "anchor_number");
        c2344009GkLIZLLL.LJIIIIZZ("request_id", aweme.getRequestId());
        c2344009GkLIZLLL.LJIIIIZZ("enter_from", str);
        c2344009GkLIZLLL.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009GkLIZLLL.LJIIIIZZ("music_id", LJ(aweme));
        c2344009GkLIZLLL.LJIIIIZZ("click_method", "click_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("component_key", anchorCommonStruct.getComponentKey());
        c2344009GkLIZLLL.LJIIIIZZ("main_component_key", anchorCommonStruct.getComponentKey());
        return c2344009GkLIZLLL;
    }

    public static C2344009Gk LJII(AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        C1065100dp6 c1065100dp6 = new C1065100dp6(anchorCommonStruct.getLogExtra());
        C2344009Gk c2344009GkLIZLLL = c1065100dp6.LIZLLL();
        c2344009GkLIZLLL.LJIIIIZZ("enter_method", "comment_top_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_id", c1065100dp6.LIZ());
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_name", c1065100dp6.LIZIZ());
        String strLJ = c1065100dp6.LJ();
        if (strLJ.length() == 0) {
            strLJ = anchorCommonStruct.getComponentKey();
        }
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_type", strLJ);
        c2344009GkLIZLLL.LIZJ(0, "multi_anchor");
        c2344009GkLIZLLL.LJIIIIZZ("group_id", aweme.getAid());
        c2344009GkLIZLLL.LJIIIIZZ("anchor_id", c1065100dp6.LJFF());
        c2344009GkLIZLLL.LJIIIIZZ("anchor_name", c1065100dp6.LJI());
        String strLIZJ = c1065100dp6.LIZJ();
        if (strLIZJ.length() == 0) {
            strLIZJ = anchorCommonStruct.getComponentKey();
        }
        c2344009GkLIZLLL.LJIIIIZZ("anchor_type", strLIZJ);
        c2344009GkLIZLLL.LIZJ(1, "anchor_number");
        c2344009GkLIZLLL.LJIIIIZZ("request_id", aweme.getRequestId());
        c2344009GkLIZLLL.LJIIIIZZ("enter_from", str);
        c2344009GkLIZLLL.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009GkLIZLLL.LJIIIIZZ("music_id", LJ(aweme));
        c2344009GkLIZLLL.LJIIIIZZ("component_key", anchorCommonStruct.getComponentKey());
        c2344009GkLIZLLL.LJIIIIZZ("main_component_key", anchorCommonStruct.getComponentKey());
        return c2344009GkLIZLLL;
    }
}
