package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826130Wax {
    public final Map<String, C0WR6> LIZ = new LinkedHashMap();
    public final Map<String, EnumC826170Wb1> LIZIZ = new LinkedHashMap();

    public final JSONObject LIZLLL(EnumC826170Wb1 enumC826170Wb1) {
        JSONObject jSONObject = new JSONObject();
        Map<String, C0WR6> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((LinkedHashMap) this.LIZIZ).get(entry.getKey()) == enumC826170Wb1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object objLIZ = ((C0WR6) entry2.getValue()).LIZ();
            if (objLIZ != null) {
                jSONObject.put(str, objLIZ);
            }
        }
        return jSONObject;
    }

    public final void LIZJ(C826130Wax c826130Wax, Map<String, ? extends Function0<? extends C0WR6>> map, EnumC826170Wb1 enumC826170Wb1) {
        Map<String, C0WR6> map2;
        Object obj;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Function0 function0 = (Function0) entry.getValue();
            if (c826130Wax != null && (map2 = c826130Wax.LIZ) != null && (obj = ((LinkedHashMap) map2).get(key)) != null) {
                this.LIZ.put((String) key, (C0WR6) obj);
                Object obj2 = ((LinkedHashMap) c826130Wax.LIZIZ).get(key);
                if (obj2 != null) {
                    this.LIZIZ.put((String) key, (EnumC826170Wb1) obj2);
                }
            } else {
                this.LIZ.put((String) key, (C0WR6) function0.invoke());
                this.LIZIZ.put((String) key, enumC826170Wb1);
            }
        }
    }

    public final void LIZ(String str, EnumC823400WRu enumC823400WRu, Object obj, EnumC826170Wb1 enumC826170Wb1) {
        this.LIZ.put(str, new C0WQ8(enumC823400WRu, obj));
        this.LIZIZ.put(str, enumC826170Wb1);
    }
}
