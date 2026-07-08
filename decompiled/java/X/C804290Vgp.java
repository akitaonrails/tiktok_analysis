package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804290Vgp {
    public static final C804290Vgp LIZ = new C804290Vgp();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C804160Vgc());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C804200Vgg());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C804340Vgu());

    public static final void LIZ(C804330Vgt c804330Vgt) {
        String str;
        String str2;
        if (((List) C1DS1.LJJIJIIJI.getValue()).contains(Integer.valueOf(c804330Vgt.LIZIZ.getValue()))) {
            return;
        }
        if (((Boolean) C282280B4o.LIZ.getValue()).booleanValue() && ((str = c804330Vgt.LIZJ) == null || str.length() == 0)) {
            try {
                Class<?> cls = Class.forName("com.bytedance.applog.engine.Session");
                Field declaredField = cls.getDeclaredField("coldLaunchId");
                declaredField.setAccessible(true);
                AtomicInteger atomicInteger = null;
                Object obj = declaredField.get(null);
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                Field declaredField2 = cls.getDeclaredField("sessionIndex");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(null);
                if (obj2 instanceof AtomicInteger) {
                    atomicInteger = (AtomicInteger) obj2;
                }
                if (str2 != null && atomicInteger != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append('#');
                    sbLIZ.append(atomicInteger.get());
                    c804330Vgt.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = c804330Vgt.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("session_id", str3);
        if (((Boolean) C1DS1.LJJII.getValue()).booleanValue()) {
            LIZ.getClass();
            jSONObject.put("launch_id", LIZLLL.getValue());
        }
        jSONObject.put(Scene.SCENE_SERVICE, c804330Vgt.LIZ.getValue());
        jSONObject.put("exception_type", c804330Vgt.LIZIZ.getValue());
        jSONObject.put("exception_timestamp", c804330Vgt.LIZLLL);
        jSONObject.put("sample", c804330Vgt.LJ.getValue());
        LIZ.getClass();
        if (((List) LIZIZ.getValue()).contains(c804330Vgt.LIZIZ)) {
            jSONObject.put("level", EnumC804300Vgq.ONE.getValue());
        } else if (((List) LIZJ.getValue()).contains(c804330Vgt.LIZIZ)) {
            jSONObject.put("level", EnumC804300Vgq.NONE.getValue());
        } else {
            jSONObject.put("level", EnumC804300Vgq.TWO.getValue());
        }
        AppLogNewUtils.onEventV3("perf_bsr_events", jSONObject);
    }

    public static final void LIZIZ(int i, int i2, String str) throws JSONException {
        C804330Vgt c804330Vgt = new C804330Vgt(EnumC805430Vif.PSP, EnumC804170Vgd.ENTER, null, 0L, 28);
        JSONObject jSONObject = new JSONObject();
        String str2 = c804330Vgt.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("session_id", str2);
        if (((Boolean) C1DS1.LJJII.getValue()).booleanValue()) {
            LIZ.getClass();
            jSONObject.put("launch_id", LIZLLL.getValue());
        }
        jSONObject.put(Scene.SCENE_SERVICE, str);
        jSONObject.put("exception_type", i);
        jSONObject.put("exception_timestamp", c804330Vgt.LIZLLL);
        jSONObject.put("sample", c804330Vgt.LJ.getValue());
        jSONObject.put("level", i2);
        AppLogNewUtils.onEventV3("perf_bsr_events", jSONObject);
    }
}
