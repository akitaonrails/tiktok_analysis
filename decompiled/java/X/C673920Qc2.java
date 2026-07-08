package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673920Qc2 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C673990Qc9 LIZ;

    public final JSONObject LIZ() throws JSONException {
        C673990Qc9 c673990Qc9 = this.LIZ;
        c673990Qc9.getClass();
        JSONObject jSONObject = new JSONObject();
        Long l = c673990Qc9.LJFF;
        if (l != null) {
            jSONObject.put("pitaya_start_time", l.longValue());
        }
        Long l2 = c673990Qc9.LJI;
        if (l2 != null) {
            jSONObject.put("pitaya_end_time", l2.longValue());
        }
        Long l3 = c673990Qc9.LJII;
        if (l3 != null) {
            jSONObject.put("request_time", l3.longValue());
        }
        Long l4 = c673990Qc9.LJIIIIZZ;
        if (l4 != null) {
            jSONObject.put("response_time", l4.longValue());
        }
        Boolean bool = c673990Qc9.LJIIIZ;
        if (bool != null) {
            jSONObject.put("success", bool.booleanValue() ? 1 : 0);
        }
        return jSONObject;
    }

    public final void LIZJ() {
        C673990Qc9 c673990Qc9 = this.LIZ;
        c673990Qc9.getClass();
        JSONObject jSONObject = new JSONObject();
        Long l = c673990Qc9.LJFF;
        if (l != null) {
            jSONObject.put("pitaya_start_time", l.longValue());
        }
        Long l2 = c673990Qc9.LJI;
        if (l2 != null) {
            jSONObject.put("pitaya_end_time", l2.longValue());
        }
        Long l3 = c673990Qc9.LJII;
        if (l3 != null) {
            jSONObject.put("request_time", l3.longValue());
        }
        Long l4 = c673990Qc9.LJIIIIZZ;
        if (l4 != null) {
            jSONObject.put("response_time", l4.longValue());
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("timing", strJ3);
        Integer num = c673990Qc9.LIZ;
        if (num != null) {
            linkedHashMap.put("session_seq", Integer.valueOf(num.intValue()));
        }
        EnumC673980Qc8 enumC673980Qc8 = c673990Qc9.LIZIZ;
        if (enumC673980Qc8 != null) {
            linkedHashMap.put(Scene.SCENE_SERVICE, enumC673980Qc8.getValue());
        }
        Integer num2 = c673990Qc9.LIZJ;
        if (num2 != null) {
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(num2.intValue()));
        }
        EnumC673970Qc7 enumC673970Qc7 = c673990Qc9.LIZLLL;
        if (enumC673970Qc7 != null) {
            linkedHashMap.put("current_page", enumC673970Qc7.getValue());
        }
        EnumC673930Qc3 enumC673930Qc3 = c673990Qc9.LJ;
        if (enumC673930Qc3 != null) {
            linkedHashMap.put("current_state", enumC673930Qc3.getValue());
        }
        Boolean bool = c673990Qc9.LJIIIZ;
        if (bool != null) {
            linkedHashMap.put("success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        Integer num3 = c673990Qc9.LJIIJ;
        if (num3 != null) {
            linkedHashMap.put("count", Integer.valueOf(num3.intValue()));
        }
        String str = c673990Qc9.LJIIJJI;
        if (str != null) {
            linkedHashMap.put("extra", str);
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C596480NaQ(linkedHashMap, null), 2);
    }

    public final void LIZLLL() {
        this.LIZ.LJII = Long.valueOf(System.currentTimeMillis());
        this.LIZ.LJ = EnumC673930Qc3.REQUEST_TIME;
    }

    public C673920Qc2(C673990Qc9 c673990Qc9) {
        this.LIZ = c673990Qc9;
    }

    public final void LIZIZ(int i, boolean z) {
        this.LIZ.LJIIIIZZ = Long.valueOf(System.currentTimeMillis());
        C673990Qc9 c673990Qc9 = this.LIZ;
        c673990Qc9.LJ = EnumC673930Qc3.RESPONSE_TIME;
        c673990Qc9.LJIIIZ = Boolean.valueOf(z);
        this.LIZ.LJIIJ = Integer.valueOf(i);
    }
}
