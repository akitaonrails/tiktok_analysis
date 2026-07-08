package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334050kot implements InterfaceC658750Psf {
    public final /* synthetic */ C259800zU<JSONObject> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ long LLILZIL;

    @Override // X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        boolean z;
        String str;
        String str2;
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            jSONObject.put("biz_tag", str3);
        }
        Map<String, Object> map = this.LLILZ;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!jSONObject.has(key)) {
                    jSONObject.put(key, value);
                }
            }
        }
        JSONObject jSONObject2 = this.LL.element;
        if (jSONObject2 != null) {
            if (!jSONObject.has("file_size") && jSONObject2.has("file_size")) {
                jSONObject.put("file_size", jSONObject2.optInt("file_size", -1));
            }
            if (!jSONObject.has("download_duration") && jSONObject2.has("download_duration")) {
                jSONObject.put("download_duration", jSONObject2.optInt("download_duration", -1));
            }
            if (!jSONObject.has("decode_duration") && jSONObject2.has("decode_duration")) {
                jSONObject.put("decode_duration", jSONObject2.optInt("decode_duration", -1));
            }
            if (!jSONObject.has("hit_cdn_cache") && jSONObject2.has("hit_cdn_cache")) {
                jSONObject.put("hit_cdn_cache", jSONObject2.optString("hit_cdn_cache", ""));
            }
            if (!jSONObject.has("image_ram_size") && jSONObject2.has("image_ram_size")) {
                jSONObject.put("image_ram_size", jSONObject2.optString("image_ram_size", ""));
            }
        }
        if (this.LLILZIL > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
        } else {
            jCurrentTimeMillis = 0;
        }
        Map<String, Object> map2 = this.LLILZ;
        if (map2 != null && map2.containsKey("download_duration")) {
            z = true;
        } else {
            z = false;
        }
        if (z && jCurrentTimeMillis > 0) {
            jSONObject.put("duration", jCurrentTimeMillis);
        }
        C1334040kos c1334040kos = C1334040kos.LIZ;
        String str4 = this.LLILLJJLI;
        c1334040kos.getClass();
        if (str4 != null && C1334040kos.LIZIZ.contains(str4) && this.LLILLL != null) {
            int iOptInt = jSONObject.optInt("duration", -1);
            int iOptInt2 = jSONObject.optInt("download_duration", -1);
            String str5 = this.LLILLJJLI;
            String str6 = this.LLILLL;
            EnumC623730OdH enumC623730OdH = EnumC623730OdH.COMPLETE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("total=");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append("ms, duration=");
            sbLIZ.append(iOptInt);
            sbLIZ.append("ms, download=");
            sbLIZ.append(iOptInt2);
            sbLIZ.append("ms");
            C1334040kos.LJFF(str5, str6, enumC623730OdH, C2188811AlT.LIZIZ(sbLIZ), this.LLILZIL);
            C1334040kos.LJ(this.LLILLJJLI, this.LLILLL, jSONObject);
        }
        boolean zOptBoolean = jSONObject.optBoolean("isSuccess", false);
        String strOptString = this.LLILLJJLI;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (zOptBoolean) {
                str = "success";
            } else {
                str = "fail";
            }
            c2344009Gk.LJFF("load_status", str);
            int iOptInt3 = jSONObject.optInt("from", -1);
            if (iOptInt3 != 0) {
                if (iOptInt3 != 1) {
                    if (iOptInt3 != 2) {
                        str2 = "unknown";
                    } else {
                        str2 = "cache";
                    }
                } else {
                    str2 = "memory_cache";
                }
            } else {
                str2 = "network";
            }
            c2344009Gk.LJFF("load_type", str2);
            if (strOptString == null) {
                strOptString = jSONObject.optString("biz_tag", "bulletin_board_image");
            }
            c2344009Gk.LJFF("biz_tag", strOptString);
            c2344009Gk.LIZJ(jSONObject.optInt("duration", -1), "duration");
            C1334040kos.LIZ(c2344009Gk, "download_duration", jSONObject.optInt("download_duration", -1));
            c2344009Gk.LIZJ(jSONObject.optInt("image_width", -1), "width");
            c2344009Gk.LIZJ(jSONObject.optInt("image_height", -1), "height");
            C1334040kos.LIZ(c2344009Gk, "view_width", jSONObject.optInt("view_width", -1));
            C1334040kos.LIZ(c2344009Gk, "view_height", jSONObject.optInt("view_height", -1));
            C1334040kos.LIZ(c2344009Gk, "file_size", jSONObject.optInt("file_size", -1));
            C1334040kos.LIZIZ(c2344009Gk, "hit_cdn_cache", jSONObject.optString("hit_cdn_cache", ""));
            C1334040kos.LIZIZ(c2344009Gk, "image_type", jSONObject.optString("image_type", ""));
            C1334040kos.LIZ(c2344009Gk, "decode_duration", jSONObject.optInt("decode_duration", -1));
            if (!zOptBoolean) {
                C1334040kos.LIZIZ(c2344009Gk, "fail_phase", jSONObject.optString("fail_phase", ""));
                C1334040kos.LIZ(c2344009Gk, "error_code", jSONObject.optInt("err_code", -1));
                String strOptString2 = jSONObject.optString("err_desc", "");
                if (strOptString2.length() == 0) {
                    strOptString2 = jSONObject.optString("err_msg", "");
                }
                C1334040kos.LIZIZ(c2344009Gk, "error_msg", strOptString2);
            }
            C1334040kos.LJII(c2344009Gk, jSONObject);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bulletin_image_loaded_event: ");
            sbLIZ2.append(c2344009Gk.LIZ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            C20684815ws.LJIILLIIL("bulletin_image_loaded_event", c2344009Gk.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("reportImageLoadedEvent error: ");
            sbLIZ3.append(e.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LL.element = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        this.LL.element = jSONObject;
        C1334040kos c1334040kos = C1334040kos.LIZ;
        String str2 = this.LLILLJJLI;
        String strValueOf = String.valueOf(this.LLILLL);
        c1334040kos.getClass();
        C1334040kos.LJ(str2, strValueOf, jSONObject);
    }

    public C1334050kot(C259800zU<JSONObject> c259800zU, String str, String str2, Map<String, ? extends Object> map, long j) {
        this.LL = c259800zU;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = map;
        this.LLILZIL = j;
    }
}
