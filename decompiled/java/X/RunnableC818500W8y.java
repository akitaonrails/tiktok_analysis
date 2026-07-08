package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC818500W8y implements Runnable {
    public final /* synthetic */ C818470W8v LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0W93 LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;

    public RunnableC818500W8y(C818470W8v c818470W8v, String str, C0W93 c0w93, long j, Map<String, ? extends Object> map) {
        this.LL = c818470W8v;
        this.LLILLJJLI = str;
        this.LLILLL = c0w93;
        this.LLILZ = j;
        this.LLILZIL = map;
    }

    public final void LIZ() throws JSONException {
        C818470W8v c818470W8v = this.LL;
        String str = this.LLILLJJLI;
        C0W93 c0w93 = this.LLILLL;
        long j = this.LLILZ;
        Map<String, Object> map = this.LLILZIL;
        c818470W8v.getClass();
        if (((Boolean) C1DS1.LJJJJIZL.getValue()).booleanValue() || ((Boolean) C1DS1.LJJJJ.getValue()).booleanValue()) {
            if (Intrinsics.LJFF(str, "homepage_follow")) {
                C804280Vgo.LIZ(EnumC805430Vif.FOLLOW);
            } else if (Intrinsics.LJFF(str, "my_profile")) {
                C804280Vgo.LIZ(EnumC805430Vif.PROFILE_HOME);
            }
            EnumC818510W8z.Companion.getClass();
            EnumC818510W8z[] enumC818510W8zArrValues = EnumC818510W8z.values();
            int length = enumC818510W8zArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC818510W8z enumC818510W8z = enumC818510W8zArrValues[i];
                if (!Intrinsics.LJFF(enumC818510W8z.getType(), str)) {
                    i++;
                } else if (enumC818510W8z.isEnabled() && j > enumC818510W8z.threshold()) {
                    C804290Vgp.LIZ(new C804330Vgt(enumC818510W8z.getScene(), enumC818510W8z.getExceptionType(), null, 0L, 28));
                }
            }
        }
        if (C818490W8x.LIZ() && C790620Uzs.LIZ.getLogTypeSwitch("prf_page_load")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, str);
            jSONObject.put("load_time", j);
            jSONObject.put("load_result", String.valueOf(c0w93.getValue()));
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            C20684815ws.LJIJ("prf_page_load", jSONObject);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PageMonitorStatImpl@5717.report$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PageMonitorStatImpl@5717.report$1");
    }
}
