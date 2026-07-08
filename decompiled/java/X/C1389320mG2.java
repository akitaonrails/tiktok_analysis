package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389320mG2 {
    public static void LIZ(JSONObject jSONObject) {
        String str;
        String str2;
        C1389350mG5 c1389350mG5LIZIZ = C1389340mG4.LIZIZ();
        if (jSONObject != null) {
            if (c1389350mG5LIZIZ.LJFF) {
                str2 = "3";
            } else {
                str2 = "1";
            }
            jSONObject.put("pad_interface_orientation", str2);
        }
        if (c1389350mG5LIZIZ.LJI && jSONObject != null) {
            if (c1389350mG5LIZIZ.LJII) {
                str = "pic_in_pic";
            } else {
                str = "multi_mode";
            }
            jSONObject.put("screen_multi_mode", str);
            jSONObject.put("screen_on_multi_win_width_dp", String.valueOf(c1389350mG5LIZIZ.LIZIZ()));
            jSONObject.put("screen_on_multi_win_height_dp", String.valueOf(c1389350mG5LIZIZ.LIZ()));
        }
    }

    public static void LIZIZ(Map map) {
        String str;
        String str2;
        if (map == null) {
            return;
        }
        C1389350mG5 c1389350mG5LIZIZ = C1389340mG4.LIZIZ();
        if (c1389350mG5LIZIZ.LJFF) {
            str = "3";
        } else {
            str = "1";
        }
        map.put("pad_interface_orientation", str);
        if (c1389350mG5LIZIZ.LJI) {
            if (c1389350mG5LIZIZ.LJII) {
                str2 = "pic_in_pic";
            } else {
                str2 = "multi_mode";
            }
            map.put("screen_multi_mode", str2);
            map.put("screen_on_multi_win_width_dp", String.valueOf(c1389350mG5LIZIZ.LIZIZ()));
            map.put("screen_on_multi_win_height_dp", String.valueOf(c1389350mG5LIZIZ.LIZ()));
        }
    }
}
