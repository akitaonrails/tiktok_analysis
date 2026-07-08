package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520600KbK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Object obj) {
        if (!(obj instanceof Map) && !(obj instanceof List)) {
            return obj.toString();
        }
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj);
    }

    public static JSONObject LIZIZ(C1500830p9t c1500830p9t) {
        try {
            return new JSONObject(new String(c1500830p9t.LJ, Charsets.UTF_8));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static List LIZJ(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C520610KbL((String) entry.getKey(), LIZ(entry.getValue())));
        }
        return arrayList;
    }
}
