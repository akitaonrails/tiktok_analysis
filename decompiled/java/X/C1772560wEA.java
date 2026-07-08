package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772560wEA extends AbstractC1771870wD3 {
    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallPreOpen", new InterfaceC1775150wIL() { // from class: X.0wE6
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) throws JSONException {
                Long lLIZ;
                String str;
                Long lValueOf;
                Long lValueOf2;
                Long lValueOf3;
                Long lValueOf4;
                Object obj = map.get("start_time");
                if (obj != null) {
                    lLIZ = C601990NjJ.LIZ(obj);
                } else {
                    lLIZ = null;
                }
                Object obj2 = map.get(Scene.SCENE_SERVICE);
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (lLIZ != null && lLIZ.longValue() > 0) {
                    if (str != null && str.length() != 0) {
                        C1772750wET c1772750wET = this.LIZ.LIZIZ().LIZLLL().LJIIL;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long jLongValue = jCurrentTimeMillis - lLIZ.longValue();
                        long j = c1772750wET.LJ;
                        if (j > 0) {
                            lValueOf = Long.valueOf(jCurrentTimeMillis - j);
                        } else {
                            lValueOf = null;
                        }
                        long j2 = c1772750wET.LJJJJ;
                        if (j2 > 0) {
                            lValueOf2 = Long.valueOf(jCurrentTimeMillis - j2);
                        } else {
                            lValueOf2 = null;
                        }
                        if (c1772750wET.LJIILIIL > 0) {
                            lValueOf3 = Long.valueOf(jCurrentTimeMillis - c1772750wET.LJIILIIL);
                        } else {
                            lValueOf3 = null;
                        }
                        if (c1772750wET.LJIIZILJ > 0) {
                            lValueOf4 = Long.valueOf(jCurrentTimeMillis - c1772750wET.LJIILIIL);
                        } else {
                            lValueOf4 = null;
                        }
                        Object objLJJLIIIJL = C13LP.LJJLIIIJL(c1772750wET.LLD);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Scene.SCENE_SERVICE, str);
                        if (objLJJLIIIJL == null) {
                            objLJJLIIIJL = "";
                        }
                        jSONObject.put("current_vc_state", objLJJLIIIJL);
                        jSONObject.put("click_to_now", jLongValue);
                        jSONObject.put("vc_create_to_now", lValueOf);
                        if (lValueOf2 != null) {
                            lValueOf2.longValue();
                            jSONObject.put("net_end_to_now", lValueOf2.longValue());
                        }
                        if (lValueOf3 != null) {
                            lValueOf3.longValue();
                            jSONObject.put("cache_render_end_to_now", lValueOf3.longValue());
                        }
                        if (lValueOf4 != null) {
                            lValueOf4.longValue();
                            jSONObject.put("online_data_render_end_to_now", lValueOf4.longValue());
                        }
                        C1018703yb.LJFF("rd_mixmall_pre_open", jSONObject);
                        c21175917tt.LIZ(1, "success", null);
                        return;
                    }
                    c21175917tt.LIZ(0, "scene should not be null", null);
                    return;
                }
                c21175917tt.LIZ(0, "start_time should not be null or negative number", null);
            }
        });
    }
}
